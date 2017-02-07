package com.testin.mix

object B {

    def fb: Unit = println("Hello B")

    def main(args: Array[String]): Unit = {
        A.fa()
        C.fc()
    }
}