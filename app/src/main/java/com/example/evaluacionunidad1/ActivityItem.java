package com.example.evaluacionunidad1;

public class ActivityItem {
    private final String name;
    private final String description;
    private final int iconResId;
    private final int progress;
    private final boolean isCompleted;
    private final float rating;

    public ActivityItem(String name, String description, int iconResId, int progress, boolean isCompleted, float rating) {
        this.name = name;
        this.description = description;
        this.iconResId = iconResId;
        this.progress = progress;
        this.isCompleted = isCompleted;
        this.rating = rating;
    }

    public String getName() { return name; }
    public String getDescription() { return description; }
    public int getIconResId() { return iconResId; }
    public int getProgress() { return progress; }
    public boolean isCompleted() { return isCompleted;}
    public float getRating() { return rating; }
}