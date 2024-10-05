package defpackage;

import android.os.Build;
import android.os.Debug;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aksz extends Thread {
    public volatile boolean a;
    final /* synthetic */ akta b;
    private final Runnable c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aksz(akta aktaVar) {
        super("ANRGuard-Thread");
        this.b = aktaVar;
        this.c = new Runnable() { // from class: aksy
            @Override // java.lang.Runnable
            public final void run() {
                aksz.this.a = false;
            }
        };
        this.a = true;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        aone builder;
        int i = akso.a;
        Thread thread = this.b.b.getLooper().getThread();
        while (!interrupted()) {
            this.a = true;
            this.b.b.post(this.c);
            aksp akspVar = (aksp) this.b.d.get();
            try {
                Thread.sleep(this.b.a);
                if (akspVar != null) {
                    akspVar.a();
                }
                if (Debug.isDebuggerConnected()) {
                    this.b.c.a();
                } else {
                    boolean z = false;
                    if (!this.a) {
                        akss akssVar = this.b.c;
                        if (akssVar.b != null) {
                            akssVar.a();
                            this.b.e.g.c(yyf.a, 0);
                        }
                    } else {
                        akta aktaVar = this.b;
                        akss akssVar2 = aktaVar.c;
                        long j = aktaVar.a;
                        apfe apfeVar = akssVar2.b;
                        if (apfeVar != null) {
                            builder = apfeVar.toBuilder();
                        } else {
                            builder = apfe.a.createBuilder();
                            long c = akssVar2.a.d.c() - j;
                            builder.copyOnWrite();
                            apfe apfeVar2 = (apfe) builder.instance;
                            apfeVar2.b |= 8;
                            apfeVar2.f = c;
                            z = true;
                        }
                        builder.copyOnWrite();
                        apfe apfeVar3 = (apfe) builder.instance;
                        apfeVar3.b |= 2;
                        apfeVar3.d = (int) (((apfe) builder.instance).d + j);
                        if (akspVar == null || akspVar.c()) {
                            builder.copyOnWrite();
                            apfe apfeVar4 = (apfe) builder.instance;
                            apfeVar4.b |= 16;
                            apfeVar4.g = (int) (((apfe) builder.instance).g + j);
                        }
                        if (akspVar == null || akspVar.b()) {
                            int i2 = (int) (((apfe) builder.instance).h + j);
                            builder.copyOnWrite();
                            apfe apfeVar5 = (apfe) builder.instance;
                            apfeVar5.b |= 32;
                            apfeVar5.h = i2;
                        }
                        String c2 = akst.c(thread);
                        builder.copyOnWrite();
                        apfe apfeVar6 = (apfe) builder.instance;
                        c2.getClass();
                        apfeVar6.b |= 4;
                        apfeVar6.e = c2;
                        int i3 = Build.VERSION.SDK_INT;
                        builder.copyOnWrite();
                        apfe apfeVar7 = (apfe) builder.instance;
                        apfeVar7.b |= 64;
                        apfeVar7.i = i3;
                        int a = zgx.a(akssVar2.a.b);
                        builder.copyOnWrite();
                        apfe apfeVar8 = (apfe) builder.instance;
                        apfeVar8.b |= 128;
                        apfeVar8.j = a;
                        akssVar2.b = (apfe) builder.build();
                        String.valueOf(String.valueOf(akssVar2.b)).length();
                        akbc.u(akssVar2.a, akssVar2.b);
                        if (z) {
                            this.b.e.g.c(yyf.a, 1);
                        }
                    }
                }
            } catch (InterruptedException unused) {
            }
        }
    }
}
