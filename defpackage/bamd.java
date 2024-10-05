package defpackage;

import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bamd implements bamw, bams {
    private final char a;

    public bamd(char c) {
        this.a = c;
    }

    @Override // defpackage.bams
    public final int a() {
        return 1;
    }

    @Override // defpackage.bamw
    public final int b() {
        return 1;
    }

    @Override // defpackage.bams
    public final int c(bamv bamvVar, String str, int i) {
        char upperCase;
        char upperCase2;
        if (i >= str.length()) {
            return i ^ (-1);
        }
        char charAt = str.charAt(i);
        char c = this.a;
        return (charAt == c || (upperCase = Character.toUpperCase(charAt)) == (upperCase2 = Character.toUpperCase(c)) || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)) ? i + 1 : i ^ (-1);
    }

    @Override // defpackage.bamw
    public final void d(StringBuffer stringBuffer, long j, bajf bajfVar, int i, bajn bajnVar, Locale locale) {
        stringBuffer.append(this.a);
    }
}
