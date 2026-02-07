package ac4y.guid8humanid.service.object.get;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.service.domain.Ac4yServiceResponse;

@XmlRootElement
public class IsExistByHumanIdsResponse extends Ac4yServiceResponse {

	public IsExistByHumanIdsResponse() {
		getAc4yIdentification().getTemplate().setGUID("IsExistByHumanIdsResponse");
		//setAc4yIdentification(null);
	}

}
