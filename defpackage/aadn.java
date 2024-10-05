package defpackage;

import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aadn implements aaha {
    public final aawl a;
    private final Executor b;

    public aadn(Executor executor, aawl aawlVar) {
        this.b = executor;
        this.a = aawlVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        this.b.execute(new Runnable() { // from class: aadm
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    aadn.this.a.a();
                } catch (aasx e) {
                    zga.f("RefreshConfigCommandResolver", "Could not refresh the config: ", e);
                }
            }
        });
    }
}
