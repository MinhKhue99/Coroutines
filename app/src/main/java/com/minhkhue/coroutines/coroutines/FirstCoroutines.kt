package com.minhkhue.coroutines.coroutines

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
/*
fun main() {
	GlobalScope.launch {
		delay(1000L)
		print("Hello ")
	}
	print("World!")
	Thread.sleep(2000L)
}
 */
/*
fun main() {
	
	runBlocking {
		/*
		-Tao ra mot coroutines va block thread hien tai
		chay nhung ham va cau lenh ben trong khoi runBlocking
		mot cach tuan tu
		-Thuong duoc dung de viet test cho app va hau nhu
		khong duoc dung cho app do gay block thread hien tai*/
		delay(1000L)
		print("Hello ")
		delay(1000L)
		print("Coroutines!")
	}
}
 */
fun main() {
	val start = System.currentTimeMillis()
	runBlocking {
		repeat(1_000_000){
			launch {
				println("Pham Minh Khue")
			}
		}
	}
	val end = System.currentTimeMillis()
	println("Total Time: ${end-start} ms")
}