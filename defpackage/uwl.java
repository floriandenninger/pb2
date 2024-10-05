package defpackage;

import android.os.StrictMode;
import android.util.Log;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uwl {
    public static final uwk a = new uwk();
    final uvi b;
    final String c;
    public final boolean g;
    public final boolean h;
    private volatile String i;
    public final boolean f = false;
    final String d = "";
    final uxc e = new uxc(new uwj(this, 1));

    /* JADX INFO: Access modifiers changed from: protected */
    public uwl(uvi uviVar, String str, boolean z, boolean z2) {
        this.b = uviVar;
        this.c = str;
        this.g = z;
        this.h = z2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.Map, java.lang.Object] */
    public final Object a(String str) {
        Object obj;
        uxc uxcVar = this.e;
        Map map = uxcVar.b;
        if (map == null) {
            synchronized (uxcVar.a) {
                Map map2 = uxcVar.b;
                Map map3 = map2;
                if (map2 == null) {
                    ?? r1 = uxcVar.c.get();
                    r1.getClass();
                    uxcVar.b = r1;
                    uxcVar.c = null;
                    map3 = r1;
                }
                obj = map3.get(str);
            }
            return obj;
        }
        return map.get(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final anhy b() {
        if (this.i.isEmpty()) {
            return anhv.a;
        }
        return aney.i(this.b.e().a(this.i), uvw.class, new uxk(this, 1), this.b.c());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Map c() {
        uxq uxqVar;
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        try {
            try {
                uxqVar = (uxq) anaf.A(uxp.g(this.b, this.c, this.d, this.g).a());
            } finally {
                StrictMode.setThreadPolicy(allowThreadDiskWrites);
            }
        } catch (CancellationException | ExecutionException e) {
            String str = this.c;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51);
            sb.append("Unable to retrieve flag snapshot for ");
            sb.append(str);
            sb.append(" from storage.");
            Log.w("ProtoDataStoreFlagStore", sb.toString(), e);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            uxqVar = null;
        }
        if (uxqVar == null || uxqVar.c.isEmpty()) {
            final int i = 0;
            this.b.c().execute(new Runnable(this) { // from class: uxl
                public final /* synthetic */ uwl a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i2 = i;
                    if (i2 == 0) {
                        this.a.d();
                        return;
                    }
                    if (i2 == 1) {
                        this.a.b();
                        return;
                    }
                    uwl uwlVar = this.a;
                    uvi uviVar = uwlVar.b;
                    anhy b = uwo.a(uviVar).b(new fjz(uwlVar.c, 20), uviVar.c());
                    b.d(new uxm(uwlVar, b, 0), uwlVar.b.c());
                }
            });
            String str2 = this.c;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 54);
            sb2.append("Unable to retrieve flag snapshot for ");
            sb2.append(str2);
            sb2.append(", using defaults.");
            Log.w("ProtoDataStoreFlagStore", sb2.toString());
            return amvo.b;
        }
        this.i = uxqVar.c;
        final int i2 = 1;
        this.b.c().execute(new Runnable(this) { // from class: uxl
            public final /* synthetic */ uwl a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i2;
                if (i22 == 0) {
                    this.a.d();
                    return;
                }
                if (i22 == 1) {
                    this.a.b();
                    return;
                }
                uwl uwlVar = this.a;
                uvi uviVar = uwlVar.b;
                anhy b = uwo.a(uviVar).b(new fjz(uwlVar.c, 20), uviVar.c());
                b.d(new uxm(uwlVar, b, 0), uwlVar.b.c());
            }
        });
        final int i3 = 2;
        this.b.c().execute(new Runnable(this) { // from class: uxl
            public final /* synthetic */ uwl a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i3;
                if (i22 == 0) {
                    this.a.d();
                    return;
                }
                if (i22 == 1) {
                    this.a.b();
                    return;
                }
                uwl uwlVar = this.a;
                uvi uviVar = uwlVar.b;
                anhy b = uwo.a(uviVar).b(new fjz(uwlVar.c, 20), uviVar.c());
                b.d(new uxm(uwlVar, b, 0), uwlVar.b.c());
            }
        });
        return uxp.c(uxqVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void d() {
        anhy d = uxp.d(this.b, this.c, this.d);
        anfq.i(d, new uxk(this, 0), this.b.c()).d(new uxm(this, d, 1), this.b.c());
    }

    public final /* synthetic */ void e(anhy anhyVar) {
        try {
            amrz c = uxp.c((uxq) anaf.W(anhyVar));
            uxc uxcVar = this.e;
            c.getClass();
            synchronized (uxcVar.a) {
                if (uxcVar.b == null) {
                    uxcVar.b = c;
                    uxcVar.c = null;
                    return;
                }
                boolean equals = uxcVar.b.equals(c);
                if (equals) {
                    return;
                }
                this.b.b();
                this.b.b().a();
            }
        } catch (CancellationException | ExecutionException e) {
            String str = this.c;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 64);
            sb.append("Unable to update local snapshot for ");
            sb.append(str);
            sb.append(", may result in stale flags.");
            Log.w("ProtoDataStoreFlagStore", sb.toString(), e);
        }
    }
}
