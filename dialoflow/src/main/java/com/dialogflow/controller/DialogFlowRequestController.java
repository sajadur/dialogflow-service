package com.dialogflow.controller;

import com.dialogflow.model.DialogFlowRequest;
import com.dialogflow.model.DialogFlowResponse;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DialogFlowRequestController {

    @RequestMapping(value = "configuration", method = RequestMethod.POST)
    public DialogFlowResponse getDialogueFlow(@RequestBody DialogFlowRequest request){
        DialogFlowResponse response = new DialogFlowResponse();
        response.setName(request.getName());
        return response;
    }
}
