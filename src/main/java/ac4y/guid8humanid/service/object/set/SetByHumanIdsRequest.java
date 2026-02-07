package ac4y.guid8humanid.service.object.set;

import javax.xml.bind.annotation.XmlRootElement;


import ac4y.service.domain.Ac4yServiceRequest;

@XmlRootElement
public class SetByHumanIdsRequest extends Ac4yServiceRequest {
	
	public SetByHumanIdsRequest() {
		getAc4yIdentification().getTemplate().setGUID("SetByHumanIdsRequest");
		//setAc4yIdentification(null);
	}

	public SetByHumanIdsRequest(String aTemplateHumanId, String aHumanId) {
		this(); 
		setTemplateHumanId(aTemplateHumanId);
		setHumanId(aHumanId);
	}

	protected String templateHumanId; 
	
	public String getTemplateHumanId() {
		return templateHumanId;
	}

	public void setTemplateHumanId(String templateHumanId) {
		this.templateHumanId = templateHumanId;
	}

	public String getHumanId() {
		return humanId;
	}

	public void setHumanId(String humanId) {
		this.humanId = humanId;
	}

	protected String humanId;
	
}
