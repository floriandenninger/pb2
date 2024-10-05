package defpackage;

import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qnj {
    public static final qnj a = new qnj(true);
    public final boolean b;

    public qnj() {
        this(false);
    }

    public qnj(boolean z) {
        this.b = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(String str, qss qssVar, boolean z, boolean z2) {
        String str2 = true != z2 ? "not allowed" : "debug cert rejected";
        MessageDigest a2 = qtk.a("SHA-1");
        qip.an(a2);
        return String.format("%s: pkg=%s, sha1=%s, atk=%s, ver=%s", str2, str, qtm.a(a2.digest(((qnf) qssVar).a)), Boolean.valueOf(z), "213880000.false");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static qnj b() {
        return new qnj(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static qnj c() {
        return new qnj(false);
    }
}
