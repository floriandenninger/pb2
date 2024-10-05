package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class amnc extends amls {
    final /* synthetic */ amnd g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amnc(amnd amndVar, amnm amnmVar, CharSequence charSequence) {
        super(amnmVar, charSequence);
        this.g = amndVar;
    }

    @Override // defpackage.amls
    public final int a(int i) {
        return i + 1;
    }

    @Override // defpackage.amls
    public final int b(int i) {
        return this.g.a.c(this.b, i);
    }
}
