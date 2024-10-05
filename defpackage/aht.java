package defpackage;

import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aht implements Runnable {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;

    public aht(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (ahv.d != null) {
                ahv.d.invoke(this.a, this.b, false, "AppCompat recreation");
            } else {
                ahv.e.invoke(this.a, this.b, false);
            }
        } catch (RuntimeException e) {
            if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                throw e;
            }
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
        }
    }
}
