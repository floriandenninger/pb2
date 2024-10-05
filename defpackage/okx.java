package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class okx implements azrw {
    public final /* synthetic */ axpg a;
    private final /* synthetic */ int b;

    public /* synthetic */ okx(axpg axpgVar, int i) {
        this.b = i;
        this.a = axpgVar;
    }

    @Override // defpackage.azrw
    public final Object get() {
        int i = this.b;
        if (i == 0) {
            return ((jcm) this.a.get()).b();
        }
        if (i == 1) {
            return (akqj) this.a.get();
        }
        return 10;
    }
}
