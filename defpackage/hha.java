package defpackage;

import java.io.File;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class hha implements hga {
    final /* synthetic */ hhd a;

    public hha(hhd hhdVar) {
        this.a = hhdVar;
    }

    @Override // defpackage.hga
    public final void a() {
        hgb hgbVar = this.a.aq;
        if (hgbVar != null) {
            hgbVar.z();
        }
    }

    @Override // defpackage.hga
    public final void b(boolean z) {
        hhe hheVar;
        bue bueVar = this.a.C;
        if (!(bueVar instanceof hhe) || (hheVar = (hhe) bueVar) == null) {
            return;
        }
        hheVar.c();
    }

    @Override // defpackage.hga
    public final void c() {
        hoy k = this.a.b.k();
        hpa hpaVar = k.a;
        if (hpaVar instanceof how) {
            ((how) hpaVar).s(null);
        }
        k.b = amlr.a;
        new File(k.d).delete();
        k.d = "";
        this.a.aI();
        hgb hgbVar = this.a.aq;
        if (hgbVar != null) {
            hgbVar.z();
        }
    }
}
