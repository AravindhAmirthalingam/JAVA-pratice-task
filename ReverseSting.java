public class ReverseString {

	public static void main(String[] args) {
		
        String s1="How are you all";
        System.out.println(s1);
        String sarray[]=s1.split("");
        for (int i=sarray.length-1;i>=0;i--) {
        	System.out.print(sarray[i]+"");
        }
	}

}
