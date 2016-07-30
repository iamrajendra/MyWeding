package com.iamrajendra.wedding.adapter;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.iamrajendra.wedding.R;
import com.iamrajendra.wedding.model.Programe;

import java.util.List;

/**
 * Created by rajendraverma on 30-07-2016.
 */
public class ProgrameAdapter extends RecyclerView.Adapter<ProgrameAdapter.ProgrameHolder>{
    private Context mContext;
    private Activity mActivity;
    private List<Programe> mList_programeList;

    public ProgrameAdapter(Context mContext, Activity mActivity, List<Programe> mList_programeList) {
        this.mContext = mContext;
        this.mActivity = mActivity;
        this.mList_programeList = mList_programeList;
    }

    @Override
    public ProgrameHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ProgrameHolder(mActivity.getLayoutInflater().inflate(R.layout.programe_rva,null));
    }

    @Override
    public void onBindViewHolder(ProgrameHolder holder, int position) {
        holder.mTextView_title.setText(mList_programeList.get(position).getTitle());
        holder.mImageView_image.setImageResource(mList_programeList.get(position).getBg_image());

    }

    @Override
    public int getItemCount() {
        return mList_programeList.size();
    }

    public class ProgrameHolder extends RecyclerView.ViewHolder {
        private TextView mTextView_title;
        private ImageView mImageView_image;

        public ProgrameHolder(View itemView) {
            super(itemView);
            mTextView_title = (TextView)itemView.findViewById(R.id.programe_rva_title_tv);
            mImageView_image = (ImageView) itemView.findViewById(R.id.programe_rva_image_iv);
        }
    }
}
