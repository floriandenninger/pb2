package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
abstract class jso extends jsn {
    private final azrw a;

    /* JADX INFO: Access modifiers changed from: protected */
    public jso(azrw azrwVar, Class cls) {
        super(fjs.class, cls);
        this.a = azrwVar;
    }

    protected abstract Object a(agsn agsnVar, amrz amrzVar);

    @Override // defpackage.jtc
    public final /* bridge */ /* synthetic */ Object b(Object obj, amrz amrzVar) {
        if (((fjs) obj).h()) {
            return a(((agof) this.a.get()).a(), amrzVar);
        }
        return f();
    }

    protected abstract Object f();
}
