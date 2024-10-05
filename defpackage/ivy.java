package defpackage;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ivy extends ajpd {
    final /* synthetic */ iwa a;

    public ivy(iwa iwaVar) {
        this.a = iwaVar;
    }

    public final void f(Object obj) {
        if (isEmpty()) {
            add(obj);
        } else {
            n(0, obj);
        }
    }

    public final void g(String str) {
        f(new mle(str, new View.OnClickListener() { // from class: ivx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ivy.this.a.aH(false);
            }
        }));
    }

    @Override // defpackage.ajpd, defpackage.ajng
    public final /* bridge */ /* synthetic */ void lX(ajnf ajnfVar) {
        super.i(ajnfVar);
    }

    @Override // defpackage.ajpd, defpackage.ajng
    public final /* bridge */ /* synthetic */ void pf(ajnf ajnfVar) {
        super.j(ajnfVar);
    }
}
