package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class euf implements Comparable {
    public final long a;
    public final apxf b;

    public euf(long j, apxf apxfVar) {
        this.a = j;
        this.b = apxfVar;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Long.valueOf(this.a).compareTo(Long.valueOf(((euf) obj).a));
    }
}
