package com.example.month3_homework5;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class chatAdapter extends RecyclerView.Adapter<chatViewHolder> {

    private ArrayList<chatModel> chats;
    private itemClick itemClick;


    public chatAdapter(ArrayList<chatModel> chats, itemClick itemClick) {
        this.chats = chats;
        this.itemClick = itemClick;
    }

    public chatAdapter(ArrayList<chatModel> chats) {
        this.chats = chats;
    }


    @NonNull
    @Override
    public chatViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new chatViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.chat_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull chatViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.bind(chats.get(position).image, chats.get(position).title, chats.get(position).message);


    }

    @Override
    public int getItemCount() {
        return chats.size();
    }
}
