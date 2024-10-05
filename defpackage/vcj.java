package defpackage;

import android.util.Log;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vcj implements vck {
    private static final String a = vck.class.getSimpleName();

    @Override // defpackage.vck
    public final void a(vci vciVar) {
        try {
            rok.a(vciVar.b);
        } catch (qnk e) {
            Log.e(a, "Attempted to use SSL unpatched. Google Play Services unavailable.", e);
            qmy.a.d(vciVar.b, e.a);
            int i = vciVar.c;
            throw new IOException("Blocked unpatched use of SSL stack.", e);
        } catch (qnl e2) {
            qmy.a.d(vciVar.b, e2.a);
            int i2 = vciVar.c;
            throw new IOException("Attempted to use SSL unpatched. Google Play Services needs update.", e2);
        }
    }
}
