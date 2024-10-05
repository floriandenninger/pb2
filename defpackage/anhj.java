package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anhj implements Runnable {
    final /* synthetic */ anho a;
    final /* synthetic */ amru b;
    final /* synthetic */ int c;

    public anhj(anho anhoVar, amru amruVar, int i) {
        this.a = anhoVar;
        this.b = amruVar;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        anho anhoVar = this.a;
        amru amruVar = this.b;
        int i = this.c;
        anhy[] anhyVarArr = anhoVar.d;
        anhy anhyVar = anhyVarArr[i];
        anhyVar.getClass();
        anhyVarArr[i] = null;
        int i2 = anhoVar.e;
        while (true) {
            int i3 = ((amvj) amruVar).c;
            if (i2 >= i3) {
                anhoVar.e = i3;
                return;
            } else {
                if (((anfm) amruVar.get(i2)).qK(anhyVar)) {
                    anhoVar.a();
                    anhoVar.e = i2 + 1;
                    return;
                }
                i2++;
            }
        }
    }
}
