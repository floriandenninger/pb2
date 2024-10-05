package defpackage;

import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class npk extends ajvj implements xps, ypd {
    private final ajfh a;
    private final xnm b;
    private final acra c;
    private final xpu d;

    public npk(ajvb ajvbVar, ypa ypaVar, zaw zawVar, ajfh ajfhVar, xnm xnmVar, xpu xpuVar, aasm aasmVar, acra acraVar) {
        super(aasmVar, ajvbVar, ypaVar, zawVar, acraVar, null);
        this.a = ajfhVar;
        this.b = xnmVar;
        this.d = xpuVar;
        this.c = acraVar;
        L(ajfhVar);
        amsv i = amsx.i();
        i.k(xpuVar.a.listIterator());
        i.c(this);
        xpuVar.a = i.g();
    }

    @Override // defpackage.xps
    public final void c(arly arlyVar) {
        arlj arljVar;
        aqrf aqrfVar;
        arlz arlzVar = arlyVar.d;
        if (arlzVar == null) {
            arlzVar = arlz.a;
        }
        if (arlzVar.b != 153515154 || this.a == null) {
            return;
        }
        xnm xnmVar = this.b;
        if ((arlyVar.b & 16) != 0) {
            arljVar = arlyVar.h;
            if (arljVar == null) {
                arljVar = arlj.a;
            }
        } else {
            arljVar = null;
        }
        xnmVar.b(arljVar, amrz.k("sectionController", this), R.string.reply_added);
        if (ai(ajcd.NEXT)) {
            return;
        }
        arlz arlzVar2 = arlyVar.d;
        if (arlzVar2 == null) {
            arlzVar2 = arlz.a;
        }
        if (arlzVar2.b == 153515154) {
            aqrfVar = (aqrf) arlzVar2.c;
        } else {
            aqrfVar = aqrf.a;
        }
        if ((aqrfVar.b & 8) != 0) {
            this.c.D(new acqx(aqrfVar.e.I()));
        }
        A(ajds.a(aqrfVar));
    }

    @Override // defpackage.ajud, defpackage.ajtz, defpackage.zfk
    public final void j() {
        super.j();
        xpu xpuVar = this.d;
        amsv i = amsx.i();
        amxd listIterator = xpuVar.a.listIterator();
        while (listIterator.hasNext()) {
            xps xpsVar = (xps) listIterator.next();
            if (xpsVar != this) {
                i.c(xpsVar);
            }
        }
        xpuVar.a = i.g();
    }

    @Override // defpackage.ajvj, defpackage.ajud, defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (cls != npk.class) {
            return super.kz(cls, obj, i);
        }
        if (i == -1) {
            return new Class[]{aacj.class, aacl.class, aaxa.class, ajvf.class};
        }
        if (i == 0) {
            nl((aacj) obj);
            return null;
        }
        if (i == 1) {
            nm((aacl) obj);
            return null;
        }
        if (i == 2) {
            N((aaxa) obj);
            return null;
        }
        if (i == 3) {
            M((ajvf) obj);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
