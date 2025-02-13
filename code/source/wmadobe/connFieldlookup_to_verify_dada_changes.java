package wmadobe;

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
import java.util.ArrayList;
import java.util.List;
import com.softwareag.util.IDataMap;
// --- <<IS-END-IMPORTS>> ---

public final class connFieldlookup_to_verify_dada_changes

{
	// ---( internal utility methods )---

	final static connFieldlookup_to_verify_dada_changes _instance = new connFieldlookup_to_verify_dada_changes();

	static connFieldlookup_to_verify_dada_changes _newInstance() { return new connFieldlookup_to_verify_dada_changes(); }

	static connFieldlookup_to_verify_dada_changes _cast(Object o) { return (connFieldlookup_to_verify_dada_changes)o; }

	// ---( server methods )---




	public static final void fieldlookup (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(fieldlookup)>> ---
		// @sigtype java 3.5
		// [i] record:0:required connectionGroupProperties
		// [i] - field:0:required oauth_v20.iss
		// [i] - field:0:required oauth_v20.sub
		// [i] - field:0:required oauth.accessToken
		// [i] - field:0:required jwt.cx.clientId
		// [i] - field:0:required jwt.cx.clientSecret
		// [o] record:1:required values
		// [o] - field:0:required name
		// [o] - field:0:required displayName
		// [o] - field:0:required description
		// [o] field:0:optional error
		if(pipeline == null) {
			pipeline =	IDataFactory.create();
			ValuesEmulator.put(pipeline, "error", "No input provided.");
		}
		
		if(ValuesEmulator.size(pipeline) <=0) {
			ValuesEmulator.put(pipeline, "error", "No input provided.");
		}
		IData connectionGroupProperties = IDataUtil.getIData(pipeline.getCursor(), "connectionGroupProperties");
		
		if(connectionGroupProperties == null || ValuesEmulator.size(connectionGroupProperties) <=0) {
					ValuesEmulator.put(pipeline, "error", "No input provided.");
		}
				
		IDataMap map = new IDataMap(connectionGroupProperties);
		String iss  = map.getAsString("oauth_v20.iss");
		String sub  = map.getAsString("oauth_v20.sub");
		String accessToken  = map.getAsString("oauth.accessToken");
		String clientId  = map.getAsString("jwt.cx.clientId");
		String clientSecret  = map.getAsString("jwt.cx.clientSecret");
		
		System.out.println(accessToken);
		
		System.out.println(clientId);
		
		System.out.println(clientSecret);
		/*
		 * if(!"iss".equals(iss)) { ValuesEmulator.put(pipeline, "error",
		 * "Please check the value provided for iss. Expected value is \"iss\"");
		 * return; }
		 * 
		 * if(!"sub".equals(sub)) { ValuesEmulator.put(pipeline, "error",
		 * "Please check the value provided for sub. Expected value is \"sub\"");
		 * return; }
		 */
		if(!"accessToken".equals(accessToken)) {
			ValuesEmulator.put(pipeline, "error", "Please check the value provided for accessToken. Expected value is \"accessToken\"");
			return; 
		}
		
		if(!"clientId".equals(clientId)) {
			ValuesEmulator.put(pipeline, "error", "Please check the value provided for clientId. Expected value is \"clientId\"");
			return; 
		}
		
		if(!"clientSecret".equals(clientSecret)) {
			ValuesEmulator.put(pipeline, "error", "Please check the value provided for iss. Expected value is \"clientSecret\"");
			return; 
		}
		
		List<IData> list = new ArrayList<>(); 
		list.add(getValue(1));
		list.add(getValue(2));
		list.add(getValue(3));
		list.add(getValue(4));
		
		ValuesEmulator.put(pipeline, "values", list.toArray(new IData[0]));
		// --- <<IS-END>> ---

                
	}

	// --- <<IS-START-SHARED>> ---
	public static IData getValue(int index) {
		IDataMap valueMap = new IDataMap();
		valueMap.put("name", "sandbox" + index);
		valueMap.put("displayName", "Sandbox " + index);
		valueMap.put("description", "Test sandbox " + index);
		return valueMap.getIData();
	}
	// --- <<IS-END-SHARED>> ---
}

