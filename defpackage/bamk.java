package defpackage;

import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bamk implements bamw, bams {
    private final String a;

    public bamk(String str) {
        this.a = str;
    }

    @Override // defpackage.bams
    public final int a() {
        return this.a.length();
    }

    @Override // defpackage.bamw
    public final int b() {
        return this.a.length();
    }

    @Override // defpackage.bams
    public final int c(bamv bamvVar, String str, int i) {
        String str2 = this.a;
        return str.regionMatches(true, i, str2, 0, str2.length()) ? i + this.a.length() : i ^ (-1);
    }

    @Override // defpackage.bamw
    public final void d(StringBuffer stringBuffer, long j, bajf bajfVar, int i, bajn bajnVar, Locale locale) {
        stringBuffer.append(this.a);
    }
}
