package defpackage;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ogq implements ohk {
    public final ajvc a;
    public final Set b;
    private final ajss c;
    private final ogp d;

    public ogq(ajss ajssVar, ajvc ajvcVar) {
        ajssVar.getClass();
        this.c = ajssVar;
        ajvcVar.getClass();
        this.a = ajvcVar;
        this.b = Collections.newSetFromMap(new WeakHashMap());
        ajoc ajocVar = ajssVar.f;
        ogp ogpVar = new ogp(this, ajocVar);
        this.d = ogpVar;
        ajocVar.lX(ogpVar);
    }

    @Override // defpackage.ohk
    public final void a() {
        this.c.g.h(new ajnp(this.d, new ammy() { // from class: ogo
            @Override // defpackage.ammy
            public final boolean a(Object obj) {
                return (ogq.this.b.contains(obj) || (obj instanceof ajvo)) ? false : true;
            }
        }));
        this.d.pc();
    }

    @Override // defpackage.ohk
    public final void b() {
        this.c.I();
    }
}
