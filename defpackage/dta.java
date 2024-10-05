package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dta implements dtb {
    private final /* synthetic */ int c;

    public dta(int i) {
        this.c = i;
    }

    @Override // defpackage.dtb
    public final void a(int i, dsa dsaVar) {
        if (this.c != 0) {
            for (int i2 = 0; i2 < i && dsaVar.a(i2); i2++) {
            }
            return;
        }
        do {
            i--;
            if (i < 0) {
                return;
            }
        } while (dsaVar.a(i));
    }
}
