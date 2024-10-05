package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.ads.model.InstreamAdImpl;
import com.google.android.libraries.youtube.ads.model.LocalVideoAd;
import com.google.android.libraries.youtube.ads.model.MediaAd;
import com.google.android.libraries.youtube.ads.model.RemoteVideoAd;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wwb implements wwp, wwq {
    public final wnz a;
    public final azrw b;
    public final azrw c;
    public final amsx d;
    public String e = "";
    public final azrw f;
    public final aaea g;
    public final aadw h;
    private final azrw i;

    public wwb(azrw azrwVar, wnz wnzVar, azrw azrwVar2, azrw azrwVar3, amsx amsxVar, aaea aaeaVar, aadw aadwVar, azrw azrwVar4) {
        this.i = azrwVar;
        this.a = wnzVar;
        this.b = azrwVar2;
        this.c = azrwVar3;
        this.d = amsxVar;
        this.f = azrwVar4;
        this.g = aaeaVar;
        this.h = aadwVar;
    }

    public final void a(List list, xgh xghVar, xev xevVar, MediaAd mediaAd, anhy anhyVar) {
        xcf xcfVar;
        if (this.d.contains(apae.SLOT_TYPE_BELOW_PLAYER_IMMERSIVE) && xghVar.h(apae.SLOT_TYPE_PLAYER_BYTES, xdf.class, xdg.class) && xevVar.g(apac.LAYOUT_TYPE_MEDIA, xde.class)) {
            if (xevVar.k.d(xcs.class)) {
                xcfVar = (xcf) xevVar.e(xcs.class);
            } else {
                xcfVar = xcf.a;
            }
            wyt wytVar = (wyt) this.c.get();
            String str = (String) xghVar.d(xdf.class);
            PlayerResponseModel playerResponseModel = (PlayerResponseModel) xghVar.d(xdg.class);
            String str2 = (String) xevVar.e(xde.class);
            String b = wytVar.b.b(apae.SLOT_TYPE_BELOW_PLAYER_IMMERSIVE);
            list.add(xgh.j(b, apae.SLOT_TYPE_BELOW_PLAYER_IMMERSIVE, amru.r(xfa.e(wytVar.b.c(apah.TRIGGER_TYPE_LAYOUT_ID_ENTERED), xevVar.a)), amru.r(xgk.a(wytVar.b.c(apah.TRIGGER_TYPE_SLOT_ID_ENTERED), b)), amru.s(xfs.a(wytVar.b.c(apah.TRIGGER_TYPE_ON_NEW_PLAYBACK_AFTER_CONTENT_VIDEO_ID), str), xgl.a(wytVar.b.c(apah.TRIGGER_TYPE_SLOT_ID_EXITED), b)), xcp.b(new xdw(xevVar.a), new xds(new InstreamAdImpl(mediaAd)), new xdg(playerResponseModel), new xde(str2), new xcs(xcfVar), new xcz(anfq.h(anhyVar, wgr.i, angq.a)), new xcx(anfq.h(anhyVar, wgr.j, angq.a)), new xeg(anfq.h(anhyVar, wgr.k, angq.a)), new xee(anfq.h(anhyVar, wgr.l, angq.a)))));
        }
    }

    public final void b(List list, xgh xghVar, xev xevVar, MediaAd mediaAd, anhy anhyVar) {
        xcf xcfVar;
        if (this.d.contains(apae.SLOT_TYPE_BELOW_PLAYER) && xghVar.h(apae.SLOT_TYPE_PLAYER_BYTES, xdf.class, xdg.class) && xevVar.g(apac.LAYOUT_TYPE_MEDIA, xde.class)) {
            if (xevVar.k.d(xcs.class)) {
                xcfVar = (xcf) xevVar.e(xcs.class);
            } else {
                xcfVar = xcf.a;
            }
            wyt wytVar = (wyt) this.c.get();
            String str = (String) xghVar.d(xdf.class);
            PlayerResponseModel playerResponseModel = (PlayerResponseModel) xghVar.d(xdg.class);
            String str2 = (String) xevVar.e(xde.class);
            String b = wytVar.b.b(apae.SLOT_TYPE_BELOW_PLAYER);
            list.add(xgh.j(b, apae.SLOT_TYPE_BELOW_PLAYER, amru.r(new xez(wytVar.b.c(apah.TRIGGER_TYPE_LAYOUT_ID_ENTERED_AND_SLOT_FULFILLED), apah.TRIGGER_TYPE_LAYOUT_ID_ENTERED_AND_SLOT_FULFILLED, xevVar.a, b)), amru.r(xfa.e(wytVar.b.c(apah.TRIGGER_TYPE_LAYOUT_ID_ENTERED), xevVar.a)), amru.s(xfs.a(wytVar.b.c(apah.TRIGGER_TYPE_ON_NEW_PLAYBACK_AFTER_CONTENT_VIDEO_ID), str), xgl.a(wytVar.b.c(apah.TRIGGER_TYPE_SLOT_ID_EXITED), b)), xcp.b(new xdw(xevVar.a), new xds(new InstreamAdImpl(mediaAd)), new xdg(playerResponseModel), new xde(str2), new xcs(xcfVar), new xdf(str), new xdc(anfq.h(anhyVar, wgr.m, angq.a)))));
        }
    }

    public final void c(List list, xgh xghVar, xev xevVar, MediaAd mediaAd) {
        xcf xcfVar;
        if (this.d.contains(apae.SLOT_TYPE_ADS_WATCH_NEXT_REQUEST) && xghVar.h(apae.SLOT_TYPE_PLAYER_BYTES, xdf.class, xdg.class) && xevVar.g(apac.LAYOUT_TYPE_MEDIA, xde.class)) {
            if (xevVar.k.d(xcs.class)) {
                xcfVar = (xcf) xevVar.e(xcs.class);
            } else {
                xcfVar = xcf.a;
            }
            wyt wytVar = (wyt) this.c.get();
            String str = (String) xghVar.d(xdf.class);
            PlayerResponseModel playerResponseModel = (PlayerResponseModel) xghVar.d(xdg.class);
            String str2 = (String) xevVar.e(xde.class);
            String b = wytVar.b.b(apae.SLOT_TYPE_ADS_WATCH_NEXT_REQUEST);
            list.add(xgh.j(b, apae.SLOT_TYPE_ADS_WATCH_NEXT_REQUEST, amru.r(new xgm(wytVar.b.c(apah.TRIGGER_TYPE_SLOT_ID_FULFILLED_NON_EMPTY), apah.TRIGGER_TYPE_SLOT_ID_FULFILLED_NON_EMPTY, b)), amru.r(xfa.e(wytVar.b.c(apah.TRIGGER_TYPE_LAYOUT_ID_ENTERED), xevVar.a)), amru.s(xfs.a(wytVar.b.c(apah.TRIGGER_TYPE_ON_NEW_PLAYBACK_AFTER_CONTENT_VIDEO_ID), str), xgl.a(wytVar.b.c(apah.TRIGGER_TYPE_SLOT_ID_EXITED), b)), xcp.b(new xdw(xevVar.a), new xds(new InstreamAdImpl(mediaAd)), new xdg(playerResponseModel), new xde(str2), new xcs(xcfVar))));
        }
    }

    @Override // defpackage.wwp
    public final void o(final xgh xghVar, final xev xevVar) {
        String str;
        PlayerResponseModel playerResponseModel;
        if (!xevVar.g(apac.LAYOUT_TYPE_MEDIA, new Class[0]) || TextUtils.equals(xevVar.a, this.e)) {
            return;
        }
        if (xghVar.e(xdf.class)) {
            str = (String) xghVar.d(xdf.class);
        } else {
            str = xevVar.f(xdf.class) ? (String) xevVar.e(xdf.class) : "";
        }
        if (xghVar.e(xdg.class)) {
            playerResponseModel = (PlayerResponseModel) xghVar.d(xdg.class);
        } else {
            playerResponseModel = xevVar.f(xdg.class) ? (PlayerResponseModel) xevVar.e(xdg.class) : null;
        }
        ((ajoy) this.i.get()).w(4, xeo.a(str, playerResponseModel), new wwc() { // from class: wwa
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.wwc
            public final List a() {
                wwb wwbVar;
                xev xevVar2;
                xgh xghVar2;
                xev xevVar3;
                amru t;
                wwb wwbVar2 = wwb.this;
                xgh xghVar3 = xghVar;
                xev xevVar4 = xevVar;
                ArrayList arrayList = new ArrayList();
                if (xghVar3.c != 4) {
                    wwbVar = wwbVar2;
                    xevVar2 = xevVar4;
                    if (xevVar2.g(apac.LAYOUT_TYPE_MEDIA, xdu.class)) {
                        MediaAd mediaAd = (MediaAd) xevVar2.e(xdu.class);
                        anhy i = wwbVar.a.i(mediaAd);
                        if (wwbVar.d.contains(apae.SLOT_TYPE_IN_PLAYER) && (mediaAd instanceof LocalVideoAd) && xghVar3.h(apae.SLOT_TYPE_PLAYER_BYTES, xdf.class, xdg.class, xdb.class) && xevVar2.g(apac.LAYOUT_TYPE_MEDIA, xcs.class)) {
                            wyt wytVar = (wyt) wwbVar.c.get();
                            String str2 = xevVar2.a;
                            String str3 = (String) xghVar3.d(xdf.class);
                            PlayerResponseModel playerResponseModel2 = (PlayerResponseModel) xghVar3.d(xdg.class);
                            xfn xfnVar = (xfn) xghVar3.d(xdb.class);
                            xci b = ((wwo) wwbVar.b.get()).b(xghVar3, xevVar2);
                            xcf xcfVar = (xcf) xevVar2.e(xcs.class);
                            String b2 = wytVar.b.b(apae.SLOT_TYPE_IN_PLAYER);
                            arrayList.add(xgh.j(b2, apae.SLOT_TYPE_IN_PLAYER, amru.r(xfa.e(wytVar.b.c(apah.TRIGGER_TYPE_LAYOUT_ID_ENTERED), str2)), amru.r(xgk.a(wytVar.b.c(apah.TRIGGER_TYPE_SLOT_ID_ENTERED), b2)), amru.s(xfs.a(wytVar.b.c(apah.TRIGGER_TYPE_ON_NEW_PLAYBACK_AFTER_CONTENT_VIDEO_ID), str3), xgl.a(wytVar.b.c(apah.TRIGGER_TYPE_SLOT_ID_EXITED), b2)), xcp.b(new xdw(str2), new xdg(playerResponseModel2), new xdb(xfnVar), new xcv(b), new xcs(xcfVar), new xel(i), new xdu(mediaAd))));
                        }
                        if (wwbVar.d.contains(apae.SLOT_TYPE_IN_PLAYER) && xghVar3.h(apae.SLOT_TYPE_PLAYER_BYTES, xdf.class, xdj.class)) {
                            wyt wytVar2 = (wyt) wwbVar.c.get();
                            String str4 = xevVar2.a;
                            String str5 = (String) xghVar3.d(xdf.class);
                            aeqn aeqnVar = (aeqn) xghVar3.d(xdj.class);
                            String b3 = wytVar2.b.b(apae.SLOT_TYPE_IN_PLAYER);
                            arrayList.add(xgh.j(b3, apae.SLOT_TYPE_IN_PLAYER, amru.r(xfa.e(wytVar2.b.c(apah.TRIGGER_TYPE_LAYOUT_ID_ENTERED), str4)), amru.r(xgk.a(wytVar2.b.c(apah.TRIGGER_TYPE_SLOT_ID_ENTERED), b3)), amru.s(xfs.a(wytVar2.b.c(apah.TRIGGER_TYPE_ON_NEW_PLAYBACK_AFTER_CONTENT_VIDEO_ID), str5), xgl.a(wytVar2.b.c(apah.TRIGGER_TYPE_SLOT_ID_EXITED), b3)), xcp.b(new xdj(aeqnVar), new xdu(mediaAd), new xdw(str4), new xel(i))));
                        }
                        if (wbs.x(wwbVar.g)) {
                            wwbVar.c(arrayList, xghVar3, xevVar2, mediaAd);
                        } else {
                            wwbVar.b(arrayList, xghVar3, xevVar2, mediaAd, i);
                            wwbVar.a(arrayList, xghVar3, xevVar2, mediaAd, i);
                            if (wwbVar.d.contains(apae.SLOT_TYPE_FULLSCREEN_ENGAGEMENT) && (mediaAd instanceof LocalVideoAd) && xghVar3.h(apae.SLOT_TYPE_PLAYER_BYTES, xdf.class)) {
                                wyt wytVar3 = (wyt) wwbVar.c.get();
                                String str6 = xevVar2.a;
                                InstreamAdImpl instreamAdImpl = new InstreamAdImpl(mediaAd);
                                String str7 = (String) xghVar3.d(xdf.class);
                                String b4 = wytVar3.b.b(apae.SLOT_TYPE_FULLSCREEN_ENGAGEMENT);
                                arrayList.add(xgh.j(b4, apae.SLOT_TYPE_FULLSCREEN_ENGAGEMENT, amru.r(xfa.e(wytVar3.b.c(apah.TRIGGER_TYPE_LAYOUT_ID_ENTERED), str6)), amru.r(xgk.a(wytVar3.b.c(apah.TRIGGER_TYPE_SLOT_ID_ENTERED), b4)), amru.s(xfs.a(wytVar3.b.c(apah.TRIGGER_TYPE_ON_NEW_PLAYBACK_AFTER_CONTENT_VIDEO_ID), str7), xgl.a(wytVar3.b.c(apah.TRIGGER_TYPE_SLOT_ID_EXITED), b4)), xcp.b(new xdw(str6), new xel(i), new xds(instreamAdImpl))));
                            }
                            if (xghVar3.h(apae.SLOT_TYPE_PLAYER_BYTES, xdf.class, xdg.class) && xevVar2.g(apac.LAYOUT_TYPE_MEDIA, xde.class, xcs.class)) {
                                wvy wvyVar = (wvy) wwbVar.f.get();
                                anaf.Y(i, new wvx(wvyVar, (String) xevVar2.e(xde.class), (String) xghVar3.d(xdf.class), (PlayerResponseModel) xghVar3.d(xdg.class), xevVar2.a, mediaAd), wvyVar.d);
                            }
                        }
                    }
                } else if (xevVar4.g(apac.LAYOUT_TYPE_MEDIA, xeb.class)) {
                    RemoteVideoAd remoteVideoAd = (RemoteVideoAd) xevVar4.e(xeb.class);
                    anhy i2 = wwbVar2.a.i(remoteVideoAd);
                    if (!wwbVar2.d.contains(apae.SLOT_TYPE_IN_PLAYER)) {
                        wwbVar = wwbVar2;
                        xghVar2 = xghVar3;
                        xevVar3 = xevVar4;
                    } else if (xghVar3.h(apae.SLOT_TYPE_PLAYER_BYTES, xdf.class, xdg.class, xdb.class, xdt.class) && xevVar4.g(apac.LAYOUT_TYPE_MEDIA, xeb.class, xcv.class)) {
                        if (wbs.z(wwbVar2.h).m) {
                            t = amru.s(apae.SLOT_TYPE_IN_PLAYER, apae.SLOT_TYPE_LOCKSCREEN);
                        } else {
                            t = amru.t(apae.SLOT_TYPE_IN_PLAYER, apae.SLOT_TYPE_LOCKSCREEN, apae.SLOT_TYPE_FIXED_FOOTER);
                        }
                        PlayerResponseModel playerResponseModel3 = (PlayerResponseModel) xghVar3.d(xdg.class);
                        wyt wytVar4 = (wyt) wwbVar2.c.get();
                        String str8 = xevVar4.a;
                        String str9 = (String) xghVar3.d(xdf.class);
                        xfn xfnVar2 = (xfn) xghVar3.d(xdb.class);
                        xci xciVar = (xci) xevVar4.e(xcv.class);
                        xcf xcfVar2 = xcf.a;
                        boolean booleanValue = ((Boolean) xghVar3.d(xdt.class)).booleanValue();
                        xghVar2 = xghVar3;
                        ArrayList arrayList2 = new ArrayList(((amvj) t).c);
                        xevVar3 = xevVar4;
                        ArrayList arrayList3 = new ArrayList(Arrays.asList(new xdw(str8), new xdg(playerResponseModel3), new xdb(xfnVar2), new xcv(xciVar), new xcs(xcfVar2), new xdt(booleanValue), new xel(i2)));
                        if (t.contains(apae.SLOT_TYPE_FIXED_FOOTER) || booleanValue) {
                            arrayList3.add(new xeb(remoteVideoAd));
                        } else {
                            arrayList3.add(new xdu(remoteVideoAd));
                        }
                        amxe it = t.iterator();
                        while (it.hasNext()) {
                            apae apaeVar = (apae) it.next();
                            String b5 = wytVar4.b.b(apaeVar);
                            arrayList2.add(xgh.j(b5, apaeVar, amru.r(xfa.e(wytVar4.b.c(apah.TRIGGER_TYPE_LAYOUT_ID_ENTERED), str8)), amru.r(xgk.a(wytVar4.b.c(apah.TRIGGER_TYPE_SLOT_ID_ENTERED), b5)), amru.s(xfs.a(wytVar4.b.c(apah.TRIGGER_TYPE_ON_NEW_PLAYBACK_AFTER_CONTENT_VIDEO_ID), str9), xgl.a(wytVar4.b.c(apah.TRIGGER_TYPE_SLOT_ID_EXITED), b5)), xcp.a(arrayList3)));
                        }
                        arrayList.addAll(arrayList2);
                        wwbVar = wwbVar2;
                    } else {
                        xghVar2 = xghVar3;
                        xevVar3 = xevVar4;
                        wwbVar = wwbVar2;
                    }
                    if (wbs.x(wwbVar.g)) {
                        xevVar2 = xevVar3;
                        wwbVar.c(arrayList, xghVar2, xevVar2, remoteVideoAd);
                    } else {
                        xgh xghVar4 = xghVar2;
                        xevVar2 = xevVar3;
                        if (wbs.B(wwbVar.h)) {
                            wwb wwbVar3 = wwbVar;
                            wwbVar3.b(arrayList, xghVar4, xevVar2, remoteVideoAd, i2);
                            wwbVar3.a(arrayList, xghVar4, xevVar2, remoteVideoAd, i2);
                        }
                    }
                } else {
                    wwbVar = wwbVar2;
                    xevVar2 = xevVar4;
                }
                wwbVar.e = xevVar2.a;
                return arrayList;
            }
        });
    }

    @Override // defpackage.wwq
    public final void s(xgh xghVar, xev xevVar, int i) {
        if (xevVar.g(apac.LAYOUT_TYPE_MEDIA, new Class[0]) && TextUtils.equals(xevVar.a, this.e)) {
            this.e = "";
        }
    }
}
