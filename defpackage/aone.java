package defpackage;

import com.google.protos.youtube.api.innertube.ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint;
import com.google.protos.youtube.api.innertube.PlaylistEditEndpointOuterClass$PlaylistEditEndpoint;
import com.google.protos.youtube.api.innertube.ShortsCreationEndpointOuterClass$ShortsCreationEndpoint;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class aone extends aoln implements aooz {
    private final aonm defaultInstance;
    public aonm instance;
    protected boolean isBuilt;

    public aone() {
        dve dveVar = dve.a;
        throw null;
    }

    private void mergeFromInstance(aonm aonmVar, aonm aonmVar2) {
        aopi.a.b(aonmVar).g(aonmVar, aonmVar2);
    }

    public final void A(String str) {
        str.getClass();
        copyOnWrite();
        tlj tljVar = (tlj) this.instance;
        tlj tljVar2 = tlj.a;
        tljVar.a().remove(str);
    }

    public final void B(aols aolsVar) {
        copyOnWrite();
        ucw ucwVar = (ucw) this.instance;
        ucw ucwVar2 = ucw.a;
        aolsVar.getClass();
        aony aonyVar = ucwVar.b;
        if (!aonyVar.c()) {
            ucwVar.b = aonm.mutableCopy(aonyVar);
        }
        ucwVar.b.add(aolsVar);
    }

    public final void C(String str) {
        copyOnWrite();
        ucx ucxVar = (ucx) this.instance;
        ucx ucxVar2 = ucx.a;
        str.getClass();
        ucxVar.a();
        ucxVar.b.add(str);
    }

    public final void D(String str) {
        copyOnWrite();
        uwa uwaVar = (uwa) this.instance;
        uwa uwaVar2 = uwa.a;
        str.getClass();
        aony aonyVar = uwaVar.c;
        if (!aonyVar.c()) {
            uwaVar.c = aonm.mutableCopy(aonyVar);
        }
        uwaVar.c.add(str);
    }

    public final void E(String str, uwa uwaVar) {
        str.getClass();
        uwaVar.getClass();
        copyOnWrite();
        uwe uweVar = (uwe) this.instance;
        uwe uweVar2 = uwe.a;
        uweVar.a().put(str, uwaVar);
    }

    public final void F(Iterable iterable) {
        copyOnWrite();
        akzs akzsVar = (akzs) this.instance;
        akzs akzsVar2 = akzs.a;
        aony aonyVar = akzsVar.T;
        if (!aonyVar.c()) {
            akzsVar.T = aonm.mutableCopy(aonyVar);
        }
        aolo.addAll(iterable, (List) akzsVar.T);
    }

    public final void G(int i, amao amaoVar) {
        amaoVar.getClass();
        copyOnWrite();
        amal amalVar = (amal) this.instance;
        amal amalVar2 = amal.a;
        amalVar.a().put(Integer.valueOf(i), amaoVar);
    }

    public final void H(amhc amhcVar) {
        copyOnWrite();
        amhd amhdVar = (amhd) this.instance;
        amhd amhdVar2 = amhd.a;
        amhcVar.getClass();
        aony aonyVar = amhdVar.d;
        if (!aonyVar.c()) {
            amhdVar.d = aonm.mutableCopy(aonyVar);
        }
        amhdVar.d.add(amhcVar);
    }

    public final void I(ancl anclVar) {
        copyOnWrite();
        ancm ancmVar = (ancm) this.instance;
        ancm ancmVar2 = ancm.a;
        anclVar.getClass();
        aony aonyVar = ancmVar.b;
        if (!aonyVar.c()) {
            ancmVar.b = aonm.mutableCopy(aonyVar);
        }
        ancmVar.b.add(anclVar);
    }

    public final void J(aomf aomfVar) {
        copyOnWrite();
        anrw anrwVar = (anrw) this.instance;
        anrw anrwVar2 = anrw.a;
        anrwVar.a();
        anrwVar.d.add(aomfVar);
    }

    public final void K(Iterable iterable) {
        copyOnWrite();
        aocr aocrVar = (aocr) this.instance;
        aocr aocrVar2 = aocr.a;
        aonu aonuVar = aocrVar.f;
        if (!aonuVar.c()) {
            aocrVar.f = aonm.mutableCopy(aonuVar);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            aocrVar.f.g(((aobl) it.next()).getNumber());
        }
    }

    public final void L(Iterable iterable) {
        copyOnWrite();
        aofh aofhVar = (aofh) this.instance;
        aofh aofhVar2 = aofh.a;
        aofhVar.a();
        aolo.addAll(iterable, (List) aofhVar.c);
    }

    public final void M(aofe aofeVar) {
        copyOnWrite();
        aofh aofhVar = (aofh) this.instance;
        aoff aoffVar = (aoff) aofeVar.build();
        aofh aofhVar2 = aofh.a;
        aoffVar.getClass();
        aofhVar.a();
        aofhVar.c.add(aoffVar);
    }

    public final void N(aoff aoffVar) {
        copyOnWrite();
        aofh aofhVar = (aofh) this.instance;
        aofh aofhVar2 = aofh.a;
        aoffVar.getClass();
        aofhVar.a();
        aofhVar.c.add(aoffVar);
    }

    public final void O(aorf aorfVar) {
        copyOnWrite();
        aore aoreVar = (aore) this.instance;
        aore aoreVar2 = aore.a;
        aorfVar.getClass();
        aony aonyVar = aoreVar.c;
        if (!aonyVar.c()) {
            aoreVar.c = aonm.mutableCopy(aonyVar);
        }
        aoreVar.c.add(aorfVar);
    }

    public final void P(int i) {
        copyOnWrite();
        aore aoreVar = (aore) this.instance;
        aore aoreVar2 = aore.a;
        aonu aonuVar = aoreVar.b;
        if (!aonuVar.c()) {
            aoreVar.b = aonm.mutableCopy(aonuVar);
        }
        aoreVar.b.g(i - 1);
    }

    public final void Q(aore aoreVar) {
        copyOnWrite();
        aorf aorfVar = (aorf) this.instance;
        aorf aorfVar2 = aorf.a;
        aoreVar.getClass();
        aony aonyVar = aorfVar.c;
        if (!aonyVar.c()) {
            aorfVar.c = aonm.mutableCopy(aonyVar);
        }
        aorfVar.c.add(aoreVar);
    }

    public final void R(int i) {
        copyOnWrite();
        aorf aorfVar = (aorf) this.instance;
        aorf aorfVar2 = aorf.a;
        aonu aonuVar = aorfVar.b;
        if (!aonuVar.c()) {
            aorfVar.b = aonm.mutableCopy(aonuVar);
        }
        aorfVar.b.g(i - 1);
    }

    public final void S(aore aoreVar) {
        copyOnWrite();
        aorg aorgVar = (aorg) this.instance;
        aorg aorgVar2 = aorg.a;
        aoreVar.getClass();
        aorgVar.c = aoreVar;
        aorgVar.b = 2;
    }

    public final void T(aorf aorfVar) {
        copyOnWrite();
        aorg aorgVar = (aorg) this.instance;
        aorg aorgVar2 = aorg.a;
        aorfVar.getClass();
        aorgVar.c = aorfVar;
        aorgVar.b = 3;
    }

    public final void U(int i) {
        copyOnWrite();
        aorg aorgVar = (aorg) this.instance;
        aorg aorgVar2 = aorg.a;
        aorgVar.c = Integer.valueOf(i - 1);
        aorgVar.b = 1;
    }

    public final void V(long j) {
        copyOnWrite();
        aorj aorjVar = (aorj) this.instance;
        aorj aorjVar2 = aorj.a;
        aorjVar.a();
        aorjVar.l.f(j);
    }

    public final void W(float f) {
        copyOnWrite();
        aorq aorqVar = (aorq) this.instance;
        aorq aorqVar2 = aorq.a;
        aont aontVar = aorqVar.e;
        if (!aontVar.c()) {
            aorqVar.e = aonm.mutableCopy(aontVar);
        }
        aorqVar.e.h(f);
    }

    public final void X(int i) {
        copyOnWrite();
        aose aoseVar = (aose) this.instance;
        aose aoseVar2 = aose.a;
        aoseVar.a();
        aoseVar.b.remove(i);
    }

    public final void Y(Iterable iterable) {
        copyOnWrite();
        aosh aoshVar = (aosh) this.instance;
        aosh aoshVar2 = aosh.a;
        aony aonyVar = aoshVar.b;
        if (!aonyVar.c()) {
            aoshVar.b = aonm.mutableCopy(aonyVar);
        }
        aolo.addAll(iterable, (List) aoshVar.b);
    }

    public final void Z(aone aoneVar) {
        copyOnWrite();
        rlc rlcVar = (rlc) this.instance;
        rld rldVar = (rld) aoneVar.build();
        rlc rlcVar2 = rlc.a;
        rldVar.getClass();
        aony aonyVar = rlcVar.b;
        if (!aonyVar.c()) {
            rlcVar.b = aonm.mutableCopy(aonyVar);
        }
        rlcVar.b.add(rldVar);
    }

    public final void aA(atbt atbtVar) {
        copyOnWrite();
        atby atbyVar = (atby) this.instance;
        atby atbyVar2 = atby.a;
        atbtVar.getClass();
        aony aonyVar = atbyVar.l;
        if (!aonyVar.c()) {
            atbyVar.l = aonm.mutableCopy(aonyVar);
        }
        atbyVar.l.add(atbtVar);
    }

    public final void aB(atbw atbwVar) {
        copyOnWrite();
        atby atbyVar = (atby) this.instance;
        atby atbyVar2 = atby.a;
        atbwVar.getClass();
        aony aonyVar = atbyVar.i;
        if (!aonyVar.c()) {
            atbyVar.i = aonm.mutableCopy(aonyVar);
        }
        atbyVar.i.add(atbwVar);
    }

    public final void aC(atay atayVar) {
        copyOnWrite();
        atbw atbwVar = (atbw) this.instance;
        aonv aonvVar = atbw.a;
        atayVar.getClass();
        aonu aonuVar = atbwVar.c;
        if (!aonuVar.c()) {
            atbwVar.c = aonm.mutableCopy(aonuVar);
        }
        atbwVar.c.g(atayVar.i);
    }

    public final void aD(Iterable iterable) {
        copyOnWrite();
        atdc atdcVar = (atdc) this.instance;
        atdc atdcVar2 = atdc.a;
        atdcVar.a();
        aolo.addAll(iterable, (List) atdcVar.c);
    }

    public final void aE(aone aoneVar) {
        copyOnWrite();
        atdc atdcVar = (atdc) this.instance;
        atda atdaVar = (atda) aoneVar.build();
        atdc atdcVar2 = atdc.a;
        atdaVar.getClass();
        atdcVar.a();
        atdcVar.c.add(atdaVar);
    }

    public final void aF(int i, aone aoneVar) {
        copyOnWrite();
        atdc atdcVar = (atdc) this.instance;
        atda atdaVar = (atda) aoneVar.build();
        atdc atdcVar2 = atdc.a;
        atdaVar.getClass();
        atdcVar.a();
        atdcVar.c.set(i, atdaVar);
    }

    public final void aG(atpq atpqVar) {
        copyOnWrite();
        atpq atpqVar2 = (atpq) this.instance;
        atpq atpqVar3 = atpq.a;
        atpqVar.getClass();
        aony aonyVar = atpqVar2.f;
        if (!aonyVar.c()) {
            atpqVar2.f = aonm.mutableCopy(aonyVar);
        }
        atpqVar2.f.add(atpqVar);
    }

    public final void aH(Iterable iterable) {
        copyOnWrite();
        atrt atrtVar = (atrt) this.instance;
        atrt atrtVar2 = atrt.a;
        aonu aonuVar = atrtVar.f;
        if (!aonuVar.c()) {
            atrtVar.f = aonm.mutableCopy(aonuVar);
        }
        aolo.addAll(iterable, (List) atrtVar.f);
    }

    public final void aI(atvz atvzVar) {
        copyOnWrite();
        atvy atvyVar = (atvy) this.instance;
        atvy atvyVar2 = atvy.a;
        atvzVar.getClass();
        aony aonyVar = atvyVar.b;
        if (!aonyVar.c()) {
            atvyVar.b = aonm.mutableCopy(aonyVar);
        }
        atvyVar.b.add(atvzVar);
    }

    public final void aJ(aude audeVar) {
        copyOnWrite();
        audc audcVar = (audc) this.instance;
        audc audcVar2 = audc.a;
        audeVar.getClass();
        aony aonyVar = audcVar.d;
        if (!aonyVar.c()) {
            audcVar.d = aonm.mutableCopy(aonyVar);
        }
        audcVar.d.add(audeVar);
    }

    public final void aK(String str) {
        copyOnWrite();
        aumw aumwVar = (aumw) this.instance;
        aumw aumwVar2 = aumw.a;
        str.getClass();
        aony aonyVar = aumwVar.d;
        if (!aonyVar.c()) {
            aumwVar.d = aonm.mutableCopy(aonyVar);
        }
        aumwVar.d.add(str);
    }

    public final void aL(Iterable iterable) {
        copyOnWrite();
        auov auovVar = (auov) this.instance;
        auov auovVar2 = auov.a;
        auovVar.a();
        aolo.addAll(iterable, (List) auovVar.d);
    }

    public final void aM(auoy auoyVar) {
        copyOnWrite();
        auov auovVar = (auov) this.instance;
        auov auovVar2 = auov.a;
        auoyVar.getClass();
        auovVar.a();
        auovVar.d.add(auoyVar);
    }

    public final void aN(aone aoneVar) {
        copyOnWrite();
        auov auovVar = (auov) this.instance;
        auoy auoyVar = (auoy) aoneVar.build();
        auov auovVar2 = auov.a;
        auoyVar.getClass();
        auovVar.a();
        auovVar.d.add(auoyVar);
    }

    public final void aO(aong aongVar) {
        copyOnWrite();
        auqa auqaVar = (auqa) this.instance;
        aulq aulqVar = (aulq) aongVar.build();
        auqa auqaVar2 = auqa.a;
        aulqVar.getClass();
        auqaVar.a();
        auqaVar.d.add(aulqVar);
    }

    public final auqd aP(int i) {
        return (auqd) ((auqh) this.instance).f.get(i);
    }

    public final auuw aQ(int i) {
        return (auuw) ((auuv) this.instance).c.get(i);
    }

    public final void aR(int i, aone aoneVar) {
        copyOnWrite();
        auuv auuvVar = (auuv) this.instance;
        auuw auuwVar = (auuw) aoneVar.build();
        auuv auuvVar2 = auuv.a;
        auuwVar.getClass();
        auuvVar.a();
        auuvVar.c.set(i, auuwVar);
    }

    public final void aS(auvp auvpVar) {
        copyOnWrite();
        auvz auvzVar = (auvz) this.instance;
        auvz auvzVar2 = auvz.a;
        auvpVar.getClass();
        aony aonyVar = auvzVar.c;
        if (!aonyVar.c()) {
            auvzVar.c = aonm.mutableCopy(aonyVar);
        }
        auvzVar.c.add(auvpVar);
    }

    public final void aT(auwg auwgVar) {
        copyOnWrite();
        auwh auwhVar = (auwh) this.instance;
        auwh auwhVar2 = auwh.a;
        auwgVar.getClass();
        auwhVar.a();
        auwhVar.c.add(auwgVar);
    }

    public final void aU(Iterable iterable) {
        copyOnWrite();
        avdg avdgVar = (avdg) this.instance;
        avdg avdgVar2 = avdg.a;
        aony aonyVar = avdgVar.h;
        if (!aonyVar.c()) {
            avdgVar.h = aonm.mutableCopy(aonyVar);
        }
        aolo.addAll(iterable, (List) avdgVar.h);
    }

    public final void aV(int i) {
        copyOnWrite();
        avfj avfjVar = (avfj) this.instance;
        avfj avfjVar2 = avfj.a;
        aonu aonuVar = avfjVar.p;
        if (!aonuVar.c()) {
            avfjVar.p = aonm.mutableCopy(aonuVar);
        }
        avfjVar.p.g(i - 2);
    }

    public final void aW(aqyg aqygVar) {
        copyOnWrite();
        avnb avnbVar = (avnb) this.instance;
        avnb avnbVar2 = avnb.a;
        aqygVar.getClass();
        aony aonyVar = avnbVar.f;
        if (!aonyVar.c()) {
            avnbVar.f = aonm.mutableCopy(aonyVar);
        }
        avnbVar.f.add(aqygVar);
    }

    public final void aX(aone aoneVar) {
        copyOnWrite();
        avwp avwpVar = (avwp) this.instance;
        avwo avwoVar = (avwo) aoneVar.build();
        avwp avwpVar2 = avwp.a;
        avwoVar.getClass();
        aony aonyVar = avwpVar.c;
        if (!aonyVar.c()) {
            avwpVar.c = aonm.mutableCopy(aonyVar);
        }
        avwpVar.c.add(avwoVar);
    }

    public final void aY(avxc avxcVar) {
        copyOnWrite();
        avxj avxjVar = (avxj) this.instance;
        avxj avxjVar2 = avxj.a;
        avxcVar.getClass();
        aony aonyVar = avxjVar.c;
        if (!aonyVar.c()) {
            avxjVar.c = aonm.mutableCopy(aonyVar);
        }
        avxjVar.c.add(avxcVar);
    }

    public final void aZ(avxg avxgVar) {
        copyOnWrite();
        avxj avxjVar = (avxj) this.instance;
        avxj avxjVar2 = avxj.a;
        avxgVar.getClass();
        aony aonyVar = avxjVar.d;
        if (!aonyVar.c()) {
            avxjVar.d = aonm.mutableCopy(aonyVar);
        }
        avxjVar.d.add(avxgVar);
    }

    public final apqi aa(int i) {
        return (apqi) ((apql) this.instance).m.get(i);
    }

    public final void ab(int i, aone aoneVar) {
        copyOnWrite();
        apql apqlVar = (apql) this.instance;
        apqi apqiVar = (apqi) aoneVar.build();
        apql apqlVar2 = apql.a;
        apqiVar.getClass();
        aony aonyVar = apqlVar.m;
        if (!aonyVar.c()) {
            apqlVar.m = aonm.mutableCopy(aonyVar);
        }
        apqlVar.m.set(i, apqiVar);
    }

    public final void ac(Iterable iterable) {
        copyOnWrite();
        aqcr aqcrVar = (aqcr) this.instance;
        aqcr aqcrVar2 = aqcr.a;
        aony aonyVar = aqcrVar.c;
        if (!aonyVar.c()) {
            aqcrVar.c = aonm.mutableCopy(aonyVar);
        }
        aolo.addAll(iterable, (List) aqcrVar.c);
    }

    public final void ad(aqyg aqygVar) {
        copyOnWrite();
        aqdt aqdtVar = (aqdt) this.instance;
        aqdt aqdtVar2 = aqdt.a;
        aqygVar.getClass();
        aqdtVar.a();
        aqdtVar.g.add(aqygVar);
    }

    public final void ae(String str) {
        copyOnWrite();
        aquz aquzVar = (aquz) this.instance;
        aonv aonvVar = aquz.a;
        str.getClass();
        aony aonyVar = aquzVar.Z;
        if (!aonyVar.c()) {
            aquzVar.Z = aonm.mutableCopy(aonyVar);
        }
        aquzVar.Z.add(str);
    }

    public final void af(aong aongVar) {
        copyOnWrite();
        aqwh aqwhVar = (aqwh) this.instance;
        aulq aulqVar = (aulq) aongVar.build();
        aqwh aqwhVar2 = aqwh.a;
        aulqVar.getClass();
        aqwhVar.a();
        aqwhVar.c.add(aulqVar);
    }

    public final void ag(int i, aong aongVar) {
        copyOnWrite();
        aqwh aqwhVar = (aqwh) this.instance;
        aulq aulqVar = (aulq) aongVar.build();
        aqwh aqwhVar2 = aqwh.a;
        aulqVar.getClass();
        aqwhVar.a();
        aqwhVar.c.set(i, aulqVar);
    }

    public final void ah(Iterable iterable) {
        copyOnWrite();
        arjp arjpVar = (arjp) this.instance;
        arjp arjpVar2 = arjp.a;
        aony aonyVar = arjpVar.d;
        if (!aonyVar.c()) {
            arjpVar.d = aonm.mutableCopy(aonyVar);
        }
        aolo.addAll(iterable, (List) arjpVar.d);
    }

    public final void ai(aone aoneVar) {
        copyOnWrite();
        arke arkeVar = (arke) this.instance;
        arjy arjyVar = (arjy) aoneVar.build();
        arke arkeVar2 = arke.a;
        arjyVar.getClass();
        arkeVar.a();
        arkeVar.c.add(arjyVar);
    }

    public final void aj(Iterable iterable) {
        copyOnWrite();
        arpr arprVar = (arpr) this.instance;
        arpr arprVar2 = arpr.a;
        aony aonyVar = arprVar.f;
        if (!aonyVar.c()) {
            arprVar.f = aonm.mutableCopy(aonyVar);
        }
        aolo.addAll(iterable, (List) arprVar.f);
    }

    public final void ak(int i) {
        copyOnWrite();
        arsj arsjVar = (arsj) this.instance;
        arsj arsjVar2 = arsj.a;
        aonu aonuVar = arsjVar.e;
        if (!aonuVar.c()) {
            arsjVar.e = aonm.mutableCopy(aonuVar);
        }
        arsjVar.e.g(i - 1);
    }

    public final aqxz al(int i) {
        return (aqxz) ((aryv) this.instance).e.get(i);
    }

    public final void am(aqxz aqxzVar) {
        copyOnWrite();
        aryv aryvVar = (aryv) this.instance;
        aryv aryvVar2 = aryv.a;
        aqxzVar.getClass();
        aryvVar.a();
        aryvVar.e.add(aqxzVar);
    }

    public final void an(Iterable iterable) {
        copyOnWrite();
        aryv aryvVar = (aryv) this.instance;
        aryv aryvVar2 = aryv.a;
        aryvVar.a();
        aolo.addAll(iterable, (List) aryvVar.e);
    }

    public final void ao(Iterable iterable) {
        copyOnWrite();
        aryv aryvVar = (aryv) this.instance;
        aryv aryvVar2 = aryv.a;
        aryvVar.b();
        aolo.addAll(iterable, (List) aryvVar.d);
    }

    public final void ap(aqxz aqxzVar) {
        copyOnWrite();
        aryv aryvVar = (aryv) this.instance;
        aryv aryvVar2 = aryv.a;
        aqxzVar.getClass();
        aryvVar.b();
        aryvVar.d.add(aqxzVar);
    }

    public final void aq(Iterable iterable) {
        copyOnWrite();
        ashc ashcVar = (ashc) this.instance;
        ashc ashcVar2 = ashc.a;
        aony aonyVar = ashcVar.b;
        if (!aonyVar.c()) {
            ashcVar.b = aonm.mutableCopy(aonyVar);
        }
        aolo.addAll(iterable, (List) ashcVar.b);
    }

    public final void ar(asiq asiqVar) {
        copyOnWrite();
        asht ashtVar = (asht) this.instance;
        asht ashtVar2 = asht.a;
        asiqVar.getClass();
        ashtVar.a();
        ashtVar.f.add(asiqVar);
    }

    public final void as(aone aoneVar) {
        copyOnWrite();
        asht ashtVar = (asht) this.instance;
        asiq asiqVar = (asiq) aoneVar.build();
        asht ashtVar2 = asht.a;
        asiqVar.getClass();
        ashtVar.a();
        ashtVar.f.add(asiqVar);
    }

    public final void at(aong aongVar) {
        copyOnWrite();
        asjc asjcVar = (asjc) this.instance;
        asjb asjbVar = (asjb) aongVar.build();
        asjc asjcVar2 = asjc.a;
        asjbVar.getClass();
        aony aonyVar = asjcVar.d;
        if (!aonyVar.c()) {
            asjcVar.d = aonm.mutableCopy(aonyVar);
        }
        asjcVar.d.add(asjbVar);
    }

    public final void au(asmc asmcVar) {
        copyOnWrite();
        asmd asmdVar = (asmd) this.instance;
        asmd asmdVar2 = asmd.a;
        asmcVar.getClass();
        aony aonyVar = asmdVar.j;
        if (!aonyVar.c()) {
            asmdVar.j = aonm.mutableCopy(aonyVar);
        }
        asmdVar.j.add(asmcVar);
    }

    public final apmh av() {
        return (apmh) ((astf) this.instance).g.get(0);
    }

    public final void aw(String str, boolean z) {
        copyOnWrite();
        asvz asvzVar = (asvz) this.instance;
        asvz asvzVar2 = asvz.a;
        aoot aootVar = asvzVar.d;
        if (!aootVar.b) {
            asvzVar.d = aootVar.a();
        }
        asvzVar.d.put(str, Boolean.valueOf(z));
    }

    public final void ax(aszz aszzVar) {
        copyOnWrite();
        aszw aszwVar = (aszw) this.instance;
        aszw aszwVar2 = aszw.a;
        aszzVar.getClass();
        aony aonyVar = aszwVar.b;
        if (!aonyVar.c()) {
            aszwVar.b = aonm.mutableCopy(aonyVar);
        }
        aszwVar.b.add(aszzVar);
    }

    public final void ay(atbn atbnVar) {
        copyOnWrite();
        atbo atboVar = (atbo) this.instance;
        atbo atboVar2 = atbo.a;
        atbnVar.getClass();
        aony aonyVar = atboVar.e;
        if (!aonyVar.c()) {
            atboVar.e = aonm.mutableCopy(aonyVar);
        }
        atboVar.e.add(atbnVar);
    }

    @Deprecated
    public final void az(atbn atbnVar) {
        copyOnWrite();
        atbo atboVar = (atbo) this.instance;
        atbo atboVar2 = atbo.a;
        atbnVar.getClass();
        aony aonyVar = atboVar.d;
        if (!aonyVar.c()) {
            atboVar.d = aonm.mutableCopy(aonyVar);
        }
        atboVar.d.add(atbnVar);
    }

    public final void bA(String str, long j) {
        str.getClass();
        copyOnWrite();
        awwp awwpVar = (awwp) this.instance;
        awwp awwpVar2 = awwp.a;
        aoot aootVar = awwpVar.e;
        if (!aootVar.b) {
            awwpVar.e = aootVar.a();
        }
        awwpVar.e.put(str, Long.valueOf(j));
    }

    public final void bB(String str, awws awwsVar) {
        str.getClass();
        awwsVar.getClass();
        copyOnWrite();
        awwr awwrVar = (awwr) this.instance;
        awwr awwrVar2 = awwr.a;
        aoot aootVar = awwrVar.c;
        if (!aootVar.b) {
            awwrVar.c = aootVar.a();
        }
        awwrVar.c.put(str, awwsVar);
    }

    public final void bC(long j) {
        copyOnWrite();
        awws awwsVar = (awws) this.instance;
        awws awwsVar2 = awws.a;
        aonx aonxVar = awwsVar.b;
        if (!aonxVar.c()) {
            awwsVar.b = aonm.mutableCopy(aonxVar);
        }
        awwsVar.b.f(j);
    }

    public final void bD(aone aoneVar) {
        copyOnWrite();
        axcv axcvVar = (axcv) this.instance;
        axct axctVar = (axct) aoneVar.build();
        axcv axcvVar2 = axcv.a;
        axctVar.getClass();
        axcvVar.a();
        axcvVar.f.add(axctVar);
    }

    public final void bE(Iterable iterable) {
        copyOnWrite();
        axej axejVar = (axej) this.instance;
        axej axejVar2 = axej.a;
        aony aonyVar = axejVar.c;
        if (!aonyVar.c()) {
            axejVar.c = aonm.mutableCopy(aonyVar);
        }
        aolo.addAll(iterable, (List) axejVar.c);
    }

    public final void bF(Iterable iterable) {
        copyOnWrite();
        baba babaVar = (baba) this.instance;
        baba babaVar2 = baba.a;
        aony aonyVar = babaVar.c;
        if (!aonyVar.c()) {
            babaVar.c = aonm.mutableCopy(aonyVar);
        }
        aolo.addAll(iterable, (List) babaVar.c);
    }

    public final void bG(Iterable iterable) {
        copyOnWrite();
        baba babaVar = (baba) this.instance;
        baba babaVar2 = baba.a;
        aony aonyVar = babaVar.d;
        if (!aonyVar.c()) {
            babaVar.d = aonm.mutableCopy(aonyVar);
        }
        aolo.addAll(iterable, (List) babaVar.d);
    }

    public final babe bH(int i) {
        return (babe) ((babf) this.instance).m.get(i);
    }

    public final babe bI(int i) {
        return (babe) ((babf) this.instance).o.get(i);
    }

    public final babe bJ(int i) {
        return (babe) ((babf) this.instance).l.get(i);
    }

    public final babe bK(int i) {
        return (babe) ((babf) this.instance).k.get(i);
    }

    public final babe bL(int i) {
        return (babe) ((babf) this.instance).h.get(i);
    }

    public final babe bM(int i) {
        return (babe) ((babf) this.instance).i.get(i);
    }

    public final babe bN(int i) {
        return (babe) ((babf) this.instance).j.get(i);
    }

    public final void bO(Iterable iterable) {
        copyOnWrite();
        babf babfVar = (babf) this.instance;
        babf babfVar2 = babf.a;
        babfVar.a();
        aolo.addAll(iterable, (List) babfVar.m);
    }

    public final void bP(Iterable iterable) {
        copyOnWrite();
        babf babfVar = (babf) this.instance;
        babf babfVar2 = babf.a;
        babfVar.b();
        aolo.addAll(iterable, (List) babfVar.o);
    }

    public final void bQ(Iterable iterable) {
        copyOnWrite();
        babf babfVar = (babf) this.instance;
        babf babfVar2 = babf.a;
        aony aonyVar = babfVar.r;
        if (!aonyVar.c()) {
            babfVar.r = aonm.mutableCopy(aonyVar);
        }
        aolo.addAll(iterable, (List) babfVar.r);
    }

    public final void bR(Iterable iterable) {
        copyOnWrite();
        babf babfVar = (babf) this.instance;
        babf babfVar2 = babf.a;
        aony aonyVar = babfVar.q;
        if (!aonyVar.c()) {
            babfVar.q = aonm.mutableCopy(aonyVar);
        }
        aolo.addAll(iterable, (List) babfVar.q);
    }

    public final void bS(Iterable iterable) {
        copyOnWrite();
        babf babfVar = (babf) this.instance;
        babf babfVar2 = babf.a;
        babfVar.c();
        aolo.addAll(iterable, (List) babfVar.l);
    }

    public final void bT(Iterable iterable) {
        copyOnWrite();
        babf babfVar = (babf) this.instance;
        babf babfVar2 = babf.a;
        babfVar.d();
        aolo.addAll(iterable, (List) babfVar.k);
    }

    public final void bU(Iterable iterable) {
        copyOnWrite();
        babf babfVar = (babf) this.instance;
        babf babfVar2 = babf.a;
        babfVar.e();
        aolo.addAll(iterable, (List) babfVar.h);
    }

    public final void bV(Iterable iterable) {
        copyOnWrite();
        babf babfVar = (babf) this.instance;
        babf babfVar2 = babf.a;
        babfVar.f();
        aolo.addAll(iterable, (List) babfVar.i);
    }

    public final void bW(Iterable iterable) {
        copyOnWrite();
        babf babfVar = (babf) this.instance;
        babf babfVar2 = babf.a;
        babfVar.g();
        aolo.addAll(iterable, (List) babfVar.j);
    }

    public final void bX(int i, babe babeVar) {
        copyOnWrite();
        babf babfVar = (babf) this.instance;
        babf babfVar2 = babf.a;
        babeVar.getClass();
        babfVar.a();
        babfVar.m.set(i, babeVar);
    }

    public final void bY(int i, babe babeVar) {
        copyOnWrite();
        babf babfVar = (babf) this.instance;
        babf babfVar2 = babf.a;
        babeVar.getClass();
        babfVar.b();
        babfVar.o.set(i, babeVar);
    }

    public final void bZ(int i, babe babeVar) {
        copyOnWrite();
        babf babfVar = (babf) this.instance;
        babf babfVar2 = babf.a;
        babeVar.getClass();
        babfVar.c();
        babfVar.l.set(i, babeVar);
    }

    public final void ba(awiv awivVar) {
        copyOnWrite();
        awiw awiwVar = (awiw) this.instance;
        awiw awiwVar2 = awiw.a;
        awivVar.getClass();
        aony aonyVar = awiwVar.e;
        if (!aonyVar.c()) {
            awiwVar.e = aonm.mutableCopy(aonyVar);
        }
        awiwVar.e.add(awivVar);
    }

    public final void bb(String str, awoj awojVar) {
        awojVar.getClass();
        copyOnWrite();
        awoi awoiVar = (awoi) this.instance;
        awoi awoiVar2 = awoi.a;
        aoot aootVar = awoiVar.c;
        if (!aootVar.b) {
            awoiVar.c = aootVar.a();
        }
        awoiVar.c.put(str, awojVar);
    }

    public final void bc(String str) {
        str.getClass();
        copyOnWrite();
        awul awulVar = (awul) this.instance;
        awul awulVar2 = awul.a;
        aoot aootVar = awulVar.d;
        if (!aootVar.b) {
            awulVar.d = aootVar.a();
        }
        awulVar.d.put(str, true);
    }

    public final void bd(String str) {
        copyOnWrite();
        awuo awuoVar = (awuo) this.instance;
        awuo awuoVar2 = awuo.a;
        aoot aootVar = awuoVar.d;
        if (!aootVar.b) {
            awuoVar.d = aootVar.a();
        }
        awuoVar.d.put(str, true);
    }

    public final void be(String str, int i) {
        str.getClass();
        copyOnWrite();
        awuq awuqVar = (awuq) this.instance;
        awuq awuqVar2 = awuq.a;
        awuqVar.a().put(str, Integer.valueOf(i));
    }

    public final void bf(String str, awux awuxVar) {
        str.getClass();
        awuxVar.getClass();
        copyOnWrite();
        awva awvaVar = (awva) this.instance;
        awva awvaVar2 = awva.a;
        awvaVar.a().put(str, awuxVar);
    }

    public final void bg(Iterable iterable) {
        copyOnWrite();
        awvj awvjVar = (awvj) this.instance;
        awvj awvjVar2 = awvj.a;
        aonu aonuVar = awvjVar.f;
        if (!aonuVar.c()) {
            awvjVar.f = aonm.mutableCopy(aonuVar);
        }
        aolo.addAll(iterable, (List) awvjVar.f);
    }

    public final void bh(Iterable iterable) {
        copyOnWrite();
        awvj awvjVar = (awvj) this.instance;
        awvj awvjVar2 = awvj.a;
        aonu aonuVar = awvjVar.e;
        if (!aonuVar.c()) {
            awvjVar.e = aonm.mutableCopy(aonuVar);
        }
        aolo.addAll(iterable, (List) awvjVar.e);
    }

    public final void bi(String str, long j) {
        str.getClass();
        copyOnWrite();
        awvr awvrVar = (awvr) this.instance;
        awvr awvrVar2 = awvr.a;
        aoot aootVar = awvrVar.d;
        if (!aootVar.b) {
            awvrVar.d = aootVar.a();
        }
        awvrVar.d.put(str, Long.valueOf(j));
    }

    public final void bj(String str, int i) {
        str.getClass();
        copyOnWrite();
        awvr awvrVar = (awvr) this.instance;
        awvr awvrVar2 = awvr.a;
        aoot aootVar = awvrVar.j;
        if (!aootVar.b) {
            awvrVar.j = aootVar.a();
        }
        awvrVar.j.put(str, Integer.valueOf(i));
    }

    public final void bk(String str, int i) {
        str.getClass();
        copyOnWrite();
        awvr awvrVar = (awvr) this.instance;
        awvr awvrVar2 = awvr.a;
        aoot aootVar = awvrVar.h;
        if (!aootVar.b) {
            awvrVar.h = aootVar.a();
        }
        awvrVar.h.put(str, Integer.valueOf(i));
    }

    public final void bl(String str, int i) {
        str.getClass();
        copyOnWrite();
        awvr awvrVar = (awvr) this.instance;
        awvr awvrVar2 = awvr.a;
        aoot aootVar = awvrVar.i;
        if (!aootVar.b) {
            awvrVar.i = aootVar.a();
        }
        awvrVar.i.put(str, Integer.valueOf(i));
    }

    public final void bm(String str, long j) {
        str.getClass();
        copyOnWrite();
        awvr awvrVar = (awvr) this.instance;
        awvr awvrVar2 = awvr.a;
        aoot aootVar = awvrVar.k;
        if (!aootVar.b) {
            awvrVar.k = aootVar.a();
        }
        awvrVar.k.put(str, Long.valueOf(j));
    }

    public final void bn(String str, boolean z) {
        str.getClass();
        copyOnWrite();
        awvr awvrVar = (awvr) this.instance;
        awvr awvrVar2 = awvr.a;
        awvrVar.a().put(str, Boolean.valueOf(z));
    }

    public final void bo(String str, int i) {
        str.getClass();
        copyOnWrite();
        awwa awwaVar = (awwa) this.instance;
        awwa awwaVar2 = awwa.a;
        awwaVar.a().put(str, Integer.valueOf(i));
    }

    public final void bp(String str, int i) {
        str.getClass();
        copyOnWrite();
        awwa awwaVar = (awwa) this.instance;
        awwa awwaVar2 = awwa.a;
        awwaVar.b().put(str, Integer.valueOf(i));
    }

    public final void bq(String str, boolean z) {
        str.getClass();
        copyOnWrite();
        awwa awwaVar = (awwa) this.instance;
        awwa awwaVar2 = awwa.a;
        awwaVar.c().put(str, Boolean.valueOf(z));
    }

    public final void br(String str, int i) {
        str.getClass();
        copyOnWrite();
        awwa awwaVar = (awwa) this.instance;
        awwa awwaVar2 = awwa.a;
        awwaVar.d().put(str, Integer.valueOf(i));
    }

    public final void bs(String str, long j) {
        str.getClass();
        copyOnWrite();
        awwa awwaVar = (awwa) this.instance;
        awwa awwaVar2 = awwa.a;
        awwaVar.e().put(str, Long.valueOf(j));
    }

    public final void bt(String str, int i) {
        str.getClass();
        copyOnWrite();
        awwa awwaVar = (awwa) this.instance;
        awwa awwaVar2 = awwa.a;
        awwaVar.f().put(str, Integer.valueOf(i));
    }

    public final void bu(String str, long j) {
        str.getClass();
        copyOnWrite();
        awwa awwaVar = (awwa) this.instance;
        awwa awwaVar2 = awwa.a;
        awwaVar.g().put(str, Long.valueOf(j));
    }

    @Override // defpackage.aoox
    public final aonm build() {
        aonm buildPartial = buildPartial();
        if (buildPartial.isInitialized()) {
            return buildPartial;
        }
        throw newUninitializedMessageException(buildPartial);
    }

    @Override // defpackage.aoox
    public aonm buildPartial() {
        if (this.isBuilt) {
            return this.instance;
        }
        this.instance.makeImmutable();
        this.isBuilt = true;
        return this.instance;
    }

    public final void bv(String str, int i) {
        str.getClass();
        copyOnWrite();
        awwf awwfVar = (awwf) this.instance;
        awwf awwfVar2 = awwf.a;
        aoot aootVar = awwfVar.l;
        if (!aootVar.b) {
            awwfVar.l = aootVar.a();
        }
        awwfVar.l.put(str, Integer.valueOf(i));
    }

    public final void bw(String str, int i) {
        str.getClass();
        copyOnWrite();
        awwf awwfVar = (awwf) this.instance;
        awwf awwfVar2 = awwf.a;
        aoot aootVar = awwfVar.m;
        if (!aootVar.b) {
            awwfVar.m = aootVar.a();
        }
        awwfVar.m.put(str, Integer.valueOf(i));
    }

    public final void bx(String str, boolean z) {
        str.getClass();
        copyOnWrite();
        awwf awwfVar = (awwf) this.instance;
        awwf awwfVar2 = awwf.a;
        aoot aootVar = awwfVar.n;
        if (!aootVar.b) {
            awwfVar.n = aootVar.a();
        }
        awwfVar.n.put(str, Boolean.valueOf(z));
    }

    public final void by(String str, awwh awwhVar) {
        str.getClass();
        awwhVar.getClass();
        copyOnWrite();
        awwj awwjVar = (awwj) this.instance;
        awwj awwjVar2 = awwj.a;
        aoot aootVar = awwjVar.d;
        if (!aootVar.b) {
            awwjVar.d = aootVar.a();
        }
        awwjVar.d.put(str, awwhVar);
    }

    public final void bz(String str, boolean z) {
        str.getClass();
        copyOnWrite();
        awwp awwpVar = (awwp) this.instance;
        awwp awwpVar2 = awwp.a;
        aoot aootVar = awwpVar.d;
        if (!aootVar.b) {
            awwpVar.d = aootVar.a();
        }
        awwpVar.d.put(str, Boolean.valueOf(z));
    }

    public final void ca(int i, babe babeVar) {
        copyOnWrite();
        babf babfVar = (babf) this.instance;
        babf babfVar2 = babf.a;
        babeVar.getClass();
        babfVar.d();
        babfVar.k.set(i, babeVar);
    }

    public final void cb(int i, babe babeVar) {
        copyOnWrite();
        babf babfVar = (babf) this.instance;
        babf babfVar2 = babf.a;
        babeVar.getClass();
        babfVar.e();
        babfVar.h.set(i, babeVar);
    }

    public final void cc(int i, babe babeVar) {
        copyOnWrite();
        babf babfVar = (babf) this.instance;
        babf babfVar2 = babf.a;
        babeVar.getClass();
        babfVar.f();
        babfVar.i.set(i, babeVar);
    }

    public final void cd(int i, babe babeVar) {
        copyOnWrite();
        babf babfVar = (babf) this.instance;
        babf babfVar2 = babf.a;
        babeVar.getClass();
        babfVar.g();
        babfVar.j.set(i, babeVar);
    }

    public final void ce(int i) {
        copyOnWrite();
        baco bacoVar = (baco) this.instance;
        baco bacoVar2 = baco.a;
        aonu aonuVar = bacoVar.c;
        if (!aonuVar.c()) {
            bacoVar.c = aonm.mutableCopy(aonuVar);
        }
        bacoVar.c.g(i);
    }

    public final void cf(int i) {
        copyOnWrite();
        baco bacoVar = (baco) this.instance;
        baco bacoVar2 = baco.a;
        aonu aonuVar = bacoVar.b;
        if (!aonuVar.c()) {
            bacoVar.b = aonm.mutableCopy(aonuVar);
        }
        bacoVar.b.g(i);
    }

    public final void cg(Map map) {
        copyOnWrite();
        bark barkVar = (bark) this.instance;
        bark barkVar2 = bark.a;
        aoot aootVar = barkVar.d;
        if (!aootVar.b) {
            barkVar.d = aootVar.a();
        }
        barkVar.d.putAll(map);
    }

    public final void ch(aone aoneVar) {
        copyOnWrite();
        arxu arxuVar = (arxu) this.instance;
        arxr arxrVar = (arxr) aoneVar.build();
        arxu arxuVar2 = arxu.a;
        arxrVar.getClass();
        aony aonyVar = arxuVar.d;
        if (!aonyVar.c()) {
            arxuVar.d = aonm.mutableCopy(aonyVar);
        }
        arxuVar.d.add(arxrVar);
    }

    public final aone clear() {
        this.instance = (aonm) this.instance.dynamicMethod(aonl.NEW_MUTABLE_INSTANCE);
        return this;
    }

    public final void copyOnWrite() {
        if (this.isBuilt) {
            copyOnWriteInternal();
            this.isBuilt = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void copyOnWriteInternal() {
        aonm aonmVar = (aonm) this.instance.dynamicMethod(aonl.NEW_MUTABLE_INSTANCE);
        mergeFromInstance(aonmVar, this.instance);
        this.instance = aonmVar;
    }

    public final void f(aomf aomfVar) {
        copyOnWrite();
        dvt dvtVar = (dvt) this.instance;
        dvt dvtVar2 = dvt.a;
        aony aonyVar = dvtVar.c;
        if (!aonyVar.c()) {
            dvtVar.c = aonm.mutableCopy(aonyVar);
        }
        dvtVar.c.add(aomfVar);
    }

    public final void g(int i, long j) {
        copyOnWrite();
        fke fkeVar = (fke) this.instance;
        fke fkeVar2 = fke.a;
        aoot aootVar = fkeVar.g;
        if (!aootVar.b) {
            fkeVar.g = aootVar.a();
        }
        fkeVar.g.put(Integer.valueOf(i), Long.valueOf(j));
    }

    @Override // defpackage.aooz
    public aonm getDefaultInstanceForType() {
        return this.defaultInstance;
    }

    public final fkb h(String str, fkb fkbVar) {
        str.getClass();
        Map unmodifiableMap = Collections.unmodifiableMap(((fkg) this.instance).j);
        return unmodifiableMap.containsKey(str) ? (fkb) unmodifiableMap.get(str) : fkbVar;
    }

    public final void i(String str, fkb fkbVar) {
        str.getClass();
        fkbVar.getClass();
        copyOnWrite();
        fkg fkgVar = (fkg) this.instance;
        fkg fkgVar2 = fkg.a;
        aoot aootVar = fkgVar.j;
        if (!aootVar.b) {
            fkgVar.j = aootVar.a();
        }
        fkgVar.j.put(str, fkbVar);
    }

    @Override // defpackage.aooz
    public final boolean isInitialized() {
        return aonm.isInitialized(this.instance, false);
    }

    public final void j(String str, foa foaVar) {
        foaVar.getClass();
        copyOnWrite();
        fof fofVar = (fof) this.instance;
        fof fofVar2 = fof.a;
        aoot aootVar = fofVar.f;
        if (!aootVar.b) {
            fofVar.f = aootVar.a();
        }
        fofVar.f.put(str, foaVar);
    }

    public final void k(String str, long j) {
        str.getClass();
        copyOnWrite();
        idr idrVar = (idr) this.instance;
        idr idrVar2 = idr.a;
        aoot aootVar = idrVar.f;
        if (!aootVar.b) {
            idrVar.f = aootVar.a();
        }
        idrVar.f.put(str, Long.valueOf(j));
    }

    public final void l(Iterable iterable) {
        copyOnWrite();
        ovs ovsVar = (ovs) this.instance;
        ovs ovsVar2 = ovs.a;
        aony aonyVar = ovsVar.c;
        if (!aonyVar.c()) {
            ovsVar.c = aonm.mutableCopy(aonyVar);
        }
        aolo.addAll(iterable, (List) ovsVar.c);
    }

    public final void m(Iterable iterable) {
        copyOnWrite();
        rlb rlbVar = (rlb) this.instance;
        rlb rlbVar2 = rlb.a;
        rlbVar.a();
        aolo.addAll(iterable, (List) rlbVar.h);
    }

    public final rkz n(int i) {
        return (rkz) ((rld) this.instance).e.get(i);
    }

    public final rlh o(int i) {
        return (rlh) ((rld) this.instance).f.get(i);
    }

    public final void p(Iterable iterable) {
        copyOnWrite();
        rld rldVar = (rld) this.instance;
        rld rldVar2 = rld.a;
        aony aonyVar = rldVar.D;
        if (!aonyVar.c()) {
            rldVar.D = aonm.mutableCopy(aonyVar);
        }
        aolo.addAll(iterable, (List) rldVar.D);
    }

    public final void q(rky rkyVar) {
        copyOnWrite();
        rld rldVar = (rld) this.instance;
        rkz rkzVar = (rkz) rkyVar.build();
        rld rldVar2 = rld.a;
        rkzVar.getClass();
        rldVar.a();
        rldVar.e.add(rkzVar);
    }

    public final void r(rlh rlhVar) {
        copyOnWrite();
        rld rldVar = (rld) this.instance;
        rld rldVar2 = rld.a;
        rlhVar.getClass();
        rldVar.b();
        rldVar.f.add(rlhVar);
    }

    public final void s(int i, rky rkyVar) {
        copyOnWrite();
        rld rldVar = (rld) this.instance;
        rkz rkzVar = (rkz) rkyVar.build();
        rld rldVar2 = rld.a;
        rkzVar.getClass();
        rldVar.a();
        rldVar.e.set(i, rkzVar);
    }

    public final void t(int i, rlh rlhVar) {
        copyOnWrite();
        rld rldVar = (rld) this.instance;
        rld rldVar2 = rld.a;
        rlhVar.getClass();
        rldVar.b();
        rldVar.f.set(i, rlhVar);
    }

    public final void u(Iterable iterable) {
        copyOnWrite();
        rlf rlfVar = (rlf) this.instance;
        rlf rlfVar2 = rlf.a;
        aonx aonxVar = rlfVar.c;
        if (!aonxVar.c()) {
            rlfVar.c = aonm.mutableCopy(aonxVar);
        }
        aolo.addAll(iterable, (List) rlfVar.c);
    }

    public final void v(Iterable iterable) {
        copyOnWrite();
        rlf rlfVar = (rlf) this.instance;
        rlf rlfVar2 = rlf.a;
        aonx aonxVar = rlfVar.b;
        if (!aonxVar.c()) {
            rlfVar.b = aonm.mutableCopy(aonxVar);
        }
        aolo.addAll(iterable, (List) rlfVar.b);
    }

    public final void w(tjw tjwVar) {
        copyOnWrite();
        tjx tjxVar = (tjx) this.instance;
        tjx tjxVar2 = tjx.a;
        tjwVar.getClass();
        tjxVar.a();
        tjxVar.h.add(tjwVar);
    }

    public final void x(String str, tkv tkvVar) {
        str.getClass();
        tkvVar.getClass();
        copyOnWrite();
        tlb tlbVar = (tlb) this.instance;
        tlb tlbVar2 = tlb.a;
        tlbVar.a().put(str, tkvVar);
    }

    public final void y(String str) {
        str.getClass();
        copyOnWrite();
        tlb tlbVar = (tlb) this.instance;
        tlb tlbVar2 = tlb.a;
        tlbVar.a().remove(str);
    }

    public final void z(String str, tlh tlhVar) {
        str.getClass();
        tlhVar.getClass();
        copyOnWrite();
        tlj tljVar = (tlj) this.instance;
        tlj tljVar2 = tlj.a;
        tljVar.a().put(str, tlhVar);
    }

    /* renamed from: clear, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ aoox m29clear() {
        clear();
        return this;
    }

    @Override // defpackage.aoln
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public aone mo21clone() {
        aone newBuilderForType = getDefaultInstanceForType().newBuilderForType();
        newBuilderForType.mergeFrom(buildPartial());
        return newBuilderForType;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aoln
    public aone internalMergeFrom(aonm aonmVar) {
        return mergeFrom(aonmVar);
    }

    @Override // defpackage.aoln
    /* renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public aone mo24mergeFrom(aomk aomkVar, aomw aomwVar) {
        copyOnWrite();
        try {
            aopi.a.b(this.instance).h(this.instance, aoml.p(aomkVar), aomwVar);
            return this;
        } catch (RuntimeException e) {
            if (e.getCause() instanceof IOException) {
                throw ((IOException) e.getCause());
            }
            throw e;
        }
    }

    public aone(aonm aonmVar) {
        this.defaultInstance = aonmVar;
        this.instance = (aonm) aonmVar.dynamicMethod(aonl.NEW_MUTABLE_INSTANCE);
        this.isBuilt = false;
    }

    public aone(short[] sArr, char[] cArr) {
        this(aoul.a);
    }

    public aone(int[][] iArr, short[] sArr) {
        this(aoyi.a);
    }

    public aone(char[][] cArr, byte[] bArr) {
        this(aoyx.a);
    }

    public aone(boolean[] zArr, int[] iArr) {
        this(apba.a);
    }

    public aone(float[][][] fArr, int[] iArr) {
        this(apaz.a);
    }

    public aone mergeFrom(aonm aonmVar) {
        copyOnWrite();
        mergeFromInstance(this.instance, aonmVar);
        return this;
    }

    public aone(short[] sArr, byte[][] bArr) {
        this(apbc.a);
    }

    public aone(char[][] cArr, float[] fArr) {
        this(apbg.a);
    }

    public aone(int[][][] iArr, byte[][] bArr) {
        this(apbf.a);
    }

    @Override // defpackage.aoln
    /* renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public aone mo27mergeFrom(byte[] bArr, int i, int i2) {
        return mo28mergeFrom(bArr, i, i2, aomw.a());
    }

    public aone(byte[][][] bArr, boolean[] zArr) {
        this(apbi.a);
    }

    public aone(boolean[][] zArr, char[][] cArr) {
        this(apdx.a);
    }

    public aone(boolean[] zArr, short[][] sArr) {
        this(aplw.a);
    }

    @Override // defpackage.aoln
    /* renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public aone mo28mergeFrom(byte[] bArr, int i, int i2, aomw aomwVar) {
        copyOnWrite();
        try {
            aopi.a.b(this.instance).i(this.instance, bArr, i, i + i2, new aolt(aomwVar));
            return this;
        } catch (aoob e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        } catch (IndexOutOfBoundsException unused) {
            throw aoob.j();
        }
    }

    public aone(boolean[] zArr, boolean[][] zArr2) {
        this(apql.a);
    }

    public aone(boolean[][] zArr, int[][] iArr) {
        this(apqv.a);
    }

    public aone(boolean[][][] zArr, boolean[][] zArr2) {
        this(aptj.a);
    }

    public aone(boolean[][][] zArr, short[][] sArr) {
        this(apuv.a);
    }

    public aone(char[] cArr) {
        this(apux.a);
    }

    public aone(char[][][] cArr) {
        this(aqax.a);
    }

    public aone(int[][][] iArr, char[] cArr) {
        this(aqcr.a);
    }

    public aone(int[] iArr, char[] cArr) {
        this(aqct.a);
    }

    public aone(boolean[][] zArr, short[] sArr) {
        this(aqdt.a);
    }

    public aone(short[][] sArr, byte[] bArr) {
        this(aqif.b);
    }

    public aone(float[] fArr, int[] iArr) {
        this(aqkc.a);
    }

    public aone(byte[] bArr, boolean[] zArr) {
        this(aqlp.a);
    }

    public aone(int[] iArr, byte[][] bArr) {
        this(aqls.a);
    }

    public aone(short[][] sArr, float[] fArr) {
        this(aqmo.a);
    }

    public aone(boolean[][][] zArr, byte[][] bArr) {
        this(aqnq.a);
    }

    public aone(char[][][] cArr, boolean[] zArr) {
        this(aqny.a);
    }

    public aone(float[][] fArr, char[][] cArr) {
        this(aqol.a);
    }

    public aone(float[] fArr, short[][] sArr) {
        this(aqpc.a);
    }

    public aone(float[] fArr, boolean[][] zArr) {
        this(aqpd.a);
    }

    public aone(float[][] fArr, int[][] iArr) {
        this(aqpo.a);
    }

    public aone(float[][][] fArr, boolean[][] zArr) {
        this(aqqj.a);
    }

    public aone(float[][][] fArr, short[][] sArr) {
        this(aqqg.a);
    }

    public aone(boolean[] zArr) {
        this(aqqq.a);
    }

    public aone(boolean[][][] zArr) {
        this(aqst.a);
    }

    public aone(byte[] bArr, short[] sArr) {
        this(aqud.a);
    }

    public aone(byte[][] bArr, char[] cArr) {
        this(aquz.b);
    }

    public aone(char[][][] cArr, short[] sArr) {
        this(aqwh.a);
    }

    public aone(float[][] fArr, byte[] bArr) {
        this(aqwl.a);
    }

    public aone(short[][] sArr, int[] iArr) {
        this(aqza.a);
    }

    public aone(int[] iArr, boolean[] zArr) {
        this(aqzu.a);
    }

    public aone(byte[][] bArr, byte[][] bArr2) {
        this(ario.a);
    }

    public aone(float[][] fArr, float[] fArr2) {
        this(arjc.a);
    }

    public aone(char[] cArr, char[][] cArr2) {
        this(arjg.a);
    }

    public aone(boolean[][][] zArr, boolean[] zArr2) {
        this(arjp.a);
    }

    public aone(short[][][] sArr, char[][] cArr) {
        this(arka.a);
    }

    public aone(short[][] sArr, short[][] sArr2) {
        this(arke.a);
    }

    public aone(short[][] sArr, boolean[][] zArr) {
        this(arkz.a);
    }

    public aone(short[][][] sArr, int[][] iArr) {
        this(arlb.a);
    }

    public aone(short[] sArr, float[][] fArr) {
        this(arlp.a);
    }

    public aone(short[] sArr, int[][] iArr) {
        this(arls.a);
    }

    public aone(int[] iArr) {
        this(armk.a);
    }

    public aone(int[][][] iArr) {
        this(armt.a);
    }

    public aone(float[][][] fArr, char[] cArr) {
        this(armz.a);
    }

    public aone(float[] fArr, char[] cArr) {
        this(arnb.a);
    }

    public aone(byte[][][] bArr, short[] sArr) {
        this(arnc.a);
    }

    public aone(boolean[][] zArr, byte[] bArr) {
        this(arod.a);
    }

    public aone(char[][] cArr, int[] iArr) {
        this(arol.a);
    }

    public aone(short[] sArr, boolean[] zArr) {
        this(aroq.a);
    }

    public aone(float[] fArr, byte[][] bArr) {
        this(arov.a);
    }

    public aone(boolean[][] zArr, float[] fArr) {
        this(aroz.a);
    }

    public aone(byte[] bArr, char[][] cArr) {
        this(arpr.a);
    }

    public aone(int[][][] iArr, boolean[] zArr) {
        this(arqd.a);
    }

    public aone(char[][][] cArr, char[][] cArr2) {
        this(arrb.a);
    }

    public aone(char[][] cArr, short[][] sArr) {
        this(arsj.a);
    }

    public aone(char[][] cArr, boolean[][] zArr) {
        this(arsq.a);
    }

    public aone(char[][][] cArr, int[][] iArr) {
        this(arss.a);
    }

    public aone(char[] cArr, float[][] fArr) {
        this(artl.a);
    }

    public aone(char[] cArr, int[][] iArr) {
        this(arvm.a);
    }

    public aone(float[] fArr) {
        this(arwm.a);
    }

    public aone(float[][][] fArr) {
        this(arwu.a);
    }

    public aone(char[] cArr, short[] sArr) {
        this(arww.a);
    }

    public aone(char[][] cArr, char[] cArr2) {
        this(arwz.a);
    }

    public aone(short[][][] sArr, short[] sArr2) {
        this(arxj.a);
    }

    public aone(byte[][][] bArr, byte[] bArr2) {
        this(arxo.a);
    }

    public aone(int[][] iArr, int[] iArr2) {
        this(arxr.a);
    }

    public aone(boolean[] zArr, boolean[] zArr2) {
        this(arxt.a);
    }

    public aone(char[][] cArr, byte[][] bArr) {
        this(arxu.a);
    }

    public aone(byte[][][] bArr, float[] fArr) {
        this(arxw.b);
    }

    public aone(short[] sArr, char[][] cArr) {
        this(aryo.a);
    }

    public aone(float[][][] fArr, boolean[] zArr) {
        this(aryp.a);
    }

    public aone(int[][][] iArr, char[][] cArr) {
        this(aryv.a);
    }

    public aone(int[][] iArr, short[][] sArr) {
        this(arza.a);
    }

    public aone(int[][] iArr, boolean[][] zArr) {
        this(arzf.a);
    }

    public aone(int[][][] iArr, int[][] iArr2) {
        this(arzj.a);
    }

    public aone(int[] iArr, float[][] fArr) {
        this(asad.a);
    }

    public aone(int[] iArr, int[][] iArr2) {
        this(asag.a);
    }

    public aone(short[] sArr) {
        this(asas.a);
    }

    public aone(short[][][] sArr) {
        this(asar.a);
    }

    public aone(boolean[][][] zArr, char[] cArr) {
        this(asbo.a);
    }

    public aone(boolean[] zArr, char[] cArr) {
        this(asbq.a);
    }

    public aone(float[][] fArr, short[] sArr) {
        this(asdt.a);
    }

    public aone(int[][] iArr, byte[] bArr) {
        this(asdw.a);
    }

    public aone(byte[][] bArr, int[] iArr) {
        this(asdy.a);
    }

    public aone(char[] cArr, boolean[] zArr) {
        this(aseb.a);
    }

    public aone(boolean[] zArr, byte[][] bArr) {
        this(asfb.a);
    }

    public aone(int[][] iArr, float[] fArr) {
        this(asfm.a);
    }

    public aone(float[][][] fArr, byte[][] bArr) {
        this(asgq.a);
    }

    public aone(short[][][] sArr, boolean[] zArr) {
        this(ashc.a);
    }

    public aone(byte[][][] bArr, char[][] cArr) {
        this(asht.a);
    }

    public aone(byte[][] bArr, short[][] sArr) {
        this(ashw.a);
    }

    public aone(byte[][] bArr, boolean[][] zArr) {
        this(asjc.a);
    }

    public aone(byte[][][] bArr, int[][] iArr) {
        this(asmd.a);
    }

    public aone(byte[] bArr, float[][] fArr) {
        this(asmm.a);
    }

    public aone(byte[] bArr, int[][] iArr) {
        this(asrh.a);
    }

    public aone(byte[][] bArr) {
        this(astf.a);
    }

    public aone(byte[] bArr, byte[] bArr2) {
        this(asuu.a);
    }

    public aone(short[] sArr, short[] sArr2) {
        this(asvz.a);
    }

    public aone(short[][] sArr, char[] cArr) {
        this(aswl.a);
    }

    public aone(int[][][] iArr, short[] sArr) {
        this(aswm.a);
    }

    public aone(char[][][] cArr, byte[] bArr) {
        this(asxk.a);
    }

    public aone(boolean[][] zArr, int[] iArr) {
        this(aszw.a);
    }

    public aone(float[] fArr, boolean[] zArr) {
        this(ataj.a);
    }

    public aone(short[][] sArr, byte[][] bArr) {
        this(atbc.a);
    }

    public aone(char[][][] cArr, float[] fArr) {
        this(atbo.a);
    }

    public aone(int[] iArr, char[][] cArr) {
        this(atby.a);
    }

    public aone(byte[] bArr, float[] fArr) {
        this(atbw.b);
    }

    public aone(boolean[][][] zArr, char[][] cArr) {
        this(atdc.a);
    }

    public aone(boolean[][] zArr, short[][] sArr) {
        this(atfa.a);
    }

    public aone(boolean[][] zArr, boolean[][] zArr2) {
        this(atfn.a);
    }

    public aone(boolean[][][] zArr, int[][] iArr) {
        this(ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint.a);
    }

    public aone(boolean[] zArr, float[][] fArr) {
        this(athx.a);
    }

    public aone(boolean[] zArr, int[][] iArr) {
        this(atns.a);
    }

    public aone(char[][] cArr) {
        this(atou.a);
    }

    public aone(char[] cArr, byte[] bArr) {
        this(atov.a);
    }

    public aone(int[] iArr, short[] sArr) {
        this(atpq.a);
    }

    public aone(int[][] iArr, char[] cArr) {
        this(atpu.a);
    }

    public aone(boolean[][][] zArr, short[] sArr) {
        this(atpv.a);
    }

    public aone(short[][][] sArr, byte[] bArr) {
        this(atqz.a);
    }

    public aone(float[][] fArr, int[] iArr) {
        this(atrt.a);
    }

    public aone(byte[][] bArr, boolean[] zArr) {
        this(atvs.a);
    }

    public aone(int[][] iArr, byte[][] bArr) {
        this(atvy.a);
    }

    public aone(short[][][] sArr, float[] fArr) {
        this(atxc.a);
    }

    public aone(boolean[] zArr, char[][] cArr) {
        this(PlaylistEditEndpointOuterClass$PlaylistEditEndpoint.a);
    }

    public aone(char[] cArr, float[] fArr) {
        this(audc.a);
    }

    public aone(float[][][] fArr, char[][] cArr) {
        this(audq.a);
    }

    public aone(float[][] fArr, short[][] sArr) {
        this(aueh.a);
    }

    public aone(float[][] fArr, boolean[][] zArr) {
        this(aumw.a);
    }

    public aone(float[][][] fArr, int[][] iArr) {
        this(auov.a);
    }

    public aone(float[] fArr, float[][] fArr2) {
        this(auqa.a);
    }

    public aone(float[] fArr, int[][] iArr) {
        this(auqh.a);
    }

    public aone(boolean[][] zArr) {
        this(autk.a);
    }

    public aone(boolean[] zArr, byte[] bArr) {
        this(ShortsCreationEndpointOuterClass$ShortsCreationEndpoint.a);
    }

    public aone(byte[][] bArr, short[] sArr) {
        this(auuv.a);
    }

    public aone(byte[][][] bArr, char[] cArr) {
        this(auux.a);
    }

    public aone(char[] cArr, int[] iArr) {
        this(auvz.a);
    }

    public aone(float[][][] fArr, byte[] bArr) {
        this(auwh.a);
    }

    public aone(short[][][] sArr, int[] iArr) {
        this(auyc.a);
    }

    public aone(int[][] iArr, boolean[] zArr) {
        this(avdg.a);
    }

    public aone(byte[][][] bArr, byte[][] bArr2) {
        this(aven.a);
    }

    public aone(float[][][] fArr, float[] fArr2) {
        this(avfj.a);
    }

    public aone(char[][] cArr, char[][] cArr2) {
        this(avjt.a);
    }

    public aone(boolean[] zArr, float[] fArr) {
        this(avnb.a);
    }

    public aone(short[] sArr, short[][] sArr2) {
        this(avse.a);
    }

    public aone(short[][][] sArr, short[][] sArr2) {
        this(avth.a);
    }

    public aone(short[][][] sArr, boolean[][] zArr) {
        this(avwp.a);
    }

    public aone(short[] sArr, boolean[][] zArr) {
        this(avwv.a);
    }

    public aone(short[][] sArr, float[][] fArr) {
        this(avxh.a);
    }

    public aone(short[][] sArr, int[][] iArr) {
        this(avxj.a);
    }

    public aone(int[][] iArr) {
        this(avyg.a);
    }

    public aone(int[] iArr, byte[] bArr) {
        this(avyf.a);
    }

    public aone(float[] fArr, short[] sArr) {
        this(avyc.a);
    }

    public aone(float[][] fArr, char[] cArr) {
        this(awae.a);
    }

    public aone(byte[] bArr, int[] iArr) {
        this(awhh.a);
    }

    public aone(boolean[][][] zArr, byte[] bArr) {
        this(awiw.a);
    }

    public aone(char[][][] cArr, int[] iArr) {
        this(awjc.a);
    }

    public aone(short[][] sArr, boolean[] zArr) {
        this(awke.a);
    }

    public aone(float[][] fArr, byte[][] bArr) {
        this(awnd.a);
    }

    public aone(boolean[][][] zArr, float[] fArr) {
        this(awoi.a);
    }

    public aone(byte[][] bArr, char[][] cArr) {
        this(awpc.a);
    }

    public aone(int[] iArr, float[] fArr) {
        this(awpf.a);
    }

    public aone(char[] cArr, short[][] sArr) {
        this(awrx.a);
    }

    public aone(char[][][] cArr, short[][] sArr) {
        this(awry.a);
    }

    public aone(char[][][] cArr, boolean[][] zArr) {
        this(awsc.a);
    }

    public aone(char[] cArr, boolean[][] zArr) {
        this(awsf.a);
    }

    public aone(char[][] cArr, float[][] fArr) {
        this(awud.a);
    }

    public aone(char[][] cArr, int[][] iArr) {
        this(awul.a);
    }

    public aone(float[][] fArr) {
        this(awuo.a);
    }

    public aone(float[] fArr, byte[] bArr) {
        this(awuq.a);
    }

    public aone(char[][] cArr, short[] sArr) {
        this(awux.a);
    }

    public aone(char[][][] cArr, char[] cArr2) {
        this(awva.a);
    }

    public aone(short[] sArr, int[] iArr) {
        this(awvi.a);
    }

    public aone(byte[] bArr, char[] cArr) {
        this(awvj.a);
    }

    public aone(int[][][] iArr, int[] iArr2) {
        this(awvr.a);
    }

    public aone(boolean[][] zArr, boolean[] zArr2) {
        this(awwa.a);
    }

    public aone(char[][][] cArr, byte[][] bArr) {
        this(awwf.a);
    }

    public aone(byte[] bArr, byte[][] bArr2) {
        this(awwj.a);
    }

    public aone(short[][] sArr, char[][] cArr) {
        this(awwp.a);
    }

    public aone(float[] fArr, float[] fArr2) {
        this(awwr.a);
    }

    public aone(int[] iArr, short[][] sArr) {
        this(awws.a);
    }

    public aone(int[][][] iArr, short[][] sArr) {
        this(awxv.a);
    }

    public aone(int[][][] iArr, boolean[][] zArr) {
        this(awxy.a);
    }

    public aone(int[] iArr, boolean[][] zArr) {
        this(awyq.a);
    }

    public aone(int[][] iArr, float[][] fArr) {
        this(awym.a);
    }

    public aone(int[][] iArr, int[][] iArr2) {
        this(awyw.a);
    }

    public aone(short[][] sArr) {
        this(awyx.a);
    }

    public aone(short[] sArr, byte[] bArr) {
        this(axbi.a);
    }

    public aone(boolean[] zArr, short[] sArr) {
        this(axbq.b);
    }

    public aone(boolean[][] zArr, char[] cArr) {
        this(axbu.b);
    }

    public aone(float[][][] fArr, short[] sArr) {
        this(axca.b);
    }

    public aone(int[][][] iArr, byte[] bArr) {
        this(axcv.a);
    }

    public aone(byte[][][] bArr, int[] iArr) {
        this(axcx.b);
    }

    public aone(char[][] cArr, boolean[] zArr) {
        this(axdv.a);
    }

    public aone(boolean[][] zArr, byte[][] bArr) {
        this(axdy.a);
    }

    public aone(int[][][] iArr, float[] fArr) {
        this(axee.a);
    }

    public aone(float[] fArr, char[][] cArr) {
        this(axej.a);
    }

    public aone(short[] sArr, float[] fArr) {
        this(axeu.b);
    }

    public aone(byte[] bArr, short[][] sArr) {
        this(axev.a);
    }

    public aone(byte[][][] bArr, short[][] sArr) {
        this(axew.a);
    }

    public aone(byte[][][] bArr, boolean[][] zArr) {
        this(baat.a);
    }

    public aone(byte[] bArr, boolean[][] zArr) {
        this(baba.a);
    }

    public aone(byte[][] bArr, float[][] fArr) {
        this(babf.a);
    }

    public aone(byte[][] bArr, int[][] iArr) {
        this(babh.a);
    }

    public aone(byte[] bArr) {
        this(babr.a);
    }

    public aone(byte[][][] bArr) {
        this(babs.a);
    }

    public aone(short[][][] sArr, char[] cArr) {
        this(babx.a);
    }

    public aone(char[] cArr, char[] cArr2) {
        this(bacb.a);
    }

    public aone(short[][] sArr, short[] sArr2) {
        this(baci.a);
    }

    public aone(byte[][] bArr, byte[] bArr2) {
        this(bacl.a);
    }

    public aone(int[] iArr, int[] iArr2) {
        this(bacn.a);
    }

    public aone(boolean[][][] zArr, int[] iArr) {
        this(bacm.a);
    }

    public aone(char[] cArr, byte[][] bArr) {
        this(baco.a);
    }

    public aone(byte[][] bArr, float[] fArr) {
        this(bark.a);
    }

    public aone(short[][][] sArr, byte[][] bArr) {
        this(baro.a);
    }

    public aone(float[][] fArr, boolean[] zArr) {
        this(barr.a);
    }

    public aone(int[][] iArr, char[][] cArr) {
        this(basi.a);
    }
}
