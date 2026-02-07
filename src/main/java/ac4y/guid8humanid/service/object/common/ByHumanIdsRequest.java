package ac4y.guid8humanid.service.object.common;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.service.domain.Ac4yServiceRequest;

@XmlRootElement
public class ByHumanIdsRequest extends Ac4yServiceRequest {
	
	public ByHumanIdsRequest() {
		getAc4yIdentification().getTemplate().setGUID("ByHumanIdsRequest");
		//setAc4yIdentification(null);
	}

	public ByHumanIdsRequest(HumanIds humanIDs) {
		this(); 
		setHumanIDs(humanIDs);
	}

	protected HumanIds humanIDs;

	public HumanIds getHumanIDs() {
		return humanIDs;
	}

	public void setHumanIDs(HumanIds humanIDs) {
		this.humanIDs = humanIDs;
	}
	
}
