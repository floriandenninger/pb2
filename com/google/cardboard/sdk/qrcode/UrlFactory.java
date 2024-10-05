package com.google.cardboard.sdk.qrcode;

import android.net.Uri;
import android.util.Log;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class UrlFactory {
    private static final String HTTPS_SCHEME = "https";
    public static final String TAG = "UrlFactory";

    public HttpURLConnection openHttpsConnection(Uri uri) {
        try {
            URLConnection openConnection = new URL(uri.buildUpon().scheme(HTTPS_SCHEME).build().toString()).openConnection();
            if (!(openConnection instanceof HttpURLConnection)) {
                Log.w(TAG, "Expected HttpURLConnection");
                throw new IllegalArgumentException("Expected HttpURLConnection");
            }
            return (HttpURLConnection) openConnection;
        } catch (MalformedURLException e) {
            Log.w(TAG, e.toString());
            return null;
        }
    }
}
