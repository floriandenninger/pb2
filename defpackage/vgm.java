package defpackage;

import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vgm implements vha, vgq {
    public final anhy a;
    public final Executor b;
    public final vcw c;
    public final vep d;
    private final String g;
    private final amhy h;
    private final vhg j;
    public final Object e = new Object();
    private final anha i = anha.a();
    public anhy f = null;

    public vgm(String str, anhy anhyVar, vhg vhgVar, Executor executor, vcw vcwVar, vep vepVar, amhy amhyVar) {
        this.g = str;
        this.a = anaf.P(anhyVar);
        this.j = vhgVar;
        this.b = anaf.E(executor);
        this.c = vcwVar;
        this.d = vepVar;
        this.h = amhyVar;
    }

    private final anhy f() {
        anhy anhyVar;
        synchronized (this.e) {
            anhy anhyVar2 = this.f;
            if (anhyVar2 != null && anhyVar2.isDone()) {
                try {
                    anaf.W(this.f);
                } catch (ExecutionException unused) {
                    this.f = null;
                }
            }
            if (this.f == null) {
                this.f = anaf.P(this.i.b(amjk.b(new vgf(this, 0)), this.b));
            }
            anhyVar = this.f;
        }
        return anhyVar;
    }

    @Override // defpackage.vha
    public final anfy a() {
        return new vgf(this, 1);
    }

    public final Object b(Uri uri) {
        try {
            try {
                amhy amhyVar = this.h;
                String valueOf = String.valueOf(this.g);
                amil b = amhyVar.b(valueOf.length() != 0 ? "Read ".concat(valueOf) : new String("Read "));
                try {
                    InputStream inputStream = (InputStream) this.c.c(uri, veg.b());
                    try {
                        aooy b2 = this.j.b(inputStream);
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
                if (this.c.h(uri)) {
                    throw e;
                }
                return this.j.a;
            }
        } catch (IOException e2) {
            throw vls.j(this.c, uri, e2);
        }
    }

    public final void c(Uri uri, Object obj) {
        Uri i = vls.i(uri, ".tmp");
        try {
            amhy amhyVar = this.h;
            String valueOf = String.valueOf(this.g);
            amil b = amhyVar.b(valueOf.length() != 0 ? "Write ".concat(valueOf) : new String("Write "));
            try {
                vdf vdfVar = new vdf();
                try {
                    vcw vcwVar = this.c;
                    veh b2 = veh.b();
                    b2.a = new vdf[]{vdfVar};
                    OutputStream outputStream = (OutputStream) vcwVar.c(i, b2);
                    try {
                        ((aooy) obj).writeTo(outputStream);
                        vdfVar.a();
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        b.close();
                        this.c.g(i, uri);
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
                    throw vls.j(this.c, uri, e);
                }
            } catch (Throwable th2) {
                try {
                    b.close();
                } catch (Throwable unused2) {
                }
                throw th2;
            }
        } catch (IOException e2) {
            if (this.c.h(i)) {
                try {
                    this.c.f(i);
                } catch (IOException unused3) {
                }
            }
            throw e2;
        }
    }

    @Override // defpackage.vgq
    public final anhy d() {
        return anhv.a;
    }

    @Override // defpackage.vgq
    public final Object e() {
        Object W;
        try {
            synchronized (this.e) {
                W = anaf.W(this.f);
            }
            return W;
        } catch (NullPointerException | ExecutionException e) {
            throw new IllegalStateException("Do not call getDataSync() before a successful call to getData()", e);
        }
    }

    @Override // defpackage.vha
    public final String g() {
        return this.g;
    }

    @Override // defpackage.vha
    public final anhy j(final anfz anfzVar, final Executor executor) {
        final anhy f = f();
        return this.i.b(amjk.b(new anfy() { // from class: vgg
            @Override // defpackage.anfy
            public final anhy a() {
                final vgm vgmVar = vgm.this;
                anhy anhyVar = f;
                anfz anfzVar2 = anfzVar;
                Executor executor2 = executor;
                final anhy i = anfq.i(anhyVar, new vgh(vgmVar, 1), angq.a);
                final anhy i2 = anfq.i(i, anfzVar2, executor2);
                return anfq.i(i2, amjk.c(new anfz() { // from class: vgj
                    @Override // defpackage.anfz
                    public final anhy a(Object obj) {
                        final vgm vgmVar2 = vgm.this;
                        anhy anhyVar2 = i;
                        final anhy anhyVar3 = i2;
                        if (!anaf.W(anhyVar2).equals(anaf.W(anhyVar3))) {
                            anhy i3 = anfq.i(anhyVar3, amjk.c(new anfz() { // from class: vgi
                                @Override // defpackage.anfz
                                public final anhy a(Object obj2) {
                                    vgm vgmVar3 = vgm.this;
                                    anhy anhyVar4 = anhyVar3;
                                    vgmVar3.c((Uri) anaf.W(vgmVar3.a), obj2);
                                    synchronized (vgmVar3.e) {
                                        vgmVar3.f = anhyVar4;
                                    }
                                    return anhv.a;
                                }
                            }), vgmVar2.b);
                            synchronized (vgmVar2.e) {
                            }
                            return i3;
                        }
                        return anhv.a;
                    }
                }), angq.a);
            }
        }), angq.a);
    }

    @Override // defpackage.vha
    public final anhy k(vls vlsVar) {
        return f();
    }
}
