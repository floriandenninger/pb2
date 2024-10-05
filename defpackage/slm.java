package defpackage;

import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class slm extends syd {
    private final Set a;

    public slm(Set set) {
        this.a = set;
    }

    @Override // defpackage.syd
    public final void a(int i, String str, sxc sxcVar, Throwable th) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((syd) it.next()).a(i, str, sxcVar, th);
        }
    }
}
