package com.github.lusingander.github.search.option

abstract class SimpleOption(private val value: String) : Option() {
    protected abstract val tag: String
    override fun toString() = "$tag:$value"
}
