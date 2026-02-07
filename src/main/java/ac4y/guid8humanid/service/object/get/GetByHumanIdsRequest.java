package ac4y.guid8humanid.service.object.get;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.service.domain.Ac4yServiceRequest;

@XmlRootElement
public class GetByHumanIdsRequest extends Ac4yServiceRequest {
	
	public GetByHumanIdsRequest() {
		getAc4yIdentification().getTemplate().setGUID("GetByHumanIdsRequest");
		setAc4yIdentification(null);
	}

	public GetByHumanIdsRequest(String aTemplateHumanId, String aHumanId) {
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
		return humanID;
	}

	public void setHumanId(String humanID) {
		this.humanID = humanID;
	}

	protected String humanID;
	
}
