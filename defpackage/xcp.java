package defpackage;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xcp {
    public static final xcp a = b(new xcy[0]);
    private final Map b = new HashMap();

    private xcp(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            xcy xcyVar = (xcy) it.next();
            this.b.put(xcyVar.getClass(), xcyVar);
        }
    }

    public static xcp a(List list) {
        return new xcp(list);
    }

    public static xcp b(xcy... xcyVarArr) {
        return new xcp(Arrays.asList(xcyVarArr));
    }

    public final Object c(Class cls) {
        xcy xcyVar = (xcy) this.b.get(cls);
        if (xcyVar != null) {
            return xcyVar.a;
        }
        String valueOf = String.valueOf(cls);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
        sb.append("Unable to retrieve getter for class: ");
        sb.append(valueOf);
        throw new IllegalStateException(sb.toString());
    }

    public final boolean d(Class cls) {
        return this.b.containsKey(cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xcp)) {
            return false;
        }
        xcp xcpVar = (xcp) obj;
        if (this.b.size() != xcpVar.b.size()) {
            return false;
        }
        for (Class cls : this.b.keySet()) {
            if (!xcpVar.b.containsKey(cls)) {
                return false;
            }
            if (!amkq.b(((xcy) this.b.get(cls)).a, ((xcy) xcpVar.b.get(cls)).a)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClientMetadata[");
        for (Class cls : this.b.keySet()) {
            sb.append(cls);
            sb.append("->");
            sb.append(this.b.get(cls));
            sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}
