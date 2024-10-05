package defpackage;

import android.os.Looper;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qql {
    public volatile Object a;
    public volatile qqj b;
    private final Executor c;

    public qql(Looper looper, Object obj, String str) {
        this.c = new abq(looper, 2);
        qip.az(obj, "Listener must not be null");
        this.a = obj;
        qip.ax(str);
        this.b = new qqj(obj, str);
    }

    public final void a() {
        this.a = null;
        this.b = null;
    }

    public final void b(final qqk qqkVar) {
        qip.az(qqkVar, "Notifier must not be null");
        this.c.execute(new Runnable() { // from class: qqi
            @Override // java.lang.Runnable
            public final void run() {
                qql qqlVar = qql.this;
                qqk qqkVar2 = qqkVar;
                Object obj = qqlVar.a;
                if (obj == null) {
                    qqkVar2.b();
                    return;
                }
                try {
                    qqkVar2.a(obj);
                } catch (RuntimeException e) {
                    qqkVar2.b();
                    throw e;
                }
            }
        });
    }
}
