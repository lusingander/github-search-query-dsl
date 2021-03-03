package com.github.lusingander.github.search.option

sealed class ValueQuery

data class EQ(val value: Int) : ValueQuery() {
    override fun toString() = "$value"
}

data class LT(val value: Int) : ValueQuery() {
    override fun toString() = "<$value"
}

data class GT(val value: Int) : ValueQuery() {
    override fun toString() = ">$value"
}

data class LE(val value: Int) : ValueQuery() {
    override fun toString() = "<=$value"
}

data class GE(val value: Int) : ValueQuery() {
    override fun toString() = ">=$value"
}

data class Range(val min: Int, val max: Int) : ValueQuery() {
    override fun toString() = "$min..$max"
}
