package defpackage;

import java.nio.charset.Charset;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class airw implements ayrs {
    private final /* synthetic */ int k;
    public static final /* synthetic */ airw j = new airw(9);
    public static final /* synthetic */ airw i = new airw(8);
    public static final /* synthetic */ airw h = new airw(7);
    public static final /* synthetic */ airw g = new airw(6);
    public static final /* synthetic */ airw f = new airw(5);
    public static final /* synthetic */ airw e = new airw(4);
    public static final /* synthetic */ airw d = new airw(3);
    public static final /* synthetic */ airw c = new airw(2);
    public static final /* synthetic */ airw b = new airw(1);
    public static final /* synthetic */ airw a = new airw(0);

    private /* synthetic */ airw(int i2) {
        this.k = i2;
    }

    @Override // defpackage.ayrs
    public final void a(Object obj) {
        switch (this.k) {
            case 0:
                wbs.H((Throwable) obj);
                return;
            case 1:
                wbs.H((Throwable) obj);
                return;
            case 2:
                wbs.H((Throwable) obj);
                return;
            case 3:
                wbs.H((Throwable) obj);
                return;
            case 4:
                wbs.H((Throwable) obj);
                return;
            case 5:
                wbs.H((Throwable) obj);
                return;
            case 6:
                wbs.H((Throwable) obj);
                return;
            case 7:
                aone aoneVar = (aone) obj;
                int i2 = alay.c;
                aoneVar.copyOnWrite();
                akzs akzsVar = (akzs) aoneVar.instance;
                akzs akzsVar2 = akzs.a;
                akzsVar.b |= 536870912;
                akzsVar.B = "copy";
                return;
            case 8:
                aone aoneVar2 = (aone) obj;
                Charset charset = alcn.a;
                aoneVar2.copyOnWrite();
                akzs akzsVar3 = (akzs) aoneVar2.instance;
                akzs akzsVar4 = akzs.a;
                akzsVar3.b |= 134217728;
                akzsVar3.z = false;
                return;
            default:
                aone aoneVar3 = (aone) obj;
                aoneVar3.copyOnWrite();
                akzs akzsVar5 = (akzs) aoneVar3.instance;
                akzs akzsVar6 = akzs.a;
                akzsVar5.s = 0;
                akzsVar5.b |= 131072;
                return;
        }
    }
}
