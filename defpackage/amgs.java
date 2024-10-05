package defpackage;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amgs {
    public long a;
    private final Set c = new HashSet();
    public ammv b = amlr.a;

    public final amgt a() {
        return new amgt(this.c, this.a, this.b);
    }

    public final void b(Collection collection) {
        this.c.addAll(collection);
    }
}
