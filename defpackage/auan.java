package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum auan implements aonq {
    UNKNOWN(0),
    STANDARD(1),
    FULLSCREEN(2),
    MINI(3),
    BACKGROUND(4);

    private final int g;

    auan(int i) {
        this.g = i;
    }

    public static aons a() {
        return atxj.j;
    }

    public static auan b(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return STANDARD;
        }
        if (i == 2) {
            return FULLSCREEN;
        }
        if (i == 3) {
            return MINI;
        }
        if (i != 4) {
            return null;
        }
        return BACKGROUND;
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
