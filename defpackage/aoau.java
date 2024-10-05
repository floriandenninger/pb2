package defpackage;

import android.app.Application;
import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aoau extends ayao {
    public static final amxj a = amxj.l("com/google/frameworks/client/data/android/binder/OnDeviceChannelBuilder");
    public final Context b;
    public final aylb c;
    public final Executor e;
    public final aynz g = aynz.a(ayiu.m);
    public final aydo f = aydo.a;
    public aydr d = aydq.a();

    private aoau(aydn aydnVar, Context context) {
        this.b = context;
        aylb aylbVar = new aylb(aydnVar, aydnVar.a().getPackageName(), new aoas(this));
        this.c = aylbVar;
        aylbVar.h = ayam.a();
        aylbVar.i = new ayad(new ayac[0]);
        aylbVar.m = false;
        aylbVar.l = false;
        TimeUnit timeUnit = TimeUnit.MINUTES;
        amkq.I(true, "idle timeout is %s, but must be positive", 1L);
        if (timeUnit.toDays(1L) >= 30) {
            aylbVar.j = -1L;
        } else {
            aylbVar.j = Math.max(timeUnit.toMillis(1L), aylb.b);
        }
        Executor h = aih.h(context);
        h.getClass();
        this.e = h;
    }

    public static synchronized aoau a(Application application, aydn aydnVar) {
        aoau aoauVar;
        synchronized (aoau.class) {
            aoauVar = new aoau(aydnVar, application);
        }
        return aoauVar;
    }

    @Override // defpackage.ayao
    public final aybw b() {
        return this.c;
    }
}
