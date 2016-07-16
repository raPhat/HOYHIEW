package th.co.hoyhiew.hoyhiewapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MenuActivity extends AppCompatActivity {
    SingletonFoods singleton;
    ListView mListView;
    FoodsAdapter foodsAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        singleton = SingletonFoods.getInstance();

        foodsAdapter = new FoodsAdapter(this, R.layout.list_foods, singleton.getFoods());
        mListView = (ListView) findViewById(R.id.list_foods);
        mListView.setAdapter(foodsAdapter);
    }
}
