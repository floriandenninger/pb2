package defpackage;

import android.os.Looper;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uyn implements uyi {
    private static final amxj a = amxj.l("com/google/android/libraries/processinit/finalizer/UncaughtExceptionHandlerProcessInitializer");
    private final azrw b;
    private final shf c;

    public uyn(azrw azrwVar, shf shfVar) {
        this.b = azrwVar;
        this.c = shfVar;
    }

    @Override // defpackage.uyi
    public final void a() {
        final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: uym
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(Thread thread, Throwable th) {
                uyn.this.b(defaultUncaughtExceptionHandler, thread, th);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void b(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, Thread thread, Throwable th) {
        long d = this.c.d();
        try {
            ArrayList arrayList = new ArrayList();
            try {
                ((amxh) ((amxh) ((amxh) a.f()).h(th)).i("com/google/android/libraries/processinit/finalizer/UncaughtExceptionHandlerProcessInitializer", "lambda$init$0", '5', "UncaughtExceptionHandlerProcessInitializer.java")).q("Encountered uncaught exception.");
            } catch (Throwable th2) {
                arrayList.add(th2);
            }
            if (thread == Looper.getMainLooper().getThread()) {
                Set set = (Set) this.b.get();
                ArrayList arrayList2 = new ArrayList(set.size());
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    try {
                        arrayList2.add(((uyl) it.next()).a());
                    } catch (Throwable th3) {
                        arrayList.add(th3);
                    }
                }
                amxe it2 = anaf.G(arrayList2).iterator();
                while (it2.hasNext()) {
                    try {
                        anaf.B((anhy) it2.next(), 4000 - (this.c.d() - d), TimeUnit.MILLISECONDS);
                    } catch (TimeoutException e) {
                        arrayList.add(e);
                    } catch (Throwable th4) {
                        arrayList.add(th4);
                    }
                }
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                ((Throwable) it3.next()).printStackTrace();
            }
        } finally {
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            }
        }
    }
}
