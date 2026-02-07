package ac4y.guid8humanid.service.object.common;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.service.domain.Ac4yServiceRequest;

@XmlRootElement
public class ByPersistentIdRequest extends Ac4yServiceRequest {
	
	public ByPersistentIdRequest() {
		getAc4yIdentification().getTemplate().setGUID("ByPersistentIdRequest");
		//setAc4yIdentification(null);
	}

	public ByPersistentIdRequest(int aPersistentId) {
		this(); 
		setPersistentId(aPersistentId);
	}

	public int getPersistentId() {
		return persistentId;
	}

	public void setPersistentId(int persistentID) {
		this.persistentId = persistentId;
	}

	protected int persistentId;

}
