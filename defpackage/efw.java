package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class efw implements ajbk {
    private final efz a;
    private final eeq b;
    private String c;
    private Integer d;
    private ajay e;
    private ajbv f;
    private Boolean g;
    private acsx h;
    private afft i;

    public efw(efz efzVar, eeq eeqVar) {
        this.a = efzVar;
        this.b = eeqVar;
    }

    @Override // defpackage.ajbk
    public final ajbl a() {
        ayaw.j(this.c, String.class);
        ayaw.j(this.d, Integer.class);
        ayaw.j(this.e, ajay.class);
        ayaw.j(this.f, ajbv.class);
        ayaw.j(this.g, Boolean.class);
        return new efy(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
    }

    @Override // defpackage.ajbk
    public final /* synthetic */ void e(acsx acsxVar) {
        this.h = acsxVar;
    }

    @Override // defpackage.ajbk
    public final /* synthetic */ void g(afft afftVar) {
        this.i = afftVar;
    }

    @Override // defpackage.ajbk
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final void b(String str) {
        str.getClass();
        this.c = str;
    }

    @Override // defpackage.ajbk
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final void c(ajay ajayVar) {
        ajayVar.getClass();
        this.e = ajayVar;
    }

    @Override // defpackage.ajbk
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final void d(boolean z) {
        this.g = Boolean.valueOf(z);
    }

    @Override // defpackage.ajbk
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final void f(ajbv ajbvVar) {
        ajbvVar.getClass();
        this.f = ajbvVar;
    }

    @Override // defpackage.ajbk
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final void h(int i) {
        this.d = Integer.valueOf(i);
    }
}
