package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wvs implements wof {
    public final azrw a;
    public final Set b = new HashSet();
    public String c;
    public PlayerResponseModel d;
    public aixh e;
    private final azrw f;
    private final azrw g;

    public wvs(azrw azrwVar, azrw azrwVar2, azrw azrwVar3) {
        this.f = azrwVar;
        this.g = azrwVar2;
        this.a = azrwVar3;
    }

    @Override // defpackage.wof
    public final void f(aign aignVar, PlayerResponseModel playerResponseModel, aixh aixhVar, String str, String str2) {
        aign aignVar2 = aign.NEW;
        int ordinal = aignVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 2 && playerResponseModel.c().ax()) {
                this.c = str;
                this.d = playerResponseModel;
                this.e = aixhVar;
                aixm d = aixhVar.d();
                if (d != null) {
                    d.p((wvz) this.g.get());
                    d.o((wvz) this.g.get());
                    return;
                }
                return;
            }
            return;
        }
        this.c = null;
        this.d = null;
        this.e = null;
        this.b.clear();
    }

    @Override // defpackage.wof
    public final /* synthetic */ void h(int i, String str) {
    }

    @Override // defpackage.wof
    public final /* synthetic */ void qp(afih afihVar) {
    }

    @Override // defpackage.wof
    public final /* synthetic */ void qq(String str) {
    }

    @Override // defpackage.wof
    public final /* synthetic */ void qr(aigf aigfVar, aigf aigfVar2, int i, int i2, boolean z, boolean z2) {
    }

    @Override // defpackage.wof
    public final /* synthetic */ void qs(String str, long j, long j2, long j3, boolean z) {
    }

    @Override // defpackage.wof
    public final /* synthetic */ void qw(String str, int i) {
    }

    @Override // defpackage.wof
    public final void qy(ahcm ahcmVar) {
        PlayerResponseModel playerResponseModel;
        String str;
        final aeqn a = ahcmVar.a();
        if (a == null || this.b.contains(a.a)) {
            return;
        }
        int i = a.b;
        if ((i == 0 || i == 1) && a.a() != -1 && (playerResponseModel = this.d) != null && playerResponseModel.c().ax()) {
            Iterator it = this.d.z().iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = null;
                    break;
                }
                aowc aowcVar = (aowc) it.next();
                int bY = amkq.bY(aowcVar.d);
                if (bY != 0 && bY == 7) {
                    str = aowcVar.e;
                    break;
                }
            }
            if (str != null) {
                this.b.add(a.a);
                if (this.e.d() != null) {
                    this.e.d().c(new aixi(a.a(), a.a() + a.d, 2, 4, null));
                }
                ((ajoy) this.f.get()).w(5, xeo.a(this.c, this.d), new wwc() { // from class: wvr
                    @Override // defpackage.wwc
                    public final List a() {
                        wvs wvsVar = wvs.this;
                        aeqn aeqnVar = a;
                        aixh aixhVar = wvsVar.e;
                        PlayerResponseModel playerResponseModel2 = wvsVar.d;
                        String str2 = wvsVar.c;
                        wyt wytVar = (wyt) wvsVar.a.get();
                        int size = wvsVar.b.size();
                        String b = wytVar.b.b(apae.SLOT_TYPE_PLAYER_BYTES);
                        return Arrays.asList(xgh.j(b, apae.SLOT_TYPE_PLAYER_BYTES, amru.r(new xfd(wytVar.b.c(apah.TRIGGER_TYPE_LIVE_STREAM_BREAK_STARTED), apah.TRIGGER_TYPE_LIVE_STREAM_BREAK_STARTED, aeqnVar.a)), amru.r(xgn.a(wytVar.b.c(apah.TRIGGER_TYPE_SLOT_ID_SCHEDULED), b)), amru.r(xfs.a(wytVar.b.c(apah.TRIGGER_TYPE_ON_NEW_PLAYBACK_AFTER_CONTENT_VIDEO_ID), str2)), xcp.a(amru.v(new xdj(aeqnVar), new xej(aixhVar), new xdg(playerResponseModel2), new xdf(str2), new xcr(size)))));
                    }
                });
            }
        }
    }
}
