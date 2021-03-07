package com.github.lusingander.github.search.option

import java.time.LocalDate
import java.time.format.DateTimeFormatter

private val FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd")

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
    private val fv = value.format(FORMATTER)
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
    private val fv1 = v1.format(FORMATTER)
    private val fv2 = v2.format(FORMATTER)
    override fun toString(query: String): String = "$fv1$query$fv2"
}

class EQ : ValueQuery {
    constructor(value: Int) : super(IntValueQueryParam(value))
    constructor(value: LocalDate) : super(LocalDateValueQueryParam(value))

    override val query = ""
}

class LT : ValueQuery {
    constructor(value: Int) : super(IntValueQueryParam(value))
    constructor(value: LocalDate) : super(LocalDateValueQueryParam(value))

    override val query = "<"
}

class GT : ValueQuery {
    constructor(value: Int) : super(IntValueQueryParam(value))
    constructor(value: LocalDate) : super(LocalDateValueQueryParam(value))

    override val query = ">"
}

class LE : ValueQuery {
    constructor(value: Int) : super(IntValueQueryParam(value))
    constructor(value: LocalDate) : super(LocalDateValueQueryParam(value))

    override val query = "<="
}

class GE : ValueQuery {
    constructor(value: Int) : super(IntValueQueryParam(value))
    constructor(value: LocalDate) : super(LocalDateValueQueryParam(value))

    override val query = ">="
}

class Range : ValueQuery {
    constructor(min: Int, max: Int) : super(DoubleIntValueQueryParam(min, max))
    constructor(min: LocalDate, max: LocalDate) : super(DoubleLocalDateValueQueryParam(min, max))

    override val query = ".."
}
