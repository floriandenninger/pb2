package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class owy {
    private final qlm a;
    private final String b;
    private final oww c;

    public owy(Context context, String str, oww owwVar) {
        qlm d = qlm.d(context, null);
        try {
            throw new IllegalArgumentException(String.format("Clearcut does not support setting log source int values (%s, %d). Use log source name instead.", str, Integer.valueOf(Integer.parseInt(str))));
        } catch (NumberFormatException unused) {
            this.a = d;
            this.b = str;
            this.c = owwVar;
        }
    }

    public final void a(owu owuVar) {
        qli c = this.a.c((byte[]) this.c.a(owuVar.c()));
        c.j = this.b;
        owv a = owuVar.a();
        owv owvVar = owv.DEFAULT;
        int ordinal = a.ordinal();
        int i = 3;
        int i2 = 1;
        char c2 = ordinal != 1 ? ordinal != 2 ? (char) 0 : (char) 3 : (char) 1;
        if (c2 == 0) {
            i = 1;
        } else if (c2 == 1) {
            i = 2;
        } else if (c2 != 2) {
            i = 4;
        }
        c.l = i;
        if (owuVar.b() != null) {
            c.c(owuVar.b().intValue());
        }
        c.b().g(new qoo(i2));
    }
}
