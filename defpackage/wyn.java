package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.ads.model.AdIntro;
import com.google.android.libraries.youtube.ads.model.ForecastingAd;
import com.google.android.libraries.youtube.ads.model.InstreamAdBreak;
import com.google.android.libraries.youtube.ads.model.InstreamAdImpl;
import com.google.android.libraries.youtube.ads.model.LocalVideoAd;
import com.google.android.libraries.youtube.ads.model.MediaAd;
import com.google.android.libraries.youtube.ads.model.MediaBreakAd;
import com.google.android.libraries.youtube.ads.model.PlayerAd;
import com.google.android.libraries.youtube.ads.model.SurveyAd;
import com.google.android.libraries.youtube.ads.model.ThrottledAd;
import com.google.android.libraries.youtube.innertube.model.ads.InstreamAd;
import com.google.protos.youtube.api.innertube.AdEngagementPanelsRendererOuterClass;
import com.google.protos.youtube.api.innertube.ElementRendererOuterClass;
import com.google.protos.youtube.api.innertube.SimpleAdBadgeRendererOuterClass;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wyn {
    public final wyo a;
    public final wys b;
    public final wym c;
    public final wyu d;
    private final ajoy e;

    public wyn(ajoy ajoyVar, wyo wyoVar, wys wysVar, wym wymVar, wyu wyuVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.e = ajoyVar;
        this.a = wyoVar;
        this.b = wysVar;
        this.c = wymVar;
        this.d = wyuVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final defpackage.xev l(defpackage.xgh r16, java.lang.String r17, defpackage.apac r18, defpackage.ammv r19, java.lang.String r20, com.google.android.libraries.youtube.innertube.model.ads.InstreamAd r21, java.util.List r22, defpackage.apxf r23, java.util.Map r24, java.lang.String r25, defpackage.xcf r26) {
        /*
            r15 = this;
            r0 = r15
            r1 = r21
            r2 = r23
            r3 = r24
            int r4 = r22.size()
            r5 = 0
            if (r4 != 0) goto Lf
            return r5
        Lf:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r6 = r22.iterator()
        L18:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L37
            java.lang.Object r7 = r6.next()
            aqto r7 = (defpackage.aqto) r7
            java.lang.String r7 = m(r7)
            boolean r8 = android.text.TextUtils.isEmpty(r7)
            if (r8 == 0) goto L33
            java.lang.String r8 = "Missing panel ID for ads engagement panel."
            defpackage.whu.l(r5, r8)
        L33:
            r4.add(r7)
            goto L18
        L37:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            xcw r6 = new xcw
            r7 = r22
            r6.<init>(r7)
            r5.add(r6)
            xdq r6 = new xdq
            r6.<init>(r4)
            r5.add(r6)
            if (r2 == 0) goto L62
            if (r3 == 0) goto L62
            xeh r4 = new xeh
            r4.<init>(r2)
            r5.add(r4)
            xef r2 = new xef
            r2.<init>(r3)
            r5.add(r2)
        L62:
            amrp r2 = defpackage.amru.f()
            wym r3 = r0.c
            apah r4 = defpackage.apah.TRIGGER_TYPE_ON_DIFFERENT_LAYOUT_ID_ENTERED
            java.lang.String r3 = r3.c(r4)
            apae r4 = defpackage.apae.SLOT_TYPE_PLAYER_BYTES
            apac r6 = defpackage.apac.LAYOUT_TYPE_MEDIA
            r7 = r20
            xfo r3 = defpackage.xfo.e(r3, r7, r4, r6)
            r2.h(r3)
            boolean r3 = r1 instanceof com.google.android.libraries.youtube.ads.model.InstreamAdImpl
            if (r3 == 0) goto La7
            com.google.android.libraries.youtube.ads.model.InstreamAdImpl r1 = (com.google.android.libraries.youtube.ads.model.InstreamAdImpl) r1
            com.google.android.libraries.youtube.ads.model.PlayerAd r1 = r1.b
            boolean r3 = r1 instanceof com.google.android.libraries.youtube.ads.model.LocalVideoAd
            if (r3 == 0) goto La7
            com.google.android.libraries.youtube.ads.model.LocalVideoAd r1 = (com.google.android.libraries.youtube.ads.model.LocalVideoAd) r1
            boolean r3 = r1.D()
            if (r3 != 0) goto L95
            boolean r1 = r1.C()
            if (r1 == 0) goto La7
        L95:
            wym r1 = r0.c
            apah r3 = defpackage.apah.TRIGGER_TYPE_SURVEY_SUBMITTED
            java.lang.String r1 = r1.c(r3)
            r3 = r17
            xgq r1 = defpackage.xgq.e(r1, r3)
            r2.h(r1)
            goto La9
        La7:
            r3 = r17
        La9:
            r1 = r26
            int r1 = r1.c
            r4 = 1
            if (r1 <= r4) goto Lc2
            wym r1 = r0.c
            apah r4 = defpackage.apah.TRIGGER_TYPE_LAYOUT_EXITED_FOR_REASON
            java.lang.String r1 = r1.c(r4)
            r4 = 0
            r6 = r25
            xey r1 = defpackage.xey.e(r1, r6, r4)
            r2.h(r1)
        Lc2:
            wyu r1 = r0.d
            java.lang.Object r4 = r19.f()
            aowz r4 = (defpackage.aowz) r4
            r6 = 1
            r20 = r1
            r21 = r16
            r22 = r17
            r23 = r18
            r24 = r6
            r25 = r4
            ashd r1 = r20.c(r21, r22, r23, r24, r25)
            amru r8 = r2.g()
            amru r9 = defpackage.amru.q()
            amru r10 = defpackage.amru.q()
            ammv r12 = defpackage.ammv.j(r1)
            amlr r13 = defpackage.amlr.a
            xcp r14 = defpackage.xcp.a(r5)
            r6 = r17
            r7 = r18
            r11 = r19
            xev r1 = defpackage.xev.i(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wyn.l(xgh, java.lang.String, apac, ammv, java.lang.String, com.google.android.libraries.youtube.innertube.model.ads.InstreamAd, java.util.List, apxf, java.util.Map, java.lang.String, xcf):xev");
    }

    private static final String m(aqto aqtoVar) {
        aqts aqtsVar = aqtoVar.b == 138681066 ? (aqts) aqtoVar.c : null;
        if (aqtsVar == null) {
            return null;
        }
        String str = aqtsVar.d == 1 ? (String) aqtsVar.e : null;
        if (str != null) {
            return str;
        }
        whu.l(null, "Ad engagement panel has no panel ID.");
        return null;
    }

    public final xev a(xgh xghVar, String str, apac apacVar, ammv ammvVar, String str2, InstreamAd instreamAd, List list) {
        if (list.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String m = m((aqto) it.next());
            if (TextUtils.isEmpty(m)) {
                whu.l(null, "Missing panel ID for ads engagement panel.");
            }
            arrayList.add(m);
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new xcw(list));
        arrayList2.add(new xdq(arrayList));
        amrp f = amru.f();
        f.h(xfo.e(this.c.c(apah.TRIGGER_TYPE_ON_DIFFERENT_LAYOUT_ID_ENTERED), str2, apae.SLOT_TYPE_PLAYER_BYTES, apac.LAYOUT_TYPE_MEDIA));
        if (instreamAd instanceof InstreamAdImpl) {
            PlayerAd playerAd = ((InstreamAdImpl) instreamAd).b;
            if ((playerAd instanceof LocalVideoAd) && ((LocalVideoAd) playerAd).D()) {
                f.h(xgq.e(this.c.c(apah.TRIGGER_TYPE_SURVEY_SUBMITTED), str));
                return xev.i(str, apacVar, f.g(), amru.q(), amru.q(), ammvVar, ammv.j(this.d.c(xghVar, str, apacVar, 1, (aowz) ammvVar.f())), amlr.a, xcp.a(arrayList2));
            }
        }
        return xev.i(str, apacVar, f.g(), amru.q(), amru.q(), ammvVar, ammv.j(this.d.c(xghVar, str, apacVar, 1, (aowz) ammvVar.f())), amlr.a, xcp.a(arrayList2));
    }

    public final xev b(String str, InstreamAdBreak instreamAdBreak, ForecastingAd forecastingAd) {
        wym wymVar = this.c;
        apac apacVar = apac.LAYOUT_TYPE_FORECASTING;
        String str2 = forecastingAd.m;
        String a = wymVar.a(apacVar, str);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new xdn(forecastingAd));
        if (instreamAdBreak != null) {
            arrayList.add(new xdr(instreamAdBreak));
        }
        return xev.h(a, apac.LAYOUT_TYPE_FORECASTING, amru.r(xfp.e(this.c.c(apah.TRIGGER_TYPE_ON_LAYOUT_SELF_EXIT_REQUESTED), a)), amlr.a, xcp.a(arrayList));
    }

    public final xev c(xgh xghVar, String str, InstreamAd instreamAd, aplf aplfVar, apxf apxfVar, Map map, String str2, xcf xcfVar) {
        aoxb aoxbVar = aplfVar.b;
        if (aoxbVar == null) {
            aoxbVar = aoxb.a;
        }
        String str3 = aoxbVar.b;
        aoxb aoxbVar2 = aplfVar.b;
        if (aoxbVar2 == null) {
            aoxbVar2 = aoxb.a;
        }
        apac b = apac.b(aoxbVar2.c);
        if (b == null) {
            b = apac.LAYOUT_TYPE_UNSPECIFIED;
        }
        apac apacVar = b;
        aoxb aoxbVar3 = aplfVar.b;
        if (aoxbVar3 == null) {
            aoxbVar3 = aoxb.a;
        }
        aowz aowzVar = aoxbVar3.d;
        if (aowzVar == null) {
            aowzVar = aowz.a;
        }
        ammv j = ammv.j(aowzVar);
        aulq aulqVar = aplfVar.c;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        return l(xghVar, str3, apacVar, j, str, instreamAd, ((aowp) aulqVar.pX(AdEngagementPanelsRendererOuterClass.adEngagementPanelsRenderer)).b, apxfVar, map, str2, xcfVar);
    }

    @Deprecated
    public final xev d(xgh xghVar, String str, InstreamAd instreamAd, List list, apxf apxfVar, Map map, String str2, xcf xcfVar) {
        aowz aowzVar = null;
        if (instreamAd instanceof InstreamAdImpl) {
            PlayerAd playerAd = ((InstreamAdImpl) instreamAd).b;
            if (playerAd instanceof LocalVideoAd) {
                aowzVar = ((LocalVideoAd) playerAd).o();
            }
        }
        return l(xghVar, this.c.a(apac.LAYOUT_TYPE_IMMERSIVE, xghVar.a), apac.LAYOUT_TYPE_IMMERSIVE, ammv.i(aowzVar), str, instreamAd, list, apxfVar, map, str2, xcfVar);
    }

    public final xev e(xgh xghVar, apae apaeVar, String str) {
        apac apacVar;
        apae apaeVar2 = apae.SLOT_TYPE_UNSPECIFIED;
        int ordinal = apaeVar.ordinal();
        if (ordinal != 5) {
            if (ordinal == 9) {
                apacVar = apac.LAYOUT_TYPE_AD_MEDIA_CONTROLS_BAR;
            } else if (ordinal == 10) {
                apacVar = apac.LAYOUT_TYPE_AD_MEDIA_CONTROLS_BAR_EXPANDABLE;
            } else {
                String valueOf = String.valueOf(apaeVar.name());
                throw new IllegalArgumentException(valueOf.length() != 0 ? "Illegal slot type for building mdx layout: ".concat(valueOf) : new String("Illegal slot type for building mdx layout: "));
            }
        } else if (!xghVar.e(xdt.class) || !((Boolean) xghVar.d(xdt.class)).booleanValue()) {
            apacVar = apac.LAYOUT_TYPE_MEDIA_LAYOUT_PLAYER_OVERLAY_LIGHTWEIGHT;
        } else {
            apacVar = apac.LAYOUT_TYPE_AD_INFO_OVERLAY;
        }
        String a = this.c.a(apacVar, xghVar.a);
        return xev.h(a, apacVar, amru.r(xfb.e(this.c.c(apah.TRIGGER_TYPE_LAYOUT_ID_EXITED), str)), ammv.j(this.d.c(xghVar, a, apacVar, 1, null)), xcp.b(new xcy[0]));
    }

    public final xev f(xgh xghVar, aoyx aoyxVar) {
        aowz aowzVar;
        if ((aoyxVar.b & 128) != 0) {
            aowzVar = aoyxVar.i;
            if (aowzVar == null) {
                aowzVar = aowz.a;
            }
        } else {
            aowzVar = null;
        }
        String a = this.c.a(apac.LAYOUT_TYPE_ENDCAP, xghVar.a);
        return xev.d(a, apac.LAYOUT_TYPE_ENDCAP, 3, amru.q(), amru.q(), amru.q(), ammv.i(aowzVar), ammv.j(this.d.c(xghVar, a, apac.LAYOUT_TYPE_ENDCAP, 3, aowzVar)), xcp.b(new xcy[0]));
    }

    public final xev g(xgh xghVar, SurveyAd surveyAd) {
        aowz o = surveyAd.o();
        String a = this.c.a(apac.LAYOUT_TYPE_SURVEY, xghVar.a);
        return xev.d(a, apac.LAYOUT_TYPE_SURVEY, 3, amru.q(), amru.q(), amru.q(), ammv.i(o), ammv.j(this.d.c(xghVar, a, apac.LAYOUT_TYPE_SURVEY, 3, o)), xcp.b(new xcy[0]));
    }

    public final amru h(String str, String str2, String str3, InstreamAd instreamAd, xcf xcfVar) {
        amrp f = amru.f();
        f.h(xfo.e(this.c.c(apah.TRIGGER_TYPE_ON_DIFFERENT_LAYOUT_ID_ENTERED), str3, apae.SLOT_TYPE_PLAYER_BYTES, apac.LAYOUT_TYPE_MEDIA));
        if (instreamAd instanceof InstreamAdImpl) {
            InstreamAdImpl instreamAdImpl = (InstreamAdImpl) instreamAd;
            PlayerAd playerAd = instreamAdImpl.b;
            if ((playerAd instanceof LocalVideoAd) && (((LocalVideoAd) playerAd).D() || ((LocalVideoAd) instreamAdImpl.b).C())) {
                f.h(xgq.e(this.c.c(apah.TRIGGER_TYPE_SURVEY_SUBMITTED), str));
            }
        }
        if (xcfVar.c > 1) {
            f.h(xey.e(this.c.c(apah.TRIGGER_TYPE_LAYOUT_EXITED_FOR_REASON), str2, 0));
        }
        return f.g();
    }

    public final List i(InstreamAdBreak instreamAdBreak, List list, List list2, String str) {
        int i;
        String str2;
        ArrayList arrayList;
        List list3;
        int i2;
        int i3;
        int i4;
        ArrayList arrayList2;
        int i5;
        wys wysVar;
        MediaAd mediaAd;
        String str3;
        PlayerAd playerAd;
        amrz c;
        amrz c2;
        auuu auuuVar;
        aoyq aoyqVar;
        List list4 = list2;
        String str4 = str;
        ArrayList arrayList3 = new ArrayList();
        Iterator it = list.iterator();
        char c3 = 0;
        int i6 = 0;
        int i7 = 0;
        while (it.hasNext()) {
            PlayerAd playerAd2 = (PlayerAd) it.next();
            if (playerAd2 instanceof LocalVideoAd) {
                i7++;
                i6 += ((LocalVideoAd) playerAd2).c() * 1000;
            }
        }
        int i8 = 0;
        int i9 = 0;
        while (i8 < list.size()) {
            PlayerAd playerAd3 = (PlayerAd) list.get(i8);
            if (playerAd3 instanceof AdIntro) {
                String str5 = (String) list4.get(i8);
                apac apacVar = apac.LAYOUT_TYPE_MEDIA;
                ammv i10 = ammv.i(playerAd3.o());
                xcy[] xcyVarArr = new xcy[4];
                xcyVarArr[c3] = new xdu((MediaAd) playerAd3);
                xcyVarArr[1] = new xcs(xcf.a);
                xcyVarArr[2] = new xdr(instreamAdBreak);
                xcyVarArr[3] = new xde(str4);
                arrayList3.add(xev.c(str5, apacVar, 2, i10, xcp.b(xcyVarArr)));
                i2 = i8;
                i = i7;
                list3 = list4;
                ArrayList arrayList4 = arrayList3;
                str2 = str4;
                arrayList = arrayList4;
            } else if (playerAd3 instanceof MediaAd) {
                xcf xcfVar = xcf.a;
                if (playerAd3 instanceof LocalVideoAd) {
                    LocalVideoAd localVideoAd = (LocalVideoAd) playerAd3;
                    i6 -= localVideoAd.c() * 1000;
                    int i11 = i9 + 1;
                    boolean z = localVideoAd.b.r;
                    asgk k = localVideoAd.k();
                    if (k == null || (k.b & 16) == 0) {
                        auuuVar = null;
                    } else {
                        aulq aulqVar = k.f;
                        if (aulqVar == null) {
                            aulqVar = aulq.a;
                        }
                        auuuVar = (auuu) ahbj.n(aulqVar, SimpleAdBadgeRendererOuterClass.simpleAdBadgeRenderer);
                    }
                    ammv i12 = ammv.i(auuuVar);
                    asgk k2 = localVideoAd.k();
                    if (k2 == null || (k2.b & 64) == 0) {
                        aoyqVar = null;
                    } else {
                        aulq aulqVar2 = k2.g;
                        if (aulqVar2 == null) {
                            aulqVar2 = aulq.a;
                        }
                        aoyqVar = (aoyq) ahbj.n(aulqVar2, aoyt.a);
                    }
                    i9 = i11;
                    xcfVar = xcf.a(i9, i7, i6, z, i12, ammv.i(aoyqVar));
                }
                String str6 = (String) list4.get(i8);
                apac apacVar2 = apac.LAYOUT_TYPE_MEDIA;
                wys wysVar2 = this.b;
                MediaAd mediaAd2 = (MediaAd) playerAd3;
                String str7 = (String) list4.get(i8);
                if (wbs.y(wysVar2.a)) {
                    amrw h = amrz.h();
                    if (mediaAd2.S().isEmpty() && mediaAd2.Z().isEmpty()) {
                        i3 = i6;
                        i4 = i9;
                        i = i7;
                    } else {
                        i3 = i6;
                        i4 = i9;
                        i = i7;
                        xfj xfjVar = new xfj(wysVar2.b.c(apah.TRIGGER_TYPE_MEDIA_PLAYBACK_STARTED), apah.TRIGGER_TYPE_MEDIA_PLAYBACK_STARTED, false, mediaAd2.m);
                        amrp f = amru.f();
                        f.j(mediaAd2.S());
                        f.j(mediaAd2.Z());
                        h.g(xfjVar, f.g());
                    }
                    if (!mediaAd2.ab().isEmpty() || !mediaAd2.ac().isEmpty()) {
                        xfj xfjVar2 = new xfj(wysVar2.b.c(apah.TRIGGER_TYPE_MEDIA_PLAYBACK_STARTED), apah.TRIGGER_TYPE_MEDIA_PLAYBACK_STARTED, true, mediaAd2.m);
                        amrp f2 = amru.f();
                        f2.j(mediaAd2.ab());
                        f2.j(mediaAd2.ac());
                        h.g(xfjVar2, f2.g());
                    }
                    if (!mediaAd2.P().isEmpty()) {
                        h.g(new xcn(wysVar2.b.c(apah.TRIGGER_TYPE_ON_MEDIA_PLAYBACK_ERROR), apah.TRIGGER_TYPE_ON_MEDIA_PLAYBACK_ERROR, mediaAd2.m), mediaAd2.P());
                    }
                    if (!mediaAd2.V().isEmpty()) {
                        h.g(new xfi(wysVar2.b.c(apah.TRIGGER_TYPE_MEDIA_PAUSED), apah.TRIGGER_TYPE_MEDIA_PAUSED, mediaAd2.m), mediaAd2.V());
                    }
                    if (!mediaAd2.X().isEmpty()) {
                        h.g(new xfk(wysVar2.b.c(apah.TRIGGER_TYPE_MEDIA_RESUMED), apah.TRIGGER_TYPE_MEDIA_RESUMED, mediaAd2.m), mediaAd2.X());
                    }
                    if (!mediaAd2.Y().isEmpty()) {
                        h.g(xgg.e(wysVar2.b.c(apah.TRIGGER_TYPE_SKIP_REQUESTED), str7), mediaAd2.Y());
                    }
                    if (!mediaAd2.M().isEmpty()) {
                        h.g(new xem(wysVar2.b.c(apah.TRIGGER_TYPE_CLOSE_REQUESTED), apah.TRIGGER_TYPE_CLOSE_REQUESTED, mediaAd2.m), mediaAd2.M());
                    }
                    if (!mediaAd2.L().isEmpty()) {
                        h.g(new xha(wysVar2.b.c(apah.TRIGGER_TYPE_VISIT_ADVERTISER_LINK_CLICKED), apah.TRIGGER_TYPE_VISIT_ADVERTISER_LINK_CLICKED, str7), mediaAd2.L());
                    }
                    if (!mediaAd2.R().isEmpty()) {
                        h.g(new xff(wysVar2.b.c(apah.TRIGGER_TYPE_MEDIA_FULLSCREEN_ENTERED), apah.TRIGGER_TYPE_MEDIA_FULLSCREEN_ENTERED, mediaAd2.m), mediaAd2.R());
                    }
                    if (!mediaAd2.O().isEmpty()) {
                        h.g(new xfg(wysVar2.b.c(apah.TRIGGER_TYPE_MEDIA_FULLSCREEN_EXITED), apah.TRIGGER_TYPE_MEDIA_FULLSCREEN_EXITED, mediaAd2.m), mediaAd2.O());
                    }
                    if (!mediaAd2.H().isEmpty()) {
                        h.g(new xfh(wysVar2.b.c(apah.TRIGGER_TYPE_MEDIA_NON_TERMINAL_ABANDONED), apah.TRIGGER_TYPE_MEDIA_NON_TERMINAL_ABANDONED, mediaAd2.m), mediaAd2.H());
                        h.g(xey.e(wysVar2.b.c(apah.TRIGGER_TYPE_LAYOUT_EXITED_FOR_REASON), str7, 4), mediaAd2.H());
                    }
                    if (!mediaAd2.K().isEmpty()) {
                        h.g(xcd.a(wysVar2.b.c(apah.TRIGGER_TYPE_ACTIVE_VIEW_VIEWABLE_CRITERIA_SATISFIED), str7), mediaAd2.K());
                    }
                    if (!mediaAd2.J().isEmpty()) {
                        h.g(xbz.a(wysVar2.b.c(apah.TRIGGER_TYPE_ACTIVE_VIEW_MEASURABLE_CRITERIA_SATISFIED), str7), mediaAd2.J());
                    }
                    if (!mediaAd2.I().isEmpty()) {
                        h.g(xby.a(wysVar2.b.c(apah.TRIGGER_TYPE_ACTIVE_VIEW_GROUPM_VIEWABLE_CRITERIA_SATISFIED), str7), mediaAd2.I());
                    }
                    PlayerAd playerAd4 = playerAd3;
                    if (mediaAd2.Q().isEmpty()) {
                        arrayList2 = arrayList3;
                        i5 = i8;
                    } else {
                        arrayList2 = arrayList3;
                        i5 = i8;
                        h.g(xfl.a(wysVar2.b.c(apah.TRIGGER_TYPE_MEDIA_TIME_RANGE), mediaAd2.m, new xgu(wys.a(mediaAd2, 1), 9223372036854775806L), true, false, true, true), mediaAd2.Q());
                    }
                    if (!mediaAd2.U().isEmpty()) {
                        h.g(xfl.a(wysVar2.b.c(apah.TRIGGER_TYPE_MEDIA_TIME_RANGE), mediaAd2.m, new xgu(wys.a(mediaAd2, 2), 9223372036854775806L), true, false, true, true), mediaAd2.U());
                    }
                    if (mediaAd2.aa().isEmpty()) {
                        wysVar = wysVar2;
                    } else {
                        wysVar = wysVar2;
                        h.g(xfl.a(wysVar2.b.c(apah.TRIGGER_TYPE_MEDIA_TIME_RANGE), mediaAd2.m, new xgu(wys.a(mediaAd2, 3), 9223372036854775806L), true, false, true, true), mediaAd2.aa());
                    }
                    if (!mediaAd2.N().isEmpty()) {
                        h.g(xey.e(wysVar.b.c(apah.TRIGGER_TYPE_LAYOUT_EXITED_FOR_REASON), str7, 0), mediaAd2.N());
                    }
                    if (!mediaAd2.T().isEmpty() && mediaAd2.i() == null) {
                        h.g(xey.e(wysVar.b.c(apah.TRIGGER_TYPE_LAYOUT_EXITED_FOR_REASON), str7, 0), mediaAd2.T());
                    }
                    List W = mediaAd2.W();
                    long millis = TimeUnit.SECONDS.toMillis(mediaAd2.c());
                    String str8 = mediaAd2.m;
                    if (W.isEmpty()) {
                        c = amvo.b;
                        mediaAd = mediaAd2;
                        playerAd = playerAd4;
                    } else {
                        PriorityQueue priorityQueue = new PriorityQueue(W.size(), unt.e);
                        ArrayList arrayList5 = new ArrayList();
                        Iterator it2 = W.iterator();
                        while (it2.hasNext()) {
                            aoye aoyeVar = (aoye) it2.next();
                            Iterator it3 = it2;
                            if (aoyeVar.d >= millis) {
                                arrayList5.add(aoyeVar);
                            } else {
                                priorityQueue.add(aoyeVar);
                            }
                            it2 = it3;
                        }
                        amrw h2 = amrz.h();
                        if (priorityQueue.isEmpty()) {
                            mediaAd = mediaAd2;
                            str3 = str7;
                            playerAd = playerAd4;
                        } else {
                            int i13 = ((aoye) priorityQueue.peek()).d;
                            amrp amrpVar = new amrp();
                            while (!priorityQueue.isEmpty()) {
                                if (((aoye) priorityQueue.peek()).d == i13) {
                                    amrpVar.h((aoye) priorityQueue.poll());
                                } else {
                                    h2.g(xfl.a(wysVar.b.c(apah.TRIGGER_TYPE_MEDIA_TIME_RANGE), str8, new xgu(i13, 9223372036854775806L), true, true, true, false), amrpVar.g());
                                    i13 = ((aoye) priorityQueue.peek()).d;
                                    amrpVar = new amrp();
                                    mediaAd2 = mediaAd2;
                                    playerAd4 = playerAd4;
                                    str7 = str7;
                                }
                            }
                            mediaAd = mediaAd2;
                            str3 = str7;
                            playerAd = playerAd4;
                            h2.g(xfl.a(wysVar.b.c(apah.TRIGGER_TYPE_MEDIA_TIME_RANGE), str8, new xgu(i13, 9223372036854775806L), true, true, true, false), amrpVar.g());
                        }
                        if (!arrayList5.isEmpty()) {
                            h2.g(xey.e(wysVar.b.c(apah.TRIGGER_TYPE_LAYOUT_EXITED_FOR_REASON), str3, 0), arrayList5);
                        }
                        c = h2.c();
                    }
                    h.i(c);
                    c2 = h.c();
                } else {
                    arrayList2 = arrayList3;
                    i5 = i8;
                    c2 = amvo.b;
                    i3 = i6;
                    i4 = i9;
                    i = i7;
                    playerAd = playerAd3;
                    mediaAd = mediaAd2;
                }
                str2 = str;
                arrayList = arrayList2;
                arrayList.add(new xev(str6, apacVar2, 2, amru.q(), amru.q(), amru.q(), c2, ammv.i(playerAd.o()), amlr.a, amlr.a, xcp.b(new xdu(mediaAd), new xcs(xcfVar), new xdr(instreamAdBreak), new xde(str2), new xdm(Long.valueOf(playerAd.n)))));
                list3 = list2;
                i6 = i3;
                i9 = i4;
                i2 = i5;
            } else {
                int i14 = i8;
                i = i7;
                ArrayList arrayList6 = arrayList3;
                str2 = str4;
                arrayList = arrayList6;
                if (playerAd3 instanceof MediaBreakAd) {
                    list3 = list2;
                    i2 = i14;
                    arrayList.add(xev.c((String) list3.get(i2), apac.LAYOUT_TYPE_MEDIA_BREAK, 2, ammv.i(playerAd3.o()), xcp.b(new xdv((MediaBreakAd) playerAd3), new xcs(xcf.a), new xdr(instreamAdBreak), new xdm(Long.valueOf(playerAd3.n)))));
                } else {
                    String valueOf = String.valueOf(playerAd3);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
                    sb.append("Unexpected playerAd type: ");
                    sb.append(valueOf);
                    throw new IllegalStateException(sb.toString());
                }
            }
            int i15 = i2 + 1;
            i7 = i;
            c3 = 0;
            List list5 = list3;
            i8 = i15;
            list4 = list5;
            String str9 = str2;
            arrayList3 = arrayList;
            str4 = str9;
        }
        return arrayList3;
    }

    public final xev j(xgh xghVar, aple apleVar, amru amruVar, amru amruVar2, amru amruVar3) {
        aoxb aoxbVar = apleVar.b;
        if (aoxbVar == null) {
            aoxbVar = aoxb.a;
        }
        String str = aoxbVar.b;
        aoxb aoxbVar2 = apleVar.b;
        if (aoxbVar2 == null) {
            aoxbVar2 = aoxb.a;
        }
        apac b = apac.b(aoxbVar2.c);
        if (b == null) {
            b = apac.LAYOUT_TYPE_UNSPECIFIED;
        }
        apac apacVar = b;
        wyu wyuVar = this.d;
        aoxb aoxbVar3 = apleVar.b;
        if (aoxbVar3 == null) {
            aoxbVar3 = aoxb.a;
        }
        aowz aowzVar = aoxbVar3.d;
        if (aowzVar == null) {
            aowzVar = aowz.a;
        }
        ashd c = wyuVar.c(xghVar, str, apacVar, 1, aowzVar);
        aoxb aoxbVar4 = apleVar.b;
        if (aoxbVar4 == null) {
            aoxbVar4 = aoxb.a;
        }
        aowz aowzVar2 = aoxbVar4.d;
        if (aowzVar2 == null) {
            aowzVar2 = aowz.a;
        }
        ammv j = ammv.j(aowzVar2);
        ammv j2 = ammv.j(c);
        xcy[] xcyVarArr = new xcy[1];
        aulq aulqVar = apleVar.c;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        xcyVarArr[0] = new xdl((aqrf) aulqVar.pX(ElementRendererOuterClass.elementRenderer));
        return xev.d(str, apacVar, 1, amruVar, amruVar2, amruVar3, j, j2, xcp.a(Arrays.asList(xcyVarArr)));
    }

    public final xev k(String str, InstreamAdBreak instreamAdBreak, List list) {
        if (!list.isEmpty()) {
            if (list.get(0) instanceof ForecastingAd) {
                return b(str, instreamAdBreak, (ForecastingAd) list.get(0));
            }
            if (list.get(0) instanceof ThrottledAd) {
                return xev.b(this.e.x(), apac.LAYOUT_TYPE_UNSPECIFIED, 1, xcp.b(new xed((ThrottledAd) list.get(0))));
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PlayerAd playerAd = (PlayerAd) it.next();
            if (playerAd instanceof MediaAd) {
                wym wymVar = this.c;
                apac apacVar = apac.LAYOUT_TYPE_MEDIA;
                String str2 = playerAd.m;
                arrayList.add(wymVar.a(apacVar, str));
            } else if (playerAd instanceof MediaBreakAd) {
                wym wymVar2 = this.c;
                apac apacVar2 = apac.LAYOUT_TYPE_MEDIA_BREAK;
                String str3 = playerAd.m;
                arrayList.add(wymVar2.a(apacVar2, str));
            } else {
                String valueOf = String.valueOf(playerAd);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
                sb.append("Unexpected playerAd type: ");
                sb.append(valueOf);
                throw new IllegalStateException(sb.toString());
            }
        }
        String a = this.c.a(apac.LAYOUT_TYPE_COMPOSITE_PLAYER_BYTES, str);
        List<xev> i = i(instreamAdBreak, list, arrayList, a);
        if (i.isEmpty()) {
            return null;
        }
        amrp f = amru.f();
        amrp f2 = amru.f();
        amrp f3 = amru.f();
        for (xev xevVar : i) {
            if (xevVar.f(xdu.class)) {
                MediaAd mediaAd = (MediaAd) xevVar.e(xdu.class);
                if (mediaAd.ae() && !PlayerAd.af(mediaAd.qB())) {
                    f2.h(xgg.e(this.c.c(apah.TRIGGER_TYPE_SKIP_REQUESTED), xevVar.a));
                }
                boolean z = mediaAd instanceof LocalVideoAd;
                if (z) {
                    f3.h(xgg.e(this.c.c(apah.TRIGGER_TYPE_SKIP_REQUESTED), xevVar.a));
                }
                if (z && ((LocalVideoAd) mediaAd).D()) {
                    f2.h(xgq.e(this.c.c(apah.TRIGGER_TYPE_SURVEY_SUBMITTED), a));
                }
                if (z && ((LocalVideoAd) mediaAd).b.q) {
                    f2.h(xey.e(this.c.c(apah.TRIGGER_TYPE_LAYOUT_EXITED_FOR_REASON), xevVar.a, 1));
                }
            } else if (xevVar.f(xdv.class) && !PlayerAd.af(((MediaBreakAd) xevVar.e(xdv.class)).qB())) {
                f2.h(xfp.e(this.c.c(apah.TRIGGER_TYPE_ON_LAYOUT_SELF_EXIT_REQUESTED), xevVar.a));
            }
        }
        f.h(xfp.e(this.c.c(apah.TRIGGER_TYPE_ON_LAYOUT_SELF_EXIT_REQUESTED), a));
        return xev.d(a, apac.LAYOUT_TYPE_COMPOSITE_PLAYER_BYTES, 1, f.g(), f2.g(), f3.g(), amlr.a, amlr.a, xcp.b(new xdr(instreamAdBreak), new xec(i)));
    }
}
