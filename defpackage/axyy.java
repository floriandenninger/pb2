package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axyy implements axyx {
    public static final uxe a;

    static {
        try {
            a = new uxj("com.google.android.libraries.performance.primes").f().g().e("10", (bacs) aonm.parseFrom(bacs.a, new byte[]{16, -24, 7, 24, 4}), uxf.t);
        } catch (aoob unused) {
            throw new AssertionError("Could not parse proto flag \"10\"");
        }
    }

    @Override // defpackage.axyx
    public final bacs a(Context context) {
        return (bacs) a.a(context);
    }
}
