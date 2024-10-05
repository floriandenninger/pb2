package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uow extends uou implements unz, uoh, uog, upq {
    private static final amxj b = amxj.l("com/google/android/libraries/performance/primes/metrics/battery/BatteryMetricServiceImpl");
    final AtomicBoolean a = new AtomicBoolean();
    private final Context c;
    private final uok d;
    private final anic e;
    private final upg f;
    private final uoq g;
    private final upo h;
    private final AtomicBoolean i;

    public uow(upp uppVar, Context context, uok uokVar, anic anicVar, axpg axpgVar, upg upgVar, uoq uoqVar, azrw azrwVar, Executor executor) {
        new ConcurrentHashMap();
        this.i = new AtomicBoolean(false);
        this.h = uppVar.a(executor, axpgVar, azrwVar);
        this.c = context;
        this.d = uokVar;
        this.e = anicVar;
        this.f = upgVar;
        this.g = uoqVar;
    }

    private final anhy E(final baav baavVar) {
        return anaf.T(new anfy() { // from class: uov
            @Override // defpackage.anfy
            public final anhy a() {
                return uow.this.B(baavVar, null);
            }
        }, this.e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x02f8, code lost:
    
        if ((r6 / r8) <= 3.472222222222222E-5d) goto L137;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0563  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0566  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x008f A[Catch: all -> 0x0586, TryCatch #1 {, blocks: (B:9:0x0014, B:14:0x0043, B:17:0x0047, B:21:0x004d, B:22:0x0088, B:25:0x0105, B:169:0x008f, B:171:0x0095, B:173:0x009d, B:175:0x00a2, B:177:0x00a8, B:178:0x00aa, B:180:0x00b1, B:181:0x00ba, B:183:0x00c0, B:184:0x00c9, B:186:0x00cf, B:187:0x00d8, B:189:0x00de, B:190:0x00e7, B:192:0x00ed, B:193:0x00f2, B:195:0x00f6, B:197:0x00fa, B:199:0x0101, B:210:0x0058, B:211:0x006c, B:213:0x002e), top: B:8:0x0014, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ defpackage.anhy B(defpackage.baav r18, defpackage.und r19) {
        /*
            Method dump skipped, instructions count: 1419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uow.B(baav, und):anhy");
    }

    public anhy C() {
        if (!slf.e(this.c)) {
            return anhv.a;
        }
        try {
            amkq.N(this.a.getAndSet(false));
            return E(baav.FOREGROUND_TO_BACKGROUND);
        } catch (Exception e) {
            return anaf.N(e);
        }
    }

    public anhy D() {
        if (!slf.e(this.c)) {
            return anhv.a;
        }
        if (this.a.getAndSet(true)) {
            ((amxh) ((amxh) b.g()).i("com/google/android/libraries/performance/primes/metrics/battery/BatteryMetricServiceImpl", "onAppToForeground", 134, "BatteryMetricServiceImpl.java")).q("App is already in the foreground.");
            return anaf.M();
        }
        return E(baav.BACKGROUND_TO_FOREGROUND);
    }

    @Override // defpackage.upq, defpackage.uyo
    public void a() {
        this.d.a(this);
    }

    @Override // defpackage.unz
    public void b(Activity activity, Bundle bundle) {
        if (this.i.getAndSet(true)) {
            return;
        }
        c(null);
    }

    @Override // defpackage.uoh
    public void c(Activity activity) {
        if (this.a.get()) {
            return;
        }
        D();
    }

    @Override // defpackage.uog
    public void d(Activity activity) {
        C();
    }
}
