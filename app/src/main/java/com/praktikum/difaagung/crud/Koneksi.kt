package com.praktikum.difaagung.crud

class Koneksi {

    companion object {

        private val SERVER = "http://192.168.137.55/simplecrud/"
        val CREATE = SERVER+"create.php"
        val READ = SERVER+"read.php"
        val DELETE = SERVER+"delete.php"
        val UPDATE = SERVER+"update.php"

    }
}