package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class acsr {
    public final boolean a;
    private final String b;

    public acsr(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    public static String a(asmb asmbVar) {
        return asmbVar.toString();
    }

    public final void b(String str) {
        if (this.a) {
            String str2 = this.b;
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 32 + String.valueOf(str).length());
            sb.append("[DefaultLatencyActionLogger] <");
            sb.append(str2);
            sb.append("> ");
            sb.append(str);
            zga.g(sb.toString());
        }
    }
}
