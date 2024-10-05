package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rrn extends rrf {
    public rrn(Context context) {
        super(context, "com.google.android.gms.wallet.firstparty.ACTION_ADD_INSTRUMENT", "flow_im");
    }

    @Override // defpackage.rrf
    protected final void f() {
        byte[] byteArrayExtra = this.a.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN");
        boolean z = true;
        boolean z2 = byteArrayExtra != null && byteArrayExtra.length > 0;
        byte[] byteArrayExtra2 = this.a.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS");
        boolean z3 = byteArrayExtra2 != null && byteArrayExtra2.length > 0;
        if (!z2 && !z3) {
            z = false;
        }
        qip.ap(z, "Either Instrument Manager params or initialization token is required");
    }
}
