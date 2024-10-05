package defpackage;

import java.util.TreeMap;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class add {
    public final adl a;

    public add() {
        adl adlVar = new adl(new TreeMap(adl.a));
        this.a = adlVar;
        Class cls = (Class) adlVar.a(ado.e);
        if (cls == null || cls.equals(adc.class)) {
            adlVar.b(ado.e, adc.class);
            if (adlVar.a(ado.d) == null) {
                adlVar.b(ado.d, adc.class.getCanonicalName() + "-" + UUID.randomUUID());
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
    }
}
