package com.example.ieapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.ieapplication.subexe.CycActivity;

public class FoodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
        Button food = (Button) findViewById(R.id.food);
        food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FoodActivity.this,"Trans fats should be avoided since they can trigger or worsen inflammation and are very bad for your cardiovascular health. Trans fats come in most processed foods such as cookies, crackers, doughnuts and fast food. ", Toast.LENGTH_SHORT).show();
            }
        });
        Button food1 = (Button) findViewById(R.id.food1);
        food1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FoodActivity.this,"More than just a health trend, there are good reasons to avoid gluten. Chief among them is the connection between celiac disease and rheumatoid arthritis. A recent study published in the Oxford Journal of Rheumatology states that 41 percent of those suffering from rheumatoid arthritis improve on gluten-free diets.", Toast.LENGTH_SHORT).show();
            }
        });
        Button food2 = (Button) findViewById(R.id.food2);
        food2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FoodActivity.this,"Simple carbs and refined sugar have earned themselves a bad name over the last few years, and for good reason. These are nutrient-free toxins that the body has very little use for. ", Toast.LENGTH_SHORT).show();
            }
        });
        Button food3 = (Button) findViewById(R.id.food3);
        food3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FoodActivity.this,"Fried foods are overcooked and have had all or most of their nutrients destroyed. They also contain many known carcinogens. Many foods that come fried also contain a number of heavily processed ingredients. All of these will cause inflammation by triggering the body’s defense mechanisms, which will set of an arthritic flare-up.", Toast.LENGTH_SHORT).show();
            }
        });
        Button food4 = (Button) findViewById(R.id.food4);
        food4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FoodActivity.this,"Nuts are a great source of protein for vegetarians. They also contain magnesium, zinc, vitamin-E as well as the immune booster alpha-linolenic acid. They are also an easy way to get the protein you need to keep your digestive tract healthy, and they are very filling.", Toast.LENGTH_SHORT).show();
            }
        });
        Button food5 = (Button) findViewById(R.id.food5);
        food5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FoodActivity.this,"Loaded with immune-boosting properties, garlic and onions are the superhero duo of the produce section. Studies have shown that those who eat foods in the allium family, such as garlic and onions, exhibit fewer signs of osteoarthritis and joint pain.", Toast.LENGTH_SHORT).show();
            }
        });
        Button food6 = (Button) findViewById(R.id.food6);
        food6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FoodActivity.this,"Another great source of protein and fiber, beans are an excellent way to replace many filer foods that worsen joint pain and the conditions associated with it. Beans are rich in folic acid, zinc, iron and potassium— all of which are known to have important immune-boosting properties.", Toast.LENGTH_SHORT).show();
            }
        });
        Button food7 = (Button) findViewById(R.id.food7);
        food7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FoodActivity.this,"Sweet, refreshing and delicious, oranges, grapefruits, lemons and limes are also valuable allies in the fight against joint pain. Not only are they rich in life-saving vitamin C, but they are also an ideal substitute for those who love sweets.", Toast.LENGTH_SHORT).show();
            }
        });
        Button food8 = (Button) findViewById(R.id.food8);
        food8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FoodActivity.this,"Known for its many health-promoting benefits, green tea can also help turn the tide against arthritic conditions. Loaded with powerful antioxidants and polyphenols, green tea reduces inflammation and slows the process of cartilage deterioration.", Toast.LENGTH_SHORT).show();
            }
        });
        ImageButton return1=(ImageButton)findViewById(R.id.return20);
        return1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FoodActivity.this, TipActivity.class);
                startActivity(intent);
            }
        });
    }
}
