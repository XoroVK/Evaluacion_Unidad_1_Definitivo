package com.example.evaluacionunidad1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class ActivityAdapter extends RecyclerView.Adapter<ActivityAdapter.ActivityViewHolder> {

    private final List<ActivityItem> activityList;

    public ActivityAdapter(List<ActivityItem> activityList) {
        this.activityList = activityList;
    }

    @NonNull
    @Override
    public ActivityViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_activity, parent, false);
        return new ActivityViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ActivityViewHolder holder, int position) {
        ActivityItem item = activityList.get(position);
        holder.activityName.setText(item.getName());
        holder.activityDescription.setText(item.getDescription());
        holder.activityIcon.setImageResource(item.getIconResId());
        holder.activityProgress.setProgress(item.getProgress());
        holder.activityCheckbox.setChecked(item.isCompleted());

        holder.activityProgress.setProgress(item.getProgress());
        holder.activityProgressText.setText(item.getProgress() + "%");
        holder.ratingMessage.setText("¿Cómo calificarías esta Actividad?");
        holder.activityRatingBar.setRating(item.getRating());
    }

    @Override
    public int getItemCount() {
        return activityList.size();
    }

    static class ActivityViewHolder extends RecyclerView.ViewHolder {
        final ImageView activityIcon;
        final TextView activityName;
        final TextView activityDescription;
        final ProgressBar activityProgress;
        final TextView activityProgressText;
        final CheckBox activityCheckbox;
        final RatingBar activityRatingBar;
        final TextView ratingMessage;

        ActivityViewHolder(View itemView) {
            super(itemView);
            activityIcon = itemView.findViewById(R.id.activity_icon);
            activityName = itemView.findViewById(R.id.activity_name);
            activityDescription = itemView.findViewById(R.id.activity_description);
            activityProgress = itemView.findViewById(R.id.activity_progress);
            activityProgressText = itemView.findViewById(R.id.activity_progress_text);
            activityCheckbox = itemView.findViewById(R.id.activity_checkbox);
            activityRatingBar = itemView.findViewById(R.id.activity_rating_bar);
            ratingMessage = itemView.findViewById(R.id.rating_message);
        }
    }
}