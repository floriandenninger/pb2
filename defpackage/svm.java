package defpackage;

import com.google.android.libraries.elements.interfaces.DebuggerClient;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class svm implements Runnable {
    public final /* synthetic */ svn a;

    public /* synthetic */ svm(svn svnVar) {
        this.a = svnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        svn svnVar = this.a;
        awry e = svnVar.c.e();
        byte[] byteArray = e == null ? null : e.toByteArray();
        if (byteArray != null && !Arrays.equals(byteArray, svnVar.b)) {
            ((DebuggerClient) svnVar.c.c.get()).traverseViewHierarchyResponse(byteArray);
            svnVar.b = byteArray;
        }
        if (svnVar.a.get()) {
            svnVar.c.a.postDelayed(new svm(svnVar), 1000L);
        }
    }
}
