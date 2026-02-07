package ac4y.guid8humanid.service.object.get;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.service.domain.ByGUIDRequest;

@XmlRootElement
public class IsExistByGUIDRequest extends ByGUIDRequest {
	
	public IsExistByGUIDRequest() {
		getAc4yIdentification().getTemplate().setGUID("IsExistsByGUIDRequest");
		//setAc4yIdentification(null);
	}

	public IsExistByGUIDRequest(String aGUID) {
		super(aGUID);
	}
}
