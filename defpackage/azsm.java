package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azsm implements azst {
    private final azst a;
    private final aztu b;

    public azsm(azst azstVar, aztu aztuVar) {
        this.b = aztuVar;
        this.a = azstVar instanceof azsm ? ((azsm) azstVar).a : azstVar;
    }

    public final azss a(azss azssVar) {
        return (azss) this.b.a(azssVar);
    }

    public final boolean b(azst azstVar) {
        azstVar.getClass();
        return azstVar == this || this.a == azstVar;
    }

    public azsm() {
        throw null;
    }
}
