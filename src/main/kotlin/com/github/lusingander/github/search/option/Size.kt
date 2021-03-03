package com.github.lusingander.github.search.option

class Size(private val query: ValueQuery) : Option() {

    override fun toString(): String {
        val b = StringBuilder()
        b.append("size:")
        b.append(query)
        return b.toString()
    }
}
