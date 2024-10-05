package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sgz implements sgw {
    final /* synthetic */ Iterable a;

    public sgz(Iterable iterable) {
        this.a = iterable;
    }

    @Override // defpackage.sgw
    public final boolean a(String str) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            if (((sgw) it.next()).a(str)) {
                return true;
            }
        }
        return false;
    }
}
