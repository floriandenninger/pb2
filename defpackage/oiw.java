package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class oiw implements glh {
    public String a;
    private final Set b = Collections.newSetFromMap(new WeakHashMap());

    public final void a(String str) {
        this.a = str;
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((glg) it.next()).a();
        }
    }

    @Override // defpackage.glh
    public final String b() {
        return this.a;
    }

    @Override // defpackage.glh
    public final void c(glg glgVar) {
        this.b.add(glgVar);
    }

    @Override // defpackage.glh
    public final void oU(glg glgVar) {
        this.b.remove(glgVar);
    }
}
