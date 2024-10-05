package defpackage;

import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class quk implements Runnable {
    final /* synthetic */ qul a;

    public quk(qul qulVar) {
        this.a = qulVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.c == null) {
            return;
        }
        qul qulVar = this.a;
        qum qumVar = qulVar.b;
        qumVar.b--;
        try {
            quo quoVar = qulVar.c;
            quoVar.pq(3, quoVar.pn());
        } catch (Exception unused) {
            Log.e("DGProcessor", "Error while closing handle.");
        }
        this.a.c = null;
        this.a.b.d();
    }
}
