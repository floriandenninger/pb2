package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azwh {
    public static final boolean a;

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0028, code lost:
    
        if (r0.equals("on") != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:
    
        if (r0.equals("") != false) goto L21;
     */
    static {
        /*
            java.lang.String r0 = "kotlinx.coroutines.scheduler"
            java.lang.String r0 = defpackage.baad.a(r0)
            r1 = 1
            if (r0 == 0) goto L54
            int r2 = r0.hashCode()
            if (r2 == 0) goto L2b
            r3 = 3551(0xddf, float:4.976E-42)
            if (r2 == r3) goto L22
            r1 = 109935(0x1ad6f, float:1.54052E-40)
            if (r2 != r1) goto L34
            java.lang.String r1 = "off"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L34
            r1 = 0
            goto L54
        L22:
            java.lang.String r2 = "on"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L34
            goto L54
        L2b:
            java.lang.String r2 = ""
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L34
            goto L54
        L34:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "System property 'kotlinx.coroutines.scheduler' has unrecognized value '"
            r1.append(r2)
            r1.append(r0)
            r0 = 39
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L54:
            defpackage.azwh.a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azwh.<clinit>():void");
    }

    public static final String a(azsv azsvVar) {
        azwm azwmVar;
        azsvVar.getClass();
        if (!azwq.a || (azwmVar = (azwm) azsvVar.get(azwm.b)) == null) {
            return null;
        }
        if (((azwn) azsvVar.get(azwn.a)) != null) {
            throw null;
        }
        return "coroutine#" + azwmVar.a;
    }

    public static final azsv b(azwo azwoVar, azsv azsvVar) {
        azsv plus = ((azzl) azwoVar).a.plus(azsvVar);
        azsv plus2 = azwq.a ? plus.plus(new azwm(azwq.c.incrementAndGet())) : plus;
        return (plus == azwv.a || plus.get(azsr.a) != null) ? plus2 : plus2.plus(azwv.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [azsq] */
    /* JADX WARN: Type inference failed for: r1v1, types: [aztb] */
    /* JADX WARN: Type inference failed for: r1v4, types: [aztb] */
    public static final void c(azsq azsqVar, azsv azsvVar) {
        azxz azxzVar;
        azsvVar.getClass();
        if (azsvVar.get(azya.a) == null) {
            return;
        }
        while (!(azsqVar instanceof azws) && (azsqVar = azsqVar.getCallerFrame()) != 0) {
            if (azsqVar instanceof azxz) {
                azxzVar = (azxz) azsqVar;
                break;
            }
        }
        azxzVar = null;
        if (azxzVar != null) {
            throw null;
        }
    }
}
