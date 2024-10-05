package defpackage;

import java.util.concurrent.ThreadFactory;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class ptr implements ThreadFactory {
    public final /* synthetic */ String a;
    private final /* synthetic */ int b;

    public /* synthetic */ ptr(String str, int i) {
        this.b = i;
        this.a = str;
    }

    public ptr(String str, int i, byte[] bArr) {
        this.b = i;
        this.a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i = this.b;
        if (i == 0) {
            return new Thread(runnable, this.a);
        }
        if (i == 1) {
            return new Thread(runnable, this.a);
        }
        return new Thread(runnable, this.a);
    }
}
