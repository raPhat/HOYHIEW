package th.co.hoyhiew.hoyhiewapplication;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.JsonHttpResponseHandler;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import cz.msebera.android.httpclient.Header;

/**
 * Created by raPhat on 7/16/16 AD.
 */
public class SingletonFoods {
    //create an object of SingleObject
    private static SingletonFoods instance = new SingletonFoods();

    private static ArrayList<Food> arrFoods = new ArrayList<>();

    private static final String jsonUrl="http://raykarj.com/foods.json";
    //make the constructor private so that this class cannot be
    //instantiated
    private SingletonFoods(){
        AsyncHttpClient client = new AsyncHttpClient();
        client.get(jsonUrl, new JsonHttpResponseHandler() {
            public void onSuccess(int statusCode, Header[] headers, JSONObject response) {
                try {
                    JSONArray foods = response.getJSONArray("foods");
                    for (int i=0; i<foods.length(); i++) {
                        JSONObject food = foods.getJSONObject(i);
                        Food obFood = new Food();
                        obFood.setName( food.getString("name") );
                        obFood.setDescription( food.getString("description") );
                        obFood.setKcal( food.getInt("kcal") );

                        System.out.println( obFood.toString() );

                        arrFoods.add( obFood );
                    }

                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    //Get the only object available
    public static SingletonFoods getInstance(){
        return instance;
    }

    public ArrayList<Food> getFoods(){
        return arrFoods;
    }
}
