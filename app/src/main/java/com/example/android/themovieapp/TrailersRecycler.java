//package com.example.android.themovieapp;
//
//import android.content.Context;
//import android.support.v7.widget.RecyclerView;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ImageView;
//
//import com.squareup.picasso.Picasso;
//
//import java.util.ArrayList;
//
///**
// * Created by Abshafi on 8/14/2016.
// */
//public class TrailersRecycler extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
//
//    private Context context;
//    private ArrayList<TrailersData> array;
//    private LayoutInflater inflater;
//    private RecyclerViewAdapter.Clicklistener clicklistener;
//
//    public TrailersRecycler(Context context, ArrayList<TrailersData> array) {
//        this.context = context;
//        this.array = array;
//        this.inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//    }
//
//    public class ViewHolder extends RecyclerView.ViewHolder {
//
//        ImageView image;
//
//
//        public ViewHolder(View itemView) {
//            super(itemView);
//
//
//            image = (ImageView) itemView.findViewById(R.id.oneMovieBlockImageView);
//
//
//        }
//
//
//
//
//    }
//
//
//
//    @Override
//    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//        View rootview = inflater.inflate(R.layout.movie_block,parent,false);
//
//        ViewHolder viewHolder = new ViewHolder(rootview);
//
//        return viewHolder;
//    }
//
//    @Override
//    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
//        Picasso.with(context).load(array.get(position).ge).into(holder.image);
//    }
//
//    @Override
//    public int getItemCount() {
//        return 0;
//    }
//}
