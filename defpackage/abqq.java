package defpackage;

import java.util.concurrent.ThreadFactory;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abqq implements ThreadFactory {
    private final String a;
    private int b;
    private final /* synthetic */ int c;

    public abqq(int i) {
        this.c = i;
        this.a = "Camera thread";
    }

    public abqq(int i, byte[] bArr) {
        this.c = i;
        this.a = "CsiReporter";
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        if (this.c != 0) {
            String str = this.a;
            int i = this.b;
            this.b = i + 1;
            StringBuilder sb = new StringBuilder(str.length() + 12);
            sb.append(str);
            sb.append("-");
            sb.append(i);
            return new Thread(runnable, sb.toString());
        }
        String str2 = this.a;
        int i2 = this.b;
        this.b = i2 + 1;
        StringBuilder sb2 = new StringBuilder(str2.length() + 12);
        sb2.append(str2);
        sb2.append(" ");
        sb2.append(i2);
        return new Thread(runnable, sb2.toString());
    }
}
