/*
 * Copyright 2010-2017 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

#include <cstdint>
#include "KAssert.h"

#ifndef RUNTIME_UTILS_H
#define RUNTIME_UTILS_H

class SimpleMutex {
 private:
  int32_t atomicInt = 0;

 public:
  void lock() {
    while (!__sync_bool_compare_and_swap(&atomicInt, 0, 1)) {
      // TODO: yield.
    }
  }

  void unlock() {
    if (!__sync_bool_compare_and_swap(&atomicInt, 1, 0)) {
      RuntimeAssert(false, "Unable to unlock");
    }
  }
};

// TODO: use std::lock_guard instead?
template <class Mutex>
class LockGuard {
 public:
  explicit LockGuard(Mutex& mutex_) : mutex(mutex_) {
    mutex.lock();
  }

  ~LockGuard() {
    mutex.unlock();
  }

 private:
  Mutex& mutex;

  LockGuard(const LockGuard&) = delete;
  LockGuard& operator=(const LockGuard&) = delete;
};

// A helper for implementing classes with disabled copy constructor and copy assignment.
// Usage:
// class A: private NoCopy {
//     ...
// };
// Prefer private inheritance to discourage casting instances of `A` to instances
// of `NoCopy`.
class NoCopy {
public:
    NoCopy(const NoCopy&) = delete;
    NoCopy& operator=(const NoCopy&) = delete;

protected:
    // Hide constructors and assignments so that nobody creates an instance of NoCopy on its own.
    NoCopy() = default;
    NoCopy(NoCopy&&) = default;
    NoCopy& operator=(NoCopy&&) = default;

    // Hide destructor because it's non-virtual:
    // leaving it public would allow to destruct via `NoCopy`,
    // which would require a virtual destructor to operate correctly
    ~NoCopy() = default;
};

// A helper for implementing classes with disabled copy and move constructors, and copy and move assignments.
// Usage:
// class A: private NoCopyOrMove {
//     ...
// };
// Prefer private inheritance to discourage casting instances of `A` to instances
// of `NoCopyOrMove`.
class NoCopyOrMove {
public:
    NoCopyOrMove(const NoCopyOrMove&) = delete;
    NoCopyOrMove(NoCopyOrMove&&) = delete;
    NoCopyOrMove& operator=(const NoCopyOrMove&) = delete;
    NoCopyOrMove& operator=(NoCopyOrMove&&) = delete;

protected:
    // Hide default constructor so that nobody creates an instance of NoCopyOrMove on its own.
    NoCopyOrMove() = default;

    // Hide destructor because it's non-virtual:
    // leaving it public would allow to destruct via `NoCopyOrMove`,
    // which would require a virtual destructor to operate correctly
    ~NoCopyOrMove() = default;
};

#endif // RUNTIME_UTILS_H
