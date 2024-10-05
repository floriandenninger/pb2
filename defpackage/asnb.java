package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum asnb implements aonq {
    UNKNOWN(0),
    FLASHACCESS(1),
    WIDEVINE_CLASSIC(2),
    FAIRPLAY(6),
    CLEARKEY(3),
    WIDEVINE(4),
    PLAYREADY(5);

    public final int h;

    asnb(int i2) {
        this.h = i2;
    }

    public static aons a() {
        return asje.l;
    }

    public static asnb b(int i2) {
        switch (i2) {
            case 0:
                return UNKNOWN;
            case 1:
                return FLASHACCESS;
            case 2:
                return WIDEVINE_CLASSIC;
            case 3:
                return CLEARKEY;
            case 4:
                return WIDEVINE;
            case 5:
                return PLAYREADY;
            case 6:
                return FAIRPLAY;
            default:
                return null;
        }
    }

    @Override // defpackage.aonq
    public final int getNumber() {
        return this.h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.h);
    }
}
