package com.globe.movies

data class Movie(val title:String, val poster:Int, val rating:Float, val plot:String) : java.io.Serializable {

    // serializable slower than parcelable
}