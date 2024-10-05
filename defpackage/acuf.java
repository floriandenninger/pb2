package defpackage;

import com.google.android.libraries.youtube.mdx.FeatureFlagsImpl;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class acuf implements Callable {
    public final /* synthetic */ FeatureFlagsImpl a;
    private final /* synthetic */ int b;

    public /* synthetic */ acuf(FeatureFlagsImpl featureFlagsImpl, int i) {
        this.b = i;
        this.a = featureFlagsImpl;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005c, code lost:
    
        if (r0.g.a(r2, new java.lang.String[]{defpackage.aobj.a.a}).intValue() == 1) goto L12;
     */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object call() {
        /*
            r6 = this;
            int r0 = r6.b
            r1 = 1
            if (r0 == 0) goto L19
            com.google.android.libraries.youtube.mdx.FeatureFlagsImpl r0 = r6.a
            afsy r0 = r0.a
            if (r0 != 0) goto Lc
            goto L14
        Lc:
            afsx r0 = r0.c()
            boolean r1 = defpackage.wbs.d(r0)
        L14:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
        L19:
            com.google.android.libraries.youtube.mdx.FeatureFlagsImpl r0 = r6.a
            afsy r2 = r0.a
            r3 = 0
            if (r2 != 0) goto L22
        L20:
            r1 = 0
            goto L5f
        L22:
            afsx r2 = r2.c()
            boolean r4 = r2 instanceof com.google.android.libraries.youtube.account.identity.AccountIdentity
            if (r4 == 0) goto L20
            boolean r4 = r2.z()
            if (r4 == 0) goto L31
            goto L20
        L31:
            wkk r4 = r0.c     // Catch: java.lang.Exception -> L20
            com.google.android.libraries.youtube.account.identity.AccountIdentity r2 = (com.google.android.libraries.youtube.account.identity.AccountIdentity) r2     // Catch: java.lang.Exception -> L20
            java.lang.String r2 = r2.a()     // Catch: java.lang.Exception -> L20
            android.accounts.Account r2 = r4.b(r2)     // Catch: java.lang.Exception -> L20
            wkk r4 = r0.c     // Catch: java.lang.Exception -> L20
            boolean r4 = r4.e(r2)     // Catch: java.lang.Exception -> L20
            if (r4 == 0) goto L20
            wkk r0 = r0.c     // Catch: java.lang.Exception -> L20
            defpackage.yjk.e()     // Catch: java.lang.Exception -> L20
            wki r0 = r0.g     // Catch: java.lang.Exception -> L20
            java.lang.String[] r4 = new java.lang.String[r1]     // Catch: java.lang.Exception -> L20
            aobh r5 = defpackage.aobj.a     // Catch: java.lang.Exception -> L20
            java.lang.String r5 = r5.a     // Catch: java.lang.Exception -> L20
            r4[r3] = r5     // Catch: java.lang.Exception -> L20
            java.lang.Integer r0 = r0.a(r2, r4)     // Catch: java.lang.Exception -> L20
            int r0 = r0.intValue()     // Catch: java.lang.Exception -> L20
            if (r0 != r1) goto L5f
            goto L20
        L5f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acuf.call():java.lang.Object");
    }
}
