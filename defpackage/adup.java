package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum adup implements aonq {
    ABR_STATE_CHANGE_UNSPECIFIED(0),
    ABR_STATE_CHANGE_NETWORK_CONNECTION_TYPE(1),
    ABR_STATE_CHANGE_MANUAL_QUALITY_SELECTION(2);

    public final int d;

    adup(int i) {
        this.d = i;
    }

    public static adup a(int i) {
        if (i == 0) {
            return ABR_STATE_CHANGE_UNSPECIFIED;
        }
        if (i == 1) {
            return ABR_STATE_CHANGE_NETWORK_CONNECTION_TYPE;
        }
        if (i != 2) {
            return null;
        }
        return ABR_STATE_CHANGE_MANUAL_QUALITY_SELECTION;
    }

    public static aons b() {
        return aduo.a;
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
