package com.outlook.redspark277.photogallery.models;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.Date;

public class Sponsor implements Parcelable {
    private String id;
    private Date updated_at;
    private String username;
    private String name;
    private String first_name;
    private Object last_name;
    private String twitter_username;
    private String portfolio_url;
    private String bio;
    private Object location;
    private Links links;
    private ProfileImage profile_image;
    private String instagram_username;
    private int total_collections;
    private int total_likes;
    private int total_photos;
    private boolean accepted_tos;

    public Sponsor(String id, Date updated_at, String username, String name, String first_name, Object last_name, String twitter_username, String portfolio_url, String bio, Object location, Links links, ProfileImage profile_image, String instagram_username, int total_collections, int total_likes, int total_photos, boolean accepted_tos) {
        this.id = id;
        this.updated_at = updated_at;
        this.username = username;
        this.name = name;
        this.first_name = first_name;
        this.last_name = last_name;
        this.twitter_username = twitter_username;
        this.portfolio_url = portfolio_url;
        this.bio = bio;
        this.location = location;
        this.links = links;
        this.profile_image = profile_image;
        this.instagram_username = instagram_username;
        this.total_collections = total_collections;
        this.total_likes = total_likes;
        this.total_photos = total_photos;
        this.accepted_tos = accepted_tos;
    }

    protected Sponsor(Parcel in) {
        id = in.readString();
        username = in.readString();
        name = in.readString();
        first_name = in.readString();
        twitter_username = in.readString();
        portfolio_url = in.readString();
        bio = in.readString();
        instagram_username = in.readString();
        total_collections = in.readInt();
        total_likes = in.readInt();
        total_photos = in.readInt();
        accepted_tos = in.readByte() != 0;
    }

    public static final Creator<Sponsor> CREATOR = new Creator<Sponsor>() {
        @Override
        public Sponsor createFromParcel(Parcel in) {
            return new Sponsor(in);
        }

        @Override
        public Sponsor[] newArray(int size) {
            return new Sponsor[size];
        }
    };

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public Object getLast_name() {
        return last_name;
    }

    public void setLast_name(Object last_name) {
        this.last_name = last_name;
    }

    public String getTwitter_username() {
        return twitter_username;
    }

    public void setTwitter_username(String twitter_username) {
        this.twitter_username = twitter_username;
    }

    public String getPortfolio_url() {
        return portfolio_url;
    }

    public void setPortfolio_url(String portfolio_url) {
        this.portfolio_url = portfolio_url;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public Object getLocation() {
        return location;
    }

    public void setLocation(Object location) {
        this.location = location;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public ProfileImage getProfile_image() {
        return profile_image;
    }

    public void setProfile_image(ProfileImage profile_image) {
        this.profile_image = profile_image;
    }

    public String getInstagram_username() {
        return instagram_username;
    }

    public void setInstagram_username(String instagram_username) {
        this.instagram_username = instagram_username;
    }

    public int getTotal_collections() {
        return total_collections;
    }

    public void setTotal_collections(int total_collections) {
        this.total_collections = total_collections;
    }

    public int getTotal_likes() {
        return total_likes;
    }

    public void setTotal_likes(int total_likes) {
        this.total_likes = total_likes;
    }

    public int getTotal_photos() {
        return total_photos;
    }

    public void setTotal_photos(int total_photos) {
        this.total_photos = total_photos;
    }

    public boolean isAccepted_tos() {
        return accepted_tos;
    }

    public void setAccepted_tos(boolean accepted_tos) {
        this.accepted_tos = accepted_tos;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(id);
        dest.writeString(username);
        dest.writeString(name);
        dest.writeString(first_name);
        dest.writeString(twitter_username);
        dest.writeString(portfolio_url);
        dest.writeString(bio);
        dest.writeString(instagram_username);
        dest.writeInt(total_collections);
        dest.writeInt(total_likes);
        dest.writeInt(total_photos);
        dest.writeByte((byte) (accepted_tos ? 1 : 0));
    }
}
