package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axyj implements axyi {
    public static final uxe a;

    static {
        uxj g = new uxj("com.google.android.libraries.performance.primes").f().g();
        g.d("5", true);
        try {
            a = g.e("8", (bacs) aonm.parseFrom(bacs.a, new byte[]{16, -24, 7, 24, 4}), uxf.o);
        } catch (aoob unused) {
            throw new AssertionError("Could not parse proto flag \"8\"");
        }
    }

    @Override // defpackage.axyi
    public final bacs a(Context context) {
        return (bacs) a.a(context);
    }
}
