package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class lgc implements View.OnClickListener {
    final /* synthetic */ apxf a;
    final /* synthetic */ lgd b;
    private final /* synthetic */ int c;

    public lgc(lgd lgdVar, apxf apxfVar, int i) {
        this.c = i;
        this.b = lgdVar;
        this.a = apxfVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.c == 0) {
            apxf apxfVar = this.a;
            if (apxfVar != null) {
                this.b.a.c(apxfVar, null);
                return;
            }
            return;
        }
        this.b.a.c(this.a, null);
    }
}
