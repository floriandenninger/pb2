package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ahml implements Runnable {
    final /* synthetic */ List a;
    final /* synthetic */ ahmt b;

    public ahml(ahmt ahmtVar, List list) {
        this.b = ahmtVar;
        this.a = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.k.j(this.a);
    }
}
