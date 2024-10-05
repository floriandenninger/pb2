package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mvc {
    private final ViewGroup b;
    private final azrw c;
    private final ainy d;
    private final mvb e;
    private final mvb f;
    private final mvb g;
    private final mvb h;
    private final mvb i;
    private final mvb j;
    private final mvb k;
    private final mvb l;
    private final agof n;
    private final List a = new ArrayList();
    private boolean m = true;

    public mvc(ViewGroup viewGroup, azrw azrwVar, ainy ainyVar, agof agofVar, mux muxVar, mvk mvkVar, mvg mvgVar, mvq mvqVar, muv muvVar, mus musVar, mvq mvqVar2, byte[] bArr) {
        this.b = viewGroup;
        this.c = azrwVar;
        this.d = ainyVar;
        this.n = agofVar;
        this.e = new mvb(viewGroup, muxVar);
        this.f = new mvb(viewGroup, mvkVar);
        this.g = new mvb(viewGroup, mvgVar);
        this.h = new mvb(viewGroup, mvgVar);
        this.i = new mvb(viewGroup, mvqVar);
        this.j = new mvb(viewGroup, muvVar);
        this.k = new mvb(viewGroup, musVar);
        this.l = new mvb(viewGroup, mvqVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [muz, mvp, mvf] */
    /* JADX WARN: Type inference failed for: r1v12, types: [muz, mvp, mvf] */
    /* JADX WARN: Type inference failed for: r1v18, types: [mkp, muz, muw] */
    /* JADX WARN: Type inference failed for: r1v4, types: [muz, mur] */
    /* JADX WARN: Type inference failed for: r1v6, types: [muz, muu] */
    /* JADX WARN: Type inference failed for: r1v8, types: [muz, mvp] */
    /* JADX WARN: Type inference failed for: r7v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v27, types: [mvj, muz] */
    private final void h(Object obj, String str, ajok ajokVar) {
        avfc avfcVar;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        apmg apmgVar;
        mvd mvdVar = null;
        mvdVar = null;
        final int i = 1;
        if (obj instanceof auvo) {
            auvo auvoVar = (auvo) obj;
            if (auvoVar.c) {
                agnv d = d(str);
                ainy ainyVar = this.d;
                if ((d != null && !d.s() && !d.x()) || fkc.b(ainyVar) != null || mvj.d(ainyVar) != null) {
                    ?? r9 = (mvj) this.f.a();
                    acra acraVar = (acra) this.c.get();
                    r9.p = str;
                    auvoVar.getClass();
                    r9.o = auvoVar;
                    acraVar.getClass();
                    r9.n = acraVar;
                    apmh apmhVar = auvoVar.f;
                    if (apmhVar == null) {
                        apmhVar = apmh.a;
                    }
                    amkq.N(1 == (apmhVar.b & 1));
                    apmh apmhVar2 = auvoVar.f;
                    if (apmhVar2 == null) {
                        apmhVar2 = apmh.a;
                    }
                    apmg apmgVar2 = apmhVar2.c;
                    if (apmgVar2 == null) {
                        apmgVar2 = apmg.a;
                    }
                    r9.q = apmgVar2;
                    r9.a.h = str;
                    apmh apmhVar3 = auvoVar.f;
                    if (apmhVar3 == null) {
                        apmhVar3 = apmh.a;
                    }
                    apmg apmgVar3 = apmhVar3.c;
                    if (apmgVar3 == null) {
                        apmgVar3 = apmg.a;
                    }
                    boolean z = apmgVar3.h;
                    boolean z2 = !z;
                    r9.e.setAlpha(true != z ? 1.0f : 0.5f);
                    r9.e.setOnClickListener(z2 ? r9.k : null);
                    r9.e.setClickable(z2);
                    r9.g.setClickable(z2);
                    r9.g.setImportantForAccessibility(2);
                    r9.c.g(r9.a);
                    apmg d2 = mvj.d(r9.i);
                    if (d2 == null || d2.c != 20) {
                        apmg apmgVar4 = r9.q;
                        avfcVar = apmgVar4.c == 20 ? (avfc) apmgVar4.d : null;
                    } else {
                        avfcVar = (avfc) d2.d;
                    }
                    if (avfcVar == null || (avfcVar.b & 1) == 0) {
                        colorStateList = r9.l;
                    } else {
                        Context context = r9.b;
                        avez b = avez.b(avfcVar.c);
                        if (b == null) {
                            b = avez.THEME_ATTRIBUTE_UNKNOWN;
                        }
                        colorStateList = ColorStateList.valueOf(akbg.a(context, b, 0));
                    }
                    r9.f.setTextColor(colorStateList);
                    if (avfcVar == null || (avfcVar.b & 2) == 0) {
                        colorStateList2 = r9.m;
                    } else {
                        Context context2 = r9.b;
                        avez b2 = avez.b(avfcVar.d);
                        if (b2 == null) {
                            b2 = avez.THEME_ATTRIBUTE_UNKNOWN;
                        }
                        colorStateList2 = ColorStateList.valueOf(akbg.a(context2, b2, 0));
                    }
                    r9.g.a(colorStateList2);
                    apmg d3 = mvj.d(r9.i);
                    if (d3 != null) {
                        jla jlaVar = r9.a;
                        jlaVar.g = d3;
                        jlaVar.f = null;
                    } else {
                        jla jlaVar2 = r9.a;
                        jlaVar2.f = fkc.b(r9.i);
                        jlaVar2.g = null;
                    }
                    if (mvj.d(r9.i) != null) {
                        r9.oF(r9.c());
                    } else {
                        agnv c = r9.c();
                        r9.a(c, fkc.b(r9.i));
                        r9.e(c);
                    }
                    r9.e.setId(R.id.offline_button);
                    if (r9.e.getVisibility() == 0 && (apmgVar = r9.q) != null) {
                        r9.r.c(apmgVar, r9.e);
                    }
                    this.a.add(new mva(2, r9, this.f));
                    mvdVar = r9;
                }
            } else {
                ?? r1 = (muw) this.e.a();
                r1.c(auvoVar, (acra) this.c.get(), ajokVar);
                this.a.add(new mva(1, r1, this.e));
                mvdVar = r1;
            }
        } else if (obj instanceof auvr) {
            auvr auvrVar = (auvr) obj;
            if (auvrVar.c) {
                ?? r12 = (mvf) this.g.a();
                r12.k(auvrVar);
                this.a.add(new mva(3, r12, this.g));
                mvdVar = r12;
            } else if (auvrVar.d) {
                ?? r13 = (mvf) this.h.a();
                r13.k(auvrVar);
                this.a.add(new mva(4, r13, this.h));
                mvdVar = r13;
            } else {
                ?? r14 = (mvp) this.i.a();
                r14.k(auvrVar);
                this.a.add(new mva(5, r14, this.i));
                mvdVar = r14;
            }
        } else if (obj instanceof auvn) {
            ?? r15 = (muu) this.j.a();
            r15.n((auvn) obj);
            this.a.add(new mva(6, r15, this.j));
            mvdVar = r15;
        } else if (obj instanceof aouc) {
            final aouc aoucVar = (aouc) obj;
            final ?? r16 = (mur) this.k.a();
            acra acraVar2 = (acra) this.c.get();
            aoucVar.getClass();
            acraVar2.getClass();
            r16.f = acraVar2;
            ajokVar.getClass();
            r16.g = ajokVar;
            if ((aoucVar.b & 8) != 0) {
                aone createBuilder = auvo.a.createBuilder();
                apmh apmhVar4 = aoucVar.d;
                if (apmhVar4 == null) {
                    apmhVar4 = apmh.a;
                }
                createBuilder.copyOnWrite();
                auvo auvoVar2 = (auvo) createBuilder.instance;
                apmhVar4.getClass();
                auvoVar2.f = apmhVar4;
                auvoVar2.b |= 8;
                r16.c = (auvo) createBuilder.build();
            }
            if ((aoucVar.b & 16) != 0) {
                aone createBuilder2 = auvo.a.createBuilder();
                apmh apmhVar5 = aoucVar.e;
                if (apmhVar5 == null) {
                    apmhVar5 = apmh.a;
                }
                createBuilder2.copyOnWrite();
                auvo auvoVar3 = (auvo) createBuilder2.instance;
                apmhVar5.getClass();
                auvoVar3.f = apmhVar5;
                auvoVar3.b |= 8;
                r16.d = (auvo) createBuilder2.build();
            }
            String str2 = aoucVar.f;
            aahu c2 = r16.b.c();
            if (r16.e == null) {
                r16.e = c2.h(str2, false).ab(ayqr.a()).ay(new ayrs() { // from class: muq
                    @Override // defpackage.ayrs
                    public final void a(Object obj2) {
                        if (r2 == 0) {
                            mur murVar = r16;
                            aakt aaktVar = ((aakz) obj2).c;
                            if (aaktVar instanceof aoug) {
                                murVar.d(((aoug) aaktVar).getLinked().booleanValue());
                                return;
                            } else {
                                zga.b("Entity update does not have account link status.");
                                return;
                            }
                        }
                        r16.d(((aoug) ((aakt) obj2)).getLinked().booleanValue());
                    }
                }, ktf.q);
            }
            c2.f(str2).z(ayqr.a()).o(new ayrs() { // from class: muq
                @Override // defpackage.ayrs
                public final void a(Object obj2) {
                    if (i == 0) {
                        mur murVar = r16;
                        aakt aaktVar = ((aakz) obj2).c;
                        if (aaktVar instanceof aoug) {
                            murVar.d(((aoug) aaktVar).getLinked().booleanValue());
                            return;
                        } else {
                            zga.b("Entity update does not have account link status.");
                            return;
                        }
                    }
                    r16.d(((aoug) ((aakt) obj2)).getLinked().booleanValue());
                }
            }).l(new ayrm() { // from class: mup
                @Override // defpackage.ayrm
                public final void a() {
                    mur.this.d(aoucVar.c);
                }
            }).T();
            this.a.add(new mva(7, r16, this.k));
            mvdVar = r16;
        } else if (obj instanceof aqrf) {
            mvd mvdVar2 = (mvd) this.l.a();
            acra acraVar3 = (acra) this.c.get();
            ajds a = ajds.a((aqrf) obj);
            ajokVar.a(acraVar3);
            mvdVar2.a.addView(mvdVar2.c.a(), 0);
            mvdVar2.c.oB(ajokVar, a);
            this.a.add(new mva(8, mvdVar2, this.l));
            mvdVar = mvdVar2;
        }
        this.m = (this.m ? 1 : 0) | (mvdVar != null ? 1 : 0);
    }

    public final View a() {
        muu c = c();
        if (c != null) {
            return c.c;
        }
        return null;
    }

    public final View b() {
        for (mva mvaVar : this.a) {
            if (mvaVar.a == 2) {
                return mvaVar.b.oE();
            }
        }
        return null;
    }

    public final muu c() {
        for (mva mvaVar : this.a) {
            if (mvaVar.a == 6) {
                muz muzVar = mvaVar.b;
                if (muzVar instanceof muu) {
                    return (muu) muzVar;
                }
            }
        }
        return null;
    }

    public final agnv d(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return (agnv) ((ammv) this.n.a().m().h(str).get(4L, TimeUnit.SECONDS)).f();
        } catch (InterruptedException e) {
            String valueOf = String.valueOf(str);
            zga.d(valueOf.length() != 0 ? "Get video snapshot was interrupted for video id ".concat(valueOf) : new String("Get video snapshot was interrupted for video id "), e);
            return null;
        } catch (ExecutionException e2) {
            String valueOf2 = String.valueOf(str);
            zga.d(valueOf2.length() != 0 ? "Failed to get video snapshot for video id ".concat(valueOf2) : new String("Failed to get video snapshot for video id "), e2);
            return null;
        } catch (TimeoutException e3) {
            String valueOf3 = String.valueOf(str);
            zga.d(valueOf3.length() != 0 ? "Get video snapshot timed out for video id ".concat(valueOf3) : new String("Get video snapshot timed out for video id "), e3);
            return null;
        }
    }

    public final void e(Iterable iterable, String str, ajok ajokVar) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            auvp auvpVar = (auvp) it.next();
            int i = auvpVar.b;
            if (i == 124608017) {
                h((auvo) auvpVar.c, str, ajokVar);
            } else if (i == 124608045) {
                h((auvr) auvpVar.c, str, ajokVar);
            } else if (i == 186676672) {
                h((auvn) auvpVar.c, str, ajokVar);
            } else if (i == 265166751) {
                h((aouc) auvpVar.c, str, ajokVar);
            } else if (i == 153515154) {
                h((aqrf) auvpVar.c, str, ajokVar);
            }
        }
    }

    public final void f() {
        for (mva mvaVar : amkq.aT(this.a)) {
            mvb mvbVar = mvaVar.c;
            muz muzVar = mvaVar.b;
            muzVar.b();
            mvbVar.a.removeView(muzVar.oE());
            mvbVar.b.offerLast(muzVar);
        }
        this.a.clear();
    }

    public final void g() {
        if (this.m) {
            this.b.removeAllViews();
            this.m = true;
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                this.b.addView(((mva) it.next()).b.oE());
            }
            this.m = false;
        }
        ViewGroup viewGroup = this.b;
        whu.I(viewGroup, viewGroup.getChildCount() > 0);
    }
}
