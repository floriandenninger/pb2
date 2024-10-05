package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class whs implements View.OnClickListener {
    final /* synthetic */ wid a;
    private final /* synthetic */ int b;

    public whs(wid widVar, int i) {
        this.b = i;
        this.a = widVar;
    }

    public /* synthetic */ whs(wid widVar, int i, byte[] bArr) {
        this.b = i;
        this.a = widVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.b != 0) {
            this.a.k();
        } else {
            this.a.k();
        }
    }
}
