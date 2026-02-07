package ac4y.guid8humanid.service.object.get;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.service.domain.Ac4yServiceResponse;

@XmlRootElement
public class IsExistByGUIDResponse extends Ac4yServiceResponse {

	public IsExistByGUIDResponse() {
		getAc4yIdentification().getTemplate().setGUID("IsExistByGUIDResponse");
		setAc4yIdentification(null);
	}

}
