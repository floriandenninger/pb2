package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rrm extends rrf {
    public rrm(Context context) {
        super(context, "com.google.android.gms.wallet.firstparty.ACTION_FIX_INSTRUMENT", "flow_fix_instrument");
    }

    @Override // defpackage.rrf
    protected final void f() {
        byte[] byteArrayExtra = this.a.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS");
        byte[] byteArrayExtra2 = this.a.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN");
        boolean z = true;
        boolean z2 = byteArrayExtra != null && byteArrayExtra.length > 0;
        boolean z3 = byteArrayExtra2 != null && byteArrayExtra2.length > 0;
        qip.ap((z2 && z3) ? false : true, "Only one of encrypted parameters or initialization token should be set");
        if (!z2 && !z3) {
            z = false;
        }
        qip.ap(z, "Either encrypted parameters or initialization token should be set");
    }
}
