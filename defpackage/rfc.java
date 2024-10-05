package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rfc {
    private static final Object b = new Object();
    public final String a;
    private final rfb c;
    private final Object d;
    private final Object e = new Object();
    private volatile Object f = null;
    private volatile Object g = null;

    public rfc(String str, Object obj, rfb rfbVar) {
        this.a = str;
        this.d = obj;
        this.c = rfbVar;
    }

    public final Object a() {
        return b(null);
    }

    public final Object b(Object obj) {
        synchronized (this.e) {
        }
        if (obj != null) {
            return obj;
        }
        if (rqr.a == null) {
            return this.d;
        }
        boolean z = rqr.a.a;
        synchronized (b) {
            if (ansv.d()) {
                return this.g == null ? this.d : this.g;
            }
            try {
                for (rfc rfcVar : rfd.a) {
                    if (!ansv.d()) {
                        Object obj2 = null;
                        try {
                            rfb rfbVar = rfcVar.c;
                            if (rfbVar != null) {
                                obj2 = rfbVar.a();
                            }
                        } catch (IllegalStateException unused) {
                        }
                        synchronized (b) {
                            rfcVar.g = obj2;
                        }
                    } else {
                        throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                    }
                }
            } catch (SecurityException unused2) {
            }
            rfb rfbVar2 = this.c;
            if (rfbVar2 != null) {
                try {
                    return rfbVar2.a();
                } catch (IllegalStateException unused3) {
                    boolean z2 = rqr.a.a;
                    return this.d;
                } catch (SecurityException unused4) {
                    boolean z3 = rqr.a.a;
                    return this.d;
                }
            }
            boolean z4 = rqr.a.a;
            return this.d;
        }
    }
}
