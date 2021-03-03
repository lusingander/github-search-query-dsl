package com.github.lusingander.github.search.option

class Organization(private val name: String) : Option() {

    override fun toString(): String {
        val b = StringBuilder()
        b.append("org:")
        b.append(name)
        return b.toString()
    }
}
