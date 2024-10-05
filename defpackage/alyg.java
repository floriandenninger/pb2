package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alyg {
    private Boolean a;
    private amrp b;
    private amru c;

    public final alyh a() {
        amrp amrpVar = this.b;
        if (amrpVar != null) {
            this.c = amrpVar.g();
        } else if (this.c == null) {
            this.c = amru.q();
        }
        Boolean bool = this.a;
        if (bool == null) {
            throw new IllegalStateException("Missing required properties: canSwitchAccounts");
        }
        return new alyh(bool.booleanValue(), this.c);
    }

    public final void b(Class cls) {
        if (this.b == null) {
            this.b = amru.f();
        }
        this.b.h(cls);
    }

    public final void c(boolean z) {
        this.a = Boolean.valueOf(z);
    }
}
