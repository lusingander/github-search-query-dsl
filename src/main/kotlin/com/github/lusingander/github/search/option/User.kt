package com.github.lusingander.github.search.option

class User(private val name: String) : Option() {

    override fun toString(): String {
        val b = StringBuilder()
        b.append("user:")
        b.append(name)
        return b.toString()
    }
}
