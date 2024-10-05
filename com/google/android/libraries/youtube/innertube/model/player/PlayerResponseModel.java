package com.google.android.libraries.youtube.innertube.model.player;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.media.PlayerThreedRendererModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import com.google.protos.youtube.api.innertube.PlayerThreedRendererOuterClass;
import defpackage.aami;
import defpackage.aamk;
import defpackage.aapf;
import defpackage.aapj;
import defpackage.aarr;
import defpackage.amkq;
import defpackage.aomf;
import defpackage.aone;
import defpackage.aong;
import defpackage.aoui;
import defpackage.aowc;
import defpackage.aoww;
import defpackage.aoxs;
import defpackage.aoyx;
import defpackage.apwo;
import defpackage.arxx;
import defpackage.aryb;
import defpackage.aryi;
import defpackage.aryj;
import defpackage.aryk;
import defpackage.aryn;
import defpackage.aryr;
import defpackage.aryv;
import defpackage.aryx;
import defpackage.aryy;
import defpackage.aszn;
import defpackage.atqq;
import defpackage.atxz;
import defpackage.atyi;
import defpackage.aual;
import defpackage.aulq;
import defpackage.avgg;
import defpackage.avzn;
import defpackage.vak;
import defpackage.yny;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class PlayerResponseModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = new aamk(19);
    public aryr a;
    public final long b;
    public final VideoStreamingData c;
    public final MutableContext d;
    public vak e;
    private PlaybackTrackingModel f;
    private PlayerConfigModel g;
    private atxz h;
    private PlayerResponseModel i;
    private List j;
    private aapj k;
    private aoxs l;
    private aoyx m;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public class MutableContext implements Parcelable {
        public static final Parcelable.Creator CREATOR = new aamk(20);
        final HashMap a = new HashMap();
        final HashMap b = new HashMap();
        public final HashMap c = new HashMap();

        public final void a(String str, boolean z) {
            this.a.put(str, Boolean.valueOf(z));
        }

        public final void b(String str, long j) {
            this.b.put(str, Long.valueOf(j));
        }

        public final void c(String str, String str2) {
            this.c.put(str, str2);
        }

        public final boolean d(String str) {
            return this.a.containsKey(str) && ((Boolean) this.a.get(str)).booleanValue();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final long e() {
            if (this.b.containsKey("PLAYER_RESPONSE_SOURCE_KEY")) {
                return ((Long) this.b.get("PLAYER_RESPONSE_SOURCE_KEY")).longValue();
            }
            return 0L;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeMap(this.a);
            parcel.writeMap(this.b);
            parcel.writeMap(this.c);
        }
    }

    public PlayerResponseModel(VideoStreamingData videoStreamingData, PlaybackTrackingModel playbackTrackingModel, PlayerConfigModel playerConfigModel) {
        aong aongVar = (aong) aryr.a.createBuilder();
        aone createBuilder = aryx.a.createBuilder();
        long seconds = TimeUnit.MILLISECONDS.toSeconds(videoStreamingData.d);
        createBuilder.copyOnWrite();
        aryx aryxVar = (aryx) createBuilder.instance;
        aryxVar.b |= 4;
        aryxVar.e = seconds;
        aongVar.copyOnWrite();
        aryr aryrVar = (aryr) aongVar.instance;
        aryx aryxVar2 = (aryx) createBuilder.build();
        aryxVar2.getClass();
        aryrVar.g = aryxVar2;
        aryrVar.b |= 8;
        this.a = (aryr) aongVar.build();
        videoStreamingData.getClass();
        this.c = videoStreamingData;
        this.b = videoStreamingData.e;
        playbackTrackingModel.getClass();
        this.f = playbackTrackingModel;
        playerConfigModel.getClass();
        this.g = playerConfigModel;
        this.d = new MutableContext();
    }

    public static VideoStreamingData d(aapf aapfVar, aryr aryrVar, long j) {
        return e(aapfVar, aryrVar, j, null);
    }

    public static VideoStreamingData e(aapf aapfVar, aryr aryrVar, long j, String str) {
        PlayerThreedRendererModel playerThreedRendererModel;
        PlayerConfigModel playerConfigModel;
        aapfVar.getClass();
        aryb arybVar = aryrVar.i;
        if (arybVar == null) {
            arybVar = aryb.a;
        }
        String str2 = arybVar.f;
        if ((aryrVar.b & 16) == 0) {
            return null;
        }
        aryx aryxVar = aryrVar.g;
        if (aryxVar == null) {
            aryxVar = aryx.a;
        }
        String str3 = aryxVar.c;
        long millis = TimeUnit.SECONDS.toMillis(aryxVar.e);
        boolean z = aryxVar.f;
        boolean z2 = aryxVar.i;
        boolean z3 = aryxVar.g;
        int i = aryxVar.k;
        aszn b = aszn.b(aryxVar.j);
        if (b == null) {
            b = aszn.MDE_STREAM_OPTIMIZATIONS_RENDERER_LATENCY_UNKNOWN;
        }
        aszn asznVar = b;
        aulq aulqVar = aryrVar.q;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        if (aulqVar.pY(PlayerThreedRendererOuterClass.playerThreedRenderer)) {
            aulq aulqVar2 = aryrVar.q;
            if (aulqVar2 == null) {
                aulqVar2 = aulq.a;
            }
            playerThreedRendererModel = new PlayerThreedRendererModel(((aual) aulqVar2.pX(PlayerThreedRendererOuterClass.playerThreedRenderer)).b);
        } else {
            playerThreedRendererModel = new PlayerThreedRendererModel();
        }
        PlayerThreedRendererModel playerThreedRendererModel2 = playerThreedRendererModel;
        if ((aryrVar.b & 2) == 0) {
            playerConfigModel = PlayerConfigModel.b;
        } else {
            atyi atyiVar = aryrVar.e;
            if (atyiVar == null) {
                atyiVar = atyi.a;
            }
            playerConfigModel = new PlayerConfigModel(atyiVar);
        }
        PlayerConfigModel playerConfigModel2 = playerConfigModel;
        aryv aryvVar = aryrVar.h;
        if (aryvVar == null) {
            aryvVar = aryv.a;
        }
        return aapfVar.a(aryvVar, str3, str, millis, j, z, z2, z3, i, asznVar, playerThreedRendererModel2, str2, playerConfigModel2);
    }

    public static PlayerResponseModel g() {
        return new PlayerResponseModel(aryr.a, 0L);
    }

    public static PlayerResponseModel h(byte[] bArr, long j) {
        aryr aryrVar;
        if (bArr == null || (aryrVar = (aryr) aarr.c(bArr, aryr.a)) == null) {
            return null;
        }
        return new PlayerResponseModel(aryrVar, j, aapf.b);
    }

    public final void A(aami aamiVar) {
        aong aongVar = (aong) this.a.toBuilder();
        if ((((aryr) aongVar.instance).b & 8) == 0) {
            aryx aryxVar = aryx.a;
            aongVar.copyOnWrite();
            aryr aryrVar = (aryr) aongVar.instance;
            aryxVar.getClass();
            aryrVar.g = aryxVar;
            aryrVar.b |= 8;
        }
        aryx aryxVar2 = this.a.g;
        if (aryxVar2 == null) {
            aryxVar2 = aryx.a;
        }
        aone builder = aryxVar2.toBuilder();
        avgg e = aamiVar.e();
        builder.copyOnWrite();
        aryx aryxVar3 = (aryx) builder.instance;
        e.getClass();
        aryxVar3.m = e;
        aryxVar3.b |= 262144;
        aongVar.copyOnWrite();
        aryr aryrVar2 = (aryr) aongVar.instance;
        aryx aryxVar4 = (aryx) builder.build();
        aryxVar4.getClass();
        aryrVar2.g = aryxVar4;
        aryrVar2.b |= 8;
        this.a = (aryr) aongVar.build();
    }

    public final boolean B() {
        return r() != null;
    }

    public final boolean C() {
        VideoStreamingData videoStreamingData = this.c;
        if (videoStreamingData != null) {
            return videoStreamingData.B();
        }
        aryx aryxVar = this.a.g;
        if (aryxVar == null) {
            aryxVar = aryx.a;
        }
        return aryxVar.f;
    }

    public final boolean D() {
        VideoStreamingData videoStreamingData = this.c;
        if (videoStreamingData != null) {
            return videoStreamingData.B() && this.c.G();
        }
        aryx aryxVar = this.a.g;
        if (aryxVar == null) {
            aryxVar = aryx.a;
        }
        return aryxVar.i;
    }

    public final boolean E() {
        VideoStreamingData videoStreamingData = this.c;
        if (videoStreamingData != null) {
            return videoStreamingData.E();
        }
        aryx aryxVar = this.a.g;
        if (aryxVar == null) {
            aryxVar = aryx.a;
        }
        return aryxVar.g;
    }

    public final boolean F() {
        aryx aryxVar = this.a.g;
        if (aryxVar == null) {
            aryxVar = aryx.a;
        }
        return aryxVar.h;
    }

    public final byte[] G() {
        return this.a.v.I();
    }

    public final byte[] H() {
        return this.a.toByteArray();
    }

    public final aryn[] I() {
        return (aryn[]) this.a.u.toArray(new aryn[0]);
    }

    public final int a() {
        aryx aryxVar = this.a.g;
        if (aryxVar == null) {
            aryxVar = aryx.a;
        }
        return (int) aryxVar.e;
    }

    public final aami b() {
        avgg avggVar;
        aryr aryrVar = this.a;
        if ((aryrVar.b & 8) != 0) {
            aryx aryxVar = aryrVar.g;
            if (aryxVar == null) {
                aryxVar = aryx.a;
            }
            avggVar = aryxVar.m;
            if (avggVar == null) {
                avggVar = avgg.a;
            }
        } else {
            avggVar = null;
        }
        return new aami(avggVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PlayerResponseModel)) {
            return false;
        }
        PlayerResponseModel playerResponseModel = (PlayerResponseModel) obj;
        return amkq.b(y(), playerResponseModel.y()) && amkq.b(q(), playerResponseModel.q());
    }

    public final PlaybackTrackingModel f() {
        if (this.f == null) {
            aryj aryjVar = this.a.j;
            if (aryjVar == null) {
                aryjVar = aryj.a;
            }
            this.f = new PlaybackTrackingModel(aryjVar);
        }
        return this.f;
    }

    public final int hashCode() {
        return ((y().hashCode() + 19) * 19) + (q() == null ? 0 : Arrays.hashCode(q().toByteArray()));
    }

    public final PlayerResponseModel i() {
        aoww aowwVar;
        aomf aomfVar;
        if (this.i == null) {
            Iterator it = this.a.m.iterator();
            while (true) {
                if (!it.hasNext()) {
                    aowwVar = null;
                    break;
                }
                aryk arykVar = (aryk) it.next();
                if (arykVar != null && arykVar.b == 88254013) {
                    aowwVar = (aoww) arykVar.c;
                    break;
                }
            }
            if (aowwVar != null) {
                if (aowwVar.b == 1) {
                    aomfVar = (aomf) aowwVar.c;
                } else {
                    aomfVar = aomf.b;
                }
                this.i = h(aomfVar.I(), this.b);
            }
        }
        return this.i;
    }

    public final aapj j(aapf aapfVar) {
        if (this.k == null) {
            aapj a = aapj.a(q(), this.b, aapfVar);
            if (a == null) {
                return null;
            }
            this.k = a;
        }
        return this.k;
    }

    public final aoui k() {
        aryr aryrVar = this.a;
        if ((aryrVar.c & 16) == 0) {
            return null;
        }
        aoui aouiVar = aryrVar.I;
        return aouiVar == null ? aoui.a : aouiVar;
    }

    public final aowc l() {
        aowc aowcVar;
        for (aryk arykVar : this.a.m) {
            if (arykVar.b == 84813246) {
                aowcVar = (aowc) arykVar.c;
            } else {
                aowcVar = aowc.a;
            }
            int bY = amkq.bY(aowcVar.d);
            if (bY != 0 && bY == 2) {
                return aowcVar;
            }
        }
        return null;
    }

    public final aoxs m() {
        if (this.l == null) {
            Iterator it = this.a.m.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                aryk arykVar = (aryk) it.next();
                if (arykVar.b == 97725940) {
                    this.l = (aoxs) arykVar.c;
                    break;
                }
            }
        }
        return this.l;
    }

    public final aoyx n() {
        if (this.m == null) {
            Iterator it = this.a.m.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                aryk arykVar = (aryk) it.next();
                if (arykVar != null && arykVar.b == 89145698) {
                    this.m = (aoyx) arykVar.c;
                    break;
                }
            }
        }
        return this.m;
    }

    public final apwo o() {
        aryr aryrVar = this.a;
        if ((aryrVar.c & 8) == 0) {
            return null;
        }
        apwo apwoVar = aryrVar.H;
        return apwoVar == null ? apwo.a : apwoVar;
    }

    public final aryb p() {
        aryr aryrVar = this.a;
        if ((aryrVar.b & 32) == 0) {
            return null;
        }
        aryb arybVar = aryrVar.i;
        return arybVar == null ? aryb.a : arybVar;
    }

    public final aryi q() {
        aryi aryiVar = this.a.f;
        return aryiVar == null ? aryi.a : aryiVar;
    }

    public final atqq r() {
        aryr aryrVar = this.a;
        if ((aryrVar.b & 128) == 0) {
            return null;
        }
        atqq atqqVar = aryrVar.k;
        return atqqVar == null ? atqq.a : atqqVar;
    }

    public final atxz s() {
        atxz atxzVar;
        if (this.h == null) {
            arxx arxxVar = this.a.s;
            if (arxxVar == null) {
                arxxVar = arxx.a;
            }
            if (arxxVar.b == 59961494) {
                arxx arxxVar2 = this.a.s;
                if (arxxVar2 == null) {
                    arxxVar2 = arxx.a;
                }
                if (arxxVar2.b == 59961494) {
                    atxzVar = (atxz) arxxVar2.c;
                } else {
                    atxzVar = atxz.a;
                }
                this.h = atxzVar;
            }
        }
        return this.h;
    }

    public final avzn t() {
        aryy aryyVar = this.a.t;
        if (aryyVar == null) {
            aryyVar = aryy.a;
        }
        if (aryyVar.b != 74049584) {
            return null;
        }
        aryy aryyVar2 = this.a.t;
        if (aryyVar2 == null) {
            aryyVar2 = aryy.a;
        }
        if (aryyVar2.b == 74049584) {
            return (avzn) aryyVar2.c;
        }
        return avzn.a;
    }

    public final String u() {
        aryr aryrVar = this.a;
        if ((aryrVar.b & 524288) != 0) {
            return aryrVar.x;
        }
        return null;
    }

    public final String v() {
        aryr aryrVar = this.a;
        if ((aryrVar.b & 262144) != 0) {
            return aryrVar.w;
        }
        return null;
    }

    public final String w() {
        aryx aryxVar = this.a.g;
        if (aryxVar == null) {
            aryxVar = aryx.a;
        }
        return aryxVar.n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        yny.I(this.a, parcel);
        parcel.writeLong(this.b);
        parcel.writeParcelable(this.c, 0);
        parcel.writeParcelable(this.d, 0);
    }

    public final String x() {
        aryx aryxVar = this.a.g;
        if (aryxVar == null) {
            aryxVar = aryx.a;
        }
        return aryxVar.d;
    }

    public final String y() {
        aryx aryxVar = this.a.g;
        if (aryxVar == null) {
            aryxVar = aryx.a;
        }
        return aryxVar.c;
    }

    public final List z() {
        if (this.j == null) {
            this.j = new ArrayList();
            for (aryk arykVar : this.a.m) {
                if (arykVar.b == 84813246) {
                    this.j.add((aowc) arykVar.c);
                }
            }
        }
        return this.j;
    }

    public final PlayerConfigModel c() {
        PlayerConfigModel playerConfigModel;
        if (this.g == null) {
            aryr aryrVar = this.a;
            if ((aryrVar.b & 2) == 0) {
                playerConfigModel = PlayerConfigModel.b;
            } else {
                atyi atyiVar = aryrVar.e;
                if (atyiVar == null) {
                    atyiVar = atyi.a;
                }
                playerConfigModel = new PlayerConfigModel(atyiVar);
            }
            this.g = playerConfigModel;
        }
        return this.g;
    }

    public PlayerResponseModel(aryr aryrVar, long j) {
        this(aryrVar, j, aapf.a);
    }

    public PlayerResponseModel(aryr aryrVar, long j, VideoStreamingData videoStreamingData) {
        this(aryrVar, j, videoStreamingData, new MutableContext());
    }

    public PlayerResponseModel(aryr aryrVar, long j, VideoStreamingData videoStreamingData, MutableContext mutableContext) {
        aryrVar.getClass();
        this.a = aryrVar;
        this.b = j;
        this.c = videoStreamingData;
        this.d = mutableContext;
    }

    public PlayerResponseModel(aryr aryrVar, long j, aapf aapfVar) {
        this(aryrVar, j, d(aapfVar, aryrVar, j));
    }
}
