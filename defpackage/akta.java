package defpackage;

import android.os.Handler;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akta {
    public final long a;
    public final Handler b;
    public final akss c;
    public final aktg e;
    public final Thread f = new aksz(this);
    public final AtomicReference d = new AtomicReference();

    public akta(aktg aktgVar, akss akssVar) {
        this.e = aktgVar;
        this.a = aktgVar.e.b();
        this.b = new Handler(aktgVar.b.getMainLooper());
        this.c = akssVar;
    }
}
