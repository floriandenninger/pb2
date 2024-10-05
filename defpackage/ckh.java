package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ckh implements cld {
    public static final ckh a = new ckh();
    private static final clg b = clg.a("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of");

    private ckh() {
    }

    @Override // defpackage.cld
    public final /* bridge */ /* synthetic */ Object a(clh clhVar, float f) {
        clhVar.j();
        String str = null;
        String str2 = null;
        float f2 = 0.0f;
        int i = 3;
        int i2 = 0;
        float f3 = 0.0f;
        float f4 = 0.0f;
        int i3 = 0;
        int i4 = 0;
        float f5 = 0.0f;
        boolean z = true;
        while (clhVar.p()) {
            switch (clhVar.c(b)) {
                case 0:
                    str = clhVar.h();
                    break;
                case 1:
                    str2 = clhVar.h();
                    break;
                case 2:
                    f2 = (float) clhVar.a();
                    break;
                case 3:
                    int b2 = clhVar.b();
                    if (b2 <= 2 && b2 >= 0) {
                        i = new int[]{1, 2, 3}[b2];
                        break;
                    } else {
                        i = 3;
                        break;
                    }
                case 4:
                    i2 = clhVar.b();
                    break;
                case 5:
                    f3 = (float) clhVar.a();
                    break;
                case 6:
                    f4 = (float) clhVar.a();
                    break;
                case 7:
                    i3 = cko.b(clhVar);
                    break;
                case 8:
                    i4 = cko.b(clhVar);
                    break;
                case 9:
                    f5 = (float) clhVar.a();
                    break;
                case 10:
                    z = clhVar.q();
                    break;
                default:
                    clhVar.n();
                    clhVar.o();
                    break;
            }
        }
        clhVar.l();
        return new cid(str, str2, f2, i, i2, f3, f4, i3, i4, f5, z);
    }
}
