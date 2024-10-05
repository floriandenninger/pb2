package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class aggr implements Runnable {
    public final /* synthetic */ aghc a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    private final /* synthetic */ int d;

    public /* synthetic */ aggr(aghc aghcVar, String str, long j, int i) {
        this.d = i;
        this.a = aghcVar;
        this.b = str;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.d == 0) {
            aghc aghcVar = this.a;
            String str = this.b;
            long j = this.c;
            if (aghcVar.h.z()) {
                ((agil) aghcVar.k.get()).U(str, j);
                return;
            }
            return;
        }
        aghc aghcVar2 = this.a;
        String str2 = this.b;
        long j2 = this.c;
        if (aghcVar2.h.z()) {
            ((agil) aghcVar2.k.get()).T(str2, j2);
            str2.length();
            aghcVar2.h.v(new aglg(str2));
        }
    }
}
