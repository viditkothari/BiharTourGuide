package in.co.viditkothari.bihartourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Date;

public class Listing extends AppCompatActivity {

    ArrayList<Attraction> arrListAttractions = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listing);

        int listType = 0;
        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                listType = 0;
            } else {
                listType = extras.getInt(TheConstants.listType);
            }
        } else {
            listType = Integer.parseInt((String) savedInstanceState.getSerializable(TheConstants.listType));
        }

        AttractionAdapter attractionAdapter;

        ListView listview=(ListView)findViewById(R.id.listview);
        switch (listType){
            case TheConstants.EVENTS:
                attractionAdapter = new AttractionAdapter(this,insertEvents(),0);
                listview.setAdapter(attractionAdapter);
                break;
            case TheConstants.HISTORICAL:
                attractionAdapter = new AttractionAdapter(this,insertHistoricalPlaces(),0);
                listview.setAdapter(attractionAdapter);
                break;
            case TheConstants.LANDMARKS:
                attractionAdapter = new AttractionAdapter(this,insertLandmarks(),0);
                listview.setAdapter(attractionAdapter);
                break;
            case TheConstants.RESTAURANTS:
                attractionAdapter = new AttractionAdapter(this,insertRestaurants(),0);
                listview.setAdapter(attractionAdapter);
                break;
        }
    }

    private ArrayList<Attraction> insertEvents(){
        arrListAttractions.add(new Attraction("Jagoinvestor Investors Bootcamp",new AttrLocation(27.03,43.5,"Hotel Maurya"),"Jago Investors","Jagoinvestor Investors Bootcamp is organized for all the investors across Bihar",new Date(1488106200000L),R.drawable.jagoinvestor));
        arrListAttractions.add(new Attraction("Glam Fashion Week",new AttrLocation(27.03,43.5,"S.K. Memorial"),"Fashion Club, Bihar","Fashion Week in Patna",new Date(1492474200000L),R.drawable.fashion_week));
        arrListAttractions.add(new Attraction("Sonepur Fair",new AttrLocation(27.03,43.5,"Sonepur"),"Govt. of Bihar","Fest / Mela of all kinds of products",new Date(1498474200000L),R.drawable.sonepur_fair));
        return arrListAttractions;
    }

    private ArrayList<Attraction> insertHistoricalPlaces(){
        arrListAttractions.add(new Attraction("Nalanda University",new AttrLocation(27.03,43.5,"Nalanda"),"Vikramaditya","A world renowned university fom ancient times",R.drawable.nalanda_university));
        arrListAttractions.add(new Attraction("Jain Jal Mandir",new AttrLocation(27.03,43.5,"Pavapuri"),"Jain Community","Place where Jain Tirthankar - Lord Mahaveer breathed his last",R.drawable.jalmandir));
        arrListAttractions.add(new Attraction("Takht Sri Patna Sahib",new AttrLocation(27.03,43.5,"Patna City"),"Sikh Community","In memory of one of the five Sikh guru - Sri Guru Govind Ji Maharaj",R.drawable.patna_sahib));
        return arrListAttractions;
    }

    private ArrayList<Attraction> insertLandmarks(){
        arrListAttractions.add(new Attraction("Mahabodhi Temple",new AttrLocation(28.03,43.5,"Gaya"),"In memory of Gautam Buddha",R.drawable.mahabodhi));
        arrListAttractions.add(new Attraction("Bodhi Tree",new AttrLocation(50.03,43.5,"Gaya"),"From the age of Lord Gautam Buddha",R.drawable.bodhi_tree));
        arrListAttractions.add(new Attraction("Golghar",new AttrLocation(21.03,43.5,"Patna Ghat Area"),"made by the British during famine to stock forage",R.drawable.golghar));
        arrListAttractions.add(new Attraction("Patna Museum",new AttrLocation(22.03,43.5,"Kotwali, Patna"),"One of the oldest museum in Eastern India",R.drawable.patna_museum));
        return arrListAttractions;
    }

    private ArrayList<Attraction> insertRestaurants(){
        arrListAttractions.add(new Attraction("Basant Vihar",new AttrLocation(27.03,43.5,"Dak Bunglow"),"Kumar Goyal","One of the premium restaurants in Bihar",R.drawable.basant_vihar));
        arrListAttractions.add(new Attraction("Rajasthan Restaurant",new AttrLocation(27.03,43.5,"Fraser Road"),"Abhinav Prakash","One of the oldest restaurants in Patna",R.drawable.rajasthan));
        arrListAttractions.add(new Attraction("Sagar Ratna",new AttrLocation(27.03,43.5,"Fraser Road"),"Narayanan Shivakumar","Best vegetarian restaurant in Patna",R.drawable.sagar_ratna));
        arrListAttractions.add(new Attraction("Yellow Chilly",new AttrLocation(27.03,43.5,"Bailey Road"),"Sanjeev Kapoor","One of the prestigious chains of restaurants",R.drawable.yellow_chilli));
        return arrListAttractions;
    }
}
