![SOAP Architecture as Backend](./assets/images/soap.png)
# Expose SOAP WebService as a RESTful API 
 
The following demonstrates how to create an API for retrieval of bank information by forwarding a request to a webservice using the OpenLegacy SOAP adapter.

## Pre-Requirements

- OpenLegacy IDE 4.6.10 (Full installation including JDK and all Maven dependencies).
- Internet Connection

## Demo Definition

- Creation of a new SDK Project.
- Generating Java Entities from **WSDL** URL and/or file.
- Test the connectivity and data retrieval from the **web service**.
- Creation of an API Project
- Add your SDK project as a dependency to your API project.

## Demo Resources

- [customers.wsdl](./assets/resources/customers.wsdl)

## Step 1 – Create a New SDK Project

> First, we will create a new SDK project using the OpenLegacy IDE.
The purpose of the SDK project is to allow easy access to a legacy backend.

1. Open the New Project Wizard:
   - File → New → OpenLegacy SDK Project
2. Define the **Project Name** as `soap-sdk-demo`
3. Click the **Default Package** field to automatically populate it.
4. Select **SOAP Services** as the backend and click `Next`
5. Set the connection details to the backend based to the following:
    - **SOAP Service base URL:** `http://solutions.openlegacy.com:8085/services`
6. Click Finish

![Create SDK](./assets/images/createSDK.gif)

## Step 2 – Generate Java Model (Entity) from the Cobol Source

1. Right-click on project  → Openlegacy → import WSDL
2. **WSDL URL:** http://demo:1234@solutions.openlegacy.com:8085/services/customers.wsdl 
3. Click OK.
4. Copy `customers.wsdl` from `(src/main/resources/legacy)`, to `(src/main/resources/sample)`
5. Right-Click on the `customers.wsdl` file → OpenLegacy → Generate Model
6. Check **Generate JUnit Test checkbox**
7. Click OK
8. Go to `(src/main/resources)` `application.yml`, and add the following:
   - `authentication-type: http-header`
   - **user:** `demo`
   - **password:** `1234`

![Generate Entity](./assets/images/generateEntity.gif)

## Step 3 - Create JUnit Test

> An initial test suite was generated automatically in Step 2 if you checked the `Generate JUnit Test` checkbox
> OpenLegacy enables test-driven development by auto-generating test suites for each backend program (entities).
The test suite can be extended with additional unit tests as needed.

