package com.example.dailyfootprint.model

import androidx.annotation.Keep
import java.io.Serializable

@Keep
data class Challenge(
<<<<<<< HEAD
    val challengeCode : String,
    val challengeName : String,
    val challengeOwner : String,
    //val position : Array<Float> = Array(2) { 0.0F },
    val position: ArrayList<Float> = arrayListOf(0.0F, 0.0F),
    val goal : Int,
    //val successTime : Array<Int> = Array(7) {0}
    val successTime: ArrayList<Int> = arrayListOf(0, 0, 0, 0, 0, 0, 0)

): Serializable {
    constructor() : this("", "", "", arrayListOf(0.0F, 0.0F), 0, arrayListOf(0, 0, 0, 0, 0, 0, 0))
}

=======
    val challengeCode : String = "",
    val challengeName : String = "",
    val challengeOwner : String = "",
    val position : List<Float> = List(2) { 0.0F },
    val goal : Int = 0,
    val successTime : List<Int> = List(7) {0}
)
>>>>>>> master
