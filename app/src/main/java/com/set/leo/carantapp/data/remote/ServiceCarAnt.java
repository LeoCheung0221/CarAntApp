package com.set.leo.carantapp.data.remote;


import okhttp3.OkHttpClient;

/**
 * author：leo on 2016/5/30 09:54
 * email： leocheung4ever@gmail.com
 * description: Base api
 * what & why is modified:
 */
public interface ServiceCarAnt {

    /**
     * Factory class that sets up a new carant service
     */
    class Factory {

        public static ServiceCarAnt initializeApi() {
            OkHttpClient okHttpClient = new OkHttpClient();

            return null;
        }
    }
}
