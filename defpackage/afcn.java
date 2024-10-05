package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class afcn {
    public final afcp a;
    public final int b;
    private final int c;
    private final int d;

    public afcn(afcp afcpVar, int i, int i2, int i3) {
        this.a = afcpVar;
        this.c = i;
        this.b = i2;
        this.d = i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(afco afcoVar) {
        afcoVar.c = this.a;
        int i = this.c;
        if (i != 0) {
            afcoVar.b = i;
        }
        afcoVar.a = this.d;
    }
}
