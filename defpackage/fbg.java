package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fbg implements fbd {
    public final azrw a;
    private final fay b;
    private final azrw c;
    private final acsy d;
    private acsx e = new acsz();
    private boolean f;

    public fbg(fay fayVar, azrw azrwVar, azrw azrwVar2, acsy acsyVar) {
        this.b = fayVar;
        this.d = acsyVar;
        this.c = azrwVar;
        this.a = azrwVar2;
    }

    @Override // defpackage.fbd
    public final void a() {
        acsx d = this.d.d(asmn.LATENCY_ACTION_HOME);
        this.e = d;
        if (this.f) {
            d.e();
            acsx acsxVar = this.e;
            aone createBuilder = asmb.a.createBuilder();
            createBuilder.copyOnWrite();
            asmb asmbVar = (asmb) createBuilder.instance;
            asmbVar.b |= 16;
            asmbVar.h = "warm";
            acsxVar.a((asmb) createBuilder.build());
            return;
        }
        ynm.k((anhy) this.c.get(), angq.a, new ynk() { // from class: fbe
            @Override // defpackage.zfi
            /* renamed from: b */
            public final void a(Throwable th) {
                fbg.this.b(false, !((Boolean) r3.a.get()).booleanValue());
            }
        }, new ynl() { // from class: fbf
            @Override // defpackage.ynl, defpackage.zfi
            public final void a(Object obj) {
                fbg.this.b(((Boolean) obj).booleanValue(), !((Boolean) r0.a.get()).booleanValue());
            }
        });
        this.f = true;
    }

    public final void b(boolean z, boolean z2) {
        String str = true != z ? "cold" : "frozen";
        this.e.f(this.b.a);
        acsx acsxVar = this.e;
        aone createBuilder = asmb.a.createBuilder();
        createBuilder.copyOnWrite();
        asmb asmbVar = (asmb) createBuilder.instance;
        asmbVar.b |= 16;
        asmbVar.h = str;
        createBuilder.copyOnWrite();
        asmb asmbVar2 = (asmb) createBuilder.instance;
        asmbVar2.b |= 32;
        asmbVar2.i = z2;
        acsxVar.a((asmb) createBuilder.build());
    }
}
