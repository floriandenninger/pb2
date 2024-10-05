package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dig implements dhy {
    @Override // defpackage.dhy
    public final void a(int i, String str, String str2) {
        b(i, str, str2);
    }

    @Override // defpackage.dhy
    public final void b(int i, String str, String str2) {
        int i2 = i - 1;
        if (i2 == 0) {
            String valueOf = String.valueOf(str);
            Log.w(valueOf.length() != 0 ? "Litho:".concat(valueOf) : new String("Litho:"), str2);
        } else {
            if (i2 != 1) {
                String valueOf2 = String.valueOf(str);
                Log.e(valueOf2.length() != 0 ? "Litho:".concat(valueOf2) : new String("Litho:"), str2);
                throw new RuntimeException(str2);
            }
            String valueOf3 = String.valueOf(str);
            Log.e(valueOf3.length() != 0 ? "Litho:".concat(valueOf3) : new String("Litho:"), str2);
        }
    }
}