1. Go to `src/test/java/tests/GetcustomerslistTest.java` 
2. Highlight the second test.
3. Run the test as Junit test.
4. **You should get the following output:**

     <details>
     <summary>Click to see the output</summary>

     ```JSON
     {
       "inputParams" : {
         "getcustomerslistRequest" : { }
       },
       "outputParams" : {
         "getcustomerslistResponse" : {
           "customers" : [ {
             "customerId" : 1,
             "name" : null,
             "gender" : "Male",
             "email" : "jlefrank0@seattletimes.com",
             "phoneNumber" : "602-230-2699",
             "address" : {
               "country" : "Indonesia",
               "city" : "Sere",
               "streetName" : "Graceland",
               "streetNumber" : "82"
             }
           }, {
             "customerId" : 2,
             "name" : null,
             "gender" : "Male",
             "email" : "helletson1@tumblr.com",
             "phoneNumber" : "324-164-3811",
             "address" : {
               "country" : "Cuba",
               "city" : "Jimaguayú",
               "streetName" : "Sunfield",
               "streetNumber" : "38"
             }
           }, {
             "customerId" : 3,
             "name" : null,
             "gender" : "Female",
             "email" : "lconnow2@reddit.com",
             "phoneNumber" : "232-702-6474",
             "address" : {
               "country" : "China",
               "city" : "Yinying",
               "streetName" : "Banding",
               "streetNumber" : "65"
             }
           }, {
             "customerId" : 4,
             "name" : null,
             "gender" : "Male",
             "email" : "jswallow3@sogou.com",
             "phoneNumber" : "812-219-7220",
             "address" : {
               "country" : "Seychelles",
               "city" : "Port Glaud",
               "streetName" : "Meadow Valley",
               "streetNumber" : "08"
             }
           }, {
             "customerId" : 5,
             "name" : null,
             "gender" : "Male",
             "email" : "lgedney4@rakuten.co.jp",
             "phoneNumber" : "355-590-0795",
             "address" : {
               "country" : "China",
               "city" : "Shangyanzhuang",
               "streetName" : "Sugar",
               "streetNumber" : "84"
             }
           }, {
             "customerId" : 6,
             "name" : null,
             "gender" : "Male",
             "email" : "nbricksey5@sbwire.com",
             "phoneNumber" : "590-452-0445",
             "address" : {
               "country" : "Ghana",
               "city" : "Wenchi",
               "streetName" : "Buell",
               "streetNumber" : "74476"
             }
           }, {
             "customerId" : 7,
             "name" : null,
             "gender" : "Female",
             "email" : "cellerbeck6@businessinscustomerIder.com",
             "phoneNumber" : "730-131-6441",
             "address" : {
               "country" : "French Guiana",
               "city" : "Kourou",
               "streetName" : "Hintze",
               "streetNumber" : "34095"
             }
           }, {
             "customerId" : 8,
             "name" : null,
             "gender" : "Male",
             "email" : "rscrowby7@ca.gov",
             "phoneNumber" : "482-889-4965",
             "address" : {
               "country" : "China",
               "city" : "Yongfeng",
               "streetName" : "Columbus",
               "streetNumber" : "50350"
             }
           }, {
             "customerId" : 9,
             "name" : null,
             "gender" : "Male",
             "email" : "dkarlolczak8@netscape.com",
             "phoneNumber" : "269-696-9124",
             "address" : {
               "country" : "Bangladesh",
               "city" : "Pirojpur",
               "streetName" : "Northland",
               "streetNumber" : "06"
             }
           }, {
             "customerId" : 10,
             "name" : null,
             "gender" : "Female",
             "email" : "rlacey9@webnode.com",
             "phoneNumber" : "820-560-3118",
             "address" : {
               "country" : "China",
               "city" : "Jindong",
               "streetName" : "Jana",
               "streetNumber" : "4470"
             }
           }, {
             "customerId" : 11,
             "name" : null,
             "gender" : "Female",
             "email" : "nsansoma@xinhuanet.com",
             "phoneNumber" : "763-155-1616",
             "address" : {
               "country" : "Syria",
               "city" : "Talldaww",
               "streetName" : "High Crossing",
               "streetNumber" : "2719"
             }
           }, {
             "customerId" : 12,
             "name" : null,
             "gender" : "Male",
             "email" : "ajoselevitchb@indiegogo.com",
             "phoneNumber" : "123-804-0408",
             "address" : {
               "country" : "China",
               "city" : "Shatian",
               "streetName" : "Service",
               "streetNumber" : "5231"
             }
           }, {
             "customerId" : 13,
             "name" : null,
             "gender" : "Female",
             "email" : "kdunrcustomerIdgec@fotki.com",
             "phoneNumber" : "704-615-7228",
             "address" : {
               "country" : "France",
               "city" : "Béziers",
               "streetName" : "Independence",
               "streetNumber" : "576"
             }
           }, {
             "customerId" : 14,
             "name" : null,
             "gender" : "Male",
             "email" : "gwestd@dagondesign.com",
             "phoneNumber" : "404-851-1006",
             "address" : {
               "country" : "Philippines",
               "city" : "Sibulan",
               "streetName" : "Glendale",
               "streetNumber" : "832"
             }
           }, {
             "customerId" : 15,
             "name" : null,
             "gender" : "Male",
             "email" : "klittlekite@nature.com",
             "phoneNumber" : "482-870-1965",
             "address" : {
               "country" : "Peru",
               "city" : "Tirapata",
               "streetName" : "Birchwood",
               "streetNumber" : "042"
             }
           }, {
             "customerId" : 16,
             "name" : null,
             "gender" : "Male",
             "email" : "rocrianef@barnesandnoble.com",
             "phoneNumber" : "798-246-3572",
             "address" : {
               "country" : "Jamaica",
               "city" : "Gayle",
               "streetName" : "Kensington",
               "streetNumber" : "16885"
             }
           }, {
             "customerId" : 17,
             "name" : null,
             "gender" : "Male",
             "email" : "gdumbellowg@over-blog.com",
             "phoneNumber" : "569-372-5592",
             "address" : {
               "country" : "Colombia",
               "city" : "Fusagasuga",
               "streetName" : "Saint Paul",
               "streetNumber" : "898"
             }
           }, {
             "customerId" : 18,
             "name" : null,
             "gender" : "Female",
             "email" : "eshortth@adobe.com",
             "phoneNumber" : "747-119-5505",
             "address" : {
               "country" : "Colombia",
               "city" : "Gachalá",
               "streetName" : "Shopko",
               "streetNumber" : "9655"
             }
           }, {
             "customerId" : 19,
             "name" : null,
             "gender" : "Female",
             "email" : "mbathoi@independent.co.uk",
             "phoneNumber" : "887-423-6434",
             "address" : {
               "country" : "Indonesia",
               "city" : "Kondangrege",
               "streetName" : "Sutherland",
               "streetNumber" : "5"
             }
           }, {
             "customerId" : 20,
             "name" : null,
             "gender" : "Male",
             "email" : "fnaiseyj@ameblo.jp",
             "phoneNumber" : "179-111-1693",
             "address" : {
               "country" : "Indonesia",
               "city" : "Jugantang",
               "streetName" : "Knutson",
               "streetNumber" : "30"
             }
           }, {
             "customerId" : 21,
             "name" : null,
             "gender" : "Male",
             "email" : "yelecumk@is.gd",
             "phoneNumber" : "535-296-6388",
             "address" : {
               "country" : "Albania",
               "city" : "Vukatanë",
               "streetName" : "Acker",
               "streetNumber" : "473"
             }
           }, {
             "customerId" : 22,
             "name" : null,
             "gender" : "Female",
             "email" : "bpattiel@aol.com",
             "phoneNumber" : "816-337-8807",
             "address" : {
               "country" : "Philippines",
               "city" : "Palauig",
               "streetName" : "Annamark",
               "streetNumber" : "81"
             }
           }, {
             "customerId" : 23,
             "name" : null,
             "gender" : "Female",
             "email" : "mwannopm@about.me",
             "phoneNumber" : "784-226-9880",
             "address" : {
               "country" : "Armenia",
               "city" : "Darpas",
               "streetName" : "Maple",
               "streetNumber" : "0"
             }
           }, {
             "customerId" : 24,
             "name" : null,
             "gender" : "Male",
             "email" : "wbraddern@dion.ne.jp",
             "phoneNumber" : "803-940-3091",
             "address" : {
               "country" : "Indonesia",
               "city" : "Hokor",
               "streetName" : "Corben",
               "streetNumber" : "1"
             }
           }, {
             "customerId" : 25,
             "name" : null,
             "gender" : "Male",
             "email" : "khuricho@apache.org",
             "phoneNumber" : "877-466-9684",
             "address" : {
               "country" : "China",
               "city" : "Lianhe",
               "streetName" : "Buhler",
               "streetNumber" : "4"
             }
           }, {
             "customerId" : 26,
             "name" : null,
             "gender" : "Female",
             "email" : "wpitbladop@usatoday.com",
             "phoneNumber" : "271-466-0462",
             "address" : {
               "country" : "Philippines",
               "city" : "Andres Bonifacio",
               "streetName" : "Badeau",
               "streetNumber" : "76"
             }
           }, {
             "customerId" : 27,
             "name" : null,
             "gender" : "Female",
             "email" : "amulberyq@pagesperso-orange.fr",
             "phoneNumber" : "140-760-6111",
             "address" : {
               "country" : "Brazil",
               "city" : "Jardinópolis",
               "streetName" : "Meadow Vale",
               "streetNumber" : "261"
             }
           }, {
             "customerId" : 28,
             "name" : null,
             "gender" : "Female",
             "email" : "lkingzethr@alibaba.com",
             "phoneNumber" : "924-416-9991",
             "address" : {
               "country" : "China",
               "city" : "Gaoyi",
               "streetName" : "Mosinee",
               "streetNumber" : "3825"
             }
           }, {
             "customerId" : 29,
             "name" : null,
             "gender" : "Female",
             "email" : "aaistrops@delicious.com",
             "phoneNumber" : "306-295-1566",
             "address" : {
               "country" : "Poland",
               "city" : "Borzęta",
               "streetName" : "Banding",
               "streetNumber" : "67"
             }
           }, {
             "customerId" : 30,
             "name" : null,
             "gender" : "Female",
             "email" : "sbrimilcomet@lulu.com",
             "phoneNumber" : "573-452-7698",
             "address" : {
               "country" : "Niger",
               "city" : "Illéla",
               "streetName" : "Dakota",
               "streetNumber" : "279"
             }
           }, {
             "customerId" : 31,
             "name" : null,
             "gender" : "Female",
             "email" : "schiplenu@feedburner.com",
             "phoneNumber" : "443-678-7793",
             "address" : {
               "country" : "China",
               "city" : "Baisha",
               "streetName" : "Montana",
               "streetNumber" : "80"
             }
           }, {
             "customerId" : 32,
             "name" : null,
             "gender" : "Male",
             "email" : "lgammiev@shop-pro.jp",
             "phoneNumber" : "455-984-8463",
             "address" : {
               "country" : "Greece",
               "city" : "Vónitsa",
               "streetName" : "Haas",
               "streetNumber" : "4692"
             }
           }, {
             "customerId" : 33,
             "name" : null,
             "gender" : "Male",
             "email" : "cmcspirronw@boston.com",
             "phoneNumber" : "644-847-7693",
             "address" : {
               "country" : "Brazil",
               "city" : "Cajazeiras",
               "streetName" : "Carberry",
               "streetNumber" : "8282"
             }
           }, {
             "customerId" : 34,
             "name" : null,
             "gender" : "Male",
             "email" : "dromainex@cyberchimps.com",
             "phoneNumber" : "295-800-8615",
             "address" : {
               "country" : "Colombia",
               "city" : "Flandes",
               "streetName" : "Lerdahl",
               "streetNumber" : "67"
             }
           }, {
             "customerId" : 35,
             "name" : null,
             "gender" : "Male",
             "email" : "bburminghamy@addtoany.com",
             "phoneNumber" : "866-717-9706",
             "address" : {
               "country" : "Indonesia",
               "city" : "Huelkail",
               "streetName" : "Doe Crossing",
               "streetNumber" : "95"
             }
           }, {
             "customerId" : 36,
             "name" : null,
             "gender" : "Female",
             "email" : "gbosherez@plala.or.jp",
             "phoneNumber" : "138-455-0454",
             "address" : {
               "country" : "Nigeria",
               "city" : "Zuru",
               "streetName" : "Barnett",
               "streetNumber" : "56628"
             }
           }, {
             "customerId" : 37,
             "name" : null,
             "gender" : "Male",
             "email" : "dmackerel10@abc.net.au",
             "phoneNumber" : "507-428-4548",
             "address" : {
               "country" : "China",
               "city" : "Hongde",
               "streetName" : "Bashford",
               "streetNumber" : "578"
             }
           }, {
             "customerId" : 38,
             "name" : null,
             "gender" : "Female",
             "email" : "abrechin11@plala.or.jp",
             "phoneNumber" : "514-757-6513",
             "address" : {
               "country" : "Portugal",
               "city" : "Fonte da Aldeia",
               "streetName" : "Independence",
               "streetNumber" : "64817"
             }
           }, {
             "customerId" : 39,
             "name" : null,
             "gender" : "Male",
             "email" : "bgeaves12@homestead.com",
             "phoneNumber" : "999-766-6474",
             "address" : {
               "country" : "China",
               "city" : "Wangcungang",
               "streetName" : "Lyons",
               "streetNumber" : "7"
             }
           }, {
             "customerId" : 40,
             "name" : null,
             "gender" : "Female",
             "email" : "psibthorp13@webnode.com",
             "phoneNumber" : "176-854-0546",
             "address" : {
               "country" : "Brazil",
               "city" : "Ji Paraná",
               "streetName" : "Village Green",
               "streetNumber" : "866"
             }
           }, {
             "customerId" : 41,
             "name" : null,
             "gender" : "Male",
             "email" : "abrcustomerIdson14@loc.gov",
             "phoneNumber" : "536-315-8489",
             "address" : {
               "country" : "Portugal",
               "city" : "Barrosas",
               "streetName" : "Anzinger",
               "streetNumber" : "2091"
             }
           }, {
             "customerId" : 42,
             "name" : null,
             "gender" : "Female",
             "email" : "hgrimm15@123-reg.co.uk",
             "phoneNumber" : "933-859-9505",
             "address" : {
               "country" : "Denmark",
               "city" : "Frederiksberg",
               "streetName" : "Starling",
               "streetNumber" : "5"
             }
           }, {
             "customerId" : 43,
             "name" : null,
             "gender" : "Male",
             "email" : "rsimmonite16@arizona.edu",
             "phoneNumber" : "951-376-5983",
             "address" : {
               "country" : "Panama",
               "city" : "Pacora",
               "streetName" : "Raven",
               "streetNumber" : "65"
             }
           }, {
             "customerId" : 44,
             "name" : null,
             "gender" : "Male",
             "email" : "adignum17@home.pl",
             "phoneNumber" : "242-908-8063",
             "address" : {
               "country" : "Vietnam",
               "city" : "Trâu Quỳ",
               "streetName" : "Dexter",
               "streetNumber" : "9625"
             }
           }, {
             "customerId" : 45,
             "name" : null,
             "gender" : "Male",
             "email" : "efenton18@nba.com",
             "phoneNumber" : "993-671-3983",
             "address" : {
               "country" : "Philippines",
               "city" : "Buenavista",
               "streetName" : "Kedzie",
               "streetNumber" : "3"
             }
           }, {
             "customerId" : 46,
             "name" : null,
             "gender" : "Male",
             "email" : "nkirby19@engadget.com",
             "phoneNumber" : "279-921-1036",
             "address" : {
               "country" : "Norway",
               "city" : "Steinkjer",
               "streetName" : "Miller",
               "streetNumber" : "755"
             }
           }, {
             "customerId" : 47,
             "name" : null,
             "gender" : "Male",
             "email" : "preuter1a@accuweather.com",
             "phoneNumber" : "117-323-4469",
             "address" : {
               "country" : "Portugal",
               "city" : "Casais Baleal",
               "streetName" : "ParkscustomerIde",
               "streetNumber" : "34"
             }
           }, {
             "customerId" : 48,
             "name" : null,
             "gender" : "Male",
             "email" : "lrenne1b@europa.eu",
             "phoneNumber" : "899-851-6738",
             "address" : {
               "country" : "Russia",
               "city" : "Muravlenko",
               "streetName" : "Memorial",
               "streetNumber" : "8"
             }
           }, {
             "customerId" : 49,
             "name" : null,
             "gender" : "Female",
             "email" : "schad1c@patch.com",
             "phoneNumber" : "427-596-5088",
             "address" : {
               "country" : "Indonesia",
               "city" : "Duwakkandung",
               "streetName" : "Carioca",
               "streetNumber" : "2269"
             }
           }, {
             "customerId" : 50,
             "name" : null,
             "gender" : "Female",
             "email" : "sfautly1d@cbslocal.com",
             "phoneNumber" : "944-202-1676",
             "address" : {
               "country" : "Russia",
               "city" : "Novaya Lyalya",
               "streetName" : "Hooker",
               "streetNumber" : "370"
             }
           }, {
             "customerId" : 51,
             "name" : null,
             "gender" : "Male",
             "email" : "hleivesley1e@xing.com",
             "phoneNumber" : "646-491-7292",
             "address" : {
               "country" : "Poland",
               "city" : "Tarłów",
               "streetName" : "Lakewood Gardens",
               "streetNumber" : "18764"
             }
           }, {
             "customerId" : 52,
             "name" : null,
             "gender" : "Male",
             "email" : "dberresford1f@hp.com",
             "phoneNumber" : "914-128-8488",
             "address" : {
               "country" : "Ukraine",
               "city" : "Merefa",
               "streetName" : "Kipling",
               "streetNumber" : "4252"
             }
           }, {
             "customerId" : 53,
             "name" : null,
             "gender" : "Male",
             "email" : "cdod1g@1688.com",
             "phoneNumber" : "386-616-2345",
             "address" : {
               "country" : "Russia",
               "city" : "Staronizhestebliyevskaya",
               "streetName" : "Straubel",
               "streetNumber" : "986"
             }
           }, {
             "customerId" : 54,
             "name" : null,
             "gender" : "Female",
             "email" : "nkiellor1h@china.com.cn",
             "phoneNumber" : "278-653-6579",
             "address" : {
               "country" : "South Korea",
               "city" : "Wŏnju",
               "streetName" : "Esker",
               "streetNumber" : "42950"
             }
           }, {
             "customerId" : 55,
             "name" : null,
             "gender" : "Male",
             "email" : "sormes1i@squarespace.com",
             "phoneNumber" : "921-493-3020",
             "address" : {
               "country" : "Poland",
               "city" : "Gozdnica",
               "streetName" : "Monica",
               "streetNumber" : "3946"
             }
           }, {
             "customerId" : 56,
             "name" : null,
             "gender" : "Male",
             "email" : "wrozzier1j@newyorker.com",
             "phoneNumber" : "498-911-1922",
             "address" : {
               "country" : "Brazil",
               "city" : "Lagoa Seca",
               "streetName" : "Bluestem",
               "streetNumber" : "3128"
             }
           }, {
             "customerId" : 57,
             "name" : null,
             "gender" : "Male",
             "email" : "mpashe1k@tamu.edu",
             "phoneNumber" : "444-604-6250",
             "address" : {
               "country" : "Russia",
               "city" : "Podsineye",
               "streetName" : "Oriole",
               "streetNumber" : "9"
             }
           }, {
             "customerId" : 58,
             "name" : null,
             "gender" : "Female",
             "email" : "ctomaselli1l@nature.com",
             "phoneNumber" : "501-844-0449",
             "address" : {
               "country" : "Pakistan",
               "city" : "Kario",
               "streetName" : "Pankratz",
               "streetNumber" : "5"
             }
           }, {
             "customerId" : 59,
             "name" : null,
             "gender" : "Female",
             "email" : "ltrewman1m@indiegogo.com",
             "phoneNumber" : "910-603-9565",
             "address" : {
               "country" : "Brazil",
               "city" : "Jaboticabal",
               "streetName" : "Briar Crest",
               "streetNumber" : "6554"
             }
           }, {
             "customerId" : 60,
             "name" : null,
             "gender" : "Female",
             "email" : "lthaine1n@omniture.com",
             "phoneNumber" : "381-367-8445",
             "address" : {
               "country" : "China",
               "city" : "Zouma",
               "streetName" : "Green",
               "streetNumber" : "52767"
             }
           }, {
             "customerId" : 61,
             "name" : null,
             "gender" : "Male",
             "email" : "rlyburn1o@linkedin.com",
             "phoneNumber" : "186-318-2651",
             "address" : {
               "country" : "China",
               "city" : "Shanban",
               "streetName" : "Mayer",
               "streetNumber" : "71"
             }
           }, {
             "customerId" : 62,
             "name" : null,
             "gender" : "Female",
             "email" : "qgroome1p@lulu.com",
             "phoneNumber" : "500-994-6053",
             "address" : {
               "country" : "Peru",
               "city" : "Cotabambas",
               "streetName" : "Park Meadow",
               "streetNumber" : "08"
             }
           }, {
             "customerId" : 63,
             "name" : null,
             "gender" : "Female",
             "email" : "gbellenger1q@hatena.ne.jp",
             "phoneNumber" : "351-446-7208",
             "address" : {
               "country" : "Sweden",
               "city" : "LcustomerIdingö",
               "streetName" : "Towne",
               "streetNumber" : "0434"
             }
           }, {
             "customerId" : 64,
             "name" : null,
             "gender" : "Female",
             "email" : "tfoxon1r@examiner.com",
             "phoneNumber" : "567-341-5944",
             "address" : {
               "country" : "China",
               "city" : "Liugong",
               "streetName" : "Park Meadow",
               "streetNumber" : "63"
             }
           }, {
             "customerId" : 65,
             "name" : null,
             "gender" : "Male",
             "email" : "dscullin1s@acquirethisname.com",
             "phoneNumber" : "830-613-8239",
             "address" : {
               "country" : "Panama",
               "city" : "Capellanía",
               "streetName" : "Moland",
               "streetNumber" : "1"
             }
           }, {
             "customerId" : 66,
             "name" : null,
             "gender" : "Female",
             "email" : "dcarlile1t@miibeian.gov.cn",
             "phoneNumber" : "968-972-7011",
             "address" : {
               "country" : "Czech Republic",
               "city" : "Varnsdorf",
               "streetName" : "8th",
               "streetNumber" : "0420"
             }
           }, {
             "customerId" : 67,
             "name" : null,
             "gender" : "Female",
             "email" : "eborham1u@telegraph.co.uk",
             "phoneNumber" : "826-389-7518",
             "address" : {
               "country" : "Indonesia",
               "city" : "Kotauneng",
               "streetName" : "Quincy",
               "streetNumber" : "04"
             }
           }, {
             "customerId" : 68,
             "name" : null,
             "gender" : "Male",
             "email" : "jvigurs1v@jiathis.com",
             "phoneNumber" : "261-837-8447",
             "address" : {
               "country" : "China",
               "city" : "Woshui",
               "streetName" : "Dixon",
               "streetNumber" : "22"
             }
           }, {
             "customerId" : 69,
             "name" : null,
             "gender" : "Female",
             "email" : "mcruces1w@bacustomerIdu.com",
             "phoneNumber" : "724-673-4515",
             "address" : {
               "country" : "Libya",
               "city" : "Tagiura",
               "streetName" : "Alpine",
               "streetNumber" : "7"
             }
           }, {
             "customerId" : 70,
             "name" : null,
             "gender" : "Male",
             "email" : "vstukings1x@huffingtonpost.com",
             "phoneNumber" : "891-900-4149",
             "address" : {
               "country" : "China",
               "city" : "Haikoudajie",
               "streetName" : "SouthrcustomerIdge",
               "streetNumber" : "4"
             }
           }, {
             "customerId" : 71,
             "name" : null,
             "gender" : "Female",
             "email" : "pelfes1y@cafepress.com",
             "phoneNumber" : "264-733-6863",
             "address" : {
               "country" : "Poland",
               "city" : "Kalwaria Zebrzydowska",
               "streetName" : "Michigan",
               "streetNumber" : "3770"
             }
           }, {
             "customerId" : 72,
             "name" : null,
             "gender" : "Female",
             "email" : "agraysmark1z@wix.com",
             "phoneNumber" : "247-542-5109",
             "address" : {
               "country" : "Sweden",
               "city" : "Hässleholm",
               "streetName" : "Merry",
               "streetNumber" : "230"
             }
           }, {
             "customerId" : 73,
             "name" : null,
             "gender" : "Female",
             "email" : "bmouncey20@bbc.co.uk",
             "phoneNumber" : "112-259-6570",
             "address" : {
               "country" : "Indonesia",
               "city" : "Tarimbang",
               "streetName" : "Shelley",
               "streetNumber" : "7"
             }
           }, {
             "customerId" : 74,
             "name" : null,
             "gender" : "Male",
             "email" : "wbucke21@jalbum.net",
             "phoneNumber" : "850-605-2808",
             "address" : {
               "country" : "Canada",
               "city" : "Bonnyville",
               "streetName" : "Hauk",
               "streetNumber" : "5"
             }
           }, {
             "customerId" : 75,
             "name" : null,
             "gender" : "Male",
             "email" : "hwallman22@addtoany.com",
             "phoneNumber" : "211-254-3819",
             "address" : {
               "country" : "Philippines",
               "city" : "Patao",
               "streetName" : "Golf",
               "streetNumber" : "5"
             }
           }, {
             "customerId" : 76,
             "name" : null,
             "gender" : "Male",
             "email" : "kshmyr23@yellowbook.com",
             "phoneNumber" : "495-283-3595",
             "address" : {
               "country" : "Philippines",
               "city" : "Kalibo (poblacion)",
               "streetName" : "Mayfield",
               "streetNumber" : "80"
             }
           }, {
             "customerId" : 77,
             "name" : null,
             "gender" : "Male",
             "email" : "lburel24@themeforest.net",
             "phoneNumber" : "470-856-7004",
             "address" : {
               "country" : "Iran",
               "city" : "Gorgān",
               "streetName" : "Dwight",
               "streetNumber" : "02"
             }
           }, {
             "customerId" : 78,
             "name" : null,
             "gender" : "Female",
             "email" : "rhazeldine25@addthis.com",
             "phoneNumber" : "911-892-0255",
             "address" : {
               "country" : "China",
               "city" : "Tatrang",
               "streetName" : "Dawn",
               "streetNumber" : "869"
             }
           }, {
             "customerId" : 79,
             "name" : null,
             "gender" : "Female",
             "email" : "ephilliskirk26@behance.net",
             "phoneNumber" : "850-844-1127",
             "address" : {
               "country" : "Russia",
               "city" : "VcustomerIdyayevo",
               "streetName" : "Dapin",
               "streetNumber" : "0"
             }
           }, {
             "customerId" : 80,
             "name" : null,
             "gender" : "Female",
             "email" : "cgoding27@timesonline.co.uk",
             "phoneNumber" : "129-361-2797",
             "address" : {
               "country" : "Nepal",
               "city" : "Sirāhā",
               "streetName" : "Loeprich",
               "streetNumber" : "71006"
             }
           }, {
             "customerId" : 81,
             "name" : null,
             "gender" : "Female",
             "email" : "tcolt28@last.fm",
             "phoneNumber" : "715-831-9164",
             "address" : {
               "country" : "New Zealand",
               "city" : "Gore",
               "streetName" : "Debra",
               "streetNumber" : "9"
             }
           }, {
             "customerId" : 82,
             "name" : null,
             "gender" : "Female",
             "email" : "hhubbock29@army.mil",
             "phoneNumber" : "831-334-8038",
             "address" : {
               "country" : "Philippines",
               "city" : "Ransang",
               "streetName" : "SuttercustomerIdge",
               "streetNumber" : "71"
             }
           }, {
             "customerId" : 83,
             "name" : null,
             "gender" : "Female",
             "email" : "ldearnly2a@microsoft.com",
             "phoneNumber" : "520-538-9298",
             "address" : {
               "country" : "Portugal",
               "city" : "Monte de Trigo",
               "streetName" : "Susan",
               "streetNumber" : "554"
             }
           }, {
             "customerId" : 84,
             "name" : null,
             "gender" : "Female",
             "email" : "agilberthorpe2b@aboutads.info",
             "phoneNumber" : "452-455-1235",
             "address" : {
               "country" : "Ukraine",
               "city" : "Shklo",
               "streetName" : "Schurz",
               "streetNumber" : "3170"
             }
           }, {
             "customerId" : 85,
             "name" : null,
             "gender" : "Female",
             "email" : "dsyres2c@cyberchimps.com",
             "phoneNumber" : "222-100-7814",
             "address" : {
               "country" : "Iran",
               "city" : "Şaḩneh",
               "streetName" : "Westend",
               "streetNumber" : "86"
             }
           }, {
             "customerId" : 86,
             "name" : null,
             "gender" : "Female",
             "email" : "emaharg2d@latimes.com",
             "phoneNumber" : "285-852-6918",
             "address" : {
               "country" : "China",
               "city" : "Kanghe",
               "streetName" : "Maple Wood",
               "streetNumber" : "4"
             }
           }, {
             "customerId" : 87,
             "name" : null,
             "gender" : "Male",
             "email" : "ccustomerIdiens2e@dedecms.com",
             "phoneNumber" : "294-433-7798",
             "address" : {
               "country" : "China",
               "city" : "Chelu",
               "streetName" : "Fieldstone",
               "streetNumber" : "538"
             }
           }, {
             "customerId" : 88,
             "name" : null,
             "gender" : "Male",
             "email" : "mvillalta2f@exblog.jp",
             "phoneNumber" : "333-323-0382",
             "address" : {
               "country" : "Russia",
               "city" : "Asino",
               "streetName" : "Swallow",
               "streetNumber" : "16740"
             }
           }, {
             "customerId" : 89,
             "name" : null,
             "gender" : "Male",
             "email" : "carcase2g@epa.gov",
             "phoneNumber" : "443-365-3231",
             "address" : {
               "country" : "Lithuania",
               "city" : "Virbalis",
               "streetName" : "Hanson",
               "streetNumber" : "11"
             }
           }, {
             "customerId" : 90,
             "name" : null,
             "gender" : "Male",
             "email" : "kdoulton2h@hatena.ne.jp",
             "phoneNumber" : "832-328-0214",
             "address" : {
               "country" : "United States",
               "city" : "Spring",
               "streetName" : "Graedel",
               "streetNumber" : "8"
             }
           }, {
             "customerId" : 91,
             "name" : null,
             "gender" : "Female",
             "email" : "jcharrier2i@opera.com",
             "phoneNumber" : "482-794-2891",
             "address" : {
               "country" : "Japan",
               "city" : "Tsuyama",
               "streetName" : "Sommers",
               "streetNumber" : "789"
             }
           }, {
             "customerId" : 92,
             "name" : null,
             "gender" : "Male",
             "email" : "jworwood2j@ucoz.ru",
             "phoneNumber" : "291-164-7449",
             "address" : {
               "country" : "China",
               "city" : "Qingkenpao",
               "streetName" : "Merchant",
               "streetNumber" : "46302"
             }
           }, {
             "customerId" : 93,
             "name" : null,
             "gender" : "Female",
             "email" : "jchart2k@furl.net",
             "phoneNumber" : "269-904-2795",
             "address" : {
               "country" : "China",
               "city" : "Chengfeng",
               "streetName" : "Nancy",
               "streetNumber" : "30"
             }
           }, {
             "customerId" : 94,
             "name" : null,
             "gender" : "Female",
             "email" : "fdubery2l@bravesites.com",
             "phoneNumber" : "534-605-9073",
             "address" : {
               "country" : "Haiti",
               "city" : "Cornillon",
               "streetName" : "5th",
               "streetNumber" : "7170"
             }
           }, {
             "customerId" : 95,
             "name" : null,
             "gender" : "Female",
             "email" : "emeynell2m@google.de",
             "phoneNumber" : "883-352-8015",
             "address" : {
               "country" : "Peru",
               "city" : "Huayllati",
               "streetName" : "Mifflin",
               "streetNumber" : "30878"
             }
           }, {
             "customerId" : 96,
             "name" : null,
             "gender" : "Female",
             "email" : "vredington2n@cocolog-nifty.com",
             "phoneNumber" : "899-451-4077",
             "address" : {
               "country" : "Poland",
               "city" : "Krasnystaw",
               "streetName" : "Comanche",
               "streetNumber" : "89"
             }
           }, {
             "customerId" : 97,
             "name" : null,
             "gender" : "Male",
             "email" : "aabisetti2o@unicef.org",
             "phoneNumber" : "969-511-9532",
             "address" : {
               "country" : "East Timor",
               "city" : "Venilale",
               "streetName" : "Glacier Hill",
               "streetNumber" : "45044"
             }
           }, {
             "customerId" : 98,
             "name" : null,
             "gender" : "Female",
             "email" : "pwoodyear2p@constantcontact.com",
             "phoneNumber" : "815-718-3884",
             "address" : {
               "country" : "Ukraine",
               "city" : "Komsomolsk",
               "streetName" : "Northwestern",
               "streetNumber" : "9903"
             }
           }, {
             "customerId" : 99,
             "name" : null,
             "gender" : "Male",
             "email" : "tantonik2q@friendfeed.com",
             "phoneNumber" : "706-231-4486",
             "address" : {
               "country" : "China",
               "city" : "Jingtou",
               "streetName" : "Graceland",
               "streetNumber" : "329"
             }
           }, {
             "customerId" : 100,
             "name" : null,
             "gender" : "Male",
             "email" : "hrickman2r@issuu.com",
             "phoneNumber" : "823-819-4531",
             "address" : {
               "country" : "Japan",
               "city" : "Obama",
               "streetName" : "Northfield",
               "streetNumber" : "902"
             }
           } ]
         }
       }
     } 
     ```
