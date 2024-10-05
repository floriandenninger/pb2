package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awji implements aala {
    public static final aalb a = new awjh();
    private final aakv b;
    private final awjj c;

    public awji(awjj awjjVar, aakv aakvVar) {
        this.c = awjjVar;
        this.b = aakvVar;
    }

    @Override // defpackage.aakt
    public final amsx a() {
        amsv amsvVar = new amsv();
        awjj awjjVar = this.c;
        if ((awjjVar.c & 4) != 0) {
            amsvVar.c(awjjVar.e);
        }
        awjj awjjVar2 = this.c;
        if ((awjjVar2.c & 8) != 0) {
            amsvVar.c(awjjVar2.f);
        }
        return amsvVar.g();
    }

    public final awjp b() {
        aakt b = this.b.b(this.c.e);
        boolean z = true;
        if (b != null && !(b instanceof awjp)) {
            z = false;
        }
        amkq.O(z, "entityFromStore is not instance of YtMainVideoEntityModel, key=videoEntity");
        return (awjp) b;
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
        return new awjg(this.c.toBuilder());
    }

    @Override // defpackage.aakt
    public final boolean equals(Object obj) {
        return (obj instanceof awji) && this.c.equals(((awji) obj).c);
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
        sb.append("YtMainPlaylistVideoEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
