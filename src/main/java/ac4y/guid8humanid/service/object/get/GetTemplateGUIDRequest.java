package ac4y.guid8humanid.service.object.get;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.guid8humanid.service.object.common.ByHumanIdRequest;

@XmlRootElement
public class GetTemplateGUIDRequest extends ByHumanIdRequest {
	
	public GetTemplateGUIDRequest() {
		getAc4yIdentification().getTemplate().setGUID("GetTemplateGUIDRequest");
		setAc4yIdentification(null);
	}

	public GetTemplateGUIDRequest(String aHumanId) {
		super(aHumanId);
	}
}
