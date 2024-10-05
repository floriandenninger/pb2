package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class kte implements ayrs {
    public final /* synthetic */ ktg a;
    private final /* synthetic */ int b;

    public /* synthetic */ kte(ktg ktgVar, int i) {
        this.b = i;
        this.a = ktgVar;
    }

    @Override // defpackage.ayrs
    public final void a(Object obj) {
        if (this.b == 0) {
            ktg ktgVar = this.a;
            ktgVar.e = true;
            ktgVar.d();
            return;
        }
        ktg ktgVar2 = this.a;
        if (ktgVar2.f == ((ahdv) obj).c().b(aigk.VIDEO_WATCH_LOADED)) {
            return;
        }
        ktgVar2.f = true;
        ktgVar2.e();
    }
}
