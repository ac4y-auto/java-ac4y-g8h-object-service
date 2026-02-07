package ac4y.guid8humanid.service.object.get;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.guid8humanid.domain.object.Ac4yG8HList;
import ac4y.service.domain.Ac4yServiceResponse;

@XmlRootElement
public class GetInstanceListResponse extends Ac4yServiceResponse {

	public GetInstanceListResponse() {
		getAc4yIdentification().getTemplate().setGUID("GetInstanceListResponse");
		setAc4yIdentification(null);
	}

	protected Ac4yG8HList ac4yG8HList;

	public Ac4yG8HList getAc4yG8HList() {
		return ac4yG8HList;
	}

	public void setAc4yG8HList(Ac4yG8HList ac4yG8HList) {
		this.ac4yG8HList = ac4yG8HList;
	}

}
