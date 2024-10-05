package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahua implements ahty {
    private final String c;
    private final String d;
    private final aahv e;
    private final afsy f;
    private final aahd h;
    private final ammv i;
    private final ayqw g = new ayqw();
    public final amxa a = amxa.a();
    public ammv b = amlr.a;

    public ahua(aahv aahvVar, afsy afsyVar, aahd aahdVar, String str, String str2, ammv ammvVar) {
        this.e = aahvVar;
        this.f = afsyVar;
        this.h = aahdVar;
        this.c = str;
        this.d = str2;
        this.i = ammvVar;
    }

    @Override // defpackage.ahty
    public final void a(long j) {
        asyr asyrVar;
        Long valueOf = Long.valueOf(j);
        this.b = ammv.j(valueOf);
        aajc aajcVar = (aajc) this.a.b(valueOf);
        if (aajcVar == null) {
            return;
        }
        if (this.i.h() && ((asyrVar = (asyr) this.e.a(this.f.c()).f(this.d).g(asyr.class).X()) == null || !asyrVar.g() || !asyrVar.h())) {
            this.h.a((apxf) this.i.c());
        }
        aone createBuilder = aqua.a.createBuilder();
        alwe b = alwf.b();
        b.d(4, 8);
        alwi b2 = b.b();
        createBuilder.copyOnWrite();
        aqua aquaVar = (aqua) createBuilder.instance;
        b2.getClass();
        aquaVar.d = b2;
        aquaVar.b |= 2;
        aone createBuilder2 = aqtz.a.createBuilder();
        createBuilder2.copyOnWrite();
        aqtz aqtzVar = (aqtz) createBuilder2.instance;
        aqtzVar.c = 1;
        aqtzVar.b |= 1;
        aqtz aqtzVar2 = (aqtz) createBuilder2.build();
        createBuilder.copyOnWrite();
        aqua aquaVar2 = (aqua) createBuilder.instance;
        aqtzVar2.getClass();
        aquaVar2.c = aqtzVar2;
        aquaVar2.b |= 1;
        aqua aquaVar3 = (aqua) createBuilder.build();
        aahu a = this.e.a(this.f.c());
        ayqw ayqwVar = this.g;
        aalc c = a.c();
        String str = this.d;
        asyp d = asyq.d(str);
        Integer valueOf2 = Integer.valueOf(aajcVar.b);
        aone aoneVar = d.a;
        int intValue = valueOf2.intValue();
        aoneVar.copyOnWrite();
        asyt asytVar = (asyt) aoneVar.instance;
        asyt asytVar2 = asyt.a;
        asytVar.c |= 8;
        asytVar.f = intValue;
        String str2 = aajcVar.a;
        if (str2 == null) {
            str2 = "";
        }
        aone aoneVar2 = d.a;
        aoneVar2.copyOnWrite();
        asyt asytVar3 = (asyt) aoneVar2.instance;
        asytVar3.c |= 128;
        asytVar3.j = str2;
        c.i(str, aquaVar3, d.c().c());
        ayqwVar.d(c.b().S(ggc.o, ahfo.l));
        this.b = amlr.a;
    }

    @Override // defpackage.ahty
    public final void b(long j) {
        this.g.d(this.e.a(this.f.c()).i(this.c).L(new aflz(5)).Y(afly.k).k(avgz.class).ax(new ayrs() { // from class: ahtz
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                ahua ahuaVar = ahua.this;
                ahuaVar.a.d();
                int i = 0;
                aony<avhg> aonyVar = ((avhe) ((avgz) obj).getTimedListData().b.get(0)).b;
                if (aonyVar.isEmpty()) {
                    return;
                }
                long j2 = 0;
                for (avhg avhgVar : aonyVar) {
                    long j3 = avhgVar.b;
                    if (j3 <= j2) {
                        j3 = 1 + j2;
                    }
                    ahuaVar.a.e(amvf.e(Long.valueOf(j2), Long.valueOf(j3)), new aajc(i, avhgVar.c, (byte[]) null));
                    i++;
                    j2 = j3;
                }
                ahuaVar.a.e(amvf.e(Long.valueOf(j2), Long.MAX_VALUE), new aajc(i, (String) null, (byte[]) null));
                if (ahuaVar.b.h()) {
                    ahuaVar.a(((Long) ahuaVar.b.c()).longValue());
                }
            }
        }));
        a(j);
    }

    @Override // defpackage.ahty
    public final void c() {
        this.g.c();
    }
}
