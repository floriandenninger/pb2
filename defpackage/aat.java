package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aat extends aba {
    public final HashMap a = new HashMap();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aba
    public final aaw a(Object obj) {
        return (aaw) this.a.get(obj);
    }

    @Override // defpackage.aba
    public final Object b(Object obj, Object obj2) {
        aaw a = a(obj);
        if (a != null) {
            return a.b;
        }
        this.a.put(obj, e(obj, obj2));
        return null;
    }

    @Override // defpackage.aba
    public final Object c(Object obj) {
        Object c = super.c(obj);
        this.a.remove(obj);
        return c;
    }

    public final boolean d(Object obj) {
        return this.a.containsKey(obj);
    }
}
