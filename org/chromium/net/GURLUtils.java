package org.chromium.net;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class GURLUtils {

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public interface Natives {
        String getOrigin(String str);
    }

    public static String getOrigin(String str) {
        return GURLUtilsJni.get().getOrigin(str);
    }
}
