package ac4y.guid8humanid.service.object.get;

import ac4y.guid8humanid.service.object.common.ByPersistentIdRequest;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class IsExistByPersistentIdRequest extends ByPersistentIdRequest {
	
	public IsExistByPersistentIdRequest() {
		getAc4yIdentification().getTemplate().setGUID("IsExistByPersistentIdRequest");
		//setAc4yIdentification(null);
	}

	public IsExistByPersistentIdRequest(int aPersistentId) {
		super(aPersistentId); 
	}
}
