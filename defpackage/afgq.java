package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.libraries.youtube.innertube.model.player.TrackingUrlModel;
import java.io.UnsupportedEncodingException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afgq {
    public final afuh a;
    public final afqm b;
    public final afsx c;
    public final String d;
    public final afgp[] e;
    public final CountDownLatch f;
    final Deque g;
    public TrackingUrlModel h;
    public boolean i;
    public boolean j;
    ajun k = new ajun((byte[]) null);
    private final Executor l;
    private final auij m;
    private zhy n;
    private int o;
    private int p;
    private boolean q;
    private boolean r;

    public afgq(afuh afuhVar, afqm afqmVar, Executor executor, afsy afsyVar, CountDownLatch countDownLatch, auij auijVar, afgp... afgpVarArr) {
        this.a = afuhVar;
        this.b = afqmVar;
        this.l = executor;
        this.c = afsyVar.c();
        this.d = afsyVar.g();
        this.e = afgpVarArr;
        countDownLatch.getClass();
        this.f = countDownLatch;
        this.m = auijVar;
        this.o = 1100;
        this.p = 1100;
        this.g = new ArrayDeque();
        this.r = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final boolean g(String str) {
        return TextUtils.equals("cat", str);
    }

    private final int j(String str, String str2) {
        List list = (List) this.k.a.get(str);
        return ((list == null || list.isEmpty()) ? str.length() + 1 : 0) + str2.length() + 1;
    }

    private final void k(final ajun ajunVar) {
        final zhy c = zhy.c(this.n);
        if (!this.r) {
            zhy zhyVar = this.n;
            zhyVar.j("fexp");
            c(zhyVar);
            this.r = true;
        }
        final byte[] bArr = null;
        this.l.execute(new Runnable(ajunVar, c, bArr) { // from class: afgo
            public final /* synthetic */ zhy b;
            public final /* synthetic */ ajun c;

            @Override // java.lang.Runnable
            public final void run() {
                Pair pair;
                afug c2;
                afgq afgqVar = afgq.this;
                ajun ajunVar2 = this.c;
                zhy zhyVar2 = this.b;
                for (afgp afgpVar : afgqVar.e) {
                    afgpVar.c(ajunVar2);
                }
                try {
                    afgqVar.f.await(10L, TimeUnit.SECONDS);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
                if (afgqVar.i || afgqVar.j) {
                    StringBuilder sb = new StringBuilder();
                    StringBuilder sb2 = new StringBuilder();
                    for (Map.Entry entry : ajunVar2.h()) {
                        List list = (List) entry.getValue();
                        String str = (String) entry.getKey();
                        if (!list.isEmpty()) {
                            if (afgq.g(str)) {
                                zhyVar2.f(str, TextUtils.join(",", list));
                            } else {
                                if (sb.length() > 0) {
                                    sb.append('&');
                                    sb2.append('&');
                                }
                                String encode = Uri.encode(str, ",:;|");
                                String encode2 = Uri.encode(TextUtils.join(",", list), ",:;|");
                                sb.append(encode);
                                sb.append('=');
                                sb.append(encode2);
                                sb2.append(encode);
                                sb2.append('=');
                                if (afha.a.contains(encode)) {
                                    sb2.append("(scrubbed)");
                                } else {
                                    sb2.append(encode2);
                                }
                            }
                            list.clear();
                        }
                    }
                    try {
                        pair = new Pair(sb.toString().getBytes("UTF-8"), sb2.toString());
                    } catch (UnsupportedEncodingException e) {
                        String valueOf = String.valueOf(e);
                        StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 31);
                        sb3.append("Failed to encode qoe post body.");
                        sb3.append(valueOf);
                        zga.b(sb3.toString());
                        pair = new Pair(new byte[0], sb2.toString());
                    }
                    Uri a = zhyVar2.a();
                    String str2 = (String) pair.second;
                    String valueOf2 = String.valueOf(afha.a(a));
                    StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf2).length() + 10 + String.valueOf(str2).length());
                    sb4.append("Pinging ");
                    sb4.append(valueOf2);
                    sb4.append("  ");
                    sb4.append(str2);
                    zga.l(sb4.toString());
                    c2 = afuh.c((byte[]) pair.first, "qoe");
                    c2.b(a);
                    c2.d = true;
                    c2.a(new acub(afgqVar.h, 1));
                    c2.g = afgqVar.c;
                    c2.h = afgqVar.d;
                } else {
                    for (Map.Entry entry2 : ajunVar2.h()) {
                        List list2 = (List) entry2.getValue();
                        String str3 = (String) entry2.getKey();
                        if (!list2.isEmpty()) {
                            if (afgq.g(str3)) {
                                zhyVar2.f(str3, TextUtils.join(",", list2));
                            } else {
                                zhyVar2.i(str3, TextUtils.join(",", list2), ",:;|");
                            }
                            list2.clear();
                        }
                    }
                    Uri a2 = zhyVar2.a();
                    String valueOf3 = String.valueOf(afha.a(a2));
                    StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf3).length() + 8);
                    sb5.append("Pinging ");
                    sb5.append(valueOf3);
                    zga.l(sb5.toString());
                    c2 = afuh.d("qoe");
                    c2.b(a2);
                    c2.d = true;
                    c2.a(new acub(afgqVar.h, 1));
                    c2.g = afgqVar.c;
                    c2.h = afgqVar.d;
                }
                afgqVar.a.b(afgqVar.b, c2, afxi.a);
            }
        });
    }

    public final synchronized void a(String str, String str2) {
        int j = j(str, str2);
        long j2 = true != this.j ? 1900L : 95000L;
        int i = this.p;
        for (afgp afgpVar : this.e) {
            i += afgpVar.a();
        }
        if (i + j > j2) {
            h();
            j = j(str, str2);
        }
        this.p += j;
        this.k.j(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void b() {
        if (this.m.E || this.g.isEmpty()) {
            return;
        }
        boolean z = this.h != null;
        boolean z2 = this.n != null;
        boolean z3 = this.q;
        StringBuilder sb = new StringBuilder(97);
        sb.append("QoeStatsClient: Ping overflow, trackingUrl=");
        sb.append(z);
        sb.append(", baseQoeUriBuilder=");
        sb.append(z2);
        sb.append(", allowSendingPing=");
        sb.append(z3);
        String sb2 = sb.toString();
        afsi.b(2, 6, sb2);
        afid.b(afic.QOE, "%s", sb2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void c(zhy zhyVar) {
        this.n = zhyVar;
        int length = zhyVar.a().toString().length();
        this.p += length - this.o;
        this.o = length;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void d(boolean z) {
        this.j = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void e(TrackingUrlModel trackingUrlModel) {
        this.h = trackingUrlModel;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void f(boolean z) {
        this.i = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void h() {
        Iterator it = this.k.a.values().iterator();
        while (true) {
            if (it.hasNext()) {
                if (!((List) it.next()).isEmpty()) {
                    this.g.addLast(this.k);
                    this.k = new ajun((byte[]) null);
                    this.p = this.o;
                    break;
                }
            } else if (this.g.isEmpty()) {
                return;
            }
        }
        if (!this.q || this.n == null || this.h == null) {
            return;
        }
        while (!this.g.isEmpty()) {
            k((ajun) this.g.removeFirst());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void i() {
        this.q = true;
        if (this.n != null && this.h != null) {
            while (!this.g.isEmpty()) {
                k((ajun) this.g.removeFirst());
            }
        }
    }
}
