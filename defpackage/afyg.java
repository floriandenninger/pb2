package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class afyg extends yvo {
    private final ucf a;

    public afyg(ucf ucfVar) {
        super(ucfVar.d != null ? 2 : 1, ucfVar.a.toExternalForm(), null);
        this.a = ucfVar;
    }

    @Override // defpackage.yvo
    public final Map f() {
        amrw h = amrz.h();
        for (ucd ucdVar : this.a.c.keySet()) {
            List list = (List) this.a.c.get(ucdVar);
            if (list != null) {
                h.g(ucdVar.b, ammr.b(",").d(list));
            }
        }
        return h.c();
    }

    @Override // defpackage.yvo
    public final String lb() {
        return this.a.b;
    }

    @Override // defpackage.yvo
    public final cnm qk(cnh cnhVar) {
        amrw h = amrz.h();
        List<cnf> list = cnhVar.d;
        if (list != null) {
            for (cnf cnfVar : list) {
                h.g(ucd.a(cnfVar.a), amru.r(cnfVar.b));
            }
        }
        ucg a = uch.a();
        a.b().putAll(h.c());
        a.d = cnhVar.b;
        a.b = Integer.valueOf(cnhVar.a);
        a.a = true;
        return cnm.b(a.a(), null);
    }

    @Override // defpackage.yvo
    public final /* bridge */ /* synthetic */ void ql(Object obj) {
    }

    @Override // defpackage.yvo
    public final byte[] qm() {
        return this.a.d;
    }
}
