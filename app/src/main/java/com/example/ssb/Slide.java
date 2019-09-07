package com.example.ssb;

        import androidx.appcompat.app.AppCompatActivity;
        import androidx.viewpager.widget.ViewPager;
        import android.animation.ArgbEvaluator;
        import android.app.Activity;
        import android.os.Bundle;
        import java.util.ArrayList;
        import java.util.List;

public class Slide extends Activity {
    ViewPager viewPager;
Adapter adapter;
Integer[] colors = null;
    List<Model> models;
    ArgbEvaluator argbEvaluator = new ArgbEvaluator();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide);
        models = new ArrayList<>();
        models.add(new Model(R.drawable.hotel_logo,"Hotels Nearby","There are no hotels in kapurthala in the vicinty of the SSB Board, The nearest accommodation available is\n" +
                "    a gurudwara that\'s at walking distance from the bus stand \nThe Name Of The Gurudwara Is State Gurudwara"));
        models.add(new Model(R.drawable.info,"Info About Center","Selection Centre North was raised on 01 \n Jul 2015 in its interim location at Kapurthala, \n" +
                "                             It has two Services Selection Boards \n namely 31 SSB and 32 SSB. \n The motto of the centre is \"NISHPAKSH, NIHSWARTH, NISSANDEH” "));
        models.add(new Model(R.drawable.places_to_visit,"Places To Visit","1.Moorish Mosque, Kapurthala \n2.Pushpa Gujral Science City \n3.Shalimar Gardens\n4.Panch Mandir\n5.The city of Jalandhar Is Also A Great \n Place To Visit"));
        models.add(new Model(R.drawable.train,"HOW TO REACH","1.Buses-buses ply in to kaputhala from nearby major cities \n2.Trains- The city is well connected by \nTrains \n3.Flights-The nearest Airport is Sri \nGuru Ram Dass Jee International Airport in Amritsar"));

        Integer[] colors_temp = {
                getResources().getColor(R.color.color1),
                getResources().getColor(R.color.color2),
                getResources().getColor(R.color.color3),
                getResources().getColor(R.color.color4),
        };

        colors = colors_temp;
        adapter = new Adapter(models,this);
        viewPager = findViewById(R.id.viewPager);
        viewPager.setAdapter(adapter);
        viewPager.setPadding(130,0,130,0);
        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                if (position < (adapter.getCount() - 1) && position < (colors.length - 1))
                {
                    viewPager.setBackgroundColor((Integer) argbEvaluator.evaluate(positionOffset,colors[position],colors[position + 1]));
                }else
                {
                    viewPager.setBackgroundColor(colors[colors.length - 1]);
                }
            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }
    }

