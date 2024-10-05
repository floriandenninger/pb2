package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class hkb extends ic {
    final /* synthetic */ hkc b;

    public hkb(hkc hkcVar) {
        this.b = hkcVar;
    }

    @Override // defpackage.ic
    public final void d(View view, ks ksVar) {
        super.d(view, ksVar);
        if (view == this.b.b) {
            ksVar.M();
            ksVar.v(this.b.a.i() ? this.b.d : this.b.c);
        }
    }
}