</details>
   
5. Copy the JSON to `(src/test/resources/mock/GetcustomerslistTest/test_getcustomerslistTest_usecase_1.output.json)`
6. Run the test again.

![Create JUnit](./assets/images/createJUnit.gif)

## Step 4 – Create an API

1. Open the New Project Wizard:
   - File → New → OpenLegacy API Project
2. Define the **Project name** as `soap-api-demo`
3. Click the **Default Package** field to automatically populate it.
4. Click Next then add the SDK project that was created in **Step 1**  as a reference project.
5. Right-Click on the **API** project → OpenLegacy → Generate API from SDK
    - Name the service `Customers`
    - For the input, select `GetCustomer → getCustomerRequest` and add `customerId`
    - For the output, select `GetCustomer` and add `outputParams`
    - Click OK

![Create API](./assets/images/createAPI.gif)
    
## Step 5 - Run and Test your API

1. Right-Click on the **demo-soap-api** project → OpenLegacy → Run Application
2. Open the browser on http://localhost:8080/swagger
3. Authorize through **Oauth2**
   - **Client Id:** `client_id`
   - **Client Secret:** `client_secret`
4.  Click on the API we've created → Try it out
    - Use `99` as the cutomer ID for the input
    - Click Execute
    - You should receive a successful response returned from the SOAP web service
     ```JSON
    {
        "customer": {
        "customerId": 99,
        "name": null,
        "gender": "Male",
        "email": "tantonik2q@friendfeed.com",
        "phoneNumber": "706-231-4486",
        "address": {
          "country": "China",
          "city": "Jingtou",
          "streetName": "Graceland",
          "streetNumber": "329"
        }
       }
     }
     ```
![Alt Text](./assets/images/swagger.gif)
# Summary

In this demo you successfully built and tested an end to end integration with an existing SOAP web service using the OpenLegacy IDE.
You started with a WSDL file and the base URL of a webservice you wanted to expose RESTfully.  You automatically generated both a Java SDK and API that enabled you to call the webservice.
