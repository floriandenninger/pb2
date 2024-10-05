package defpackage;

import com.google.protos.youtube.api.innertube.RelatedChipCloudRendererOuterClass;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class oho extends ajtc implements ohm, lxb, ypd {
    public final goo a;
    private List b;
    private int o;
    private int p;

    public oho(ajvb ajvbVar, ypa ypaVar, ausu ausuVar, List list, int i, ajuo ajuoVar, ammv ammvVar, CharSequence charSequence, apxf apxfVar, ajwv ajwvVar, ajxe ajxeVar, ajta ajtaVar) {
        super(ajvbVar, ypaVar, ausuVar, list, i, ajuoVar, ammvVar, null, charSequence, apxfVar, 1, false, ajwvVar, null, ajxeVar, ajtaVar);
        this.d.mK(new ajve(this));
        if ((ausuVar.b & 8) != 0) {
            aulq aulqVar = ausuVar.i;
            if ((aulqVar == null ? aulq.a : aulqVar).pY(RelatedChipCloudRendererOuterClass.relatedChipCloudRenderer)) {
                aulq aulqVar2 = ausuVar.i;
                aulg aulgVar = (aulg) (aulqVar2 == null ? aulq.a : aulqVar2).pX(RelatedChipCloudRendererOuterClass.relatedChipCloudRenderer);
                if (this.e.contains(aulgVar) && (aulgVar.b & 2) != 0) {
                    ajoc ajocVar = this.d;
                    int bN = aobq.bN(aulgVar.d);
                    ajocVar.mK(new ohn(this, bN == 0 ? 1 : bN));
                }
            }
        }
        ypaVar.h(this, oho.class);
        this.a = new goo();
    }

    private final void v(Collection collection) {
        List list = this.m;
        list.clear();
        list.addAll(collection);
        this.f.clear();
        this.f.addAll(0, collection);
    }

    @Override // defpackage.ohm
    public final int b() {
        return this.o;
    }

    @Override // defpackage.ohm
    public final int e() {
        return this.p;
    }

    @Override // defpackage.ohm
    public final void g() {
        List list = this.b;
        if (list != null) {
            v(list);
        }
        this.o++;
    }

    @Override // defpackage.ohm
    public final void h() {
        if (this.b == null) {
            this.b = new ArrayList(this.m);
        }
        ajpd ajpdVar = this.f;
        ajpdVar.h(0, ajpdVar.size());
        for (int i = 0; i < 16; i++) {
            ajpdVar.add(new fhh(i));
        }
        this.o++;
    }

    public final void i(List list) {
        if (this.b == null) {
            this.b = new ArrayList(this.m);
        }
        if (!list.isEmpty()) {
            v(this.n.a(list));
        }
        this.o++;
    }

    @Override // defpackage.ohm
    public final void k(int i) {
        this.p = i;
    }

    @Override // defpackage.ajtc, defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        ammv ammvVar;
        if (cls != oho.class) {
            return ahbw.l(this, obj, i);
        }
        if (i == -1) {
            return new Class[]{izi.class, aaxb.class, ajvf.class};
        }
        if (i == 0) {
            izi iziVar = (izi) obj;
            if (iziVar.b().h()) {
                r(iziVar.h(), iziVar.b().c());
                return null;
            }
            if (iziVar.f().h()) {
                r(iziVar.h(), iziVar.f().c());
                this.a.b(iziVar.f().c(), iziVar.h());
                return null;
            }
            if (!iziVar.e().h()) {
                return null;
            }
            r(iziVar.h(), iziVar.e().c());
            this.a.b(iziVar.e().c(), iziVar.h());
            return null;
        }
        if (i != 1) {
            if (i == 2) {
                p(((ajvf) obj).a());
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        ammv i2 = ammv.i(((aaxb) obj).b());
        if (i2.h()) {
            ammvVar = this.a.a(i2.c());
        } else {
            ammvVar = amlr.a;
        }
        if (!i2.h() || !ammvVar.h()) {
            return null;
        }
        r(i2.c(), ammvVar.c());
        return null;
    }

    @Override // defpackage.lxb
    public final void q(Object obj, Object obj2) {
        this.a.b(obj2, obj);
        r(obj, obj2);
    }
}
