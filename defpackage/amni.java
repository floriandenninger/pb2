package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class amni extends amls {
    public amni(amnm amnmVar, CharSequence charSequence) {
        super(amnmVar, charSequence);
    }

    @Override // defpackage.amls
    public final int a(int i) {
        return i;
    }

    @Override // defpackage.amls
    public final int b(int i) {
        int i2 = i + 4000;
        if (i2 < this.b.length()) {
            return i2;
        }
        return -1;
    }
}
