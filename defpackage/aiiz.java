package defpackage;

import android.os.ConditionVariable;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.util.Pair;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aiiz implements Runnable {
    public final PlaybackStartDescriptor a;
    public final int b;
    public final aiiy c;
    public final zaw d;
    public volatile boolean e;
    private final aihk g;
    private final PlayerResponseModel h;
    private final String i;
    private final boolean j;
    private final Handler k;
    private final long l;
    private final long m;
    private final aigd n;
    private final boolean o;
    private volatile boolean p = true;
    private WatchNextResponseModel q = null;
    private Exception r = null;
    private PlayerResponseModel s = null;
    private Exception t = null;
    final ConditionVariable f = new ConditionVariable();

    public aiiz(PlaybackStartDescriptor playbackStartDescriptor, int i, aihk aihkVar, PlayerResponseModel playerResponseModel, String str, boolean z, Handler handler, long j, long j2, zaw zawVar, aiiy aiiyVar, boolean z2, aigd aigdVar) {
        this.a = playbackStartDescriptor;
        this.b = i;
        this.g = aihkVar;
        this.h = playerResponseModel;
        this.i = str;
        this.j = z;
        this.k = handler;
        this.l = j;
        this.m = j2;
        this.d = zawVar;
        this.c = aiiyVar;
        this.o = z2;
        this.n = aigdVar;
    }

    private final void c(Exception exc) {
        this.k.post(new aiix(this, exc, 1));
    }

    private final void d() {
        Handler handler = this.k;
        final aiiy aiiyVar = this.c;
        handler.post(new Runnable() { // from class: aiit
            @Override // java.lang.Runnable
            public final void run() {
                aiiy.this.c();
            }
        });
    }

    private final void e(final PlayerResponseModel playerResponseModel) {
        Runnable runnable = new Runnable() { // from class: aiiw
            @Override // java.lang.Runnable
            public final void run() {
                aiiz aiizVar = aiiz.this;
                PlayerResponseModel playerResponseModel2 = playerResponseModel;
                if (aiizVar.e) {
                    return;
                }
                aiizVar.c.d(playerResponseModel2);
            }
        };
        if (this.j) {
            this.k.post(runnable);
        } else {
            this.k.postAtFrontOfQueue(runnable);
        }
    }

    private final void f(final WatchNextResponseModel watchNextResponseModel) {
        this.k.post(new Runnable() { // from class: aiiv
            @Override // java.lang.Runnable
            public final void run() {
                aiiz aiizVar = aiiz.this;
                WatchNextResponseModel watchNextResponseModel2 = watchNextResponseModel;
                if (aiizVar.e) {
                    return;
                }
                aiizVar.c.g(watchNextResponseModel2);
            }
        });
    }

    private final void g() {
        try {
            anhy b = this.g.b(this.a.l(), this.i, this.a, this.n, this.o);
            d();
            PlayerResponseModel playerResponseModel = (PlayerResponseModel) b.get(this.m, TimeUnit.MILLISECONDS);
            this.s = playerResponseModel;
            e(playerResponseModel);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            c(e);
        }
    }

    private final void h(boolean z) {
        PlayerResponseModel playerResponseModel;
        Pair a = this.g.a(this.a, this.i, this.n, this.o);
        d();
        Future future = (Future) a.second;
        try {
            this.s = (PlayerResponseModel) ((anhy) a.first).get(this.m, TimeUnit.MILLISECONDS);
            this.p = false;
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            zga.d("Problem fetching player response", e);
            this.t = e;
        }
        if (!z) {
            PlayerResponseModel playerResponseModel2 = this.s;
            if (playerResponseModel2 != null) {
                e(playerResponseModel2);
            } else {
                Exception exc = this.t;
                if (exc != null) {
                    c(exc);
                }
            }
        }
        if (this.l > 0 && (((playerResponseModel = this.s) == null || (!playerResponseModel.F() && !this.s.c().ao())) && !this.a.x())) {
            this.f.block(this.l);
        }
        if (this.e) {
            return;
        }
        try {
            this.q = (WatchNextResponseModel) future.get();
        } catch (InterruptedException | ExecutionException e2) {
            zga.d("Problem fetching WatchNext response", e2);
            this.r = e2;
        }
    }

    private final void i() {
        WatchNextResponseModel watchNextResponseModel = this.q;
        if (watchNextResponseModel != null) {
            f(watchNextResponseModel);
            return;
        }
        Exception exc = this.r;
        if (exc != null) {
            this.k.post(new aiix(this, exc, 0));
        }
    }

    public final synchronized void a() {
        this.f.open();
    }

    public final boolean b(boolean z) {
        if (!this.p && !z) {
            return false;
        }
        this.e = true;
        a();
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (Looper.myLooper() != Looper.getMainLooper() && Process.getThreadPriority(Process.myTid()) != 0) {
            zga.b("Request being made from non-critical thread");
        }
        this.c.e();
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                this.s = this.h;
                anhy d = this.g.d(this.a);
                if (!this.e) {
                    try {
                        this.q = (WatchNextResponseModel) d.get();
                    } catch (InterruptedException | ExecutionException e) {
                        this.r = e;
                    }
                }
                i();
            } else if (i == 2) {
                h(true);
                WatchNextResponseModel watchNextResponseModel = this.q;
                if (watchNextResponseModel != null || this.r != null) {
                    PlayerResponseModel playerResponseModel = this.s;
                    Exception exc = this.t;
                    Exception exc2 = this.r;
                    amkq.N((playerResponseModel != null || exc != null) && (watchNextResponseModel != null || exc2 != null));
                    if (exc != null) {
                        c(exc);
                    } else if (exc2 != null) {
                        c(exc2);
                    } else if (playerResponseModel != null && watchNextResponseModel != null) {
                        f(watchNextResponseModel);
                        e(playerResponseModel);
                    }
                }
            } else {
                h(false);
                i();
            }
        } else {
            g();
        }
        if (this.b == 0 || this.s == null || this.q == null) {
            return;
        }
        this.k.post(new Runnable() { // from class: aiiu
            @Override // java.lang.Runnable
            public final void run() {
                aiiz aiizVar = aiiz.this;
                if (aiizVar.e) {
                    return;
                }
                aiizVar.c.a(aiizVar.b);
            }
        });
    }
}
