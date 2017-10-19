package lab5

object Prime {
  def findPrime(n: Int) = {
    def sqrt(num: Double) = {
      def abs(x: Double) = if(x < 0) -x else x
      def isGoodEnough(est: Double):Boolean = ( abs(est * est - num)/num < 0.01 )
      def guess(est: Double): Double = 	if(isGoodEnough(est)) est	else guess(improve(est))
      def improve(est: Double): Double = ( (num / est) + est )/2

      guess(1)
    }
    val sq = sqrt(n)
    val list = List.range(2, n+1)
    def loop(x: Int, sublist: List[Int]):List[Int] = {
      if(x >= sq) sublist
      else loop(x+1, sublist.filterNot( (y)=>(y%x == 0 && y!=x) ))
    }
    loop(2, list)
  }
}
