package Databuild;

import com.fasterxml.jackson.annotation.JsonAlias;

import java.util.List;

public class Center{
    public int center_id;
    public String name;
    public String address;
    public String state_name;
    public String district_name;
    public String block_name;
    public int pincode;
    public String from;
    public String to;
    public int lat;
    @JsonAlias({ "long", "l" })
    public int longitue;
    public String fee_type;
    public String session_id;
    public String date;
    public int available_capacity_dose1;
    public int available_capacity_dose2;
    public int available_capacity;
    public String fee;
    public int min_age_limit;
    public String vaccine;
    public List<String> slots;
}


