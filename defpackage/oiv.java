package defpackage;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class oiv extends lo {
    final /* synthetic */ oix a;

    public oiv(oix oixVar) {
        this.a = oixVar;
    }

    @Override // defpackage.lo
    public final void c(RecyclerView recyclerView, int i, int i2) {
        if ((recyclerView.n instanceof LinearLayoutManager) && fkc.h(recyclerView)) {
            int b = this.a.a.b();
            oix oixVar = this.a;
            if (b != oixVar.h) {
                oixVar.h = b;
                oiz oizVar = oixVar.f;
                if (oizVar != null) {
                    oizVar.lF(ajcd.NEXT);
                }
            }
        }
    }
}
