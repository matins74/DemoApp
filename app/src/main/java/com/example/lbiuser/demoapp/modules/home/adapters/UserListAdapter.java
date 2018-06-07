package com.example.lbiuser.demoapp.modules.home.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.lbiuser.demoapp.R;
import com.example.lbiuser.demoapp.mvp.model.MobileResponseResult;


import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class UserListAdapter extends RecyclerView.Adapter<UserListAdapter.ViewHolder> {
    Context context;
    List<MobileResponseResult> mList = new ArrayList<>();
    private LayoutInflater mlayoutInflater;
    public UserListAdapter(LayoutInflater layoutInflater) {
        this.mlayoutInflater = layoutInflater;

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mlayoutInflater.inflate(R.layout.sublayout_userlist, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {

        holder.bind(mList.get(position));
    }

    public void addMobiles(List<MobileResponseResult> mobileResponseResults)
    {
        mList.addAll(mobileResponseResults);
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public void clearUsers() {
        mList.clear();
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        @BindView(R.id.txtName) protected TextView txtName;
        @BindView(R.id.txtBrandName) protected TextView txtBrandName;
        @BindView(R.id.imgMobile) protected ImageView imgMobile;

        private Context mcontext;


        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            mcontext = itemView.getContext();
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                 /*   Intent intent = new Intent(context, PrescriptionListActivity.class);
                    intent.putExtra("user_id",arrayList.get(getAdapterPosition()).getId());
                    context.startActivity(intent);*/

                }
            });
        }
        public void bind(MobileResponseResult mobileResponseResult)
        {
            txtName.setText(mobileResponseResult.getProduct_name());
            txtBrandName.setText(mobileResponseResult.getBrand());

            Glide.with(mcontext).load(mobileResponseResult.getProduct_img_name())
                    .diskCacheStrategy(DiskCacheStrategy.SOURCE).into(imgMobile);
        }
    }
}
