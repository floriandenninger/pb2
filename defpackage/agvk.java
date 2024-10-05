package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class agvk implements Runnable {
    public final /* synthetic */ agvo a;
    public final /* synthetic */ agnz b;
    private final /* synthetic */ int c;

    public /* synthetic */ agvk(agvo agvoVar, agnz agnzVar, int i) {
        this.c = i;
        this.a = agvoVar;
        this.b = agnzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        if (i == 0) {
            agvo agvoVar = this.a;
            agvoVar.a.f(this.b);
            return;
        }
        if (i == 1) {
            agvo agvoVar2 = this.a;
            agvoVar2.a.e(this.b);
            return;
        }
        if (i == 2) {
            agvo agvoVar3 = this.a;
            agvoVar3.a.h(this.b);
            return;
        }
        if (i == 3) {
            agvo agvoVar4 = this.a;
            agvoVar4.a.i(this.b);
        } else if (i == 4) {
            agvo agvoVar5 = this.a;
            agvoVar5.a.j(this.b);
        } else if (i != 5) {
            agvo agvoVar6 = this.a;
            agvoVar6.a.m(this.b);
        } else {
            agvo agvoVar7 = this.a;
            agvoVar7.a.k(this.b);
        }
    }
}
