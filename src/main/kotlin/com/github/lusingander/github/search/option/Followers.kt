package com.github.lusingander.github.search.option

class Followers(private val query: ValueQuery) : Option() {

    override fun toString(): String {
        val b = StringBuilder()
        b.append("followers:")
        b.append(query)
        return b.toString()
    }
}
