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
        arrListAttractions.add(new Attraction(getString(R.string.evnt_maurya),new AttrLocation(27.03,43.5,getString(R.string.evnt_maurya_loc)),getString(R.string.evnt_maurya_own_org),getString(R.string.evnt_maurya_desc),new Date(1488106200000L),R.drawable.jagoinvestor));
        arrListAttractions.add(new Attraction(getString(R.string.evnt_fashion),new AttrLocation(27.03,43.5,getString(R.string.evnt_fashion_loc)),getString(R.string.evnt_fashion_own_org),getString(R.string.evnt_fashion_desc),new Date(1492474200000L),R.drawable.fashion_week));
        arrListAttractions.add(new Attraction(getString(R.string.evnt_sonepurMela),new AttrLocation(27.03,43.5,getString(R.string.evnt_sonepur_loc)),getString(R.string.evnt_sonepur_own_org),getString(R.string.evnt_sonepur_desc),new Date(1498474200000L),R.drawable.sonepur_fair));
        return arrListAttractions;
    }

    private ArrayList<Attraction> insertHistoricalPlaces(){
        arrListAttractions.add(new Attraction(getString(R.string.hist_nalanda),new AttrLocation(27.03,43.5,getString(R.string.hist_nalanda_loc)),getString(R.string.hist_nalanda_own_org),getString(R.string.hist_nalanda_desc),R.drawable.nalanda_university));
        arrListAttractions.add(new Attraction(getString(R.string.hist_jalmandir),new AttrLocation(27.03,43.5,getString(R.string.hist_jalmandir_loc)),getString(R.string.hist_jalmandir_own_org),getString(R.string.hist_jalmandir_desc),R.drawable.jalmandir));
        arrListAttractions.add(new Attraction(getString(R.string.hist_takht),new AttrLocation(27.03,43.5,getString(R.string.hist_takht_loc)),getString(R.string.hist_takht_own_org),getString(R.string.hist_takht_desc),R.drawable.patna_sahib));
        return arrListAttractions;
    }

    private ArrayList<Attraction> insertLandmarks(){
        arrListAttractions.add(new Attraction(getString(R.string.lndm_mahabodhitemple),new AttrLocation(28.03,43.5,getString(R.string.lndm_mahabodhitemple_loc)),getString(R.string.lndm_mahabodhitemple_desc),R.drawable.mahabodhi));
        arrListAttractions.add(new Attraction(getString(R.string.lndm_bodhitree),new AttrLocation(50.03,43.5,getString(R.string.lndm_bodhitree_loc)),getString(R.string.lndm_bodhitree_desc),R.drawable.bodhi_tree));
        arrListAttractions.add(new Attraction(getString(R.string.lndm_golghar),new AttrLocation(21.03,43.5,getString(R.string.lndm_golghar_loc)),getString(R.string.lndm_golghar_desc),R.drawable.golghar));
        arrListAttractions.add(new Attraction(getString(R.string.lndm_patnamuseum),new AttrLocation(22.03,43.5,getString(R.string.lndm_patnamuseum_loc)),getString(R.string.lndm_patnamuseum_desc),R.drawable.patna_museum));
        return arrListAttractions;
    }

    private ArrayList<Attraction> insertRestaurants(){
        arrListAttractions.add(new Attraction(getString(R.string.restr_basantvihar),new AttrLocation(27.03,43.5,getString(R.string.restr_basantvihar_loc)),getString(R.string.restr_basantvihar_own_org),getString(R.string.restr_basantvihar_desc),R.drawable.basant_vihar));
        arrListAttractions.add(new Attraction(getString(R.string.restr_rajasthan),new AttrLocation(27.03,43.5,getString(R.string.restr_rajasthan_loc)),getString(R.string.restr_rajasthan_own_org),getString(R.string.restr_rajasthan_desc),R.drawable.rajasthan));
        arrListAttractions.add(new Attraction(getString(R.string.restr_sagarratna),new AttrLocation(27.03,43.5,getString(R.string.restr_sagarratna_loc)),getString(R.string.restr_sagarratna_own_org),getString(R.string.restr_sagarratna_desc),R.drawable.sagar_ratna));
        arrListAttractions.add(new Attraction(getString(R.string.restr_yellowchilly),new AttrLocation(27.03,43.5,getString(R.string.restr_yellowchilly_loc)),getString(R.string.restr_yellowchilly_own_org),getString(R.string.restr_yellowchilly_desc),R.drawable.yellow_chilli));
        return arrListAttractions;
    }

}
