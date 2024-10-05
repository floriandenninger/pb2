package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum aaeb {
    PRODUCTION("https://youtubei.googleapis.com"),
    STAGING("https://green-youtubei.sandbox.googleapis.com"),
    RELEASE("https://release-youtubei.sandbox.googleapis.com"),
    TEST("https://test-youtubei.sandbox.googleapis.com"),
    CAMI("http://cami-youtubei.sandbox.googleapis.com"),
    uYTFE("https://uytfe.sandbox.google.com"),
    PPG("http://127.0.0.1:8787"),
    UBERDEMO("No default address as the demo is dynamically created when needed.");

    public final Uri i;

    aaeb(String str) {
        this.i = Uri.parse(str);
    }

    public static aaeb a() {
        return values()[0];
    }
}
