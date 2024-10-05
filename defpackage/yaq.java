package defpackage;

import j$.util.DesugarCollections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yaq {
    public final Map a;
    public final Map b;

    public yaq(byte[] bArr, byte[] bArr2) {
        this.b = new IdentityHashMap();
        this.a = new IdentityHashMap();
    }

    public final boolean a(apzy apzyVar) {
        return this.a.get(apzyVar) == null && apzyVar.i.size() > 0;
    }

    public final List b(apzn apznVar) {
        if (apznVar == null) {
            return amru.q();
        }
        amru amruVar = (amru) this.a.get(apznVar);
        return amruVar != null ? amruVar : apznVar.d;
    }

    public final void c(apzn apznVar, amru amruVar) {
        this.a.put(apznVar, amruVar);
    }

    public final void d(apzx apzxVar, xpd xpdVar) {
        yjj.w(this.b, apzxVar, xpdVar);
    }

    public final void e(apzx apzxVar, xpd xpdVar) {
        yjj.x(this.b, apzxVar, xpdVar);
        yjj.z(this.b, apzxVar);
    }

    public yaq(byte[] bArr) {
        this.b = DesugarCollections.synchronizedMap(new WeakHashMap());
        this.a = DesugarCollections.synchronizedMap(new WeakHashMap());
    }

    public yaq() {
        this.a = DesugarCollections.synchronizedMap(new WeakHashMap());
        this.b = DesugarCollections.synchronizedMap(new WeakHashMap());
    }
}
