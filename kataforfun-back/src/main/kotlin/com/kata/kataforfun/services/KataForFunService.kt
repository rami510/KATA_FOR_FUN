package com.kata.kataforfun.services

import org.springframework.stereotype.Component

@Component
class KataForFunService {

    fun convertNumber(inputNumber: Int): String {
        val result = StringBuilder()
    	if(inputNumber % 3 == 0){
    		result.append("kata")
    	}else if(inputNumber % 5 == 0){
			result.append("For")
		}
    	if(inputNumber.toString().contains("3")){
    		result.append("Kata")
    	}else if(inputNumber.toString().contains("5")){
    		result.append("For")
    	}

        return result.toString().ifEmpty{
	 		inputNumber.toString()
	 	}
		
    }

}