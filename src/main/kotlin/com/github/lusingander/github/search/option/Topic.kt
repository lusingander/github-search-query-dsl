package com.github.lusingander.github.search.option

class Topic(private val name: String) : Option() {

    override fun toString(): String {
        val b = StringBuilder()
        b.append("topic:")
        b.append(name)
        return b.toString()
    }
}
