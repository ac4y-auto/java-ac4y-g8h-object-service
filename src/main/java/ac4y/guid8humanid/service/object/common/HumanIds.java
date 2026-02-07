package ac4y.guid8humanid.service.object.common;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.base.domain.Ac4yNoId;

@XmlRootElement
public class HumanIds extends Ac4yNoId {
	
	public HumanIds() {
	}

	public HumanIds(String aTemplateHumanID, String aHumanID) {
		this(); 
		setTemplateHumanID(aTemplateHumanID);
		setHumanID(aHumanID);
	}

	protected String templateHumanID; 
	
	public String getTemplateHumanID() {
		return templateHumanID;
	}

	public void setTemplateHumanID(String templateHumanID) {
		this.templateHumanID = templateHumanID;
	}

	public String getHumanID() {
		return humanID;
	}

	public void setHumanID(String humanID) {
		this.humanID = humanID;
	}

	protected String humanID;
	
}