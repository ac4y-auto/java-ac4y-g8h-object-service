package ac4y.guid8humanid.service.object.get;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.service.domain.Ac4yServiceResponse;

@XmlRootElement
public class GetTemplateGUIDResponse extends Ac4yServiceResponse {

	public GetTemplateGUIDResponse() {
		getAc4yIdentification().getTemplate().setGUID("GetTemplateGUIDResponse");
		setAc4yIdentification(null);
	}

	protected String GUID;

	public String getGUID() {
		return GUID;
	}

	public void setGUID(String GUID) {
		this.GUID = GUID;
	}

}
