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
	
	@Test
	fun testKataForFunShouldReturnFor() {
		assertEquals("For",kataForFunService.convertNumber(5))
	}
	
	@Test
	fun testKataForFunShouldReturnFun() {
		assertEquals("Fun",kataForFunService.convertNumber(7))
	}	
	
	@Test
	fun testKataForFunShouldReturnKata() {
		assertEquals("Kata",kataForFunService.convertNumber(9))
	}	
	
	@Test
	fun testKataForFunShouldReturnKataFor() {
		assertEquals("KataFor",kataForFunService.convertNumber(51))
	}
	
	@Test
	fun testKataForFunShouldReturnForKata() {
		assertEquals("ForKata",kataForFunService.convertNumber(53))
	}
	
	@Test
	fun testKataForFunShouldReturnKataKataKata() {
		assertEquals("KataKataKata",kataForFunService.convertNumber(33))
	}
	
	@Test
	fun testKataForFunShouldReturnKataFun() {
		assertEquals("KataFun",kataForFunService.convertNumber(27))
	}	
	
	@Test
	fun testKataForFunShouldReturnKataForFor() {
		assertEquals("KataForFor",kataForFunService.convertNumber(15))
	}
}
