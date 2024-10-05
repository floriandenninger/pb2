package defpackage;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fub {
    public final oja a;
    public final Set b = Collections.newSetFromMap(new WeakHashMap());
    public int c;

    public fub(oja ojaVar) {
        this.a = ojaVar;
    }

    public final void a(fua fuaVar) {
        this.b.add(fuaVar);
    }
}
