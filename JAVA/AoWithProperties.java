class AoWithProperties
{

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





