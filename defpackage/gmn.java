package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class gmn implements Comparable {
    int a;
    int b;
    final long c;

    public gmn(int i, int i2, long j) {
        this.a = i;
        this.b = i2;
        this.c = j;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.b - ((gmn) obj).b;
    }
}
