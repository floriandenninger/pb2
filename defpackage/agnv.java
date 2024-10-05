package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.youtube.R;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agnv implements agmv {
    public final agnp a;
    public final atrx b;
    public final int c;
    public final byte[] d;
    public final boolean e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final agnu j;
    public final aryi k;
    public final agnf l;
    public final agno m;
    public final agnn n;
    public final agnz o;
    public final PlayerResponseModel p;

    public agnv(agnp agnpVar, atrx atrxVar, int i, byte[] bArr, boolean z, long j, long j2, long j3, long j4, agnu agnuVar, aryi aryiVar, agnf agnfVar, agno agnoVar, agnn agnnVar, agnz agnzVar, PlayerResponseModel playerResponseModel) {
        agnpVar.getClass();
        this.a = agnpVar;
        this.b = atrxVar;
        this.c = i;
        this.d = bArr;
        this.e = z;
        this.f = j;
        this.g = j2;
        this.h = j3;
        this.i = j4;
        this.j = agnuVar;
        this.k = aryiVar;
        this.l = agnfVar;
        this.m = agnoVar;
        this.n = agnnVar;
        this.o = agnzVar;
        this.p = playerResponseModel;
    }

    public final boolean A() {
        return this.l == agnf.ACTIVE;
    }

    public final boolean B() {
        agnz agnzVar;
        return A() && (agnzVar = this.o) != null && agnzVar.b();
    }

    public final boolean C() {
        return this.l == agnf.PAUSED;
    }

    public final boolean D() {
        agnz agnzVar;
        return A() && (agnzVar = this.o) != null && agnzVar.b == avjo.TRANSFER_STATE_TRANSFER_IN_QUEUE;
    }

    public final boolean E() {
        return this.l == agnf.STREAM_DOWNLOAD_PENDING;
    }

    @Override // defpackage.agmv
    public final boolean a() {
        agnn agnnVar = this.n;
        return agnnVar == null || agnnVar.e;
    }

    @Override // defpackage.agmv
    public final boolean b() {
        return this.l == agnf.COMPLETE;
    }

    public final int c() {
        if (d() > 0) {
            return (int) ((e() * 100) / d());
        }
        return 0;
    }

    public final long d() {
        agnn agnnVar = this.n;
        if (agnnVar == null) {
            return 0L;
        }
        return agnnVar.d;
    }

    public final long e() {
        agnn agnnVar = this.n;
        if (agnnVar == null) {
            return 0L;
        }
        return agnnVar.c;
    }

    public final long f() {
        agnu agnuVar = this.j;
        if (agnuVar == null || !agnuVar.g()) {
            return this.a.a();
        }
        return 0L;
    }

    public final Uri g() {
        agnp agnpVar;
        aami aamiVar;
        agnu agnuVar = this.j;
        if ((agnuVar != null && agnuVar.g()) || (aamiVar = (agnpVar = this.a).b) == null || aamiVar.a.isEmpty()) {
            return null;
        }
        return agnpVar.b.c(240).a();
    }

    public final agnb h() {
        agnu agnuVar = this.j;
        if (agnuVar == null || !agnuVar.g()) {
            return this.a.a;
        }
        return null;
    }

    @Deprecated
    public final agnq i() {
        agnz agnzVar;
        if (u()) {
            if (E()) {
                return agnq.TRANSFER_PENDING_USER_APPROVAL;
            }
            if (r()) {
                return agnq.ERROR_PENDING_PLAYABILITY_ACTION;
            }
            if (w()) {
                return agnq.ERROR_NOT_PLAYABLE;
            }
            if (this.j != null && x()) {
                if (this.j.f()) {
                    return agnq.ERROR_EXPIRED;
                }
                return agnq.ERROR_POLICY;
            }
            if (!a()) {
                return agnq.ERROR_STREAMS_MISSING;
            }
            if (this.l == agnf.STREAMS_OUT_OF_DATE) {
                return agnq.ERROR_STREAMS_OUT_OF_DATE;
            }
            agnq agnqVar = agnq.DELETED;
            int ordinal = this.l.ordinal();
            return ordinal != 5 ? ordinal != 6 ? agnq.ERROR_GENERIC : agnq.ERROR_NETWORK : agnq.ERROR_DISK;
        }
        if (b()) {
            return agnq.PLAYABLE;
        }
        if (s()) {
            return agnq.CANDIDATE;
        }
        if (C()) {
            return agnq.TRANSFER_PAUSED;
        }
        if (B()) {
            if (z()) {
                return agnq.ERROR_DISK_SD_CARD;
            }
            return agnq.TRANSFER_IN_PROGRESS;
        }
        if (D() && (agnzVar = this.o) != null) {
            int i = agnzVar.c;
            if ((i & 2) != 0) {
                return agnq.TRANSFER_PENDING_NETWORK;
            }
            if ((i & 8) != 0) {
                return agnq.TRANSFER_PENDING_WIFI;
            }
            if ((i & 4096) != 0) {
                return agnq.TRANSFER_PENDING_STORAGE;
            }
        }
        return agnq.TRANSFER_WAITING_IN_QUEUE;
    }

    public final atsb j() {
        agnp agnpVar = this.a;
        atqw atqwVar = agnpVar.e.p;
        if (atqwVar == null) {
            atqwVar = atqw.a;
        }
        if ((atqwVar.b & 1) == 0) {
            return null;
        }
        atqw atqwVar2 = agnpVar.e.p;
        if (atqwVar2 == null) {
            atqwVar2 = atqw.a;
        }
        atsb atsbVar = atqwVar2.c;
        return atsbVar == null ? atsb.a : atsbVar;
    }

    public final avgg k() {
        agnu agnuVar = this.j;
        if (agnuVar == null || !agnuVar.g()) {
            return this.a.d();
        }
        return null;
    }

    public final String l(agnq agnqVar, Context context) {
        aryi aryiVar = this.k;
        agnu agnuVar = this.j;
        int c = c();
        agnq agnqVar2 = agnq.DELETED;
        agnf agnfVar = agnf.DELETED;
        switch (agnqVar.ordinal()) {
            case 0:
                return context.getString(R.string.offline_video_deleted);
            case 1:
            case 2:
                return "";
            case 3:
                return context.getString(R.string.offline_adding_progress, Integer.valueOf(c));
            case 4:
                return context.getString(R.string.offline_waiting, Integer.valueOf(c));
            case 5:
                return context.getString(R.string.offline_stream_pending);
            case 6:
                return context.getString(R.string.offline_waiting_for_network);
            case 7:
                return context.getString(R.string.offline_waiting_for_wifi);
            case 8:
                return context.getString(R.string.offline_waiting_tap_here);
            case 9:
                return context.getString(R.string.offline_waiting_for_space);
            case 10:
                return context.getString(R.string.offline_paused, Integer.valueOf(c));
            case 11:
            case 18:
            default:
                return context.getString(R.string.offline_failed);
            case 12:
                if (aryiVar != null) {
                    return aryiVar.d;
                }
                return context.getString(R.string.offline_failed);
            case 13:
                return context.getString(R.string.offline_failed_file_not_found);
            case 14:
                return context.getString(R.string.offline_stream_out_of_date);
            case 15:
                if (agnuVar != null) {
                    atqq atqqVar = agnuVar.b;
                    if ((atqqVar.b & 16) != 0) {
                        return atqqVar.i;
                    }
                }
                return (aryiVar == null || (aryiVar.b & 2) == 0 || aryiVar.d.isEmpty()) ? context.getString(R.string.offline_video_not_playable) : aryiVar.d;
            case 16:
                if (agnuVar != null) {
                    atqq atqqVar2 = agnuVar.b;
                    if ((atqqVar2.b & 16) != 0) {
                        return atqqVar2.i;
                    }
                }
                return context.getString(R.string.offline_failed);
            case 17:
                return context.getString(R.string.offline_expired);
            case 19:
                return context.getString(R.string.offline_failed_network_error);
            case 20:
                return context.getString(R.string.offline_failed_disk_error);
            case 21:
                return context.getString(R.string.offline_temp_disk_error_sd_card);
        }
    }

    public final String m() {
        return this.a.f();
    }

    public final String n() {
        agnu agnuVar = this.j;
        return (agnuVar == null || !agnuVar.g()) ? this.a.g() : "";
    }

    public final String o(Context context) {
        agnu agnuVar = this.j;
        return (agnuVar == null || !agnuVar.g()) ? this.a.j() : context.getString(R.string.expired_video_title);
    }

    public final boolean p() {
        agnu agnuVar = this.j;
        return (agnuVar == null || agnuVar.e() == null || this.l == agnf.DELETED || this.l == agnf.CANNOT_OFFLINE) ? false : true;
    }

    public final boolean q(adxr adxrVar) {
        FormatStreamModel c;
        agnn agnnVar = this.n;
        if (agnnVar != null && (c = agnnVar.c()) != null) {
            if (TimeUnit.MICROSECONDS.toSeconds(adxrVar.a(c, 0L)) >= this.h) {
                return true;
            }
        }
        return false;
    }

    public final boolean r() {
        return w() && ahbx.m(this.k);
    }

    public final boolean s() {
        return this.l == agnf.METADATA_ONLY;
    }

    public final boolean t() {
        agnu agnuVar = this.j;
        return !(agnuVar == null || agnuVar.h()) || this.l == agnf.CANNOT_OFFLINE;
    }

    @Deprecated
    public final boolean u() {
        return (A() || C() || s() || (!x() && !w() && b() && a())) ? false : true;
    }

    public final boolean v() {
        agnn agnnVar;
        if (!u() && (agnnVar = this.n) != null) {
            agnm agnmVar = agnnVar.b;
            agnm agnmVar2 = agnnVar.a;
            if (agnmVar != null && agnmVar.i() && agnmVar2 != null && agnmVar2.d > 0 && !agnmVar2.i()) {
                return true;
            }
        }
        return false;
    }

    public final boolean w() {
        aryi aryiVar = this.k;
        return (aryiVar == null || ahbx.l(aryiVar)) ? false : true;
    }

    public final boolean x() {
        agnu agnuVar = this.j;
        return (agnuVar == null || agnuVar.i()) ? false : true;
    }

    public final boolean y() {
        return (A() || x() || C() || this.l == agnf.CANNOT_OFFLINE || b()) ? false : true;
    }

    public final boolean z() {
        agnz agnzVar = this.o;
        return agnzVar != null && agnzVar.g.l("sd_card_offline_disk_error");
    }
}
