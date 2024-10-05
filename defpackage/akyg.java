package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akyg extends akye {
    private final akyf b;
    private final Set c;

    public akyg(akyq... akyqVarArr) {
        super(4);
        this.b = new akyf(this);
        this.c = amsx.q(akyqVarArr);
    }

    @Override // defpackage.akye
    protected final void e() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((akyq) it.next()).b(this.b);
        }
    }

    @Override // defpackage.akye
    public final boolean equals(Object obj) {
        if (obj instanceof akyg) {
            return this.c.equals(((akyg) obj).c);
        }
        return false;
    }

    @Override // defpackage.akye
    protected final void f() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((akyq) it.next()).d(this.b);
        }
    }

    @Override // defpackage.akyq
    public final akyr g() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            akyr g = ((akyq) it.next()).g();
            if (!g.b) {
                return g;
            }
        }
        return akyr.a;
    }

    @Override // defpackage.akye
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.c});
    }
}
