package defpackage;

import com.google.protos.youtube.api.innertube.ApplicationSettingsEndpointOuterClass;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
import com.google.protos.youtube.api.innertube.DownloadsPageEndpointOuterClass;
import com.google.protos.youtube.api.innertube.OfflineEndpointOuterClass;
import com.google.protos.youtube.api.innertube.PlaylistEditorEndpointOuterClass$PlaylistEditorEndpoint;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import com.google.protos.youtube.api.innertube.SearchEndpointOuterClass;
import com.google.protos.youtube.api.innertube.UrlEndpointOuterClass;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aahf implements aags {
    private final /* synthetic */ int a;

    public aahf(int i) {
        this.a = i;
    }

    @Override // defpackage.aags
    public final boolean a(apxf apxfVar, apxf apxfVar2) {
        if (this.a == 0) {
            if (apxfVar.pY(ApplicationSettingsEndpointOuterClass.applicationSettingsEndpoint) && apxfVar2.pY(ApplicationSettingsEndpointOuterClass.applicationSettingsEndpoint)) {
                return true;
            }
            if (!apxfVar.pY(BrowseEndpointOuterClass.browseEndpoint) || !apxfVar2.pY(BrowseEndpointOuterClass.browseEndpoint)) {
                if (apxfVar.pY(OfflineEndpointOuterClass.offlineEndpoint) && apxfVar2.pY(OfflineEndpointOuterClass.offlineEndpoint)) {
                    return true;
                }
                if (!apxfVar.pY(SearchEndpointOuterClass.searchEndpoint) || !apxfVar2.pY(SearchEndpointOuterClass.searchEndpoint)) {
                    if (!apxfVar.pY(UrlEndpointOuterClass.urlEndpoint) || !apxfVar2.pY(UrlEndpointOuterClass.urlEndpoint)) {
                        if (apxfVar.pY(WatchEndpointOuterClass.watchEndpoint) && apxfVar2.pY(WatchEndpointOuterClass.watchEndpoint)) {
                            awdp awdpVar = (awdp) apxfVar.pX(WatchEndpointOuterClass.watchEndpoint);
                            awdp awdpVar2 = (awdp) apxfVar2.pX(WatchEndpointOuterClass.watchEndpoint);
                            if (awdpVar.g.equals(awdpVar2.g) && awdpVar.l.equals(awdpVar2.l) && Float.compare(awdpVar.k, awdpVar2.k) == 0 && Float.compare(awdpVar.j, awdpVar2.j) == 0 && awdpVar.h == awdpVar2.h && awdpVar.f == awdpVar2.f && awdpVar.d.equals(awdpVar2.d) && awdpVar.e.equals(awdpVar2.e)) {
                                return true;
                            }
                        }
                    } else {
                        return ((avuo) apxfVar.pX(UrlEndpointOuterClass.urlEndpoint)).c.equals(((avuo) apxfVar2.pX(UrlEndpointOuterClass.urlEndpoint)).c);
                    }
                } else {
                    aunn aunnVar = (aunn) apxfVar.pX(SearchEndpointOuterClass.searchEndpoint);
                    aunn aunnVar2 = (aunn) apxfVar2.pX(SearchEndpointOuterClass.searchEndpoint);
                    if (aunnVar.c.equals(aunnVar2.c) && aunnVar.d.equals(aunnVar2.d)) {
                        return true;
                    }
                }
            } else {
                aplt apltVar = (aplt) apxfVar.pX(BrowseEndpointOuterClass.browseEndpoint);
                aplt apltVar2 = (aplt) apxfVar2.pX(BrowseEndpointOuterClass.browseEndpoint);
                if (apltVar.c.equals(apltVar2.c) && apltVar.f == apltVar2.f && apltVar.d.equals(apltVar2.d)) {
                    return true;
                }
            }
            return false;
        }
        if (!apxfVar.pY(PlaylistEditorEndpointOuterClass$PlaylistEditorEndpoint.playlistEditorEndpoint) || !apxfVar2.pY(PlaylistEditorEndpointOuterClass$PlaylistEditorEndpoint.playlistEditorEndpoint)) {
            if (!apxfVar.pY(DownloadsPageEndpointOuterClass.downloadsPageEndpoint) || !apxfVar2.pY(DownloadsPageEndpointOuterClass.downloadsPageEndpoint)) {
                if (apxfVar.pY(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint) && apxfVar2.pY(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) {
                    ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint = (ReelWatchEndpointOuterClass$ReelWatchEndpoint) apxfVar.pX(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
                    ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint2 = (ReelWatchEndpointOuterClass$ReelWatchEndpoint) apxfVar2.pX(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
                    int bd = anaf.bd(reelWatchEndpointOuterClass$ReelWatchEndpoint.c);
                    if (bd != 0 && bd == 3) {
                        return true;
                    }
                    int bd2 = anaf.bd(reelWatchEndpointOuterClass$ReelWatchEndpoint2.c);
                    return (bd2 != 0 && bd2 == 3) || reelWatchEndpointOuterClass$ReelWatchEndpoint.d.equals(reelWatchEndpointOuterClass$ReelWatchEndpoint2.d);
                }
            } else {
                aqnf b = aqnf.b(((aqng) apxfVar.pX(DownloadsPageEndpointOuterClass.downloadsPageEndpoint)).c);
                if (b == null) {
                    b = aqnf.FILTER_TYPE_UNSPECIFIED;
                }
                aqnf b2 = aqnf.b(((aqng) apxfVar2.pX(DownloadsPageEndpointOuterClass.downloadsPageEndpoint)).c);
                if (b2 == null) {
                    b2 = aqnf.FILTER_TYPE_UNSPECIFIED;
                }
                if (b == b2) {
                    return true;
                }
            }
            return false;
        }
        return ((PlaylistEditorEndpointOuterClass$PlaylistEditorEndpoint) apxfVar.pX(PlaylistEditorEndpointOuterClass$PlaylistEditorEndpoint.playlistEditorEndpoint)).b.equals(((PlaylistEditorEndpointOuterClass$PlaylistEditorEndpoint) apxfVar2.pX(PlaylistEditorEndpointOuterClass$PlaylistEditorEndpoint.playlistEditorEndpoint)).b);
    }
}
