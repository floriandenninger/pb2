package defpackage;

import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bamo implements bamw, bams {
    private final String a;
    private final String b;
    private final boolean c;
    private final int d;

    public bamo(String str, String str2, boolean z, int i) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = i;
    }

    private static final int e(String str, int i, int i2) {
        int i3 = 0;
        for (int min = Math.min(str.length() - i, i2); min > 0; min--) {
            char charAt = str.charAt(i + i3);
            if (charAt < '0' || charAt > '9') {
                break;
            }
            i3++;
        }
        return i3;
    }

    @Override // defpackage.bams
    public final int a() {
        return b();
    }

    @Override // defpackage.bamw
    public final int b() {
        int i = true != this.c ? 6 : 7;
        String str = this.a;
        return (str == null || str.length() <= i) ? i : this.a.length();
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ca, code lost:
    
        if (r6 == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00fe, code lost:
    
        if (r6 == false) goto L100;
     */
    @Override // defpackage.bams
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int c(defpackage.bamv r13, java.lang.String r14, int r15) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bamo.c(bamv, java.lang.String, int):int");
    }

    @Override // defpackage.bamw
    public final void d(StringBuffer stringBuffer, long j, bajf bajfVar, int i, bajn bajnVar, Locale locale) {
        int i2;
        int i3;
        if (bajnVar == null) {
            return;
        }
        if (i == 0) {
            String str = this.a;
            if (str != null) {
                stringBuffer.append(str);
                return;
            }
            i = 0;
        }
        if (i >= 0) {
            stringBuffer.append('+');
        } else {
            stringBuffer.append('-');
            i = -i;
        }
        int i4 = i / 3600000;
        bamx.d(stringBuffer, i4, 2);
        int i5 = i - (i4 * 3600000);
        int i6 = i5 != 0 ? i5 : 0;
        int i7 = i6 / 60000;
        if (this.c) {
            stringBuffer.append(':');
        }
        bamx.d(stringBuffer, i7, 2);
        if (this.d == 2 || (i2 = i6 - (i7 * 60000)) == 0) {
            return;
        }
        int i8 = i2 / 1000;
        if (this.c) {
            stringBuffer.append(':');
        }
        bamx.d(stringBuffer, i8, 2);
        if (this.d == 3 || (i3 = i2 - (i8 * 1000)) == 0) {
            return;
        }
        if (this.c) {
            stringBuffer.append('.');
        }
        bamx.d(stringBuffer, i3, 3);
    }
}
