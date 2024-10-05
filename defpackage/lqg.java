package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class lqg {
    public final aupu a;

    public lqg(aupu aupuVar) {
        this.a = aupuVar;
    }

    public static lqg a(aupu aupuVar) {
        int bx = aobq.bx(aupuVar.c);
        if (bx == 0) {
            bx = 1;
        }
        int i = bx - 1;
        if (i == 270) {
            return new lqd(aupuVar);
        }
        if (i == 273) {
            return new lqe(aupuVar);
        }
        if (i != 280) {
            return i != 345 ? new lqc(aupuVar) : new lqb(aupuVar);
        }
        return new lqf(aupuVar);
    }
}
