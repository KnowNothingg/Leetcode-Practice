import java.util.ArrayList;
import java.util.List;

class Solution {
	public static void main(String[] args) {
		String[] trans = {"alice,20,800,mtv","alice,50,100,beijing"};
		List<String> answer = invalidTransactions(trans);
		for(int i = 0; i < answer.size(); i++) {
			System.out.println(answer.get(i));
		}
	}
	
    public static List<String> invalidTransactions(String[] transactions) {
        List<String> invalid = new ArrayList<String>();
        
        Transaction trans1 = new Transaction();
        Transaction trans2 = new Transaction();

        for(int i = 0; i < transactions.length; i = i + 2) {
        	if(i + 1 == transactions.length) {
        		String[] item1 = transactions[i-1].split(",");
            	trans1 = new Transaction(item1[0].trim(), 
            			Integer.parseInt(item1[1].trim()), 
            			Integer.parseInt(item1[2].trim()), item1[3].trim());
            	String[] item2 = transactions[i].split(",");
            	trans2 = new Transaction(item2[0].trim(), 
            			Integer.parseInt(item2[1].trim()), 
            			Integer.parseInt(item2[2].trim()), item2[3].trim());
            	if(!(trans1.name.equals(trans2.name) && !trans1.city.equals(trans2.city) 
            			&& trans2.time - trans1.time <= 60)) {
            		invalid.add(transactions[i]);
            	}else if(!trans1.name.equals(trans2.name)) {
            		invalid.add(transactions[i+1]);
            	}
            	
            	break;
        	}
        	String[] item1 = transactions[i].split(",");
        	trans1 = new Transaction(item1[0].trim(), 
        			Integer.parseInt(item1[1].trim()), 
        			Integer.parseInt(item1[2].trim()), item1[3].trim());
        	String[] item2 = transactions[i+1].split(",");
        	trans2 = new Transaction(item2[0].trim(), 
        			Integer.parseInt(item2[1].trim()), 
        			Integer.parseInt(item2[2].trim()), item2[3].trim());
        	
        	if(!(trans1.name.equals(trans2.name) && !trans1.city.equals(trans2.city) 
        			&& trans2.time - trans1.time <= 60)) {
        		invalid.add(transactions[i]);
        		invalid.add(transactions[i+1]);
        	}else if(!trans1.name.equals(trans2.name)) {
        		invalid.add(transactions[i+1]);
        	}
        }
        
        for(int i = 0; i < transactions.length; i++) {
        	String[] item1 = transactions[i].split(",");
        	trans1 = new Transaction(item1[0].trim(), 
        			Integer.parseInt(item1[1].trim()), 
        			Integer.parseInt(item1[2].trim()), item1[3].trim());
        	
        	if(trans1.amount > 1000 && !invalid.contains(transactions[i])) {
        		invalid.add(transactions[i]);
        	}
        }
        
        
        return invalid;
    }
}

class Transaction{
    String name;
    int time;
    int amount;
    String city;
    
    public Transaction(){
    	name = null;
    	time = -1;
    	amount = -1;
    	city = null;
    }
    
    public Transaction(String s, int t, int a, String c){
    	this.name = s;
    	this.time = t;
    	this.amount = a;
    	this.city = c;
    }
}