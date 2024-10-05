package defpackage;

import android.content.Context;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.youtube.R;
import j$.time.Duration;
import j$.time.Instant;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jpf {
    static final long a = TimeUnit.DAYS.toMillis(30);
    static final long b = TimeUnit.HOURS.toMillis(12);
    public final Context c;
    public final shf d;
    private final ysy e;
    private final fjm f;
    private final agsm g;
    private final azrw h;
    private final azrw i;
    private final agel j;
    private final aaea k;
    private final agzr l;
    private final axzf m;

    public jpf(Context context, shf shfVar, ysy ysyVar, fjm fjmVar, agsm agsmVar, azrw azrwVar, azrw azrwVar2, agel agelVar, aaea aaeaVar, agzr agzrVar, axzf axzfVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.c = context;
        this.d = shfVar;
        this.e = ysyVar;
        this.f = fjmVar;
        this.g = agsmVar;
        this.h = azrwVar;
        this.i = azrwVar2;
        this.j = agelVar;
        this.k = aaeaVar;
        this.l = agzrVar;
        this.m = axzfVar;
    }

    public static aqpd e(aqoz aqozVar) {
        String g = aalt.g(aqozVar.d());
        if (ammx.e(g)) {
            return null;
        }
        for (aqpd aqpdVar : aqozVar.getLicenses()) {
            if ((aqpdVar.b & 128) != 0 && aqpdVar.i.equals(g)) {
                return aqpdVar;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static avxt f(jps jpsVar) {
        jps jpsVar2 = jps.PLAYABLE;
        switch (jpsVar) {
            case PLAYABLE:
                return avxt.DOWNLOAD_STATE_COMPLETE;
            case TRANSFER_PENDING_USER_APPROVAL:
            case ERROR_PENDING_PLAYABILITY_ACTION:
            case ERROR_NOT_PLAYABLE:
            case ERROR_POLICY:
            case ERROR_EXPIRED:
            case ERROR_DISK:
            case ERROR_DISK_SD_CARD:
            case ERROR_STREAMS_MISSING:
            case ERROR_EXPIRED_RENTAL:
            case ERROR_GENERIC:
                return avxt.DOWNLOAD_STATE_FAILED;
            case TRANSFER_IN_PROGRESS:
                return avxt.DOWNLOAD_STATE_DOWNLOAD_IN_PROGRESS;
            case TRANSFER_WAITING_IN_QUEUE:
                return avxt.DOWNLOAD_STATE_PENDING_DOWNLOAD;
            case TRANSFER_PAUSED:
                return avxt.DOWNLOAD_STATE_PAUSED;
            default:
                zga.b("Unrecognized video display state, defaulting to unknown.");
                return avxt.DOWNLOAD_STATE_UNKNOWN;
        }
    }

    public static final float p(atxb atxbVar) {
        amru s = s(atxbVar);
        int i = ((amvj) s).c;
        long j = 0;
        long j2 = 0;
        for (int i2 = 0; i2 < i; i2++) {
            auyr auyrVar = (auyr) s.get(i2);
            j += auyrVar.d;
            j2 += auyrVar.c;
        }
        if (j > 0) {
            return ((float) j2) / ((float) j);
        }
        return 0.0f;
    }

    public static final boolean q(atre atreVar) {
        int bW;
        return (atreVar == null || (bW = anaf.bW(atreVar.getOfflineFutureUnplayableInfo().d)) == 0 || bW != 2) ? false : true;
    }

    private final jps r(atxb atxbVar, atre atreVar) {
        aqoz b2 = atxbVar != null ? atxbVar.b() : null;
        avjs g = atxbVar != null ? atxbVar.g() : null;
        avjo transferState = g != null ? g.getTransferState() : null;
        avjp failureReason = g != null ? g.getFailureReason() : null;
        aryi aryiVar = t(atxbVar).f;
        if (aryiVar == null) {
            aryiVar = aryi.a;
        }
        aryi aryiVar2 = aryiVar;
        List streamProgress = g != null ? g.getStreamProgress() : amru.q();
        if (v(transferState, atreVar, aryiVar2, streamProgress, b2)) {
            if (!w(aryiVar2) || !ahbx.m(aryiVar2)) {
                if (w(aryiVar2)) {
                    return jps.ERROR_NOT_PLAYABLE;
                }
                if (x(atreVar, b2)) {
                    if (k(atreVar, b2)) {
                        return jps.ERROR_EXPIRED;
                    }
                    return jps.ERROR_POLICY;
                }
                if (!y(streamProgress)) {
                    if (!avjo.TRANSFER_STATE_FAILED.equals(transferState) || !avjp.TRANSFER_FAILURE_REASON_FILESYSTEM_WRITE.equals(failureReason)) {
                        if (z(transferState)) {
                            return jps.ERROR_GENERIC;
                        }
                    } else {
                        return jps.ERROR_DISK;
                    }
                } else {
                    return jps.ERROR_STREAMS_MISSING;
                }
            } else {
                return jps.ERROR_PENDING_PLAYABILITY_ACTION;
            }
        } else if (!avjo.TRANSFER_STATE_COMPLETE.equals(transferState) && (g == null || p(atxbVar) != 1.0f)) {
            if (avjo.TRANSFER_STATE_PAUSED_BY_USER.equals(transferState)) {
                return jps.TRANSFER_PAUSED;
            }
            if (avjo.TRANSFER_STATE_TRANSFERRING.equals(transferState)) {
                if (!avjo.TRANSFER_STATE_TRANSFERRING.equals(transferState) || !avjp.TRANSFER_FAILURE_REASON_EXTERNAL_FILESYSTEM_WRITE.equals(failureReason)) {
                    return jps.TRANSFER_IN_PROGRESS;
                }
                return jps.ERROR_DISK_SD_CARD;
            }
        } else {
            return jps.PLAYABLE;
        }
        return jps.TRANSFER_WAITING_IN_QUEUE;
    }

    private static amru s(atxb atxbVar) {
        amru amruVar;
        amrp f = amru.f();
        if (atxbVar != null) {
            avjs g = atxbVar.g();
            if (g != null) {
                f.j(g.getStreamProgress());
            }
            try {
                amrp amrpVar = new amrp();
                Iterator it = atxbVar.c.j.iterator();
                while (it.hasNext()) {
                    aakt b2 = atxbVar.b.b((String) it.next());
                    if (b2 != null) {
                        if (b2 instanceof aoxm) {
                            amrpVar.h((aoxm) b2);
                        } else {
                            String valueOf = String.valueOf(b2);
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 42);
                            sb.append("Entity ");
                            sb.append(valueOf);
                            sb.append(" is not a AdPlaybackDataEntityModel");
                            throw new IllegalArgumentException(sb.toString());
                        }
                    }
                }
                amruVar = amrpVar.g();
            } catch (IllegalArgumentException unused) {
                amruVar = null;
            }
            if (amruVar != null) {
                int i = ((amvj) amruVar).c;
                for (int i2 = 0; i2 < i; i2++) {
                    aoxm aoxmVar = (aoxm) amruVar.get(i2);
                    aakt b3 = aoxmVar.b.b(aoxmVar.c.e);
                    boolean z = true;
                    if (b3 != null && !(b3 instanceof avjs)) {
                        z = false;
                    }
                    amkq.O(z, "entityFromStore is not instance of TransferEntityModel, key=transfer");
                    avjs avjsVar = (avjs) b3;
                    if (avjsVar != null) {
                        f.j(avjsVar.getStreamProgress());
                    }
                }
            }
        }
        return f.g();
    }

    private static aryr t(atxb atxbVar) {
        aryr aryrVar;
        return (atxbVar == null || (aryrVar = (aryr) aarr.c(atxbVar.getPlayerResponseBytes().I(), aryr.a)) == null) ? aryr.a : aryrVar;
    }

    private static atqq u(atre atreVar) {
        try {
            return (atqq) aonm.parseFrom(atqq.a, atreVar.getOfflineStateBytes(), aomw.b());
        } catch (aoob e) {
            zga.d("Failed to get Offline State.", e);
            return atqq.a;
        }
    }

    private final boolean v(avjo avjoVar, atre atreVar, aryi aryiVar, List list, aqoz aqozVar) {
        return z(avjoVar) || x(atreVar, aqozVar) || w(aryiVar) || y(list);
    }

    private static boolean w(aryi aryiVar) {
        return !ahbx.l(aryiVar);
    }

    private final boolean x(atre atreVar, aqoz aqozVar) {
        return atreVar != null && (!atreVar.getAction().equals(atrb.OFFLINE_VIDEO_POLICY_ACTION_OK) || k(atreVar, aqozVar));
    }

    private static boolean y(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int ak = aobq.ak(((auyr) it.next()).f);
            if (ak != 0 && ak == 4) {
                return true;
            }
        }
        return false;
    }

    private static boolean z(avjo avjoVar) {
        return avjo.TRANSFER_STATE_FAILED.equals(avjoVar) || avjo.TRANSFER_STATE_UNKNOWN.equals(avjoVar);
    }

    public final long a(atre atreVar) {
        if (atreVar.getOfflineFutureUnplayableInfo() == null || atreVar.getOfflineFutureUnplayableInfo().c < 0) {
            return 0L;
        }
        return Math.max((atreVar.getLastUpdatedTimestampSeconds().longValue() + atreVar.getOfflineFutureUnplayableInfo().c) - TimeUnit.MILLISECONDS.toSeconds(this.d.c()), 0L);
    }

    public final jps b(asxs asxsVar) {
        asxn b2 = asxsVar.b();
        atxb b3 = b2 != null ? b2.b() : null;
        return r(b3, b3 != null ? b3.f() : null);
    }

    public final jps c(awil awilVar) {
        return r(awilVar.f(), awilVar.b());
    }

    public final ammv d(awil awilVar) {
        if (this.m.l()) {
            atre b2 = awilVar.b();
            if (b2 == null || (b2.b.c & 64) == 0) {
                atxb f = awilVar.f();
                if (b2 != null && p(f) == 1.0f && (b2.b.c & 16) != 0 && q(b2) && a(b2) == 0) {
                    if ((b2.getOfflineFutureUnplayableInfo().b & 4) == 0) {
                        return amlr.a;
                    }
                    atpf atpfVar = b2.getOfflineFutureUnplayableInfo().e;
                    if (atpfVar == null) {
                        atpfVar = atpf.a;
                    }
                    return ammv.j(atpfVar);
                }
            } else {
                return ammv.j(b2.getOnTapCommandOverrideData());
            }
        }
        return amlr.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0312  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String g(defpackage.jps r17, defpackage.atxb r18, defpackage.atre r19) {
        /*
            Method dump skipped, instructions count: 878
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jpf.g(jps, atxb, atre):java.lang.String");
    }

    public final String h(long j) {
        if (j == 0) {
            return "";
        }
        long c = this.d.c();
        long j2 = c - j;
        if (j2 < 0) {
            return "";
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(c);
        long j3 = ((calendar2.get(1) - calendar.get(1)) * 12) + (calendar2.get(2) - calendar.get(2));
        if (calendar2.get(5) < calendar.get(5)) {
            j3--;
        }
        if (j3 >= 12) {
            return ace.d(this.c, R.string.years_ago, "count", Long.valueOf(j3 / 12));
        }
        if (j3 > 0) {
            return ace.d(this.c, R.string.months_ago, "count", Long.valueOf(j3));
        }
        long days = TimeUnit.MILLISECONDS.toDays(j2);
        long j4 = days / 7;
        if (j4 > 0) {
            return ace.d(this.c, R.string.weeks_ago, "count", Long.valueOf(j4));
        }
        if (days > 0) {
            return ace.d(this.c, R.string.days_ago, "count", Long.valueOf(days));
        }
        long hours = TimeUnit.MILLISECONDS.toHours(j2);
        if (hours > 0) {
            return ace.d(this.c, R.string.hours_ago, "count", Long.valueOf(hours));
        }
        long minutes = TimeUnit.MILLISECONDS.toMinutes(j2);
        if (minutes > 0) {
            return ace.d(this.c, R.string.minutes_ago, "count", Long.valueOf(minutes));
        }
        return ace.d(this.c, R.string.seconds_ago, "count", Long.valueOf(Math.max(1L, TimeUnit.MILLISECONDS.toSeconds(j2))));
    }

    public final String i(long j, boolean z) {
        int x = fav.x(j);
        if (x <= 60) {
            if (z) {
                return this.c.getResources().getQuantityString(R.plurals.download_video_unplayable_future_minutes_plural, x, Integer.valueOf(x));
            }
            return this.c.getResources().getQuantityString(R.plurals.download_playlist_unplayable_future_minutes_plural, x, Integer.valueOf(x));
        }
        int w = fav.w(j);
        if (w <= 24) {
            if (z) {
                return this.c.getResources().getQuantityString(R.plurals.download_video_unplayable_future_hours_plural, w, Integer.valueOf(w));
            }
            return this.c.getResources().getQuantityString(R.plurals.download_playlist_unplayable_future_hours_plural, w, Integer.valueOf(w));
        }
        int v = fav.v(j);
        if (z) {
            return this.c.getResources().getQuantityString(R.plurals.download_video_unplayable_future_days_plural, v, Integer.valueOf(v));
        }
        return this.c.getResources().getQuantityString(R.plurals.download_playlist_unplayable_future_days_plural, v, Integer.valueOf(v));
    }

    public final boolean j(atxb atxbVar, String str, int i, long j) {
        avjs g = atxbVar != null ? atxbVar.g() : null;
        Iterator it = (g != null ? g.getStreamProgress() : amru.q()).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            auyr auyrVar = (auyr) it.next();
            int bc = aobq.bc(auyrVar.e);
            if (bc != 0 && bc == 3) {
                aqxz aqxzVar = (aqxz) aarr.c(auyrVar.g.I(), aqxz.b);
                if (aqxzVar == null) {
                    return false;
                }
                if (TimeUnit.MICROSECONDS.toSeconds(((adxr) this.i.get()).a(new FormatStreamModel(aqxzVar, str, TimeUnit.SECONDS.toMillis(i)), 0L)) >= j) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean k(atre atreVar, aqoz aqozVar) {
        aqpd e;
        boolean isAfter;
        if (aqozVar != null && (e = e(aqozVar)) != null && !e.f) {
            Instant ofEpochMilli = Instant.ofEpochMilli(this.d.c());
            if (aqozVar.getPlaybackStartSeconds().longValue() > 0) {
                isAfter = ofEpochMilli.isAfter(Instant.ofEpochSecond(aqozVar.getPlaybackStartSeconds().longValue()).plus(Duration.ofSeconds(e.e)));
            } else {
                isAfter = ofEpochMilli.isAfter(Instant.ofEpochSecond(aqozVar.getLicenseExpirySeconds().longValue()));
            }
            if (isAfter) {
                return true;
            }
        }
        if (atreVar == null) {
            return false;
        }
        long c = this.d.c();
        return c > atreVar.getExpirationTimestamp().longValue() || c < (atreVar.getExpirationTimestamp().longValue() - TimeUnit.MILLISECONDS.convert((long) u(atreVar).g, TimeUnit.SECONDS)) - b || (this.m.n() && q(atreVar) && (a(atreVar) > 0L ? 1 : (a(atreVar) == 0L ? 0 : -1)) == 0);
    }

    public final boolean l(atre atreVar, aqoz aqozVar) {
        return atreVar != null && k(atreVar, aqozVar) && atreVar.getExpirationTimestamp().longValue() + a <= this.d.c();
    }

    public final boolean m(awil awilVar) {
        return n(awilVar.f(), awilVar.b());
    }

    public final boolean n(atxb atxbVar, atre atreVar) {
        auyr auyrVar = null;
        avjs g = atxbVar != null ? atxbVar.g() : null;
        avjo transferState = g != null ? g.getTransferState() : null;
        aryi aryiVar = t(atxbVar).f;
        if (aryiVar == null) {
            aryiVar = aryi.a;
        }
        aryi aryiVar2 = aryiVar;
        List<auyr> streamProgress = g != null ? g.getStreamProgress() : amru.q();
        if (v(transferState, atreVar, aryiVar2, streamProgress, atxbVar != null ? atxbVar.b() : null)) {
            return false;
        }
        auyr auyrVar2 = null;
        for (auyr auyrVar3 : streamProgress) {
            int bc = aobq.bc(auyrVar3.e);
            if (bc != 0 && bc == 2) {
                auyrVar = auyrVar3;
            } else {
                int bc2 = aobq.bc(auyrVar3.e);
                if (bc2 != 0 && bc2 == 3) {
                    auyrVar2 = auyrVar3;
                }
            }
        }
        if (auyrVar != null && auyrVar2 != null && auyrVar.c == auyrVar.d) {
            long j = auyrVar2.c;
            if (j > 0 && j < auyrVar2.d) {
                return true;
            }
        }
        return false;
    }

    public final boolean o(awil awilVar, long j) {
        if (!m(awilVar)) {
            return false;
        }
        awjp g = awilVar.g();
        return g == null || !j(awilVar.f(), g.getVideoId(), g.getLengthSeconds().intValue(), j);
    }
}
