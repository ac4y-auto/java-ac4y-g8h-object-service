package ac4y.service.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PersistentIdResponse extends Ac4yServiceResponse {

	public PersistentIdResponse() {
		getAc4yIdentification().getTemplate().setGUID("PersistentIdResponse");
		//setAc4yIdentification(null);
	}

	protected int persistentId;

	public int getPersistentId() {
		return persistentId;
	}

	public void setPersistentId(int persistentId) {
		this.persistentId = persistentId;
	}

}
