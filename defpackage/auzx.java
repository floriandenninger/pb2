package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class auzx implements aala {
    public static final aalb a = new auzw();
    private final auzy b;

    public auzx(auzy auzyVar) {
        this.b = auzyVar;
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
        return new auzv(this.b.toBuilder());
    }

    @Override // defpackage.aakt
    public final boolean equals(Object obj) {
        return (obj instanceof auzx) && this.b.equals(((auzx) obj).b);
    }

    public auzz getState() {
        auzz b = auzz.b(this.b.d);
        return b == null ? auzz.SUBSCRIPTION_NOTIFICATION_SETTING_STATE_UNKNOWN : b;
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 44);
        sb.append("SubscriptionNotificationSettingEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
