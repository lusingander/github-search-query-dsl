package com.github.lusingander.github.search.option

import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter

private val LOCAL_DATE_FORMATTER = DateTimeFormatter.ISO_LOCAL_DATE
private val OFFSET_DATETIME_FORMATTER = DateTimeFormatter.ISO_OFFSET_DATE_TIME

sealed class ValueQuery(private val value: ValueQueryParam) {
    abstract val query: String
    override fun toString() = value.toString(query)
}

private interface ValueQueryParam {
    fun toString(query: String): String
}

private data class IntValueQueryParam(private val value: Int) : ValueQueryParam {
    override fun toString(query: String): String = "$query$value"
}

private data class LocalDateValueQueryParam(private val value: LocalDate) : ValueQueryParam {
    private val fv = value.format(LOCAL_DATE_FORMATTER)
    override fun toString(query: String): String = "$query$fv"
}

private data class OffsetDateTimeValueQueryParam(private val value: OffsetDateTime) : ValueQueryParam {
    private val fv = value.format(OFFSET_DATETIME_FORMATTER)
    override fun toString(query: String): String = "$query$fv"
}

private data class DoubleIntValueQueryParam(
    private val v1: Int,
    private val v2: Int
) : ValueQueryParam {
    override fun toString(query: String): String = "$v1$query$v2"
}

private data class DoubleLocalDateValueQueryParam(
    private val v1: LocalDate,
    private val v2: LocalDate
) : ValueQueryParam {
    private val fv1 = v1.format(LOCAL_DATE_FORMATTER)
    private val fv2 = v2.format(LOCAL_DATE_FORMATTER)
    override fun toString(query: String): String = "$fv1$query$fv2"
}

private data class DoubleOffsetDateTimeValueQueryParam(
    private val v1: OffsetDateTime,
    private val v2: OffsetDateTime
) : ValueQueryParam {
    private val fv1 = v1.format(OFFSET_DATETIME_FORMATTER)
    private val fv2 = v2.format(OFFSET_DATETIME_FORMATTER)
    override fun toString(query: String): String = "$fv1$query$fv2"
}

class EQ : ValueQuery {
    constructor(value: Int) : super(IntValueQueryParam(value))
    constructor(value: LocalDate) : super(LocalDateValueQueryParam(value))
    constructor(value: OffsetDateTime) : super(OffsetDateTimeValueQueryParam(value))

    override val query = ""
}

class LT : ValueQuery {
    constructor(value: Int) : super(IntValueQueryParam(value))
    constructor(value: LocalDate) : super(LocalDateValueQueryParam(value))
    constructor(value: OffsetDateTime) : super(OffsetDateTimeValueQueryParam(value))

    override val query = "<"
}

class GT : ValueQuery {
    constructor(value: Int) : super(IntValueQueryParam(value))
    constructor(value: LocalDate) : super(LocalDateValueQueryParam(value))
    constructor(value: OffsetDateTime) : super(OffsetDateTimeValueQueryParam(value))

    override val query = ">"
}

class LE : ValueQuery {
    constructor(value: Int) : super(IntValueQueryParam(value))
    constructor(value: LocalDate) : super(LocalDateValueQueryParam(value))
    constructor(value: OffsetDateTime) : super(OffsetDateTimeValueQueryParam(value))

    override val query = "<="
}

class GE : ValueQuery {
    constructor(value: Int) : super(IntValueQueryParam(value))
    constructor(value: LocalDate) : super(LocalDateValueQueryParam(value))
    constructor(value: OffsetDateTime) : super(OffsetDateTimeValueQueryParam(value))

    override val query = ">="
}

class Range : ValueQuery {
    constructor(min: Int, max: Int) : super(DoubleIntValueQueryParam(min, max))
    constructor(min: LocalDate, max: LocalDate) : super(DoubleLocalDateValueQueryParam(min, max))
    constructor(min: OffsetDateTime, max: OffsetDateTime) : super(DoubleOffsetDateTimeValueQueryParam(min, max))

    override val query = ".."
}
