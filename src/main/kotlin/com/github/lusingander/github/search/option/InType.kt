package com.github.lusingander.github.search.option

sealed class InType(val label: String)

object Name : InType("name")
object Description : InType("description")
object Readme : InType("readme")
