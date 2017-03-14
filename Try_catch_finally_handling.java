package Try_Catch_Finally;

public class Try {

	public static void main(String[] args){
		try{
			System.out.println("program starts here");
			int result = 1/0;
			System.out.println("result is"+result);
		}
		catch(Exception object ){
			object.printStackTrace();
		}
		finally{
			System.out.println("program ends here");
		}
		
	}

}
