package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ckk {
    private static final clg a = clg.a("fFamily", "fName", "fStyle", "ascent");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static cie a(clh clhVar) {
        clhVar.j();
        String str = null;
        String str2 = null;
        String str3 = null;
        while (clhVar.p()) {
            int c = clhVar.c(a);
            if (c == 0) {
                str = clhVar.h();
            } else if (c == 1) {
                str2 = clhVar.h();
            } else if (c == 2) {
                str3 = clhVar.h();
            } else if (c == 3) {
                clhVar.a();
            } else {
                clhVar.n();
                clhVar.o();
            }
        }
        clhVar.l();
        return new cie(str, str2, str3);
    }
}
