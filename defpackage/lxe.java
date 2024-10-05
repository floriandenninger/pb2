package defpackage;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lxe implements wf {
    final /* synthetic */ lxf a;

    public lxe(lxf lxfVar) {
        this.a = lxfVar;
    }

    @Override // defpackage.wf
    public final void a(View view) {
        lxm lxmVar = this.a.e;
        if (lxmVar == null || !view.equals(lxmVar.b)) {
            return;
        }
        this.a.e.i();
    }

    @Override // defpackage.wf
    public final void b() {
    }
}
