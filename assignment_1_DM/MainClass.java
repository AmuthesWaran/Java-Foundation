package assignment_1_DM;

import java.util.Arrays;

import javaCollections.arrayList;

public class MainClass {

	private static String substring;
	private static String[] split;

	public static void main(String[] args) {

		
//		Task1_splitstring_using_space test1 = new Task1_splitstring_using_space();
//		 String[] allText = test1.splitString("HellOOOOO World");
//		
//		 
//		 for (int i=0; i<allText.length; i++) {
//			 
//			 System.out.println(allText[i]);
//			 
//		 }
//		 
		// Solution to DM1 1 (i)
//		String text1 = "some Text goes here";
//		
//		 String[] result = text1.split(" ");
		 
//		 String[] result2 = { "some", "text", "goes", "here" };
		 
		 
//		 for(int i = 0; i < result.length; i++)
//		 {
//			 System.out.println(result[i]); 
//		 }
		
//		 for  ( String res: result ) {
//			 System.out.println(res);
//		 }
		 
//		 String array = {"text1", "text2", "text3" };
		
		
//		 System.out.println(result);
		 
		
//		String test = "select * from ipl.csv where season > 2014 and city = 'Bangalore'";
		
		
		
		
//		int index1  = test.indexOf("from") + 5;
//		int index2  = test.indexOf("csv") + 3;
		
//		String result = test.substring( 0, test.indexOf("csv") + 3  );
		
		
		
//		char res = test.charAt(0);
//		System.out.println(res);
//		System.out.println(index1);
//		System.out.println(index2);
//		
//		
//		
//		
//		String test1 = test.substring(index1, index2);
//		System.out.println(test1);
//		
		
		
//		String test = "select city,winner,player_match from ipl.csv where season > 2014 and city ='Bangalore'";
//		
//		int index1  = test.indexOf("select ") + 5;
//		int index2  = test.indexOf(" from") - 1;
//		test.split(",")p
//		String[] result =  (test.substring(test.indexOf("select ") + 7, test.indexOf(" from"))).split(",") ;
		
//		String[] result =  (queryString.substring(queryString.indexOf("select ") + 7, queryString.indexOf(" from"))).split(",");
		
//        System.out.println(result);
//		for val: result
//		System.out.println(val);
//		for (String string : result) {
//			System.out.println(string);
//		}
		
//		String test1 = "select * from ipl.csv where season > 2014 and city ='Bangalore'";
//		String test1 = "select city from ipl.csv where season > 2015 or city ='Bangalore' order by city";
//		String test1 = "select city from ipl.csv where season > 2022 or city ='Bangalore' group by city";
//				
//		int indexofWhere = test1.indexOf("where") + 6;
//		int length = test1.length();
//		
//		System.out.println(indexofWhere);
//		System.out.println(length);
//		
//		test1.toLowerCase();
//		
//		if (test1.contains("group by")) {
//			
//			System.out.println((test1.substring(test1.indexOf("where") + 6, test1.indexOf(" group by"))).toLowerCase());
//			
//		} else if ( test1.contains("order by") ){
//
//			System.out.println((test1.substring(test1.indexOf("where") + 6, test1.indexOf(" order by"))).toLowerCase());
//			
//		}
		
	
//		
//		else {
//			
//			System.out.println((test1.substring(test1.indexOf("where") + 6, length)).toLowerCase());
//			
//		}
		
		
		
//		String test1 = "select * from ipl.csv where season > 2014 and city ='Bangalore'" ;
		
//		test1.substring( test1.indexOf("where " + 6), test1.length());
		
//		int where = test1.indexOf("where") + 6 ;
//		System.out.println(where);
		
		
		
//		System.out.println(test1.substring( test1.indexOf("where ") + 6 , test1.length()).split(" and "));
		
		
//		String[] result;
//		
//		if ( ! (test1.contains("where")) ) {
//			
//			result = null;
//		}
//		
//		else if (test1.contains("group by")) {
//			
//			result = (test1.substring( test1.indexOf("where ") + 6 , test1.indexOf("group by") -1)).toLowerCase().split(" and | or ");
//			
//		}
//		else if ( test1.contains("order by") ) {
//			
//			result = (test1.substring( test1.indexOf("where ") + 6 , test1.indexOf("order by") -1)).toLowerCase().split(" and | or ");
//		}
//		
//		
//		else {
//			
//			result = (test1.substring( test1.indexOf("where ") + 6 , test1.length())).toLowerCase().split(" and | or ");
//		}
//		
//		
//		System.out.println(result);
//		
//		for (String string : result) {
//			System.out.println(string);
//		}
//		
		
//		3) As there will be multiple conditions, separate each condition and display in different line.
//    
//    Input String : select * from ipl.csv where season > 2014 and city ='Bangalore'
//	Output String : season > 2014  city ='bangalore'
		
	
		
		/*
		 * This method will extract condition(s) from the query string. The query can
		 * contain one or multiple conditions. In case of multiple conditions, the
		 * conditions will be separated by AND/OR keywords. for eg: 
		 * Input: select city,winner,player_match from ipl.csv where season > 2014 and city ='Bangalore'
		 * This method will return a string array ["season > 2014","city ='bangalore'"] and print the array
		 * Note: ----- 1. The field name or value in the condition can contain keywords
		 * as a substring. For eg: from_city,job_order_no,group_no etc. 2. The query
		 * might not contain where clause at all.
		 */
		
		
//		String test1 = "select city,winner,player_match from ipl.csv where season > 2014";
//		solved
//		String result = test1.substring(test1.indexOf("where") + 6, test1.length());
		
//		String test2 = "select city,winner,player_match from ipl.csv where season > 2014 and city ='Bangalore'";
//		solved
//		String[] result1 = test2.substring(test2.indexOf("where") + 6, test2.length()).split(" and ");
		
		
//		String test3 = "select city,winner,player_match from ipl.csv where season > 2014 and city ='Bangalore' or city ='Delhi'";
//		solved
//		String reult[] = test0.substring(test0.indexOf("where") + 6, test0.length()).split( " and | or " );
		
		
//		String test4 = "select city,winner,player_match from ipl.csv where season > 2014 group by winner";
		
//		String test5 = "select city,winner,player_match from ipl.csv where season > 2014 order by city";
		//null
//		String test6 = "select city,winner,player_match from ipl.csv";
//		String test7 = "select city,winner,player_match from ipl.csv group by winner";
		
		
//		if ( !(test7.contains("where")) )
//			{
//				System.out.println("hi");
//			}
//		
		
//		int res = test1.indexOf("where");
//		System.out.println(res);
		
//		int res1 = test1.length();
//		System.out.println(res1);
		
//		String result = test1.substring(res, res1);
//		System.out.println(result);
		
		
//		String result = test1.substring(test1.indexOf("where"), test1.length());
		
//		System.out.println(result);
		
//		String test2 = "select city,winner,player_match from ipl.csv where season > 2014 and city ='Bangalore'";
		
//		int res1 = test2.indexOf("where");
//		int res2 = test2.length();
		
//		String result0 = test2.substring(res1, res2); 
//		String[] result1 = result0.split(" and ");
		
//		for (String string : result1) {
//			System.out.println(string);
//		}
		
//		System.out.println(result1);
		
//		String[] result1 = test2.substring(test2.indexOf("where"), test2.length()).split(" and ");
		
		
		
//		String test0 = "select city,winner,player_match from ipl.csv where season > 2014 and city ='Bangalore' or city ='Delhi'";
		
//		int res1 = test0.indexOf("where");
//		int res2 = test0.length();
		
//		String result0 = test0.substring(res1, res2);
//		System.out.println(result0);
//		String result1[] = result0.split(" and | or ");
		
//		for (String string : result1) {
//			System.out.println(string);
//		}
//		
//		String reult[] = test0.substring(test0.indexOf("where"), test0.length()).split( " and | or " );
		
		
//		String test0 = "select city,winner,player_match from ipl.csv where season > 2014 group by winner";
//		
//		int res1 = test0.indexOf("where") + 6;
//		int res2 = test0.indexOf(" group by ");
//		
//		String result0 = test0.substring(res1, res2);
//		System.out.println(result0);
//		
//		
//		String result44 = test0.substring(test0.indexOf("where") + 6, test0.indexOf(" order by ")); 
		
//		String result1[] = result0.split(" group by ");
//		
//		for (String string : result1) {
//		System.out.println(string);
//		}		
		
		
		
//		String test1 = "select city,winner,player_match from ipl.csv where season > 2014";
//		solved
//		String result = test1.substring(test1.indexOf("where") + 6, test1.length());
		
//		String test2 = "select city,winner,player_match from ipl.csv where season > 2014 and city ='Bangalore'";
//		solved
//		String[] result1 = test2.substring(test2.indexOf("where") + 6, test2.length()).split(" and ");
		
		
//		String test3 = "select city,winner,player_match from ipl.csv where season > 2014 and city ='Bangalore' or city ='Delhi'";
//		solved
//		String reult[] = test0.substring(test0.indexOf("where") + 6, test0.length()).split( " and | or " );
		
		
//		String test4 = "select city,winner,player_match from ipl.csv where season > 2014 group by winner";
		
//		String test5 = "select city,winner,player_match from ipl.csv where season > 2014 order by city";
		//null
//		String test6 = "select city,winner,player_match from ipl.csv";
//		String test7 = "select city,winner,player_match from ipl.csv group by winner";
		
		
		
//		
//		
//		String test0 = "select city,winner,player_match from ipl.csv where season > 2014 and city ='Bangalore'";
//		
//		if ( !  ( test0.contains("where") ) )
//		{
//			System.out.println("null");
//		}
//		else if ( test0.contains(" order by ") )
//		{
//			String testing = test0.substring(test0.indexOf("where") + 6, test0.indexOf(" order by "));
//			System.out.println(testing);
//		}
//		else if ( test0.contains(" group by ") )
//		{
//			String testing = test0.substring(test0.indexOf("where") + 6, test0.indexOf(" group by "));
//			System.out.println(testing);
//		}
//		else if ( test0.contains("and")  && test0.contains("or"))
//		{
//			String testing[] = test0.substring(test0.indexOf("where") + 6, test0.length()).split( " and | or " );
//			for (String string : testing) {
//				System.out.println(string);
//			}
//			
//			
//		}
//		else if ( test0.contains("and"))
//		{
//			String testing[] = test0.toLowerCase().substring(test0.indexOf("where") + 6, test0.length()).split(" and ");
//			for (String string : testing) {
//				System.out.println(string);
//			}
//			
//			System.out.println("hi");
//		}
//		else
//		{
//			String testing = test0.substring(test0.indexOf("where") + 6, test0.length());
//			System.out.println(testing);
//		}
//		
		
		
		
//		Task 2 of 3 
//		public String[] getConditions(String queryString) {
//
//			if(!queryString.contains("where"))
//				return null;
//
//			queryString = queryString.replace(" and ",",");
//			queryString = queryString.replace(" or ",",");
//
//			if(queryString.contains("group"))
//				return queryString.substring(queryString.indexOf("where")+6, queryString.indexOf("group")-1).toLowerCase().split(",");
//			else if(queryString.contains("order"))
//				return queryString.substring(queryString.indexOf("where")+6, queryString.indexOf("order")-1).toLowerCase().split(",");
//			else
//				return queryString.substring(queryString.indexOf("where")+6, queryString.length()).toLowerCase().split(",");
//		}
		
		
		
//		String test0 = "select city,winner,player_match from ipl.csv where season > 2014 and city ='Bangalore' or city ='Delhi'";
//		
//		String qtest = test0.toLowerCase();
//		
//		String[] array = qtest.split(" ");
//		
////		for (String string : array) {
////			System.out.println(string);
////		}
//		
//		
////		System.out.println(array[0]);
//		
//		String getlogical = "";
//		
//		
////		 [ "Hi", "and", "hello", "or" ]
//		if (qtest.contains("where ")) {
//		
//		for (int i = 0; i<array.length; i++ )
//		{
//			if( array[i].matches("and|or") )
//			{
//								//or + and
//				getlogical = array[i] + " " + getlogical;
//				
//			}
//			
//			
//			
//		}
//		
//		String result2 = getlogical.toString();
//		String result[] = getlogical.toString().split(" ");
//		System.out.println(result2);
////		for (String string : result) {
////			System.out.println(string);
////		}
//		
//		}
//		
//	
//		
//		String[] user = new String[3];
////		
////		user = { "user1", "user1", "user1" };
//		
//		
		
		
//		String test0 = "select city,winner,player_match from ipl.csv where season > 2014 and city ='Bangalore' order by winner";

//		String test0 = "select city,winner,player_match from ipl.csv order by team1";
//
//		String test2 = "select city,winner,player_match from ipl1.csv where season > 2014 and city ='Bangalore'";
//		
//		
//		
//		int res0 = test0.indexOf("order by ");
//		int res1 = test0.length();
//		
//		String result = test0.substring(test0.indexOf("order by ") + 9, test0.length());
//		System.out.println(result);
//		
//		
		
		
		
//		String test0 = "select count(city),sum(win_by_runs),min(win_by_runs),max(win_by_runs),avg(win_by_runs) from ipl.csv";
//
//
//		String test1 = "select count(city),win_by_runs from ipl.csv where season > 2014 group by win_by_runs";
//
//
//		String test2 = "select * from ipl.csv";
//		
//		int res0 = test0.indexOf("select");
//		int res1 = test0.indexOf(" from");
//		
//		String[] result = test0.substring(res0 + 7, res1).split(",");
////		System.out.println(result.toString());
		
//		
//		int res0 = test1.indexOf("select") + 7;
//		int res1 = test1.indexOf(",");
//		
//		String result[] = test1.substring(test1.indexOf("select") + 7, test1.indexOf(",")).split(" ");
//		System.out.println(result);
		
		
//		for (String string : result) {
//			System.out.println(string);
//		}
//		
//		String test3 = null;
//		
//		if (test3.contains("*"))
//		{
//			return null;
//		}
//		
//		else if ( test3.contains("sum")  )
//		{
//			return test1.substring(test1.indexOf("select") + 7, test1.indexOf(",")).split(" ");
//		}
//		
//		else
//		{
//			return test0.substring(test0.indexOf("select") + 7, test0.indexOf(" from")).split(",")
//		}
//		
		
		// 
//		String test0 = "select city,winner,player_match from ipl.csv where season > 2014 and city ='Bangalore'";
//		String test0 = "select city,winner,player_match from ipl.csv where season > 2014 or city ='Bangalore'";
//		String test0 = "select city,winner,player_match from ipl.csv where season > 2014 and city ='Bangalore' or city ='Delhi'";
//		String test3 = "select city,winner,player_match from ipl1.csv group by winner"; //solved
//		
//		String[] result = test0.split(" ");
		
//		for (String string : result) {
//			
//			System.out.println(string);
//			
//		}
		
//		String getLogical = "";
//		if (test0.contains("where")) {
//			
//			//code goes here
//			
//
//			
//			for (int i = 0; i < result.length; i++) {
//				
//				if(result[i].equals("and") || result[i].equals("or"))
//				{
//					
//					getLogical =   result[i] + " " + getLogical;
//				}
//			
//				
//			}
//			System.out.println(getLogical);
			//test 0 - getLogical = and<space>
			//test 1 - getLogical = or<space>
			//test 2 - getLogical = or<space>and
			
//			test0 =and
			
			
			
//		} else {
//			
//			System.out.println("null");
//			
//		}
//		
//		----------------------------------assignment 2-----------------------------------------------
		
//		String test0 = "select winner,season,team1,team2 from ipl.csv where season > 2014 group by season order by team1";
		
//		int index = test0.indexOf("group by");
//		System.out.println(index);
//		
//		substring = test0.substring(66);
//		
//		System.out.println(substring);
//		
//		
//		
//		
//		if(test0.contains("order by")) {
//			String[] result = test0.substring(test0.indexOf("group by ") + 9, test0.indexOf("order by")).split(" ");
//		}
//		
//		else if(test0.contains("group by"))
//		{
//			String[] result =  test0.substring(test0.indexOf("group by ") + 9).split(" ");
//		}
//		
//		else {
//			String[] result = null;
		
//		groupByFields = Arrays.asList(queryString.split(" group by ")[1].split(" order by ")[0].split("\\s*,\\s*"));
		
		String test0 = "select winner,season,team1,team2 from ipl.csv where season > 2014 group by season order by team1";
		String split[] = test0.split(" group by ")[1].split(" order by ")[0].split(" ");
		
		System.out.println(split);
		
//		for (String string : split) {
//			System.out.println(string);
//		}
		
	
	}
		
	
}
