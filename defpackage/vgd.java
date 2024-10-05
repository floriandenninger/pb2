package defpackage;

import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.StrictMode;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vgd implements vha, vgq {
    static final vls q = new vls();
    public final String a;
    public final anhy b;
    public final Executor c;
    public final vcw d;
    public final vfo e;
    public final amhy h;
    public boolean n;
    public final vhg o;
    private final vep r;
    public final veq f = new vgc(this, 1);
    public final veq g = new vgc(this, 0);
    public final Object i = new Object();
    public final anha j = anha.a();
    private final anha s = anha.a();
    private final anha t = anha.a();
    public Object k = null;
    public Object l = null;
    public boolean m = false;
    public vls p = null;

    public vgd(String str, anhy anhyVar, vhg vhgVar, Executor executor, vcw vcwVar, vfo vfoVar, vep vepVar, amhy amhyVar) {
        this.a = str;
        this.b = anaf.P(anhyVar);
        this.o = vhgVar;
        this.c = executor;
        this.d = vcwVar;
        this.e = vfoVar;
        this.r = vepVar;
        this.h = amhyVar;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            UUID.randomUUID().toString();
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    public static anhy b(final anhy anhyVar, final Closeable closeable, Executor executor) {
        return anaf.I(anhyVar).a(new Callable() { // from class: vft
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Closeable closeable2 = closeable;
                anhy anhyVar2 = anhyVar;
                closeable2.close();
                return anaf.W(anhyVar2);
            }
        }, executor);
    }

    private final Closeable m(Uri uri, vls vlsVar) {
        boolean z = vlsVar != q;
        try {
            vcw vcwVar = this.d;
            vee veeVar = new vee(true, true);
            veeVar.a = z;
            return (Closeable) vcwVar.c(uri, veeVar);
        } catch (vds e) {
            if (z) {
                return null;
            }
            throw e;
        }
    }

    @Override // defpackage.vha
    public final anfy a() {
        return new anfy() { // from class: vfq
            @Override // defpackage.anfy
            public final anhy a() {
                final vgd vgdVar = vgd.this;
                vfo vfoVar = vgdVar.e;
                anhy P = anaf.P(vgdVar.b);
                final Runnable runnable = new Runnable() { // from class: vfs
                    @Override // java.lang.Runnable
                    public final void run() {
                        vgd vgdVar2 = vgd.this;
                        synchronized (vgdVar2.i) {
                            Object obj = vgdVar2.k;
                            if (obj != null && vgdVar2.m) {
                                vgdVar2.l = obj;
                            }
                            vgdVar2.k = null;
                            vgdVar2.n = true;
                            synchronized (vgdVar2.i) {
                                if (vgdVar2.p != null) {
                                    anaf.Y(vgdVar2.k(vgd.q), new adhk(1), angq.a);
                                }
                            }
                        }
                    }
                };
                final vey veyVar = (vey) vfoVar;
                return anfq.h(P, new amml() { // from class: ver
                    @Override // defpackage.amml
                    public final Object apply(Object obj) {
                        vey veyVar2 = vey.this;
                        Runnable runnable2 = runnable;
                        Uri uri = (Uri) obj;
                        IntentFilter intentFilter = new IntentFilter();
                        intentFilter.addAction("com.google.android.libraries.storage.protostore.MULTI_APP");
                        intentFilter.addDataScheme(uri.getScheme());
                        intentFilter.addDataPath(uri.getPath(), 0);
                        intentFilter.addDataAuthority("*", null);
                        veyVar2.b.registerReceiver(new vew(runnable2), intentFilter, veyVar2.d, veyVar2.e);
                        synchronized (veyVar2.i) {
                            veyVar2.h.p(uri, runnable2);
                        }
                        return null;
                    }
                }, angq.a);
            }
        };
    }

    public final anhy c(IOException iOException, veq veqVar) {
        if ((iOException instanceof vdi) || (iOException.getCause() instanceof vdi)) {
            return anaf.N(iOException);
        }
        return this.r.a(iOException, veqVar);
    }

    @Override // defpackage.vgq
    public final anhy d() {
        synchronized (this.i) {
            this.m = true;
        }
        vls vlsVar = new vls();
        synchronized (this.i) {
            this.p = vlsVar;
        }
        return anhv.a;
    }

    @Override // defpackage.vgq
    public final Object e() {
        synchronized (this.i) {
            amkq.N(this.m);
            Object obj = this.k;
            if (obj != null) {
                return obj;
            }
            Object obj2 = this.l;
            if (obj2 != null) {
                return obj2;
            }
            throw new IllegalStateException("Do not call getWarmData before read(lock) completes.");
        }
    }

    public final Object f(Uri uri) {
        try {
            try {
                amhy amhyVar = this.h;
                String valueOf = String.valueOf(this.a);
                amil b = amhyVar.b(valueOf.length() != 0 ? "Read ".concat(valueOf) : new String("Read "));
                try {
                    InputStream inputStream = (InputStream) this.d.c(uri, veg.b());
                    try {
                        aooy b2 = this.o.b(inputStream);
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        b.close();
                        return b2;
                    } catch (Throwable th) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable unused) {
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    try {
                        b.close();
                    } catch (Throwable unused2) {
                    }
                    throw th2;
                }
            } catch (FileNotFoundException e) {
                if (this.d.h(uri)) {
                    throw e;
                }
                return this.o.a;
            }
        } catch (IOException e2) {
            throw vls.j(this.d, uri, e2);
        }
    }

    @Override // defpackage.vha
    public final String g() {
        return this.a;
    }

    public final void h(Object obj) {
        this.k = obj;
        this.l = null;
    }

    public final anhy i(final anhy anhyVar) {
        anhy b;
        vfo vfoVar = this.e;
        final anhy anhyVar2 = this.b;
        final vey veyVar = (vey) vfoVar;
        final Integer num = (Integer) ((amny) veyVar.f).a;
        if (num.intValue() < 0) {
            b = anhv.a;
        } else {
            final anhy i = anfq.i(anhyVar2, veyVar.c, angq.a);
            b = anaf.K(anhyVar2, i).b(new anfy() { // from class: vet
                @Override // defpackage.anfy
                public final anhy a() {
                    vey veyVar2 = vey.this;
                    anhy anhyVar3 = anhyVar2;
                    anhy anhyVar4 = i;
                    Integer num2 = num;
                    Uri uri = (Uri) anaf.W(anhyVar3);
                    Set<String> set = (Set) anaf.W(anhyVar4);
                    vex vexVar = new vex(set);
                    for (String str : set) {
                        Intent intent = new Intent();
                        intent.setAction("com.google.android.libraries.storage.protostore.MULTI_APP");
                        intent.setData(uri);
                        intent.setPackage(str);
                        intent.setFlags(268435456);
                        veyVar2.b.sendOrderedBroadcast(intent, null, vexVar, veyVar2.e, -1, null, null);
                    }
                    amnp b2 = amnp.b(amlo.a);
                    final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
                    anhy h = aney.h(anht.q(vexVar.a).r(num2.intValue(), veyVar2.g, null), TimeoutException.class, new amml() { // from class: ves
                        @Override // defpackage.amml
                        public final Object apply(Object obj) {
                            atomicBoolean.set(false);
                            return null;
                        }
                    }, angq.a);
                    anaf.Y(h, new veu(veyVar2, atomicBoolean, set, b2, vexVar, num2), angq.a);
                    return h;
                }
            }, angq.a);
        }
        return anfq.i(b, amjk.c(new anfz() { // from class: vga
            @Override // defpackage.anfz
            public final anhy a(Object obj) {
                final vgd vgdVar = vgd.this;
                return anfq.i(anhyVar, amjk.c(new anfz() { // from class: vfx
                    @Override // defpackage.anfz
                    public final anhy a(Object obj2) {
                        vgd vgdVar2 = vgd.this;
                        Uri uri = (Uri) anaf.W(vgdVar2.b);
                        Uri i2 = vls.i(uri, ".tmp");
                        try {
                            amhy amhyVar = vgdVar2.h;
                            String valueOf = String.valueOf(vgdVar2.a);
                            amil b2 = amhyVar.b(valueOf.length() != 0 ? "Write ".concat(valueOf) : new String("Write "));
                            try {
                                vdf vdfVar = new vdf();
                                try {
                                    vcw vcwVar = vgdVar2.d;
                                    veh b3 = veh.b();
                                    b3.a = new vdf[]{vdfVar};
                                    OutputStream outputStream = (OutputStream) vcwVar.c(i2, b3);
                                    try {
                                        ((aooy) obj2).writeTo(outputStream);
                                        vdfVar.a();
                                        if (outputStream != null) {
                                            outputStream.close();
                                        }
                                        b2.close();
                                        vgdVar2.d.g(i2, uri);
                                        synchronized (vgdVar2.i) {
                                            vgdVar2.h(obj2);
                                        }
                                        return anhv.a;
                                    } catch (Throwable th) {
                                        if (outputStream != null) {
                                            try {
                                                outputStream.close();
                                            } catch (Throwable unused) {
                                            }
                                        }
                                        throw th;
                                    }
                                } catch (IOException e) {
                                    throw vls.j(vgdVar2.d, uri, e);
                                }
                            } catch (Throwable th2) {
                                try {
                                    b2.close();
                                } catch (Throwable unused2) {
                                }
                                throw th2;
                            }
                        } catch (IOException e2) {
                            if (vgdVar2.d.h(i2)) {
                                try {
                                    vgdVar2.d.f(i2);
                                } catch (IOException unused3) {
                                }
                            }
                            throw e2;
                        }
                    }
                }), vgdVar.c);
            }
        }), angq.a);
    }

    @Override // defpackage.vha
    public final anhy j(final anfz anfzVar, final Executor executor) {
        return this.j.b(amjk.b(new anfy() { // from class: vfv
            @Override // defpackage.anfy
            public final anhy a() {
                final anhy i;
                final vgd vgdVar = vgd.this;
                anfz anfzVar2 = anfzVar;
                Executor executor2 = executor;
                final Uri uri = (Uri) anaf.W(vgdVar.b);
                vdp a = vdp.a((Closeable) vgdVar.d.c(uri, vee.b()));
                try {
                    try {
                        i = anaf.O(vgdVar.f(uri));
                    } catch (IOException e) {
                        i = anfq.i(vgdVar.c(e, vgdVar.g), amjk.c(new anfz() { // from class: vfy
                            @Override // defpackage.anfz
                            public final anhy a(Object obj) {
                                return anaf.O(vgd.this.f(uri));
                            }
                        }), vgdVar.c);
                    }
                    final anhy i2 = anfq.i(i, anfzVar2, executor2);
                    anhy b = vgd.b(anfq.i(i2, amjk.c(new anfz() { // from class: vfr
                        @Override // defpackage.anfz
                        public final anhy a(Object obj) {
                            vgd vgdVar2 = vgd.this;
                            anhy anhyVar = i;
                            anhy anhyVar2 = i2;
                            if (anaf.W(anhyVar).equals(anaf.W(anhyVar2))) {
                                return anhv.a;
                            }
                            return vgdVar2.i(anhyVar2);
                        }
                    }), angq.a), a.b(), vgdVar.c);
                    a.close();
                    return b;
                } catch (Throwable th) {
                    try {
                        a.close();
                    } catch (Throwable unused) {
                    }
                    throw th;
                }
            }
        }), this.c);
    }

    @Override // defpackage.vha
    public final anhy k(final vls vlsVar) {
        synchronized (this.i) {
            Object obj = this.k;
            if (obj != null) {
                return anaf.O(obj);
            }
            final byte[] bArr = null;
            final byte[] bArr2 = null;
            final byte[] bArr3 = null;
            return anaf.P((vlsVar == q ? this.t : this.s).b(amjk.b(new anfy(vlsVar, bArr, bArr2, bArr3) { // from class: vfu
                public final /* synthetic */ vls b;

                @Override // defpackage.anfy
                public final anhy a() {
                    final vgd vgdVar = vgd.this;
                    final vls vlsVar2 = this.b;
                    final Uri uri = (Uri) anaf.W(vgdVar.b);
                    try {
                        return anaf.O(vgdVar.l(vlsVar2, uri));
                    } catch (IOException e) {
                        final byte[] bArr4 = null;
                        final byte[] bArr5 = null;
                        final byte[] bArr6 = null;
                        return anfq.i(vgdVar.c(e, vgdVar.f), amjk.c(new anfz(vlsVar2, uri, bArr4, bArr5, bArr6) { // from class: vfz
                            public final /* synthetic */ Uri b;
                            public final /* synthetic */ vls c;

                            @Override // defpackage.anfz
                            public final anhy a(Object obj2) {
                                return anaf.O(vgd.this.l(this.c, this.b));
                            }
                        }), vgdVar.c);
                    }
                }
            }), this.c));
        }
    }

    public final Object l(vls vlsVar, Uri uri) {
        Closeable m;
        synchronized (this.i) {
            Object obj = this.k;
            if (obj != null) {
                return obj;
            }
            try {
                m = m(uri, vlsVar);
            } catch (FileNotFoundException unused) {
                Object f = f(uri);
                synchronized (this.i) {
                    if (this.n) {
                        f = null;
                    } else {
                        h(f);
                    }
                    if (f != null) {
                        return f;
                    }
                    m = m(uri, vlsVar);
                }
            }
            try {
                Object f2 = f(uri);
                synchronized (this.i) {
                    if (m != null) {
                        h(f2);
                        m.close();
                    }
                }
                return f2;
            } catch (Throwable th) {
                if (m != null) {
                    try {
                        m.close();
                    } catch (Throwable unused2) {
                    }
                }
                throw th;
            }
        }
    }
}
