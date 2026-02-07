package ac4y.guid8humanid.service.object.get;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.service.domain.Ac4yServiceRequest;

@XmlRootElement
public class GetByHumanIdRequest extends Ac4yServiceRequest {
	
	public GetByHumanIdRequest() {
		getAc4yIdentification().getTemplate().setGUID("GetByHumanIdRequest");
		//setAc4yIdentification(null);
	}

	public GetByHumanIdRequest(String aHumanID) {
		this(); 
		setHumanID(aHumanID);
	}

	public String getHumanID() {
		return humanID;
	}

	public void setHumanID(String humanID) {
		this.humanID = humanID;
	}

	protected String humanID;
	
}
