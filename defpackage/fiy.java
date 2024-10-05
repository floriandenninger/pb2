package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class fiy implements ayrv {
    public final /* synthetic */ aakv a;
    private final /* synthetic */ int b;

    public /* synthetic */ fiy(aakv aakvVar, int i) {
        this.b = i;
        this.a = aakvVar;
    }

    @Override // defpackage.ayrv
    public final Object a(Object obj) {
        int i = this.b;
        if (i == 0) {
            return this.a.f((String) obj);
        }
        if (i == 1) {
            return this.a.f((String) obj);
        }
        if (i == 2) {
            aakv aakvVar = this.a;
            aoxq aoxqVar = (aoxq) obj;
            int i2 = guo.b;
            if (aoxqVar == null) {
                afsi.b(2, 1, "Ad player fullscreen state entity is null in onSuccess on enter");
                return ayph.f();
            }
            aalc c = aakvVar.c();
            aoxp e = aoxqVar.e();
            e.b(true);
            c.d(e.c());
            return c.b();
        }
        if (i == 3) {
            return this.a.f((String) obj).g(awji.class);
        }
        if (i == 4) {
            return this.a.f((String) obj).g(awil.class);
        }
        if (i == 5) {
            aaio c2 = ((aaih) this.a).c();
            aumt e2 = ((aumv) obj).e();
            e2.b();
            c2.k(e2);
            return c2.b();
        }
        aaio c3 = ((aaih) this.a).c();
        aumt e3 = ((aumv) obj).e();
        e3.b();
        c3.k(e3);
        return c3.b();
    }
}
