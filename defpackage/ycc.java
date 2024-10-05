package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ycc implements aahd {
    private final HashSet a;
    private final aahd b;

    public ycc(aahd aahdVar) {
        this.a = new HashSet(1);
        this.b = aahdVar;
    }

    @Override // defpackage.aahd
    public final /* synthetic */ void a(apxf apxfVar) {
        aahc.a(this, apxfVar);
    }

    @Override // defpackage.aahd
    public final /* synthetic */ void b(List list) {
        aahc.b(this, list);
    }

    @Override // defpackage.aahd
    public final void c(apxf apxfVar, Map map) {
        this.b.c(apxfVar, map);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((yca) it.next()).a(apxfVar);
        }
    }

    @Override // defpackage.aahd
    public final /* synthetic */ void d(List list, Map map) {
        aahc.c(this, list, map);
    }

    @Override // defpackage.aahd
    public final /* synthetic */ void e(List list, Object obj) {
        aahc.d(this, list, obj);
    }

    public final void f(yca ycaVar) {
        this.a.add(ycaVar);
    }

    public ycc(aahd aahdVar, yca ycaVar) {
        this(aahdVar);
        f(ycaVar);
    }
}
