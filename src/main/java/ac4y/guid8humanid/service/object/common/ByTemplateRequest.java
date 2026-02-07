package ac4y.guid8humanid.service.object.common;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.service.domain.Ac4yServiceRequest;

@XmlRootElement
public class ByTemplateRequest extends Ac4yServiceRequest {
	
	public ByTemplateRequest() {
		getAc4yIdentification().getTemplate().setGUID("ByTemplateRequest");
		//setAc4yIdentification(null);
	}

	public ByTemplateRequest(String aTemplate) {
		this(); 
		setTemplate(aTemplate);
	}

	protected String template;

	public String getTemplate() {
		return template;
	}

	public void setTemplate(String template) {
		this.template = template;
	} 
	
}
