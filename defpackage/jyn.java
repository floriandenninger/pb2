package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jyn implements jhm {
    final /* synthetic */ jyp a;

    public jyn(jyp jypVar) {
        this.a = jypVar;
    }

    private final void c(String str, final String... strArr) {
        jyp jypVar = this.a;
        aypy h = jypVar.g.a(jypVar.q.c()).h(str, true);
        if (evr.ao(this.a.z)) {
            h = h.p(wbs.K(this.a.p.a()));
        }
        h.L(iub.r).at().e().q(new joi(str, 2)).C().R(new ayrm() { // from class: jyl
            @Override // defpackage.ayrm
            public final void a() {
                final jyn jynVar = jyn.this;
                final String[] strArr2 = strArr;
                jynVar.a.i.execute(new Runnable() { // from class: jym
                    @Override // java.lang.Runnable
                    public final void run() {
                        jyn jynVar2 = jyn.this;
                        String[] strArr3 = strArr2;
                        jzo jzoVar = jynVar2.a.t;
                        if (jzoVar != null) {
                            jzoVar.d(false, strArr3);
                        }
                    }
                });
            }
        });
    }

    @Override // defpackage.jhm
    public final void a(String str) {
        c(fhe.h(str), "downloads_page_downloads_item_section_identifier", "downloads_page_disclaimer_item_section_identifier");
        c(fhe.q(str), "downloads_page_disclaimer_item_section_identifier");
    }

    @Override // defpackage.jhm
    public final void b() {
    }
}
