package project_KeyValue;

import org.json.JSONException;
import org.json.JSONObject;

public class MainData {
	public static void main(String[] args) throws JSONException  {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("firstName", "Harini");
		jsonObject.put("collegeName", "SKCET");
		jsonObject.put("degree", "B.E");
		
		//Create Opreation
		System.out.println("CREATE"); 
		PrimaryData Datas = new PrimaryData(
				"C:\\Users\\HARINI\\DataStore.txt");
		System.out.println(Datas.create("9", jsonObject, 55));//Success
		System.out.println(Datas.create("9", jsonObject, 55));//Failure
		System.out.println(Datas.create("9", jsonObject));//Failure
		System.out.println(Datas.create("KeyNameValidationfailedsincethelengthexceeded32character", new JSONObject()));//Failure
		try {
			Thread.sleep(5000);
		} 
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("AFTER WAIT"); //After sleep time
		jsonObject.put("pincode", "600125");
		System.out.println(Datas.create("9", jsonObject, 55));//Success
		System.out.println(Datas.create("9", jsonObject));//Failure
		System.out.println(Datas.create("9", jsonObject, 55));//Failure
		
		//Read Operation
		System.out.println("READ"); 
		System.out.println(Datas.read("10"));//Success
		System.out.println(Datas.read("9"));//Success
		System.out.println(Datas.read("8"));//Failure
		System.out.println(Datas.read("KeyNameValidationfailedsincethelengthexceeded32characte"));//Failure
		try {
			Thread.sleep(5000);
		} 
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("AFTER WAIT"); //After sleep time
		System.out.println(Datas.read("10"));//Failure
		System.out.println(Datas.read("9"));//Success
	
		//Delete Operation
		System.out.println("DELETE");
		System.out.println(Datas.delete("10"));//Failure
		System.out.println(Datas.delete("9"));//Success
		System.out.println(Datas.delete("9"));//Failure
		System.out.println(Datas.delete("8"));//Failure
		System.out.println(Datas.delete("KeyNameValidationfailedsincethelengthexceeded32characte"));//Failure
	}
}
