package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class jzj implements ayrs {
    public final /* synthetic */ jzl a;
    private final /* synthetic */ int b;

    public /* synthetic */ jzj(jzl jzlVar, int i) {
        this.b = i;
        this.a = jzlVar;
    }

    @Override // defpackage.ayrs
    public final void a(Object obj) {
        int i = this.b;
        if (i == 0) {
            this.a.lz(((eyr) obj).a(), null);
        } else if (i == 1) {
            this.a.lz(mcy.an(aqnb.REQUEST_TYPE_UNSPECIFIED), null);
        } else {
            this.a.af();
        }
    }
}
