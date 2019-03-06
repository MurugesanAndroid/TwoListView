package mis.tvscs.com.twolist;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Context mContext;

    LinearLayout layout_one,layout_two;

    ArrayList<String> arrayListOne=new ArrayList<>();

    ArrayList<String> arrayListTwo=new ArrayList<>();

    Button ListOne,ListTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout_one=(LinearLayout)findViewById(R.id.layout_one);
        layout_two=(LinearLayout)findViewById(R.id.layout_two);

        ListOne=(Button) findViewById(R.id.ListOne);
        ListTwo=(Button)findViewById(R.id.ListTwo);

        mContext=MainActivity.this;

        //FirstArray
        arrayListOne.clear();
        arrayListOne.add("one");
        arrayListOne.add("two");
        arrayListOne.add("three");

        //SecondArray
        arrayListTwo.clear();
        arrayListTwo.add("one");
        arrayListTwo.add("two");
        arrayListTwo.add("three");

        getvaluefromservices(arrayListOne,arrayListTwo);


        ListOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //
            }
        });

        ListTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout_two.setVisibility(View.VISIBLE);
            }
        });


    }

    private void getvaluefromservices(ArrayList<String> arrayListOnes, ArrayList<String> arrayListTwos) {

        int first_length= arrayListOnes.size();

        LayoutInflater inflater = LayoutInflater.from(mContext);
        for(int i=0;i<first_length;i++){
            final View first_view = inflater.inflate(R.layout.first_single_item, null);
            TextView one= first_view.findViewById(R.id.txt_one);
            one.setText("");
            layout_one.addView(first_view);
        }


        int second_length= arrayListTwos.size();

        for(int i=0;i<second_length;i++){
            final View second_view = inflater.inflate(R.layout.second_single_item, null);
            TextView one= second_view.findViewById(R.id.txt_one);
            one.setText("");
            layout_two.addView(second_view);
        }
    }
}
