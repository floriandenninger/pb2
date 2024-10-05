package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ajic implements sxr {
    final /* synthetic */ ajgg a;
    final /* synthetic */ acsa b;
    private final /* synthetic */ int c;

    public ajic(ajgg ajggVar, acsa acsaVar, int i) {
        this.c = i;
        this.a = ajggVar;
        this.b = acsaVar;
    }

    @Override // defpackage.sxr
    public final /* synthetic */ void b(View view, View view2) {
        if (this.c != 0) {
            rwh.ai(this, view);
        } else {
            rwh.ai(this, view);
        }
    }

    @Override // defpackage.sxr
    public final void d(View view) {
        if (this.c != 0) {
            ajgg ajggVar = this.a;
            ajggVar.a.u(this.b, ajggVar.b);
        } else {
            ajgg ajggVar2 = this.a;
            ajggVar2.a.u(this.b, ajggVar2.b);
        }
    }
}
