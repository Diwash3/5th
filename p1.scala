import scala.io.Source

object WordCount{
def main(args:Array[String]){
if(args.length!=1)
{
System.err.println("error")
System.exit(1)
}
var filename=args(0)
val WC=scala.collection.mutable.Map[String,Int]()
for(line<-Source.fromFile(filename).getLines)
for(word<-line.split(" "))
WC(word)=if(WC.contains(word)) WC(word)+1 else 1
println(WC)
for((k,v)<-WC)
printf("Word %s is repeated %d number of times\n",k,v)
}
}
