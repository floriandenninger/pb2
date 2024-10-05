package defpackage;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bys extends bzm {
    private static final String b = ajbh.S("DelegatingWkrFctry");
    public final List a = new CopyOnWriteArrayList();

    @Override // defpackage.bzm
    public final ListenableWorker a(Context context, String str, WorkerParameters workerParameters) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ListenableWorker a = ((bzm) it.next()).a(context, str, workerParameters);
                if (a != null) {
                    return a;
                }
            } catch (Throwable th) {
                String format = String.format("Unable to instantiate a ListenableWorker (%s)", str);
                ajbh.X();
                ajbh.U(b, format, th);
                throw th;
            }
        }
        return null;
    }
}
