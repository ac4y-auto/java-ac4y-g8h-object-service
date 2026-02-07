package ac4y.guid8humanid.service.object.get;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.service.domain.ByGUIDRequest;

@XmlRootElement
public class GetByGUIDRequest extends ByGUIDRequest {
	
	public GetByGUIDRequest() {
		getAc4yIdentification().getTemplate().setGUID("GetByGUIDRequest");
		//setAc4yIdentification(null);
	}

	public GetByGUIDRequest(String aGUID) {
		super(aGUID);
	}
}
