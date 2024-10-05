package androidx.window.layout;

import defpackage.azsf;
import defpackage.azsq;
import defpackage.aztc;
import defpackage.aztf;
import defpackage.aztj;
import defpackage.azty;
import defpackage.azyz;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
@aztc(b = "androidx.window.layout.WindowInfoRepositoryImpl$configurationChanged$1", c = "WindowInfoRepositoryImpl.kt", d = "invokeSuspend", e = {80, 81})
/* loaded from: classes.dex */
public final class WindowInfoRepositoryImpl$configurationChanged$1 extends aztf implements azty {
    final /* synthetic */ aztj $producer;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ WindowInfoRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowInfoRepositoryImpl$configurationChanged$1(WindowInfoRepositoryImpl windowInfoRepositoryImpl, aztj aztjVar, azsq azsqVar) {
        super(2, azsqVar);
        this.this$0 = windowInfoRepositoryImpl;
        this.$producer = aztjVar;
    }

    @Override // defpackage.azsy
    public final azsq create(Object obj, azsq azsqVar) {
        WindowInfoRepositoryImpl$configurationChanged$1 windowInfoRepositoryImpl$configurationChanged$1 = new WindowInfoRepositoryImpl$configurationChanged$1(this.this$0, this.$producer, azsqVar);
        windowInfoRepositoryImpl$configurationChanged$1.L$0 = obj;
        return windowInfoRepositoryImpl$configurationChanged$1;
    }

    @Override // defpackage.azty
    public final Object invoke(azyz azyzVar, azsq azsqVar) {
        return ((WindowInfoRepositoryImpl$configurationChanged$1) create(azyzVar, azsqVar)).invokeSuspend(azsf.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0089 A[Catch: all -> 0x00b7, TRY_LEAVE, TryCatch #0 {all -> 0x00b7, blocks: (B:13:0x0070, B:16:0x0081, B:18:0x0089), top: B:12:0x0070 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c9  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x009b -> B:12:0x0070). Please report as a decompilation issue!!! */
    @Override // defpackage.azsy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.WindowInfoRepositoryImpl$configurationChanged$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
