package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class hkr implements Runnable {
    public final /* synthetic */ hkt a;
    private final /* synthetic */ int b;

    public /* synthetic */ hkr(hkt hktVar, int i) {
        this.b = i;
        this.a = hktVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            hkt hktVar = this.a;
            hktVar.e.setVisibility(0);
            hktVar.d.setVisibility(8);
            return;
        }
        if (i == 1) {
            hkt hktVar2 = this.a;
            hktVar2.e.setVisibility(8);
            hktVar2.d.setVisibility(8);
            return;
        }
        if (i == 2) {
            hkt hktVar3 = this.a;
            hktVar3.c.setVisibility(0);
            hktVar3.b.setVisibility(8);
        } else if (i == 3) {
            hkt hktVar4 = this.a;
            hktVar4.d.setVisibility(0);
            hktVar4.e.setVisibility(8);
        } else if (i == 4) {
            hkt hktVar5 = this.a;
            hktVar5.b.setVisibility(0);
            hktVar5.c.setVisibility(8);
        } else {
            hkt hktVar6 = this.a;
            hktVar6.c.setVisibility(8);
            hktVar6.b.setVisibility(8);
        }
    }
}
