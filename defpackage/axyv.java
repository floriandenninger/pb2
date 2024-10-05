package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axyv implements axyu {
    public static final uxe a;

    static {
        try {
            a = new uxj("com.google.android.libraries.performance.primes").f().g().e("9", (bacs) aonm.parseFrom(bacs.a, new byte[]{16, -24, 7, 24, 4}), uxf.s);
        } catch (aoob unused) {
            throw new AssertionError("Could not parse proto flag \"9\"");
        }
    }

    @Override // defpackage.axyu
    public final bacs a(Context context) {
        return (bacs) a.a(context);
    }
}
