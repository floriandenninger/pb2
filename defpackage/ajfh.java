package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ajfh implements ajwv {
    public static final /* synthetic */ int a = 0;
    private static final AtomicBoolean b = new AtomicBoolean(false);

    public ajfh(Executor executor) {
        this(executor, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract aqrf a(Object obj);

    @Override // defpackage.ajwv
    public final void b(Object obj, ajwu ajwuVar) {
        aqrf a2 = a(obj);
        if (a2 != null) {
            ajwuVar.a(ajds.a(a2));
        }
    }

    @Override // defpackage.ajwv
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.ajwv
    public final ammy e() {
        return new ammy() { // from class: ajff
            @Override // defpackage.ammy
            public final boolean a(Object obj) {
                return (obj == null || ajfh.this.a(obj) == null) ? false : true;
            }
        };
    }

    public ajfh(Executor executor, boolean z) {
        if (b.compareAndSet(false, true)) {
            aoes.e = z;
            executor.execute(omm.f);
            executor.execute(ajfg.a);
        }
    }
}
