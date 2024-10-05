package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uil {
    public uis a;
    public adrv b;

    public uil() {
    }

    public uil(uim uimVar) {
        this.b = uimVar.b;
        this.a = uimVar.a;
    }

    public final uim a() {
        uis uisVar;
        adrv adrvVar = this.b;
        if (adrvVar == null || (uisVar = this.a) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.b == null) {
                sb.append(" onContinueWithAccountListenerWithAsyncCallback");
            }
            if (this.a == null) {
                sb.append(" features");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new uim(adrvVar, uisVar);
    }
}
