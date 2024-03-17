class OperationsOfAll{
public static void main(String[] abc){

int inputone=Integer.parseInt(abc[0]);
int inputtwo=Integer.parseInt(abc[1]);
OperationsOfAll obj =new OperationsOfAll();
System.out.println("sum  ::::" +obj.add(inputone,inputtwo));
System.out.println("sub  ::::" +obj.sub(inputone,inputtwo));
System.out.println("mul  ::::" +obj.mul(inputone,inputtwo));
System.out.println("div  ::::" +obj.div(inputone,inputtwo));
System.out.println("mod  ::::" +obj.mod(inputone,inputtwo));
}

int add(int inputone,int inputtwo){
int sum=inputone+inputtwo;
return sum;
}

int sub(int inputone,int inputtwo){
int sub=inputone-inputtwo;
return sub;
}

int mul(int inputone,int inputtwo){
int mul=inputone*inputtwo;
return mul;
}

int div(int inputone,int inputtwo){
int div=inputone+inputtwo;
return div;
}

int mod(int inputone,int inputtwo){
int mod=inputone%inputtwo;
return mod;
}



}

