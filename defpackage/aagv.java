package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aagv extends aagx {
    private final amrz a;

    public aagv(Map map) {
        this.a = amrz.j(map);
    }

    @Override // defpackage.aagx
    public final aaha f(apxf apxfVar) {
        Object a = aahe.a(apxfVar);
        if (a == null) {
            return aaha.x;
        }
        aaha aahaVar = (aaha) this.a.get(a.getClass());
        return aahaVar != null ? aahaVar : aaha.x;
    }
}
