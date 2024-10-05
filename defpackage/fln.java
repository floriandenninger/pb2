package defpackage;

import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fln {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();
    public boolean b;

    public final void a(flm flmVar) {
        if (flmVar == null) {
            return;
        }
        this.a.add(flmVar);
    }

    public final void b(flm flmVar) {
        if (flmVar == null) {
            return;
        }
        this.a.remove(flmVar);
    }
}
