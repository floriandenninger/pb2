package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class afuv implements ykl {
    final /* synthetic */ afuw a;

    public afuv(afuw afuwVar) {
        this.a = afuwVar;
    }

    @Override // defpackage.ykl
    public final void a(Object obj, Exception exc) {
        Iterator it = this.a.a.f(obj).iterator();
        while (it.hasNext()) {
            ((ykl) it.next()).a(obj, exc);
        }
    }

    @Override // defpackage.ykl
    public final void b(Object obj, Object obj2) {
        Iterator it = this.a.a.f(obj).iterator();
        while (it.hasNext()) {
            ((ykl) it.next()).b(obj, obj2);
        }
    }
}
