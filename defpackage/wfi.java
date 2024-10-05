package defpackage;

import android.widget.Toast;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wfi implements Runnable {
    final /* synthetic */ wfj a;
    private int b = 0;

    public wfi(wfj wfjVar) {
        this.a = wfjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b + 1;
        if (i >= 3) {
            Toast.makeText(this.a.a, "Authentication Failed", 0).show();
            return;
        }
        this.b = i;
        if (!this.a.d.au()) {
            this.a.b.j(1);
        } else {
            this.a.c.postDelayed(this, 300L);
        }
    }
}
