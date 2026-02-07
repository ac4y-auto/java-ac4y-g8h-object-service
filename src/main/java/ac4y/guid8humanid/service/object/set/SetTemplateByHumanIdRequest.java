package ac4y.guid8humanid.service.object.set;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.service.domain.Ac4yServiceRequest;

@XmlRootElement
public class SetTemplateByHumanIdRequest extends Ac4yServiceRequest {
	
	public SetTemplateByHumanIdRequest() {
		getAc4yIdentification().getTemplate().setGUID("SetTemplateByHumanIdRequest");
		//setAc4yIdentification(null);
	}

	public SetTemplateByHumanIdRequest(String aHumanId) {
		this(); 
		setHumanId(aHumanId);
	}

	public String getHumanId() {
		return humanId;
	}

	public void setHumanId(String humanId) {
		this.humanId = humanId;
	}

	protected String humanId;
	
}
