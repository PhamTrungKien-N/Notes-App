package com.example.notes.Adapters;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class NotesListAdapter {

}
class NotesViewHolder extends RecyclerView.ViewHolder{

    CardView notes_container;
    TextView textView_title, textView_notes, textView_date;
    ImageView imageView_pin;
    public NotesViewHolder(@NonNull View itemView) {
        super(itemView);
    }
}
