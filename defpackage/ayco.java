package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayco {
    public final List a;
    public final axzj b;
    public final ayck c;

    public ayco(List list, axzj axzjVar, ayck ayckVar) {
        this.a = Collections.unmodifiableList(new ArrayList(list));
        axzjVar.getClass();
        this.b = axzjVar;
        this.c = ayckVar;
    }

    public static aycn a() {
        return new aycn();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ayco)) {
            return false;
        }
        ayco aycoVar = (ayco) obj;
        return amkq.b(this.a, aycoVar.a) && amkq.b(this.b, aycoVar.b) && amkq.b(this.c, aycoVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final String toString() {
        ammu Y = amkq.Y(this);
        Y.b("addresses", this.a);
        Y.b("attributes", this.b);
        Y.b("serviceConfig", this.c);
        return Y.toString();
    }
}
