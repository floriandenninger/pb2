package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lur extends ajxh implements ypd {
    private final ypa a;

    public lur(ajvb ajvbVar, ypa ypaVar, ajfh ajfhVar, ajfh ajfhVar2, ausu ausuVar, avvq avvqVar, ajxe ajxeVar, ajol ajolVar) {
        super(ajvbVar, ypaVar, ausuVar, avvqVar, ajfhVar, ajfhVar2, ajxeVar);
        this.a = ypaVar;
        ausu ausuVar2 = this.c;
        if ((ausuVar2.c & 32) == 0) {
            this.h.clear();
        } else {
            ajpd ajpdVar = this.h;
            aqrh aqrhVar = ausuVar2.v;
            ajpdVar.add(new ajny(aqrhVar == null ? aqrh.a : aqrhVar));
            this.g.mK(new ldg(4));
        }
        if (ajolVar != null) {
            this.d.mK(ajolVar);
        }
        ypaVar.h(this, lur.class);
    }

    @Override // defpackage.ajxh, defpackage.ajtc
    protected final void d() {
        super.d();
        m(new luq());
    }

    @Override // defpackage.ajtc, defpackage.ajsu, defpackage.zfk
    public final void j() {
        super.j();
        this.a.m(this);
    }

    @Override // defpackage.ajtc, defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (cls != lur.class) {
            return ahbw.l(this, obj, i);
        }
        if (i == -1) {
            return new Class[]{gli.class};
        }
        if (i == 0) {
            String str = ((gli) obj).a;
            for (Object obj2 : this.m) {
                if ((obj2 instanceof aqcj) && str.equals(((aqcj) obj2).c)) {
                    p(obj2);
                    return null;
                }
            }
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
