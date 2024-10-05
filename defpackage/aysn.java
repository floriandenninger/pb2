package defpackage;

import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aysn implements ayrm {
    final Future a;

    public aysn(Future future) {
        this.a = future;
    }

    @Override // defpackage.ayrm
    public final void a() {
        this.a.get();
    }
}
