package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aelo extends Exception {
    public final int a;

    public aelo(int i, String str) {
        super(str);
        this.a = i;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof aelo) && this.a == ((aelo) obj).a);
    }

    public final int hashCode() {
        throw new UnsupportedOperationException();
    }
}
