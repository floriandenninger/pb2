package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class luo extends ajvy implements ypd {
    public final ajtz a;
    public final zaw b;
    public final aahd c;
    public final ypa d;
    public final kyj e;
    public boolean f;
    public String g;
    private final fjs n;
    private final jti o;
    private atdn p;

    public luo(ajvb ajvbVar, ypa ypaVar, zaw zawVar, aahd aahdVar, kyj kyjVar, fjs fjsVar, jti jtiVar, aasm aasmVar, ajtz ajtzVar, acra acraVar) {
        super(aasmVar, ajvbVar, ypaVar, zawVar, acraVar);
        this.f = false;
        this.a = ajtzVar;
        this.b = zawVar;
        this.c = aahdVar;
        this.d = ypaVar;
        this.e = kyjVar;
        this.n = fjsVar;
        this.o = jtiVar;
        this.h.mK(new ajol() { // from class: lum
            @Override // defpackage.ajol
            public final void a(ajok ajokVar, ajng ajngVar, int i) {
                luo luoVar = luo.this;
                if (luoVar.f) {
                    lsz.g(ajokVar, "DragReorderCoordinator.DATA_ADAPTER_KEY", luoVar.h);
                }
            }
        });
    }

    @Override // defpackage.ajvy
    public final void c(abbi abbiVar) {
        super.c(abbiVar);
    }

    @Override // defpackage.ajvy
    protected final void d(List list, aude audeVar) {
        int i = audeVar.b;
        if ((i & 16) != 0) {
            auja aujaVar = audeVar.g;
            if (aujaVar == null) {
                aujaVar = auja.a;
            }
            list.add(aujaVar);
            return;
        }
        if ((i & 64) != 0) {
            atdn atdnVar = audeVar.i;
            if (atdnVar == null) {
                atdnVar = atdn.a;
            }
            list.add(atdnVar);
        }
    }

    public final void i() {
        if (this.p == null) {
            this.p = (atdn) this.o.g(fjs.class, atdn.class, this.n, null);
            this.m.add(this.p);
        }
    }

    @Override // defpackage.ajud, defpackage.ajtz, defpackage.zfk
    public final void j() {
        this.m.remove(this.p);
        this.p = null;
        this.g = null;
        super.j();
    }

    @Override // defpackage.ajvy
    protected final void k(audc audcVar) {
        avwi avwiVar;
        avwi avwiVar2;
        String str = audcVar.f;
        this.g = str;
        if (this.p != null) {
            return;
        }
        if (str.isEmpty() || !this.n.i(audcVar.f)) {
            Iterator it = audcVar.d.iterator();
            while (it.hasNext()) {
                audj audjVar = ((aude) it.next()).c;
                if (audjVar == null) {
                    audjVar = audj.a;
                }
                audh audhVar = audjVar.x;
                if (audhVar == null) {
                    audhVar = audh.a;
                }
                if (audhVar.b == 135739233) {
                    avwiVar = (avwi) audhVar.c;
                } else {
                    avwiVar = avwi.a;
                }
                if ((avwiVar.b & 1) != 0) {
                    fjs fjsVar = this.n;
                    audh audhVar2 = audjVar.x;
                    if (audhVar2 == null) {
                        audhVar2 = audh.a;
                    }
                    if (audhVar2.b == 135739233) {
                        avwiVar2 = (avwi) audhVar2.c;
                    } else {
                        avwiVar2 = avwi.a;
                    }
                    if (fjsVar.l(avwiVar2.c)) {
                    }
                }
            }
            return;
        }
        i();
    }

    @Override // defpackage.ajvy, defpackage.ajud, defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        audc audcVar;
        if (cls == luo.class) {
            switch (i) {
                case -1:
                    return new Class[]{izi.class, ltb.class, aacj.class, abbc.class, abbi.class, agkl.class};
                case 0:
                    G(((izi) obj).h());
                    return null;
                case 1:
                    ltb ltbVar = (ltb) obj;
                    if (!this.f || !amkq.b(ltbVar.b, this.h)) {
                        return null;
                    }
                    int i2 = ltbVar.c;
                    int i3 = ltbVar.d;
                    if (i2 == i3) {
                        return null;
                    }
                    Object obj2 = ltbVar.b.get(i3);
                    if (!(obj2 instanceof audj)) {
                        return null;
                    }
                    audj audjVar = (audj) obj2;
                    if ((audjVar.b & 4096) == 0) {
                        return null;
                    }
                    int i4 = ltbVar.d - 1;
                    Object obj3 = i4 >= 0 ? ltbVar.b.get(i4) : null;
                    if (obj3 != null && !(obj3 instanceof audj)) {
                        return null;
                    }
                    audj audjVar2 = (audj) obj3;
                    String str = (audjVar2 == null || (audjVar2.b & 4096) == 0) ? null : audjVar2.o;
                    String str2 = (String) audjVar.pX(audg.b);
                    this.e.a(str2, audjVar.o, str, new lun(this, obj2, str2));
                    return null;
                case 2:
                    G(((aacj) obj).b());
                    return null;
                case 3:
                    abbc abbcVar = (abbc) obj;
                    arzb arzbVar = abbcVar.b;
                    if (arzbVar == null) {
                        return null;
                    }
                    arze arzeVar = arzbVar.e;
                    if (arzeVar == null) {
                        arzeVar = arze.a;
                    }
                    if (arzeVar.b != 54681060) {
                        return null;
                    }
                    arze arzeVar2 = abbcVar.b.e;
                    if (arzeVar2 == null) {
                        arzeVar2 = arze.a;
                    }
                    if (arzeVar2.b == 54681060) {
                        audcVar = (audc) arzeVar2.c;
                    } else {
                        audcVar = audc.a;
                    }
                    l(audcVar);
                    ajtz ajtzVar = this.a;
                    if (ajtzVar == null) {
                        return null;
                    }
                    ajtzVar.B();
                    return null;
                case 4:
                    super.c((abbi) obj);
                    return null;
                case 5:
                    if (!((agkl) obj).a.equals(this.g)) {
                        return null;
                    }
                    i();
                    return null;
                default:
                    StringBuilder sb = new StringBuilder(32);
                    sb.append("unsupported op code: ");
                    sb.append(i);
                    throw new IllegalStateException(sb.toString());
            }
        }
        return super.kz(cls, obj, i);
    }

    @Override // defpackage.ajvy
    public final void l(audc audcVar) {
        boolean z = false;
        if (audcVar != null && audcVar.g) {
            z = true;
        }
        this.f = z;
        super.l(audcVar);
    }
}
