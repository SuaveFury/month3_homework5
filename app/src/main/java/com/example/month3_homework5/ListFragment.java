package com.example.month3_homework5;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;


public class ListFragment extends Fragment  {
    RecyclerView chatRecyclerView;
    chatAdapter chatAdapter;
    private ArrayList<chatModel> chats;
    CardView cardView;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        chatRecyclerView = view.findViewById(R.id.chats_rv);
        cardView = view.findViewById(R.id.chat_item);
        chats = new ArrayList<>();

        setChats();





    }

    private void setChats() {chatRecyclerView.setAdapter(chatAdapter = new chatAdapter(chats));
        chats.add(new chatModel(R.drawable.kfc, "KFC", "Order now and get 20% off"));
        chats.add(new chatModel(R.drawable.baskin, "Baskin Robbins", "Your favourite ice cream"));
        chats.add(new chatModel(R.drawable.carls, "Carl's Jr", "Best burgers in town"));
        chats.add(new chatModel(R.drawable.dunkin, "DUNKIN' DONUTS", "70% off for all sides"));
        chats.add(new chatModel(R.drawable.king, "Burger King", "Working 24/7"));
        chats.add(new chatModel(R.drawable.mc, "McDonald's", "Mak your day better"));
        chats.add(new chatModel(R.drawable.papa, "Papa John's", "Buy 2 pizza get 1 free"));
        chats.add(new chatModel(R.drawable.popeyes, "Popeyes", "Fast delivery"));
        chats.add(new chatModel(R.drawable.texas, "Texas Chicken", "Best Texas roasted chicken"));
        chats.add(new chatModel(R.drawable.wingstop, "WINGSTOP", "American wild wings"));
        chats.add(new chatModel(R.drawable.fridays, "TGI Fridays", "Steaks and Taco"));
        chats.add(new chatModel(R.drawable.starbucks, "Starbucks", "Coffee and Snacks"));
        chats.add(new chatModel(R.drawable.paul, "Paul", "French restaurant"));


    }


}

