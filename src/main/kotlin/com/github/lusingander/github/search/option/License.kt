package com.github.lusingander.github.search.option

class License(license: Licenses) : SimpleOption(license.keyword) {
    override val tag: String = "license"
}
