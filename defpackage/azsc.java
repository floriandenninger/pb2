package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azsc implements Serializable, azry {
    private aztj a;
    private volatile Object b = azsd.a;
    private final Object c = this;

    public azsc(aztj aztjVar) {
        this.a = aztjVar;
    }

    private final Object writeReplace() {
        return new azrx(a());
    }

    public final String toString() {
        return this.b != azsd.a ? String.valueOf(a()) : "Lazy value not initialized yet.";
    }

    @Override // defpackage.azry
    public final Object a() {
        Object obj;
        Object obj2 = this.b;
        if (obj2 != azsd.a) {
            return obj2;
        }
        synchronized (this.c) {
            obj = this.b;
            if (obj == azsd.a) {
                aztj aztjVar = this.a;
                aztjVar.getClass();
                obj = aztjVar.invoke();
                this.b = obj;
                this.a = null;
            }
        }
        return obj;
    }
}
