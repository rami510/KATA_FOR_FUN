package com.kata.kataforfun

mport org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals
import org.springframework.boot.test.context.SpringBootTest
import com.kata.foobarquix.services.KataForFunService

@SpringBootTest
class KataForFunApplicationTests {

    @Test
    fun contextLoads() {
    }
	
	val kataForFunService = KataForFunService()
	
	@Test
	fun testKataForFunShouldReturn1() {
		assertEquals("1",kataForFunService.convertNumber(1))
	}
	
	@Test
	fun testKataForFunShouldReturnKataKata() {
		assertEquals("KataKata",kataForFunService.convertNumber(3))
	}
}
