package com.github.lusingander.github.search.option

class Word(private val word: String) : Option() {

    private val inTypes = InTypes()

    fun `in`(vararg types: InType): Word {
        this.inTypes.add(*types)
        return this
    }

    override fun toString(): String {
        val b = StringBuilder()
        b.append(word)
        b.append(inTypes)
        return b.toString()
    }
}
