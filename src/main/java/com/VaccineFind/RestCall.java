package com.VaccineFind;

import Databuild.Center;
import Databuild.City;
import Databuild.States;
import SupportClass.JSONParse;
import SupportClass.UrlBuilder;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.util.List;

public class RestCall {

    public static List<States> StateList;
    public static List<City> DistrictList;
    public static List<Center> CenterListByDate;
    public static List<Center> CenterListCalenderBydate;

    public static List<States> getStateLIst() {

        try {

            RestAssured.baseURI = UrlBuilder.getUrl("StateList");

            System.out.println(RestAssured.baseURI);

            RequestSpecification httpRequest = RestAssured.given();

            httpRequest.header("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/90.0.4430.212 Safari/537.36");

            Response response = httpRequest.request(Method.GET);

            StateList = JSONParse.setStateList(response);

        } catch (Exception e) {
        }

        return StateList;

    }

    public static List<City> getCityList(String stateid) {

        try {

            RestAssured.baseURI = UrlBuilder.getUrl("CityList") + stateid;

            RequestSpecification httpRequest = RestAssured.given();

            httpRequest.header("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/90.0.4430.212 Safari/537.36");

            Response response = httpRequest.request(Method.GET);

            DistrictList = JSONParse.setCityList(response);

        } catch (Exception e) {
        }

        return DistrictList;
    }


    public static List<Center> getVaccineCenterListByDate(String Centerid, String Date) {

        try {

            RestAssured.baseURI = UrlBuilder.getUrl("CenterListByDate");

            RequestSpecification httpRequest = RestAssured.given();

            httpRequest.param("district_id", Centerid);
            httpRequest.param("date", Date);

            httpRequest.header("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/90.0.4430.212 Safari/537.36");

            Response response = httpRequest.request(Method.GET);

            CenterListByDate = JSONParse.setCenterList(response);

        } catch (Exception e) {
        }

        return CenterListByDate;


    }

    public static List<Center> getVaccineCenterbyCalaneder(String Centerid, String Date) {

        try {

            RestAssured.baseURI = UrlBuilder.getUrl("CenterListByDate");

            RequestSpecification httpRequest = RestAssured.given();

            httpRequest.param("district_id", Centerid);
            httpRequest.param("date", Date);

            httpRequest.header("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/90.0.4430.212 Safari/537.36");

            Response response = httpRequest.request(Method.GET);

            CenterListCalenderBydate = JSONParse.setCenterList(response);

        } catch (Exception e) {
        }

        return CenterListCalenderBydate;

    }

}
