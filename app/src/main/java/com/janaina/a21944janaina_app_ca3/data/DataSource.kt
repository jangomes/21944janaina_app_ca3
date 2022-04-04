package com.janaina.a21944janaina_app_ca3.data

import com.janaina.a21944janaina_app_ca3.R
import com.janaina.a21944janaina_app_ca3.models.GithubCA3

class Datasource {
    fun loadGithubCA3(): List<GithubCA3> {
        return listOf<GithubCA3>(
            GithubCA3(R.string.name0, R.drawable.portrait_3353699_960_720, R.string.userName0, R.string.desc0),
            GithubCA3(R.string.name1, R.drawable.portrait_g84b0d149e_1920, R.string.userName1, R.string.desc1),
            GithubCA3(R.string.name2, R.drawable.male_2634974_960_720, R.string.userName2, R.string.desc2),
            GithubCA3(R.string.name3, R.drawable.woman_3169726_960_720, R.string.userName3, R.string.desc3)
        )
    }
}