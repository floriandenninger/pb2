package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class bog extends bv {
    public Dialog ae;
    public bph af;

    public bog() {
        n(true);
    }

    public bof aF(Context context) {
        return new bof(context, 0);
    }

    @Override // defpackage.bv, defpackage.ce
    public final void mD() {
        super.mD();
        Dialog dialog = this.ae;
        if (dialog != null) {
            ((bof) dialog).nb(false);
        }
    }

    @Override // defpackage.ce, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Dialog dialog = this.ae;
        if (dialog != null) {
            ((bof) dialog).q();
        }
    }

    @Override // defpackage.bv
    public final Dialog oq(Bundle bundle) {
        bof aF = aF(qR());
        this.ae = aF;
        return aF;
    }
}
