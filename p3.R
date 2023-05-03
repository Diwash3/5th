data()
head(mtcars)
x<-nrow(mtcars)
y<-ncol(mtcars)
print("No of rows")
print(x)
print("no of columns")
print(y)
z<-data.frame(mtcars)
auto=0
manual=0
for(i in 1:x){
  if(z[i,][9]==0)
    auto<-auto+1
  else
    manual<-manual+1
}
if(auto>manual)print("automatic cars more")else Print("manual cars more")
lp<-z[,4]
wt<-z[,6]
scatter.smooth(lp,wt)
am<-as.integer(z$am)
cyl<-as.integer(z$cyl)
vs<-as.integer(z$vs)
newmtc<-data.frame(am,cyl,vs)
print(newmtc)
subset(z,cyl<5)
