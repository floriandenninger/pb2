package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum axdm implements aonq {
    PREVIEW_MODE_UNSPECIFIED(0),
    PREVIEW_MODE_REGULAR(1),
    PREVIEW_MODE_MINI(2);

    public final int d;

    axdm(int i) {
        this.d = i;
    }

    public static aons a() {
        return axcs.d;
    }

    public static axdm b(int i) {
        if (i == 0) {
            return PREVIEW_MODE_UNSPECIFIED;
        }
        if (i == 1) {
            return PREVIEW_MODE_REGULAR;
        }
        if (i != 2) {
            return null;
        }
        return PREVIEW_MODE_MINI;
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
