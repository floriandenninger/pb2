package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axxx implements axxw {
    public static final uxe a;

    static {
        try {
            a = new uxj("com.google.android.libraries.performance.primes").f().g().e("16", (bacs) aonm.parseFrom(bacs.a, new byte[]{16, 0, 24, 2}), uxf.i);
        } catch (aoob unused) {
            throw new AssertionError("Could not parse proto flag \"16\"");
        }
    }

    @Override // defpackage.axxw
    public final bacs a(Context context) {
        return (bacs) a.a(context);
    }
}
