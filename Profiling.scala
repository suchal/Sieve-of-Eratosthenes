package lab5
import Prime.findPrime
object Profiling extends App {
  /*************** Method I ****************/
  def time[R](block: => R): R = {
      val t0 = System.nanoTime()
      val result = block    // call-by-name
      val t1 = System.nanoTime()
      println("Elapsed time: " + (t1 - t0)/1000000 + "ms")
      result
  }
  import System.currentTimeMillis
  def profile[R](code: => R, t: Long = currentTimeMillis) = (code, currentTimeMillis - t)

//  println("Generating prime numbers till 10")
  val (result1, time1) = profile {findPrime(10)}
//  println("time taken: " + time1 + "ms")

  println("Generating prime numbers till 1000")
  val (result2, time2) = profile {findPrime(1000)}
  println("time taken: " + time2 + "ms")

  println("Generating prime numbers till 10000")
  val (result3, time3) = profile {findPrime(10000)}
  println("time taken: " + time3 + "ms")

  println("Generating prime numbers till 100000")
  val (result4, time4) = profile {findPrime(100000)}
  println("time taken: " + time4 + "ms")


}