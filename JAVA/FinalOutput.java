class FinalOutput
{
public static void main(String[] abc)
{
Input input=new Input();
AoWithProperties vin=new AoWithProperties();
input.input1=15;
input.input2=30;
vin.add(input);
vin.mul(input);
vin.sub(input);
vin.div(input);
vin.mod(input);

System.out.println(input.sum);
System.out.println(input.sub);
System.out.println(input.mul);
System.out.println(input.div);
System.out.println(input.mod);


}
}







