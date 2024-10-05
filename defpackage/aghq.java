package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aghq implements aghr {
    private static final long a = TimeUnit.MINUTES.toSeconds(7);
    private static final long b;
    private final zfy c;

    static {
        TimeUnit.HOURS.toSeconds(72L);
        b = TimeUnit.MINUTES.toSeconds(30L);
    }

    public aghq(zfy zfyVar) {
        zfyVar.getClass();
        this.c = zfyVar;
    }

    @Override // defpackage.aghr
    public final int a() {
        return this.c.a("pudl_ad_frequency_cap", (int) a);
    }

    @Override // defpackage.aghr
    public final int b() {
        return this.c.a("pudl_ad_lact_nonskippable", 0);
    }

    @Override // defpackage.aghr
    public final int c() {
        return this.c.a("pudl_ad_lact_skippable", (int) b);
    }

    @Override // defpackage.aghr
    public final int d() {
        return this.c.a("offline_resync_continuation_deferred_service_threshold_seconds", 5);
    }

    @Override // defpackage.aghr
    public final boolean e() {
        return this.c.e("attempt_offline_resync_on_expired_continuation", true);
    }
}
