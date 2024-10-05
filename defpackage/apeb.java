package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum apeb implements aonq {
    ANDROID_PLAY_STORE_ENDPOINT_INTENT_TYPE_UNKNOWN(0),
    ANDROID_PLAY_STORE_ENDPOINT_INTENT_TYPE_CLIENT_URL_PLAY_STORE(1),
    ANDROID_PLAY_STORE_ENDPOINT_INTENT_TYPE_FINSKY(2),
    ANDROID_PLAY_STORE_ENDPOINT_INTENT_TYPE_ALLEY_OOP(3);

    public final int e;

    apeb(int i) {
        this.e = i;
    }

    public static aons a() {
        return apaf.t;
    }

    public static apeb b(int i) {
        if (i == 0) {
            return ANDROID_PLAY_STORE_ENDPOINT_INTENT_TYPE_UNKNOWN;
        }
        if (i == 1) {
            return ANDROID_PLAY_STORE_ENDPOINT_INTENT_TYPE_CLIENT_URL_PLAY_STORE;
        }
        if (i == 2) {
            return ANDROID_PLAY_STORE_ENDPOINT_INTENT_TYPE_FINSKY;
        }
        if (i != 3) {
            return null;
        }
        return ANDROID_PLAY_STORE_ENDPOINT_INTENT_TYPE_ALLEY_OOP;
    }

    @Override // defpackage.aonq
    public final int getNumber() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.e);
    }
}
