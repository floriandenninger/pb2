package defpackage;

import android.content.Context;
import android.os.SystemClock;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qtv {
    private final quf a;

    public qtv(Context context) {
        uvr.g(context);
        this.a = new quf(context);
    }

    public final void a(String str, Map map, qtx qtxVar) {
        final quf qufVar = this.a;
        final qub qubVar = new qub(qufVar, str, map, qtxVar);
        final long a = qubVar.e.a();
        qufVar.b.postAtTime(new Runnable() { // from class: qtz
            @Override // java.lang.Runnable
            public final void run() {
                quf qufVar2 = quf.this;
                quh quhVar = qubVar;
                long j = a;
                qum qumVar = qufVar2.a;
                qumVar.getClass();
                StringBuilder sb = new StringBuilder(48);
                sb.append("getResults init timeout: ");
                sb.append(j);
                sb.append(" ms");
                quhVar.b(new qul(qumVar, sb.toString(), quhVar.f));
            }
        }, qubVar, a + SystemClock.uptimeMillis());
        qum qumVar = qufVar.a;
        qubVar.f.c(amlh.QUEUE_REQUEST, qur.COARSE);
        qumVar.a.offer(qubVar);
        qumVar.c.post(qumVar);
    }
}
