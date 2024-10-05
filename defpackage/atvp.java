package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum atvp implements aonq {
    PHOTO_UPLOAD_STATUS_UNSPECIFIED(0),
    PHOTO_UPLOAD_STATUS_UPLOADING(1),
    PHOTO_UPLOAD_STATUS_FAILED(2);

    public final int d;

    atvp(int i) {
        this.d = i;
    }

    public static aons a() {
        return atqp.p;
    }

    public static atvp b(int i) {
        if (i == 0) {
            return PHOTO_UPLOAD_STATUS_UNSPECIFIED;
        }
        if (i == 1) {
            return PHOTO_UPLOAD_STATUS_UPLOADING;
        }
        if (i != 2) {
            return null;
        }
        return PHOTO_UPLOAD_STATUS_FAILED;
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
