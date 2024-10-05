package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class alrz implements alsd {
    public final Object a = new Object();
    public final alsa b;
    private final Executor c;

    public alrz(Executor executor, alsa alsaVar) {
        this.c = executor;
        this.b = alsaVar;
    }

    @Override // defpackage.alsd
    public final void a(alsc alscVar) {
        if (alscVar.c()) {
            synchronized (this.a) {
                if (this.b == null) {
                    return;
                }
                this.c.execute(new alry(this, alscVar));
            }
        }
    }
}
