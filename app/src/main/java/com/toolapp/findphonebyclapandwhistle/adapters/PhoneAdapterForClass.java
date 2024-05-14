package com.toolapp.findphonebyclapandwhistle.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

import com.toolapp.findphonebyclapandwhistle.databinding.LayoutItemPhonefinderBinding;
import com.toolapp.findphonebyclapandwhistle.datamodelclasses.DataModelForPhoneClass;

import java.util.List;

public class PhoneAdapterForClass extends RecyclerView.Adapter<PhoneAdapterForClass.MyViewHolderPhone> {

    private List<DataModelForPhoneClass> dataList;
    Context context;

    public PhoneAdapterForClass(List<DataModelForPhoneClass> dataList) {
        this.dataList = dataList;
    }

    public class MyViewHolderPhone extends RecyclerView.ViewHolder {
        LayoutItemPhonefinderBinding binding;
        public MyViewHolderPhone(LayoutItemPhonefinderBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
    @Override
    public MyViewHolderPhone onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutItemPhonefinderBinding binding = LayoutItemPhonefinderBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new MyViewHolderPhone(binding);
    }
    @Override
    public void onBindViewHolder(MyViewHolderPhone holder, int position) {
        DataModelForPhoneClass dataModelPhoneClass = dataList.get(position);
        holder.binding.cardViewBackgroundColor.setCardBackgroundColor(dataModelPhoneClass.getBackgroundCardColor());
        holder.binding.darkcoloricon.setImageResource(dataModelPhoneClass.getImageMask());
        holder.binding.findericon.setImageResource(dataModelPhoneClass.getImageIconFinder());
        holder.binding.txtViewClap.setText(dataModelPhoneClass.getTxtViewIconName());
        holder.binding.txtViewdesc.setText(dataModelPhoneClass.getTxtViewIconDesc());

    }
    @Override
    public int getItemCount() {
        return dataList.size();
    }
}