package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aou implements aox {
    final aot a;
    final aox b;
    int c = -1;

    public aou(aot aotVar, aox aoxVar) {
        this.a = aotVar;
        this.b = aoxVar;
    }

    @Override // defpackage.aox
    public final void a(Object obj) {
        if (this.c != this.a.a()) {
            this.c = this.a.a();
            this.b.a(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        this.a.g(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        this.a.k(this);
    }
}
