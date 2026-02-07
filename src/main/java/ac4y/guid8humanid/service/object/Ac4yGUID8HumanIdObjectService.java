package ac4y.guid8humanid.service.object;

import java.util.Date;

import ac4y.base.Ac4yException;
import ac4y.guid8humanid.service.Ac4yGUID8HumanIdService;
import ac4y.guid8humanid.service.object.get.*;
import ac4y.guid8humanid.service.object.get.GetPersistentIdByHumanIdsRequest;
import ac4y.guid8humanid.service.object.set.SetByHumanIdsRequest;
import ac4y.guid8humanid.service.object.set.SetByHumanIdsResponse;
import ac4y.guid8humanid.service.object.set.SetTemplateByHumanIdRequest;
import ac4y.guid8humanid.service.object.set.SetTemplateByHumanIdResponse;
import ac4y.log.service.object.domain.Ac4yLogObjectService;
import ac4y.log.service.object.domain.InsertRequest;
import ac4y.log.service.persistence.Ac4yLogService;
import ac4y.service.domain.Ac4yProcessResult;

import javax.xml.bind.JAXBException;

public class Ac4yGUID8HumanIdObjectService {
	
	final String LOGCLASS = "Ac4yGUID8HumanIdObjectService";
	
	public SetByHumanIdsResponse setByHumanIds(SetByHumanIdsRequest request) throws JAXBException {

		final String MODULE = "setByHumanIds";
		
		SetByHumanIdsResponse response = new SetByHumanIdsResponse();

		try {

			if (request == null)
				throw new Ac4yException("request is missing!");
/*
			new Ac4yLogService().insert(
					LOGCLASS
					,MODULE
					,"begin"
					,request.getAsXml()
					,null
					,((request==null)||(request.getAc4yIdentification()==null)) ? "n/a" : request.getAc4yIdentification().getGUID()
					,new Date()
			);
*/
			if ((request.getTemplateHumanId() == null) || (request.getTemplateHumanId().equals("")))
				throw new Ac4yException("templateHumanId is empty!");

			if ((request.getHumanId() == null) || (request.getHumanId().equals("")))
				throw new Ac4yException("humanId is empty!");

			response.setAc4yG8H(
				new Ac4yGUID8HumanIdService().setByHumanIds(
					request.getTemplateHumanId()
					,request.getHumanId()
				)
			);

			response.setResult(new Ac4yProcessResult(1, "ok", null));

		} catch (Exception e) {
		
			response.setResult(new Ac4yProcessResult(-1, e.getLocalizedMessage(), new Ac4yException().getStackTraceAsString(e)));
/*
			new Ac4yLogObjectService().insert(
					new InsertRequest(
							LOGCLASS
							,MODULE
							,"fault"
							,new Ac4yException().getStackTraceAsString(e)
							,null
							,((request==null)||(request.getAc4yIdentification()==null)) ? "n/a" : request.getAc4yIdentification().getGUID()
							,new Date()
					)
			);
*/
		}
/*
		new Ac4yLogObjectService().insert(
				new InsertRequest(
						LOGCLASS
						,MODULE
						,"end"
						,response.getAsXml()
						,null
						,((request==null)||(request.getAc4yIdentification()==null)) ? "n/a" : request.getAc4yIdentification().getGUID()
						,new Date()
				)
		);
		*/
		return response;
		
	} // setByHumanIds
		
	public SetTemplateByHumanIdResponse setTemplateByHumanId(SetTemplateByHumanIdRequest request) throws JAXBException {

		final String MODULE = "setTemplateByHumanId";
		
		SetTemplateByHumanIdResponse response = new SetTemplateByHumanIdResponse();

		try {
			
			if (request == null)
				throw new Ac4yException("request is missing!");

			new Ac4yLogService().insert(
					LOGCLASS
					,MODULE
					,"begin"
					,request.getAsXml()
					,null
					,((request==null)||(request.getAc4yIdentification()==null)) ? "n/a" : request.getAc4yIdentification().getGUID()
					,new Date()
			);
			
			if ((request.getHumanId() == null) || (request.getHumanId() == ""))
				throw new Ac4yException("humanId is empty!");

			response.setAc4yG8H(
				new Ac4yGUID8HumanIdService().setTemplateByHumanId(
					request.getHumanId()
				)
			);

			response.setResult(new Ac4yProcessResult(1, "ok", null));

		} catch (Ac4yException e) {
			
			response.setResult(new Ac4yProcessResult(-1, e.getLocalizedMessage(), null));
			
		} catch (Exception e) {
			
			response.setResult(new Ac4yProcessResult(-1, e.getLocalizedMessage(), new Ac4yException().getStackTraceAsString(e)));
			
			new Ac4yLogObjectService().insert(
					new InsertRequest(
							LOGCLASS
							,MODULE
							,"fault"
							,new Ac4yException().getStackTraceAsString(e)
							,null
							,((request==null)||(request.getAc4yIdentification()==null)) ? "n/a" : request.getAc4yIdentification().getGUID()
							,new Date()
					)
			);

		}

		new Ac4yLogObjectService().insert(
				new InsertRequest(
						LOGCLASS
						,MODULE
						,"end"
						,response.getAsXml()
						,null
						,((request==null)||(request.getAc4yIdentification()==null)) ? "n/a" : request.getAc4yIdentification().getGUID()
						,new Date()
				)
		);
		
		return response;
		
	} // setTemplateByHumanId
	
