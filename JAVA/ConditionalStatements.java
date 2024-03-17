class ConditionalStatements{

int a=10,b=20,c=50;

void methodone(){
if(a>b)
System.out.println("a is bigger than b");
if(a<b)
System.out.println("b is bigger than a");
if(a==b)
System.out.println("both are equal");
}

void methodtwo(){
if(a>b){
System.out.println("a is bigger than b");
}
else
System.out.println("b is bigger than a");
}

void methodthree(){
if(a>b){
System.out.println("a is bigger than b");
}
else if(b>a){
System.out.println("b is bigger than a");
System.out.println("20 is bigger than 10");
}
else
System.out.println("both are bigger");
}

void methodfour(){
if(a>b && a<c){
System.out.println("a is bigger than b");
}
else
System.out.println("b is bigger than a");
}

void methodfive(){
if(a>b || a<c){
System.out.println("a is bigger than b");
}
else
System.out.println("b is bigger than a");
}

}
