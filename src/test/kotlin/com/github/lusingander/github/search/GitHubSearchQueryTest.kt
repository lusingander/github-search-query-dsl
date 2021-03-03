package com.github.lusingander.github.search

import com.github.lusingander.github.search.option.Description
import com.github.lusingander.github.search.option.EQ
import com.github.lusingander.github.search.option.GE
import com.github.lusingander.github.search.option.GT
import com.github.lusingander.github.search.option.LE
import com.github.lusingander.github.search.option.LT
import com.github.lusingander.github.search.option.Name
import com.github.lusingander.github.search.option.Range
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
            word("foo").`in`(Name)
        }
        q.toString() shouldBe "foo in:name"
    }

    "word with multiple 'in' qualifiers" {
        val q = query {
            word("foo").`in`(Name, Description)
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

    "size equal" {
        val q = query {
            word("foo")
            size(EQ(100))
        }
        q.toString() shouldBe "foo size:100"
    }

    "size less than" {
        val q = query {
            word("foo")
            size(LT(100))
        }
        q.toString() shouldBe "foo size:<100"
    }

    "size greater than" {
        val q = query {
            word("foo")
            size(GT(100))
        }
        q.toString() shouldBe "foo size:>100"
    }

    "size less than or equal to" {
        val q = query {
            word("foo")
            size(LE(100))
        }
        q.toString() shouldBe "foo size:<=100"
    }

    "size greater than or equal to" {
        val q = query {
            word("foo")
            size(GE(100))
        }
        q.toString() shouldBe "foo size:>=100"
    }

    "size range" {
        val q = query {
            word("foo")
            size(Range(100, 200))
        }
        q.toString() shouldBe "foo size:100..200"
    }

    "size range using Kotlin Range" {
        val q = query {
            word("foo")
            size(100..200)
        }
        q.toString() shouldBe "foo size:100..200"
    }

    "followers less than" {
        val q = query {
            word("foo")
            followers(LT(100))
        }
        q.toString() shouldBe "foo followers:<100"
    }

    "followers range" {
        val q = query {
            word("foo")
            followers(Range(100, 200))
        }
        q.toString() shouldBe "foo followers:100..200"
    }

    "followers range using Kotlin Range" {
        val q = query {
            word("foo")
            followers(100..200)
        }
        q.toString() shouldBe "foo followers:100..200"
    }

    "forks greater than" {
        val q = query {
            word("foo")
            forks(GT(100))
        }
        q.toString() shouldBe "foo forks:>100"
    }

    "forks range" {
        val q = query {
            word("foo")
            forks(Range(100, 200))
        }
        q.toString() shouldBe "foo forks:100..200"
    }

    "forks range using Kotlin Range" {
        val q = query {
            word("foo")
            forks(100..200)
        }
        q.toString() shouldBe "foo forks:100..200"
    }

    "stars less than or equal to" {
        val q = query {
            word("foo")
            stars(LE(100))
        }
        q.toString() shouldBe "foo stars:<=100"
    }

    "stars range" {
        val q = query {
            word("foo")
            stars(Range(100, 200))
        }
        q.toString() shouldBe "foo stars:100..200"
    }

    "stars range using Kotlin Range" {
        val q = query {
            word("foo")
            stars(100..200)
        }
        q.toString() shouldBe "foo stars:100..200"
    }
})
