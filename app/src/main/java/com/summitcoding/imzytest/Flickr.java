package com.summitcoding.imzytest;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Logan on 9/14/2016.
 */
public class Flickr {
    private String text;
    private int page;
    private int pages;
    private int perpage;
    public String total;
    private List<FlickrPhoto> photo;
    private String stat;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPerpage() {
        return perpage;
    }

    public void setPerpage(int perpage) {
        this.perpage = perpage;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public List<FlickrPhoto> getPhoto() {
        return photo;
    }

    public void setPhoto(List<FlickrPhoto> photo) {
        this.photo = photo;
    }

    public String getStat() {
        return stat;
    }

    public void setStat(String stat) {
        this.stat = stat;
    }

    public class FlickrPhoto {
        private String id;
        private String owner;
        private String secret;
        private String server;
        private int farm;
        private String title;
        private int ispublic;
        private int isfriend;
        private int isfamily;

        public int getFarm() {
            return farm;
        }

        public void setFarm(int farm) {
            this.farm = farm;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getOwner() {
            return owner;
        }

        public void setOwner(String owner) {
            this.owner = owner;
        }

        public String getSecret() {
            return secret;
        }

        public void setSecret(String secret) {
            this.secret = secret;
        }

        public String getServer() {
            return server;
        }

        public void setServer(String server) {
            this.server = server;
        }


        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getIspublic() {
            return ispublic;
        }

        public void setIspublic(int ispublic) {
            this.ispublic = ispublic;
        }

        public int getIsfriend() {
            return isfriend;
        }

        public void setIsfriend(int isfriend) {
            this.isfriend = isfriend;
        }

        public int getIsfamily() {
            return isfamily;
        }

        public void setIsfamily(int isfamily) {
            this.isfamily = isfamily;
        }
    }
}
