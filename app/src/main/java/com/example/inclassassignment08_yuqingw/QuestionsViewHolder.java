package com.example.inclassassignment08_yuqingw;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class QuestionsViewHolder extends RecyclerView.ViewHolder {
    public CardView cardView;
    public TextView questionCountry;
    public TextView countryQuestion;
    public ImageView countryImage;
    public TextView isTrue;

    public QuestionsViewHolder(View itemView, final Context context){
        super(itemView);
        cardView=(CardView)itemView.findViewById(R.id.card_view);
        questionCountry=(TextView) itemView.findViewById(R.id.question_country);
        countryQuestion=(TextView)itemView.findViewById(R.id.country_question);
        countryImage=(ImageView) itemView.findViewById(R.id.country_image);
        isTrue=(TextView) itemView.findViewById(R.id.question_isTrue);

        cardView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String isTrue1=isTrue.getText().toString();


                Toast.makeText(context,isTrue1,Toast.LENGTH_SHORT).show();
            }
        });

    }


}

