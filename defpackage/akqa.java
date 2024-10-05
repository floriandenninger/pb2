package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class akqa implements akqb {
    private final /* synthetic */ int a;

    public akqa(int i) {
        this.a = i;
    }

    @Override // defpackage.akqb
    public final int a() {
        return this.a != 0 ? 10000 : Integer.MAX_VALUE;
    }

    @Override // defpackage.akqb
    public final boolean b() {
        return this.a != 0;
    }
}
