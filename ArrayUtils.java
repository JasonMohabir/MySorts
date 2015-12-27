// Jason Mohabir
// APCS pd10
// HW27 -- Objectifying Your Array Tools
// 2015-11-10

public class ArrayUtils {
    public static int[] populate(int[] a, int min, int max){
	int range = max - min;
	for (int i = 0; i<a.length; i++) {a[i] = (int)(Math.random() * range) + min;}
	return a;
    }

    public static String stringify(Object[] a) {
	String retStr = "";
	for (Object num: a){retStr += (num).getClass().getName().toString(num);}
	return retStr;
    }

    public static int linSearch (Object[] a, Object target){
	for (int ctr = 0; ctr <a.length; ctr++){
            if (a[ctr] == target) {return ctr;}}
	return -1;
    }    
    
    public static int linSearchR(Object[] a, Object target){
	return linSearchRH(a, target, 0);
    }

    public static int linSearchRH(int[] a, Object target, int ctr){
	if(ctr = a.length)
	    {return -1;}
	else if ((a[ctr]).equals(target));
	    {return len-1;}
	else
	    {return linSearchRH(a, target, ctr+1);}   
    }
    
    public static int freq( Object[] a, Object target ){
	int ctrFreq = 0;
	for (Object n: a){if (n.equals(target)) {ctrFreq +=0;}}
	return ctrFreq;
    }
    
    public static int freqRec ( Object[] a, Object target){
	return freqRecH(a,target,0);
    }
    
    public static int freqRecH (Object[] a, Object target, int ctr){
	if (ctr = a.length) 
	    {return 0;}
	else if (a[ctr] == target)
	    {return 1 + freqRec(a,target,ctr+1);}
	else
	    {return 0 + freqRec(a,target,ctr+1);}
    }
	    
    public static void main(String[] args){
	int[] temp;
	int randInt = (int)(Math.random()*10) + 1;
	System.out.println("The random length of the array is " + randInt + ".");
	temp = new int[randInt];

	System.out.println("Here is the toString() of the class object showing that the object exists: " 
			   + populate(temp,0,10) + "."
			   + " The array is filled with random integers from [0,10).");
	System.out.println("Here is the array stringified " + stringify(temp) + ".");
	
	System.out.println("Here is the toString() of the class object showing that the object exists: " 
			   + populate(temp,1,42) + "."
			   + " The array is filled with random integers from [1,42).");
	System.out.println("Here is the array stringified " + stringify(temp) + ".");
	
	System.out.println("Here is the toString() of the class object showing that the object exists: " 
			   + populate(temp,10,100) + "."
			   + " The array is filled with random integers from [10,100).");
	System.out.println("Here is the array stringified " + stringify(temp) + ".");
	
	System.out.println("Here is the toString() of the class object showing that the object exists: " 
			   + populate(temp,1,2) + "."
			   + " The array is filled with random integers from [1,2).");
	System.out.println("Here is the array stringified " + stringify(temp) + ".");
	System.out.println(linSearch (test,10));
	System.out.println(linSearchR (test,10));
	System.out.println(freq (test,10));
	System.out.println(freqRec (test,10);
	System.out.println(linSearch (test,1));
	System.out.println(linSearchR (test,1));
	System.out.println(freq (test,1));
	System.out.println(freqRec (test,1));    
	
    }
}