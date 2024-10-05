package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class acml implements acaa {
    final /* synthetic */ acmq a;
    private boolean b;
    private boolean c;

    public acml(acmq acmqVar) {
        this.a = acmqVar;
    }

    @Override // defpackage.acaa
    public final void a(acac acacVar) {
        acmq acmqVar = this.a;
        if (acacVar == acmqVar.m) {
            this.b = true;
        }
        if (acacVar == acmqVar.o) {
            this.c = true;
        }
        if (this.b && this.c) {
            this.b = false;
            this.c = false;
            acmqVar.b.removeCallbacks(acmqVar.r);
            acmq acmqVar2 = this.a;
            acmqVar2.b.post(acmqVar2.q);
        }
    }
}
