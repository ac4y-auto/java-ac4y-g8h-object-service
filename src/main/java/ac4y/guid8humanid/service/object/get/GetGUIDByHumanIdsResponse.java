package ac4y.guid8humanid.service.object.get;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.service.domain.GUIDResponse;

@XmlRootElement
public class GetGUIDByHumanIdsResponse extends GUIDResponse {

	public GetGUIDByHumanIdsResponse() {
		getAc4yIdentification().getTemplate().setGUID("GetGUIDByHumanIdsResponse");
		setAc4yIdentification(null);
	}

}
