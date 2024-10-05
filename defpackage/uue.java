package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uue {
    public static final amxj a = amxj.l("com/google/android/libraries/performance/primes/sampling/Sampler");
    private static final uua e = uua.a(Integer.MAX_VALUE);
    public volatile uuj b = uui.a;
    public volatile boolean c = true;
    public volatile uua d = e;

    public uue(final Context context, final Executor executor, final uui uuiVar, final axpg axpgVar, boolean z, azrw azrwVar) {
        final azrw azrwVar2 = true != z ? null : azrwVar;
        anaf.R(new Runnable() { // from class: uub
            @Override // java.lang.Runnable
            public final void run() {
                final uue uueVar = uue.this;
                Context context2 = context;
                final uui uuiVar2 = uuiVar;
                final axpg axpgVar2 = axpgVar;
                final azrw azrwVar3 = azrwVar2;
                final Executor executor2 = executor;
                slf.b(context2, new Runnable() { // from class: uud
                    @Override // java.lang.Runnable
                    public final void run() {
                        final uue uueVar2 = uue.this;
                        final uui uuiVar3 = uuiVar2;
                        final axpg axpgVar3 = axpgVar2;
                        final azrw azrwVar4 = azrwVar3;
                        anaf.R(new Runnable() { // from class: uuc
                            @Override // java.lang.Runnable
                            public final void run() {
                                uue uueVar3 = uue.this;
                                uui uuiVar4 = uuiVar3;
                                axpg axpgVar4 = axpgVar3;
                                azrw azrwVar5 = azrwVar4;
                                try {
                                    uoo uooVar = (uoo) axpgVar4.get();
                                    uueVar3.c = uooVar.b();
                                    uueVar3.d = uua.a(uooVar.a());
                                } catch (Throwable th) {
                                    ((amxh) ((amxh) ((amxh) uue.a.g()).h(th)).i("com/google/android/libraries/performance/primes/sampling/Sampler", "fetchSamplingConfig", 'N', "Sampler.java")).q("Couldn't get config");
                                    uueVar3.c = false;
                                }
                                if (!uueVar3.c || azrwVar5 == null) {
                                    if (azrwVar5 == null) {
                                        aone createBuilder = bacs.a.createBuilder();
                                        createBuilder.copyOnWrite();
                                        bacs bacsVar = (bacs) createBuilder.instance;
                                        bacsVar.d = 2;
                                        bacsVar.b |= 4;
                                        uueVar3.b = uuiVar4.a((bacs) createBuilder.build());
                                        return;
                                    }
                                    return;
                                }
                                try {
                                    uueVar3.b = uuiVar4.a((bacs) azrwVar5.get());
                                } catch (Throwable th2) {
                                    ((amxh) ((amxh) ((amxh) uue.a.g()).h(th2)).i("com/google/android/libraries/performance/primes/sampling/Sampler", "fetchSamplingConfig", 'V', "Sampler.java")).q("Couldn't get sampling strategy");
                                    aone createBuilder2 = bacs.a.createBuilder();
                                    createBuilder2.copyOnWrite();
                                    bacs bacsVar2 = (bacs) createBuilder2.instance;
                                    bacsVar2.b = 2 | bacsVar2.b;
                                    bacsVar2.c = 0L;
                                    createBuilder2.copyOnWrite();
                                    bacs bacsVar3 = (bacs) createBuilder2.instance;
                                    bacsVar3.d = 1;
                                    bacsVar3.b |= 4;
                                    uueVar3.b = uuiVar4.a((bacs) createBuilder2.build());
                                }
                            }
                        }, executor2);
                    }
                });
            }
        }, executor);
    }
}
