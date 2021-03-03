package com.github.lusingander.github.search

@DslMarker
private annotation class GitHubSearchQueryDslMarker

fun query(init: GitHubSearchQuery.() -> Unit) = GitHubSearchQuery().apply(init)

class GitHubSearchQuery : Option() {

    fun word(s: String) = Word(s).also { doInit(it) }
}

@GitHubSearchQueryDslMarker
open class Option {

    private val children = mutableListOf<Option>()

    fun <T : Option> doInit(child: T, init: T.() -> Unit = {}) {
        child.init()
        children.add(child)
    }

    override fun toString() = children.joinToString(" ")
}

class Word(private val s: String) : Option() {
    override fun toString() = s
}
