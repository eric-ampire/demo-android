package com.ericampire.android.ktordemo.entity

import kotlinx.serialization.*

@Serializable
data class Repository (
    @SerialName("id") var id : Int,
    @SerialName("node_id") var nodeId : String,
    @SerialName("name") var name : String,
    @SerialName("full_name") var fullName : String,
    @SerialName("private") var private : Boolean,
    @SerialName("owner") var owner : Owner,
    @SerialName("description") var description : String?,
    @SerialName("fork") var fork : Boolean,
)

@Serializable
data class Owner (
    @SerialName("login") var login : String,
    @SerialName("id") var id : Int,
    @SerialName("node_id") var nodeId : String,
    @SerialName("avatar_url") var avatarUrl : String,
    @SerialName("gravatar_id") var gravatarId : String,
)