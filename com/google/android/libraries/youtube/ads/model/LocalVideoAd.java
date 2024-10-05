package com.google.android.libraries.youtube.ads.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import com.google.android.libraries.youtube.innertube.model.player.PlaybackTrackingModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.protos.youtube.api.innertube.BrandInteractionRendererOuterClass;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.SkipAdRendererOuterClass;
import com.google.protos.youtube.api.innertube.UrlEndpointOuterClass;
import defpackage.aapf;
import defpackage.aarr;
import defpackage.afrd;
import defpackage.afsi;
import defpackage.ahbj;
import defpackage.amkq;
import defpackage.aowz;
import defpackage.aoya;
import defpackage.aoyc;
import defpackage.aoyd;
import defpackage.aoyj;
import defpackage.aoyx;
import defpackage.aplp;
import defpackage.apmg;
import defpackage.apxf;
import defpackage.argu;
import defpackage.arhb;
import defpackage.aryr;
import defpackage.asgk;
import defpackage.asus;
import defpackage.aton;
import defpackage.aulq;
import defpackage.auve;
import defpackage.avuo;
import defpackage.avvw;
import defpackage.avvy;
import defpackage.xes;
import defpackage.xfe;
import defpackage.xfm;
import defpackage.xfx;
import defpackage.yny;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class LocalVideoAd extends VideoAd {
    public static final Parcelable.Creator CREATOR = new xes(3);
    public static final xfx a = new xfe();
    public final avvy b;
    public final PlayerResponseModel c;
    public final int d;

    @Deprecated
    public LocalVideoAd(InstreamAdBreak instreamAdBreak, PlayerConfigModel playerConfigModel, String str, avvy avvyVar, aapf aapfVar, aarr aarrVar, long j) {
        this(instreamAdBreak.f, instreamAdBreak.i, instreamAdBreak.h, instreamAdBreak.g, instreamAdBreak.e, str, s(ag(avvyVar, aapfVar, aarrVar, playerConfigModel), avvyVar, j, instreamAdBreak.e), avvyVar, ag(avvyVar, aapfVar, aarrVar, playerConfigModel), 0);
    }

    private static PlayerResponseModel ag(avvy avvyVar, aapf aapfVar, aarr aarrVar, PlayerConfigModel playerConfigModel) {
        aoya aoyaVar = avvyVar.f;
        if (aoyaVar == null) {
            aoyaVar = aoya.a;
        }
        if (aoyaVar.b.size() != 0) {
            aoya aoyaVar2 = avvyVar.f;
            if (aoyaVar2 == null) {
                aoyaVar2 = aoya.a;
            }
            PlayerResponseModel b = xfm.b(aapfVar, aoyaVar2, playerConfigModel);
            if (b != null) {
                return b;
            }
        }
        aryr aryrVar = (aryr) aarrVar.a(avvyVar.e.I(), aryr.a);
        if (aryrVar == null) {
            afsi.b(1, 1, "AdBreakRenderer path ad playerResponse cannot be deserialized.");
            aryrVar = aryr.a;
        }
        return new PlayerResponseModel(aryrVar, 0L, aapfVar);
    }

    public static long s(PlayerResponseModel playerResponseModel, avvy avvyVar, long j, boolean z) {
        long j2;
        if (!z) {
            VideoStreamingData videoStreamingData = playerResponseModel.c;
            if (videoStreamingData != null) {
                long j3 = videoStreamingData.e;
                if (j3 != Long.MAX_VALUE) {
                    return j3 + j;
                }
            }
            return Long.MAX_VALUE;
        }
        aoyd aoydVar = avvyVar.j;
        if (aoydVar == null) {
            aoydVar = aoyd.a;
        }
        aoyc aoycVar = aoydVar.c;
        if (aoycVar == null) {
            aoycVar = aoyc.a;
        }
        if ((aoycVar.b & 1) != 0) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            aoyd aoydVar2 = avvyVar.j;
            if (aoydVar2 == null) {
                aoydVar2 = aoyd.a;
            }
            aoyc aoycVar2 = aoydVar2.c;
            if (aoycVar2 == null) {
                aoycVar2 = aoyc.a;
            }
            aton atonVar = aoycVar2.c;
            if (atonVar == null) {
                atonVar = aton.a;
            }
            j2 = timeUnit.toMillis(atonVar.c);
        } else {
            j2 = e;
        }
        return j + j2;
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final List A() {
        return this.b.n;
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final List B() {
        return this.b.k;
    }

    public final boolean C() {
        avvy avvyVar = this.b;
        if (avvyVar.c == 23) {
            return ((Boolean) avvyVar.d).booleanValue();
        }
        return false;
    }

    public final boolean D() {
        avvy avvyVar = this.b;
        if (avvyVar.c == 20) {
            return ((Boolean) avvyVar.d).booleanValue();
        }
        return false;
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final asus[] E() {
        avvy avvyVar = this.b;
        if ((avvyVar.b & 256) == 0) {
            return null;
        }
        aoyd aoydVar = avvyVar.j;
        if (aoydVar == null) {
            aoydVar = aoyd.a;
        }
        return (asus[]) aoydVar.b.toArray(new asus[0]);
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final int c() {
        return this.c.a();
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final Uri d() {
        List list;
        if (e() == null || (list = e().n) == null) {
            return null;
        }
        if (list.isEmpty()) {
            afsi.b(1, 1, "Received non-null videoStreamingData object with empty list of format streams");
            return null;
        }
        return ((FormatStreamModel) list.get(0)).d;
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final VideoStreamingData e() {
        return this.c.c;
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final boolean equals(Object obj) {
        if (!(obj instanceof LocalVideoAd)) {
            return false;
        }
        LocalVideoAd localVideoAd = (LocalVideoAd) obj;
        return super.equals(localVideoAd) && amkq.b(this.b, localVideoAd.b) && amkq.b(this.c, localVideoAd.c) && this.d == localVideoAd.d;
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final PlaybackTrackingModel f() {
        return this.c.f();
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final PlayerResponseModel g() {
        return this.c;
    }

    @Override // defpackage.afre
    public final /* bridge */ /* synthetic */ afrd h() {
        return new xfe(this);
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final aoyx i() {
        return this.c.n();
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final argu j() {
        arhb arhbVar = this.c.a.r;
        if (arhbVar == null) {
            arhbVar = arhb.a;
        }
        if (arhbVar.b != 61737181) {
            return null;
        }
        arhb arhbVar2 = this.c.a.r;
        if (arhbVar2 == null) {
            arhbVar2 = arhb.a;
        }
        if (arhbVar2.b == 61737181) {
            return (argu) arhbVar2.c;
        }
        return argu.a;
    }

    @Override // com.google.android.libraries.youtube.ads.model.MediaAd
    public final asgk k() {
        avvw avvwVar = this.b.l;
        if (avvwVar == null) {
            avvwVar = avvw.a;
        }
        if (avvwVar.b == 106875026) {
            return (asgk) avvwVar.c;
        }
        return null;
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final String m() {
        return this.k ? "" : this.c.u();
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final String n() {
        return this.c.y();
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final aowz o() {
        avvy avvyVar = this.b;
        if ((avvyVar.b & 32768) == 0) {
            return null;
        }
        aowz aowzVar = avvyVar.p;
        return aowzVar == null ? aowz.a : aowzVar;
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final int p() {
        return this.d;
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final int q() {
        aoyd aoydVar = this.b.j;
        if (aoydVar == null) {
            aoydVar = aoyd.a;
        }
        aoyc aoycVar = aoydVar.c;
        if (aoycVar == null) {
            aoycVar = aoyc.a;
        }
        if ((aoycVar.b & 1) == 0) {
            return 1;
        }
        aoyd aoydVar2 = this.b.j;
        if (aoydVar2 == null) {
            aoydVar2 = aoyd.a;
        }
        aoyc aoycVar2 = aoydVar2.c;
        if (aoycVar2 == null) {
            aoycVar2 = aoyc.a;
        }
        aton atonVar = aoycVar2.c;
        if (atonVar == null) {
            atonVar = aton.a;
        }
        return atonVar.b;
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final int qB() {
        return this.b.s;
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    protected final int r() {
        return this.b.g;
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final Uri t() {
        apxf apxfVar = this.b.i;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        avuo avuoVar = (avuo) apxfVar.pX(UrlEndpointOuterClass.urlEndpoint);
        if (avuoVar.c.isEmpty()) {
            return null;
        }
        return Uri.parse(avuoVar.c);
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final aoyj u() {
        aoyj aoyjVar = this.b.o;
        return aoyjVar == null ? aoyj.a : aoyjVar;
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final aplp v() {
        asgk k = k();
        if (k == null) {
            return null;
        }
        aulq aulqVar = k.d;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        if (!aulqVar.pY(BrandInteractionRendererOuterClass.brandInteractionRenderer)) {
            return null;
        }
        aulq aulqVar2 = k.d;
        if (aulqVar2 == null) {
            aulqVar2 = aulq.a;
        }
        return (aplp) aulqVar2.pX(BrandInteractionRendererOuterClass.brandInteractionRenderer);
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final apmg w() {
        asgk k = k();
        if (k == null) {
            return null;
        }
        aulq aulqVar = k.h;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        if (!aulqVar.pY(ButtonRendererOuterClass.buttonRenderer)) {
            return null;
        }
        aulq aulqVar2 = k.h;
        if (aulqVar2 == null) {
            aulqVar2 = aulq.a;
        }
        return (apmg) aulqVar2.pX(ButtonRendererOuterClass.buttonRenderer);
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        yny.I(this.b, parcel);
        parcel.writeParcelable(this.c, 0);
        parcel.writeInt(this.d);
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final apxf x() {
        avvy avvyVar = this.b;
        if ((avvyVar.b & 64) == 0) {
            return null;
        }
        apxf apxfVar = avvyVar.i;
        return apxfVar == null ? apxf.a : apxfVar;
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final auve y() {
        asgk k = k();
        if (k == null || (k.b & 1) == 0) {
            return null;
        }
        aulq aulqVar = k.c;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        return (auve) ahbj.n(aulqVar, SkipAdRendererOuterClass.skipAdRenderer);
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final String z() {
        return this.b.m;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public LocalVideoAd(java.lang.String r14, byte[] r15, java.lang.String r16, java.lang.String r17, boolean r18, java.lang.String r19, long r20, defpackage.avvy r22, com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel r23, int r24) {
        /*
            r13 = this;
            r11 = r13
            r12 = r22
            com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel r6 = r23.c()
            com.google.android.libraries.youtube.ads.model.VideoAdTrackingModel r10 = new com.google.android.libraries.youtube.ads.model.VideoAdTrackingModel
            int r0 = r12.b
            r0 = r0 & 8
            if (r0 == 0) goto L16
            aoyi r0 = r12.h
            if (r0 != 0) goto L18
            aoyi r0 = defpackage.aoyi.a
            goto L18
        L16:
            aoyi r0 = defpackage.aoyi.a
        L18:
            r10.<init>(r0)
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r7 = r19
            r8 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r10)
            r22.getClass()
            r11.b = r12
            r23.getClass()
            r0 = r23
            r11.c = r0
            r0 = r24
            r11.d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.youtube.ads.model.LocalVideoAd.<init>(java.lang.String, byte[], java.lang.String, java.lang.String, boolean, java.lang.String, long, avvy, com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel, int):void");
    }
}
