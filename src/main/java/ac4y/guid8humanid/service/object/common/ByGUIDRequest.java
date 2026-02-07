package ac4y.service.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ByGUIDRequest extends Ac4yServiceRequest {
	
	public ByGUIDRequest() {
		getAc4yIdentification().getTemplate().setGUID("ByGUIDRequest");
		//setAc4yIdentification(null);
	}

	public ByGUIDRequest(String aGUID) {
		this(); 
		setGUID(aGUID);
	}

	public String getGUID() {
		return GUID;
	}

	public void setGUID(String gUID) {
		GUID = gUID;
	}

	protected String GUID; 
	
}
