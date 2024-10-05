package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class azxq extends azwj {
    /* JADX INFO: Access modifiers changed from: protected */
    public final String e() {
        azxq azxqVar;
        azxq a = azwv.a();
        if (this == a) {
            return "Dispatchers.Main";
        }
        try {
            azxqVar = a.f();
        } catch (UnsupportedOperationException unused) {
            azxqVar = null;
        }
        if (this == azxqVar) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    public abstract azxq f();

    @Override // defpackage.azwj
    public String toString() {
        String e = e();
        if (e != null) {
            return e;
        }
        return azth.g(this) + '@' + azth.h(this);
    }
}
