package com.toolapp.findphonebyclapandwhistle.adapters;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

import com.toolapp.findphonebyclapandwhistle.MyActivities.SelectedItem;
import com.toolapp.findphonebyclapandwhistle.databinding.LayoutSoundsBinding;
import com.toolapp.findphonebyclapandwhistle.datamodelclasses.DataModeForlSoundClass;

import java.util.List;

public class AdapterForSoundclass extends RecyclerView.Adapter<AdapterForSoundclass.MyViewHolderSoundImage> {

    private List<DataModeForlSoundClass> dataListSoundImages;
    private Context contexts;

    public AdapterForSoundclass(Context context, List<DataModeForlSoundClass> dataListSoundImages) {
        this.dataListSoundImages = dataListSoundImages;
        this.contexts=context;
    }

    public class MyViewHolderSoundImage extends RecyclerView.ViewHolder {
        LayoutSoundsBinding binding;
        public MyViewHolderSoundImage(LayoutSoundsBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }

    @Override
    public MyViewHolderSoundImage onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutSoundsBinding binding = LayoutSoundsBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new MyViewHolderSoundImage(binding);
    }

    @Override
    public void onBindViewHolder(MyViewHolderSoundImage holder, int position) {
        DataModeForlSoundClass dataModelSoundClass = dataListSoundImages.get(position);
        holder.binding.imagebackgroundcard.setCardBackgroundColor(dataModelSoundClass.getImageBackgroundCard());
        holder.binding.soundImage.setImageResource(dataModelSoundClass.getImageSound());

        holder.binding.imagebackgroundcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(position==0) {
                    Intent intent = new Intent(contexts, SelectedItem.class);
                    intent.putExtra("item", "cat");
                    intent.putExtra("name_item", "Meow");
                    contexts.startActivity(intent);
                }

else if (position==1)
                {
                        Intent intent = new Intent(contexts, SelectedItem.class);
                        intent.putExtra("item", "doorbell");
                        intent.putExtra("name_item", "doorbell");
                        contexts.startActivity(intent);
                    }

                else if (position==2)
                {
                    Intent intent = new Intent(contexts, SelectedItem.class);
                    intent.putExtra("item", "heystayhere");
                    intent.putExtra("name_item", "heystayhere");
                    contexts.startActivity(intent);
                }
                else if (position==3)
                {
                    Intent intent = new Intent(contexts, SelectedItem.class);
                    intent.putExtra("item", "piano");
                    intent.putExtra("name_item", "piano");
                    contexts.startActivity(intent);
                }

                else if (position==4)
                {
                    Intent intent = new Intent(contexts, SelectedItem.class);
                    intent.putExtra("item", "carhonk");
                    intent.putExtra("name_item", "carhonk");
                    contexts.startActivity(intent);
                }
                else if (position==5)
                {
                    Intent intent = new Intent(contexts, SelectedItem.class);
                    intent.putExtra("item", "partyhorn");
                    intent.putExtra("name_item", "partyhorn");
                    contexts.startActivity(intent);
                }

                else if (position==6)
                {
                    Intent intent = new Intent(contexts, SelectedItem.class);
                    intent.putExtra("item", "police");
                    intent.putExtra("name_item", "police");
                    contexts.startActivity(intent);
                }            }
        });
    }
    @Override
    public int getItemCount() {
        return dataListSoundImages.size();
    }
}