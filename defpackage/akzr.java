package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum akzr implements aonq {
    UNKNOWN(0),
    NOT_CREATED(1),
    SUCCESS(2),
    FAILED(3),
    REJECTED(4),
    DELETED(5);

    public final int g;

    akzr(int i) {
        this.g = i;
    }

    public static akzr a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return NOT_CREATED;
        }
        if (i == 2) {
            return SUCCESS;
        }
        if (i == 3) {
            return FAILED;
        }
        if (i == 4) {
            return REJECTED;
        }
        if (i != 5) {
            return null;
        }
        return DELETED;
    }

    public static aons b() {
        return aduo.i;
    }

    @Override // defpackage.aonq
    public final int getNumber() {
        return this.g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.g);
    }
}
