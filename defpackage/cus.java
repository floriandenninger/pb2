package defpackage;

import java.util.concurrent.ThreadFactory;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cus implements ThreadFactory {
    private final /* synthetic */ int a;

    public cus(int i) {
        this.a = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return this.a != 0 ? new Thread(new iiz(runnable, 1, null), "glide-active-resources") : new cur(runnable);
    }
}
