package defpackage;

import android.app.Activity;
import android.content.res.Configuration;

/* compiled from: PG */
/* loaded from: classes.dex */
public class abke extends ce {
    protected Activity a;
    private boolean b;

    @Override // defpackage.ce
    public void U(Activity activity) {
        super.U(activity);
        this.a = activity;
        this.b = yjk.aa(activity);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void o() {
        ce ceVar = this.C;
        if (ceVar instanceof bv) {
            ((bv) ceVar).kv();
        }
    }

    @Override // defpackage.ce, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.b || (this.C instanceof abkm)) {
            return;
        }
        o();
    }
}
