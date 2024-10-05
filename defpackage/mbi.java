package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class mbi implements Runnable {
    public final /* synthetic */ mbl a;
    private final /* synthetic */ int b;

    public /* synthetic */ mbi(mbl mblVar, int i) {
        this.b = i;
        this.a = mblVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            mbl mblVar = this.a;
            try {
                new mco(0, mblVar.h, (View) mblVar.f.get(), new mbd(mblVar, 1), 0, 400, true).b();
                return;
            } catch (IllegalArgumentException e) {
                zga.d("Error revealing feed filter bar", e);
                return;
            }
        }
        mbl mblVar2 = this.a;
        mblVar2.i.f.Y(mblVar2.e);
    }
}
