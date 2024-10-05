package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class aos {
    public final aox c;
    boolean d;
    int e = -1;
    final /* synthetic */ aot f;

    public aos(aot aotVar, aox aoxVar) {
        this.f = aotVar;
        this.c = aoxVar;
    }

    public void b() {
    }

    public boolean c(aok aokVar) {
        return false;
    }

    public final void d(boolean z) {
        if (z == this.d) {
            return;
        }
        this.d = z;
        this.f.d(true != z ? -1 : 1);
        if (this.d) {
            this.f.e(this);
        }
    }

    public abstract boolean jG();
}
