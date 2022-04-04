package com.janaina.a21944janaina_app_ca3.models

data class GitKind(

    var title: String,

    var body: String,

    var image: String,

    var name: String,

    var username: String // Author of blog post


) {

    override fun toString(): String {
        return "GitKind(title='$title', image='$image', username='$username')"
    }


}
























