package app.coolweather.com.coolweather.util;

/**
 * Created by qing on 2016/4/22.
 */
public interface HttpCallbackListener {
    void onFinish(String response);

    void onError(Exception e);
}
