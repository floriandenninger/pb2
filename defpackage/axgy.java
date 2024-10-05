package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axgy implements Runnable {
    final /* synthetic */ Runnable a;
    final /* synthetic */ axha b;
    private final /* synthetic */ int c;

    public axgy(axha axhaVar, Runnable runnable, int i) {
        this.c = i;
        this.b = axhaVar;
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c != 0) {
            if (this.a == null && this.b.h == null) {
                return;
            }
            this.b.b().c = this.a;
            return;
        }
        boolean z = this.a != null;
        this.b.f.setVisibility(axha.a(z));
        View view = this.b.e;
        if (view != null) {
            view.setVisibility(axha.a(z));
        }
        axgs axgsVar = this.b.h;
        if (axgsVar != null) {
            axgsVar.b(this.a);
        }
    }
}