	public GetPersistentIdByHumanIdsResponse getPersistentIdByHumanIds(GetPersistentIdByHumanIdsRequest request) {

		GetPersistentIdByHumanIdsResponse response = new GetPersistentIdByHumanIdsResponse();

		try {

			if (request == null)
				throw new Ac4yException("request is missing!");

			if ((request.getTemplateHumanId() == null) || (request.getTemplateHumanId() == ""))
				throw new Ac4yException("templateHumanId is empty!");

			if ((request.getHumanId() == null) || (request.getHumanId() == ""))
				throw new Ac4yException("humanId is empty!");

			String GUID =
				new Ac4yGUID8HumanIdService().getGUIDByHumanIds(
						request.getTemplateHumanId()
						,request.getHumanId()
				);
						
			if (GUID == null) {
				
				response.setPersistentId(-1);
				throw new Ac4yException("such object does not exist!");
				
			}
				
			response.setPersistentId(
				new Ac4yGUID8HumanIdService().getPersistentIdByHumanIds(
						request.getTemplateHumanId()
						,request.getHumanId()
				)
			);
			
			if (response.getPersistentId() == 0)
				response.setResult(new Ac4yProcessResult(0, "does not exist", null));
			else
				response.setResult(new Ac4yProcessResult(1, "ok", null));

		} catch (Ac4yException e) {
			
			response.setResult(new Ac4yProcessResult(-1, e.getLocalizedMessage(), null));
			
		} catch (Exception e) {
			
			response.setResult(new Ac4yProcessResult(-1, e.getLocalizedMessage(), new Ac4yException().getStackTraceAsString(e)));
			
		}

		return response;
		
	} // getPersistentIdByHumanIds
	
	public GetGUIDByHumanIdsResponse getGUIDByHumanIds(GetGUIDByHumanIdsRequest request) {

		GetGUIDByHumanIdsResponse response = new GetGUIDByHumanIdsResponse();

		try {

			if (request == null)
				throw new Ac4yException("request is missing!");

			if ((request.getTemplateHumanId() == null) || (request.getTemplateHumanId() == ""))
				throw new Ac4yException("templateHumanId is empty!");

			if ((request.getHumanId() == null) || (request.getHumanId() == ""))
				throw new Ac4yException("humanId is empty!");

			response.setGUID(
						new Ac4yGUID8HumanIdService().getGUIDByHumanIds(
							request.getTemplateHumanId()
							,request.getHumanId()
						)
					);

			if (response.getGUID() == null)
				response.setResult(new Ac4yProcessResult(0, "does not exist", null));
			else
				response.setResult(new Ac4yProcessResult(1, "ok", null));

		} catch (Ac4yException e) {
			
			response.setResult(new Ac4yProcessResult(-1, e.getLocalizedMessage(), null));
			
		} catch (Exception e) {
			
			response.setResult(new Ac4yProcessResult(-1, e.getLocalizedMessage(), new Ac4yException().getStackTraceAsString(e)));
			
		}

		return response;
		
	} // getGUIDByHumanIds
	
	public GetTemplateGUIDResponse getTemplateGUID(GetTemplateGUIDRequest request) {

		GetTemplateGUIDResponse response = new GetTemplateGUIDResponse();

		try {

			if (request == null)
				throw new Ac4yException("request is missing!");

			if ((request.getHumanId() == null) || (request.getHumanId() == ""))
				throw new Ac4yException("humanId is empty!");

			response.setGUID(
						new Ac4yGUID8HumanIdService().getTemplateGUID(
							request.getHumanId()
						)
					);

			if (response.getGUID() == null)
				response.setResult(new Ac4yProcessResult(0, "does not exist", null));
			else
				response.setResult(new Ac4yProcessResult(1, "ok", null));

		} catch (Ac4yException e) {
			
			response.setResult(new Ac4yProcessResult(-1, e.getLocalizedMessage(), null));
			
		} catch (Exception e) {
			
			response.setResult(new Ac4yProcessResult(-1, e.getLocalizedMessage(), new Ac4yException().getStackTraceAsString(e)));
			
		}

		return response;
		
	} // getTemplateGUID
	
