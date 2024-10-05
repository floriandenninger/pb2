package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alkj extends alkd {
    @Override // defpackage.alkd
    public final void c(alkv alkvVar, float f, float f2) {
        alkvVar.f(f2 * f, 180.0f, 90.0f);
        float f3 = (f2 + f2) * f;
        alkr alkrVar = new alkr(0.0f, 0.0f, f3, f3);
        alkrVar.e = 180.0f;
        alkrVar.f = 90.0f;
        alkvVar.f.add(alkrVar);
        alkvVar.b(new alkp(alkrVar), 180.0f, 270.0f);
        float f4 = f3 + 0.0f;
        float f5 = 0.5f * f4;
        float f6 = f4 / 2.0f;
        alkvVar.b = (((float) Math.cos(Math.toRadians(270.0d))) * f6) + f5;
        alkvVar.c = f5 + (f6 * ((float) Math.sin(Math.toRadians(270.0d))));
    }
}
