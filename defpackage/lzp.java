package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.youtube.R;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lzp {
    public final ajjz a;
    public final gni b;
    public final Context c;
    public final aypy d;
    final lzl e = lzl.a;
    private final ffv f;
    private final ggs g;
    private final int h;
    private final axzg i;

    public lzp(aaea aaeaVar, axzg axzgVar, Context context, final aais aaisVar, final aahv aahvVar, final afsy afsyVar, izt iztVar, ywr ywrVar, gni gniVar, ggs ggsVar, ajjz ajjzVar, byte[] bArr) {
        this.c = context;
        axzgVar.getClass();
        this.i = axzgVar;
        ajjzVar.getClass();
        this.a = ajjzVar;
        this.f = new ffv(context);
        gniVar.getClass();
        this.b = gniVar;
        ggsVar.getClass();
        this.g = ggsVar;
        this.h = context.getResources().getDimensionPixelSize(R.dimen.yoodle_height);
        this.d = aypy.m(ywrVar.d().A(luw.c).n().U(), aypy.m(aaeaVar.a, iztVar.a().O(luw.e).Y(luw.g).B(), knl.f).aj(new ayrv() { // from class: lzj
            @Override // defpackage.ayrv
            public final Object a(Object obj) {
                aais aaisVar2 = aais.this;
                afsy afsyVar2 = afsyVar;
                aahv aahvVar2 = aahvVar;
                String str = (String) obj;
                if (str.isEmpty()) {
                    return aypy.W(amlr.a);
                }
                return aypy.m(aaisVar2.a(afsyVar2.c()).i(str), aahvVar2.a(afsyVar2.c()).i(str), knl.e);
            }
        }).B(), knl.d).O(new ayrv() { // from class: lzi
            @Override // defpackage.ayrv
            public final Object a(Object obj) {
                ammv j;
                lzp lzpVar = lzp.this;
                ammv ammvVar = (ammv) obj;
                if (!ammvVar.h()) {
                    return lzpVar.a(amlr.a, null);
                }
                asuz asuzVar = (asuz) ammvVar.c();
                amkq.u(lzpVar.b);
                gng a = lzpVar.b.a();
                if (a == gng.LIGHT && (asuzVar.b.b & 2) != 0) {
                    j = ammv.j(asuzVar.getLightThemeLogo());
                } else {
                    j = (a != gng.DARK || (asuzVar.b.b & 4) == 0) ? amlr.a : ammv.j(asuzVar.getDarkThemeLogo());
                }
                return lzpVar.a(j, asuzVar.getOnTapCommand());
            }
        }).ah(amlr.a).aJ().d().B();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ayps a(ammv ammvVar, final apxf apxfVar) {
        Boolean bool;
        ammv j;
        arfs arfsVar;
        asvc asvcVar;
        asvc asvcVar2;
        if (!ammvVar.h()) {
            return ayps.w(amlr.a);
        }
        asuv asuvVar = (asuv) ammvVar.c();
        amkq.u(this.i);
        aqvj aqvjVar = this.i.b.b().C;
        if (aqvjVar == null) {
            aqvjVar = aqvj.a;
        }
        if (aqvjVar.a(45358145L)) {
            aoot aootVar = aqvjVar.b;
            if (!aootVar.containsKey(45358145L)) {
                throw new IllegalArgumentException();
            }
            aqvk aqvkVar = (aqvk) aootVar.get(45358145L);
            bool = Boolean.valueOf(aqvkVar.b == 1 ? ((Boolean) aqvkVar.c).booleanValue() : false);
        } else {
            bool = false;
        }
        if (bool.booleanValue()) {
            if (asuvVar.b == 3) {
                asvcVar = (asvc) asuvVar.c;
            } else {
                asvcVar = asvc.a;
            }
            if ((asvcVar.b & 1) != 0) {
                if (asuvVar.b == 3) {
                    asvcVar2 = (asvc) asuvVar.c;
                } else {
                    asvcVar2 = asvc.a;
                }
                final String str = asvcVar2.c;
                amkq.u(this.e);
                return ayps.i(new aypu() { // from class: lzm
                    @Override // defpackage.aypu
                    public final void a(final azcc azccVar) {
                        lzp lzpVar = lzp.this;
                        String str2 = str;
                        final apxf apxfVar2 = apxfVar;
                        amkq.u(lzpVar.c);
                        cfq.l(lzpVar.c, str2).e(new cgb() { // from class: lzg
                            @Override // defpackage.cgb
                            public final void a(Object obj) {
                                apxf apxfVar3 = apxf.this;
                                azcc azccVar2 = azccVar;
                                lzt lztVar = new lzt(apxfVar3);
                                lztVar.a.r((cfj) obj);
                                if (azccVar2.e()) {
                                    return;
                                }
                                azccVar2.c(lztVar);
                            }
                        });
                    }
                }).x(luw.d).m(ktf.k).A();
            }
        }
        if (asuvVar.b == 1) {
            amkq.u(this.g);
            ggs ggsVar = this.g;
            if (asuvVar.b == 1) {
                arfsVar = (arfs) asuvVar.c;
            } else {
                arfsVar = arfs.a;
            }
            arfr b = arfr.b(arfsVar.c);
            if (b == null) {
                b = arfr.UNKNOWN;
            }
            int a = ggsVar.a(b);
            if (a != 0) {
                amkq.u(this.c);
                Drawable a2 = aii.a(this.c, a);
                if (a2 != null) {
                    return ayps.w(ammv.j(new man(a2, apxfVar)));
                }
            }
        }
        if (asuvVar.b != 2) {
            return ayps.w(amlr.a);
        }
        avgg avggVar = (avgg) asuvVar.c;
        if (avggVar.c.size() == 0) {
            return ayps.w(amlr.a);
        }
        int i = this.h;
        if (!ahbw.L(avggVar)) {
            j = amlr.a;
        } else if (i <= 0) {
            j = ammv.j((avgf) avggVar.c.get(0));
        } else {
            Iterator it = avggVar.c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    j = ammv.j((avgf) avggVar.c.get(avggVar.c.size() - 1));
                    break;
                }
                avgf avgfVar = (avgf) it.next();
                if (avgfVar.e >= i) {
                    j = ammv.j(avgfVar);
                    break;
                }
            }
        }
        if (!j.h()) {
            return ayps.w(amlr.a);
        }
        final Uri parse = Uri.parse(((avgf) j.c()).c);
        ayqj p = ayqj.p(new ayql() { // from class: lzn
            @Override // defpackage.ayql
            public final void a(azmi azmiVar) {
                lzp lzpVar = lzp.this;
                Uri uri = parse;
                lzo lzoVar = new lzo(azmiVar);
                amkq.u(lzpVar.a);
                lzpVar.a.m(uri, lzoVar);
            }
        });
        amkq.u(this.f);
        final ffv ffvVar = this.f;
        return p.G(new ayrv() { // from class: lzh
            @Override // defpackage.ayrv
            public final Object a(Object obj) {
                return ffv.this.b((byte[]) obj);
            }
        }).y(ktf.j).G(new ayrv() { // from class: lzk
            @Override // defpackage.ayrv
            public final Object a(Object obj) {
                return new man((Drawable) obj, apxf.this);
            }
        }).n(lzq.class).G(luw.d).j().m(ktf.l).A();
    }
}
