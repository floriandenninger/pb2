package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ayez implements Runnable {
    final ayex a;
    final /* synthetic */ String b;
    final /* synthetic */ aycd c;
    final /* synthetic */ aych d;
    final /* synthetic */ ayoa e;
    final /* synthetic */ axzo f;
    final /* synthetic */ ayfa g;

    public ayez(ayfa ayfaVar, String str, aycd aycdVar, aych aychVar, ayoa ayoaVar, axzo axzoVar) {
        this.g = ayfaVar;
        this.b = str;
        this.c = aycdVar;
        this.d = aychVar;
        this.e = ayoaVar;
        this.f = axzoVar;
        this.a = new ayex(str, ayfaVar.a, ayfaVar.e, aycdVar, ayfaVar, this, ayfaVar.c, ayfaVar.f, aychVar, ayoaVar, axzoVar, ayfaVar.g);
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.g.c) {
            ayfa ayfaVar = this.g;
            if (ayfaVar.h) {
                this.a.p.f(ayfaVar.i, true, new aycd());
            } else if (ayfaVar.j) {
                ayex ayexVar = this.a;
                ayfaVar.d.add(ayexVar);
                ayexVar.p.z.o = ayfaVar.k;
            } else {
                throw new AssertionError("Transport is not started");
            }
        }
    }
}
