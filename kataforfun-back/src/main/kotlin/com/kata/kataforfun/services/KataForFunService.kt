package com.kata.kataforfun.services

import org.springframework.stereotype.Component

@Component
class KataForFunService {

    fun convertNumber(inputNumber: Int): String {
       
	   val result = StringBuilder()
        val fooBarMap = mapOf(3 to "Kata", 5 to "For")

        fooBarMap.forEach { (key, value) ->
            if (inputNumber % key == 0) {
                result.append(value)
            }
        }
        val fooBarQuixMap = fooBarMap + Pair(7,"Fun")
        inputNumber.toString().forEach { digit ->
            digit.toString().toIntOrNull()?.let { number ->
                fooBarQuixMap[number]?.let { result.append(it) }
            }
        }

        return if (result.isEmpty()) {
            inputNumber.toString()
        } else {
            result.toString()
        }
    }

}


