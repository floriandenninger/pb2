package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class audz implements aala {
    public static final aalb a = new audy();
    public final auea b;

    public audz(auea aueaVar) {
        this.b = aueaVar;
    }

    @Override // defpackage.aakt
    public final amsx a() {
        amsv amsvVar = new amsv();
        getPostCreationDataModel();
        amsvVar.j(new amsv().g());
        return amsvVar.g();
    }

    @Override // defpackage.aakt
    public final byte[] c() {
        return this.b.toByteArray();
    }

    @Override // defpackage.aakt
    public final String d() {
        return this.b.c;
    }

    @Override // defpackage.aakt
    public final /* bridge */ /* synthetic */ whu e() {
        return new audx(this.b.toBuilder());
    }

    @Override // defpackage.aakt
    public final boolean equals(Object obj) {
        return (obj instanceof audz) && this.b.equals(((audz) obj).b);
    }

    public auec getPostCreationData() {
        auec auecVar = this.b.d;
        return auecVar == null ? auec.a : auecVar;
    }

    public aueb getPostCreationDataModel() {
        auec auecVar = this.b.d;
        if (auecVar == null) {
            auecVar = auec.a;
        }
        return new aueb((auec) auecVar.toBuilder().build());
    }

    @Override // defpackage.aakt
    public aalb getType() {
        return a;
    }

    @Override // defpackage.aakt
    public final int hashCode() {
        return this.b.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 29);
        sb.append("PostCreationDataEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
