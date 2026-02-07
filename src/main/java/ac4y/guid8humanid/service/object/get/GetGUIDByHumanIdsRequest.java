package ac4y.guid8humanid.service.object.get;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.guid8humanid.service.object.common.BySeparateHumanIdsRequest;

@XmlRootElement
public class GetGUIDByHumanIdsRequest extends BySeparateHumanIdsRequest {
	
	public GetGUIDByHumanIdsRequest() {
		getAc4yIdentification().getTemplate().setGUID("GetGUIDByHumanIdsRequest");
		//setAc4yIdentification(null);
	}

	public GetGUIDByHumanIdsRequest(String aTemplateHumanID, String aHumanID) {
		super(aTemplateHumanID, aHumanID);
	}

}
