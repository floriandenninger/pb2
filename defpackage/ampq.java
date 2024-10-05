package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ampq extends ampt {
    final /* synthetic */ ampx a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ampq(ampx ampxVar) {
        super(ampxVar);
        this.a = ampxVar;
    }

    @Override // defpackage.ampt
    public final /* bridge */ /* synthetic */ Object a(int i) {
        return new ampv(this.a, i);
    }
}
