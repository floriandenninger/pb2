package defpackage;

import android.database.sqlite.SQLiteDatabase;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class vhw implements Runnable {
    public final /* synthetic */ vid a;
    private final /* synthetic */ int b;

    public /* synthetic */ vhw(vid vidVar, int i) {
        this.b = i;
        this.a = vidVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b != 0) {
            vid vidVar = this.a;
            synchronized (vidVar.h) {
                if (vidVar.k == 0) {
                    vidVar.d();
                }
            }
            return;
        }
        vid vidVar2 = this.a;
        synchronized (vidVar2.h) {
            anhy anhyVar = vidVar2.j;
            if (vidVar2.k == 0 && anhyVar != null) {
                vidVar2.j = null;
                if (!anhyVar.cancel(true)) {
                    try {
                        ((SQLiteDatabase) anaf.W(anhyVar)).close();
                    } catch (ExecutionException unused) {
                    }
                }
                vidVar2.b.unregisterComponentCallbacks(vidVar2);
                Iterator it = vidVar2.g.iterator();
                while (it.hasNext()) {
                    if (((WeakReference) it.next()).get() == null) {
                        it.remove();
                    }
                }
            }
        }
    }
}
