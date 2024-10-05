package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aag extends aae {
    final /* synthetic */ String a;
    final /* synthetic */ aam b;
    final /* synthetic */ aaj c;

    public aag(aaj aajVar, String str, aam aamVar) {
        this.c = aajVar;
        this.a = str;
        this.b = aamVar;
    }

    @Override // defpackage.aae
    public final void a() {
        this.c.d(this.a);
    }

    @Override // defpackage.aae
    public final void b(Object obj) {
        Integer num = (Integer) this.c.c.get(this.a);
        if (num == null) {
            throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.b + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }
        this.c.d.add(this.a);
        this.c.f(num.intValue(), this.b, obj);
    }
}
