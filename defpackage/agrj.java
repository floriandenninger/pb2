package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agrj implements agrn {
    private final azrw a;

    public agrj(azrw azrwVar) {
        this.a = azrwVar;
    }

    @Override // defpackage.agrn
    public final int a(String str, agsn agsnVar) {
        return ((agrl) this.a.get()).a(str, agsnVar);
    }

    @Override // defpackage.agrn
    public final arxp b(agsn agsnVar, Set set, long j) {
        return ((agrl) this.a.get()).b(agsnVar, set, j);
    }

    @Override // defpackage.agrn
    public final arxp c(agsn agsnVar, Set set) {
        return ((agrl) this.a.get()).c(agsnVar, set);
    }

    @Override // defpackage.agrn
    public final void d(String str, agsn agsnVar) {
        ((agrl) this.a.get()).d(str, agsnVar);
    }
}
