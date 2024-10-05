package defpackage;

import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayai {
    static final Logger a = Logger.getLogger(ayai.class.getName());
    public static final ayai b = new ayai();

    private ayai() {
    }

    public static ayai b() {
        ayai a2 = ayag.a.a();
        return a2 == null ? b : a2;
    }

    public static void d(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException((String) obj2);
        }
    }

    public final ayai a() {
        ayai b2 = ayag.a.b(this);
        return b2 == null ? b : b2;
    }

    public final void c(ayai ayaiVar) {
        d(ayaiVar, "toAttach");
        ayag.a.c(this, ayaiVar);
    }
}
