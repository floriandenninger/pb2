package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axya implements axxz {
    public static final uxe a;

    static {
        uxj g = new uxj("com.google.android.libraries.performance.primes").f().g();
        try {
            a = g.e("15", (bacs) aonm.parseFrom(bacs.a, new byte[]{16, 0, 24, 2}), uxf.k);
            try {
                g.e("45357002", (uqe) aonm.parseFrom(uqe.a, new byte[]{8, 0, 18, 0, 24, 0, 32, 0, 40, 0, 48, 0, 56, 0, 64, 0}), uxf.j);
                try {
                    g.e("45355611", (uqe) aonm.parseFrom(uqe.a, new byte[]{8, 0, 18, 0, 24, 0, 32, 0, 40, 0, 48, 0, 56, 0, 64, 0}), uxf.j);
                } catch (aoob unused) {
                    throw new AssertionError("Could not parse proto flag \"45355611\"");
                }
            } catch (aoob unused2) {
                throw new AssertionError("Could not parse proto flag \"45357002\"");
            }
        } catch (aoob unused3) {
            throw new AssertionError("Could not parse proto flag \"15\"");
        }
    }

    @Override // defpackage.axxz
    public final bacs a(Context context) {
        return (bacs) a.a(context);
    }
}
