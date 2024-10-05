package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class px extends kc {
    final /* synthetic */ py a;
    private boolean b = false;
    private int c = 0;

    public px(py pyVar) {
        this.a = pyVar;
    }

    @Override // defpackage.kc, defpackage.kb
    public final void a(View view) {
        int i = this.c + 1;
        this.c = i;
        if (i == this.a.a.size()) {
            kb kbVar = this.a.b;
            if (kbVar != null) {
                kbVar.a(null);
            }
            this.c = 0;
            this.b = false;
            this.a.c = false;
        }
    }

    @Override // defpackage.kc, defpackage.kb
    public final void c() {
        if (this.b) {
            return;
        }
        this.b = true;
        kb kbVar = this.a.b;
        if (kbVar != null) {
            kbVar.c();
        }
    }
}
