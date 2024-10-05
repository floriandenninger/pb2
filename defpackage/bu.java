package defpackage;

import android.app.Dialog;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bu extends cl {
    final /* synthetic */ cl a;
    final /* synthetic */ bv b;

    public bu(bv bvVar, cl clVar) {
        this.b = bvVar;
        this.a = clVar;
    }

    @Override // defpackage.cl
    public final View a(int i) {
        if (this.a.b()) {
            return this.a.a(i);
        }
        Dialog dialog = this.b.d;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    @Override // defpackage.cl
    public final boolean b() {
        return this.a.b() || this.b.e;
    }
}
