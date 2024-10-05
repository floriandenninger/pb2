package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aylg {
    public final aynk a;
    public final Object b;
    public final Map c;
    private final ayle d;
    private final Map e;
    private final Map f;

    public aylg(ayle ayleVar, Map map, Map map2, aynk aynkVar, Object obj, Map map3) {
        this.d = ayleVar;
        this.e = Collections.unmodifiableMap(new HashMap(map));
        this.f = Collections.unmodifiableMap(new HashMap(map2));
        this.a = aynkVar;
        this.b = obj;
        this.c = map3 != null ? Collections.unmodifiableMap(new HashMap(map3)) : null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ayba a() {
        if (this.f.isEmpty() && this.e.isEmpty() && this.d == null) {
            return null;
        }
        return new aylf(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ayle b(aych aychVar) {
        ayle ayleVar = (ayle) this.e.get(aychVar.b);
        if (ayleVar == null) {
            ayleVar = (ayle) this.f.get(aychVar.c);
        }
        return ayleVar == null ? this.d : ayleVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            aylg aylgVar = (aylg) obj;
            if (amkq.b(this.d, aylgVar.d) && amkq.b(this.e, aylgVar.e) && amkq.b(this.f, aylgVar.f) && amkq.b(this.a, aylgVar.a) && amkq.b(this.b, aylgVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.d, this.e, this.f, this.a, this.b});
    }

    public final String toString() {
        ammu Y = amkq.Y(this);
        Y.b("defaultMethodConfig", this.d);
        Y.b("serviceMethodMap", this.e);
        Y.b("serviceMap", this.f);
        Y.b("retryThrottling", this.a);
        Y.b("loadBalancingConfig", this.b);
        return Y.toString();
    }
}
