package defpackage;

import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajmi implements ajjy {
    private final ajlv a;

    public static ajmi a(ypa ypaVar, ajjz ajjzVar, ajzi ajziVar, int i, int i2, int i3, boolean z, acsy acsyVar, boolean z2, boolean z3, aksl akslVar) {
        if (i2 <= 0 || i3 < 0) {
            return null;
        }
        ajmi ajmiVar = new ajmi(ypaVar, ajjzVar, ajziVar, i, i2, i3, z, acsyVar, z2, z3, akslVar);
        ajmiVar.a.k();
        return ajmiVar;
    }

    public final void b() {
        this.a.l();
    }

    @Override // defpackage.ajjy
    public final void d(ImageView imageView, ajjv ajjvVar, avgg avggVar) {
        this.a.d(imageView, ajjvVar, avggVar);
    }

    @Override // defpackage.ajjy
    public final void e(ImageView imageView, ajjv ajjvVar, avgg avggVar) {
        this.a.e(imageView, ajjvVar, avggVar);
    }

    @Override // defpackage.ajjy
    public final void f(ImageView imageView, ajjv ajjvVar, avgg avggVar) {
        this.a.f(imageView, ajjvVar, avggVar);
    }

    @Override // defpackage.ajjy
    public final void g(ImageView imageView, ajjv ajjvVar, avgg avggVar) {
        this.a.g(imageView, ajjvVar, avggVar);
    }

    private ajmi(ypa ypaVar, ajjz ajjzVar, ajzi ajziVar, int i, int i2, int i3, boolean z, acsy acsyVar, boolean z2, boolean z3, aksl akslVar) {
        this.a = (!z || acsyVar == null) ? new ajly(ajjzVar, ajziVar, i, i2, i3, z2, z3, akslVar, ypaVar) : new ajme(ajjzVar, ajziVar, i, i2, i3, z2, z3, akslVar, acsyVar);
    }
}
