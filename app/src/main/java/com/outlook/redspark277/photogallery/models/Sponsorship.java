package com.outlook.redspark277.photogallery.models;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

public class Sponsorship implements Parcelable {
    private List<String> impression_urls;
    private String tagline;
    private String tagline_url;
    private Sponsor sponsor;

    public Sponsorship(List<String> impression_urls, String tagline, String tagline_url, Sponsor sponsor) {
        this.impression_urls = impression_urls;
        this.tagline = tagline;
        this.tagline_url = tagline_url;
        this.sponsor = sponsor;
    }

    protected Sponsorship(Parcel in) {
        impression_urls = in.createStringArrayList();
        tagline = in.readString();
        tagline_url = in.readString();
    }

    public static final Creator<Sponsorship> CREATOR = new Creator<Sponsorship>() {
        @Override
        public Sponsorship createFromParcel(Parcel in) {
            return new Sponsorship(in);
        }

        @Override
        public Sponsorship[] newArray(int size) {
            return new Sponsorship[size];
        }
    };

    public List<String> getImpression_urls() {
        return impression_urls;
    }

    public void setImpression_urls(List<String> impression_urls) {
        this.impression_urls = impression_urls;
    }

    public String getTagline() {
        return tagline;
    }

    public void setTagline(String tagline) {
        this.tagline = tagline;
    }

    public String getTagline_url() {
        return tagline_url;
    }

    public void setTagline_url(String tagline_url) {
        this.tagline_url = tagline_url;
    }

    public Sponsor getSponsor() {
        return sponsor;
    }

    public void setSponsor(Sponsor sponsor) {
        this.sponsor = sponsor;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeStringList(impression_urls);
        dest.writeString(tagline);
        dest.writeString(tagline_url);
    }
}
