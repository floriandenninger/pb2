package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ota implements amnv {
    final /* synthetic */ otb a;
    private final /* synthetic */ int b;

    public ota(otb otbVar, int i) {
        this.b = i;
        this.a = otbVar;
    }

    public final String a() {
        return this.b != 0 ? alvw.a(this.a.d) : String.valueOf(this.a.d.getPackageName()).concat(".api");
    }

    @Override // defpackage.amnv
    public final /* synthetic */ Object get() {
        return this.b != 0 ? a() : a();
    }
}
