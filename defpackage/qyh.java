package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class qyh implements rpo {
    public final /* synthetic */ rpv a;
    private final /* synthetic */ int b;

    public /* synthetic */ qyh(rpv rpvVar, int i) {
        this.b = i;
        this.a = rpvVar;
    }

    @Override // defpackage.rpo
    public final void d(Object obj) {
        if (this.b == 0) {
            this.a.d((qyf) obj);
            return;
        }
        rpv rpvVar = this.a;
        Bundle bundle = (Bundle) obj;
        int i = 2;
        if (bundle != null) {
            i = Integer.valueOf(bundle.getInt("com.google.android.gms.cast.BUNDLE_KEY_CAST_ENABLED_STATUS", 2));
        }
        rpvVar.b(i);
    }
}
