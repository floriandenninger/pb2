package defpackage;

import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
import com.google.protos.youtube.api.innertube.DownloadsPageEndpointOuterClass;
import com.google.protos.youtube.api.innertube.OfflineEndpointOuterClass;
import com.google.protos.youtube.api.innertube.OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint;
import com.google.protos.youtube.api.innertube.OfflineVideoEndpointOuterClass$OfflineVideoEndpoint;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fia {
    public static final apxf a;

    static {
        aong aongVar = (aong) apxf.a.createBuilder();
        aongVar.e(DownloadsPageEndpointOuterClass.downloadsPageEndpoint, aqng.a);
        a = (apxf) aongVar.build();
    }

    public static apxf a(String str) {
        zhq.m(str);
        aone createBuilder = atpb.a.createBuilder();
        createBuilder.copyOnWrite();
        atpb atpbVar = (atpb) createBuilder.instance;
        str.getClass();
        atpbVar.b |= 2;
        atpbVar.c = str;
        atpb atpbVar2 = (atpb) createBuilder.build();
        aong aongVar = (aong) apxf.a.createBuilder();
        aongVar.e(OfflineEndpointOuterClass.offlineEndpoint, atpbVar2);
        return (apxf) aongVar.build();
    }

    public static boolean b(apxf apxfVar) {
        return apxfVar.pY(DownloadsPageEndpointOuterClass.downloadsPageEndpoint);
    }

    public static boolean c(apxf apxfVar, azrw azrwVar) {
        return apxfVar.pY(BrowseEndpointOuterClass.browseEndpoint) && evr.e(((aplt) apxfVar.pX(BrowseEndpointOuterClass.browseEndpoint)).c) && ((fjs) azrwVar.get()).i(evr.d(((aplt) apxfVar.pX(BrowseEndpointOuterClass.browseEndpoint)).c));
    }

    public static apxf d(String str) {
        zhq.m(str);
        aone createBuilder = OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.a.createBuilder();
        createBuilder.copyOnWrite();
        OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint = (OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint) createBuilder.instance;
        offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.b |= 1;
        offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.c = str;
        createBuilder.copyOnWrite();
        OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint2 = (OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint) createBuilder.instance;
        offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint2.d = 0;
        offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint2.b |= 2;
        OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint3 = (OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint) createBuilder.build();
        aong aongVar = (aong) apxf.a.createBuilder();
        aongVar.e(OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.offlinePlaylistEndpoint, offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint3);
        return (apxf) aongVar.build();
    }

    public static apxf e(String str, String str2) {
        zhq.m(str);
        aone createBuilder = OfflineVideoEndpointOuterClass$OfflineVideoEndpoint.a.createBuilder();
        createBuilder.copyOnWrite();
        OfflineVideoEndpointOuterClass$OfflineVideoEndpoint offlineVideoEndpointOuterClass$OfflineVideoEndpoint = (OfflineVideoEndpointOuterClass$OfflineVideoEndpoint) createBuilder.instance;
        str.getClass();
        offlineVideoEndpointOuterClass$OfflineVideoEndpoint.c = 1;
        offlineVideoEndpointOuterClass$OfflineVideoEndpoint.d = str;
        if (!ammx.e(str2)) {
            createBuilder.copyOnWrite();
            OfflineVideoEndpointOuterClass$OfflineVideoEndpoint offlineVideoEndpointOuterClass$OfflineVideoEndpoint2 = (OfflineVideoEndpointOuterClass$OfflineVideoEndpoint) createBuilder.instance;
            str2.getClass();
            offlineVideoEndpointOuterClass$OfflineVideoEndpoint2.b |= 4;
            offlineVideoEndpointOuterClass$OfflineVideoEndpoint2.e = str2;
        }
        createBuilder.copyOnWrite();
        OfflineVideoEndpointOuterClass$OfflineVideoEndpoint offlineVideoEndpointOuterClass$OfflineVideoEndpoint3 = (OfflineVideoEndpointOuterClass$OfflineVideoEndpoint) createBuilder.instance;
        offlineVideoEndpointOuterClass$OfflineVideoEndpoint3.f = 0;
        offlineVideoEndpointOuterClass$OfflineVideoEndpoint3.b |= 8;
        aong aongVar = (aong) apxf.a.createBuilder();
        aongVar.e(OfflineVideoEndpointOuterClass$OfflineVideoEndpoint.offlineVideoEndpoint, (OfflineVideoEndpointOuterClass$OfflineVideoEndpoint) createBuilder.build());
        return (apxf) aongVar.build();
    }
}
