package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.ads.model.InstreamAdBreak;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class wwk implements woj, wof {
    public final azrw a;
    public final azrw b;
    public final azrw c;
    public final azrw d;
    public final azrw e;
    public final azrw f;
    public aigf i;
    private final azrw j;
    private final azrw k;
    private final azrw l;
    private final azrw m;
    public volatile wwj g = null;
    public AbstractMap.SimpleEntry h = null;
    private aign n = aign.NEW;
    private String o = "";
    private boolean p = false;

    public wwk(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8, azrw azrwVar9, azrw azrwVar10) {
        this.a = azrwVar;
        this.j = azrwVar2;
        this.b = azrwVar3;
        this.c = azrwVar4;
        this.d = azrwVar5;
        this.k = azrwVar6;
        this.e = azrwVar7;
        this.l = azrwVar8;
        this.f = azrwVar9;
        this.m = azrwVar10;
    }

    public static aqxo j(InstreamAdBreak instreamAdBreak) {
        for (aowd aowdVar : instreamAdBreak.c.b()) {
            if ((aowdVar.b & 2) != 0) {
                aqxo aqxoVar = aowdVar.d;
                return aqxoVar == null ? aqxo.a : aqxoVar;
            }
        }
        return null;
    }

    public static avwa k(PlayerResponseModel playerResponseModel) {
        Iterator it = playerResponseModel.z().iterator();
        while (it.hasNext()) {
            for (aowd aowdVar : ((aowc) it.next()).c) {
                if ((aowdVar.b & 64) != 0) {
                    avwa avwaVar = aowdVar.g;
                    return avwaVar == null ? avwa.a : avwaVar;
                }
            }
        }
        return null;
    }

    public void f(aign aignVar, final PlayerResponseModel playerResponseModel, final aixh aixhVar, final String str, String str2) {
        this.n = aignVar;
        aign aignVar2 = aign.NEW;
        int ordinal = aignVar.ordinal();
        aoyk aoykVar = null;
        if (ordinal == 0) {
            this.o = null;
            this.p = false;
            return;
        }
        if (ordinal != 2) {
            if (ordinal == 8 && !TextUtils.isEmpty(this.o) && TextUtils.equals(str, this.o)) {
                if (!this.p) {
                    aixm d = aixhVar.d();
                    if (d != null) {
                        d.p((wvz) this.l.get());
                        d.o((wvz) this.l.get());
                    }
                    ((ajoy) this.j.get()).w(7, xeo.a(str, playerResponseModel), new wwc() { // from class: wwi
                        @Override // defpackage.wwc
                        public final List a() {
                            List list;
                            ArrayList arrayList;
                            int i;
                            wwk wwkVar;
                            long millis;
                            aqxo j;
                            wwk wwkVar2 = wwk.this;
                            PlayerResponseModel playerResponseModel2 = playerResponseModel;
                            aixh aixhVar2 = aixhVar;
                            String str3 = str;
                            if (!playerResponseModel2.B()) {
                                for (aowc aowcVar : playerResponseModel2.z()) {
                                    aign aignVar3 = aign.NEW;
                                    int bY = amkq.bY(aowcVar.d);
                                    if (bY == 0) {
                                        bY = 1;
                                    }
                                    int i2 = bY - 1;
                                    if (i2 == 1 || i2 == 2 || i2 == 3) {
                                        AbstractMap.SimpleEntry simpleEntry = wwkVar2.h;
                                        List list2 = (simpleEntry == null || !TextUtils.equals((CharSequence) simpleEntry.getKey(), str3)) ? null : (List) wwkVar2.h.getValue();
                                        wwkVar2.h = null;
                                        if (list2 == null || list2.isEmpty()) {
                                            whu.l(null, "Non-preroll adBreaks failed to be cached");
                                            list2 = ((wyq) wwkVar2.b.get()).a(playerResponseModel2);
                                        }
                                        if (list2 != null && !list2.isEmpty()) {
                                            list = list2;
                                            if (list == null && !list.isEmpty()) {
                                                ArrayList arrayList2 = new ArrayList();
                                                if (list.isEmpty() || ((InstreamAdBreak) list.get(0)).b() != xfn.PRE_ROLL || (j = wwk.j((InstreamAdBreak) list.get(0))) == null) {
                                                    arrayList = arrayList2;
                                                } else {
                                                    wyt wytVar = (wyt) wwkVar2.d.get();
                                                    InstreamAdBreak instreamAdBreak = (InstreamAdBreak) list.get(0);
                                                    arrayList = arrayList2;
                                                    arrayList.add(wytVar.a(j, str3, aixhVar2, playerResponseModel2, instreamAdBreak, new xgu(wyt.e(instreamAdBreak), wyt.e(null)), null));
                                                }
                                                if (list.isEmpty()) {
                                                    return arrayList;
                                                }
                                                if (list.size() == 1) {
                                                    i = 0;
                                                    if (((InstreamAdBreak) list.get(0)).b() == xfn.PRE_ROLL) {
                                                        return arrayList;
                                                    }
                                                } else {
                                                    i = 0;
                                                }
                                                int i3 = ((InstreamAdBreak) list.get(i)).b() == xfn.PRE_ROLL ? 1 : 0;
                                                while (i3 < list.size()) {
                                                    wyt wytVar2 = (wyt) wwkVar2.d.get();
                                                    InstreamAdBreak instreamAdBreak2 = (InstreamAdBreak) list.get(i3);
                                                    InstreamAdBreak instreamAdBreak3 = i3 == list.size() + (-1) ? null : (InstreamAdBreak) list.get(i3 + 1);
                                                    String b = wytVar2.b.b(apae.SLOT_TYPE_PLAYER_BYTES);
                                                    List d2 = wyt.d(str3, aixhVar2, playerResponseModel2, instreamAdBreak2.b());
                                                    d2.add(new xdr(instreamAdBreak2));
                                                    long e = wyt.e(instreamAdBreak2);
                                                    if (instreamAdBreak2.b() == xfn.MID_ROLL) {
                                                        wwkVar = wwkVar2;
                                                        millis = e;
                                                    } else {
                                                        wwkVar = wwkVar2;
                                                        millis = TimeUnit.SECONDS.toMillis(playerResponseModel2.a());
                                                    }
                                                    PlayerResponseModel playerResponseModel3 = playerResponseModel2;
                                                    aixh aixhVar3 = aixhVar2;
                                                    xgu xguVar = new xgu(Math.max(0L, millis - wytVar2.a.g), millis);
                                                    Object a = xfl.a(wytVar2.b.c(apah.TRIGGER_TYPE_MEDIA_TIME_RANGE), str3, new xgu(e, wyt.e(instreamAdBreak3)), false, true, false, false);
                                                    xer xerVar = new xer(wytVar2.b.c(apah.TRIGGER_TYPE_IN_MEDIA_TIME_RANGE_AND_SLOT_FULFILLED_NON_EMPTY), apah.TRIGGER_TYPE_IN_MEDIA_TIME_RANGE_AND_SLOT_FULFILLED_NON_EMPTY, str3, new xgu(e, wyt.e(instreamAdBreak3)));
                                                    apae apaeVar = apae.SLOT_TYPE_PLAYER_BYTES;
                                                    if (instreamAdBreak2.b() != xfn.MID_ROLL) {
                                                        a = xen.a(wytVar2.b.c(apah.TRIGGER_TYPE_CONTENT_VIDEO_ID_ENDED), str3, true);
                                                    } else if (wbs.r(wytVar2.c)) {
                                                        a = xerVar;
                                                    }
                                                    arrayList.add(xgh.j(b, apaeVar, amru.r(a), wbs.r(wytVar2.c) ? amru.r(xfl.a(wytVar2.b.c(apah.TRIGGER_TYPE_MEDIA_TIME_RANGE), str3, xguVar, false, false, false, false)) : amru.s(xfl.a(wytVar2.b.c(apah.TRIGGER_TYPE_MEDIA_TIME_RANGE), str3, xguVar, false, false, false, false), new xgj(wytVar2.b.c(apah.TRIGGER_TYPE_SLOT_ID_ENTER_REQUESTED), apah.TRIGGER_TYPE_SLOT_ID_ENTER_REQUESTED, b)), amru.t(xft.a(wytVar2.b.c(apah.TRIGGER_TYPE_ON_SLOT_CANCELLATION_REQUESTED), b), xgl.a(wytVar2.b.c(apah.TRIGGER_TYPE_SLOT_ID_EXITED), b), xfs.e(wytVar2.b.c(apah.TRIGGER_TYPE_ON_NEW_PLAYBACK_AFTER_CONTENT_VIDEO_ID), str3)), xcp.a(d2)));
                                                    i3++;
                                                    wwkVar2 = wwkVar;
                                                    playerResponseModel2 = playerResponseModel3;
                                                    aixhVar2 = aixhVar3;
                                                }
                                                return arrayList;
                                            }
                                        }
                                        whu.l(null, "Failed to directly build instreamAdBreaks even after caching fallback");
                                    }
                                }
                            }
                            list = null;
                            return list == null ? null : null;
                        }
                    });
                }
                this.p = true;
                return;
            }
            return;
        }
        if (TextUtils.isEmpty(str) || TextUtils.equals(this.o, str)) {
            return;
        }
        this.o = str;
        this.p = false;
        xcl xclVar = (xcl) this.m.get();
        aryr aryrVar = playerResponseModel.a;
        if ((aryrVar.b & 2) != 0) {
            atyi atyiVar = aryrVar.e;
            if (atyiVar == null) {
                atyiVar = atyi.a;
            }
            aoykVar = atyiVar.i;
            if (aoykVar == null) {
                aoykVar = aoyk.a;
            }
        }
        xclVar.a(aoykVar);
        ((ajoy) this.j.get()).w(2, xeo.a(str, playerResponseModel), new wwc() { // from class: wwh
            @Override // defpackage.wwc
            public final List a() {
                List a;
                String b;
                wwk wwkVar = wwk.this;
                PlayerResponseModel playerResponseModel2 = playerResponseModel;
                aixh aixhVar2 = aixhVar;
                String str3 = str;
                ArrayList arrayList = new ArrayList();
                if (wwk.k(playerResponseModel2) != null) {
                    if (wwk.k(playerResponseModel2) != null) {
                        avwa k = wwk.k(playerResponseModel2);
                        wyt wytVar = (wyt) wwkVar.d.get();
                        String b2 = wytVar.b.b(apae.SLOT_TYPE_PLAYBACK_TRACKING);
                        arrayList.add(xgh.j(b2, apae.SLOT_TYPE_PLAYBACK_TRACKING, amru.r(xco.a(wytVar.b.c(apah.TRIGGER_TYPE_BEFORE_CONTENT_VIDEO_ID_STARTED), str3)), amru.r(xgk.a(wytVar.b.c(apah.TRIGGER_TYPE_SLOT_ID_ENTERED), b2)), amru.r(xgl.a(wytVar.b.c(apah.TRIGGER_TYPE_SLOT_ID_EXITED), b2)), xcp.b(new xdf(str3), new xdg(playerResponseModel2), new xei(k))));
                        if (wwkVar.i != aigf.INLINE_IN_FEED) {
                            aryr aryrVar2 = playerResponseModel2.a;
                            if ((aryrVar2.b & 16777216) != 0) {
                                wyt wytVar2 = (wyt) wwkVar.d.get();
                                atyh atyhVar = aryrVar2.A;
                                if (atyhVar == null) {
                                    atyhVar = atyh.a;
                                }
                                String b3 = wytVar2.b.b(apae.SLOT_TYPE_BELOW_PLAYER);
                                arrayList.add(xgh.j(b3, apae.SLOT_TYPE_BELOW_PLAYER, amru.r(xco.a(wytVar2.b.c(apah.TRIGGER_TYPE_BEFORE_CONTENT_VIDEO_ID_STARTED), str3)), amru.r(xgk.a(wytVar2.b.c(apah.TRIGGER_TYPE_SLOT_ID_ENTERED), b3)), amru.s(xfs.a(wytVar2.b.c(apah.TRIGGER_TYPE_ON_NEW_PLAYBACK_AFTER_CONTENT_VIDEO_ID), str3), xgl.a(wytVar2.b.c(apah.TRIGGER_TYPE_SLOT_ID_EXITED), b3)), xcp.b(new xdg(playerResponseModel2), new xdx(atyhVar))));
                            }
                        }
                    }
                } else {
                    wwj wwjVar = wwkVar.g;
                    wwkVar.g = null;
                    if (wwjVar != null && wwjVar.b && !((aigv) wwkVar.e.get()).i()) {
                        wwjVar = null;
                    }
                    if ((playerResponseModel2.B() || !playerResponseModel2.z().isEmpty()) && !playerResponseModel2.d.d("PREROLL_SHOWN")) {
                        wpp wppVar = (wpp) wwkVar.f.get();
                        wppVar.a.d(new xbk());
                        zih zihVar = wppVar.b;
                        if (zihVar != null && zihVar.a() != null) {
                            acsx acsxVar = (acsx) wppVar.b.a();
                            aone createBuilder = asmb.a.createBuilder();
                            createBuilder.copyOnWrite();
                            asmb asmbVar = (asmb) createBuilder.instance;
                            asmbVar.b |= 32768;
                            asmbVar.m = true;
                            acsxVar.a((asmb) createBuilder.build());
                            ((acsx) wppVar.b.a()).c("ad_i");
                        }
                        if (playerResponseModel2.B()) {
                            wyt wytVar3 = (wyt) wwkVar.d.get();
                            String b4 = wytVar3.b.b(apae.SLOT_TYPE_PLAYER_BYTES);
                            arrayList.add(xgh.j(b4, apae.SLOT_TYPE_PLAYER_BYTES, amru.r(xgn.a(wytVar3.b.c(apah.TRIGGER_TYPE_SLOT_ID_SCHEDULED), b4)), amru.r(xgn.a(wytVar3.b.c(apah.TRIGGER_TYPE_SLOT_ID_SCHEDULED), b4)), amru.t(xft.a(wytVar3.b.c(apah.TRIGGER_TYPE_ON_SLOT_CANCELLATION_REQUESTED), b4), xgl.a(wytVar3.b.c(apah.TRIGGER_TYPE_SLOT_ID_EXITED), b4), xfs.e(wytVar3.b.c(apah.TRIGGER_TYPE_ON_NEW_PLAYBACK_AFTER_CONTENT_VIDEO_ID), str3)), xcp.a(wyt.d(str3, aixhVar2, playerResponseModel2, xfn.PRE_ROLL))));
                        } else {
                            if (wwjVar != null) {
                                a = wwjVar.c;
                            } else {
                                a = ((wyq) wwkVar.b.get()).a(playerResponseModel2);
                            }
                            wwkVar.h = new AbstractMap.SimpleEntry(str3, a);
                            if (!a.isEmpty() && ((InstreamAdBreak) a.get(0)).b() == xfn.PRE_ROLL && wwk.j((InstreamAdBreak) a.get(0)) == null) {
                                wyt wytVar4 = (wyt) wwkVar.d.get();
                                if (wwjVar != null) {
                                    b = wwjVar.d;
                                } else {
                                    b = ((wym) wwkVar.c.get()).b(apae.SLOT_TYPE_PLAYER_BYTES);
                                }
                                String str4 = b;
                                InstreamAdBreak instreamAdBreak = (InstreamAdBreak) a.get(0);
                                xev xevVar = wwjVar != null ? wwjVar.e : null;
                                List d2 = wyt.d(str3, aixhVar2, playerResponseModel2, instreamAdBreak.b());
                                d2.add(new xdr(instreamAdBreak));
                                if (xevVar != null) {
                                    d2.add(new xdz(xevVar));
                                }
                                arrayList.add(xgh.j(str4, apae.SLOT_TYPE_PLAYER_BYTES, amru.r(xgn.a(wytVar4.b.c(apah.TRIGGER_TYPE_SLOT_ID_SCHEDULED), str4)), amru.r(xgn.a(wytVar4.b.c(apah.TRIGGER_TYPE_SLOT_ID_SCHEDULED), str4)), amru.t(xft.a(wytVar4.b.c(apah.TRIGGER_TYPE_ON_SLOT_CANCELLATION_REQUESTED), str4), xgl.a(wytVar4.b.c(apah.TRIGGER_TYPE_SLOT_ID_EXITED), str4), xfs.e(wytVar4.b.c(apah.TRIGGER_TYPE_ON_NEW_PLAYBACK_AFTER_CONTENT_VIDEO_ID), str3)), xcp.a(d2)));
                            }
                        }
                    }
                }
                return arrayList;
            }
        });
    }

    @Override // defpackage.wof
    public final /* synthetic */ void h(int i, String str) {
    }

    @Override // defpackage.woj
    public void i(PlayerResponseModel playerResponseModel) {
        aowc l;
        wwj wwjVar = this.g;
        if (wwjVar != null && TextUtils.equals(playerResponseModel.y(), wwjVar.a) && wwjVar.b) {
            return;
        }
        this.g = null;
        if (playerResponseModel.B() || (l = playerResponseModel.l()) == null || l.c.size() == 0) {
            return;
        }
        Iterator it = l.c.iterator();
        while (it.hasNext()) {
            if ((((aowd) it.next()).b & 2) != 0) {
                return;
            }
        }
        List a = ((wyq) this.b.get()).a(playerResponseModel);
        if (a.isEmpty() || ((InstreamAdBreak) a.get(0)).b() != xfn.PRE_ROLL) {
            this.g = new wwj(playerResponseModel.y(), this.n, a, null, null);
            return;
        }
        InstreamAdBreak instreamAdBreak = (InstreamAdBreak) a.get(0);
        List b = ((wyq) this.b.get()).b(instreamAdBreak, instreamAdBreak.c(), playerResponseModel);
        String b2 = ((wym) this.c.get()).b(apae.SLOT_TYPE_PLAYER_BYTES);
        xev k = ((wyn) this.k.get()).k(b2, (InstreamAdBreak) a.get(0), b);
        if (k == null || k.b != apac.LAYOUT_TYPE_COMPOSITE_PLAYER_BYTES) {
            int size = b.size();
            String valueOf = String.valueOf(k);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 106);
            sb.append("Bootstrapped layout construction resulted in non PlayerBytesLayout. PlayerAds count: ");
            sb.append(size);
            sb.append(", layout: ");
            sb.append(valueOf);
            whu.l(null, sb.toString());
            return;
        }
        this.g = new wwj(playerResponseModel.y(), this.n, a, b2, k);
    }

    @Override // defpackage.wof
    public final /* synthetic */ void qp(afih afihVar) {
    }

    @Override // defpackage.wof
    public final /* synthetic */ void qq(String str) {
    }

    @Override // defpackage.wof
    public final void qr(aigf aigfVar, aigf aigfVar2, int i, int i2, boolean z, boolean z2) {
        this.i = aigfVar;
    }

    @Override // defpackage.wof
    public final /* synthetic */ void qs(String str, long j, long j2, long j3, boolean z) {
    }

    @Override // defpackage.wof
    public final /* synthetic */ void qw(String str, int i) {
    }

    @Override // defpackage.wof
    public final /* synthetic */ void qy(ahcm ahcmVar) {
    }
}
