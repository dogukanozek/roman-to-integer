
public class Main {

	public static void main(String[] args) {
		System.out.print(romanToInt("MCMXCIV"));
       
	}
	public static int romanToInt(String s) {
		int a=0;
		char z='k',y='c';
		char []x=s.toCharArray();
		for(int i=0;i<x.length;i++) {
		
			y=z;
			z=x[i];
        	if((y=='C') && (z=='M')) {
        		a+=900;
        		a-=100;
        	}
        	else if	((y=='C') && (z=='D')) {
        		a+=400;
        		a-=100;
        	}
        	else if	((y=='X') && (z=='C')) {
        		a+=90;
        		a-=10;
        	}
        	else if	((y=='X') && (z=='L')) {
        		a+=40;
        		a-=10;
        	}
        	else if	((y=='I') && (z=='X')) {
        		a+=9;
        		a-=1;
        	}
        	else if	((y=='I') && (z=='V')) {
        		a+=4;
        		a-=1;
        	}	
        	else {
        		
        		if(z=='I') {
    				a+=1;
    			}
    			if(z=='V') {
    				a+=5;
    			}
    			if(z=='X') {
    				a+=10;
    			}
    			if(z=='L') {
    				a+=50;
    			}
    			if(z=='C') {
    				a+=100;
    			}
    			if(z=='D') {
    				a+=500;
    			}
    			if(z=='M') {
    				a+=1000;
    			}
        	}
            
            
			
			
		}
        return a;
        
    }
	
	

}
