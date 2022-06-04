package com.example.demo;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

	@RequestMapping("/")
	public String home() {
	
		String MESSAGE=System.getenv("MESSAGE");
		System.out.println(MESSAGE);

		return "<body style=\"background-color:powderblue;\"><h1>IoT App running!</h1> Current Time: " + new Date() + "</body>" ;
	}

	@RequestMapping("/hi")
	public String hi() {
	
		String MESSAGE=System.getenv("MESSAGE");
		System.out.println(MESSAGE);
		if ( MESSAGE == null ) {
			return "Its time : " + new Date();
		} else {
			return "<h1>" + MESSAGE + "</h1> Current time : " + new Date();
		}
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}


	@RequestMapping("/csebase")
	public String csebase() {

		String csebase = "{\n    \"m2m:cb\": {\n        \"ty\": 5,\n        \"ri\": \"1000\",\n        \"ct\": \"20220530T210919,932531\",\n        \"lt\": \"20220530T210919,932531\",\n        \"rn\": \"HPE_IoT\",\n        \"acpi\": [\n            \"HPE_IoT/DefaultCseBaseAccess\"\n        ],\n        \"cst\": 1,\n        \"csi\": \"CSE1000\",\n        \"srt\": [\n            1,\n            2,\n            3,\n            4,\n            5,\n            9,\n            12,\n            13,\n            14,\n            16,\n            23\n        ]\n    }\n}";
		return csebase;
	}


	@RequestMapping("/asset")
	public String asset() {

		String asset = "{\n    \"credentialDetails\": null,\n    \"topics\": [],\n    \"attributes\": [\n        {\n            \"key\": \"appskey\",\n            \"value\": \" \",\n            \"description\": \" \",\n            \"transportChannel\": \"IoT\"\n        },\n        {\n            \"key\": \"ContentType\",\n            \"value\": \"JSON\",\n            \"description\": \" \",\n            \"transportChannel\": \"IoT\"\n        },\n        {\n            \"key\": \"Decode\",\n            \"value\": \"true\",\n            \"description\": \" \",\n            \"transportChannel\": \"IoT\"\n        },\n        {\n            \"key\": \"DecodeInputKey\",\n            \"value\": \"dataFrame\",\n            \"description\": \" \",\n            \"transportChannel\": \"IoT\"\n        },\n        {\n            \"key\": \"DecodeMode\",\n            \"value\": \"REPLACE\",\n            \"description\": \" \",\n            \"transportChannel\": \"IoT\"\n        },\n        {\n            \"key\": \"DecodeType\",\n            \"value\": \"codec-water-0.0.1-SNAPSHOT\",\n            \"description\": \" \",\n            \"transportChannel\": \"IoT\"\n        },\n        {\n            \"key\": \"DownlinkPayloadXpath\",\n            \"value\": \"payload_dl.data\",\n            \"description\": \" \",\n            \"transportChannel\": \"IoT\"\n        },\n        {\n            \"key\": \"Encode\",\n            \"value\": \"false\",\n            \"description\": \" \",\n            \"transportChannel\": \"IoT\"\n        },\n        {\n            \"key\": \"EncodeInputKey\",\n            \"value\": \"data\",\n            \"description\": \" \",\n            \"transportChannel\": \"IoT\"\n        },\n        {\n            \"key\": \"EncodeMode\",\n            \"value\": \"REPLACE\",\n            \"description\": \" \",\n            \"transportChannel\": \"IoT\"\n        },\n        {\n            \"key\": \"EncodeType\",\n            \"value\": \"codec-water-0.0.1-SNAPSHOT\",\n            \"description\": \" \",\n            \"transportChannel\": \"IoT\"\n        },\n        {\n            \"key\": \"firmware_version\",\n            \"value\": \"put_firmware_version\",\n            \"description\": \" \",\n            \"transportChannel\": \"IoT\"\n        },\n        {\n            \"key\": \"FlowId\",\n            \"value\": \"GenericFlow\",\n            \"description\": \" \",\n            \"transportChannel\": \"IoT\"\n        },\n        {\n            \"key\": \"latitude\",\n            \"value\": \" \",\n            \"description\": \" \",\n            \"transportChannel\": \"IoT\"\n        },\n        {\n            \"key\": \"longitude\",\n            \"value\": \" \",\n            \"description\": \" \",\n            \"transportChannel\": \"IoT\"\n        },\n        {\n            \"key\": \"manufacturer_name\",\n            \"value\": \"JUSCO_UTILITIES_APP_TEST_ABP\",\n            \"description\": \" \",\n            \"transportChannel\": \"IoT\"\n        },\n        {\n            \"key\": \"model\",\n            \"value\": \"Manual_JUSCO_UTILITIES\",\n            \"description\": \" \",\n            \"transportChannel\": \"IoT\"\n        },\n        {\n            \"key\": \"NPAKeyProv\",\n            \"value\": \"true\",\n            \"description\": \" \",\n            \"transportChannel\": \"IoT\"\n        },\n        {\n            \"key\": \"nwkskey\",\n            \"value\": \" \",\n            \"description\": \" \",\n            \"transportChannel\": \"IoT\"\n        },\n        {\n            \"key\": \"serial_number\",\n            \"value\": \" \",\n            \"description\": \" \",\n            \"transportChannel\": \"IoT\"\n        },\n        {\n            \"key\": \"UplinkPayloadXpath\",\n            \"value\": \"payloads_ul.dataFrame\",\n            \"description\": \" \",\n            \"transportChannel\": \"IoT\"\n        }\n    ],\n    \"asset\": {\n        \"resourceId\": \"7724\",\n        \"resourceName\": \"tcom2\",\n        \"customerId\": 1000,\n        \"insertDate\": 1542000751576,\n        \"updateDate\": \"2018-11-12\",\n        \"resourceType\": \"SENSOR\",\n        \"status\": \"Provisioned\",\n        \"deviceProfileId\": 342,\n        \"displayProfileId\": 0,\n        \"parentId\": 0,\n        \"enabled\": false,\n        \"deviceManagementProfileId\": 0,\n        \"oneM2MDevice\": false,\n        \"deviceGroupId\": 1001,\n        \"delAssetDataStatus\": false,\n        \"dmRegistered\": false\n    }\n}";
		return asset;
	}
	



}
