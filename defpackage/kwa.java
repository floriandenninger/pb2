package defpackage;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kwa extends ajvj implements ypd {
    public final HashSet a;
    public final HashMap b;

    public kwa(ajvb ajvbVar, ypa ypaVar, zaw zawVar, aasm aasmVar, acra acraVar, ajxe ajxeVar) {
        super(aasmVar, ajvbVar, ypaVar, zawVar, acraVar, ajxeVar, new ajpd());
        this.a = new HashSet();
        this.b = new HashMap();
        this.i.mK(new kvx(this));
        L(new kvz(this));
    }

    @Override // defpackage.ajvj, defpackage.ajud, defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        kvy kvyVar;
        if (cls != kwa.class) {
            return super.kz(cls, obj, i);
        }
        boolean z = false;
        if (i == -1) {
            return new Class[]{kwk.class};
        }
        if (i == 0) {
            auca a = ((kwk) obj).a();
            aulq aulqVar = a.b;
            if (aulqVar == null) {
                aulqVar = aulq.a;
            }
            audc audcVar = (audc) aulqVar.pX(audf.a);
            int size = audcVar.d.size();
            int i2 = 0;
            while (true) {
                if (i2 >= this.i.size()) {
                    i2 = 0;
                    break;
                }
                if (a.equals(this.i.get(i2))) {
                    z = true;
                    break;
                }
                i2++;
            }
            if (!z) {
                return null;
            }
            if (this.a.add(a)) {
                this.i.h(i2 + 1, size);
            } else {
                this.a.remove(a);
                amrp amrpVar = new amrp();
                Iterator it = audcVar.d.iterator();
                while (it.hasNext()) {
                    audj audjVar = ((aude) it.next()).c;
                    if (audjVar == null) {
                        audjVar = audj.a;
                    }
                    amrpVar.h(audjVar);
                }
                E(amrpVar.g(), i2 + 1);
            }
            if (!this.b.containsKey(a) || (kvyVar = (kvy) this.b.get(a)) == null) {
                return null;
            }
            this.a.contains(a);
            kvyVar.a();
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
