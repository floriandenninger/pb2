package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class uko implements amml {
    public final /* synthetic */ String a;
    public final /* synthetic */ int b;
    private final /* synthetic */ int c;

    public /* synthetic */ uko(String str, int i, int i2) {
        this.c = i2;
        this.a = str;
        this.b = i;
    }

    @Override // defpackage.amml
    public final Object apply(Object obj) {
        int i = this.c;
        if (i == 0) {
            return ((ukk) obj).f(this.a, this.b);
        }
        if (i == 1) {
            return ((ukk) obj).e(this.a, this.b);
        }
        String str = this.a;
        int i2 = this.b;
        aone builder = ((awwf) obj).toBuilder();
        String valueOf = String.valueOf(str);
        builder.bv(valueOf.length() != 0 ? "com.google.android.libraries.youtube.notification.badgecount.badgecount".concat(valueOf) : new String("com.google.android.libraries.youtube.notification.badgecount.badgecount"), i2);
        return (awwf) builder.build();
    }
}
