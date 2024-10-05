package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rkb implements Runnable {
    final /* synthetic */ rki a;

    public rkb(rki rkiVar) {
        this.a = rkiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rki rkiVar = this.a;
        rkiVar.v();
        rkiVar.h = new rgf(rkiVar);
        req reqVar = new req(rkiVar);
        reqVar.W();
        rkiVar.b = reqVar;
        rem g = rkiVar.g();
        rgm rgmVar = rkiVar.a;
        qip.an(rgmVar);
        g.a = rgmVar;
        rjk rjkVar = new rjk(rkiVar);
        rjkVar.W();
        rkiVar.g = rjkVar;
        rej rejVar = new rej(rkiVar);
        rejVar.W();
        rkiVar.e = rejVar;
        rii riiVar = new rii(rkiVar);
        riiVar.W();
        rkiVar.f = riiVar;
        rjy rjyVar = new rjy(rkiVar);
        rjyVar.W();
        rkiVar.d = rjyVar;
        rkiVar.c = new rfw(rkiVar);
        if (rkiVar.m != rkiVar.n) {
            rkiVar.aF().c.c("Not all upload components initialized", Integer.valueOf(rkiVar.m), Integer.valueOf(rkiVar.n));
        }
        rkiVar.j = true;
        rki rkiVar2 = this.a;
        rkiVar2.v();
        rkiVar2.j().u();
        if (rkiVar2.g.c.a() == 0) {
            rfz rfzVar = rkiVar2.g.c;
            rkiVar2.T();
            rfzVar.b(System.currentTimeMillis());
        }
        rkiVar2.K();
    }
}
