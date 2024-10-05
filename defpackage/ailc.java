package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ailc {
    public final String a;
    public final ykl b;
    final /* synthetic */ aild c;
    private final aryi d;

    public ailc(aild aildVar, aryi aryiVar, ykl yklVar, String str) {
        this.c = aildVar;
        this.a = str;
        this.d = aryiVar;
        this.b = yklVar;
    }

    public final void b() {
        aile.a(this.b, aild.h(this.d, this.a));
    }

    public void a() {
        int bG = anaf.bG(this.d.c);
        if (bG == 0 || bG != 4) {
            int bG2 = anaf.bG(this.d.c);
            if (bG2 != 0 && bG2 == 6) {
                this.c.b = anaf.O(true);
                this.c.e();
            }
            int bG3 = anaf.bG(this.d.c);
            if (bG3 != 0 && bG3 == 5) {
                this.c.c = true;
            }
            aile.b(this.b);
            return;
        }
        this.c.b(this.d, this.b, this.a);
    }
}
