package defpackage;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vmp implements anhh {
    final /* synthetic */ vmg a;
    final /* synthetic */ vmq b;

    public vmp(vmq vmqVar, vmg vmgVar) {
        this.b = vmqVar;
        this.a = vmgVar;
    }

    @Override // defpackage.anhh
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        aodd aoddVar = (aodd) obj;
        synchronized (this) {
            List list = this.b.c;
            aocv aocvVar = aoddVar.b;
            if (aocvVar == null) {
                aocvVar = aocv.a;
            }
            list.addAll(aocvVar.d);
            List list2 = this.b.d;
            vmg vmgVar = this.a;
            aocv aocvVar2 = aoddVar.b;
            if (aocvVar2 == null) {
                aocvVar2 = aocv.a;
            }
            list2.add(vmgVar.c(aocvVar2.d.size()));
            vmq vmqVar = this.b;
            aow aowVar = vmqVar.e;
            amru o = amru.o(vmqVar.c);
            aocv aocvVar3 = aoddVar.b;
            if (aocvVar3 == null) {
                aocvVar3 = aocv.a;
            }
            int i = aocvVar3.b & 1;
            aowVar.j(new vmr(o, amlr.a, 1 == i, amru.o(this.b.d)));
            vmq vmqVar2 = this.b;
            aocv aocvVar4 = aoddVar.b;
            if (aocvVar4 == null) {
                aocvVar4 = aocv.a;
            }
            vmqVar2.g = 1 == (aocvVar4.b & 1);
            this.b.k = false;
            this.b.f = false;
        }
        this.b.b();
    }

    @Override // defpackage.anhh
    public final void qg(Throwable th) {
        vmd a = this.b.a.a(th);
        aoff e = this.a.e(th);
        this.b.d.add(e);
        vlx vlxVar = this.b.b;
        aone createBuilder = aofc.a.createBuilder();
        aofd b = e.b();
        createBuilder.copyOnWrite();
        aofc aofcVar = (aofc) createBuilder.instance;
        b.getClass();
        aofcVar.c = b;
        aofcVar.b |= 2;
        vlxVar.b((aofc) createBuilder.build());
        vmq vmqVar = this.b;
        vmqVar.e.j(new vmr(amru.o(vmqVar.c), ammv.j(a), true, amru.o(this.b.d)));
        this.b.k = false;
        this.b.f = true;
    }
}
