package defpackage;

import android.content.Intent;
import android.view.KeyEvent;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qjt extends hg {
    final /* synthetic */ qju e;

    public qjt(qju qjuVar) {
        this.e = qjuVar;
    }

    @Override // defpackage.hg
    public final void c() {
        this.e.e.k();
    }

    @Override // defpackage.hg
    public final void d() {
        this.e.e.k();
    }

    @Override // defpackage.hg
    public final void h(long j) {
        tfq tfqVar = new tfq(null);
        tfqVar.a = j;
        this.e.e.t(tfqVar.b());
    }

    @Override // defpackage.hg
    public final boolean m(Intent intent) {
        KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
        if (keyEvent == null) {
            return true;
        }
        if (keyEvent.getKeyCode() != 127 && keyEvent.getKeyCode() != 126) {
            return true;
        }
        this.e.e.k();
        return true;
    }
}
