package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vmt implements anhh {
    final /* synthetic */ vmg a;
    final /* synthetic */ vmu b;

    public vmt(vmu vmuVar, vmg vmgVar) {
        this.b = vmuVar;
        this.a = vmgVar;
    }

    @Override // defpackage.anhh
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ammv ammvVar;
        aodi aodiVar = ((aodb) obj).b;
        if (aodiVar == null) {
            aodiVar = aodi.a;
        }
        vmu vmuVar = this.b;
        if ((aodiVar.b & 1) != 0) {
            ammvVar = ammv.j(aodiVar.c);
        } else {
            ammvVar = amlr.a;
        }
        vmuVar.h = ammvVar;
        vmu vmuVar2 = this.b;
        vmuVar2.g = 1 == (aodiVar.b & 1);
        vmuVar2.b.addAll(aodiVar.e);
        this.b.c.add(this.a.c(aodiVar.e.size()));
        vmu vmuVar3 = this.b;
        aow aowVar = vmuVar3.d;
        amru o = amru.o(vmuVar3.b);
        int i = aodiVar.b;
        aowVar.j(vnb.b(o, 1 == (i & 1), amru.o(this.b.c)));
        this.b.l = false;
        vmu vmuVar4 = this.b;
        vmuVar4.f = false;
        vmuVar4.a();
    }

    @Override // defpackage.anhh
    public final void qg(Throwable th) {
        vmd a = this.b.a.a(th);
        this.b.c.add(this.a.e(th));
        vmu vmuVar = this.b;
        vmuVar.d.j(vnb.a(amru.o(vmuVar.b), a, amru.o(this.b.c)));
        this.b.l = false;
        this.b.f = true;
    }
}
