package defpackage;

import android.graphics.Color;
import android.graphics.PointF;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cki implements cld {
    private final /* synthetic */ int g;
    public static final cki f = new cki(5);
    public static final cki e = new cki(4);
    public static final cki d = new cki(3);
    public static final cki c = new cki(2);
    public static final cki b = new cki(1);
    public static final cki a = new cki(0);

    private cki(int i) {
        this.g = i;
    }

    @Override // defpackage.cld
    public final /* synthetic */ Object a(clh clhVar, float f2) {
        int i = this.g;
        if (i == 0) {
            return Float.valueOf(cko.a(clhVar) * f2);
        }
        if (i == 1) {
            int r = clhVar.r();
            if (r == 1) {
                clhVar.i();
            }
            double a2 = clhVar.a();
            double a3 = clhVar.a();
            double a4 = clhVar.a();
            double a5 = clhVar.r() == 7 ? clhVar.a() : 1.0d;
            if (r == 1) {
                clhVar.k();
            }
            if (a2 <= 1.0d && a3 <= 1.0d && a4 <= 1.0d) {
                a2 *= 255.0d;
                a3 *= 255.0d;
                a4 *= 255.0d;
                if (a5 <= 1.0d) {
                    a5 *= 255.0d;
                }
            }
            return Integer.valueOf(Color.argb((int) a5, (int) a2, (int) a3, (int) a4));
        }
        if (i == 2) {
            return Integer.valueOf(Math.round(cko.a(clhVar) * f2));
        }
        if (i == 3) {
            return cko.c(clhVar, f2);
        }
        if (i == 4) {
            int r2 = clhVar.r();
            if (r2 == 1) {
                return cko.c(clhVar, f2);
            }
            if (r2 == 3) {
                return cko.c(clhVar, f2);
            }
            if (r2 == 7) {
                PointF pointF = new PointF(((float) clhVar.a()) * f2, ((float) clhVar.a()) * f2);
                while (clhVar.p()) {
                    clhVar.o();
                }
                return pointF;
            }
            String c2 = abu.c(r2);
            StringBuilder sb = new StringBuilder(c2.length() + 44);
            sb.append("Cannot convert json to point. Next token is ");
            sb.append(c2);
            throw new IllegalArgumentException(sb.toString());
        }
        int r3 = clhVar.r();
        if (r3 == 1) {
            clhVar.i();
        }
        float a6 = (float) clhVar.a();
        float a7 = (float) clhVar.a();
        while (clhVar.p()) {
            clhVar.o();
        }
        if (r3 == 1) {
            clhVar.k();
        }
        return new clv((a6 / 100.0f) * f2, (a7 / 100.0f) * f2);
    }
}
