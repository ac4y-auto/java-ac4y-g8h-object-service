package ac4y.guid8humanid.service.object.get;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.guid8humanid.service.object.common.BySeparateHumanIdsRequest;

@XmlRootElement
public class GetPersistentIdByHumanIdsRequest extends BySeparateHumanIdsRequest {
	
	public GetPersistentIdByHumanIdsRequest() {
		getAc4yIdentification().getTemplate().setGUID("GetPersistentIdByHumanIdsRequest");
		//setAc4yIdentification(null);
	}

	public GetPersistentIdByHumanIdsRequest(String aTemplateHumanId, String aHumanId) {
		super(aTemplateHumanId, aHumanId);
	}

}
