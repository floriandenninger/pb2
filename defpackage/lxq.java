package defpackage;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.service.c;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lxq extends ajxi {
    private final ajyw A;
    private final ajyw B;
    private final ajoy C;
    private final ajyw D;
    private final ajoy E;
    private final ajoy F;
    private final ajoy G;
    private final ajoy H;
    private final ajoy I;
    private final Activity a;
    private final aasm f;
    private final ajvb g;
    private final lwk h;
    private final jzm i;
    private final ohx j;
    private final yap k;
    private final abie l;
    private final yaq m;
    private final nrp n;
    private final nrp o;
    private final agqo p;
    private final nrp q;
    private final nmc r;
    private final agqo s;
    private final oiy t;
    private final ohg u;
    private final ogx v;
    private final amsj w;
    private final c x;
    private final c y;
    private final c z;

    public lxq(Activity activity, ypa ypaVar, ajvb ajvbVar, zaw zawVar, lwk lwkVar, ajoy ajoyVar, ajoy ajoyVar2, ajoy ajoyVar3, ajoy ajoyVar4, ajoy ajoyVar5, oiy oiyVar, ogx ogxVar, abie abieVar, aasm aasmVar, acra acraVar, ajyw ajywVar, ajti ajtiVar, ajti ajtiVar2, nrp nrpVar, agqo agqoVar, nrp nrpVar2, ajyw ajywVar2, ajyw ajywVar3, jzm jzmVar, nrp nrpVar3, ohg ohgVar, c cVar, c cVar2, ajoy ajoyVar6, ajyw ajywVar4, ohx ohxVar, nmc nmcVar, agqo agqoVar2, yaq yaqVar, yap yapVar, c cVar3, amsj amsjVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        super(aasmVar, ypaVar, ajvbVar, zawVar, acraVar, ajtiVar, ajtiVar2, ajywVar, null);
        this.a = activity;
        this.f = aasmVar;
        this.g = ajvbVar;
        this.h = lwkVar;
        this.F = ajoyVar;
        this.I = ajoyVar2;
        this.G = ajoyVar3;
        this.H = ajoyVar4;
        this.C = ajoyVar5;
        this.t = oiyVar;
        this.v = ogxVar;
        this.o = nrpVar;
        this.p = agqoVar;
        this.l = abieVar;
        this.q = nrpVar2;
        this.A = ajywVar2;
        this.B = ajywVar3;
        this.i = jzmVar;
        this.n = nrpVar3;
        this.u = ohgVar;
        this.x = cVar;
        this.z = cVar2;
        this.E = ajoyVar6;
        this.D = ajywVar4;
        this.j = ohxVar;
        this.r = nmcVar;
        this.s = agqoVar2;
        this.m = yaqVar;
        this.k = yapVar;
        this.y = cVar3;
        this.w = amsjVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ajxi, defpackage.ajvd
    public final ajvc a(Object obj, ajxe ajxeVar, ajwx ajwxVar) {
        arcz arczVar;
        ajvj ajvjVar;
        lxq lxqVar;
        ajvj ajvjVar2;
        if (obj instanceof atts) {
            this.g.a(goc.class);
            lwk lwkVar = this.h;
            atts attsVar = (atts) obj;
            Context context = (Context) lwkVar.a.get();
            context.getClass();
            Executor executor = (Executor) lwkVar.b.get();
            executor.getClass();
            ypa ypaVar = (ypa) lwkVar.c.get();
            ypaVar.getClass();
            afsy afsyVar = (afsy) lwkVar.d.get();
            afsyVar.getClass();
            alaj alajVar = (alaj) lwkVar.e.get();
            alajVar.getClass();
            alah alahVar = (alah) lwkVar.f.get();
            alahVar.getClass();
            akxw akxwVar = (akxw) lwkVar.g.get();
            akxwVar.getClass();
            Executor executor2 = (Executor) lwkVar.h.get();
            executor2.getClass();
            aaea aaeaVar = (aaea) lwkVar.i.get();
            aaeaVar.getClass();
            akvq akvqVar = (akvq) lwkVar.j.get();
            akvqVar.getClass();
            axze axzeVar = (axze) lwkVar.k.get();
            axzeVar.getClass();
            ((akwg) lwkVar.l.get()).getClass();
            attsVar.getClass();
            return new lwj(context, executor, ypaVar, afsyVar, alajVar, alahVar, akxwVar, executor2, aaeaVar, akvqVar, axzeVar, attsVar, null, null, null);
        }
        if (obj instanceof asnr) {
            asnr asnrVar = (asnr) obj;
            ajvb ajvbVar = (ajvb) this.F.a.get();
            ajvbVar.getClass();
            asnrVar.getClass();
            return new lud(ajvbVar, asnrVar);
        }
        if (obj instanceof apqv) {
            apqv apqvVar = (apqv) obj;
            ajvb ajvbVar2 = (ajvb) this.I.a.get();
            ajvbVar2.getClass();
            apqvVar.getClass();
            return new eqc(ajvbVar2, apqvVar);
        }
        if (obj instanceof aptj) {
            aptj aptjVar = (aptj) obj;
            ajvb ajvbVar3 = (ajvb) this.G.a.get();
            ajvbVar3.getClass();
            aptjVar.getClass();
            return new gdr(ajvbVar3, aptjVar);
        }
        if (obj instanceof apsj) {
            apsj apsjVar = (apsj) obj;
            ajvb ajvbVar4 = (ajvb) this.H.a.get();
            ajvbVar4.getClass();
            apsjVar.getClass();
            return new equ(ajvbVar4, apsjVar);
        }
        if ((obj instanceof aqvz) || (obj instanceof aqul) || (obj instanceof auwf) || (obj instanceof atem)) {
            ajvb ajvbVar5 = (ajvb) this.C.a.get();
            ajvbVar5.getClass();
            obj.getClass();
            return new lxz(ajvbVar5, obj);
        }
        if (obj instanceof aaly) {
            ausu ausuVar = ((aaly) obj).a;
            oiy oiyVar = this.t;
            arfa h = akbc.h(ausuVar);
            ajuo b = b(ausuVar);
            Context context2 = (Context) oiyVar.c.get();
            context2.getClass();
            ajvb ajvbVar6 = (ajvb) oiyVar.f.get();
            ajvbVar6.getClass();
            ypa ypaVar2 = (ypa) oiyVar.a.get();
            ypaVar2.getClass();
            ajfh ajfhVar = (ajfh) oiyVar.d.get();
            ajfhVar.getClass();
            ammv ammvVar = (ammv) oiyVar.b.get();
            ammvVar.getClass();
            ajfh ajfhVar2 = (ajfh) oiyVar.e.get();
            ajfhVar2.getClass();
            h.getClass();
            b.getClass();
            return new luf(context2, ajvbVar6, ypaVar2, ajfhVar, ammvVar, ajfhVar2, ausuVar, h, b, ajxeVar);
        }
        if (obj instanceof aamj) {
            ausu ausuVar2 = ((aamj) obj).a;
            return this.v.b(ausuVar2, akbc.i(ausuVar2), ajxeVar, ldg.a);
        }
        if (obj instanceof aalz) {
            aalz aalzVar = (aalz) obj;
            if (xph.y(aalzVar)) {
                ajvjVar2 = this.p.a(this.f, this.d, ajxeVar);
                if (ajxeVar == null) {
                    ajvjVar2.i(aalzVar);
                }
                lxqVar = this;
            } else {
                askd askdVar = aalzVar.a;
                if ((!TextUtils.equals("downloads_page_downloads_item_section_identifier", askdVar.i) && !TextUtils.equals("downloads_page_recommendations_item_section_identifier", askdVar.i) && !TextUtils.equals("downloads_page_smart_downloads_item_section_identifier", askdVar.i) && !TextUtils.equals("downloads_page_disclaimer_item_section_identifier", askdVar.i)) || !(ajwxVar instanceof jzo)) {
                    if (!TextUtils.equals(aalzVar.a.i, "library-recent")) {
                        lxqVar = this;
                        askd askdVar2 = aalzVar.a;
                        if (askdVar2.e.size() <= 0 || (((askg) askdVar2.e.get(0)).d & 32) == 0) {
                            askd askdVar3 = aalzVar.a;
                            if ((askdVar3.c & 8) == 0 || !askdVar3.i.equals("clip-create-item-section")) {
                                askd askdVar4 = aalzVar.a;
                                if ((askdVar4.c & 8) == 0 || !askdVar4.i.equals("clip-view-item-section")) {
                                    lxqVar = this;
                                    ajvj c = lxqVar.o.c(lxqVar.f, lxqVar.d, ajxeVar);
                                    askd askdVar5 = aalzVar.a;
                                    if ((askdVar5.c & 2) != 0) {
                                        amsj amsjVar = lxqVar.w;
                                        amsjVar.a.put(askdVar5.g, new WeakReference(c));
                                    }
                                    if (ajxeVar == null) {
                                        c.i(aalzVar);
                                    }
                                    ajvjVar2 = c;
                                } else {
                                    agqo agqoVar = this.s;
                                    aasm aasmVar = this.f;
                                    acra acraVar = this.d;
                                    ajvb ajvbVar7 = (ajvb) agqoVar.d.get();
                                    ajvbVar7.getClass();
                                    ypa ypaVar3 = (ypa) agqoVar.g.get();
                                    ypaVar3.getClass();
                                    zaw zawVar = (zaw) agqoVar.i.get();
                                    zawVar.getClass();
                                    ajfh ajfhVar3 = (ajfh) agqoVar.j.get();
                                    ajfhVar3.getClass();
                                    shf shfVar = (shf) agqoVar.f.get();
                                    shfVar.getClass();
                                    jap japVar = (jap) agqoVar.b.get();
                                    japVar.getClass();
                                    ammv ammvVar2 = (ammv) agqoVar.a.get();
                                    ammvVar2.getClass();
                                    ajun ajunVar = (ajun) agqoVar.m.get();
                                    ajunVar.getClass();
                                    ammv ammvVar3 = (ammv) agqoVar.c.get();
                                    aahd aahdVar = (aahd) agqoVar.h.get();
                                    aahdVar.getClass();
                                    fgq fgqVar = (fgq) agqoVar.e.get();
                                    fgqVar.getClass();
                                    acpl acplVar = (acpl) agqoVar.l.get();
                                    acplVar.getClass();
                                    axze axzeVar2 = (axze) agqoVar.k.get();
                                    axzeVar2.getClass();
                                    ajvj gxsVar = new gxs(ajvbVar7, ypaVar3, zawVar, ajfhVar3, shfVar, japVar, ammvVar2, ajunVar, aasmVar, acraVar, ajxeVar, ammvVar3, aahdVar, fgqVar, acplVar, axzeVar2, null, null);
                                    if (ajxeVar == null) {
                                        ajvjVar = gxsVar;
                                        ajvjVar.i(aalzVar);
                                    } else {
                                        ajvjVar = gxsVar;
                                    }
                                }
                            } else {
                                nmc nmcVar = lxqVar.r;
                                aasm aasmVar2 = lxqVar.f;
                                acra acraVar2 = lxqVar.d;
                                ajvb ajvbVar8 = (ajvb) nmcVar.g.get();
                                ajvbVar8.getClass();
                                ypa ypaVar4 = (ypa) nmcVar.h.get();
                                ypaVar4.getClass();
                                zaw zawVar2 = (zaw) nmcVar.a.get();
                                zawVar2.getClass();
                                ajfh ajfhVar4 = (ajfh) nmcVar.f.get();
                                ajfhVar4.getClass();
                                shf shfVar2 = (shf) nmcVar.i.get();
                                shfVar2.getClass();
                                jap japVar2 = (jap) nmcVar.d.get();
                                japVar2.getClass();
                                ammv ammvVar4 = (ammv) nmcVar.e.get();
                                ammvVar4.getClass();
                                ajun ajunVar2 = (ajun) nmcVar.b.get();
                                ajunVar2.getClass();
                                ajvj gxpVar = new gxp(ajvbVar8, ypaVar4, zawVar2, ajfhVar4, shfVar2, japVar2, ammvVar4, ajunVar2, aasmVar2, acraVar2, ajxeVar, (ammv) nmcVar.c.get());
                                if (ajxeVar == null) {
                                    gxpVar.i(aalzVar);
                                }
                                ajvjVar2 = gxpVar;
                                lxqVar = this;
                            }
                        } else {
                            ajyw ajywVar = lxqVar.D;
                            aasm aasmVar3 = lxqVar.f;
                            acra acraVar3 = lxqVar.d;
                            ajvb ajvbVar9 = (ajvb) ajywVar.b.get();
                            ajvbVar9.getClass();
                            ypa ypaVar5 = (ypa) ajywVar.c.get();
                            ypaVar5.getClass();
                            zaw zawVar3 = (zaw) ajywVar.a.get();
                            zawVar3.getClass();
                            ajvj kwaVar = new kwa(ajvbVar9, ypaVar5, zawVar3, aasmVar3, acraVar3, ajxeVar);
                            if (ajxeVar == null) {
                                kwaVar.i(aalzVar);
                            }
                            ajvjVar2 = kwaVar;
                        }
                    } else {
                        lxqVar = this;
                        nrp nrpVar = lxqVar.n;
                        aasm aasmVar4 = lxqVar.f;
                        acra acraVar4 = lxqVar.d;
                        ajvb ajvbVar10 = (ajvb) nrpVar.c.get();
                        ajvbVar10.getClass();
                        ypa ypaVar6 = (ypa) nrpVar.a.get();
                        ypaVar6.getClass();
                        zaw zawVar4 = (zaw) nrpVar.e.get();
                        zawVar4.getClass();
                        ajfh ajfhVar5 = (ajfh) nrpVar.f.get();
                        ajfhVar5.getClass();
                        shf shfVar3 = (shf) nrpVar.h.get();
                        shfVar3.getClass();
                        jap japVar3 = (jap) nrpVar.g.get();
                        japVar3.getClass();
                        ajun ajunVar3 = (ajun) nrpVar.d.get();
                        ajunVar3.getClass();
                        ammv ammvVar5 = (ammv) nrpVar.b.get();
                        ammvVar5.getClass();
                        ajvj lxaVar = new lxa(ajvbVar10, ypaVar6, zawVar4, ajfhVar5, shfVar3, japVar3, ajunVar3, ammvVar5, aasmVar4, acraVar4, ajxeVar);
                        if (ajxeVar == null) {
                            lxaVar.i(aalzVar);
                        }
                        ajvjVar2 = lxaVar;
                    }
                } else {
                    final jzo jzoVar = (jzo) ajwxVar;
                    jzm jzmVar = this.i;
                    Activity activity = this.a;
                    aasm aasmVar5 = this.f;
                    acra acraVar5 = this.d;
                    amnv amnvVar = new amnv() { // from class: lxp
                        @Override // defpackage.amnv
                        public final Object get() {
                            return ((ajwi) jzo.this).K;
                        }
                    };
                    ajvb ajvbVar11 = (ajvb) jzmVar.a.get();
                    ajvbVar11.getClass();
                    ypa ypaVar7 = (ypa) jzmVar.b.get();
                    ypaVar7.getClass();
                    zaw zawVar5 = (zaw) jzmVar.c.get();
                    zawVar5.getClass();
                    fjs fjsVar = (fjs) jzmVar.d.get();
                    fjsVar.getClass();
                    jti jtiVar = (jti) jzmVar.e.get();
                    jtiVar.getClass();
                    Executor executor3 = (Executor) jzmVar.f.get();
                    executor3.getClass();
                    azrw azrwVar = jzmVar.g;
                    ajfh ajfhVar6 = (ajfh) jzmVar.h.get();
                    ajfh ajfhVar7 = (ajfh) jzmVar.i.get();
                    axzf axzfVar = (axzf) jzmVar.j.get();
                    axzfVar.getClass();
                    eys eysVar = (eys) jzmVar.k.get();
                    eysVar.getClass();
                    acqy acqyVar = (acqy) jzmVar.l.get();
                    acqyVar.getClass();
                    fiu fiuVar = (fiu) jzmVar.n.get();
                    fiuVar.getClass();
                    jyy jyyVar = (jyy) jzmVar.o.get();
                    jyyVar.getClass();
                    ayqi ayqiVar = (ayqi) jzmVar.p.get();
                    ayqiVar.getClass();
                    ayqi ayqiVar2 = (ayqi) jzmVar.q.get();
                    ayqiVar2.getClass();
                    jyu jyuVar = (jyu) jzmVar.r.get();
                    jyuVar.getClass();
                    jok jokVar = (jok) jzmVar.s.get();
                    jokVar.getClass();
                    axzg axzgVar = (axzg) jzmVar.t.get();
                    axzgVar.getClass();
                    axzf axzfVar2 = (axzf) jzmVar.u.get();
                    axzfVar2.getClass();
                    ajvj jzlVar = new jzl(ajvbVar11, ypaVar7, zawVar5, fjsVar, jtiVar, executor3, azrwVar, ajfhVar6, ajfhVar7, axzfVar, eysVar, acqyVar, fiuVar, jyyVar, ayqiVar, ayqiVar2, jyuVar, jokVar, axzgVar, axzfVar2, activity, aasmVar5, acraVar5, ajxeVar, jzoVar, amnvVar, null, null, null, null, null);
                    if (ajxeVar == null) {
                        ajvjVar = jzlVar;
                        ajvjVar.i(aalzVar);
                    } else {
                        ajvjVar = jzlVar;
                    }
                }
                lxqVar = this;
                ajvjVar2 = ajvjVar;
            }
            ajvjVar2.lC().mK(new ajup(lxqVar.b));
            return ajvjVar2;
        }
        if (obj instanceof apzx) {
            return this.l.b((apzx) obj, this.f, this.d, this.m, this.k);
        }
        if (obj instanceof apqm) {
            eqb eqbVar = new eqb(this.g);
            apqm apqmVar = (apqm) obj;
            eqbVar.a.clear();
            if (apqmVar != null) {
                for (apqn apqnVar : apqmVar.c) {
                    if ((apqnVar.b & 1) != 0) {
                        ajpd ajpdVar = eqbVar.a;
                        apql apqlVar = apqnVar.c;
                        if (apqlVar == null) {
                            apqlVar = apql.a;
                        }
                        ajpdVar.add(apqlVar);
                    }
                }
                eqbVar.a.add(apqmVar);
            }
            return eqbVar;
        }
        if (obj instanceof atlv) {
            return new lvj(this.g, (atlv) obj);
        }
        if (obj instanceof audc) {
            ohg ohgVar = this.u;
            aasm aasmVar6 = this.f;
            acra acraVar6 = this.d;
            ajvb ajvbVar12 = (ajvb) ohgVar.b.get();
            ajvbVar12.getClass();
            ypa ypaVar8 = (ypa) ohgVar.f.get();
            ypaVar8.getClass();
            zaw zawVar6 = (zaw) ohgVar.g.get();
            zawVar6.getClass();
            aahd aahdVar2 = (aahd) ohgVar.a.get();
            aahdVar2.getClass();
            kyj kyjVar = (kyj) ohgVar.d.get();
            kyjVar.getClass();
            fjs fjsVar2 = (fjs) ohgVar.c.get();
            fjsVar2.getClass();
            jti jtiVar2 = (jti) ohgVar.e.get();
            jtiVar2.getClass();
            luo luoVar = new luo(ajvbVar12, ypaVar8, zawVar6, aahdVar2, kyjVar, fjsVar2, jtiVar2, aasmVar6, (ajtz) ajwxVar, acraVar6);
            luoVar.l((audc) obj);
            return luoVar;
        }
        if (obj instanceof apux) {
            nrp nrpVar2 = this.q;
            aasm aasmVar7 = this.f;
            acra acraVar7 = this.d;
            Context context3 = (Context) nrpVar2.h.get();
            context3.getClass();
            ajvb ajvbVar13 = (ajvb) nrpVar2.e.get();
            ajvbVar13.getClass();
            azrw azrwVar2 = nrpVar2.d;
            ypa ypaVar9 = (ypa) nrpVar2.f.get();
            ypaVar9.getClass();
            zaw zawVar7 = (zaw) nrpVar2.b.get();
            zawVar7.getClass();
            lse lseVar = new lse(context3, ajvbVar13, azrwVar2, ypaVar9, zawVar7, nrpVar2.g, nrpVar2.a, aasmVar7, acraVar7, ajxeVar, ajwxVar);
            if (ajxeVar == null) {
                lseVar.k((apux) obj);
            }
            return lseVar;
        }
        if (obj instanceof ausu) {
            ausu ausuVar3 = (ausu) obj;
            if ((ausuVar3.b & 4194304) != 0) {
                ausw auswVar = ausuVar3.r;
                if (auswVar == null) {
                    auswVar = ausw.a;
                }
                if ((auswVar.b & 2) != 0) {
                    ausw auswVar2 = ausuVar3.r;
                    if (auswVar2 == null) {
                        auswVar2 = ausw.a;
                    }
                    arczVar = auswVar2.d;
                    if (arczVar == null) {
                        arczVar = arcz.a;
                    }
                } else {
                    arczVar = null;
                }
                lto f = this.y.f(arczVar, this.c);
                if ((arczVar.b & 128) != 0) {
                    arda ardaVar = arczVar.f;
                    if (ardaVar == null) {
                        ardaVar = arda.a;
                    }
                    int dX = amkq.dX(ardaVar.b);
                    if (dX != 0 && dX == 4) {
                        return this.B.m(ausuVar3, arczVar, f, ajxeVar);
                    }
                }
                return this.A.l(ausuVar3, arczVar, f, ajxeVar);
            }
        }
        if (obj instanceof aqrf) {
            c cVar = this.x;
            aqrf aqrfVar = (aqrf) obj;
            ajvb ajvbVar14 = (ajvb) cVar.b.get();
            ajvbVar14.getClass();
            ajfh ajfhVar8 = (ajfh) cVar.a.get();
            ajfhVar8.getClass();
            aqrfVar.getClass();
            return new lxy(ajvbVar14, ajfhVar8, aqrfVar);
        }
        if (obj instanceof arbt) {
            c cVar2 = this.z;
            arbt arbtVar = (arbt) obj;
            ajvb ajvbVar15 = (ajvb) cVar2.b.get();
            ajvbVar15.getClass();
            aahv aahvVar = (aahv) cVar2.a.get();
            aahvVar.getClass();
            arbtVar.getClass();
            return new kwi(ajvbVar15, aahvVar, arbtVar);
        }
        if (obj instanceof aunk) {
            aunk aunkVar = (aunk) obj;
            ajvb ajvbVar16 = (ajvb) this.E.a.get();
            ajvbVar16.getClass();
            aunkVar.getClass();
            return new lxn(ajvbVar16, aunkVar);
        }
        if (obj instanceof auwd) {
            ohw a = this.j.a((auwd) obj);
            a.f();
            return a;
        }
        return super.a(obj, ajxeVar, ajwxVar);
    }
}
