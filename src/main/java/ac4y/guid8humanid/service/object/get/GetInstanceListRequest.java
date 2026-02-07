package ac4y.guid8humanid.service.object.get;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.service.domain.ByGUIDRequest;

@XmlRootElement
public class GetInstanceListRequest extends ByGUIDRequest {
	
	public GetInstanceListRequest() {
		getAc4yIdentification().getTemplate().setGUID("GetInstanceListRequest");
		setAc4yIdentification(null);
	}

	public GetInstanceListRequest(String aTemplate) {
		super(aTemplate);
	}

}
