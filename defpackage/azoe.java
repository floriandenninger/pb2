package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azoe extends AtomicReference {
    private static final long serialVersionUID = 2404266111789071508L;
    private Object a;

    public azoe() {
    }

    public final azoe a() {
        return (azoe) get();
    }

    public final Object b() {
        Object obj = this.a;
        this.a = null;
        return obj;
    }

    public azoe(Object obj) {
        this.a = obj;
    }
}
