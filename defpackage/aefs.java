package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aefs extends Exception {
    public final int a;

    public aefs(int i, String str) {
        super(str);
        this.a = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof aefs) && this.a == ((aefs) obj).a;
    }

    public final int hashCode() {
        throw new UnsupportedOperationException();
    }

    public aefs(String str, Exception exc) {
        super(str, exc);
        this.a = 5;
    }
}
