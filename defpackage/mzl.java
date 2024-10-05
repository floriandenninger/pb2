package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class mzl implements View.OnFocusChangeListener {
    final /* synthetic */ mzn a;

    public mzl(mzn mznVar) {
        this.a = mznVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        if (z) {
            this.a.j();
            mzn mznVar = this.a;
            if (mznVar.l) {
                mznVar.i();
                return;
            }
            return;
        }
        mzn mznVar2 = this.a;
        if (mznVar2.h) {
            mzb e = mznVar2.e(mznVar2.f.e);
            this.a.g(!e.a);
            if (e.a) {
                return;
            }
            mzn mznVar3 = this.a;
            nac.b(mznVar3.e, new acqx(mznVar3.g.l), e.c);
        }
    }
}
