package CityTraffic;

import java.util.*;
import java.io.*;

class Main {

  public static String CityTraffic(String[] strArr) {
    CityTrafficHelper(strArr);
    // code goes here  
    return strArr[0];
  }
  
  
  public static void CityTrafficHelper(String[] strArr){
    // ArrayList<city> arr = new ArrayList<city>();
    // for(String s : strArr){
    //     // String result = "";
    //   int n = Integer.parseInt(s.charAt(0) + "");  // get the number of the city
    //   String cities = s.substring(s.indexOf(':') + 2, s.length() - 1);   // get the neibors of the city
    //   String[] nei = cities.split(",");
    //   ArrayList<Integer> neis = new ArrayList<Integer>();
    //   for(String c : nei){
    //     //   result += Integer.parseInt(c) + " ";
    //     neis.add(Integer.parseInt(c));
    //   }
    //   city c1 = new city(n);
    //   c1.neibors = neis;
    //   arr.add(c1);


    // //   System.out.println("{" + c1.num + ":" + result + "}");
    // }

    HashMap<Integer, ArrayList<Integer>> cities = new HashMap<>();
    int index = 0;
    int[] keySet = new int[strArr.length];
    for(String s : strArr){
        int n = Integer.parseInt(s.charAt(0) + "");  // get the number of the city
        ArrayList<Integer> neibors = new ArrayList<>();
        String cs = s.substring(s.indexOf(':') + 2, s.length() - 1);   // get the neibors of the city
        String[] nei = cs.split(",");
        for(String i : nei){
            neibors.add(Integer.parseInt(i));
        }

        keySet[index] = n;
        cities.put(n, neibors);
        System.out.println("{" + index + " " + cities.get(index));
        index++;
    }
    String[] result = new String[strArr.length];

    algorithm(cities, keySet, result, 0);
  }
  

  public static void algorithm(HashMap<Integer, ArrayList<Integer>> cities, int[] keySet, String[] result, int index){
    if(index == result.length)  return;
    ArrayList<Integer> neibors = cities.get(keySet[index]);
    for(int i = 0; i < neibors.size(); i++){
    }
  }
  
  
  

  public static void main (String[] args) {  
      String[] s1 = {"1:[5]", "2:[5]", "3:[5]", "4:[5]", "5:[1,2,3,4]"} ;
      String[] s2 = {"1:[5]", "2:[5,18]", "3:[5,12]", "4:[5]", "5:[1,2,3,4]", "18:[2]", "12:[3]"};
    // keep this function call here     
    // Scanner s = new Scanner(System.in);
    // System.out.print(CityTraffic(s1)); 
    CityTrafficHelper(s1);
  }

//   static class city{
//     int num;
//     ArrayList<Integer> neibors;
    
//     city(int n){
//       this.num = n;
//       this.neibors = null;
//     }
    
//   }

}

