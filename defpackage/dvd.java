package defpackage;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public final class dvd {
    public static final dvd a = new dvd(-1, -2);
    public static final dvd b = new dvd(320, 50);
    public static final dvd c = new dvd(300, 250);
    public static final dvd d = new dvd(468, 60);
    public static final dvd e = new dvd(728, 90);
    public static final dvd f = new dvd(160, 600);
    public final puh g;

    private dvd(int i, int i2) {
        this(new puh(i, i2));
    }

    public dvd(puh puhVar) {
        this.g = puhVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dvd) {
            return this.g.equals(((dvd) obj).g);
        }
        return false;
    }

    public final int hashCode() {
        return this.g.hashCode();
    }

    public final String toString() {
        return this.g.e;
    }
}
