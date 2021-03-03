package com.github.lusingander.github.search

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class GitHubSearchQueryTest : StringSpec({

    "word" {
        val q = query {
            word("foo")
        }
        q.toString() shouldBe "foo"
    }
})
