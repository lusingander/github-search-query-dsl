package com.github.lusingander.github.search.option

class Stars(private val query: ValueQuery) : Option() {

    override fun toString(): String {
        val b = StringBuilder()
        b.append("stars:")
        b.append(query)
        return b.toString()
    }
}
