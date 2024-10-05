package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
abstract class cpr implements Runnable, Comparable {
    private final int a;

    public cpr(cof cofVar) {
        this.a = cofVar.ordinal();
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int i = ((cpr) obj).a;
        int i2 = this.a;
        if (i > i2) {
            return -1;
        }
        return i < i2 ? 1 : 0;
    }
}
