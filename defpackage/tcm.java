package defpackage;

import com.google.android.libraries.glide.fife.FifeUrl;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tcm {
    private final FifeUrl a;
    private final tcn b;
    private final tcl c;

    static {
        new tcn();
    }

    public tcm(FifeUrl fifeUrl, tcn tcnVar, int i) {
        tcl tclVar = new tcl(i);
        this.a = fifeUrl;
        this.b = tcnVar;
        this.c = tclVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof tcm) {
            tcm tcmVar = (tcm) obj;
            if (this.a.equals(tcmVar.a) && this.b.equals(tcmVar.b) && this.c.equals(tcmVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ddn.f(this.a, ddn.f(this.b, this.c.hashCode()));
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 56 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("FifeModel{fifeUrl='");
        sb.append(valueOf);
        sb.append("', fifeUrlOptions='");
        sb.append(valueOf2);
        sb.append("', accountInfo='");
        sb.append(valueOf3);
        sb.append("'}");
        return sb.toString();
    }
}
