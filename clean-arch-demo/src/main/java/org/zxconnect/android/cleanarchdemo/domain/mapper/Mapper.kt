package org.zxconnect.android.cleanarchdemo.domain.mapper

interface Mapper<in T, R> {
    fun map(t: T): R
}