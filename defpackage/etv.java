package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class etv {
    public final etw a;
    private final aahv b;
    private final ayqw c = new ayqw();

    public etv(aahv aahvVar, etw etwVar) {
        this.b = aahvVar;
        this.a = etwVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final String e(bajo bajoVar) {
        bajo c = bajo.c((bajoVar.b + 500) / 1000);
        int i = bajoVar.a() > 0 ? 2 : 1;
        banh banhVar = new banh();
        banhVar.e();
        banhVar.i(":");
        banhVar.h();
        banhVar.a = i;
        banhVar.f();
        banhVar.i(":");
        banhVar.h();
        banhVar.a = 2;
        banhVar.g();
        return banhVar.a().a(c.e());
    }

    public final void a() {
        this.c.c();
    }

    public final void b() {
        this.c.c();
        final int i = 0;
        final int i2 = 1;
        this.c.g(this.a.a().X(new ayrs(this) { // from class: etu
            public final /* synthetic */ etv a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                if (i == 0) {
                    this.a.c(!r0.a.c().booleanValue());
                    return;
                }
                this.a.d(etv.e(bajo.b(((aheg) obj).e())));
            }
        }), this.a.b().X(new ayrs(this) { // from class: etu
            public final /* synthetic */ etv a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                if (i2 == 0) {
                    this.a.c(!r0.a.c().booleanValue());
                    return;
                }
                this.a.d(etv.e(bajo.b(((aheg) obj).e())));
            }
        }));
        c(!this.a.c().booleanValue());
        d(e(bajo.b(this.a.d().longValue())));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(boolean z) {
        aahu c = this.b.c();
        apxv apxvVar = (apxv) c.f(aalt.f(apxw.b.a(), "")).g(apxv.class).X();
        if (apxvVar != null) {
            apxt e = apxvVar.e();
            Boolean valueOf = Boolean.valueOf(z);
            aone aoneVar = e.a;
            boolean booleanValue = valueOf.booleanValue();
            aoneVar.copyOnWrite();
            apxw apxwVar = (apxw) aoneVar.instance;
            apxwVar.c |= 2;
            apxwVar.e = booleanValue;
            apxv b = e.b();
            aaio c2 = ((aaih) c).c();
            c2.d(b);
            c2.b().Q();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(String str) {
        aahu c = this.b.c();
        String f = aalt.f(apye.b.a(), "");
        f.getClass();
        amkq.O(!f.isEmpty(), "key cannot be empty");
        aone createBuilder = apye.a.createBuilder();
        createBuilder.copyOnWrite();
        apye apyeVar = (apye) createBuilder.instance;
        apyeVar.c |= 1;
        apyeVar.d = f;
        apyb apybVar = new apyb(createBuilder);
        aone aoneVar = apybVar.a;
        aoneVar.copyOnWrite();
        apye apyeVar2 = (apye) aoneVar.instance;
        str.getClass();
        apyeVar2.c |= 2;
        apyeVar2.e = str;
        apyd b = apybVar.b();
        aaio c2 = ((aaih) c).c();
        c2.d(b);
        c2.b().Q();
    }
}
