package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum aqme implements aonq {
    DOWNLOAD_RECS_FEATURE_TYPE_UNKNOWN(0),
    DOWNLOAD_RECS_FEATURE_TYPE_DOWNLOAD_RECS(1),
    DOWNLOAD_RECS_FEATURE_TYPE_SMART_DOWNLOADS(2);

    public final int d;

    aqme(int i) {
        this.d = i;
    }

    public static aons a() {
        return aqkw.f;
    }

    public static aqme b(int i) {
        if (i == 0) {
            return DOWNLOAD_RECS_FEATURE_TYPE_UNKNOWN;
        }
        if (i == 1) {
            return DOWNLOAD_RECS_FEATURE_TYPE_DOWNLOAD_RECS;
        }
        if (i != 2) {
            return null;
        }
        return DOWNLOAD_RECS_FEATURE_TYPE_SMART_DOWNLOADS;
    }

    @Override // defpackage.aonq
    public final int getNumber() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.d);
    }
}
