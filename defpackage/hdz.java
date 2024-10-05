package defpackage;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hdz implements hga {
    final /* synthetic */ hel a;

    public hdz(hel helVar) {
        this.a = helVar;
    }

    @Override // defpackage.hga
    public final void a() {
        this.a.aZ.z();
    }

    @Override // defpackage.hga
    public final void b(boolean z) {
        hei heiVar = this.a.e;
        if (heiVar != null) {
            ((hmc) heiVar).an.f(z);
            this.a.aG();
        }
    }

    @Override // defpackage.hga
    public final void c() {
        hou a;
        hos hosVar = this.a.ai;
        hpa hpaVar = (hpa) hosVar.a.ar();
        if (hpaVar != null) {
            hot a2 = hou.a();
            String str = hpaVar.k;
            if (str != null) {
                a2.a = str;
            }
            List list = hpaVar.j;
            if (list != null) {
                a2.b = amru.o(list);
            }
            String str2 = (String) hpaVar.f().f();
            if (str2 != null) {
                a2.c = str2;
            }
            a = a2.a();
        } else {
            a = hou.a().a();
        }
        hosVar.h(a);
        this.a.aZ.z();
    }
}
