package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class kdr implements View.OnClickListener {
    public final /* synthetic */ kds a;
    private final /* synthetic */ int b;

    public /* synthetic */ kdr(kds kdsVar, int i) {
        this.b = i;
        this.a = kdsVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        if (i == 0) {
            this.a.a.k();
            return;
        }
        if (i == 1) {
            this.a.a.k();
        } else if (i != 2) {
            this.a.a.l();
        } else {
            this.a.a.l();
        }
    }
}
