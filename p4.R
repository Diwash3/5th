df<-airquality
dim(df)
sapply(df, class)
print("missing values are")
x<-colSums(is.na(df))
print(x)
which(is.na(df))
sum(is.na(df))
df1<-data.frame(df)
df1
for(i in 1:ncol(df))
  df1[,i]<-ifelse(is.na(df1[,i]),mean(df1[,i],na.rm=TRUE),df1[,i])
df1
df2<-na.omit(df)
df2
  
  
