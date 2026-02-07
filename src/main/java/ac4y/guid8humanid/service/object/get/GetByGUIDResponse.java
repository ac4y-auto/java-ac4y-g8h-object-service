package ac4y.guid8humanid.service.object.get;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.guid8humanid.service.object.common.Ac4yG8HResponse;

@XmlRootElement
public class GetByGUIDResponse extends Ac4yG8HResponse {

	public GetByGUIDResponse() {
		getAc4yIdentification().getTemplate().setGUID("GetByGUIDResponse");
		setAc4yIdentification(null);
	}

}
