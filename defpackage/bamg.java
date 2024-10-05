package defpackage;

import java.io.IOException;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bamg implements bamw, bams {
    protected final int a;
    protected final int b;
    private final bajj c;

    /* JADX INFO: Access modifiers changed from: protected */
    public bamg(bajj bajjVar, int i, int i2) {
        this.c = bajjVar;
        i2 = i2 > 18 ? 18 : i2;
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.bams
    public final int a() {
        return this.b;
    }

    @Override // defpackage.bamw
    public final int b() {
        return this.b;
    }

    @Override // defpackage.bams
    public final int c(bamv bamvVar, String str, int i) {
        bajh a = this.c.a(bamvVar.a);
        int min = Math.min(this.b, str.length() - i);
        long e = a.p().e() * 10;
        long j = 0;
        int i2 = 0;
        while (i2 < min) {
            char charAt = str.charAt(i + i2);
            if (charAt < '0' || charAt > '9') {
                break;
            }
            i2++;
            e /= 10;
            j += (charAt - '0') * e;
        }
        long j2 = j / 10;
        if (i2 != 0 && j2 <= 2147483647L) {
            bamvVar.c(new bamt(new balt(bajj.y, balr.a, a.p()), (int) j2));
            return i + i2;
        }
        return i ^ (-1);
    }

    @Override // defpackage.bamw
    public final void d(StringBuffer stringBuffer, long j, bajf bajfVar, int i, bajn bajnVar, Locale locale) {
        long j2;
        String l;
        try {
            bajh a = this.c.a(bajfVar);
            int i2 = this.a;
            try {
                long f = a.f(j);
                if (f == 0) {
                    while (true) {
                        i2--;
                        if (i2 < 0) {
                            return;
                        } else {
                            stringBuffer.append('0');
                        }
                    }
                } else {
                    long e = a.p().e();
                    int i3 = this.b;
                    while (true) {
                        switch (i3) {
                            case 1:
                                j2 = 10;
                                break;
                            case 2:
                                j2 = 100;
                                break;
                            case 3:
                                j2 = 1000;
                                break;
                            case 4:
                                j2 = 10000;
                                break;
                            case 5:
                                j2 = 100000;
                                break;
                            case 6:
                                j2 = 1000000;
                                break;
                            case 7:
                                j2 = 10000000;
                                break;
                            case 8:
                                j2 = 100000000;
                                break;
                            case 9:
                                j2 = 1000000000;
                                break;
                            case 10:
                                j2 = 10000000000L;
                                break;
                            case 11:
                                j2 = 100000000000L;
                                break;
                            case 12:
                                j2 = 1000000000000L;
                                break;
                            case 13:
                                j2 = 10000000000000L;
                                break;
                            case 14:
                                j2 = 100000000000000L;
                                break;
                            case 15:
                                j2 = 1000000000000000L;
                                break;
                            case 16:
                                j2 = 10000000000000000L;
                                break;
                            case 17:
                                j2 = 100000000000000000L;
                                break;
                            case 18:
                                j2 = 1000000000000000000L;
                                break;
                            default:
                                j2 = 1;
                                break;
                        }
                        if ((e * j2) / j2 == e) {
                            long j3 = (f * j2) / e;
                            long[] jArr = {j3, i3};
                            long j4 = jArr[0];
                            int i4 = (int) jArr[1];
                            if ((2147483647L & j4) == j4) {
                                l = Integer.toString((int) j4);
                            } else {
                                l = Long.toString(j4);
                            }
                            int length = l.length();
                            while (length < i4) {
                                stringBuffer.append('0');
                                i2--;
                                i4--;
                            }
                            if (i2 < i4) {
                                while (i2 < i4 && length > 1) {
                                    int i5 = length - 1;
                                    if (l.charAt(i5) == '0') {
                                        i4--;
                                        length = i5;
                                    }
                                }
                                if (length < l.length()) {
                                    for (int i6 = 0; i6 < length; i6++) {
                                        stringBuffer.append(l.charAt(i6));
                                    }
                                    return;
                                }
                            }
                            stringBuffer.append(l);
                            return;
                        }
                        i3--;
                    }
                }
            } catch (RuntimeException unused) {
                bamr.c(stringBuffer, i2);
            }
        } catch (IOException unused2) {
        }
    }
}
