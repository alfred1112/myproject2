package com.tom

import javax.swing.JFrame

class GuessFrame : JFrame(){
    init{
        setSize(600,400)
        setLocation(300,200)
        defaultCloseOperation = DISPOSE_ON_CLOSE
        isVisible = true
    }
}

fun main(){
    val guessFrame = GuessFrame()
}