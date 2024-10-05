package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class auyy implements aala {
    public static final aalb a = new auyx();
    private final auyz b;

    public auyy(auyz auyzVar) {
        this.b = auyzVar;
    }

    @Override // defpackage.aakt
    public final amsx a() {
        return new amsv().g();
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
        return new auyw(this.b.toBuilder());
    }

    @Override // defpackage.aakt
    public final boolean equals(Object obj) {
        return (obj instanceof auyy) && this.b.equals(((auyy) obj).b);
    }

    public astk getConnectionState() {
        astk b = astk.b(this.b.d);
        return b == null ? astk.LIVESTREAM_CONNECTION_STATE_UNKNOWN : b;
    }

    public Boolean getHidden() {
        return Boolean.valueOf(this.b.e);
    }

    public Boolean getMuted() {
        return Boolean.valueOf(this.b.f);
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
        sb.append("StreamStatusDataEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
