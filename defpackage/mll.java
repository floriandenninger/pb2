package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mll implements View.OnLayoutChangeListener {
    final /* synthetic */ mlu a;
    private final /* synthetic */ int b;

    public mll(mlu mluVar, int i) {
        this.b = i;
        this.a = mluVar;
    }

    public /* synthetic */ mll(mlu mluVar, int i, byte[] bArr) {
        this.b = i;
        this.a = mluVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.b == 0) {
            this.a.s.removeOnLayoutChangeListener(this);
            mlu mluVar = this.a;
            mluVar.m(jw.e(mluVar.s) == 1);
            return;
        }
        this.a.h();
    }
}
