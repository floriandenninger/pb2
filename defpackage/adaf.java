package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adaf {
    public final azrl a = azrl.e();

    static {
        zga.a("Handoff.MarkActionTerminal");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(String str) {
        b(str, 3);
    }

    public final void b(String str, int i) {
        String.format("Marking action[%s] as %s", str, amkq.dW(i));
        azrl azrlVar = this.a;
        adai adaiVar = new adai();
        if (str != null) {
            adaiVar.a = str;
            adaiVar.b = i;
            adaiVar.c = 6;
            String str2 = adaiVar.a;
            if (str2 == null) {
                StringBuilder sb = new StringBuilder();
                if (adaiVar.b == 0) {
                    sb.append(" actionState");
                }
                if (adaiVar.c == 0) {
                    sb.append(" featureType");
                }
                if (adaiVar.a == null) {
                    sb.append(" actionId");
                }
                String valueOf = String.valueOf(sb);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
                sb2.append("Missing required properties:");
                sb2.append(valueOf);
                throw new IllegalStateException(sb2.toString());
            }
            azrlVar.c(new adaj(i, str2));
            return;
        }
        throw new NullPointerException("Null actionId");
    }
}
