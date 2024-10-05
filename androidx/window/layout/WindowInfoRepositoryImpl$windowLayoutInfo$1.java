package androidx.window.layout;

import defpackage.azsf;
import defpackage.azsq;
import defpackage.aztc;
import defpackage.aztf;
import defpackage.azty;
import defpackage.azyz;

/* compiled from: PG */
@aztc(b = "androidx.window.layout.WindowInfoRepositoryImpl$windowLayoutInfo$1", c = "WindowInfoRepositoryImpl.kt", d = "invokeSuspend", e = {106, 107})
/* loaded from: classes.dex */
final class WindowInfoRepositoryImpl$windowLayoutInfo$1 extends aztf implements azty {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ WindowInfoRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowInfoRepositoryImpl$windowLayoutInfo$1(WindowInfoRepositoryImpl windowInfoRepositoryImpl, azsq azsqVar) {
        super(2, azsqVar);
        this.this$0 = windowInfoRepositoryImpl;
    }

    @Override // defpackage.azsy
    public final azsq create(Object obj, azsq azsqVar) {
        WindowInfoRepositoryImpl$windowLayoutInfo$1 windowInfoRepositoryImpl$windowLayoutInfo$1 = new WindowInfoRepositoryImpl$windowLayoutInfo$1(this.this$0, azsqVar);
        windowInfoRepositoryImpl$windowLayoutInfo$1.L$0 = obj;
        return windowInfoRepositoryImpl$windowLayoutInfo$1;
    }

