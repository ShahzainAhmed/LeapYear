// Find whether the year is a Leap Year or not. 

import java.util.*;
public class LeapYear{
public static void main(String args[]) {
System.out.println ("Enter a year: ");
Scanner s = new Scanner (System.in);
int year = s.nextInt();
if (year%4 == 0){
System.out.println ("It is a Leap Year. ");}
else if (year%4 != 0){
System.out.println ("It is not a Leap Year. "); }

}}