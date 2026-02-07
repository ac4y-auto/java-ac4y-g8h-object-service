package ac4y.guid8humanid.service.object.get;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.service.domain.Ac4yServiceRequest;

@XmlRootElement
public class GetGUIDListRequest extends Ac4yServiceRequest {
	
	public GetGUIDListRequest() {
		getAc4yIdentification().getTemplate().setGUID("GetGUIDListRequest");
		setAc4yIdentification(null);
	}

	public GetGUIDListRequest(String aWhere) {
		this(); 
		setWhere(aWhere);
	}

	protected String where;

	public String getWhere() {
		return where;
	}

	public void setWhere(String where) {
		this.where = where;
	} 
	
}
