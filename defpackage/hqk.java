package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hqk {
    final hpb a;
    public final hqo b;
    public final jqr c;

    public hqk(hpb hpbVar, hqo hqoVar, jqr jqrVar, byte[] bArr) {
        this.a = hpbVar;
        this.b = hqoVar;
        this.c = jqrVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(vsy vsyVar, float f) {
        if (vsyVar.b.a() >= 0.5625f) {
            float j = 1.0f - (((vsyVar.b.j() / 16.0f) * 9.0f) / vsyVar.b.k());
            vsyVar.A(0.0d, 0.0d);
            vsyVar.z(j * f, j * (1.0f - f));
        } else {
            float k = 1.0f - (((vsyVar.b.k() / 9.0f) * 16.0f) / vsyVar.b.j());
            vsyVar.z(0.0d, 0.0d);
            vsyVar.A(k * f, k * (1.0f - f));
        }
        this.a.b = vsyVar;
    }
}
