package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aswj implements aala {
    public static final aalb a = new aswi();
    private final aswk b;

    public aswj(aswk aswkVar) {
        this.b = aswkVar;
    }

    @Override // defpackage.aakt
    public final amsx a() {
        amsv amsvVar = new amsv();
        aswk aswkVar = this.b;
        if ((aswkVar.b & 4) != 0) {
            amsvVar.c(aswkVar.d);
        }
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
        return new aswh(this.b.toBuilder());
    }

    @Override // defpackage.aakt
    public final boolean equals(Object obj) {
        return (obj instanceof aswj) && this.b.equals(((aswj) obj).b);
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33);
        sb.append("MainAppVideoMetadataEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
