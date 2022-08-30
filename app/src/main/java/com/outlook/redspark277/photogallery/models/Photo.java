package com.outlook.redspark277.photogallery.models;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.Date;
import java.util.List;

public class Photo implements Parcelable {
    private String id;
    private Date created_at;
    private Date updated_at;
    private Date promoted_at;
    private int width;
    private int height;
    private String color;
    private String blur_hash;
    private String description;
    private String alt_description;
    private Urls urls;
    private Links links;
    private List<Object> categories;
    private int likes;
    private boolean liked_by_user;
    private List<Object> current_user_collections;
    private Sponsorship sponsorship;
    private User user;

    public Photo(String id, Date created_at, Date updated_at, Date promoted_at, int width, int height, String color, String blur_hash, String description, String alt_description, Urls urls, Links links, List<Object> categories, int likes, boolean liked_by_user, List<Object> current_user_collections, Sponsorship sponsorship, User user) {
        this.id = id;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.promoted_at = promoted_at;
        this.width = width;
        this.height = height;
        this.color = color;
        this.blur_hash = blur_hash;
        this.description = description;
        this.alt_description = alt_description;
        this.urls = urls;
        this.links = links;
        this.categories = categories;
        this.likes = likes;
        this.liked_by_user = liked_by_user;
        this.current_user_collections = current_user_collections;
        this.sponsorship = sponsorship;
        this.user = user;
    }

    protected Photo(Parcel in) {
        id = in.readString();
        width = in.readInt();
        height = in.readInt();
        color = in.readString();
        blur_hash = in.readString();
        description = in.readString();
        alt_description = in.readString();
        urls = in.readParcelable(Urls.class.getClassLoader());
        links = in.readParcelable(Links.class.getClassLoader());
        likes = in.readInt();
        liked_by_user = in.readByte() != 0;
        sponsorship = in.readParcelable(Sponsorship.class.getClassLoader());
        user = in.readParcelable(User.class.getClassLoader());
    }

    public static final Creator<Photo> CREATOR = new Creator<Photo>() {
        @Override
        public Photo createFromParcel(Parcel in) {
            return new Photo(in);
        }

        @Override
        public Photo[] newArray(int size) {
            return new Photo[size];
        }
    };

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }

    public Date getPromoted_at() {
        return promoted_at;
    }

    public void setPromoted_at(Date promoted_at) {
        this.promoted_at = promoted_at;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBlur_hash() {
        return blur_hash;
    }

    public void setBlur_hash(String blur_hash) {
        this.blur_hash = blur_hash;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAlt_description() {
        return alt_description;
    }

    public void setAlt_description(String alt_description) {
        this.alt_description = alt_description;
    }

    public Urls getUrls() {
        return urls;
    }

    public void setUrls(Urls urls) {
        this.urls = urls;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public List<Object> getCategories() {
        return categories;
    }

    public void setCategories(List<Object> categories) {
        this.categories = categories;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public boolean isLiked_by_user() {
        return liked_by_user;
    }

    public void setLiked_by_user(boolean liked_by_user) {
        this.liked_by_user = liked_by_user;
    }

    public List<Object> getCurrent_user_collections() {
        return current_user_collections;
    }

    public void setCurrent_user_collections(List<Object> current_user_collections) {
        this.current_user_collections = current_user_collections;
    }

    public Sponsorship getSponsorship() {
        return sponsorship;
    }

    public void setSponsorship(Sponsorship sponsorship) {
        this.sponsorship = sponsorship;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(id);
        dest.writeInt(width);
        dest.writeInt(height);
        dest.writeString(color);
        dest.writeString(blur_hash);
        dest.writeString(description);
        dest.writeString(alt_description);
        dest.writeParcelable(urls, flags);
        dest.writeParcelable(links, flags);
        dest.writeInt(likes);
        dest.writeByte((byte) (liked_by_user ? 1 : 0));
        dest.writeParcelable(sponsorship, flags);
        dest.writeParcelable(user, flags);
    }
}
