package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class doz {
    public final dsz a;
    private dqi b;
    private final dhe c;

    public doz() {
    }

    public final synchronized void a(dqi dqiVar) {
        if (this.b != dqiVar) {
            this.b = dqiVar;
            dhe dheVar = this.c;
            int i = dqg.M;
            if (dheVar.f != null) {
                dheVar.g(new dlp(0, dqiVar), "updateState:RecyclerCollectionComponent.updateLoadingState");
            }
        }
    }

    public doz(dhe dheVar, dsz dszVar) {
        this.b = dqi.LOADING;
        this.c = dheVar;
        this.a = dszVar;
    }
}
