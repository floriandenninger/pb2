package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahju implements ahjn {
    float a = 0.0f;
    final /* synthetic */ ahjv b;

    public ahju(ahjv ahjvVar) {
        this.b = ahjvVar;
    }

    @Override // defpackage.ahjn
    public final void a(float f, float f2) {
        float f3 = f2 / 2.0f;
        this.b.b.l(0.0f, f3 - this.a, 0.0f);
        this.b.a.l(0.0f, f3 - this.a, 0.0f);
        this.a = f3;
    }
}
