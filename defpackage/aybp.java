package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aybp {
    public final List a;
    public final axzj b;
    public final Object c;

    public aybp(List list, axzj axzjVar, Object obj) {
        list.getClass();
        this.a = Collections.unmodifiableList(new ArrayList(list));
        axzjVar.getClass();
        this.b = axzjVar;
        this.c = obj;
    }

    public static aybo a() {
        return new aybo();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aybp)) {
            return false;
        }
        aybp aybpVar = (aybp) obj;
        return amkq.b(this.a, aybpVar.a) && amkq.b(this.b, aybpVar.b) && amkq.b(this.c, aybpVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final String toString() {
        ammu Y = amkq.Y(this);
        Y.b("addresses", this.a);
        Y.b("attributes", this.b);
        Y.b("loadBalancingPolicyConfig", this.c);
        return Y.toString();
    }
}
