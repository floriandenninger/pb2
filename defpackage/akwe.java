package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akwe extends Exception {
    public final avtq a;
    public final boolean b;
    public final List c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private akwe(defpackage.avtq r4, boolean r5, java.util.List r6) {
        /*
            r3 = this;
            int r0 = r4.aB
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 37
            r1.<init>(r2)
            java.lang.String r2 = "UploadProcessorException: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r3.<init>(r0)
            r3.a = r4
            r3.b = r5
            r3.c = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akwe.<init>(avtq, boolean, java.util.List):void");
    }

    public static akwe a(avtq avtqVar) {
        return new akwe(avtqVar, false, (List) amru.q());
    }

    public static akwe b(avtq avtqVar, Throwable th) {
        return new akwe(avtqVar, amru.q(), th);
    }

    public static akwe c(avtq avtqVar, List list) {
        return new akwe(avtqVar, true, list);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof akwe) {
            akwe akweVar = (akwe) obj;
            if (this.a == akweVar.a && this.b == akweVar.b && this.c.equals(akweVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() ^ this.c.hashCode()) + (this.b ? 1 : 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private akwe(defpackage.avtq r5, java.util.List r6, java.lang.Throwable r7) {
        /*
            r4 = this;
            int r0 = r5.aB
            java.lang.String r1 = r7.getMessage()
            java.lang.String r2 = java.lang.String.valueOf(r1)
            int r2 = r2.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + 38
            r3.<init>(r2)
            java.lang.String r2 = "UploadProcessorException: "
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = "\n"
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            r4.<init>(r0, r7)
            r4.a = r5
            r5 = 0
            r4.b = r5
            r4.c = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akwe.<init>(avtq, java.util.List, java.lang.Throwable):void");
    }
}
