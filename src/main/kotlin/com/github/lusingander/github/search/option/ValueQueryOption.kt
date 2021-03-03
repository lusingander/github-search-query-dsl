package com.github.lusingander.github.search.option

abstract class ValueQueryOption(private val query: ValueQuery) : Option() {
    protected abstract val tag: String
    override fun toString() = "$tag:$query"
}
