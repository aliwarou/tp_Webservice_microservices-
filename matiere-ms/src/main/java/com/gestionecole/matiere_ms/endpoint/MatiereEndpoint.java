package com.gestionecole.matiere_ms.endpoint;

import com.gestionecole.matiere_ms.entity.Matiere;
import com.gestionecole.matiere_ms.model.*;
import com.gestionecole.matiere_ms.service.MatiereService;
import org.springframework.beans.BeanUtils;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

public class MatiereEndpoint {




    private static final String NAMESPACE_URI = "http://com.springbootsoap.matiere-ms";


    private final MatiereService matiereService;

    public MatiereEndpoint(MatiereService matiereService) {
        this.matiereService = matiereService;
    }



    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "addMatiereRequest")
    @ResponsePayload
    public AddMatiereResponse addMatiere(@RequestPayload AddMatiereRequest request) {
        AddMatiereResponse response = new AddMatiereResponse();
        ServiceStatus serviceStatus = new ServiceStatus();

        Matiere matiere = new Matiere();
        BeanUtils.copyProperties(request.getMatiereInfo(), matiere);
        matiereService.createMatiere(matiere);
        serviceStatus.setStatus("SUCCESS");
        serviceStatus.setMessage("Content Added Successfully");
        response.setServiceStatus(serviceStatus);
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getMatiereByIdRequest")
    @ResponsePayload
    public GetMatiereResponse getMatiere(@RequestPayload GetMatiereByIdRequest request) {
        GetMatiereResponse response = new GetMatiereResponse();
        MatiereInfo matiereInfo = new MatiereInfo();
        BeanUtils.copyProperties(matiereService.findMatiereById(request.getMatiereId()), matiereInfo);
        response.setMatiereInfo(matiereInfo);
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "updateMatiereRequest")
    @ResponsePayload
    public UpdateMatiereResponse updateMatiere(@RequestPayload UpdateMatiereRequest request) {
        Matiere matiere = new Matiere();
        BeanUtils.copyProperties(request.getMatiereInfo(), matiere);
        matiereService.updateMatiere(matiere);
        ServiceStatus serviceStatus = new ServiceStatus();
        serviceStatus.setStatus("SUCCESS");
        serviceStatus.setMessage("Content Updated Successfully");
        UpdateMatiereResponse response = new UpdateMatiereResponse();
        response.setServiceStatus(serviceStatus);
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "deleteMatiereRequest")
    @ResponsePayload
    public DeleteMatiereResponse deleteMatiere(@RequestPayload DeleteMatiereRequest request) {
        matiereService.deleteMatiere(request.getMatiereId());
        ServiceStatus serviceStatus = new ServiceStatus();
        serviceStatus.setStatus("SUCCESS");
        serviceStatus.setMessage("Content Deleted Successfully");
        DeleteMatiereResponse response = new DeleteMatiereResponse();
        response.setServiceStatus(serviceStatus);
        return response;
    }




}
