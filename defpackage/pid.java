package defpackage;

import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Pair;
import androidx.media3.common.DrmInitData;
import java.util.HashMap;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pid {
    private static final pms b;
    private static final Long c;
    public final ConditionVariable a;
    private final piq d;
    private final HandlerThread e;
    private final ayy f;
    private final bbx g;

    static {
        pmr pmrVar = new pmr();
        pmrVar.n = new DrmInitData(new DrmInitData.SchemeData[0]);
        b = pmrVar.a();
        c = 2592000L;
    }

    public pid(UUID uuid, ayy ayyVar, aeqm aeqmVar, HashMap hashMap) {
        HandlerThread handlerThread = new HandlerThread("OfflineDrmLicenseHelper");
        this.e = handlerThread;
        handlerThread.start();
        this.a = new ConditionVariable();
        bbx bbxVar = new bbx(null);
        this.g = bbxVar;
        this.f = ayyVar;
        bbxVar.o(new Handler(handlerThread.getLooper()), new pib(this));
        this.d = new piq(uuid, aeqmVar, hashMap, new pic());
    }

    private final pij g(int i, byte[] bArr, pms pmsVar) {
        this.d.h(this.f);
        this.d.i(i, bArr);
        this.a.close();
        if (this.d.a(pmsVar) == 1) {
            throw new ayg(new Exception("Could not acquire session"), 6001);
        }
        ayh e = this.d.e(this.e.getLooper(), this.g, pmsVar);
        this.a.block();
        return (pij) e;
    }

    private final byte[] h(int i, byte[] bArr, pms pmsVar) {
        pij g = g(i, bArr, pmsVar);
        ayg c2 = g.c();
        byte[] bArr2 = g.l;
        this.d.f(g);
        if (c2 != null) {
            throw c2;
        }
        return (byte[]) pse.c(bArr2);
    }

    public final synchronized Pair a(byte[] bArr) {
        pij g = g(1, bArr, b);
        ayg c2 = g.c();
        Pair c3 = ays.c(g);
        this.d.f(g);
        if (c2 != null) {
            if (c2.getCause() instanceof azg) {
                return Pair.create(0L, 0L);
            }
            throw c2;
        }
        pse.c(c3);
        long longValue = ((Long) c3.first).longValue();
        Long l = c;
        return Pair.create(Long.valueOf(Math.min(longValue, l.longValue())), Long.valueOf(Math.min(((Long) c3.second).longValue(), l.longValue())));
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public final synchronized String b() {
        try {
        } catch (Throwable unused) {
            return "";
        }
        return this.f.m();
    }

    public final void c() {
        this.e.quit();
    }

    public final synchronized void d(byte[] bArr) {
        pse.c(bArr);
        h(3, bArr, b);
    }

    public final synchronized byte[] e(pms pmsVar) {
        pse.e(pmsVar.q != null);
        return h(2, null, pmsVar);
    }

    public final synchronized byte[] f(byte[] bArr) {
        pse.c(bArr);
        return h(2, bArr, b);
    }
}
