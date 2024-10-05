package defpackage;

import java.util.concurrent.ThreadFactory;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class pkr implements ThreadFactory {
    private final /* synthetic */ int f;
    public static final /* synthetic */ pkr e = new pkr(5);
    public static final /* synthetic */ pkr d = new pkr(4);
    public static final /* synthetic */ pkr c = new pkr(3);
    public static final /* synthetic */ pkr b = new pkr(2);
    public static final /* synthetic */ pkr a = new pkr(0);

    public /* synthetic */ pkr(int i) {
        this.f = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i = this.f;
        if (i == 0) {
            return new Thread(runnable, "codec");
        }
        if (i == 1) {
            return new aji(runnable);
        }
        if (i == 2) {
            return new Thread(runnable);
        }
        if (i == 3) {
            return new Thread(runnable, "LensSvConn");
        }
        if (i != 4) {
            return i != 5 ? new Thread(runnable, "SplitCompatBackgroundThread") : new Thread(runnable, "ProcessStablePhenotypeFlag");
        }
        return new Thread(runnable);
    }
}
