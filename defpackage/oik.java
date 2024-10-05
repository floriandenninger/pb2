package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.ViewStub;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class oik implements ofd {
    public final aabq a;
    private final aabr b;

    public oik(Activity activity, aabq aabqVar, aabn aabnVar, Context context, ViewStub viewStub, ofe ofeVar) {
        aabg aabgVar = new aabg(context, new oij(activity), viewStub, aabnVar);
        this.a = aabqVar;
        this.b = aabgVar;
        ofeVar.d(this);
    }

    @Override // defpackage.ofd
    public final void e(int i, int i2) {
        if (i2 == 3) {
            this.a.l(this.b);
        }
    }
}
