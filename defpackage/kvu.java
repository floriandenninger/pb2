package defpackage;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kvu extends ic {
    final /* synthetic */ kvw b;

    public kvu(kvw kvwVar) {
        this.b = kvwVar;
    }

    @Override // defpackage.ic
    public final void d(View view, ks ksVar) {
        super.d(view, ksVar);
        ksVar.p(true);
        aqpg aqpgVar = (aqpg) view.getTag();
        ksVar.q(this.b.b.getSelectedItem().equals(view.getTag()));
        aots aotsVar = aqpgVar.i;
        if (aotsVar == null) {
            aotsVar = aots.a;
        }
        if ((aotsVar.b & 2) != 0) {
            aots aotsVar2 = aqpgVar.i;
            if (aotsVar2 == null) {
                aotsVar2 = aots.a;
            }
            ksVar.v(aotsVar2.c);
        }
    }
}
