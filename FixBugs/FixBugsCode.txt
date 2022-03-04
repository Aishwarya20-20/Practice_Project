package com;
	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Scanner;
	public class FixBugs {
	public static void main(String[] args) {
	 System.out.println("Hello Here!");
	 System.out.println("**************");
	 optionsSelection();
	 }
	 private static void optionsSelection() {
	 String[] arr = {"1. I want to review my expenditure",
	 "2. I want to add my expenditure",
	 "3. I want to delete my expenditure",
	 "4. I want to sort the expenditures",
	 "5. I want to search for a particular expenditure",
	 "6. Close the application"
	 };
	 int[] arr1 = {1,2,3,4,5,6};
	 int slen = arr1.length;
	 for(int i=0; i<slen;i++){
	 System.out.println(arr[i]);
	 // display the all the Strings mentioned in the String array
	 }
	 ArrayList<Integer> arrlist = new ArrayList<Integer>();
	 ArrayList<Integer> expenses = new ArrayList<Integer>();
	 expenses.add(1250);
	 expenses.add(2250);
	 expenses.add(3090);
	 expenses.add(4000);
	 expenses.add(67890);
	 expenses.addAll(arrlist);
	 System.out.println("\nEnter your choice:\t");
	 Scanner sc = new Scanner(System.in);
	 int options = sc.nextInt();
	 for(int j=1;j<=slen;j++){
	 if(options==j){
	 switch (options){
	 case 1:
	 System.out.println("The saved expenses of you are listed below: \n");
	 System.out.println(expenses+"\n");
	 optionsSelection();
	break;
	 case 2:
	 System.out.println("Enter the digit to add in your Expense: \n");
	 int value = sc.nextInt();
	 expenses.add(value);
	 System.out.println("Your value is updated\n");
	 expenses.addAll(arrlist);
	 System.out.println(expenses+"\n");
	 optionsSelection();
	 break;
	 case 3:
	 System.out.println("You have been going to delete expenses!! \nConfirm again.......\n");
	 int con_choice = sc.nextInt();
	 if(con_choice==options){
	 expenses.clear();
	 System.out.println(expenses+"\n");
	 System.out.println("All your expenses are erased!\n");
	 } else {
	 System.out.println("Oops... try again!");
	 }
	 optionsSelection();
	break;
	 case 4:
	 sortExpenses(expenses);
	 optionsSelection();
	break;
	 case 5:
	 searchExpenses(expenses);
	 optionsSelection();
	break;
	 case 6:
	 closeApp();
	 break;
	 default:
	 System.out.println("You have made an invalid choice!");
	 break;
	 }
	 }
	 }
	 }
	 private static void closeApp() {
	 System.out.println("Closing your application... \nThank you!");
	 }
	 @SuppressWarnings("resource")
	private static void searchExpenses(ArrayList<Integer> arrayList) {
	 int leng = arrayList.size();
	 System.out.println("Enter the expense you need to search:\t");
	 //
	 Scanner sc = new Scanner(System.in);
	 int input = sc.nextInt();
	 //Linear Search
	 for(int i=0;i<leng;i++) {
	 if(arrayList.get(i)==input) {
	 System.out.println("Found the expense " + input + " at " + i + 
	" position");
	 }
	 }
	 }
	 private static void sortExpenses(ArrayList<Integer> arrayList) {
	 @SuppressWarnings("unused")
	int arrlength = arrayList.size();
	 //Complete the method. The expenses should be sorted in ascending order.
	 
	 Collections.sort(arrayList);
	 System.out.println("Sorted expenses : ");
	 for(Integer i: arrayList) {
	 System.out.print(i + " ");
	 }
	 
	 System.out.println("\n");
	 
	 }

}
