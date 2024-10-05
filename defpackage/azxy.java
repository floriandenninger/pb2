package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azxy extends azwj {
    public static final /* synthetic */ int b = 0;

    static {
        new azxy();
    }

    private azxy() {
    }

    @Override // defpackage.azwj
    public final boolean d(azsv azsvVar) {
        azsvVar.getClass();
        return false;
    }

    @Override // defpackage.azwj
    public final void so(azsv azsvVar, Runnable runnable) {
        azsvVar.getClass();
        if (((azyb) azsvVar.get(azyb.a)) == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
    }

    @Override // defpackage.azwj
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
