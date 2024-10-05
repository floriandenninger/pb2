package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class imn {
    public final aihs a;
    public final Executor b;
    public final afkk c;
    private final amnv d;
    private final iml e;

    public imn(aioc aiocVar, amnv amnvVar, iml imlVar, Executor executor, afkk afkkVar) {
        this.a = aiocVar.y();
        this.d = amnvVar;
        this.e = imlVar;
        this.b = executor;
        this.c = afkkVar;
    }

    public final aigd a(String str, afkm afkmVar) {
        acsx acsxVar;
        boolean g = imu.g((aujz) this.d.get());
        iml imlVar = this.e;
        str.getClass();
        synchronized (imlVar.b) {
            acsxVar = (acsx) imlVar.b.get(str);
            if (acsxVar == null) {
                acsxVar = imlVar.a.d(asmn.LATENCY_ACTION_REEL_WATCH);
            }
            imlVar.b.put(str, acsxVar);
        }
        return imu.a(acsxVar, g, false, afkmVar);
    }
}
