package defpackage;

import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jwy implements jwc {
    private final ysy a;
    private final fjm b;
    private final agel c;
    private final azrw d;
    private final agzr e;
    private final /* synthetic */ int f;

    public jwy(ysy ysyVar, fjm fjmVar, agel agelVar, azrw azrwVar, agzr agzrVar, int i) {
        this.f = i;
        this.a = ysyVar;
        this.b = fjmVar;
        this.c = agelVar;
        this.d = azrwVar;
        this.e = agzrVar;
    }

    @Override // defpackage.jwc
    public final ammv a(agnq agnqVar, agnu agnuVar, aryi aryiVar) {
        int bT;
        int i = this.f;
        Integer valueOf = Integer.valueOf(R.string.downloaded_video_pending_wifi_or_unmetered);
        Integer valueOf2 = Integer.valueOf(R.string.downloaded_video_renewing);
        Integer valueOf3 = Integer.valueOf(R.string.downloaded_video_pending_wifi);
        Integer valueOf4 = Integer.valueOf(R.string.downloaded_video_error_generic);
        Integer valueOf5 = Integer.valueOf(R.string.downloaded_video_paused);
        Integer valueOf6 = Integer.valueOf(R.string.downloaded_video_pending_storage);
        Integer valueOf7 = Integer.valueOf(R.string.downloaded_video_pending_network);
        Integer valueOf8 = Integer.valueOf(R.string.downloaded_video_waiting);
        if (i == 0) {
            agnq agnqVar2 = agnq.DELETED;
            switch (agnqVar.ordinal()) {
                case 4:
                    return ammv.j(valueOf8);
                case 5:
                    return ammv.j(Integer.valueOf(R.string.downloaded_video_pending_approval_online_context));
                case 6:
                    return ammv.j(valueOf7);
                case 7:
                    if (!this.e.c() || !this.c.a() || ((agsg) this.d.get()).w() != awwg.UNMETERED_WIFI_OR_UNMETERED_MOBILE) {
                        return ammv.j(valueOf3);
                    }
                    return ammv.j(valueOf);
                case 8:
                case 11:
                case 14:
                case 18:
                case 21:
                default:
                    return amlr.a;
                case 9:
                    return ammv.j(valueOf6);
                case 10:
                    return ammv.j(valueOf5);
                case 12:
                case 15:
                case 16:
                    return ammv.j(Integer.valueOf(R.string.downloaded_video_error_unplayable_online_context));
                case 13:
                    return ammv.j(Integer.valueOf(R.string.downloaded_video_error_streams_missing_online_context));
                case 17:
                    if (!this.b.a || !this.a.o()) {
                        return ammv.j(Integer.valueOf(R.string.downloaded_video_error_expired_online_context));
                    }
                    return ammv.j(valueOf2);
                case 19:
                    return ammv.j(Integer.valueOf(R.string.downloaded_video_error_network_online_context));
                case 20:
                    return ammv.j(Integer.valueOf(R.string.downloaded_video_error_disk_online_context));
                case 22:
                    return ammv.j(valueOf4);
            }
        }
        boolean o = this.a.o();
        agnq agnqVar3 = agnq.DELETED;
        switch (agnqVar.ordinal()) {
            case 4:
                return ammv.j(valueOf8);
            case 5:
                return ammv.j(Integer.valueOf(R.string.downloaded_video_pending_approval_download_context));
            case 6:
                return ammv.j(valueOf7);
            case 7:
                if (!this.e.c() || !this.c.a() || ((agsg) this.d.get()).w() != awwg.UNMETERED_WIFI_OR_UNMETERED_MOBILE) {
                    return ammv.j(valueOf3);
                }
                return ammv.j(valueOf);
            case 8:
            case 11:
            case 14:
            case 18:
            default:
                return amlr.a;
            case 9:
                return ammv.j(valueOf6);
            case 10:
                return ammv.j(valueOf5);
            case 12:
                if (aryiVar == null) {
                    return ammv.j(Integer.valueOf(R.string.downloaded_video_error_unplayable_download_context));
                }
                int bG = anaf.bG(aryiVar.c);
                if (bG == 0) {
                    bG = 1;
                }
                int i2 = bG - 1;
                if (i2 == 4) {
                    return ammv.j(Integer.valueOf(R.string.downloaded_video_error_unplayable_content_check_download_context));
                }
                if (i2 == 5) {
                    return ammv.j(Integer.valueOf(R.string.downloaded_video_error_unplayable_age_check_download_context));
                }
                return ammv.j(Integer.valueOf(R.string.downloaded_video_error_unplayable_download_context));
            case 13:
                return ammv.j(Integer.valueOf(R.string.downloaded_video_error_streams_missing_download_context));
            case 15:
            case 16:
                return ammv.j(Integer.valueOf(R.string.downloaded_video_error_unplayable_download_context));
            case 17:
                boolean z = this.b.a;
                if (agnuVar != null && (bT = anaf.bT(agnuVar.b.j)) != 0 && bT == 4) {
                    return ammv.j(Integer.valueOf(R.string.downloaded_video_error_expired_travel_download_context));
                }
                if (!o) {
                    return ammv.j(Integer.valueOf(R.string.downloaded_video_error_expired_disconnected_download_context));
                }
                if (z) {
                    return ammv.j(valueOf2);
                }
                return ammv.j(Integer.valueOf(R.string.downloaded_video_error_expired_connected_download_context));
            case 19:
                if (o) {
                    return ammv.j(Integer.valueOf(R.string.downloaded_video_error_network_connected_download_context));
                }
                return ammv.j(Integer.valueOf(R.string.downloaded_video_error_network_disconnected_download_context));
            case 20:
                return ammv.j(Integer.valueOf(R.string.downloaded_video_error_disk_download_context));
            case 21:
                return ammv.j(Integer.valueOf(R.string.downloaded_video_temp_error_disk_sd_card_download_context));
            case 22:
                return ammv.j(valueOf4);
        }
    }
}
