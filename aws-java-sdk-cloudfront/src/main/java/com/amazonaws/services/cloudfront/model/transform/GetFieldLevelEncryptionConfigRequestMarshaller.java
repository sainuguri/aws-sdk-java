/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.cloudfront.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cloudfront.model.*;
import com.amazonaws.transform.Marshaller;

/**
 * GetFieldLevelEncryptionConfigRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetFieldLevelEncryptionConfigRequestMarshaller implements
        Marshaller<Request<GetFieldLevelEncryptionConfigRequest>, GetFieldLevelEncryptionConfigRequest> {

    public Request<GetFieldLevelEncryptionConfigRequest> marshall(GetFieldLevelEncryptionConfigRequest getFieldLevelEncryptionConfigRequest) {

        if (getFieldLevelEncryptionConfigRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<GetFieldLevelEncryptionConfigRequest> request = new DefaultRequest<GetFieldLevelEncryptionConfigRequest>(getFieldLevelEncryptionConfigRequest,
                "AmazonCloudFront");

        request.setHttpMethod(HttpMethodName.GET);

        String uriResourcePath = "/2017-10-30/field-level-encryption/{Id}/config";

        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "Id", getFieldLevelEncryptionConfigRequest.getId());
        request.setResourcePath(uriResourcePath);

        return request;
    }

}
