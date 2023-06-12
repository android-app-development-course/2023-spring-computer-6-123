package com.example.teamup.dataClass

import com.example.teamup.dataClass.TeamInfo

data class User(
    var objectId:String,
    var userName:String,
    var account:String,
    var password:String,
    var university:String,
    var major:String,
    var gender:String,
    var resume:String,
    var joinTeam:Array<TeamInfo>,
    var leadTeam:Array<TeamInfo>

)