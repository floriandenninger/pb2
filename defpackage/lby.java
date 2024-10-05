package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lby implements anhh {
    final /* synthetic */ lbz a;
    private final /* synthetic */ int b;

    public lby(lbz lbzVar, int i) {
        this.b = i;
        this.a = lbzVar;
    }

    @Override // defpackage.anhh
    public final void qg(Throwable th) {
        if (this.b != 0) {
            if (th instanceof CancellationException) {
                return;
            }
            this.a.aP.r("Error fetching cached zero-prefix search suggestions", th);
            zga.m("Error fetching cached zero-prefix search suggestions", th.toString());
            return;
        }
        if (th instanceof CancellationException) {
            return;
        }
        this.a.aP.r("Error fetching search suggestions", th);
        zga.m("Error fetching search suggestions", th.toString());
    }

    @Override // defpackage.anhh
    public final /* synthetic */ void b(Object obj) {
        if (this.b == 0) {
            aken akenVar = (aken) obj;
            anhy anhyVar = this.a.aA;
            if (anhyVar != null) {
                anhyVar.cancel(true);
            }
            if (this.a.aI.equals(akenVar.a)) {
                this.a.aH(akenVar);
                return;
            }
            return;
        }
        aken akenVar2 = (aken) obj;
        if (this.a.aI.equals(akenVar2.a)) {
            this.a.aH(akenVar2);
        }
    }
}