    @Override // defpackage.azty
    public final Object invoke(azyz azyzVar, azsq azsqVar) {
        return ((WindowInfoRepositoryImpl$windowLayoutInfo$1) create(azyzVar, azsqVar)).invokeSuspend(azsf.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0076 A[Catch: all -> 0x0099, TRY_LEAVE, TryCatch #0 {all -> 0x0099, blocks: (B:11:0x005d, B:14:0x006e, B:16:0x0076), top: B:10:0x005d }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009b A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x008a -> B:10:0x005d). Please report as a decompilation issue!!! */
    @Override // defpackage.azsy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            azsx r0 = defpackage.azsx.COROUTINE_SUSPENDED
            int r1 = r9.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L37
            if (r1 == r3) goto L25
            if (r1 != r2) goto L1d
            java.lang.Object r1 = r9.L$2
            azyn r1 = (defpackage.azyn) r1
            java.lang.Object r4 = r9.L$1
            hw r4 = (defpackage.hw) r4
            java.lang.Object r5 = r9.L$0
            azyz r5 = (defpackage.azyz) r5
            defpackage.aype.m(r10)     // Catch: java.lang.Throwable -> L9c
            r10 = r5
            goto L5c
        L1d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L25:
            java.lang.Object r1 = r9.L$2
            azyn r1 = (defpackage.azyn) r1
            java.lang.Object r4 = r9.L$1
            hw r4 = (defpackage.hw) r4
            java.lang.Object r5 = r9.L$0
            azyz r5 = (defpackage.azyz) r5
            defpackage.aype.m(r10)     // Catch: java.lang.Throwable -> L9c
            r6 = r5
            r5 = r9
            goto L6e
        L37:
            defpackage.aype.m(r10)
            java.lang.Object r10 = r9.L$0
            azyz r10 = (defpackage.azyz) r10
            azym r1 = defpackage.ayep.B()
            androidx.window.layout.WindowInfoRepositoryImpl$windowLayoutInfo$1$listener$1 r4 = new androidx.window.layout.WindowInfoRepositoryImpl$windowLayoutInfo$1$listener$1
            r4.<init>()
            androidx.window.layout.WindowInfoRepositoryImpl r5 = r9.this$0
            androidx.window.layout.WindowBackend r5 = androidx.window.layout.WindowInfoRepositoryImpl.access$getWindowBackend$p(r5)
            androidx.window.layout.WindowInfoRepositoryImpl r6 = r9.this$0
            android.app.Activity r6 = androidx.window.layout.WindowInfoRepositoryImpl.access$getActivity$p(r6)
            androidx.window.layout.WindowInfoRepositoryImpl$windowLayoutInfo$1$1 r7 = new java.util.concurrent.Executor() { // from class: androidx.window.layout.WindowInfoRepositoryImpl$windowLayoutInfo$1.1
                static {
                    /*
                        androidx.window.layout.WindowInfoRepositoryImpl$windowLayoutInfo$1$1 r0 = new androidx.window.layout.WindowInfoRepositoryImpl$windowLayoutInfo$1$1
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:androidx.window.layout.WindowInfoRepositoryImpl$windowLayoutInfo$1$1) androidx.window.layout.WindowInfoRepositoryImpl$windowLayoutInfo$1.1.INSTANCE androidx.window.layout.WindowInfoRepositoryImpl$windowLayoutInfo$1$1
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.WindowInfoRepositoryImpl$windowLayoutInfo$1.AnonymousClass1.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.WindowInfoRepositoryImpl$windowLayoutInfo$1.AnonymousClass1.<init>():void");
                }

                @Override // java.util.concurrent.Executor
                public final void execute(java.lang.Runnable r1) {
                    /*
                        r0 = this;
                        r1.getClass()
                        r1.run()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.WindowInfoRepositoryImpl$windowLayoutInfo$1.AnonymousClass1.execute(java.lang.Runnable):void");
                }
            }
            r5.registerLayoutChangeCallback(r6, r7, r4)
            azyn r1 = r1.b()     // Catch: java.lang.Throwable -> L9c
        L5c:
            r5 = r9
        L5d:
            r5.L$0 = r10     // Catch: java.lang.Throwable -> L99
            r5.L$1 = r4     // Catch: java.lang.Throwable -> L99
            r5.L$2 = r1     // Catch: java.lang.Throwable -> L99
            r5.label = r3     // Catch: java.lang.Throwable -> L99
            java.lang.Object r6 = r1.a(r5)     // Catch: java.lang.Throwable -> L99
            if (r6 == r0) goto L9b
            r8 = r6
            r6 = r10
            r10 = r8
        L6e:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L99
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L99
            if (r10 == 0) goto L8d
            java.lang.Object r10 = r1.b()     // Catch: java.lang.Throwable -> L99
            androidx.window.layout.WindowLayoutInfo r10 = (androidx.window.layout.WindowLayoutInfo) r10     // Catch: java.lang.Throwable -> L99
            r5.L$0 = r6     // Catch: java.lang.Throwable -> L99
            r5.L$1 = r4     // Catch: java.lang.Throwable -> L99
            r5.L$2 = r1     // Catch: java.lang.Throwable -> L99
            r5.label = r2     // Catch: java.lang.Throwable -> L99
            java.lang.Object r10 = r6.emit(r10, r5)     // Catch: java.lang.Throwable -> L99
            if (r10 == r0) goto L8c
            r10 = r6
            goto L5d
        L8c:
            return r0
        L8d:
            androidx.window.layout.WindowInfoRepositoryImpl r10 = r5.this$0
            androidx.window.layout.WindowBackend r10 = androidx.window.layout.WindowInfoRepositoryImpl.access$getWindowBackend$p(r10)
            r10.unregisterLayoutChangeCallback(r4)
            azsf r10 = defpackage.azsf.a
            return r10
        L99:
            r10 = move-exception
            goto L9e
        L9b:
            return r0
        L9c:
            r10 = move-exception
            r5 = r9
        L9e:
            androidx.window.layout.WindowInfoRepositoryImpl r0 = r5.this$0
            androidx.window.layout.WindowBackend r0 = androidx.window.layout.WindowInfoRepositoryImpl.access$getWindowBackend$p(r0)
            r0.unregisterLayoutChangeCallback(r4)
            goto La9
        La8:
            throw r10
        La9:
            goto La8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.WindowInfoRepositoryImpl$windowLayoutInfo$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
