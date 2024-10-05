package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class acj implements Runnable {
    final /* synthetic */ acn a;

    public acj(acn acnVar) {
        this.a = acnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        acn acnVar = this.a;
        Context qR = acnVar.qR();
        if (qR == null) {
            Log.w("FingerprintFragment", "Not resetting the dialog. Context is null.");
        } else {
            acnVar.ag.n(1);
            acnVar.ag.m(qR.getString(R.string.fingerprint_dialog_touch_sensor));
        }
    }
}
