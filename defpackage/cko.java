package defpackage;

import android.graphics.Color;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class cko {
    private static final clg a = clg.a("x", "y");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float a(clh clhVar) {
        int r = clhVar.r();
        int i = r - 1;
        if (i == 0) {
            clhVar.i();
            float a2 = (float) clhVar.a();
            while (clhVar.p()) {
                clhVar.o();
            }
            clhVar.k();
            return a2;
        }
        if (i != 6) {
            String c = abu.c(r);
            StringBuilder sb = new StringBuilder(c.length() + 32);
            sb.append("Unknown value for token of type ");
            sb.append(c);
            throw new IllegalArgumentException(sb.toString());
        }
        return (float) clhVar.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(clh clhVar) {
        clhVar.i();
        int a2 = (int) (clhVar.a() * 255.0d);
        int a3 = (int) (clhVar.a() * 255.0d);
        int a4 = (int) (clhVar.a() * 255.0d);
        while (clhVar.p()) {
            clhVar.o();
        }
        clhVar.k();
        return Color.argb(PrivateKeyType.INVALID, a2, a3, a4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static PointF c(clh clhVar, float f) {
        int r = clhVar.r() - 1;
        if (r == 0) {
            clhVar.i();
            float a2 = (float) clhVar.a();
            float a3 = (float) clhVar.a();
            while (clhVar.r() != 2) {
                clhVar.o();
            }
            clhVar.k();
            return new PointF(a2 * f, a3 * f);
        }
        if (r != 2) {
            if (r == 6) {
                float a4 = (float) clhVar.a();
                float a5 = (float) clhVar.a();
                while (clhVar.p()) {
                    clhVar.o();
                }
                return new PointF(a4 * f, a5 * f);
            }
            String c = abu.c(clhVar.r());
            StringBuilder sb = new StringBuilder(c.length() + 26);
            sb.append("Unknown point starts with ");
            sb.append(c);
            throw new IllegalArgumentException(sb.toString());
        }
        clhVar.j();
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (clhVar.p()) {
            int c2 = clhVar.c(a);
            if (c2 == 0) {
                f2 = a(clhVar);
            } else if (c2 == 1) {
                f3 = a(clhVar);
            } else {
                clhVar.n();
                clhVar.o();
            }
        }
        clhVar.l();
        return new PointF(f2 * f, f3 * f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List d(clh clhVar, float f) {
        ArrayList arrayList = new ArrayList();
        clhVar.i();
        while (clhVar.r() == 1) {
            clhVar.i();
            arrayList.add(c(clhVar, f));
            clhVar.k();
        }
        clhVar.k();
        return arrayList;
    }
}
