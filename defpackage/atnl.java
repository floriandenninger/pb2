package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atnl implements aala {
    public static final aalb a = new atnk();
    private final atnm b;

    public atnl(atnm atnmVar) {
        this.b = atnmVar;
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
        return this.b.d;
    }

    @Override // defpackage.aakt
    public final /* bridge */ /* synthetic */ whu e() {
        return new atnj(this.b.toBuilder());
    }

    @Override // defpackage.aakt
    public final boolean equals(Object obj) {
        return (obj instanceof atnl) && this.b.equals(((atnl) obj).b);
    }

    public atno getState() {
        atno b = atno.b(this.b.e);
        return b == null ? atno.NOTIFICATION_OS_SETTING_STATE_UNKNOWN : b;
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
        sb.append("NotificationOsSettingEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
