package defpackage;

import android.os.Build;
import android.widget.Toast;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wge extends abe {
    final /* synthetic */ wgc a;

    public wge(wgc wgcVar) {
        this.a = wgcVar;
    }

    @Override // defpackage.abe
    public final void b() {
        Toast.makeText(((wfj) this.a).a, "Authentication Failed", 0).show();
    }

    @Override // defpackage.abe
    public final void c(CharSequence charSequence) {
        Toast.makeText(((wfj) this.a).a, charSequence, 0).show();
    }

    @Override // defpackage.abe
    public final void d() {
        wgc wgcVar = this.a;
        if (Build.VERSION.SDK_INT >= 29) {
            ((wfj) wgcVar).b.j(1);
            return;
        }
        wfj wfjVar = (wfj) wgcVar;
        wfjVar.c.postDelayed(new wfi(wfjVar), 100L);
    }
}
