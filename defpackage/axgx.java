package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axgx implements Runnable {
    final /* synthetic */ boolean a;
    final /* synthetic */ axha b;
    private final /* synthetic */ int c;

    public axgx(axha axhaVar, boolean z, int i) {
        this.c = i;
        this.b = axhaVar;
        this.a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        if (i == 0) {
            this.b.b.setVisibility(axha.a(this.a));
            return;
        }
        if (i == 1) {
            if (this.a || this.b.h != null) {
                this.b.b().setVisibility(axha.a(this.a));
                return;
            }
            return;
        }
        this.b.d.setVisibility(axha.a(this.a));
        View view = this.b.c;
        if (view != null) {
            view.setVisibility(axha.a(this.a));
        }
    }
}
