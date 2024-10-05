package defpackage;

import j$.util.Optional;
import j$.util.function.Supplier;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jmz {
    static final long a = TimeUnit.HOURS.toMillis(12);
    public final Executor b;
    private final agkd c;
    private final shf d;
    private final axzf e;

    public jmz(Executor executor, agkd agkdVar, shf shfVar, axzf axzfVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.b = executor;
        this.c = agkdVar;
        this.d = shfVar;
        this.e = axzfVar;
    }

    public static boolean f(aryi aryiVar) {
        return !ahbx.l(aryiVar);
    }

    public static boolean h(avjo avjoVar, avjp avjpVar) {
        return avjo.TRANSFER_STATE_TRANSFERRING.equals(avjoVar) && avjp.TRANSFER_FAILURE_REASON_EXTERNAL_FILESYSTEM_WRITE.equals(avjpVar);
    }

    public static boolean i(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int ak = aobq.ak(((auyr) it.next()).f);
            if (ak != 0 && ak == 4) {
                return true;
            }
        }
        return false;
    }

    public static boolean j(avjo avjoVar) {
        return avjo.TRANSFER_STATE_FAILED.equals(avjoVar) || avjo.TRANSFER_STATE_UNKNOWN.equals(avjoVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final anhy a(final Optional optional, final Optional optional2) {
        if (!optional.isPresent() || !optional2.isPresent()) {
            return anaf.O(jps.TRANSFER_WAITING_IN_QUEUE);
        }
        final avjs g = ((atxb) optional.get()).g();
        if (g == null) {
            return anaf.O(jps.TRANSFER_PENDING_USER_APPROVAL);
        }
        return anfq.h(anht.q(this.c.b(aalt.g(((atxb) optional.get()).d()))), new amml() { // from class: jmw
            @Override // defpackage.amml
            public final Object apply(Object obj) {
                Optional of;
                jmz jmzVar = jmz.this;
                Optional optional3 = optional;
                Optional optional4 = optional2;
                final avjs avjsVar = g;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                atxb atxbVar = (atxb) optional3.get();
                atre atreVar = (atre) optional4.get();
                final avjo transferState = avjsVar.getTransferState();
                avjp failureReason = avjsVar.getFailureReason();
                aryr aryrVar = (aryr) aarr.c(atxbVar.getPlayerResponseBytes().I(), aryr.a);
                if (aryrVar == null) {
                    aryrVar = aryr.a;
                }
                aryi aryiVar = aryrVar.f;
                if (aryiVar == null) {
                    aryiVar = aryi.a;
                }
                List streamProgress = avjsVar.getStreamProgress();
                if (booleanValue || jmz.j(transferState) || jmzVar.g(atreVar) || jmz.h(transferState, failureReason) || jmz.f(aryiVar) || jmz.i(streamProgress)) {
                    if (jmz.f(aryiVar) && ahbx.m(aryiVar)) {
                        of = Optional.of(jps.ERROR_PENDING_PLAYABILITY_ACTION);
                    } else if (jmz.f(aryiVar)) {
                        of = Optional.of(jps.ERROR_NOT_PLAYABLE);
                    } else if (booleanValue) {
                        of = Optional.of(jps.ERROR_EXPIRED_RENTAL);
                    } else if (jmzVar.g(atreVar)) {
                        if (jmzVar.e(atreVar)) {
                            of = Optional.of(jps.ERROR_EXPIRED);
                        } else {
                            of = Optional.of(jps.ERROR_POLICY);
                        }
                    } else if (!jmz.i(streamProgress)) {
                        if (!avjo.TRANSFER_STATE_FAILED.equals(transferState) || !avjp.TRANSFER_FAILURE_REASON_FILESYSTEM_WRITE.equals(failureReason)) {
                            if (jmz.j(transferState)) {
                                of = Optional.of(jps.ERROR_GENERIC);
                            } else if (jmz.h(transferState, failureReason)) {
                                of = Optional.of(jps.ERROR_DISK_SD_CARD);
                            }
                        } else {
                            of = Optional.of(jps.ERROR_DISK);
                        }
                    } else {
                        of = Optional.of(jps.ERROR_STREAMS_MISSING);
                    }
                    return (jps) of.orElseGet(new Supplier() { // from class: jmy
                        @Override // j$.util.function.Supplier
                        public final Object get() {
                            avjs avjsVar2 = avjs.this;
                            avjo avjoVar = transferState;
                            if (!avjo.TRANSFER_STATE_COMPLETE.equals(avjoVar)) {
                                long j = 0;
                                long j2 = 0;
                                for (auyr auyrVar : avjsVar2.getStreamProgress()) {
                                    j += auyrVar.d;
                                    j2 += auyrVar.c;
                                }
                                if ((j > 0 ? ((float) j2) / ((float) j) : 0.0f) != 1.0f) {
                                    if (avjo.TRANSFER_STATE_PAUSED_BY_USER.equals(avjoVar)) {
                                        return jps.TRANSFER_PAUSED;
                                    }
                                    if (avjo.TRANSFER_STATE_TRANSFERRING.equals(avjoVar)) {
                                        return jps.TRANSFER_IN_PROGRESS;
                                    }
                                    return jps.TRANSFER_WAITING_IN_QUEUE;
                                }
                            }
                            return jps.PLAYABLE;
                        }
                    });
                }
                of = Optional.empty();
                return (jps) of.orElseGet(new Supplier() { // from class: jmy
                    @Override // j$.util.function.Supplier
                    public final Object get() {
                        avjs avjsVar2 = avjs.this;
                        avjo avjoVar = transferState;
                        if (!avjo.TRANSFER_STATE_COMPLETE.equals(avjoVar)) {
                            long j = 0;
                            long j2 = 0;
                            for (auyr auyrVar : avjsVar2.getStreamProgress()) {
                                j += auyrVar.d;
                                j2 += auyrVar.c;
                            }
                            if ((j > 0 ? ((float) j2) / ((float) j) : 0.0f) != 1.0f) {
                                if (avjo.TRANSFER_STATE_PAUSED_BY_USER.equals(avjoVar)) {
                                    return jps.TRANSFER_PAUSED;
                                }
                                if (avjo.TRANSFER_STATE_TRANSFERRING.equals(avjoVar)) {
                                    return jps.TRANSFER_IN_PROGRESS;
                                }
                                return jps.TRANSFER_WAITING_IN_QUEUE;
                            }
                        }
                        return jps.PLAYABLE;
                    }
                });
            }
        }, this.b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final anhy b(Optional optional, Optional optional2) {
        return anfq.h(anht.q(a(optional, optional2)), icu.l, this.b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final anhy c(final Optional optional, final Optional optional2) {
        if (!optional.isPresent() || !optional2.isPresent()) {
            return anaf.O(false);
        }
        return anfq.i(anfq.h(anht.q(this.c.a(aalt.g(((atxb) optional.get()).d()))), icu.m, this.b), new anfz() { // from class: jmx
            @Override // defpackage.anfz
            public final anhy a(Object obj) {
                jmz jmzVar = jmz.this;
                Optional optional3 = optional;
                Optional optional4 = optional2;
                Optional optional5 = (Optional) obj;
                atxb atxbVar = (atxb) optional3.get();
                atre atreVar = (atre) optional4.get();
                if (optional5.isPresent()) {
                    return anaf.O(Boolean.valueOf(((aqpb) optional5.get()).d));
                }
                return anfq.h(anht.q(jmzVar.a(Optional.of(atxbVar), Optional.of(atreVar))), new eou(jmzVar.g(atreVar), 7), jmzVar.b);
            }
        }, this.b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final anhy d(Optional optional, Optional optional2) {
        return anfq.h(anht.q(a(optional, optional2)), new jmv(optional, 0), this.b);
    }

    public final boolean e(atre atreVar) {
        atqq atqqVar;
        boolean z;
        int bW;
        long c = this.d.c();
        long longValue = atreVar.getExpirationTimestamp().longValue();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            atqqVar = (atqq) aonm.parseFrom(atqq.a, atreVar.getOfflineStateBytes(), aomw.b());
        } catch (aoob e) {
            zga.d("Failed to get Offline State.", e);
            atqqVar = atqq.a;
        }
        long convert = longValue - timeUnit.convert(atqqVar.g, TimeUnit.SECONDS);
        if (this.e.n() && (bW = anaf.bW(atreVar.getOfflineFutureUnplayableInfo().d)) != 0 && bW == 2) {
            if (((atreVar.getOfflineFutureUnplayableInfo() == null || atreVar.getOfflineFutureUnplayableInfo().c < 0) ? 0L : Math.max((atreVar.getLastUpdatedTimestampSeconds().longValue() + atreVar.getOfflineFutureUnplayableInfo().c) - TimeUnit.MILLISECONDS.toSeconds(this.d.c()), 0L)) == 0) {
                z = true;
                return c <= atreVar.getExpirationTimestamp().longValue() || c < convert - a || z;
            }
        }
        z = false;
        if (c <= atreVar.getExpirationTimestamp().longValue()) {
        }
    }

    public final boolean g(atre atreVar) {
        return !atreVar.getAction().equals(atrb.OFFLINE_VIDEO_POLICY_ACTION_OK) || e(atreVar);
    }
}
