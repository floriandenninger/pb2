package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class mzw implements View.OnFocusChangeListener {
    final /* synthetic */ mzy a;

    public mzw(mzy mzyVar) {
        this.a = mzyVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        if (z) {
            this.a.i();
            mzy mzyVar = this.a;
            if (mzyVar.i) {
                mzyVar.b.setText(mzyVar.f.e);
                mzyVar.i = false;
                return;
            }
            return;
        }
        mzy mzyVar2 = this.a;
        if (mzyVar2.g) {
            mzb e = mzyVar2.e(mzyVar2.e.e);
            this.a.g(!e.a);
            if (e.a) {
                return;
            }
            mzy mzyVar3 = this.a;
            nac.b(mzyVar3.d, new acqx(mzyVar3.f.k), e.c);
        }
    }
}
