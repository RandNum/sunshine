package com.android.wiggins.sunshine;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Owner on 7/2/2015.
 */
public class WeatherDataParser {

    public static double getMaxTemperatureForDay(String weatherJsonStr, int dayIndex) throws JSONException  {

                //drill down through JSON object list to get Max value for specific day
                JSONObject weather = new JSONObject(weatherJsonStr);
                JSONArray days = weather.getJSONArray("list");
                JSONObject dayInfo = days.getJSONObject(dayIndex);
                JSONObject temperatureInfo = dayInfo.getJSONObject("temp");
                return temperatureInfo.getDouble("max");
        }


}
