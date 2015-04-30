package com.epam.jmp.gamebox;

import com.epam.jmp.gamebox.deploy.DeploymentDescriptor;

import java.util.List;

public interface DeploymentRepository {

    void addDeployment(DeploymentDescriptor deploymentDescriptor);
    List<DeploymentDescriptor> getAllDeployments();

}
