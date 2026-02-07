package ac4y.guid8humanid.service.object.get;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.guid8humanid.service.object.common.BySeparateHumanIdsRequest;

@XmlRootElement
public class IsExistByHumanIdsRequest extends BySeparateHumanIdsRequest {
	
	public IsExistByHumanIdsRequest() {
		getAc4yIdentification().getTemplate().setGUID("IsExistByHumanIdsRequest");
		setAc4yIdentification(null);
	}

	public IsExistByHumanIdsRequest(String aTemplateHumanID, String aHumanID) {
		super(aTemplateHumanID, aHumanID);
	}

}
