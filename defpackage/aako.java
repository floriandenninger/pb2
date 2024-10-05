package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aako implements aaqy {
    public static final /* synthetic */ int a = 0;
    private static final aomw b;
    private static final int c;
    private final aakq d;
    private final aals e;

    static {
        aomw c2 = aomw.c();
        c2.e(aqty.b);
        b = c2;
        c = (aqty.b.a() << 3) | 2;
    }

    public aako(aakq aakqVar, aals aalsVar) {
        this.d = aakqVar;
        this.e = aalsVar;
    }

    public static aqty a(aqzg aqzgVar) {
        aomk l = aqzgVar.toByteString().l();
        while (!l.E()) {
            try {
                int n = l.n();
                if (n != c) {
                    l.G(n);
                } else {
                    return (aqty) l.y(aqty.a.getParserForType(), b);
                }
            } catch (IOException e) {
                zga.d("[ENTITY] Error parsing batch update.", e);
                return null;
            }
        }
        return null;
    }

    @Override // defpackage.aaqy
    public final void b(afsx afsxVar, aqzg aqzgVar, arnd arndVar) {
        aqty a2 = a(aqzgVar);
        if (a2 != null) {
            String format = String.format("Processing %s mutations: %s ", Integer.valueOf(a2.d.size()), amkq.bF(a2.d, aard.b));
            String valueOf = String.valueOf(format);
            if (valueOf.length() != 0) {
                "[ENTITY] ".concat(valueOf);
            }
            this.e.a("UTP", format);
            aakq aakqVar = this.d;
            int i = arndVar.e;
            aakqVar.a(afsxVar, a2);
            return;
        }
        this.e.a("UTP", "No batch update data found on transport packet.");
    }
}
