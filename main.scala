package lab5
import Prime.findPrime
object main extends App {

   def testFindPrime():Boolean = {
     val li = List(2,3,5,7)
     if( findPrime(10) == li) true else false
   }
   if(testFindPrime()) println("test successfull") else println("failed")
   println("please enter a number:")
   val x = scala.io.StdIn.readInt()
   findPrime(x).foreach(println)

    
}