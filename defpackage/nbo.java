package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class nbo implements euu {
    private final /* synthetic */ int d;
    public static final /* synthetic */ nbo c = new nbo(2);
    public static final /* synthetic */ nbo b = new nbo(1);
    public static final /* synthetic */ nbo a = new nbo(0);

    private /* synthetic */ nbo(int i) {
        this.d = i;
    }

    @Override // defpackage.euu
    public final Object a() {
        int i = this.d;
        if (i != 0) {
            return i != 1 ? new ncf() : new eun();
        }
        return new nbq();
    }
}
