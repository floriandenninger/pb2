package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kgg implements ajon, ypd {
    public final ypa a;
    public final ajvq b;
    public ajvo c;
    public final /* synthetic */ aicw d;

    public kgg(aicw aicwVar, ypa ypaVar, ajvq ajvqVar) {
        this.d = aicwVar;
        this.a = ypaVar;
        this.b = ajvqVar;
    }

    public final ajvo a(ajtx ajtxVar) {
        ajvn a = ajvo.a();
        a.a = ajtxVar;
        a.b = this.d.k.v;
        return a.a();
    }

    public final void b(ajtx ajtxVar) {
        if (ajtxVar == null) {
            return;
        }
        ajvo ajvoVar = this.c;
        if (ajvoVar == null) {
            this.c = a(ajtxVar);
        } else if (ajvoVar.a != ajtxVar) {
            this.c = ajvoVar.b(ajtxVar);
        }
        if (ajtxVar instanceof ajtr) {
            if (this.d.k.ai(ajcd.NEXT)) {
                ajvo ajvoVar2 = this.c;
                if (ajvoVar2 != null) {
                    this.c = ajvoVar2.b(ajtw.a());
                }
                this.b.q(this.c);
                return;
            }
            this.b.q(null);
            return;
        }
        this.b.q(this.c);
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ajtr.class, ajtv.class, ajtw.class};
        }
        if (i == 0) {
            b((ajtr) obj);
            return null;
        }
        if (i == 1) {
            b((ajtv) obj);
            return null;
        }
        if (i == 2) {
            b((ajtw) obj);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    @Override // defpackage.ajon
    public final void o(ajom ajomVar, Object obj) {
        if (obj == this.c) {
            this.d.k.lt(this.d.k.W(ajcd.NEXT));
        }
    }
}
