package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vmy implements anhh {
    final /* synthetic */ vmg a;
    final /* synthetic */ boolean b;
    final /* synthetic */ vmz c;

    public vmy(vmz vmzVar, vmg vmgVar, boolean z) {
        this.c = vmzVar;
        this.a = vmgVar;
        this.b = z;
    }

    @Override // defpackage.anhh
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        aodf aodfVar = (aodf) obj;
        synchronized (this) {
            aodi aodiVar = aodfVar.b;
            if (aodiVar == null) {
                aodiVar = aodi.a;
            }
            this.c.c.addAll(aodiVar.e);
            this.c.d.add(this.a.c(aodiVar.e.size()));
            vmz vmzVar = this.c;
            vmzVar.e.j(vnb.b(amru.o(vmzVar.c), 1 == (aodiVar.b & 1), amru.o(this.c.d)));
            vmz vmzVar2 = this.c;
            vmzVar2.g = 1 == (aodiVar.b & 1);
            vmzVar2.n = false;
            vmz vmzVar3 = this.c;
            vmzVar3.f = false;
            if (vmzVar3.g) {
                vlx vlxVar = vmzVar3.a;
                aone createBuilder = aofb.a.createBuilder();
                int i = true != aodiVar.e.isEmpty() ? 109 : 108;
                createBuilder.copyOnWrite();
                aofb aofbVar = (aofb) createBuilder.instance;
                aofbVar.c = i - 1;
                aofbVar.b |= 1;
                vlxVar.a((aofb) createBuilder.build());
            }
            if (this.b && !this.c.d()) {
                vlx vlxVar2 = this.c.a;
                aone createBuilder2 = aofb.a.createBuilder();
                createBuilder2.copyOnWrite();
                aofb aofbVar2 = (aofb) createBuilder2.instance;
                aofbVar2.c = 106;
                aofbVar2.b |= 1;
                long j = this.c.h;
                createBuilder2.copyOnWrite();
                aofb aofbVar3 = (aofb) createBuilder2.instance;
                aofbVar3.b |= 2;
                aofbVar3.d = j;
                vlxVar2.a((aofb) createBuilder2.build());
            }
        }
        this.c.b();
    }

    @Override // defpackage.anhh
    public final void qg(Throwable th) {
        vmd a = this.c.b.a(th);
        aoff e = this.a.e(th);
        this.c.d.add(e);
        vlx vlxVar = this.c.a;
        aone createBuilder = aofc.a.createBuilder();
        aofd b = e.b();
        createBuilder.copyOnWrite();
        aofc aofcVar = (aofc) createBuilder.instance;
        b.getClass();
        aofcVar.c = b;
        aofcVar.b |= 2;
        vlxVar.b((aofc) createBuilder.build());
        vmz vmzVar = this.c;
        vmzVar.e.j(vnb.a(amru.o(vmzVar.c), a, amru.o(this.c.d)));
        this.c.n = false;
        this.c.f = true;
    }
}
