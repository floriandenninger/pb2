package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aybj {
    public final List a;
    private final axzj b;
    private final Object[][] c;

    public aybj(List list, axzj axzjVar, Object[][] objArr) {
        list.getClass();
        this.a = list;
        axzjVar.getClass();
        this.b = axzjVar;
        this.c = objArr;
    }

    public final String toString() {
        ammu Y = amkq.Y(this);
        Y.b("addrs", this.a);
        Y.b("attrs", this.b);
        Y.b("customOptions", Arrays.deepToString(this.c));
        return Y.toString();
    }
}
