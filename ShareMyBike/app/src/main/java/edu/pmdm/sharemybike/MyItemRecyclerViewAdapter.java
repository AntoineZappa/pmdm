package edu.pmdm.sharemybike;

import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import edu.pmdm.sharemybike.bikes.BikesContent;
import edu.pmdm.sharemybike.databinding.FragmentItemBinding;

/**
 * {@link RecyclerView.Adapter} that can display a {@link BikesContent.Bike}.
 * TODO: Replace the implementation with code for your data type.
 */
public class MyItemRecyclerViewAdapter extends RecyclerView.Adapter<MyItemRecyclerViewAdapter.ViewHolder> {

    private final List<BikesContent.Bike> mValues;

    public MyItemRecyclerViewAdapter(List<BikesContent.Bike> items) {
        mValues = items;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        return new ViewHolder(FragmentItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));

    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = mValues.get(position);
        holder.mPhoto.setImageBitmap(mValues.get(position).getPhoto());
        holder.mCity.setText(mValues.get(position).getCity());
        holder.mLocation.setText(mValues.get(position).getLocation());
        holder.mOwner.setText(mValues.get(position).getOwner());
        holder.mDrescription.setText(mValues.get(position).getDescription());
        holder.mBtnImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { //Código para enviar el email
//                String to = "hola";
//                String subjectText = "Couch App: I'd like to book your bike";
//
//                Intent i= new Intent();
//                i.createChooser(i,"Choose the app to send the email with your order");
//                i.setAction(Intent.ACTION_SEND);
//                i.setData(Uri.parse("mailto:"));
//                i.putExtra(Intent.EXTRA_EMAIL,to);
//                i.putExtra(Intent.EXTRA_SUBJECT, subjectText);
//                i.putExtra(Intent.EXTRA_TEXT, emailText);
//                startActivity(Intent.createChooser(i, "Choose an Email client :"));

            }
        });
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final ImageView mPhoto;
        public final TextView mCity;
        public final TextView mLocation;
        public final TextView mOwner;
        public final TextView mDrescription;
        public final ImageButton mBtnImg;

        public BikesContent.Bike mItem;

        public ViewHolder(FragmentItemBinding binding) {
            super(binding.getRoot());
            mPhoto = binding.imgPhoto;
            mCity = binding.txtCity;
            mLocation = binding.txtLocation;
            mOwner = binding.txtOwner;
            mDrescription = binding.txtDescription;
            mBtnImg = binding.btnMail;

        }

    }
}