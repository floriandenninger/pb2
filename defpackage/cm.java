package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cm {
    public final co a;

    private cm(co coVar) {
        this.a = coVar;
    }

    public static cm a(co coVar) {
        return new cm(coVar);
    }

    public final dd b() {
        return this.a.e;
    }

    public final void c() {
        this.a.e.noteStateNotSaved();
    }

    public final void d() {
        this.a.e.ah(true);
    }
}
