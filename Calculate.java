public class Calculate
{
public static void main(String[] arg)
{
System.out.println("Calculate....");
/* add */
int first_integer = Integer.valueOf(arg[0]);
int second_integer = Integer.valueOf(arg[1]);
int summ_integer = first_integer+second_integer;
System.out.println("summ="+summ_integer);
/* multiply */
short first_short = Short.valueOf(arg[2]);
short second_short = Short.valueOf(arg[3]);
int summ_short = first_short/second_short;
System.out.println("summ="+summ_short);



}


















}