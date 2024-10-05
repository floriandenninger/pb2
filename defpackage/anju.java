package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class anju {
    public final Class a;
    public final Class b;
    private final Map c;

    /* JADX INFO: Access modifiers changed from: protected */
    @SafeVarargs
    public anju(Class cls, anjt... anjtVarArr) {
        this.a = cls;
        HashMap hashMap = new HashMap();
        for (int i = 0; i <= 0; i++) {
            anjt anjtVar = anjtVarArr[i];
            if (!hashMap.containsKey(anjtVar.a)) {
                hashMap.put(anjtVar.a, anjtVar);
            } else {
                String valueOf = String.valueOf(anjtVar.a.getCanonicalName());
                throw new IllegalArgumentException(valueOf.length() != 0 ? "KeyTypeManager constructed with duplicate factories for primitive ".concat(valueOf) : new String("KeyTypeManager constructed with duplicate factories for primitive "));
            }
        }
        this.b = anjtVarArr[0].a;
        this.c = Collections.unmodifiableMap(hashMap);
    }

    public anjs a() {
        throw new UnsupportedOperationException("Creating keys is not supported.");
    }

    public abstract aooy b(aomf aomfVar);

    public final Object c(aooy aooyVar, Class cls) {
        anjt anjtVar = (anjt) this.c.get(cls);
        if (anjtVar == null) {
            String canonicalName = cls.getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 41);
            sb.append("Requested primitive class ");
            sb.append(canonicalName);
            sb.append(" not supported.");
            throw new IllegalArgumentException(sb.toString());
        }
        return anjtVar.a(aooyVar);
    }

    public abstract String d();

    public final Set e() {
        return this.c.keySet();
    }

    public abstract void f(aooy aooyVar);

    public int g() {
        return 1;
    }

    public abstract int h();
}
