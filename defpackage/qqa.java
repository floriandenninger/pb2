package defpackage;

import android.app.Dialog;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qqa {
    final /* synthetic */ Dialog a;
    final /* synthetic */ qpe b;

    public qqa() {
    }

    public qqa(qpe qpeVar, Dialog dialog) {
        this.b = qpeVar;
        this.a = dialog;
    }

    public final void a() {
        this.b.a.c();
        if (this.a.isShowing()) {
            this.a.dismiss();
        }
    }
}
