package defpackage;

import java.util.Collection;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bow implements Runnable {
    final /* synthetic */ bou a;
    final /* synthetic */ Collection b;
    final /* synthetic */ boz c;
    final /* synthetic */ bpk d;
    private final /* synthetic */ int e;

    public bow(boz bozVar, bpk bpkVar, bou bouVar, Collection collection, int i) {
        this.e = i;
        this.c = bozVar;
        this.d = bpkVar;
        this.a = bouVar;
        this.b = collection;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.e != 0) {
            this.d.a(this.c, this.a, this.b);
        } else {
            this.d.a(this.c, this.a, this.b);
        }
    }
}
