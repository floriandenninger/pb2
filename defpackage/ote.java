package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service.f;
import com.google.android.apps.youtube.embeddedplayer.service.csi.service.a;
import com.google.android.apps.youtube.embeddedplayer.service.innertube.g;
import com.google.android.apps.youtube.embeddedplayer.service.innertube.h;
import com.google.android.apps.youtube.embeddedplayer.service.innertube.l;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadFactory;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ote implements axqr {
    private final azrw a;
    private final /* synthetic */ int b;

    public ote(azrw azrwVar, int i) {
        this.b = i;
        this.a = azrwVar;
    }

    public static ote a(azrw azrwVar) {
        return new ote(azrwVar, 0);
    }

    public static Looper b(int i, ammv ammvVar) {
        final SettableFuture f = SettableFuture.f();
        sgf.l(sgf.f(), sgf.k("Lite", (ThreadFactory) ammvVar.e(shu.a(i, pkr.b)))).newThread(new Runnable() { // from class: shl
            @Override // java.lang.Runnable
            public final void run() {
                SettableFuture settableFuture = SettableFuture.this;
                try {
                    Looper.prepare();
                    settableFuture.o(Looper.myLooper());
                    Looper.loop();
                    if ("robolectric".equals(Build.FINGERPRINT)) {
                        return;
                    }
                    uqq.l(omm.e);
                } catch (Throwable th) {
                    settableFuture.o(Looper.myLooper());
                    throw th;
                }
            }
        }).start();
        try {
            Looper looper = (Looper) anaf.A(f);
            ayaw.k(looper);
            return looper;
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    public static anic c(sii siiVar) {
        sho shoVar = new sho(sgf.k("Scheduler", pkr.b));
        shoVar.setRemoveOnCancelPolicy(true);
        anic a = siiVar.a(anaf.D(shoVar));
        ayaw.k(a);
        return a;
    }

    public static siw d(shf shfVar) {
        return new siw(shfVar);
    }

    public static tdq e(Application application) {
        return new tdq(application);
    }

    public static aftj f(wco wcoVar) {
        return new vzq(new vzr(wcoVar), 1);
    }

    public static aftj g(wco wcoVar) {
        wcoVar.getClass();
        return new vzq(wcoVar, 0);
    }

    public static String h(Context context) {
        String a = rrz.a(context.getContentResolver(), rrz.a);
        return a == null ? "android-google" : a;
    }

    public static wnj i(aadw aadwVar) {
        return new wnj(aadwVar);
    }

    public static ote j(azrw azrwVar) {
        return new ote(azrwVar, 1);
    }

    public static ote k(azrw azrwVar) {
        return new ote(azrwVar, 2);
    }

    public static ote l(azrw azrwVar) {
        return new ote(azrwVar, 3);
    }

    public static ote m(azrw azrwVar) {
        return new ote(azrwVar, 4);
    }

    public static ote n(azrw azrwVar) {
        return new ote(azrwVar, 5);
    }

    public static ote o(azrw azrwVar) {
        return new ote(azrwVar, 6);
    }

    public static ote p(azrw azrwVar) {
        return new ote(azrwVar, 7);
    }

    public static ote q(azrw azrwVar) {
        return new ote(azrwVar, 8);
    }

    public static ote r(azrw azrwVar) {
        return new ote(azrwVar, 9);
    }

    public static ote s(azrw azrwVar) {
        return new ote(azrwVar, 10);
    }

    public static ote t(azrw azrwVar) {
        return new ote(azrwVar, 11);
    }

    public static ote u(azrw azrwVar) {
        return new ote(azrwVar, 18);
    }

    public static ote v(azrw azrwVar) {
        return new ote(azrwVar, 19);
    }

    public static ote w(azrw azrwVar) {
        return new ote(azrwVar, 20);
    }

    public static aifh x(ypa ypaVar) {
        return new aifh(ypaVar);
    }

    @Override // defpackage.azrw
    public final /* synthetic */ Object get() {
        switch (this.b) {
            case 0:
                String format = String.format("embeddedplayer_%s_%s", ((f) this.a.get()).a, "keyValueByteStores");
                ayaw.k(format);
                return format;
            case 1:
                String format2 = String.format("embeddedplayer_%s_%s", ((f) this.a.get()).a, "com.google.android.libraries.youtube.net.delayedevents.DelayedEventStore");
                ayaw.k(format2);
                return format2;
            case 2:
                ylf ylfVar = (ylf) this.a.get();
                ayaw.k(ylfVar);
                return ylfVar;
            case 3:
                return new a((acsw) this.a.get());
            case 4:
                return new com.google.android.apps.youtube.embeddedplayer.service.innertube.f(((g) this.a).get());
            case 5:
                return new h((aaea) this.a.get());
            case 6:
                return new l((aaea) this.a.get());
            case 7:
                return new com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.service.g((com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.service.f) this.a.get());
            case 8:
                return b(ots.f().intValue(), (ammv) ((axqs) this.a).a);
            case 9:
                return c(((sij) this.a).get());
            case 10:
                return d((shf) this.a.get());
            case 11:
                return e(((ykc) this.a).get());
            case 12:
                return ((tpg) this.a).get();
            case 13:
                return ((tpq) this.a).get();
            case 14:
                return f((wco) this.a.get());
            case 15:
                return g((wco) this.a.get());
            case 16:
                return x((ypa) this.a.get());
            case 17:
                return new wki(((yjw) this.a).get(), null, null, null);
            case 18:
                return h((Context) ((axqs) this.a).a);
            case 19:
                return new wmt((tdq) this.a.get());
            default:
                return i((aadw) this.a.get());
        }
    }
}
