package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ohq extends lul implements ohm, ypd {
    public int a;
    private List b;
    private int c;

    public ohq(abds abdsVar, ajvb ajvbVar, ypa ypaVar, zaw zawVar, acra acraVar, ajun ajunVar, ajfh ajfhVar, shf shfVar, jap japVar, ammv ammvVar) {
        super(ajvbVar, ypaVar, zawVar, ajfhVar, shfVar, japVar, ammvVar, ajunVar, abdsVar, acraVar, null);
    }

    public static boolean r(aalz aalzVar) {
        if (aalzVar != null) {
            askd askdVar = aalzVar.a;
            if ((askdVar.c & 8) != 0 && askdVar.i.equals("related-items")) {
                return true;
            }
        }
        return false;
    }

    private final void s() {
        this.b = null;
        this.a = 0;
        this.c = 0;
    }

    @Override // defpackage.ohm
    public final int b() {
        return this.a;
    }

    @Override // defpackage.ohm
    public final int e() {
        return this.c;
    }

    @Override // defpackage.ohm
    public final void g() {
        List list = this.b;
        if (list != null) {
            ajpd ajpdVar = this.i;
            ajpdVar.clear();
            ajpdVar.addAll(list);
            this.b = null;
        }
        this.a++;
    }

    @Override // defpackage.ohm
    public final void h() {
        if (this.b == null) {
            this.b = new ArrayList();
            this.i.k(this.b);
        }
        for (int i = 0; i < this.i.size(); i++) {
            Object obj = this.i.get(i);
            if (!(obj instanceof fhh) && !(obj instanceof aulg)) {
                I(obj, new fhh(i));
            }
        }
        this.a++;
    }

    @Override // defpackage.lul, defpackage.ajvj
    public final void i(aalz aalzVar) {
        super.i(aalzVar);
        askd askdVar = aalzVar.a;
        if ((askdVar.c & 1) != 0) {
            askb askbVar = askdVar.d;
            if (askbVar == null) {
                askbVar = askb.a;
            }
            if ((askbVar.b & 128) != 0) {
                askb askbVar2 = askdVar.d;
                if (askbVar2 == null) {
                    askbVar2 = askb.a;
                }
                aulg aulgVar = askbVar2.j;
                if (aulgVar == null) {
                    aulgVar = aulg.a;
                }
                if (!this.i.contains(aulgVar) || (aulgVar.b & 2) == 0) {
                    return;
                }
                ajpd ajpdVar = this.i;
                int bN = aobq.bN(aulgVar.d);
                ajpdVar.mK(new ohn(this, bN != 0 ? bN : 1));
            }
        }
    }

    @Override // defpackage.ajud, defpackage.ajtz, defpackage.zfk
    public final void j() {
        super.j();
        s();
    }

    @Override // defpackage.ohm
    public final void k(int i) {
        this.c = i;
    }

    @Override // defpackage.lul, defpackage.ajvj, defpackage.ajud, defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (cls == ohq.class) {
            switch (i) {
                case -1:
                    return new Class[]{izi.class, aacj.class, aacl.class, aaxa.class, aaxb.class, ajvf.class};
                case 0:
                    n((izi) obj);
                    return null;
                case 1:
                    nl((aacj) obj);
                    return null;
                case 2:
                    nm((aacl) obj);
                    return null;
                case 3:
                    N((aaxa) obj);
                    return null;
                case 4:
                    o((aaxb) obj);
                    return null;
                case 5:
                    M((ajvf) obj);
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

    @Override // defpackage.ajud
    public final void lD() {
        super.lD();
        s();
    }
}
