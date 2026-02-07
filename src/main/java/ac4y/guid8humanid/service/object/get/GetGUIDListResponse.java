package ac4y.guid8humanid.service.object.get;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.guid8humanid.domain.object.Ac4yGUIDList;
import ac4y.service.domain.Ac4yServiceResponse;

@XmlRootElement
public class GetGUIDListResponse extends Ac4yServiceResponse {

	public GetGUIDListResponse() {
		getAc4yIdentification().getTemplate().setGUID("GetGUIDListResponse");
		setAc4yIdentification(null);
	}

	protected Ac4yGUIDList ac4yGUIDList;

	public Ac4yGUIDList getAc4yGUIDList() {
		return ac4yGUIDList;
	}

	public void setAc4yGUIDList(Ac4yGUIDList ac4yGUIDList) {
		this.ac4yGUIDList = ac4yGUIDList;
	}

}
