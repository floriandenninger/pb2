package defpackage;

import android.app.Dialog;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public class algk extends nh {
    private final void aF() {
        Dialog dialog = this.d;
        if (dialog instanceof algj) {
            boolean z = ((algj) dialog).a().q;
        }
    }

    @Override // defpackage.bv
    public final void dismiss() {
        aF();
        super.dismiss();
    }

    @Override // defpackage.bv
    public final void kv() {
        aF();
        super.kv();
    }

    @Override // defpackage.nh, defpackage.bv
    public Dialog oq(Bundle bundle) {
        return new algj(qR(), this.b);
    }
}
