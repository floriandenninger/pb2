package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axxu implements axxt {
    public static final uxe a;
    public static final uxe b;

    static {
        uxj g = new uxj("com.google.android.libraries.performance.primes").f().g();
        a = g.d("45352228", false);
        try {
            b = g.e("45352241", (baau) aonm.parseFrom(baau.a, new byte[0]), uxf.h);
        } catch (aoob unused) {
            throw new AssertionError("Could not parse proto flag \"45352241\"");
        }
    }

    @Override // defpackage.axxt
    public final baau a(Context context) {
        return (baau) b.a(context);
    }

    @Override // defpackage.axxt
    public final boolean b(Context context) {
        return ((Boolean) a.a(context)).booleanValue();
    }
}
