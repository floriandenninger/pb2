package defpackage;

import android.os.Handler;
import android.os.SystemClock;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qub extends quh {
    final /* synthetic */ Map a;
    final /* synthetic */ qtx b;
    final /* synthetic */ quf c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qub(quf qufVar, String str, Map map, qtx qtxVar) {
        super(str);
        this.c = qufVar;
        this.a = map;
        this.b = qtxVar;
    }

    @Override // defpackage.quh
    protected final void a(qtw qtwVar) {
        if (axsz.b()) {
            this.c.a(this);
            quf qufVar = this.c;
            final que queVar = new que(qtwVar, qufVar.b, this.a, this.e, this.f, qufVar.a, this.b);
            final long a = queVar.d.a();
            queVar.b.postAtTime(new Runnable() { // from class: quc
                @Override // java.lang.Runnable
                public final void run() {
                    que queVar2 = que.this;
                    long j = a;
                    que queVar3 = queVar;
                    qum qumVar = queVar2.f;
                    qumVar.getClass();
                    StringBuilder sb = new StringBuilder(52);
                    sb.append("getResults snapshot timeout: ");
                    sb.append(j);
                    sb.append(" ms");
                    qul qulVar = new qul(qumVar, sb.toString(), queVar2.e);
                    String a2 = qulVar.a(new HashMap());
                    qulVar.b();
                    queVar3.a(a2);
                }
            }, queVar, a + SystemClock.uptimeMillis());
            String a2 = queVar.a.a(queVar.c);
            queVar.a.b();
            queVar.b.removeCallbacksAndMessages(queVar);
            queVar.a(a2);
            return;
        }
        final String a3 = qtwVar.a(this.a);
        qtwVar.b();
        Handler handler = this.c.b;
        final qtx qtxVar = this.b;
        handler.post(new Runnable() { // from class: qua
            @Override // java.lang.Runnable
            public final void run() {
                qtx.this.a(a3);
            }
        });
        this.c.a(this);
    }
}
