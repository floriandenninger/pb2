package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum arbx implements aonq {
    GMS_DEVICE_CHECK_TYPE_UNKNOWN(0),
    GMS_DEVICE_CHECK_TYPE_SUCCESS(1),
    GMS_DEVICE_CHECK_TYPE_CONTINUE(2),
    GMS_DEVICE_CHECK_TYPE_FAILED(3),
    GMS_DEVICE_CHECK_TYPE_SUCCESS_NO_BROWSER(4);

    public final int f;

    arbx(int i) {
        this.f = i;
    }

    public static aons a() {
        return aqze.g;
    }

    public static arbx b(int i) {
        if (i == 0) {
            return GMS_DEVICE_CHECK_TYPE_UNKNOWN;
        }
        if (i == 1) {
            return GMS_DEVICE_CHECK_TYPE_SUCCESS;
        }
        if (i == 2) {
            return GMS_DEVICE_CHECK_TYPE_CONTINUE;
        }
        if (i == 3) {
            return GMS_DEVICE_CHECK_TYPE_FAILED;
        }
        if (i != 4) {
            return null;
        }
        return GMS_DEVICE_CHECK_TYPE_SUCCESS_NO_BROWSER;
    }

    @Override // defpackage.aonq
    public final int getNumber() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}
