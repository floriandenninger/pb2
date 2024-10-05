package defpackage;

import java.util.Arrays;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayns {
    public final String a;
    public final Map b;

    public ayns(String str, Map map) {
        str.getClass();
        this.a = str;
        map.getClass();
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ayns) {
            ayns aynsVar = (ayns) obj;
            if (this.a.equals(aynsVar.a) && this.b.equals(aynsVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        ammu Y = amkq.Y(this);
        Y.b("policyName", this.a);
        Y.b("rawConfigValue", this.b);
        return Y.toString();
    }
}
