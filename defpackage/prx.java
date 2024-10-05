package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class prx implements Comparable {
    public final int a;
    public final prt b;

    public prx(int i, prt prtVar) {
        this.a = i;
        this.b = prtVar;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int i = this.a;
        int i2 = ((prx) obj).a;
        if (i == i2) {
            return 0;
        }
        return i >= i2 ? 1 : -1;
    }
}
