package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum apdh implements aonq {
    ANDROID_MEDIA_CACHE_WIPEOUT_REASON_UNKNOWN(0),
    ANDROID_MEDIA_CACHE_WIPEOUT_REASON_ON_ACCOUNT_REMOVED(1);

    public final int c;

    apdh(int i) {
        this.c = i;
    }

    public static aons a() {
        return apaf.k;
    }

    public static apdh b(int i) {
        if (i == 0) {
            return ANDROID_MEDIA_CACHE_WIPEOUT_REASON_UNKNOWN;
        }
        if (i != 1) {
            return null;
        }
        return ANDROID_MEDIA_CACHE_WIPEOUT_REASON_ON_ACCOUNT_REMOVED;
    }

    @Override // defpackage.aonq
    public final int getNumber() {
        return this.c;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.c);
    }
}
