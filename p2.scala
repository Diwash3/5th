import scala.io.StdIn
import scala.collection.mutable.ArrayBuffer
object MinMax {
def main(args:Array[String]):Unit={
var numarray=new ArrayBuffer[Int]()
print("Enter the number of elements")
var n=scala.io.StdIn.readInt()
print("Enter the elements below,one per line")
for (i<-0 until n)
numarray+=scala.io.StdIn.readInt()
val t=MM(numarray)
print("maximum value is ",t._2)//print returned value(t._=access the value ie 1st for 1 in a array)
print("minimum value is ",t._1)
}

def MM(numarray:ArrayBuffer[Int]):(Int,Int)={ 
var mi:Int=numarray(0)//for minimum/for comparision
var mx:Int=numarray(0)
for(i<-numarray)//comparision
{
if(i<mi)
mi=i
else if(i>mx)//value greter than 1st value
mx=i
//returning function as a tuple
}
(mi,mx)
}
}
