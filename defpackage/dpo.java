package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dpo {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ dpi b;
    public final /* synthetic */ dpt c;
    public final /* synthetic */ did d;

    public dpo(dpt dptVar, did didVar, boolean z, dpi dpiVar, byte[] bArr, byte[] bArr2) {
        this.c = dptVar;
        this.d = didVar;
        this.a = z;
        this.b = dpiVar;
    }

    public final void a() {
        if (this.a) {
            dpt dptVar = this.c;
            dpi dpiVar = this.b;
            if (dpiVar != null) {
                dptVar.d(dpiVar);
            }
        }
    }
}
