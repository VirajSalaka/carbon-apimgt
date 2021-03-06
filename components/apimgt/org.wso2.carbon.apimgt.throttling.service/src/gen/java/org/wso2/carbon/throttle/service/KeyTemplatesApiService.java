package org.wso2.carbon.throttle.service;

import org.wso2.carbon.throttle.service.*;
import org.wso2.carbon.throttle.service.dto.*;

import org.apache.cxf.jaxrs.ext.MessageContext;
import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import org.wso2.carbon.apimgt.api.APIManagementException;

import org.wso2.carbon.throttle.service.dto.ErrorDTO;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;


public interface KeyTemplatesApiService {
      public Response keyTemplatesGet(MessageContext messageContext) throws APIManagementException;
}
