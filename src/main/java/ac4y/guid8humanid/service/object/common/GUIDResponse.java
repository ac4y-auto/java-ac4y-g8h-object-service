package ac4y.service.domain;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class GUIDResponse extends Ac4yServiceResponse {

	public GUIDResponse() {
		getAc4yIdentification().getTemplate().setGUID("GUIDResponse");
		//setAc4yIdentification(null);
	}
/*
	protected String GUID;

	public String getGUID() {
		return GUID;
	}

	public void setGUID(String GUID) {
		this.GUID = GUID;
	}
*/
}
