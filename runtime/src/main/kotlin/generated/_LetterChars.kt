/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package kotlin.text

//
// NOTE: THIS FILE IS AUTO-GENERATED by the GenerateUnicodeData.kt
// See: https://github.com/JetBrains/kotlin/tree/master/libraries/stdlib
//

private val rangeStart = intArrayOf(
    0x0041, 0x00aa, 0x00ca, 0x00f8, 0x02c6, 0x02ec, 0x0370, 0x0390, 0x03f7, 0x048a, 0x0531, 0x0560, 0x05ef, 0x066e, 0x06d5, 0x06fa, 0x071a, 0x07b1, 0x07f4, 0x0814, 
    0x0840, 0x08a0, 0x0904, 0x0950, 0x0971, 0x0993, 0x09b6, 0x09dc, 0x09fc, 0x0a1c, 0x0a59, 0x0a85, 0x0aa5, 0x0ad0, 0x0af9, 0x0b19, 0x0b39, 0x0b5c, 0x0b83, 0x0ba3, 
    0x0bd0, 0x0c0e, 0x0c2e, 0x0c58, 0x0c80, 0x0ca0, 0x0cde, 0x0d04, 0x0d24, 0x0d4e, 0x0d7a, 0x0d9a, 0x0dbd, 0x0e01, 0x0e40, 0x0e84, 0x0ea5, 0x0ec6, 0x0f00, 0x0f49, 
    0x1000, 0x1050, 0x1070, 0x10a0, 0x10cd, 0x10fc, 0x124a, 0x126a, 0x1290, 0x12b8, 0x12d8, 0x1318, 0x13a0, 0x1401, 0x166f, 0x16a0, 0x1700, 0x1720, 0x1760, 0x1780, 
    0x17dc, 0x1880, 0x18aa, 0x1900, 0x1970, 0x19b0, 0x1a20, 0x1b05, 0x1b83, 0x1bba, 0x1c4d, 0x1c80, 0x1cbd, 0x1cee, 0x1d0e, 0x1e00, 0x1f18, 0x1f48, 0x1f68, 0x1fb6, 
    0x1fd6, 0x1ff6, 0x207f, 0x2102, 0x2124, 0x2145, 0x2183, 0x2c00, 0x2c60, 0x2ceb, 0x2d0b, 0x2d2d, 0x2d6f, 0x2da0, 0x2dc0, 0x2e2f, 0x3005, 0x303b, 0x309d, 0x30fc, 
    0x3131, 0x31f0, 0x3400, 0x4e00, 0xa000, 0xa4d0, 0xa610, 0xa640, 0xa6a0, 0xa722, 0xa7c2, 0xa803, 0xa840, 0xa8f2, 0xa912, 0xa960, 0xa9cf, 0xa9ef, 0xaa0f, 0xaa44, 
    0xaa7a, 0xaab1, 0xaadb, 0xab01, 0xab21, 0xab41, 0xab70, 0xac00, 0xd7b0, 0xf900, 0xfa70, 0xfb13, 0xfb33, 0xfb53, 0xfd50, 0xfdf0, 0xfe76, 0xff21, 0xff66, 0xffca, 
)

private val rangeEnd = intArrayOf(
    0x1a06007a, -0x1f7c00, 0xd0100f6, 0x02c1, 0xc0e02e4, 0x10102ee, -0x145fa191, 0x120103f5, 0x0481, 0x052f, 0x26020559, 0x294705ea, 0x42d064a, 0x20106d3, -0x7cfe8000, -0x5fffed, 0x161d07a5, 0x11807ea, -0x07df, -0x7ff77fdf, 
    0x1907086a, 0x150108c7, 0x3603093d, 0x1070961, -0x18078001, -0x20200001, -0x7f7fffb9, -0x7fe7ffe3, -0x33c100, -0x64901001, -0x78ffffe9, -0x1101, -0x7f704809, 0x10f0ae1, -0x1980800, -0x4808001, 0x1030b3d, -0x7fefffe3, -0x729c2382, -0x7fc0038f, 
    0x1340c0c, -0x4000005, 0xc030c3d, 0x3050c61, -0x11010, -0x6e080101, -0x7ff3fffa, -0x1101, 0x17020d3d, -0x7ff8ff20, 0x6050d96, 0x18010dbb, 0x1020dc6, 0x30010e33, 0x73a0e82, -0x0042, -0x37fc802, 0x1150edf, 0x13f0f47, 0x241b0f8c, 
    0x2b14103f, -0x1fcee1e1, -0x5ffe0010, 0x260110c7, 0x10210fa, 0x1248, -0x185019, 0x1f01128d, 0x210112b5, -0x40006141, 0x39011315, 0x4325138f, 0x560213fd, 0x166c, 0x1101169a, 0x4b0616f8, 0xd011711, 0x120e1751, 0xd011770, 0x342317d7, 
    0x1431878, 0x50218a8, 0x10518f5, 0x1f31196d, 0x50b19ab, 0x1a361a16, 0x35521aa7, 0x2f111b4b, 0x1e0d1baf, 0x2c1a1c23, 0x30a1c7d, 0x9071cba, 0x3291cec, -0x1f721, 0x1dbf, 0x1f15, 0x6021f45, -0x2a8061, 0x16021fb4, -0x61c04741, 
    -0x47c001e1, 0x7742071, 0x110209c, -0x783a0070, -0x78600216, 0x504214e, 0x2184, 0x2f012c5e, 0x2ce4, -0xfff39, 0x1b012d27, 0x1022d67, 0x1102d96, -0x40404041, -0x40404041, 0x2e2f, 0x22a3035, 0x2043096, 0x30130fa, 0x405312f, 
    0x5e1131bf, 0x31ff, 0x4dbf, 0x9ffc, 0xa48c, 0x2e02a60c, 0x100aa62b, 0x2f10a69d, 0x4631a71f, 0x6702a7bf, 0x92aa801, -0x0085, 0x340ea8b3, -0x7ff2e1, 0x140aa946, 0x1d07a9b2, -0x210000, -0x8400, 0x1a17aa42, 0x814aa76, 
    0x103aaaf, -0x7ffeb068, -0x7e3f800d, -0x3fe06061, -0x2021, 0x1a01ab69, 0xabe2, 0xd7a3, 0x1704d7fb, 0xfa6d, 0x6a26fb06, -0x2005f1, -0x24a09, 0x5f21fd3d, 0x4002fdc7, 0xc74fe74, 0xfefc, 0x1a06ff5a, 0x5903ffc7, -0x7ffc6061, 
)

/**
 * Returns `true` if this character is a letter.
 */
internal fun Char.isLetterImpl(): Boolean {
    val ch = this.toInt()
    val index = binarySearchRange(LetterRangesWrapper.rangeStart, ch)

    val rangeStart = LetterRangesWrapper.rangeStart[index]
    val rangeEnd = LetterRangesWrapper.rangeEnd[index]

    val isGapPattern = rangeEnd > 0xffff
    if (isGapPattern) {
        if (ch > rangeEnd and 0xffff) {
            return false
        }
        val charsBeforeGap = rangeEnd shr 24
        val gapLength = (rangeEnd shr 16) and 0xff
        val chDistance = ch - rangeStart
        return chDistance < charsBeforeGap || chDistance >= charsBeforeGap + gapLength
    }

    val isBitPattern = rangeEnd < 0
    if (isBitPattern) {
        if (ch > rangeStart + 31) {
            return false
        }
        val shift = ch - rangeStart - 1
        return (ch == rangeStart) || rangeEnd and (1 shl shift) > 0
    }

    return ch <= rangeEnd
}