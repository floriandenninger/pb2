package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aagw extends aagx {
    private final amrz a;

    public aagw(Map map) {
        this.a = amrz.j(map);
    }

    @Override // defpackage.aagx
    public final aaha f(apxf apxfVar) {
        Object a = aahe.a(apxfVar);
        if (a == null) {
            return aaha.x;
        }
        azrw azrwVar = (azrw) this.a.get(a.getClass());
        if (azrwVar == null) {
            return aaha.x;
        }
        aaha aahaVar = (aaha) azrwVar.get();
        return aahaVar != null ? aahaVar : aaha.x;
    }
}
