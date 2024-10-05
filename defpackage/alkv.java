package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alkv {

    @Deprecated
    public float a;

    @Deprecated
    public float b;

    @Deprecated
    public float c;

    @Deprecated
    public float d;

    @Deprecated
    public float e;
    public final List f = new ArrayList();
    private final List g = new ArrayList();

    public alkv() {
        e();
    }

    private final void g(float f) {
        float f2 = this.d;
        if (f2 != f) {
            float f3 = ((f - f2) + 360.0f) % 360.0f;
            if (f3 > 180.0f) {
                return;
            }
            float f4 = this.b;
            float f5 = this.c;
            alkr alkrVar = new alkr(f4, f5, f4, f5);
            alkrVar.e = this.d;
            alkrVar.f = f3;
            this.g.add(new alkp(alkrVar));
            this.d = f;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final alku a(Matrix matrix) {
        g(this.e);
        return new alko(new ArrayList(this.g), new Matrix(matrix));
    }

    public final void b(alku alkuVar, float f, float f2) {
        g(f);
        this.g.add(alkuVar);
        this.d = f2;
    }

    public final void c(Matrix matrix, Path path) {
        int size = this.f.size();
        for (int i = 0; i < size; i++) {
            ((alkt) this.f.get(i)).a(matrix, path);
        }
    }

    public final void d(float f, float f2) {
        alks alksVar = new alks();
        alksVar.a = f;
        alksVar.b = f2;
        this.f.add(alksVar);
        alkq alkqVar = new alkq(alksVar, this.b, this.c);
        b(alkqVar, alkqVar.b() + 270.0f, alkqVar.b() + 270.0f);
        this.b = f;
        this.c = f2;
    }

    public final void e() {
        f(0.0f, 270.0f, 0.0f);
    }

    public final void f(float f, float f2, float f3) {
        this.a = f;
        this.b = 0.0f;
        this.c = f;
        this.d = f2;
        this.e = (f2 + f3) % 360.0f;
        this.f.clear();
        this.g.clear();
    }
}
