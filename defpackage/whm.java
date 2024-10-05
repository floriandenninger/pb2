package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class whm implements View.OnClickListener {
    public final /* synthetic */ whp a;
    private final /* synthetic */ int b;

    public /* synthetic */ whm(whp whpVar, int i) {
        this.b = i;
        this.a = whpVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.b == 0) {
            whp whpVar = this.a;
            if (!whpVar.b.o()) {
                whpVar.c.b();
                return;
            } else {
                whpVar.i.c(whpVar.a, null, null);
                return;
            }
        }
        this.a.d();
    }
}
