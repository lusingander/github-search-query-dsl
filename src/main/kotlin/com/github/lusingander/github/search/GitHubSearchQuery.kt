package com.github.lusingander.github.search

import com.github.lusingander.github.search.option.Followers
import com.github.lusingander.github.search.option.Forks
import com.github.lusingander.github.search.option.Option
import com.github.lusingander.github.search.option.Organization
import com.github.lusingander.github.search.option.Range
import com.github.lusingander.github.search.option.Size
import com.github.lusingander.github.search.option.Stars
import com.github.lusingander.github.search.option.User
import com.github.lusingander.github.search.option.ValueQuery
import com.github.lusingander.github.search.option.Word

fun query(init: GitHubSearchQuery.() -> Unit) = GitHubSearchQuery().apply(init)

class GitHubSearchQuery : Option() {

    fun word(word: String) = Word(word).also { doInit(it) }
    fun user(name: String) = User(name).also { doInit(it) }
    fun org(name: String) = Organization(name).also { doInit(it) }
    fun size(query: ValueQuery) = Size(query).also { doInit(it) }
    fun size(range: IntRange) = Size(Range(range.first, range.last)).also { doInit(it) }
    fun followers(query: ValueQuery) = Followers(query).also { doInit(it) }
    fun followers(range: IntRange) = Followers(Range(range.first, range.last)).also { doInit(it) }
    fun forks(query: ValueQuery) = Forks(query).also { doInit(it) }
    fun forks(range: IntRange) = Forks(Range(range.first, range.last)).also { doInit(it) }
    fun stars(query: ValueQuery) = Stars(query).also { doInit(it) }
    fun stars(range: IntRange) = Stars(Range(range.first, range.last)).also { doInit(it) }
}
