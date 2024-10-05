package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wzp {
    public volatile String a;
    public final aloh b;
    private final Executor c;

    public wzp(aloh alohVar, Executor executor, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.b = alohVar;
        this.c = executor;
    }

    public final void a() {
        this.c.execute(new Runnable() { // from class: wzo
            @Override // java.lang.Runnable
            public final void run() {
                wzp wzpVar = wzp.this;
                try {
                    wzpVar.a = wzpVar.b.e().a;
                } catch (Exception e) {
                    zga.d("Failed to get advertising id", e);
                }
            }
        });
    }
}
