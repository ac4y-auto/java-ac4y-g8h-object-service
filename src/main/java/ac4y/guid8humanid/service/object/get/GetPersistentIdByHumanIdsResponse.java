package ac4y.guid8humanid.service.object.get;

import ac4y.service.domain.PersistentIdResponse;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class GetPersistentIdByHumanIdsResponse extends PersistentIdResponse {

	public GetPersistentIdByHumanIdsResponse() {
		getAc4yIdentification().getTemplate().setGUID("GetPersistentIdByHumanIdsResponse");
		setAc4yIdentification(null);
	}

}
