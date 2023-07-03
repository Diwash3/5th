object scalasort{

	def sort(a: List[Int]): List[Int] = {

    	if (a.length < 2)

      	a

    	else {

      	val pivot = a(a.length / 2)

      	sort(a.filter(_ < pivot)) :::

           a.filter(_ == pivot) :::

           sort(a.filter(_ > pivot))

    }

}

	def sort(a: Array[Int]) {



    def swap(i: Int, j: Int) {

      val t = a(i); a(i) = a(j); a(j) = t

    }



    def sort2(l: Int, r: Int) {

      val pivot = a((l + r) / 2)

      var i = l

      var j = r

      while (i <= j) {

        while (a(i) < pivot) i += 1

        while (a(j) > pivot) j -= 1

        if (i <= j) {

          swap(i, j)

          i += 1

          j -= 1

        }

      }

      if (l < j) sort2(l, j)

      if (j < r) sort2(i, r)

    }



    if (a.length > 0)

      sort2(0, a.length - 1)

  }



def main(args: Array[String]) {

    var ar = List(6,5,2,1,8)

    println(ar)

    print("functional sort"

    print(sort(ar))

    var xs2 = Array(6,5,2,1,8);

    println(xs2)

    println("imperative sort")

    sort(xs2)

    for(ele<-xs2)

    println(ele)

   }

 }

