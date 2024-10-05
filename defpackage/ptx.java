package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ptx implements Comparable {
    public int a;
    public int b;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        ptx ptxVar = (ptx) obj;
        int i = this.b;
        int i2 = ptxVar.b;
        return i != i2 ? i - i2 : this.a - ptxVar.a;
    }

    public final String toString() {
        return "Order{order=" + this.b + ", index=" + this.a + '}';
    }
}
