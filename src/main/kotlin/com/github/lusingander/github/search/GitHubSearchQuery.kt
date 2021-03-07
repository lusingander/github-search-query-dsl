package com.github.lusingander.github.search

import com.github.lusingander.github.search.option.Created
import com.github.lusingander.github.search.option.Followers
import com.github.lusingander.github.search.option.Forks
import com.github.lusingander.github.search.option.License
import com.github.lusingander.github.search.option.Licenses
import com.github.lusingander.github.search.option.Option
import com.github.lusingander.github.search.option.Organization
import com.github.lusingander.github.search.option.Pushed
import com.github.lusingander.github.search.option.Range
import com.github.lusingander.github.search.option.Size
import com.github.lusingander.github.search.option.Stars
import com.github.lusingander.github.search.option.Topic
import com.github.lusingander.github.search.option.Topics
import com.github.lusingander.github.search.option.User
import com.github.lusingander.github.search.option.ValueQuery
import com.github.lusingander.github.search.option.Word

fun query(init: GitHubSearchQuery.() -> Unit) = GitHubSearchQuery().apply(init)

class GitHubSearchQuery : Option() {

    fun word(word: String) = doInit(word, ::Word)
    fun user(name: String) = doInit(name, ::User)
    fun org(name: String) = doInit(name, ::Organization)
    fun size(query: ValueQuery) = doInit(query, ::Size)
    fun size(range: IntRange) = doInit(range, ::Size)
    fun followers(query: ValueQuery) = doInit(query, ::Followers)
    fun followers(range: IntRange) = doInit(range, ::Followers)
    fun forks(query: ValueQuery) = doInit(query, ::Forks)
    fun forks(range: IntRange) = doInit(range, ::Forks)
    fun stars(query: ValueQuery) = doInit(query, ::Stars)
    fun stars(range: IntRange) = doInit(range, ::Stars)
    fun created(query: ValueQuery) = doInit(query, ::Created)
    fun pushed(query: ValueQuery) = doInit(query, ::Pushed)
    fun topic(name: String) = doInit(name, ::Topic)
    fun topics(query: ValueQuery) = doInit(query, ::Topics)
    fun topics(range: IntRange) = doInit(range, ::Topics)
    fun license(license: Licenses) = doInit(license, ::License)

    private fun <T : Option, U> doInit(v: U, f: (U) -> T): T = f(v).also { doInit(it) }
    private fun <T : Option> doInit(r: IntRange, f: (Range) -> T): T = doInit(Range(r.first, r.last), f)
}
