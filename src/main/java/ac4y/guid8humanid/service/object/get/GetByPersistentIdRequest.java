package ac4y.guid8humanid.service.object.get;

import ac4y.guid8humanid.service.object.common.ByPersistentIdRequest;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class GetByPersistentIdRequest extends ByPersistentIdRequest {
	
	public GetByPersistentIdRequest() {
		getAc4yIdentification().getTemplate().setGUID("GetByPersistentIdRequest");
		//setAc4yIdentification(null);
	}

	public GetByPersistentIdRequest(int aPersistentID) {
		super(aPersistentID);
	}
}
