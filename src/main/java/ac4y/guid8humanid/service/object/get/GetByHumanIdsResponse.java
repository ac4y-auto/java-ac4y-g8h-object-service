package ac4y.guid8humanid.service.object.get;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.guid8humanid.service.object.common.Ac4yG8HResponse;

@XmlRootElement
public class GetByHumanIdsResponse extends Ac4yG8HResponse {

	public GetByHumanIdsResponse() {
		getAc4yIdentification().getTemplate().setGUID("GetByHumanIdsResponse");
		setAc4yIdentification(null);
	}

}
