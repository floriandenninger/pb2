package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aitu {
    public final List a;
    public final long b;
    public final aesh c;
    public final aesh d;

    public aitu(aitt aittVar) {
        this.c = aittVar.c;
        this.a = aittVar.a;
        this.d = aittVar.d;
        Long l = aittVar.b;
        this.b = l != null ? l.longValue() : 0L;
    }

    public final long a() {
        aesh aeshVar = this.c;
        Long c = aeshVar != null ? aeshVar.c("Sequence-Number") : null;
        if (c != null) {
            return c.longValue();
        }
        return 0L;
    }
}
