package defpackage;

import android.os.SystemClock;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aezt implements bfs {
    private static final aezs c = new aezi();
    private static final aezs d = new aezj();
    public final afjl a;
    public final amnv b;
    private final Map e = new HashMap();
    private final ysy f;
    private final afeu g;
    private final amnv h;
    private final afhs i;

    public aezt(ysy ysyVar, afeu afeuVar, afhs afhsVar, amnv amnvVar, amnv amnvVar2) {
        this.a = new afjl(new afjk(amnvVar, 1));
        this.f = ysyVar;
        this.g = afeuVar;
        this.b = amnvVar;
        this.h = amnvVar2;
        this.i = afhsVar;
    }

    public static bfq e(bel belVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int d2 = belVar.d();
        int i = 0;
        for (int i2 = 0; i2 < d2; i2++) {
            if (belVar.r(i2, elapsedRealtime)) {
                i++;
            }
        }
        return new bfq(d2, i);
    }

    @Override // defpackage.bfs
    public final int a(int i) {
        throw null;
    }

    @Override // defpackage.bfs
    public final long b(bfr bfrVar) {
        throw null;
    }

    @Override // defpackage.bfs
    public final void c(long j) {
        this.e.remove(Long.valueOf(j));
    }

    @Override // defpackage.bfs
    public final affp d(bfq bfqVar, bfr bfrVar) {
        if (bfqVar.a - bfqVar.b > 1) {
            long c2 = g(f(bfrVar.a.a), bfrVar.b).c();
            if (c2 != -9223372036854775807L) {
                return new affp(c2, null, null);
            }
        }
        return null;
    }

    public final aezk f(long j) {
        Map map = this.e;
        Long valueOf = Long.valueOf(j);
        aezk aezkVar = (aezk) map.get(valueOf);
        if (aezkVar != null) {
            return aezkVar;
        }
        aezk aezkVar2 = new aezk();
        this.e.put(valueOf, aezkVar2);
        return aezkVar2;
    }

    public final aezs g(aezk aezkVar, IOException iOException) {
        if (!(iOException instanceof afhu) || ((afhu) iOException).e != 204) {
            if (iOException instanceof aewl) {
                return d;
            }
            boolean z = iOException instanceof atp;
            if (!z || !this.g.e((atp) iOException, (VideoStreamingData) this.h.get())) {
                if (!(iOException instanceof aewq) && !(iOException instanceof afij)) {
                    if (!this.f.p() || !z) {
                        if (iOException instanceof atn) {
                            return new aezp(this, aezkVar);
                        }
                        if ((iOException instanceof bfo) || (iOException instanceof phs)) {
                            return c;
                        }
                        if (iOException instanceof afii) {
                            return new aezp(this, aezkVar);
                        }
                        return new aezr(this, aezkVar);
                    }
                    aquz aquzVar = ((PlayerConfigModel) this.b.get()).c.e;
                    if (aquzVar == null) {
                        aquzVar = aquz.b;
                    }
                    long j = aquzVar.bw;
                    if (!this.i.Q() || j <= 0) {
                        return new aezr(this, aezkVar);
                    }
                    return new aezq(j);
                }
                return c;
            }
            return c;
        }
        aquz aquzVar2 = ((PlayerConfigModel) this.b.get()).c.e;
        if (aquzVar2 == null) {
            aquzVar2 = aquz.b;
        }
        return (aquzVar2.bo && (iOException instanceof aewn)) ? new aezo(this, aezkVar, (int) ((aewn) iOException).d) : d;
    }
}
