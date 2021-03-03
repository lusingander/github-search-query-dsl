package com.github.lusingander.github.search

import com.github.lusingander.github.search.option.Option
import com.github.lusingander.github.search.option.Organization
import com.github.lusingander.github.search.option.User
import com.github.lusingander.github.search.option.Word

fun query(init: GitHubSearchQuery.() -> Unit) = GitHubSearchQuery().apply(init)

class GitHubSearchQuery : Option() {

    fun word(word: String) = Word(word).also { doInit(it) }
    fun user(name: String) = User(name).also { doInit(it) }
    fun org(name: String) = Organization(name).also { doInit(it) }
}
