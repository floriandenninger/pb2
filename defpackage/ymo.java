package defpackage;

import java.lang.ref.ReferenceQueue;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ymo extends ymh {
    final Map c;
    private final ReferenceQueue d;

    public ymo() {
        super(30);
        this.c = new HashMap(((int) Math.ceil(40.0d)) + 1, 0.75f);
        this.d = new ReferenceQueue();
    }

    @Override // defpackage.ymh, defpackage.ylz
    public final synchronized Object a(Object obj) {
        Object a = super.a(obj);
        if (a != null) {
            return a;
        }
        ymn ymnVar = (ymn) this.c.get(obj);
        if (ymnVar != null) {
            a = ymnVar.get();
            if (a != null) {
                super.d(obj, a);
            }
            this.c.remove(obj);
        }
        return a;
    }

    @Override // defpackage.ymh, defpackage.ylz
    public final synchronized Object b(Object obj) {
        Object b;
        b = super.b(obj);
        if (b != null) {
            this.c.put(obj, new ymn(obj, b, this.d));
        }
        return b;
    }

    @Override // defpackage.ymh, defpackage.ylz
    public final synchronized void d(Object obj, Object obj2) {
        super.d(obj, obj2);
        int size = this.c.size();
        while (true) {
            ymn ymnVar = (ymn) this.d.poll();
            if (ymnVar == null) {
                break;
            } else {
                this.c.remove(ymnVar.a);
            }
        }
        if (size - this.c.size() > 0) {
            this.c.size();
        }
    }

    public final synchronized void f(Object obj) {
        super.b(obj);
        this.c.remove(obj);
    }

    @Override // defpackage.ymh
    public final synchronized String toString() {
        String valueOf;
        String valueOf2;
        valueOf = String.valueOf(super.toString());
        valueOf2 = String.valueOf(this.c.toString());
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }
}
