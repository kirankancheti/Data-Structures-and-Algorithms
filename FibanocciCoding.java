import java.util.ArrayList;


public class FibanocciCoding {
	
	static ArrayList<Integer> fibanocciSerires=new ArrayList<Integer>();
	public static void main(String[] args){
		generateFibanocciSeries(1);
	FindZeckendorf(1);
	}
	
    public static void FindZeckendorf(int input){
    	System.out.println(fibanocciSerires.toString());
    	int[] solution=new int[fibanocciSerires.size()];
    	int copyInput=input;
    	for(int j=fibanocciSerires.size()-1;j>=0;j--){
    		
    		
    			if((copyInput-fibanocciSerires.get(j))>=0){
    				solution[fibanocciSerires.indexOf(fibanocciSerires.get(j))]=1;
        			copyInput=	copyInput - fibanocciSerires.get(j);
        			
        			if((copyInput)==0){
        				for(int i:solution){
        					System.out.print(i);
        				}
        				System.out.print(1);
        				break;
        			}
    				}
    			}
    	}
    	
    
    
    
    public static void generateFibanocciSeries(int number){
    	
    	if(number==1){
    		fibanocciSerires.add(1);
    		return;
    	}
    	
    	int a=1;int b=2;int c;fibanocciSerires.add(1);
    	fibanocciSerires.add(2);
    	while((a+b)<=number){
    		c=a+b;
    		fibanocciSerires.add(c);
    		a=b;
    		b=c;
    	}
    }
	

}
