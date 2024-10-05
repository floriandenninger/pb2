package defpackage;

import android.accounts.Account;
import android.os.RemoteException;
import android.webkit.CookieManager;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yhk {
    private static final String i = "yhk";
    public final afsy b;
    public final shf c;
    final qdj d;
    public final wcf g;
    public final axze h;
    private final ci j;
    private final anib k;
    public final Object a = new Object();
    public final AtomicReference e = new AtomicReference();
    final Map f = DesugarCollections.synchronizedMap(new HashMap());

    public yhk(ci ciVar, wcf wcfVar, afsy afsyVar, axze axzeVar, shf shfVar, anib anibVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.j = ciVar;
        this.g = wcfVar;
        this.b = afsyVar;
        this.h = axzeVar;
        this.c = shfVar;
        this.k = anibVar;
        this.d = qdj.a(ciVar);
    }

    public static final void c(String str, zfi zfiVar) {
        if (zfiVar != null) {
            zfiVar.a(str);
        }
    }

    public static final void d(String str) {
        String str2 = i;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 16 + String.valueOf(str).length());
        sb.append("customWebView::");
        sb.append(str2);
        sb.append(" ");
        sb.append(str);
        afsi.b(1, 11, sb.toString());
    }

    private static boolean e(Throwable th) {
        if (th == null) {
            return false;
        }
        if (th.getClass().getName().contains("MissingWebViewPackageException")) {
            return true;
        }
        return e(th.getCause());
    }

    public final void a() {
        try {
            CookieManager cookieManager = CookieManager.getInstance();
            cookieManager.removeAllCookies(null);
            cookieManager.flush();
            this.f.clear();
        } catch (RuntimeException e) {
            if (e(e)) {
                d("MissingWebViewPackageException");
            }
        }
    }

    public final void b(final String str, final acsx acsxVar, final zfi zfiVar) {
        final int i2 = 0;
        final int i3 = 1;
        ynm.n(this.j, this.k.submit(new Callable() { // from class: yhj
            @Override // java.util.concurrent.Callable
            public final Object call() {
                yhk yhkVar = yhk.this;
                String str2 = str;
                acsx acsxVar2 = acsxVar;
                try {
                    synchronized (yhkVar.a) {
                        URL url = new URL(str2);
                        Account a = yhkVar.g.a(yhkVar.b.c());
                        if (!amkq.b(a, yhkVar.e.get())) {
                            yhkVar.a();
                        }
                        long d = yhkVar.c.d();
                        long longValue = (((Long) yhkVar.h.a.a.Y(axzb.d).B().aB()).longValue() * 1000) + d;
                        if (!yhkVar.f.containsKey(url.getHost()) || d >= ((Long) yhkVar.f.get(url.getHost())).longValue()) {
                            yhkVar.d.c(a, str2);
                            yhkVar.f.put(url.getHost(), Long.valueOf(longValue));
                            yhkVar.e.set(a);
                            return null;
                        }
                        if (acsxVar2 != null) {
                            aone createBuilder = asmb.a.createBuilder();
                            aone createBuilder2 = asmj.a.createBuilder();
                            createBuilder2.copyOnWrite();
                            asmj asmjVar = (asmj) createBuilder2.instance;
                            asmjVar.b |= 2;
                            asmjVar.c = true;
                            asmj asmjVar2 = (asmj) createBuilder2.build();
                            createBuilder.copyOnWrite();
                            asmb asmbVar = (asmb) createBuilder.instance;
                            asmjVar2.getClass();
                            asmbVar.z = asmjVar2;
                            asmbVar.d |= 64;
                            acsxVar2.a((asmb) createBuilder.build());
                        }
                        yhkVar.f.put(url.getHost(), Long.valueOf(longValue));
                        return null;
                    }
                } catch (RemoteException | qnk | qnl unused) {
                    yhk.d("GetAccountException");
                    return null;
                } catch (IOException | qcw | qdh unused2) {
                    yhk.d("WebLoginHelperException");
                    return null;
                }
            }
        }), new zfi() { // from class: yhi
            @Override // defpackage.zfi
            public final void a(Object obj) {
                if (i2 != 0) {
                    yhk.c(str, zfiVar);
                    return;
                }
                String str2 = str;
                zfi zfiVar2 = zfiVar;
                yhk.d(((Throwable) obj).getMessage());
                yhk.c(str2, zfiVar2);
            }
        }, new zfi() { // from class: yhi
            @Override // defpackage.zfi
            public final void a(Object obj) {
                if (i3 != 0) {
                    yhk.c(str, zfiVar);
                    return;
                }
                String str2 = str;
                zfi zfiVar2 = zfiVar;
                yhk.d(((Throwable) obj).getMessage());
                yhk.c(str2, zfiVar2);
            }
        });
    }
}
