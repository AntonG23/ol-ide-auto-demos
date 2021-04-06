# Expose Mainframe-IMS as REST API

## Introduction

This demo shows generation of Java models from a **copy book** using OpenLegacy IDE's, test connectivity and data retrieval from host and how to expose it as a **REST API**.

## Pre-Requirements

- OpenLegacy IDE 4.6.10 (Full installation including JDK and all Maven dependencies)
- Internet Connection

## Demo Resources

- [PhoneBookRecord.in.cpy](/automation-tests/resources/PhoneBookRecord.in.cpy)
- [PhoneBookRecord.out.cpy](/automation-tests/resources/PhoneBookRecord.out.cpy)
  
## Demo Definition

- Create a new SDK Project.
- Generate Java model (Entity) from COBOL source file.
- Develop unit tests on the fly.
- Test the connectivity and data retrieval from the **Mainframe host**.
- You will use JUnit tests to test the SDK and invoke the response.
- Creation of an API Project on the top of your SDK Project.

## Step 1 – Create a New SDK Project

> First, we will create a new SDK project using the OpenLegacy IDE.
The purpose of the SDK project is to allow easy access to legacy backends, using standard and easy to use Java code.

1. Open the New Project Wizard:
   - File → New → OpenLegacy SDK Project
2. Define the **Project Name** as `mainframe-ims-sdk`.
3. Click at the **Default Package** field, to automatically fill it up.
4. Select **Mainframe IMS TM** as the backend and click **Next**.
5. Enter the following credentials:
   - **Host Name/IP:** `192.86.32.238` 
   - **Host Port:** `9999`
   - **Data Store Name:** `IVP1`
   - **Mark the Racf Enabled and set Racf User and Password to:** `OLS0001`
6. Click **Finish**
7. Open application.yaml located at `src/main/resources`, in **group-name** property insert the value: `GROUP1`, add a property: `output-offset: 0` and save the file
8. Change in design-time.properties file located at the root of `mainframe-ims-sdk` the **generateCopyAsEntity** value to `true` and save the file
    
![Create SDK](/assets/images/createSDK.gif)

## Step 2 – Generate Java Model (Entity) from copybook
> Now, we will create Java models out of our copy book file we wish to expose.

> In this example we will use `PhoneBookRecord.out.cpy` and `PhoneBookRecord.in.cpy` files that copied to: `src/main/resources/trails/` directory.

1. Choose both files -> Right click on one of the files -> Openlegacy -> Generate Model
2. Type in **Transaction:** `IVTCB` 
3. Mark **Generate JUnit test**
4. Press **Ok**.

![Generate Entity](/assets/images/generateEntity.gif)

## Step 3 – Create a JUnit Test

> OpenLegacy enables test-driven development by auto-generating test suites for each backend program (entities).
We can extend this test suite with additional unit tests to validate our connectivity to the backend.

1. Open and edit `src/test/resources/mock/PhonebookrecordTest/test_phonebookrecordTest_usecase_1.input.json` file like:

   ```json
   {
     "phonebookrecordInput" : {
       "inFiller" : "",
       "inCommand" : "DISPLAY",
       "inLastName" : "SMITH",
       "inFirstName" : "",
       "inExtension" : "",
       "inZipCode" : ""
     }
   }
   ```
2. Open and edit `src/test/resources/mock/PhonebookrecordTest/test_phonebookrecordTest_usecase_1.output.json` file like:

   ```json
    {
      "errorCode" : null,
      "errorMessage" : null,
      "errorObject" : null,
      "phonebookrecordInput" : {
         "inFiller" : "",
         "inCommand" : "DISPLAY",
         "inLastName" : "SMITH",
         "inFirstName" : "",
         "inExtension" : "",
         "inZipCode" : ""
      },
      "phonebookrecordOutput" : {
         "outMessage" : "ENTRY WAS DISPLAYED",
         "outCommand" : "DISPLAY",
         "outLastName" : "SMITH",
         "outFirstName" : "JOHN",
         "outExtension" : "24680",
         "outZipCode" : "10952",
         "outSegno" : "0001"
      }
    }
   ```

3. Go to `src/main/java/tests/com.mainframe_ims_sdk/openlegacy/Phonebookrecord.java` and change
class implementation from `public class Phonebookrecord implements org.openlegacy.core.rpc.RpcEntity` to 
**`public class Phonebookrecord extends ImsEntity`**.
4. Go to `src/test/java/tests/PhonebookrecordTest.java` and comment out `phonebookrecordTestUseCaseTest_2`. 
5. Run the JUnit by Right Clicking on `PhonebookrecordTest.java` → Run As → JUnit Tests (or press **F11**).

![Create JUnit](/assets/images/createJUnit.gif)

## Step 4 – Create APIs from SDK

1. Open the New Project Wizard:
   - File → New → OpenLegacy API Project.
2. Define the project name as `mainframe-ims-api`.
3. Click at the **Default Package** field, to automatically fill it up.
4. Press Next and add the SDK project that was created in **Step 1**  as the reference project.
5. Right click on the API project and navigate to Openlegacy → Generate API from SDK
6. Define the Service name as `CustomerDetails`.
7. Open the SDK folder
8. Add **inLastName** and **inCommand** from **phonebookrecordInput** to the **Input box**
9. Add **phonebookrecordOutput** to the **Output box**
10. Click **Ok**

![Create API](/assets/images/createAPI.gif)

## Step 5 - Run and Test your API


1. **Right-Click** on the **mainframe-ims-api** project → OpenLegacy → Run Application
2. Open the browser on http://localhost:8080/swagger
3. Authorize through **Oauth2**
   - **Client Id:** `client_id`
   - **Client Secret:** `client_secret`
4. **Click** on the API we've created → Try it out
5. Execute with the following input values:

    "inCommand": `"DISPLAY"`,  
    "inLastName": `"SMITH"`
	
   You should see successful respond returned directly from the Mainframe!
  
   ```json
    {
      "phonebookrecordOutput": {
        "outMessage": "ENTRY WAS DISPLAYED",
        "outCommand": "DISPLAY",
        "outLastName": "SMITH",
        "outFirstName": "JOHN",
        "outExtension": "24680",
        "outZipCode": "10952",
        "outSegno": "0001"
      }
    }
   ```

![Alt Text](/assets/images/swagger.gif)
## Summary

In this demo we have presented an end to end integration with **Mainframe IMS** using OpenLegacy IDE within just a couple of minutes. Based on the copy book supllied we have automatically generated Java SDK that enables calling the mainframe IMS, later on we have presented the creation of a REST API utilizing the SDK.
We used the IDE to better model and design the API and showed how it works with a standard Swagger page.
