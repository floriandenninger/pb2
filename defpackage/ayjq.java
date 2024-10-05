package defpackage;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayjq {
    private static final Logger a = Logger.getLogger(ayjq.class.getName());

    private ayjq() {
    }

    public static Object a(String str) {
        aobf aobfVar = new aobf(new StringReader(str));
        try {
            return b(aobfVar);
        } finally {
            try {
                aobfVar.close();
            } catch (IOException e) {
                a.logp(Level.WARNING, "io.grpc.internal.JsonParser", "parse", "Failed to close", (Throwable) e);
            }
        }
    }

    private static Object b(aobf aobfVar) {
        String d;
        String str;
        double parseDouble;
        amkq.O(aobfVar.g(), "unexpected end of JSON");
        int h = aobfVar.h() - 1;
        boolean z = true;
        if (h == 0) {
            int i = aobfVar.c;
            if (i == 0) {
                i = aobfVar.a();
            }
            if (i == 3) {
                aobfVar.f(1);
                aobfVar.i[aobfVar.g - 1] = 0;
                aobfVar.c = 0;
                ArrayList arrayList = new ArrayList();
                while (aobfVar.g()) {
                    arrayList.add(b(aobfVar));
                }
                boolean z2 = aobfVar.h() == 2;
                String valueOf = String.valueOf(aobfVar.b());
                amkq.O(z2, valueOf.length() != 0 ? "Bad token: ".concat(valueOf) : new String("Bad token: "));
                int i2 = aobfVar.c;
                if (i2 == 0) {
                    i2 = aobfVar.a();
                }
                if (i2 == 4) {
                    int i3 = aobfVar.g - 1;
                    aobfVar.g = i3;
                    int[] iArr = aobfVar.i;
                    int i4 = i3 - 1;
                    iArr[i4] = iArr[i4] + 1;
                    aobfVar.c = 0;
                    return Collections.unmodifiableList(arrayList);
                }
                String b = aobq.b(aobfVar.h());
                String c = aobfVar.c();
                StringBuilder sb = new StringBuilder(b.length() + 27 + String.valueOf(c).length());
                sb.append("Expected END_ARRAY but was ");
                sb.append(b);
                sb.append(c);
                throw new IllegalStateException(sb.toString());
            }
            String b2 = aobq.b(aobfVar.h());
            String c2 = aobfVar.c();
            StringBuilder sb2 = new StringBuilder(b2.length() + 29 + String.valueOf(c2).length());
            sb2.append("Expected BEGIN_ARRAY but was ");
            sb2.append(b2);
            sb2.append(c2);
            throw new IllegalStateException(sb2.toString());
        }
        if (h == 2) {
            int i5 = aobfVar.c;
            if (i5 == 0) {
                i5 = aobfVar.a();
            }
            if (i5 == 1) {
                aobfVar.f(3);
                aobfVar.c = 0;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                while (aobfVar.g()) {
                    int i6 = aobfVar.c;
                    if (i6 == 0) {
                        i6 = aobfVar.a();
                    }
                    if (i6 == 14) {
                        d = aobfVar.e();
                    } else if (i6 == 12) {
                        d = aobfVar.d('\'');
                    } else if (i6 == 13) {
                        d = aobfVar.d('\"');
                    } else {
                        String b3 = aobq.b(aobfVar.h());
                        String c3 = aobfVar.c();
                        StringBuilder sb3 = new StringBuilder(b3.length() + 24 + String.valueOf(c3).length());
                        sb3.append("Expected a name but was ");
                        sb3.append(b3);
                        sb3.append(c3);
                        throw new IllegalStateException(sb3.toString());
                    }
                    aobfVar.c = 0;
                    aobfVar.h[aobfVar.g - 1] = d;
                    linkedHashMap.put(d, b(aobfVar));
                }
                boolean z3 = aobfVar.h() == 4;
                String valueOf2 = String.valueOf(aobfVar.b());
                amkq.O(z3, valueOf2.length() != 0 ? "Bad token: ".concat(valueOf2) : new String("Bad token: "));
                int i7 = aobfVar.c;
                if (i7 == 0) {
                    i7 = aobfVar.a();
                }
                if (i7 == 2) {
                    int i8 = aobfVar.g - 1;
                    aobfVar.g = i8;
                    aobfVar.h[i8] = null;
                    int[] iArr2 = aobfVar.i;
                    int i9 = i8 - 1;
                    iArr2[i9] = iArr2[i9] + 1;
                    aobfVar.c = 0;
                    return Collections.unmodifiableMap(linkedHashMap);
                }
                String b4 = aobq.b(aobfVar.h());
                String c4 = aobfVar.c();
                StringBuilder sb4 = new StringBuilder(b4.length() + 28 + String.valueOf(c4).length());
                sb4.append("Expected END_OBJECT but was ");
                sb4.append(b4);
                sb4.append(c4);
                throw new IllegalStateException(sb4.toString());
            }
            String b5 = aobq.b(aobfVar.h());
            String c5 = aobfVar.c();
            StringBuilder sb5 = new StringBuilder(b5.length() + 30 + String.valueOf(c5).length());
            sb5.append("Expected BEGIN_OBJECT but was ");
            sb5.append(b5);
            sb5.append(c5);
            throw new IllegalStateException(sb5.toString());
        }
        if (h == 5) {
            int i10 = aobfVar.c;
            if (i10 == 0) {
                i10 = aobfVar.a();
            }
            if (i10 == 10) {
                str = aobfVar.e();
            } else if (i10 == 8) {
                str = aobfVar.d('\'');
            } else if (i10 == 9) {
                str = aobfVar.d('\"');
            } else if (i10 == 11) {
                str = aobfVar.f;
                aobfVar.f = null;
            } else if (i10 == 15) {
                str = Long.toString(aobfVar.d);
            } else if (i10 == 16) {
                str = new String(aobfVar.a, aobfVar.b, aobfVar.e);
                aobfVar.b += aobfVar.e;
            } else {
                String b6 = aobq.b(aobfVar.h());
                String c6 = aobfVar.c();
                StringBuilder sb6 = new StringBuilder(b6.length() + 26 + String.valueOf(c6).length());
                sb6.append("Expected a string but was ");
                sb6.append(b6);
                sb6.append(c6);
                throw new IllegalStateException(sb6.toString());
            }
            aobfVar.c = 0;
            int[] iArr3 = aobfVar.i;
            int i11 = aobfVar.g - 1;
            iArr3[i11] = iArr3[i11] + 1;
            return str;
        }
        if (h == 6) {
            int i12 = aobfVar.c;
            if (i12 == 0) {
                i12 = aobfVar.a();
            }
            if (i12 == 15) {
                aobfVar.c = 0;
                int[] iArr4 = aobfVar.i;
                int i13 = aobfVar.g - 1;
                iArr4[i13] = iArr4[i13] + 1;
                parseDouble = aobfVar.d;
            } else {
                if (i12 == 16) {
                    aobfVar.f = new String(aobfVar.a, aobfVar.b, aobfVar.e);
                    aobfVar.b += aobfVar.e;
                } else if (i12 == 8 || i12 == 9) {
                    aobfVar.f = aobfVar.d(i12 == 8 ? '\'' : '\"');
                } else if (i12 == 10) {
                    aobfVar.f = aobfVar.e();
                } else if (i12 != 11) {
                    String b7 = aobq.b(aobfVar.h());
                    String c7 = aobfVar.c();
                    StringBuilder sb7 = new StringBuilder(b7.length() + 26 + String.valueOf(c7).length());
                    sb7.append("Expected a double but was ");
                    sb7.append(b7);
                    sb7.append(c7);
                    throw new IllegalStateException(sb7.toString());
                }
                aobfVar.c = 11;
                parseDouble = Double.parseDouble(aobfVar.f);
                if (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble)) {
                    String c8 = aobfVar.c();
                    StringBuilder sb8 = new StringBuilder(String.valueOf(c8).length() + 57);
                    sb8.append("JSON forbids NaN and infinities: ");
                    sb8.append(parseDouble);
                    sb8.append(c8);
                    throw new aobg(sb8.toString());
                }
                aobfVar.f = null;
                aobfVar.c = 0;
                int[] iArr5 = aobfVar.i;
                int i14 = aobfVar.g - 1;
                iArr5[i14] = iArr5[i14] + 1;
            }
            return Double.valueOf(parseDouble);
        }
        if (h != 7) {
            if (h != 8) {
                String valueOf3 = String.valueOf(aobfVar.b());
                throw new IllegalStateException(valueOf3.length() != 0 ? "Bad token: ".concat(valueOf3) : new String("Bad token: "));
            }
            int i15 = aobfVar.c;
            if (i15 == 0) {
                i15 = aobfVar.a();
            }
            if (i15 == 7) {
                aobfVar.c = 0;
                int[] iArr6 = aobfVar.i;
                int i16 = aobfVar.g - 1;
                iArr6[i16] = iArr6[i16] + 1;
                return null;
            }
            String b8 = aobq.b(aobfVar.h());
            String c9 = aobfVar.c();
            StringBuilder sb9 = new StringBuilder(b8.length() + 22 + String.valueOf(c9).length());
            sb9.append("Expected null but was ");
            sb9.append(b8);
            sb9.append(c9);
            throw new IllegalStateException(sb9.toString());
        }
        int i17 = aobfVar.c;
        if (i17 == 0) {
            i17 = aobfVar.a();
        }
        if (i17 == 5) {
            aobfVar.c = 0;
            int[] iArr7 = aobfVar.i;
            int i18 = aobfVar.g - 1;
            iArr7[i18] = iArr7[i18] + 1;
        } else if (i17 == 6) {
            aobfVar.c = 0;
            int[] iArr8 = aobfVar.i;
            int i19 = aobfVar.g - 1;
            iArr8[i19] = iArr8[i19] + 1;
            z = false;
        } else {
            String b9 = aobq.b(aobfVar.h());
            String c10 = aobfVar.c();
            StringBuilder sb10 = new StringBuilder(b9.length() + 27 + String.valueOf(c10).length());
            sb10.append("Expected a boolean but was ");
            sb10.append(b9);
            sb10.append(c10);
            throw new IllegalStateException(sb10.toString());
        }
        return Boolean.valueOf(z);
    }
}
