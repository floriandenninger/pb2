package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ttt implements vea {
    public final AtomicLong a = new AtomicLong();
    final /* synthetic */ ttu b;
    public final aafk c;
    private final String d;

    public ttt(ttu ttuVar, String str, aafk aafkVar) {
        this.b = ttuVar;
        this.d = str;
        this.c = aafkVar;
    }

    @Override // defpackage.vea
    public final void a(int i) {
        this.a.getAndAdd(i);
        this.a.get();
        int i2 = tsx.a;
    }

    @Override // defpackage.vea
    public final void b() {
        synchronized (ttu.class) {
            if (this.b.d.containsKey(this.d)) {
                this.b.b.execute(new Runnable() { // from class: tts
                    @Override // java.lang.Runnable
                    public final void run() {
                        ttt.this.a.get();
                    }
                });
            }
        }
    }
}
