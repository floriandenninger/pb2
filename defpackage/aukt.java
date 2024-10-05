package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aukt implements aala {
    public static final aalb a = new auks();
    private final aakv b;
    private final auku c;

    public aukt(auku aukuVar, aakv aakvVar) {
        this.c = aukuVar;
        this.b = aakvVar;
    }

    @Override // defpackage.aakt
    public final amsx a() {
        amsv amsvVar = new amsv();
        amsvVar.j(getUpdatedEndpointProtoModel().a());
        return amsvVar.g();
    }

    public final boolean b() {
        return (this.c.c & 2) != 0;
    }

    @Override // defpackage.aakt
    public final byte[] c() {
        return this.c.toByteArray();
    }

    @Override // defpackage.aakt
    public final String d() {
        return this.c.d;
    }

    @Override // defpackage.aakt
    public final /* bridge */ /* synthetic */ whu e() {
        return new aukr(this.c.toBuilder());
    }

    @Override // defpackage.aakt
    public final boolean equals(Object obj) {
        return (obj instanceof aukt) && this.c.equals(((aukt) obj).c);
    }

    public final boolean f() {
        return (this.c.c & 4) != 0;
    }

    @Override // defpackage.aakt
    public aalb getType() {
        return a;
    }

    public aomf getUpdatedEndpoint() {
        return this.c.e;
    }

    public apxf getUpdatedEndpointProto() {
        apxf apxfVar = this.c.f;
        return apxfVar == null ? apxf.a : apxfVar;
    }

    public apxe getUpdatedEndpointProtoModel() {
        apxf apxfVar = this.c.f;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        return apxe.b(apxfVar).e(this.b);
    }

    @Override // defpackage.aakt
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
        sb.append("ReelWatchEndpointDataEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
