package com.github;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.specification.RequestSpecification;

public class ApiProject {
	
	RequestSpecification requestSpec;
	String sshKey ="ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABAQ...";
	
	int keyId;

    @BeforeClass
    public void setup() {

    }

    @Test
    public void addSSHKey() {

    }

    @Test
    public void getSSHKey() {

    }

    @Test
    public void deleteSSHKey() {

    }
}