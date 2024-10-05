package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aydb implements aycc {
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0057  */
    @Override // defpackage.aycc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ java.lang.Object a(byte[] r7) {
        /*
            r6 = this;
            java.util.List r0 = io.grpc.Status.a
            int r0 = r7.length
            r1 = 48
            r2 = 0
            r3 = 1
            if (r0 != r3) goto L11
            r0 = r7[r2]
            if (r0 != r1) goto L10
            io.grpc.Status r7 = io.grpc.Status.b
            goto L61
        L10:
            r0 = 1
        L11:
            r4 = 57
            if (r0 == r3) goto L26
            r5 = 2
            if (r0 == r5) goto L19
            goto L41
        L19:
            r0 = r7[r2]
            if (r0 < r1) goto L41
            if (r0 > r4) goto L41
            int r0 = r0 + (-48)
            int r2 = r0 * 10
            r0 = r2
            r2 = 1
            goto L27
        L26:
            r0 = 0
        L27:
            r2 = r7[r2]
            if (r2 < r1) goto L41
            if (r2 > r4) goto L41
            int r2 = r2 + (-48)
            int r0 = r0 + r2
            java.util.List r1 = io.grpc.Status.a
            int r1 = r1.size()
            if (r0 >= r1) goto L41
            java.util.List r7 = io.grpc.Status.a
            java.lang.Object r7 = r7.get(r0)
            io.grpc.Status r7 = (io.grpc.Status) r7
            goto L61
        L41:
            io.grpc.Status r0 = io.grpc.Status.d
            java.lang.String r1 = new java.lang.String
            java.nio.charset.Charset r2 = defpackage.amme.a
            r1.<init>(r7, r2)
            java.lang.String r7 = "Unknown code "
            int r2 = r1.length()
            if (r2 == 0) goto L57
            java.lang.String r7 = r7.concat(r1)
            goto L5d
        L57:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r7)
            r7 = r1
        L5d:
            io.grpc.Status r7 = r0.withDescription(r7)
        L61:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aydb.a(byte[]):java.lang.Object");
    }

    @Override // defpackage.aycc
    public final /* bridge */ /* synthetic */ byte[] b(Object obj) {
        return ((Status) obj).getCode().r;
    }
}
