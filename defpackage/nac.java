package defpackage;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nac {
    private static final uxv a = uxv.b();

    /* JADX WARN: Code restructure failed: missing block: B:66:0x007e, code lost:
    
        if (r5.m(r5.e(r8, null)) != false) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.nab a(java.lang.String r8, defpackage.avvd r9) {
        /*
            boolean r0 = r8.isEmpty()
            r1 = 2
            r2 = 0
            if (r0 == 0) goto L3d
            boolean r8 = r9.c
            if (r8 == 0) goto L11
            nab r8 = defpackage.nab.a()
            goto L3c
        L11:
            int r8 = r9.b
            r8 = r8 & r1
            if (r8 == 0) goto L1d
            aqyg r8 = r9.d
            if (r8 != 0) goto L1e
            aqyg r8 = defpackage.aqyg.a
            goto L1e
        L1d:
            r8 = r2
        L1e:
            int r0 = r9.b
            r0 = r0 & 4
            if (r0 == 0) goto L2b
            apxf r0 = r9.e
            if (r0 != 0) goto L2c
            apxf r0 = defpackage.apxf.a
            goto L2c
        L2b:
            r0 = r2
        L2c:
            int r1 = r9.b
            r1 = r1 & 8
            if (r1 == 0) goto L38
            ashb r2 = r9.f
            if (r2 != 0) goto L38
            ashb r2 = defpackage.ashb.a
        L38:
            nab r8 = defpackage.nab.b(r8, r0, r2)
        L3c:
            return r8
        L3d:
            r0 = 0
            r3 = 0
        L3f:
            aony r4 = r9.g
            int r4 = r4.size()
            if (r3 >= r4) goto Lbd
            aony r4 = r9.g
            java.lang.Object r4 = r4.get(r3)
            avvc r4 = (defpackage.avvc) r4
            int r5 = r4.c
            r6 = 1
            if (r5 != r6) goto L5d
            java.lang.Object r5 = r4.d
            avvb r5 = (defpackage.avvb) r5
            boolean r6 = c(r8, r5)
            goto L8b
        L5d:
            if (r5 != r1) goto Lba
            java.lang.Object r5 = r4.d
            avva r5 = (defpackage.avva) r5
            int r5 = r5.b
            int r5 = defpackage.awxr.ac(r5)
            if (r5 != 0) goto L6c
            r5 = 1
        L6c:
            int r5 = r5 + (-1)
            if (r5 == r6) goto L81
            if (r5 == r1) goto L74
        L72:
            r6 = 0
            goto L8b
        L74:
            uxv r5 = defpackage.nac.a     // Catch: defpackage.uxu -> L72
            uya r7 = r5.e(r8, r2)     // Catch: defpackage.uxu -> L72
            boolean r5 = r5.m(r7)     // Catch: defpackage.uxu -> L72
            if (r5 == 0) goto L72
            goto L8b
        L81:
            java.util.regex.Pattern r5 = android.util.Patterns.EMAIL_ADDRESS
            java.util.regex.Matcher r5 = r5.matcher(r8)
            boolean r6 = r5.matches()
        L8b:
            if (r6 != 0) goto Lba
            int r8 = r4.b
            r8 = r8 & 4
            if (r8 == 0) goto L9a
            aqyg r8 = r4.e
            if (r8 != 0) goto L9b
            aqyg r8 = defpackage.aqyg.a
            goto L9b
        L9a:
            r8 = r2
        L9b:
            int r9 = r4.b
            r9 = r9 & 8
            if (r9 == 0) goto La8
            apxf r9 = r4.f
            if (r9 != 0) goto La9
            apxf r9 = defpackage.apxf.a
            goto La9
        La8:
            r9 = r2
        La9:
            int r0 = r4.b
            r0 = r0 & 16
            if (r0 == 0) goto Lb5
            ashb r2 = r4.g
            if (r2 != 0) goto Lb5
            ashb r2 = defpackage.ashb.a
        Lb5:
            nab r8 = defpackage.nab.b(r8, r9, r2)
            return r8
        Lba:
            int r3 = r3 + 1
            goto L3f
        Lbd:
            nab r8 = defpackage.nab.a()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nac.a(java.lang.String, avvd):nab");
    }

    public static void b(acra acraVar, acqx acqxVar, ashb ashbVar) {
        if (ashbVar != null) {
            List asList = Arrays.asList(ashbVar);
            aone createBuilder = asht.a.createBuilder();
            aone createBuilder2 = ashd.a.createBuilder();
            aone createBuilder3 = ashc.a.createBuilder();
            createBuilder3.aq(asList);
            createBuilder2.copyOnWrite();
            ashd ashdVar = (ashd) createBuilder2.instance;
            ashc ashcVar = (ashc) createBuilder3.build();
            ashcVar.getClass();
            ashdVar.d = ashcVar;
            ashdVar.c = 1;
            createBuilder.copyOnWrite();
            asht ashtVar = (asht) createBuilder.instance;
            ashd ashdVar2 = (ashd) createBuilder2.build();
            ashdVar2.getClass();
            ashtVar.t = ashdVar2;
            ashtVar.c |= 1024;
            acraVar.w(acqxVar, (asht) createBuilder.build());
        }
    }

    private static boolean c(String str, avvb avvbVar) {
        int size = avvbVar.b.size();
        int ab = awxr.ab(avvbVar.c);
        if (ab == 0) {
            ab = 1;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            try {
                if (Pattern.compile((String) avvbVar.b.get(i)).matcher(str).find()) {
                    i2++;
                    if (ab == 2) {
                        break;
                    }
                    if (ab == 3) {
                        ab = 3;
                        break;
                    }
                } else {
                    continue;
                }
            } catch (PatternSyntaxException unused) {
            }
            i++;
        }
        if (ab == 2 && i2 > 0) {
            return true;
        }
        if (ab == 3 && i2 == 0) {
            return true;
        }
        return ab == 4 && i2 < size;
    }
}
