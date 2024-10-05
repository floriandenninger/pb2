package defpackage;

import android.util.Log;
import com.google.android.libraries.onegoogle.expresssignin.ExpressSignInLayout;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uih implements anhh {
    final WeakReference a;

    public uih(ExpressSignInLayout expressSignInLayout) {
        this.a = new WeakReference(expressSignInLayout);
    }

    @Override // defpackage.anhh
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Boolean bool = (Boolean) obj;
        ExpressSignInLayout expressSignInLayout = (ExpressSignInLayout) this.a.get();
        if (expressSignInLayout != null) {
            if (!bool.booleanValue()) {
                tyo.M(new uhk(expressSignInLayout, 0));
            } else {
                expressSignInLayout.d();
            }
        }
    }

    @Override // defpackage.anhh
    public final void qg(Throwable th) {
        Log.e(ExpressSignInLayout.a, "ContinueWithAccountListener execution threw an exception", th);
    }
}
