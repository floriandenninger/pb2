package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class vup implements Comparable {
    public final int a;
    public final vuo b;
    public boolean c = false;

    public vup(int i, vuo vuoVar) {
        this.a = i;
        this.b = vuoVar;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int i = this.a;
        int i2 = ((vup) obj).a;
        if (i < i2) {
            return -1;
        }
        return i != i2 ? 1 : 0;
    }
}