	public IsExistByPersistentIdResponse isExistsByPersistentId(IsExistByPersistentIdRequest request) {

		IsExistByPersistentIdResponse response = new IsExistByPersistentIdResponse();

		try {

			if (request == null)
				throw new Ac4yException("request is missing!");

			if (new Ac4yGUID8HumanIdService().isExistByPersistentId(request.getPersistentId()))
				response.setResult(new Ac4yProcessResult(1, "exists", null));
			else
				response.setResult(new Ac4yProcessResult(0, "does not exist", null));

		} catch (Ac4yException e) {
			
			response.setResult(new Ac4yProcessResult(-1, e.getLocalizedMessage(), null));
			
		} catch (Exception e) {
			
			response.setResult(new Ac4yProcessResult(-1, "error", new Ac4yException().getStackTraceAsString(e)));
			
		}

		return response;
		
	} // isExistsByPersistentId
	
	public IsExistByGUIDResponse isExistByGUID(IsExistByGUIDRequest request) {

		IsExistByGUIDResponse response = new IsExistByGUIDResponse();

		try {

			if (request == null)
				throw new Ac4yException("request is missing!");

			if ((request.getGUID() == null) || (request.getGUID() == ""))
				throw new Ac4yException("GUID is empty!");

			if (new Ac4yGUID8HumanIdService().isExistByGUID(request.getGUID()))
				response.setResult(new Ac4yProcessResult(1, "exists", null));
			else
				response.setResult(new Ac4yProcessResult(0, "does not exist", null));

		} catch (Ac4yException e) {
			
			response.setResult(new Ac4yProcessResult(-1, e.getLocalizedMessage(), null));
			
		} catch (Exception e) {
			
			response.setResult(new Ac4yProcessResult(-1, "error", new Ac4yException().getStackTraceAsString(e)));
			
		}

		return response;
		
	} // isExistsByGUID

	public IsExistByHumanIdsResponse isExistByHumanIds(IsExistByHumanIdsRequest request) {

		IsExistByHumanIdsResponse response = new IsExistByHumanIdsResponse();

		try {

			if (request == null)
				throw new Ac4yException("request is missing!");

			if ((request.getTemplateHumanId() == null) || (request.getTemplateHumanId() == ""))
				throw new Ac4yException("templateHumanId is empty!");

			if ((request.getHumanId() == null) || (request.getHumanId() == ""))
				throw new Ac4yException("humanId is empty!");

			if (new Ac4yGUID8HumanIdService().isExistByHumanIds(
					request.getTemplateHumanId()
					,request.getHumanId()
					)
				)
				response.setResult(new Ac4yProcessResult(1, "exists", null));
			else
				response.setResult(new Ac4yProcessResult(0, "does not exist", null));

		} catch (Ac4yException e) {
			
			response.setResult(new Ac4yProcessResult(-1, e.getLocalizedMessage(), null));
			
		} catch (Exception e) {
			
			response.setResult(new Ac4yProcessResult(-1, "error", new Ac4yException().getStackTraceAsString(e)));
			
		}

		return response;
		
	} // isExistByHumanIds

	public GetByPersistentIdResponse getByPersistentId(GetByPersistentIdRequest request) {

		GetByPersistentIdResponse response = new GetByPersistentIdResponse();

		try {

			if (request == null)
				throw new Ac4yException("request is missing!");

			response.setAc4yG8H(new Ac4yGUID8HumanIdService().getByPersistentId(request.getPersistentId()));

			if ((response.getAc4yG8H() == null))
				response.setResult(new Ac4yProcessResult(0, "does not exist", null));
			else
				response.setResult(new Ac4yProcessResult(1, "ok", null));

		} catch (Ac4yException e) {
			
			response.setResult(new Ac4yProcessResult(-1, e.getLocalizedMessage(), null));
			
		} catch (Exception e) {
			
			response.setResult(new Ac4yProcessResult(-1, e.getLocalizedMessage(), new Ac4yException().getStackTraceAsString(e)));
			
		}

		return response;
		
	} // getByPersistentId

