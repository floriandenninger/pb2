package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lkm implements zdj {
    final /* synthetic */ azrw a;
    private final /* synthetic */ int b;

    public lkm(azrw azrwVar, int i) {
        this.b = i;
        this.a = azrwVar;
    }

    @Override // defpackage.zdj
    public final anhy a() {
        if (this.b == 0) {
            return ((aili) this.a.get()).g();
        }
        return anaf.O(Boolean.valueOf(((fka) this.a.get()).g()));
    }

    @Override // defpackage.zdj
    public final /* synthetic */ anhy b(Object obj) {
        if (this.b == 0) {
            return ((aili) this.a.get()).a.b(new eou(((Boolean) obj).booleanValue(), 6));
        }
        return ((fka) this.a.get()).a.b(new lod((Boolean) obj, 1));
    }
}
