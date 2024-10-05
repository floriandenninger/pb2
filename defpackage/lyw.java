package defpackage;

import android.content.Context;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint;
import com.google.protos.youtube.api.innertube.OfflineVideoEndpointOuterClass$OfflineVideoEndpoint;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lyw implements aalw {
    private final Context a;
    private final azrw b;
    private final fjs c;
    private final fiu d;

    public lyw(Context context, azrw azrwVar, fjs fjsVar, fiu fiuVar) {
        this.a = context;
        this.b = azrwVar;
        this.c = fjsVar;
        this.d = fiuVar;
    }

    private final atda c(atda atdaVar, int i, int i2, arfr arfrVar) {
        aone builder = atdaVar.toBuilder();
        etx.e(this.a, builder, i2);
        aong aongVar = (aong) arfs.a.createBuilder();
        aongVar.copyOnWrite();
        arfs arfsVar = (arfs) aongVar.instance;
        arfsVar.c = arfrVar.pV;
        arfsVar.b |= 1;
        arfs arfsVar2 = (arfs) aongVar.build();
        atda atdaVar2 = (atda) builder.instance;
        int i3 = atdaVar2.b;
        if ((i3 & 1) != 0) {
            atdb atdbVar = atdaVar2.c;
            if (atdbVar == null) {
                atdbVar = atdb.a;
            }
            aone builder2 = atdbVar.toBuilder();
            builder2.copyOnWrite();
            atdb atdbVar2 = (atdb) builder2.instance;
            arfsVar2.getClass();
            atdbVar2.d = arfsVar2;
            atdbVar2.b |= 2;
            builder.copyOnWrite();
            atda atdaVar3 = (atda) builder.instance;
            atdb atdbVar3 = (atdb) builder2.build();
            atdbVar3.getClass();
            atdaVar3.c = atdbVar3;
            atdaVar3.b |= 1;
        } else if ((i3 & 2) != 0) {
            atde atdeVar = atdaVar2.d;
            if (atdeVar == null) {
                atdeVar = atde.a;
            }
            aone builder3 = atdeVar.toBuilder();
            builder3.copyOnWrite();
            atde atdeVar2 = (atde) builder3.instance;
            arfsVar2.getClass();
            atdeVar2.d = arfsVar2;
            atdeVar2.b |= 4;
            builder.copyOnWrite();
            atda atdaVar4 = (atda) builder.instance;
            atde atdeVar3 = (atde) builder3.build();
            atdeVar3.getClass();
            atdaVar4.d = atdeVar3;
            atdaVar4.b |= 2;
        } else if ((i3 & 16) != 0) {
            atcw atcwVar = atdaVar2.g;
            if (atcwVar == null) {
                atcwVar = atcw.a;
            }
            aone builder4 = atcwVar.toBuilder();
            builder4.copyOnWrite();
            atcw atcwVar2 = (atcw) builder4.instance;
            arfsVar2.getClass();
            atcwVar2.d = arfsVar2;
            atcwVar2.b |= 2;
            builder.copyOnWrite();
            atda atdaVar5 = (atda) builder.instance;
            atcw atcwVar3 = (atcw) builder4.build();
            atcwVar3.getClass();
            atdaVar5.g = atcwVar3;
            atdaVar5.b |= 16;
        } else if ((i3 & 32) != 0) {
            atcx atcxVar = atdaVar2.h;
            if (atcxVar == null) {
                atcxVar = atcx.a;
            }
            aone builder5 = atcxVar.toBuilder();
            builder5.copyOnWrite();
            atcx atcxVar2 = (atcx) builder5.instance;
            arfsVar2.getClass();
            atcxVar2.d = arfsVar2;
            atcxVar2.b |= 2;
            builder.copyOnWrite();
            atda atdaVar6 = (atda) builder.instance;
            atcx atcxVar3 = (atcx) builder5.build();
            atcxVar3.getClass();
            atdaVar6.h = atcxVar3;
            atdaVar6.b |= 32;
        } else if ((i3 & 8) != 0) {
            atdk atdkVar = atdaVar2.f;
            if (atdkVar == null) {
                atdkVar = atdk.a;
            }
            aone builder6 = atdkVar.toBuilder();
            if (!((atdk) builder6.instance).i) {
                builder6.copyOnWrite();
                atdk atdkVar2 = (atdk) builder6.instance;
                arfsVar2.getClass();
                atdkVar2.d = arfsVar2;
                atdkVar2.b |= 4;
            } else {
                builder6.copyOnWrite();
                atdk atdkVar3 = (atdk) builder6.instance;
                arfsVar2.getClass();
                atdkVar3.g = arfsVar2;
                atdkVar3.b |= 64;
            }
            builder.copyOnWrite();
            atda atdaVar7 = (atda) builder.instance;
            atdk atdkVar4 = (atdk) builder6.build();
            atdkVar4.getClass();
            atdaVar7.f = atdkVar4;
            atdaVar7.b |= 8;
        } else if ((i3 & 1024) != 0) {
            avpw avpwVar = atdaVar2.m;
            if (avpwVar == null) {
                avpwVar = avpw.a;
            }
            aone builder7 = avpwVar.toBuilder();
            builder7.copyOnWrite();
            avpw avpwVar2 = (avpw) builder7.instance;
            arfsVar2.getClass();
            avpwVar2.d = arfsVar2;
            avpwVar2.c = 2;
            builder.copyOnWrite();
            atda atdaVar8 = (atda) builder.instance;
            avpw avpwVar3 = (avpw) builder7.build();
            avpwVar3.getClass();
            atdaVar8.m = avpwVar3;
            atdaVar8.b |= 1024;
        }
        apxf dl = adyu.dl((atda) builder.build());
        if (dl != null && dl.pY(OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.offlinePlaylistEndpoint)) {
            aone builder8 = ((OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint) dl.pX(OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.offlinePlaylistEndpoint)).toBuilder();
            builder8.copyOnWrite();
            OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint = (OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint) builder8.instance;
            offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.d = i - 1;
            offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.b |= 2;
            OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint2 = (OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint) builder8.build();
            aong aongVar2 = (aong) dl.toBuilder();
            aongVar2.e(OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.offlinePlaylistEndpoint, offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint2);
            adyu.dq(builder, (apxf) aongVar2.build());
        }
        return (atda) builder.build();
    }

    @Override // defpackage.aalw
    public final amru a(atda atdaVar, Object obj) {
        final agnv agnvVar;
        atdaVar.getClass();
        apxf dl = adyu.dl(atdaVar);
        if (dl == null || !dl.pY(OfflineVideoEndpointOuterClass$OfflineVideoEndpoint.offlineVideoEndpoint)) {
            return amru.q();
        }
        OfflineVideoEndpointOuterClass$OfflineVideoEndpoint offlineVideoEndpointOuterClass$OfflineVideoEndpoint = (OfflineVideoEndpointOuterClass$OfflineVideoEndpoint) dl.pX(OfflineVideoEndpointOuterClass$OfflineVideoEndpoint.offlineVideoEndpoint);
        if ((offlineVideoEndpointOuterClass$OfflineVideoEndpoint.c == 1 ? (String) offlineVideoEndpointOuterClass$OfflineVideoEndpoint.d : "").isEmpty()) {
            return amru.q();
        }
        if (this.c.h()) {
            agnvVar = ((agof) this.b.get()).a().m().e(offlineVideoEndpointOuterClass$OfflineVideoEndpoint.c == 1 ? (String) offlineVideoEndpointOuterClass$OfflineVideoEndpoint.d : "");
        } else {
            agnvVar = null;
        }
        if (!((Boolean) this.d.b().G(new ayrv() { // from class: lyv
            @Override // defpackage.ayrv
            public final Object a(Object obj2) {
                agnv agnvVar2 = agnv.this;
                amsx amsxVar = (amsx) obj2;
                boolean z = false;
                if (agnvVar2 != null && amsxVar.contains(agnvVar2.m())) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }).X()).booleanValue()) {
            String str = offlineVideoEndpointOuterClass$OfflineVideoEndpoint.e;
            ArrayList arrayList = new ArrayList();
            if (agnvVar == null || agnvVar.s()) {
                if (ammx.e(str) || !this.c.i(str)) {
                    arrayList.add(etx.c(this.a, atdaVar, 2, R.string.add_video_to_offline, ammv.j(arfr.OFFLINE_RESUME)));
                } else {
                    arrayList.add(etx.c(this.a, atdaVar, 8, R.string.readd_to_offline, ammv.j(arfr.OFFLINE_RESUME)));
                }
            } else {
                agnq i = agnvVar.i();
                agnq agnqVar = agnq.DELETED;
                switch (i.ordinal()) {
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 11:
                        arrayList.add(etx.c(this.a, atdaVar, 4, R.string.pause_offline, ammv.j(arfr.OFFLINE_PAUSE)));
                        break;
                    case 10:
                        arrayList.add(etx.c(this.a, atdaVar, 6, R.string.resume_offline, ammv.j(arfr.OFFLINE_RESUME)));
                        break;
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 19:
                    case 20:
                    case 22:
                        arrayList.add(etx.c(this.a, atdaVar, 5, R.string.offline_retry_failed_videos_menu_item, ammv.j(arfr.OFFLINE_RESUME)));
                        break;
                    case 17:
                        arrayList.add(etx.c(this.a, atdaVar, 9, R.string.renew_offline, ammv.j(arfr.OFFLINE_RESUME)));
                        break;
                    case 21:
                        arrayList.add(etx.c(this.a, atdaVar, 8, R.string.retry_offline, ammv.j(arfr.OFFLINE_RESUME)));
                        break;
                }
                arrayList.add(etx.c(this.a, atdaVar, 3, R.string.remove_offline, ammv.j(arfr.OFFLINE_REMOVE)));
            }
            return amru.o(arrayList);
        }
        return amru.q();
    }

    @Override // defpackage.aalw
    public final atda b(atda atdaVar, Object obj) {
        atdaVar.getClass();
        apxf dl = adyu.dl(atdaVar);
        if (dl == null || !dl.pY(OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.offlinePlaylistEndpoint)) {
            return null;
        }
        OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint = (OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint) dl.pX(OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.offlinePlaylistEndpoint);
        if (offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.c.isEmpty()) {
            return null;
        }
        if ((this.c.i(offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.c) ? ((agof) this.b.get()).a().i().d(offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.c) : null) == null) {
            return c(atdaVar, 2, R.string.add_playlist_to_offline, arfr.OFFLINE_DOWNLOAD);
        }
        return c(atdaVar, 3, R.string.remove_offline, arfr.OFFLINE_REMOVE);
    }
}
