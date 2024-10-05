package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class svn {
    public final AtomicBoolean a = new AtomicBoolean();
    public byte[] b;
    final /* synthetic */ svo c;

    public svn(svo svoVar) {
        this.c = svoVar;
    }

    public final void a() {
        this.a.set(false);
        this.c.a.removeCallbacks(new svm(this));
    }
}
