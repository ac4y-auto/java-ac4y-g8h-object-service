package ac4y.guid8humanid.service.object.common;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.service.domain.Ac4yServiceRequest;

@XmlRootElement
public class ByHumanIdRequest extends Ac4yServiceRequest {
	
	public ByHumanIdRequest() {
		getAc4yIdentification().getTemplate().setGUID("ByHumanIdRequest");
		//setAc4yIdentification(null);
	}

	public ByHumanIdRequest(String aHumanId) {
		this(); 
		setHumanId(aHumanId);
	}

	protected String humanID;

	public String getHumanId() {
		return humanID;
	}

	public void setHumanId(String humanID) {
		this.humanID = humanID;
	}

}
