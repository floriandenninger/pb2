package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class amyx extends amza {
    private final Map a;
    private final Map b;
    private final amyy c;

    public amyx(amyw amywVar) {
        HashMap hashMap = new HashMap();
        this.a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.b = hashMap2;
        hashMap.putAll(amywVar.c);
        hashMap2.putAll(amywVar.d);
        this.c = amywVar.f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.amza
    public final void a(amyc amycVar, Object obj, Object obj2) {
        amyz amyzVar = (amyz) this.a.get(amycVar);
        if (amyzVar == null) {
            amycVar.b(obj, obj2);
        } else {
            amyzVar.a(amycVar, obj, obj2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.amza
    public final void b(amyc amycVar, Iterator it, Object obj) {
        amyy amyyVar = (amyy) this.b.get(amycVar);
        if (amyyVar != null) {
            amyyVar.a(amycVar, it, obj);
        } else if (this.c == null || this.a.containsKey(amycVar)) {
            while (it.hasNext()) {
                a(amycVar, it.next(), obj);
            }
        } else {
            amycVar.a(it, obj);
        }
    }
}
