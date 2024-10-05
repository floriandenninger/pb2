package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aomv {
    private final Object a;
    private final int b;

    public aomv(Object obj, int i) {
        this.a = obj;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aomv)) {
            return false;
        }
        aomv aomvVar = (aomv) obj;
        return this.a == aomvVar.a && this.b == aomvVar.b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * 65535) + this.b;
    }
}
