package com.github.lusingander.github.search.option

class Forks(private val query: ValueQuery) : Option() {

    override fun toString(): String {
        val b = StringBuilder()
        b.append("forks:")
        b.append(query)
        return b.toString()
    }
}
