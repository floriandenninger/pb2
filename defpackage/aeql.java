package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public class aeql {
    public final aepw a;
    public final AtomicInteger b;
    public boolean c;
    public volatile Integer d;
    public Long e;
    public int f;
    private final aeqg g;
    private final Handler h;
    private String i;
    private String j;
    private String k;
    private String l;
    private String m;
    private List n;
    private boolean o;

    public aeql(aeqg aeqgVar, Handler handler, aepw aepwVar) {
        afki.a(aeqgVar);
        this.g = aeqgVar;
        this.h = handler;
        afki.a(aepwVar);
        this.a = aepwVar;
        this.b = new AtomicInteger();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final amru d() {
        List list = this.n;
        if (list == null) {
            return null;
        }
        return amru.o(list);
    }

    public final void e(List list, final int i) {
        if (!list.contains(3) || this.o) {
            return;
        }
        this.h.post(new Runnable() { // from class: aeqk
            @Override // java.lang.Runnable
            public final void run() {
                aeql aeqlVar = aeql.this;
                int i2 = i;
                if (i2 == 0 || i2 == aeqlVar.b.get()) {
                    aeqlVar.a.rm();
                }
            }
        });
        this.o = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void f(String str, String str2, String str3, String str4, String str5) {
        this.i = str;
        this.k = str2;
        this.l = str3;
        this.m = str4;
        this.j = str5;
        this.o = false;
        this.b.incrementAndGet();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v21, types: [aeqf] */
    public final byte[] g(byte[] bArr) {
        int i;
        aepy aepyVar;
        int i2 = this.b.get();
        String str = this.i;
        Uri parse = str != null ? Uri.parse(str) : null;
        aeqg aeqgVar = this.g;
        String str2 = this.m;
        String str3 = this.j;
        String str4 = this.k;
        String str5 = this.l;
        Integer num = this.d;
        int i3 = this.f;
        Long l = this.e;
        if (parse != null) {
            yjk.e();
            zhy b = zhy.b(parse);
            aeqgVar.b.d(b);
            b.h("cpn", str3);
            if (!str4.equals("")) {
                b.h("session_id", str4);
            }
            Uri a = b.a();
            afww f = afww.f();
            aeqc aeqcVar = new aeqc(aeqgVar.g, a.toString(), bArr, aeqgVar.i, aeqgVar.a.c(), aeqgVar.c, f);
            aeqcVar.h = false;
            aeqgVar.e.a(aeqcVar);
            try {
                i = i2;
                aepyVar = (aeqf) f.get();
            } catch (InterruptedException e) {
                throw new aeqe(e);
            } catch (ExecutionException e2) {
                if (e2.getCause() instanceof aeqe) {
                    throw ((aeqe) e2.getCause());
                }
                throw new aeqe(e2.getCause());
            }
        } else {
            afki.d(!str5.isEmpty());
            yjk.e();
            try {
                i = i2;
                aepy aepyVar2 = new aepy((arpe) aeqgVar.j.d(new aepz(aeqgVar.f, aeqgVar.a, bArr, str2, str3, TextUtils.isEmpty(str4) ? aeqgVar.h.a() : str4, str5, num, i3, l, null, null, null)));
                boolean e3 = aepyVar2.e();
                aepyVar = aepyVar2;
                if (!e3) {
                    throw new aeqe(aepyVar2);
                }
            } catch (aasx e4) {
                throw new aeqe(e4);
            }
        }
        this.n = aepyVar.a();
        this.c = aepyVar.c();
        int i4 = i;
        if (i4 == this.b.get() && this.h != null) {
            e(this.n, i4);
        }
        return aepyVar.f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final byte[] h(String str, byte[] bArr) {
        Uri parse = Uri.parse(str);
        aeqg aeqgVar = this.g;
        String str2 = this.j;
        yjk.e();
        zhy b = zhy.b(parse);
        b.h("signedRequest", new String(bArr));
        b.h("cpn", str2);
        aeqgVar.b.d(b);
        Uri a = b.a();
        afww f = afww.f();
        aeqgVar.e.a(new aeqa(a.toString(), f));
        try {
            return (byte[]) f.get();
        } catch (InterruptedException e) {
            throw new aeqe(e, true);
        } catch (ExecutionException e2) {
            throw new aeqe(e2.getCause(), true);
        }
    }
}
