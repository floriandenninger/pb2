package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum babu implements aonq {
    REQUEST_STATUS_UNSPECIFIED(0),
    SUCCEEDED(1),
    FAILED(2),
    CANCELED(3);

    public final int e;

    babu(int i) {
        this.e = i;
    }

    public static aons a() {
        return babw.b;
    }

    public static babu b(int i) {
        if (i == 0) {
            return REQUEST_STATUS_UNSPECIFIED;
        }
        if (i == 1) {
            return SUCCEEDED;
        }
        if (i == 2) {
            return FAILED;
        }
        if (i != 3) {
            return null;
        }
        return CANCELED;
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
