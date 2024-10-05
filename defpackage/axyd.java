package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axyd implements axyc {
    public static final uxe a;

    static {
        uxj g = new uxj("com.google.android.libraries.performance.primes").f().g();
        try {
            g.e("14", (bacs) aonm.parseFrom(bacs.a, new byte[]{16, 0, 24, 2}), uxf.l);
            a = g.d("45350519", false);
            g.d("37", true);
            g.d("33", false);
        } catch (aoob unused) {
            throw new AssertionError("Could not parse proto flag \"14\"");
        }
    }

    @Override // defpackage.axyc
    public final boolean a(Context context) {
        return ((Boolean) a.a(context)).booleanValue();
    }
}
