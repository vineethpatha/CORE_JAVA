class FinalOutput1
{
int input1;
int input2;
int sum;
int sub;
int mul;
int div;
int mod;
public static void main(String[] abc)
{
FinalOutput1 input=new FinalOutput1();

input.input1=15;
input.input2=30;
add(input);
mul(input);
sub(input);
div(input);
mod(input);

System.out.println(input.sum);
System.out.println(input.sub);
System.out.println(input.mul);
System.out.println(input.div);
System.out.println(input.mod);

}
Input add(Input input)

{
input.sum=input.input1+input.input2;
return input;
}
Input sub(Input input)
{
input.sub=input.input1-input.input2;
return input;
}
Input mul(Input input)
{
input.mul=input.input1*input.input2;
return input;
}
Input div(Input input)
{
input.div=input.input1/input.input2;
return input;
}
Input mod(Input input)
{
input.mod=input.input1%input.input2;
return input;
}
}





