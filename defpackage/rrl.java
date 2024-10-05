package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rrl extends rrf {
    public rrl(Context context) {
        super(context, "com.google.android.gms.wallet.ACTION_CHECKOUT", "flow_checkout", false);
    }

    @Override // defpackage.rrf
    protected final void f() {
        boolean z = true;
        if (this.a.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS") == null && this.a.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN") == null) {
            z = false;
        }
        qip.ap(z, "Either buyflow params or initialization token is required");
    }
}
