package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ltl extends ajsu implements ypd {
    public final ajpd a;
    public final aqvm b;
    private final ypa c;
    private final ajul d;

    public ltl(ajvb ajvbVar, ypa ypaVar, aqvm aqvmVar) {
        this.c = ypaVar;
        aqvmVar.getClass();
        this.b = aqvmVar;
        ajvbVar.a(avvq.class);
        ajpd ajpdVar = new ajpd();
        this.a = ajpdVar;
        this.d = new ajul();
        ajpdVar.clear();
        ajpdVar.add(aqvmVar);
        for (aqvn aqvnVar : aqvmVar.d) {
            int i = aqvnVar.b;
            if ((i & 16) != 0) {
                ajpd ajpdVar2 = this.a;
                aqcj aqcjVar = aqvnVar.g;
                ajpdVar2.add(aqcjVar == null ? aqcj.a : aqcjVar);
            } else if ((i & 1) != 0) {
                ajpd ajpdVar3 = this.a;
                aqdb aqdbVar = aqvnVar.c;
                ajpdVar3.add(aqdbVar == null ? aqdb.a : aqdbVar);
            } else if ((i & 8) != 0) {
                ajpd ajpdVar4 = this.a;
                aqbj aqbjVar = aqvnVar.f;
                ajpdVar4.add(aqbjVar == null ? aqbj.a : aqbjVar);
            } else if ((i & 4) != 0) {
                ajpd ajpdVar5 = this.a;
                aqcb aqcbVar = aqvnVar.e;
                ajpdVar5.add(aqcbVar == null ? aqcb.a : aqcbVar);
            } else if ((i & 2) != 0) {
                ajpd ajpdVar6 = this.a;
                aqgn aqgnVar = aqvnVar.d;
                ajpdVar6.add(aqgnVar == null ? aqgn.a : aqgnVar);
            }
        }
        this.a.add(this.d);
        ypaVar.g(this);
    }

    @Override // defpackage.ajsu, defpackage.zfk
    public final void j() {
        this.c.m(this);
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{aacj.class, aaxa.class};
        }
        if (i == 0) {
            aacj aacjVar = (aacj) obj;
            if (aacjVar.b() == this.b) {
                this.a.clear();
                return null;
            }
            this.a.remove(aacjVar.b());
            return null;
        }
        if (i == 1) {
            aaxa aaxaVar = (aaxa) obj;
            if (aaxaVar.b() == this.b) {
                this.a.clear();
                return null;
            }
            this.a.remove(aaxaVar.b());
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    @Override // defpackage.ajvc
    public final ajng lC() {
        return this.a;
    }
}
