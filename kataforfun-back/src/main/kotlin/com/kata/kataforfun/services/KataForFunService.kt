package com.kata.kataforfun.services

import org.springframework.stereotype.Component

@Component
class KataForFunService {

    fun convertNumber(inputNumber: Int): String {
        val result = StringBuilder()
    	if(inputNumber % 3 == 0){
    		result.append("kata")
    	}
    	if(inputNumber.toString().contains("3")){
    		result.append("Kata")
    	}

        return result.toString().ifEmpty{
	 		inputNumber.toString()
	 	}
		
    }

}