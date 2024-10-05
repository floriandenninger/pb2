package defpackage;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axgp implements View.OnClickListener {
    final /* synthetic */ axgs a;
    private final /* synthetic */ int b;

    public axgp(axgs axgsVar, int i) {
        this.b = i;
        this.a = axgsVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        if (i == 0) {
            this.a.f(false);
        } else if (i != 1) {
            this.a.d.run();
        } else {
            axhc.a(this.a.getContext());
        }
    }
}
