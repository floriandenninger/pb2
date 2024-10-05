package defpackage;

import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bamp implements bamw, bams {
    private final bajj a;
    private final int b;
    private final boolean c;

    public bamp(bajj bajjVar, int i, boolean z) {
        this.a = bajjVar;
        this.b = i;
        this.c = z;
    }

    @Override // defpackage.bams
    public final int a() {
        return this.c ? 4 : 2;
    }

    @Override // defpackage.bamw
    public final int b() {
        return 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x003b  */
    @Override // defpackage.bams
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int c(defpackage.bamv r12, java.lang.String r13, int r14) {
        /*
            Method dump skipped, instructions count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bamp.c(bamv, java.lang.String, int):int");
    }

    @Override // defpackage.bamw
    public final void d(StringBuffer stringBuffer, long j, bajf bajfVar, int i, bajn bajnVar, Locale locale) {
        int i2;
        try {
            int a = this.a.a(bajfVar).a(j);
            if (a < 0) {
                a = -a;
            }
            i2 = a % 100;
        } catch (RuntimeException unused) {
            i2 = -1;
        }
        if (i2 < 0) {
            stringBuffer.append((char) 65533);
            stringBuffer.append((char) 65533);
        } else {
            bamx.d(stringBuffer, i2, 2);
        }
    }
}
