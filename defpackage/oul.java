package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class oul implements ajbk {
    private final oun a;
    private final oui b;
    private String c;
    private Integer d;
    private ajay e;
    private ajbv f;
    private Boolean g;
    private acsx h;
    private afft i;

    public oul(oun ounVar, oui ouiVar) {
        this.a = ounVar;
        this.b = ouiVar;
    }

    @Override // defpackage.ajbk
    public final ajbl a() {
        ayaw.j(this.c, String.class);
        ayaw.j(this.d, Integer.class);
        ayaw.j(this.e, ajay.class);
        ayaw.j(this.f, ajbv.class);
        ayaw.j(this.g, Boolean.class);
        return new oum(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
    }

    @Override // defpackage.ajbk
    public final /* bridge */ /* synthetic */ void b(String str) {
        str.getClass();
        this.c = str;
    }

    @Override // defpackage.ajbk
    public final /* bridge */ /* synthetic */ void c(ajay ajayVar) {
        this.e = ajayVar;
    }

    @Override // defpackage.ajbk
    public final /* bridge */ /* synthetic */ void d(boolean z) {
        this.g = Boolean.valueOf(z);
    }

    @Override // defpackage.ajbk
    public final /* synthetic */ void e(acsx acsxVar) {
        this.h = acsxVar;
    }

    @Override // defpackage.ajbk
    public final /* bridge */ /* synthetic */ void f(ajbv ajbvVar) {
        ajbvVar.getClass();
        this.f = ajbvVar;
    }

    @Override // defpackage.ajbk
    public final /* synthetic */ void g(afft afftVar) {
        this.i = afftVar;
    }

    @Override // defpackage.ajbk
    public final /* bridge */ /* synthetic */ void h(int i) {
        this.d = Integer.valueOf(i);
    }
}
