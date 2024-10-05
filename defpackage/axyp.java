package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axyp implements axyo {
    public static final uxe a;
    public static final uxe b;
    public static final uxe c;

    static {
        uxj g = new uxj("com.google.android.libraries.performance.primes").f().g();
        g.d("45350020", false);
        g.d("2", true);
        a = g.d("3", false);
        b = g.b("45357887", 1L);
        try {
            c = g.e("19", (bacs) aonm.parseFrom(bacs.a, new byte[]{16, 0, 24, 2}), uxf.q);
        } catch (aoob unused) {
            throw new AssertionError("Could not parse proto flag \"19\"");
        }
    }

    @Override // defpackage.axyo
    public final long a(Context context) {
        return ((Long) b.a(context)).longValue();
    }

    @Override // defpackage.axyo
    public final bacs b(Context context) {
        return (bacs) c.a(context);
    }

    @Override // defpackage.axyo
    public final boolean c(Context context) {
        return ((Boolean) a.a(context)).booleanValue();
    }
}
