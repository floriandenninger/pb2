package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public final class acth extends afvw {
    private final Set a;
    private final afsx b;

    public acth(String str, yvn yvnVar, Set set, afsx afsxVar, cnk cnkVar) {
        super(str, yvnVar, cnkVar);
        set.getClass();
        this.a = set;
        afsxVar.getClass();
        this.b = afsxVar;
    }

    @Override // defpackage.afvw, defpackage.afvp
    public final afsx e() {
        return this.b;
    }

    @Override // defpackage.yvo
    public final Map f() {
        HashMap hashMap = new HashMap();
        try {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((afvb) it.next()).b(hashMap, this);
            }
        } catch (cnb unused) {
            zga.b("CsiRequest: unexpected AuthFailureError");
        }
        return hashMap;
    }

    @Override // defpackage.yvo
    public final cnm qk(cnh cnhVar) {
        return cnm.b(null, null);
    }

    @Override // defpackage.yvo
    public final /* bridge */ /* synthetic */ void ql(Object obj) {
    }
}
