package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fpy {
    public fpx a;
    private boolean c = false;
    public boolean b = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(boolean z) {
        if (!this.b || this.c == z) {
            return;
        }
        this.c = z;
        fpx fpxVar = this.a;
        if (fpxVar != null) {
            fpxVar.a(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(fpx fpxVar) {
        if (this.a == fpxVar) {
            return;
        }
        if (fpxVar != null && this.b && this.c) {
            fpxVar.a(true);
        }
        this.a = fpxVar;
    }
}
