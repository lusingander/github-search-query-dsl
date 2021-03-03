package com.github.lusingander.github.search

import com.github.lusingander.github.search.option.InType
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class GitHubSearchQueryTest : StringSpec({

    "word" {
        val q = query {
            word("foo")
        }
        q.toString() shouldBe "foo"
    }

    "word with one 'in' qualifier" {
        val q = query {
            word("foo").`in`(InType.NAME)
        }
        q.toString() shouldBe "foo in:name"
    }

    "word with multiple 'in' qualifiers" {
        val q = query {
            word("foo").`in`(InType.NAME, InType.DESCRIPTION)
        }
        q.toString() shouldBe "foo in:name,description"
    }

    "user" {
        val q = query {
            word("foo")
            user("bar")
        }
        q.toString() shouldBe "foo user:bar"
    }

    "organization" {
        val q = query {
            word("foo")
            org("bar")
        }
        q.toString() shouldBe "foo org:bar"
    }
})
