package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayqr {
    private static final ayqi a;

    static {
        ayrv ayrvVar = aype.a;
        try {
            ayqi ayqiVar = ayqq.a;
            if (ayqiVar == null) {
                throw new NullPointerException("Scheduler Callable returned null");
            }
            a = ayqiVar;
        } catch (Throwable th) {
            throw azqi.b(th);
        }
    }

    public static ayqi a() {
        ayqi ayqiVar = a;
        if (ayqiVar == null) {
            throw new NullPointerException("scheduler == null");
        }
        ayrv ayrvVar = aype.b;
        return ayqiVar;
    }
}
