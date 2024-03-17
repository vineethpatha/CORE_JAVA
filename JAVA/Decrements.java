class Decrements{

int a=10,b=20;

void postincrement(){
System.out.println("postincrement::::"+a++);
}

void preincrement(){
++a;
System.out.println("preincrement::::"+a);
}

void postdecrement(){
b++;
System.out.println("postdecrement::::"+b);
}

void predecrement(){
++b;
System.out.println("predecrement:::::"+b);
}
}