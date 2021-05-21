package SupportClass;

import java.io.IOException;
import java.util.Date;

public class UrlBuilder {

    public static String getUrl(String urlType) {

        try {
            if (urlType.equals("StateList")) {

                return Urls.StateListurl;

            } else if (urlType.equals("CityList")) {

                return Urls.DistrictListUrl;

            } else if (urlType.equals("CenterListByDate")) {

                return Urls.CentListByDateUrl;

            } else if (urlType.equals("CenterListByPincode")) {

                return Urls.CenterListByPincodeUrl;

            } else if (urlType.equals("CenterListByCalender")) {

                return Urls.CenterListByCalenderUrl;

            } else {
                return "";
            }
        } catch (Exception e) {

        }
        return"";
    }
}
