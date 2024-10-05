package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avvk implements aala {
    public static final aalb a = new avvj();
    private final avvl b;

    public avvk(avvl avvlVar) {
        this.b = avvlVar;
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
        return new avvi(this.b.toBuilder());
    }

    @Override // defpackage.aakt
    public final boolean equals(Object obj) {
        return (obj instanceof avvk) && this.b.equals(((avvk) obj).b);
    }

    public String getAccessibilityFormattedAmount() {
        return this.b.e;
    }

    public Long getAmountMicros() {
        return Long.valueOf(this.b.f);
    }

    public String getFormattedAmount() {
        return this.b.d;
    }

    @Override // defpackage.aakt
    public aalb getType() {
        return a;
    }

    public String getVirtualCurrencyCode() {
        return this.b.g;
    }

    @Override // defpackage.aakt
    public final int hashCode() {
        return this.b.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
        sb.append("VcBalanceEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
