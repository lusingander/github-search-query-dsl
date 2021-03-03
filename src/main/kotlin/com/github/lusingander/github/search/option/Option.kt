package com.github.lusingander.github.search.option

@GitHubSearchQueryDslMarker
open class Option {

    private val children = mutableListOf<Option>()

    fun <T : Option> doInit(child: T, init: T.() -> Unit = {}) {
        child.init()
        children.add(child)
    }

    override fun toString() = children.joinToString(" ")
}
