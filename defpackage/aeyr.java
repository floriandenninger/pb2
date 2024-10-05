package defpackage;

import android.content.Context;
import android.os.Handler;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.media.player.scripted.jni.NativeSupport;
import j$.util.function.Consumer;
import j$.util.function.Function;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aeyr implements aeyj {
    public volatile plr a;
    public volatile Handler b;
    public volatile boolean c;
    public final affg f;
    public final afix g;
    public final afeu h;
    public final Runnable i;
    public final Function j;
    public final aeuu m;
    public final afhs n;
    private volatile ScheduledFuture o;
    private ScheduledExecutorService p;
    private final ayr q;
    private final Handler r;
    private final afcu s;
    private final afkn t;
    private final ScheduledExecutorService u;
    public final List d = new ArrayList();
    public final Object e = new Object();
    public volatile boolean k = true;
    public volatile aeyk l = null;

    public aeyr(plr plrVar, ayr ayrVar, Handler handler, Handler handler2, aeuu aeuuVar, afcu afcuVar, afix afixVar, ScheduledExecutorService scheduledExecutorService, Context context, affe affeVar, afkn afknVar, afeu afeuVar, afhs afhsVar, Runnable runnable, Function function) {
        this.a = plrVar;
        this.q = ayrVar;
        this.r = handler;
        this.b = handler2;
        this.m = aeuuVar;
        this.s = afcuVar;
        this.g = afixVar;
        this.t = afknVar;
        this.u = scheduledExecutorService;
        this.h = afeuVar;
        this.n = afhsVar;
        this.i = runnable;
        this.j = function;
        this.f = new affg(context, affeVar);
    }

    public static String b(aezf aezfVar) {
        String str = aezfVar.a;
        int hashCode = aezfVar.hashCode();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11);
        sb.append(str);
        sb.append(hashCode);
        return sb.toString();
    }

    public static List d(FormatStreamModel[] formatStreamModelArr) {
        ArrayList arrayList = new ArrayList();
        for (FormatStreamModel formatStreamModel : formatStreamModelArr) {
            aone createBuilder = ajcb.a.createBuilder();
            int e = formatStreamModel.e();
            createBuilder.copyOnWrite();
            ajcb ajcbVar = (ajcb) createBuilder.instance;
            ajcbVar.b |= 1;
            ajcbVar.c = e;
            String w = formatStreamModel.w();
            createBuilder.copyOnWrite();
            ajcb ajcbVar2 = (ajcb) createBuilder.instance;
            w.getClass();
            ajcbVar2.b |= 4;
            ajcbVar2.e = w;
            long k = formatStreamModel.k();
            createBuilder.copyOnWrite();
            ajcb ajcbVar3 = (ajcb) createBuilder.instance;
            ajcbVar3.b |= 2;
            ajcbVar3.d = k;
            arrayList.add((ajcb) createBuilder.build());
        }
        return arrayList;
    }

    public final bbr a(aezf aezfVar) {
        synchronized (this.e) {
            for (aeyk aeykVar : this.d) {
                if (aeykVar.c.equals(aezfVar)) {
                    return aeykVar.i;
                }
            }
            return null;
        }
    }

    public final List c(String str) {
        ArrayList arrayList = new ArrayList();
        for (aeyk aeykVar : this.d) {
            if (aeykVar.c.a.equals(str)) {
                arrayList.add(aeykVar);
            }
        }
        return arrayList;
    }

    public final void e() {
        synchronized (this.e) {
            ScheduledExecutorService scheduledExecutorService = this.p;
            if (scheduledExecutorService != null && !scheduledExecutorService.isShutdown()) {
                this.p.shutdown();
            }
            this.s.e();
        }
    }

    public final void f() {
        synchronized (this.e) {
            ScheduledExecutorService scheduledExecutorService = this.p;
            if (scheduledExecutorService == null || scheduledExecutorService.isShutdown()) {
                ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
                this.p = newSingleThreadScheduledExecutor;
                newSingleThreadScheduledExecutor.scheduleWithFixedDelay(new Runnable() { // from class: aeym
                    @Override // java.lang.Runnable
                    public final void run() {
                        aeyr aeyrVar = aeyr.this;
                        if (aeyrVar.q(null)) {
                            try {
                                affg affgVar = aeyrVar.f;
                                afki.d(affgVar.d == 3);
                                try {
                                    try {
                                    } catch (aoob e) {
                                        throw new RuntimeException("Unexpected protobuf error", e);
                                    }
                                } catch (RuntimeException e2) {
                                    throw new afet(5, "Unexpected error calling into JS.", e2);
                                }
                            } catch (afet e3) {
                                aeyk aeykVar = aeyrVar.l;
                                aeyrVar.g(e3, aeykVar != null ? aeykVar.c : null);
                            }
                        }
                    }
                }, 0L, 500L, TimeUnit.MILLISECONDS);
                this.s.g(new Consumer() { // from class: aeyp
                    @Override // j$.util.function.Consumer
                    public final void accept(Object obj) {
                        aeyr aeyrVar = aeyr.this;
                        adup adupVar = (adup) obj;
                        if (adupVar == null || aeyrVar.f.d != 3) {
                            return;
                        }
                        affg affgVar = aeyrVar.f;
                        afki.d(affgVar.d == 3);
                        aone createBuilder = adwm.a.createBuilder();
                        createBuilder.copyOnWrite();
                        adwm adwmVar = (adwm) createBuilder.instance;
                        adwmVar.c = adupVar.d;
                        adwmVar.b |= 1;
                        try {
                        } catch (aoob e) {
                            throw new RuntimeException("Unexpected protobuf error", e);
                        }
                    }

                    @Override // j$.util.function.Consumer
                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer.CC.$default$andThen(this, consumer);
                    }
                });
            }
        }
    }

    public final void g(afet afetVar, aezf aezfVar) {
        int i = afetVar.b;
        boolean z = true;
        if (i != 6 && i != 5) {
            z = false;
        }
        h(afetVar.a(), aezfVar, z);
    }

    public final void h(final afih afihVar, final aezf aezfVar, final boolean z) {
        aesa aesaVar;
        if (aezfVar == null) {
            aesaVar = aesa.a;
        } else {
            aesaVar = aezfVar.K;
        }
        final aesa aesaVar2 = aesaVar;
        if (afihVar.n()) {
            aesaVar2.f("smfc", "f");
        }
        this.r.post(new Runnable() { // from class: aeyo
            /* JADX WARN: Code restructure failed: missing block: B:20:0x001e, code lost:
            
                if (r1 != false) goto L10;
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    r8 = this;
                    aeyr r0 = defpackage.aeyr.this
                    boolean r1 = r2
                    afih r2 = r3
                    aesa r3 = r4
                    aezf r4 = r5
                    boolean r5 = r2.n()
                    r6 = 1
                    if (r5 == 0) goto L1e
                    if (r1 != 0) goto L20
                    affg r1 = r0.f
                    int r1 = r1.d
                    r5 = 3
                    if (r1 != r5) goto L2e
                    r0.l()     // Catch: defpackage.afet -> L20
                    goto L2e
                L1e:
                    if (r1 == 0) goto L2e
                L20:
                    afhs r1 = r0.n
                    r1.n = r6
                    r0.e()
                    java.lang.String r1 = "smfc"
                    java.lang.String r5 = "d"
                    r3.f(r1, r5)
                L2e:
                    if (r4 != 0) goto L59
                    r1 = 2
                    java.lang.Object[] r3 = new java.lang.Object[r1]
                    java.lang.String r5 = r2.i()
                    r7 = 0
                    r3[r7] = r5
                    java.lang.String r5 = r2.k()
                    java.lang.String r5 = defpackage.ammx.d(r5)
                    r3[r6] = r5
                    java.lang.String r5 = "Scripted MediaFetch error with no playback: %s:%s"
                    java.lang.String r3 = java.lang.String.format(r5, r3)
                    r5 = 6
                    defpackage.afsi.b(r1, r5, r3)
                    afic r1 = defpackage.afic.MEDIAFETCH
                    java.lang.Object[] r5 = new java.lang.Object[r6]
                    r5[r7] = r3
                    java.lang.String r3 = "%s"
                    defpackage.afid.b(r1, r3, r5)
                L59:
                    aeuu r0 = r0.m
                    if (r4 != 0) goto L60
                    aeru r1 = defpackage.aeru.c
                    goto L62
                L60:
                    aeru r1 = r4.b
                L62:
                    aeut r0 = r0.a
                    r0.u(r1, r2)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.aeyo.run():void");
            }
        });
    }

    public final void i(afet afetVar, String str) {
        List c = c(str);
        h(afetVar.a(), c.isEmpty() ? null : ((aeyk) c.get(0)).c, false);
    }

    public final void j(aezf aezfVar) {
        synchronized (this.e) {
            if (q(aezfVar)) {
                m(aezfVar);
                k(aezfVar);
                f();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0222 A[Catch: afet -> 0x02a7, TryCatch #0 {afet -> 0x02a7, blocks: (B:12:0x0054, B:15:0x0074, B:20:0x00c5, B:23:0x010a, B:25:0x0222, B:26:0x0228, B:28:0x023c, B:29:0x0242, B:31:0x0258, B:32:0x025e, B:33:0x0269, B:52:0x02a6, B:14:0x0072, B:35:0x026a, B:37:0x026f, B:39:0x0277, B:40:0x028f, B:44:0x0292, B:45:0x0299, B:48:0x029b, B:49:0x02a3), top: B:11:0x0054, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x023c A[Catch: afet -> 0x02a7, TryCatch #0 {afet -> 0x02a7, blocks: (B:12:0x0054, B:15:0x0074, B:20:0x00c5, B:23:0x010a, B:25:0x0222, B:26:0x0228, B:28:0x023c, B:29:0x0242, B:31:0x0258, B:32:0x025e, B:33:0x0269, B:52:0x02a6, B:14:0x0072, B:35:0x026a, B:37:0x026f, B:39:0x0277, B:40:0x028f, B:44:0x0292, B:45:0x0299, B:48:0x029b, B:49:0x02a3), top: B:11:0x0054, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0258 A[Catch: afet -> 0x02a7, TryCatch #0 {afet -> 0x02a7, blocks: (B:12:0x0054, B:15:0x0074, B:20:0x00c5, B:23:0x010a, B:25:0x0222, B:26:0x0228, B:28:0x023c, B:29:0x0242, B:31:0x0258, B:32:0x025e, B:33:0x0269, B:52:0x02a6, B:14:0x0072, B:35:0x026a, B:37:0x026f, B:39:0x0277, B:40:0x028f, B:44:0x0292, B:45:0x0299, B:48:0x029b, B:49:0x02a3), top: B:11:0x0054, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x026a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(final defpackage.aezf r22) {
        /*
            Method dump skipped, instructions count: 697
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeyr.k(aezf):void");
    }

    public final void l() {
        synchronized (this.e) {
            affg affgVar = this.f;
            synchronized (affgVar.c) {
                try {
                    if (affgVar.e != null) {
                        try {
                        } catch (aoob e) {
                            throw new RuntimeException("Unexpected protobuf error", e);
                        }
                    }
                    Iterator it = affgVar.b.iterator();
                    while (it.hasNext()) {
                        ((akpo) it.next()).b();
                    }
                    affgVar.b.clear();
                } catch (RuntimeException e2) {
                    throw new afet(5, "Unexpected error calling into JS.", e2);
                }
            }
            Iterator it2 = this.d.iterator();
            while (it2.hasNext()) {
                ((aeyk) it2.next()).b.a();
            }
            this.d.clear();
            this.l = null;
        }
    }

    public final void m(aezf aezfVar) {
        synchronized (this.e) {
            try {
                l();
            } catch (afet e) {
                g(e, aezfVar);
            }
        }
    }

    public final void n(long j) {
        this.a.c(j);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0040 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o(boolean r10) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeyr.o(boolean):void");
    }

    public final void p(final aezf aezfVar) {
        synchronized (this.e) {
            if (this.o != null) {
                return;
            }
            this.o = this.u.schedule(new Runnable() { // from class: aeyn
                @Override // java.lang.Runnable
                public final void run() {
                    auna aunaVar;
                    aeyr aeyrVar = aeyr.this;
                    aezf aezfVar2 = aezfVar;
                    try {
                        affg affgVar = aeyrVar.f;
                        synchronized (affgVar.c) {
                            if (affgVar.d == 1) {
                                try {
                                    InputStream open = affgVar.a.getAssets().open("mediafetch_bundle.js");
                                    try {
                                        String next = new Scanner(open).useDelimiter("\\A").next();
                                        if (open != null) {
                                            open.close();
                                        }
                                        affgVar.b(next);
                                    } catch (Throwable th) {
                                        if (open != null) {
                                            try {
                                                open.close();
                                            } catch (Throwable unused) {
                                            }
                                        }
                                        throw th;
                                    }
                                } catch (IOException e) {
                                    throw new afet(6, "Failed to read init script.", e);
                                }
                            }
                        }
                        affg affgVar2 = aeyrVar.f;
                        aeyv aeyvVar = new aeyv(aeyrVar, new aeyl(aeyrVar));
                        apwy b = aeyrVar.n.c.b();
                        if (b != null) {
                            aunaVar = b.D;
                            if (aunaVar == null) {
                                aunaVar = auna.a;
                            }
                        } else {
                            aunaVar = auna.a;
                        }
                        afki.b(aeyrVar.f.d != 1);
                        aehh aehhVar = new aehh(aeyrVar.g, aeyrVar.h, aeyrVar.j, aeyrVar.f.a());
                        aeyy aeyyVar = new aeyy();
                        afki.d(affgVar2.d != 1);
                        synchronized (affgVar2.c) {
                            if (affgVar2.d != 3) {
                                byte[] nativeRetainObjectReference = NativeSupport.nativeRetainObjectReference(aeyvVar);
                                byte[] nativeRetainObjectReference2 = NativeSupport.nativeRetainObjectReference(aehhVar);
                                byte[] nativeRetainObjectReference3 = NativeSupport.nativeRetainObjectReference(aeyyVar);
                                try {
                                    affj affjVar = affgVar2.e;
                                    aone createBuilder = advi.a.createBuilder();
                                    aomf x = aomf.x(nativeRetainObjectReference);
                                    createBuilder.copyOnWrite();
                                    advi adviVar = (advi) createBuilder.instance;
                                    adviVar.b |= 1;
                                    adviVar.c = x;
                                    createBuilder.copyOnWrite();
                                    advi adviVar2 = (advi) createBuilder.instance;
                                    aunaVar.getClass();
                                    adviVar2.d = aunaVar;
                                    adviVar2.b |= 2;
                                    aomf x2 = aomf.x(nativeRetainObjectReference2);
                                    createBuilder.copyOnWrite();
                                    advi adviVar3 = (advi) createBuilder.instance;
                                    adviVar3.b |= 4;
                                    adviVar3.e = x2;
                                    aomf x3 = aomf.x(nativeRetainObjectReference3);
                                    createBuilder.copyOnWrite();
                                    advi adviVar4 = (advi) createBuilder.instance;
                                    adviVar4.b |= 8;
                                    adviVar4.f = x3;
                                    try {
                                        affgVar2.d = 3;
                                    } catch (aoob e2) {
                                        throw new RuntimeException("Unexpected protobuf error", e2);
                                    }
                                } catch (RuntimeException e3) {
                                    throw new afet(6, "Failed to initialize JS MFC.", e3);
                                }
                            }
                        }
                        aeyrVar.c = true;
                    } catch (afet e4) {
                        aeyrVar.g(e4, aezfVar2);
                    }
                }
            }, 0L, TimeUnit.MILLISECONDS);
        }
    }

    public final boolean q(aezf aezfVar) {
        if (this.o == null) {
            p(aezfVar);
        }
        ScheduledFuture scheduledFuture = this.o;
        if (scheduledFuture.isDone()) {
            return this.c;
        }
        try {
            scheduledFuture.get(500L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            String str = true != (e instanceof TimeoutException) ? "failed." : " timed out.";
            g(new afet(6, str.length() != 0 ? "Init ".concat(str) : new String("Init "), e), aezfVar);
        }
        return this.c;
    }
}
