package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class hag implements ayrs {
    public final /* synthetic */ hah a;
    private final /* synthetic */ int b;

    public /* synthetic */ hag(hah hahVar, int i) {
        this.b = i;
        this.a = hahVar;
    }

    @Override // defpackage.ayrs
    public final void a(Object obj) {
        if (this.b == 0) {
            final hah hahVar = this.a;
            final String str = (String) obj;
            hahVar.b.c().f(str).z(azre.b(hahVar.c)).g(auym.class).W(new hag(hahVar, 1), aysu.e, new ayrm() { // from class: haf
                @Override // defpackage.ayrm
                public final void a() {
                    hah hahVar2 = hah.this;
                    String str2 = str;
                    aaio c = ((aaih) hahVar2.a.c()).c();
                    str2.getClass();
                    amkq.O(!str2.isEmpty(), "key cannot be empty");
                    aone createBuilder = auyn.a.createBuilder();
                    createBuilder.copyOnWrite();
                    auyn auynVar = (auyn) createBuilder.instance;
                    auynVar.b |= 1;
                    auynVar.c = str2;
                    auyk auykVar = new auyk(createBuilder);
                    Boolean bool = false;
                    aone aoneVar = auykVar.a;
                    boolean booleanValue = bool.booleanValue();
                    aoneVar.copyOnWrite();
                    auyn auynVar2 = (auyn) aoneVar.instance;
                    auynVar2.b |= 2;
                    auynVar2.d = booleanValue;
                    c.k(auykVar);
                    c.b();
                }
            });
        } else {
            aaio c = ((aaih) this.a.a.c()).c();
            c.d((auym) obj);
            c.b();
        }
    }
}
