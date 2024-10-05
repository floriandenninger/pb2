package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axys implements axyr {
    public static final uxe a;

    static {
        uxj g = new uxj("com.google.android.libraries.performance.primes").f().g();
        try {
            a = g.e("17", (bacs) aonm.parseFrom(bacs.a, new byte[]{16, -24, 7, 24, 3}), uxf.r);
            g.d("38", false);
        } catch (aoob unused) {
            throw new AssertionError("Could not parse proto flag \"17\"");
        }
    }

    @Override // defpackage.axyr
    public final bacs a(Context context) {
        return (bacs) a.a(context);
    }
}
