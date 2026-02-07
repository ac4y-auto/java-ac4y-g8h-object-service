package ac4y.guid8humanid.service.object.common;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.guid8humanid.domain.object.Ac4yG8H;
import ac4y.service.domain.Ac4yServiceResponse;

@XmlRootElement
public class Ac4yG8HResponse extends Ac4yServiceResponse {

	public Ac4yG8HResponse() {
		getAc4yIdentification().getTemplate().setGUID("Ac4yG8HResponse");
		//setAc4yIdentification(null);
	}

	protected Ac4yG8H ac4yG8H;

	public Ac4yG8H getAc4yG8H() {
		return ac4yG8H;
	}

	public void setAc4yG8H(Ac4yG8H ac4yG8H) {
		this.ac4yG8H = ac4yG8H;
	}

}