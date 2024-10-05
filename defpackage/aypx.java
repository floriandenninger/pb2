package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aypx {
    public static final aypx a = new aypx(null);
    public final Object b;

    private aypx(Object obj) {
        this.b = obj;
    }

    public static aypx a(Throwable th) {
        aysw.b(th, "error is null");
        return new aypx(azqm.b(th));
    }

    public static aypx b(Object obj) {
        aysw.b(obj, "value is null");
        return new aypx(obj);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aypx) {
            return aysw.a(this.b, ((aypx) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.b;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        Object obj = this.b;
        if (obj == null) {
            return "OnCompleteNotification";
        }
        if (azqm.h(obj)) {
            String valueOf = String.valueOf(azqm.d(obj));
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
            sb.append("OnErrorNotification[");
            sb.append(valueOf);
            sb.append("]");
            return sb.toString();
        }
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 20);
        sb2.append("OnNextNotification[");
        sb2.append(valueOf2);
        sb2.append("]");
        return sb2.toString();
    }
}
