package defpackage;

import com.google.android.libraries.youtube.ads.model.AdVideoEnd;
import com.google.android.libraries.youtube.ads.model.InstreamAdBreak;
import com.google.android.libraries.youtube.ads.model.MediaBreakAd;
import com.google.android.libraries.youtube.ads.model.PlayerAd;
import com.google.android.libraries.youtube.ads.model.SurveyAd;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
@wyr(a = apac.LAYOUT_TYPE_MEDIA_BREAK, b = apae.SLOT_TYPE_PLAYER_BYTES, c = {xdv.class, xdr.class, xcs.class}, d = {xdf.class, xdg.class})
/* loaded from: classes4.dex */
public final class wtp implements wts {
    public final wtr a;
    public final xev b;
    public final String c;
    public final PlayerResponseModel d;
    public final MediaBreakAd e;
    public wnk f;
    public final wxz g;
    private final wno h;
    private final CopyOnWriteArrayList i;
    private final woc j;
    private final wny k;
    private final xgh l;
    private final InstreamAdBreak m;
    private final xah n;
    private final xeo o;

    public wtp(wno wnoVar, wtr wtrVar, wxz wxzVar, CopyOnWriteArrayList copyOnWriteArrayList, woc wocVar, wny wnyVar, xci xciVar, ypa ypaVar, xgh xghVar, xev xevVar) {
        this.h = wnoVar;
        this.a = wtrVar;
        this.g = wxzVar;
        this.i = copyOnWriteArrayList;
        this.j = wocVar;
        this.k = wnyVar;
        this.l = xghVar;
        this.b = xevVar;
        MediaBreakAd mediaBreakAd = (MediaBreakAd) xevVar.e(xdv.class);
        this.e = mediaBreakAd;
        String str = (String) xghVar.d(xdf.class);
        this.c = str;
        InstreamAdBreak instreamAdBreak = (InstreamAdBreak) xevVar.e(xdr.class);
        this.m = instreamAdBreak;
        PlayerResponseModel playerResponseModel = (PlayerResponseModel) xghVar.d(xdg.class);
        this.d = playerResponseModel;
        this.n = mediaBreakAd instanceof AdVideoEnd ? null : new xah(ypaVar, mediaBreakAd, instreamAdBreak.b(), playerResponseModel, xciVar, (xcf) xevVar.e(xcs.class));
        this.o = xeo.a(str, playerResponseModel);
    }

    @Override // defpackage.wsx
    public final xev a() {
        return this.b;
    }

    @Override // defpackage.wsx
    public final void b() {
    }

    @Override // defpackage.wsx
    public final void qt() {
    }

    @Override // defpackage.wsx
    public final void qu() {
        woc wocVar = this.j;
        String str = this.c;
        InstreamAdBreak instreamAdBreak = this.m;
        PlayerAd playerAd = this.e;
        if (playerAd instanceof AdVideoEnd) {
            playerAd = ((AdVideoEnd) playerAd).d;
        }
        wocVar.d(str, instreamAdBreak, playerAd);
        wto wtoVar = new wto(this);
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            wnk wnkVar = (wnk) it.next();
            if (wnkVar.e(wtoVar)) {
                this.h.b(this.o, this.l, this.b);
                this.f = wnkVar;
                return;
            }
        }
        wtoVar.d(xce.VIDEO_ERROR);
    }

    @Override // defpackage.wsx
    public final void qv(int i) {
        xah xahVar;
        if (i == 0) {
            MediaBreakAd mediaBreakAd = this.e;
            if ((mediaBreakAd instanceof SurveyAd) || (mediaBreakAd instanceof AdVideoEnd)) {
                this.j.l();
            }
        }
        if (i != 4 && i != 1) {
            this.k.a(this.e);
        }
        wnk wnkVar = this.f;
        if (wnkVar != null) {
            wnkVar.c();
            this.f = null;
        }
        this.j.a();
        if (!(this.e instanceof AdVideoEnd) && (xahVar = this.n) != null) {
            xahVar.a();
        }
        this.h.f(this.o, this.l, this.b, i);
    }
}
