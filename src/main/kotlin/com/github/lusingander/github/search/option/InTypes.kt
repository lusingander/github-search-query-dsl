package com.github.lusingander.github.search.option

class InTypes {

    private val vs = mutableListOf<InType>()

    fun add(vararg types: InType) = vs.addAll(types)

    override fun toString() = if (vs.isEmpty()) "" else " in:" + vs.joinToString(",") { it.label }
}
