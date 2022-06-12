package com.example.navigationumscacheandviewbinding.CLASS

import java.io.Serializable

class UMS : Serializable {

    var titleData: String? = null
    var code: String? = null
    var shortData: String? = null
    var longData: String? = null


    constructor(titleData: String?, code: String?, shortData: String?, longData: String?) {
        this.titleData = titleData
        this.code = code
        this.shortData = shortData
        this.longData = longData
    }

    constructor()
}