	public GetByGUIDResponse getByGUID(GetByGUIDRequest request) {

		GetByGUIDResponse response = new GetByGUIDResponse();

		try {

			if (request == null)
				throw new Ac4yException("request is missing!");

			if ((request.getGUID() == null) || (request.getGUID() == ""))
				throw new Ac4yException("GUID is empty!");

			response.setAc4yG8H(new Ac4yGUID8HumanIdService().getByGUID(request.getGUID()));

			if ((response.getAc4yG8H() == null))
				response.setResult(new Ac4yProcessResult(0, "does not exist", null));
			else
				response.setResult(new Ac4yProcessResult(1, "ok", null));

		} catch (Ac4yException e) {
			
			response.setResult(new Ac4yProcessResult(-1, e.getLocalizedMessage(), null));
			
		} catch (Exception e) {
			
			response.setResult(new Ac4yProcessResult(-1, e.getLocalizedMessage(), new Ac4yException().getStackTraceAsString(e)));
			
		}

		return response;
		
	} // getByGUID

	public GetByHumanIdsResponse getByHumanIds(GetByHumanIdsRequest request) {

		GetByHumanIdsResponse response = new GetByHumanIdsResponse();

		try {

			if (request == null)
				throw new Ac4yException("request is missing!");

			if ((request.getTemplateHumanId() == null) || (request.getTemplateHumanId() == ""))
				throw new Ac4yException("templateHumanId is empty!");

			if ((request.getHumanId() == null) || (request.getHumanId() == ""))
				throw new Ac4yException("humanId is empty!");

			String GUID =
				new Ac4yGUID8HumanIdService().getGUIDByHumanIds(
						request.getTemplateHumanId()
						,request.getHumanId()
				);
				
				if (GUID == null)
					throw new Ac4yException("such object does not exist!");
			
			response.setAc4yG8H(
				new Ac4yGUID8HumanIdService().getByGUID(GUID)
			);

			if ((response.getAc4yG8H() == null))
				response.setResult(new Ac4yProcessResult(0, "does not exist", null));
			else
				response.setResult(new Ac4yProcessResult(1, "ok", null));

		} catch (Ac4yException e) {
			
			response.setResult(new Ac4yProcessResult(-1, e.getLocalizedMessage(), null));
			
		} catch (Exception e) {
			
			response.setResult(new Ac4yProcessResult(-1, e.getLocalizedMessage(), new Ac4yException().getStackTraceAsString(e)));
			
		}

		return response;
		
	} // getByHumanIds

	public GetListResponse getList(GetListRequest request) {

		GetListResponse response = new GetListResponse();

		try {

			response.setAc4yG8HList(new Ac4yGUID8HumanIdService().getList(request.getWhere()));

			if ((response.getAc4yG8HList().getAc4yG8H().isEmpty()))
				response.setResult(new Ac4yProcessResult(0, "empty list", null));
			else
				response.setResult(new Ac4yProcessResult(1, "ok", null));

		} catch (Ac4yException e) {
			
			response.setResult(new Ac4yProcessResult(-1, e.getLocalizedMessage(), null));
			
		} catch (Exception e) {
			
			response.setResult(new Ac4yProcessResult(-1, e.getLocalizedMessage(), new Ac4yException().getStackTraceAsString(e)));
			
		}

		return response;
		
	} // getList

	public GetInstanceListResponse getInstanceListByGUID(GetInstanceListRequest request) {

		GetInstanceListResponse response = new GetInstanceListResponse();

		try {

			response.setAc4yG8HList(new Ac4yGUID8HumanIdService().getInstanceList(request.getGUID()));

			if ((response.getAc4yG8HList().getAc4yG8H().isEmpty()))
				response.setResult(new Ac4yProcessResult(0, "empty list", null));
			else
				response.setResult(new Ac4yProcessResult(1, "ok", null));

		} catch (Ac4yException e) {
			
			response.setResult(new Ac4yProcessResult(-1, e.getLocalizedMessage(), null));
			
		} catch (Exception e) {
			
			response.setResult(new Ac4yProcessResult(-1, e.getLocalizedMessage(), new Ac4yException().getStackTraceAsString(e)));
			
		}

		return response;
		
	} // getList

	public GetGUIDListResponse getGUIDList(GetGUIDListRequest request) {

		GetGUIDListResponse response = new GetGUIDListResponse();

		try {

			response.setAc4yGUIDList(new Ac4yGUID8HumanIdService().getGUIDList(request.getWhere()));

			if ((response.getAc4yGUIDList().getGUID().isEmpty()))
				response.setResult(new Ac4yProcessResult(0, "empty list", null));
			else
				response.setResult(new Ac4yProcessResult(1, "ok", null));

		} catch (Ac4yException e) {
			
			response.setResult(new Ac4yProcessResult(-1, e.getLocalizedMessage(), null));
			
		} catch (Exception e) {
			
			response.setResult(new Ac4yProcessResult(-1, e.getLocalizedMessage(), new Ac4yException().getStackTraceAsString(e)));
			
		}

		return response;
		
	} // getGUIDList

} // Ac4yG8HService