package defpackage;

import android.app.Dialog;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class nh extends bv {
    @Override // defpackage.bv
    public Dialog oq(Bundle bundle) {
        return new ng(qR(), this.b);
    }

    @Override // defpackage.bv
    public final void p(Dialog dialog, int i) {
        if (dialog instanceof ng) {
            ng ngVar = (ng) dialog;
            if (i != 1 && i != 2) {
                if (i != 3) {
                    return;
                } else {
                    dialog.getWindow().addFlags(24);
                }
            }
            ngVar.e();
            return;
        }
        super.p(dialog, i);
    }
}
