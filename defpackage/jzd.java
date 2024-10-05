package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class jzd implements ajol {
    public final /* synthetic */ jzl a;
    private final /* synthetic */ int b;

    public /* synthetic */ jzd(jzl jzlVar, int i) {
        this.b = i;
        this.a = jzlVar;
    }

    @Override // defpackage.ajol
    public final void a(ajok ajokVar, ajng ajngVar, int i) {
        int i2 = this.b;
        if (i2 == 0) {
            ajokVar.f("BackgroundPromoPresenter.BottomPaddingKey", Integer.valueOf(true == this.a.a.n() ? 20 : -1));
        } else if (i2 == 1) {
            ajokVar.f("BackgroundPromoPresenter.BodyTextTopPaddingKey", Integer.valueOf(true == this.a.a.e() ? 16 : -1));
        } else {
            ajokVar.f("downloads_page_section_key", this.a.b);
        }
    }
}
