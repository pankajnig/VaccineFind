package SupportClass;

import Databuild.Center;
import Databuild.City;
import Databuild.States;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.json.simple.JSONObject;

import java.util.List;

public class JSONParse {

    public static Integer getDistrictId(Response response, String cityName){

        JsonPath jsonPathEvaluator = response.jsonPath();

        List<City> allStates = jsonPathEvaluator.getList("districts", City.class);

        for(City city : allStates)
        {
            if(city.district_name.equalsIgnoreCase(cityName)){
                return city.district_id;
            }
        }

        return 0;

    }

    public static List<States> setStateList(Response response){
        JsonPath jsonPathEvaluator = response.jsonPath();

        List<States> allStates = jsonPathEvaluator.getList("states", States.class);

        return allStates;
     }

    public static List<City> setCityList(Response response){
        JsonPath jsonPathEvaluator = response.jsonPath();

        List<City> CityList = jsonPathEvaluator.getList("districts", City.class);

        return CityList;
    }

    public static List<Center> setCenterList(Response response){
        JsonPath jsonPathEvaluator = response.jsonPath();

        List<Center> CenterList = jsonPathEvaluator.getList("sessions", Center.class);

        return CenterList;
    }

//    public static void getCenterList(Response response){
//
//        System.out.println(response.statusCode());
//
//        JsonPath jsonPathEvaluator = response.jsonPath();
//
//        System.out.println(jsonPathEvaluator);
//
//        List<Center> allStates = jsonPathEvaluator.getList("sessions", Center.class);
//
//        System.out.println(allStates);
//
//        for(Center center : allStates)
//        {
//            System.out.println(center.toString());
//        }
//
//    }



}
