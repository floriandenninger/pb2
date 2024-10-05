package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class amng extends amls {
    final /* synthetic */ ammf g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amng(amnm amnmVar, CharSequence charSequence, ammf ammfVar) {
        super(amnmVar, charSequence);
        this.g = ammfVar;
    }

    @Override // defpackage.amls
    public final int a(int i) {
        return this.g.a.end();
    }

    @Override // defpackage.amls
    public final int b(int i) {
        if (this.g.a.find(i)) {
            return this.g.a.start();
        }
        return -1;
    }
}
