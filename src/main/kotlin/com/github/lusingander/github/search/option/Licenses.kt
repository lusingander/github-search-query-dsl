package com.github.lusingander.github.search.option

// https://docs.github.com/en/github/creating-cloning-and-archiving-repositories/licensing-a-repository#searching-github-by-license-type
enum class Licenses(private val licenseName: String, val keyword: String) {

    ACADEMIC_FREE_LICENSE_V3_0(
        "Academic Free License v3.0",
        "afl-3.0"
    ),

    APACHE_LICENSE_2_0(
        "Apache license 2.0",
        "apache-2.0"
    ),

    ARTISTIC_LICENSE_2_0(
        "Artistic license 2.0",
        "artistic-2.0"
    ),

    BOOST_SOFTWARE_LICENSE_1_0(
        "Boost Software License 1.0",
        "bsl-1.0"
    ),

    BSD_2_CLAUSE_SIMPLIFIED_LICENSE(
        "BSD 2-clause \"Simplified\" license",
        "bsd-2-clause"
    ),

    BSD_3_CLAUSE_NEW_OR_REVISED_LICENSE(
        "BSD 3-clause \"New\" or \"Revised\" license",
        "bsd-3-clause"
    ),

    BSD_3_CLAUSE_CLEAR_LICENSE(
        "BSD 3-clause Clear license",
        "bsd-3-clause-clear"
    ),

    CREATIVE_COMMONS_LICENSE_FAMILY(
        "Creative Commons license family",
        "cc"
    ),

    CREATIVE_COMMONS_ZERO_V1_0_UNIVERSAL(
        "Creative Commons Zero v1.0 Universal",
        "cc0-1.0"
    ),

    CREATIVE_COMMONS_ATTRIBUTION_4_0(
        "Creative Commons Attribution 4.0",
        "cc-by-4.0"
    ),

    CREATIVE_COMMONS_ATTRIBUTION_SHARE_ALIKE_4_0(
        "Creative Commons Attribution Share Alike 4.0",
        "cc-by-sa-4.0"
    ),

    DO_WHAT_THE_F_CK_YOU_WANT_TO_PUBLIC_LICENSE(
        "Do What The F*ck You Want To Public License",
        "wtfpl"
    ),

    EDUCATIONAL_COMMUNITY_LICENSE_V2_0(
        "Educational Community License v2.0",
        "ecl-2.0"
    ),

    ECLIPSE_PUBLIC_LICENSE_1_0(
        "Eclipse Public License 1.0",
        "epl-1.0"
    ),

    ECLIPSE_PUBLIC_LICENSE_2_0(
        "Eclipse Public License 2.0",
        "epl-2.0"
    ),

    EUROPEAN_UNION_PUBLIC_LICENSE_1_1(
        "European Union Public License 1.1",
        "eupl-1.1"
    ),

    GNU_AFFERO_GENERAL_PUBLIC_LICENSE_V3_0(
        "GNU Affero General Public License v3.0",
        "agpl-3.0"
    ),

    GNU_GENERAL_PUBLIC_LICENSE_FAMILY(
        "GNU General Public License family",
        "gpl"
    ),

    GNU_GENERAL_PUBLIC_LICENSE_V2_0(
        "GNU General Public License v2.0",
        "gpl-2.0"
    ),

    GNU_GENERAL_PUBLIC_LICENSE_V3_0(
        "GNU General Public License v3.0",
        "gpl-3.0"
    ),

    GNU_LESSER_GENERAL_PUBLIC_LICENSE_FAMILY(
        "GNU Lesser General Public License family",
        "lgpl"
    ),

    GNU_LESSER_GENERAL_PUBLIC_LICENSE_V2_1(
        "GNU Lesser General Public License v2.1",
        "lgpl-2.1"
    ),

    GNU_LESSER_GENERAL_PUBLIC_LICENSE_V3_0(
        "GNU Lesser General Public License v3.0",
        "lgpl-3.0"
    ),

    ISC(
        "ISC",
        "isc"
    ),

    LATEX_PROJECT_PUBLIC_LICENSE_V1_3C(
        "LaTeX Project Public License v1.3c",
        "lppl-1.3c"
    ),

    MICROSOFT_PUBLIC_LICENSE(
        "Microsoft Public License",
        "ms-pl"
    ),

    MIT(
        "MIT",
        "mit"
    ),

    MOZILLA_PUBLIC_LICENSE_2_0(
        "Mozilla Public License 2.0",
        "mpl-2.0"
    ),

    OPEN_SOFTWARE_LICENSE_3_0(
        "Open Software License 3.0",
        "osl-3.0"
    ),

    POSTGRESQL_LICENSE(
        "PostgreSQL License",
        "postgresql"
    ),

    SIL_OPEN_FONT_LICENSE_1_1(
        "SIL Open Font License 1.1",
        "ofl-1.1"
    ),

    UNIVERSITY_OF_ILLINOIS_NCSA_OPEN_SOURCE_LICENSE(
        "University of Illinois/NCSA Open Source License",
        "ncsa"
    ),

    THE_UNLICENSE(
        "The Unlicense",
        "unlicense"
    ),

    ZLIB_LICENSE(
        "zLib License",
        "zlib"
    ),

    ;
}
