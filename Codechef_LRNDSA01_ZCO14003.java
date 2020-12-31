/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef_LRNDSA01_ZCO14003
{
    static PrintWriter out=new PrintWriter((System.out));
    public static void main(String args[])throws IOException
    {
        Reader sc=new Reader();
        int t=sc.nextInt();

        ArrayList<Long> tree = new ArrayList<Long>();
        while(t-->0)
        {
        	tree.add(sc.nextLong());
        }
        Collections.sort(tree);
        long max = 0;
        for(int i = 0; i<tree.size();i++) {
        	long curr = (tree.size()-i)*tree.get(i);
        	if(curr>max) {
        		max = curr;
        	}
        }
        out.println(max);
        
	out.close();
    }
    
    private static boolean isLapindrome(String lapInp) {
		
    	int len = lapInp.length();
    	
    	HashMap<Character, Integer> frqMap = new HashMap<Character, Integer>();
    	for(int i =0,j=len-1; i<j;i++,j--) {
    		char left = lapInp.charAt(i);
    		char right = lapInp.charAt(j);
    		if(frqMap.containsKey(left)) {
    			frqMap.put(left, frqMap.get(left)+1);
    		}else {
    			frqMap.put(left,1);
    		}

    		if(frqMap.containsKey(right)) {
    			frqMap.put(right, frqMap.get(right)-1);
    		}else {
    			frqMap.put(right,-1);
    		}
    	}

    	for(int value: frqMap.values()) {
    		if(value!=0) {
    			return false;
    		}
    	}
    	
		return true;
	}

	static class Reader 
    { 
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer("");
        public String next()
        {
            while(!st.hasMoreTokens())
            {
                try
                {
                    st=new StringTokenizer(br.readLine());
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        public int nextInt()
        {
            return Integer.parseInt(next());
        }
        public long nextLong()
        {
            return Long.parseLong(next());
        }
        public double nextDouble()
        {
            return Double.parseDouble(next());
        }
        public String nextLine()
        {
            try
            {
                return br.readLine();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
            return null;
        }
        public boolean hasNext()
        {
            String next=null;
            try
            {
                next=br.readLine();
            }
            catch(Exception e)
            {
            }
            if(next==null)
            {
                return false;
            }
            st=new StringTokenizer(next);
            return true;
        }
    } 
}
