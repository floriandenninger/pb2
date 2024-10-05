package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aoxm implements aala {
    public static final aalb a = new aoxk();
    public final aakv b;
    public final aoxn c;

    public aoxm(aoxn aoxnVar, aakv aakvVar) {
        this.c = aoxnVar;
        this.b = aakvVar;
    }

    @Override // defpackage.aakt
    public final amsx a() {
        amsv amsvVar = new amsv();
        aoxn aoxnVar = this.c;
        if ((aoxnVar.c & 2) != 0) {
            amsvVar.c(aoxnVar.e);
        }
        return amsvVar.g();
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
        return new aoxl(this.c.toBuilder());
    }

    @Override // defpackage.aakt
    public final boolean equals(Object obj) {
        return (obj instanceof aoxm) && this.c.equals(((aoxm) obj).c);
    }

    @Override // defpackage.aakt
    public aalb getType() {
        return a;
    }

    @Override // defpackage.aakt
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
        sb.append("AdPlaybackDataEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
