package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aftk implements aftl {
    private final /* synthetic */ int a;

    public aftk(int i) {
        this.a = i;
    }

    @Override // defpackage.aftl
    public final void a() {
        if (this.a != 0) {
            afsi.b(1, 4, "sign in cancelled");
        }
    }

    @Override // defpackage.aftl
    public final void b() {
    }

    @Override // defpackage.aftl
    public final void c(Exception exc) {
        if (this.a == 0 || exc == null) {
            return;
        }
        afsi.c(1, 4, "sign in failure", exc);
    }
}
