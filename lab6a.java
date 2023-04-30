import java.lang.Math;
public class lab6a{
// one rational number will be input as &quot;num1/den1&quot; and the other as
// &quot;num2/den2&quot;
int num1, num2, den1, den2;
int num_result, den_result;
public lab6a(int num1, int num2, int den1, int den2){
this.num1 = num1;
this.num2 = num2;
this.den1 = den1;
this.den2 = den2;
}
// add two rational numbers and return the result in the same format
// &quot;num/dem&quot;
public String add(){
if (den1 == den2){
num_result = num1 + num2;
den_result = den1;
}
else{
num_result = (num1*den2) + (num2*den1);
den_result = den1*den2;

}
return num_result+&quot;/&quot;+den_result;
}
// subtract two rational numbers and return the result in the same format
&quot;num/dem&quot;
public String subtract(){
if (den1 == den2){
num_result = num1 - num2;
den_result = den1;
}
else{
num_result = (num1*den2) - (num2*den1);
den_result = den1*den2;
}
return num_result+&quot;/&quot;+den_result;
}
// multiply two rational numbers and return the result in the same format
&quot;num/dem&quot;
public String multiply(){
num_result = num1*num2;
den_result = den1*den2;
return num_result+&quot;/&quot;+den_result;
}
// divide two rational numbers and return the result in the same format
&quot;num/dem&quot;
public String divide(){
//throwing divideByZero exception is the denominator is zero
if (den2 == 0){
throw new ArithmeticException(&quot;Divide by zero&quot;);
}
else{
num_result = num1*den2;
den_result = den1*num2;
return num_result+&quot;/&quot;+den_result;
}
}
// compare two rational numbers and return the result in the same format
&quot;num/dem&quot;
public String compare(){
if (num1/den1 == num2/den2){
return &quot;Both numbers are equal&quot;;
}
else if (num1/den1 &gt; num2/den2){
return &quot;First number is greater&quot;;

}
else{
return &quot;Second number is greater&quot;;
}
}
// convert both rational numbers to floating point and return the result
public String convert(){
return &quot;First number in floating point: &quot;+(float)num1/den1+&quot; Second
number in floating point: &quot;+(float)num2/den2;
}
// find absolute value of both rational numbers and return the result
public String absolute(){
return &quot;Absolute value of first number: &quot;+Math.abs(num1/den1)+&quot;
Absolute value of second number: &quot;+Math.abs(num2/den2);
}
}