package ac4y.guid8humanid.service.object.set;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.guid8humanid.domain.object.Ac4yG8H;
import ac4y.service.domain.Ac4yServiceResponse;

@XmlRootElement
public class SetTemplateByHumanIdResponse extends Ac4yServiceResponse {

	public SetTemplateByHumanIdResponse() {
		getAc4yIdentification().getTemplate().setGUID("SetTemplateByHumanIdResponse");
		setAc4yIdentification(null);
	}

	protected Ac4yG8H ac4yG8H;

	public Ac4yG8H getAc4yG8H() {
		return ac4yG8H;
	}

	public void setAc4yG8H(Ac4yG8H ac4yG8H) {
		this.ac4yG8H = ac4yG8H;
	}
	
}
