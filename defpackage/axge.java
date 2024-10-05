package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axge {
    public final HashMap a;
    public final HashMap b;

    public axge() {
        this.a = new HashMap();
        this.b = new HashMap();
    }

    public axge(axge axgeVar) {
        this.a = new HashMap(axgeVar.a);
        HashMap hashMap = new HashMap(axgeVar.b);
        this.b = hashMap;
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            if (((axgb) ((Map.Entry) it.next()).getValue()).e.get()) {
                it.remove();
            }
        }
    }
}
