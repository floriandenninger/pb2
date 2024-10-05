package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class axgw implements View.OnClickListener {
    final /* synthetic */ axha a;
    private final /* synthetic */ int b;

    public axgw(axha axhaVar, int i) {
        this.b = i;
        this.a = axhaVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        if (i == 0) {
            Runnable runnable = this.a.m;
            Runnable runnable2 = this.a.k;
            if (runnable2 != null) {
                runnable2.run();
                return;
            } else {
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            }
        }
        if (i == 1) {
            Runnable runnable3 = this.a.k;
            if (runnable3 != null) {
                runnable3.run();
                return;
            }
            return;
        }
        if (i == 2) {
            Runnable runnable4 = this.a.k;
            if (runnable4 != null) {
                runnable4.run();
                return;
            }
            return;
        }
        Runnable runnable5 = this.a.l;
        Runnable runnable6 = this.a.k;
        if (runnable6 != null) {
            runnable6.run();
        } else if (runnable5 != null) {
            runnable5.run();
        }
    }
}
