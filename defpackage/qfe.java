package defpackage;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.EqualizerSettings;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qfe extends qob implements qep {
    private static final qnw F;
    private static final qar H;
    public static final qkw a = new qkw("CastClient");
    private Handler G;
    public final qfd b;
    public boolean c;
    public boolean d;
    rpv e;
    rpv f;
    public final AtomicLong g;
    public final Object h;
    public final Object i;
    public ApplicationMetadata j;
    public String k;
    public double l;
    public boolean m;
    public int n;
    public int o;
    public EqualizerSettings p;
    public final CastDevice q;
    final Map r;
    final Map s;
    public final List t;
    public int u;
    public final prh v;

    static {
        qey qeyVar = new qey();
        H = qeyVar;
        F = new qnw("Cast.API_CXLESS", qeyVar, qkv.b, null, null, null, null);
    }

    public qfe(Context context, qem qemVar) {
        super(context, F, qemVar, qoa.a);
        this.b = new qfd(this);
        this.h = new Object();
        this.i = new Object();
        this.t = Collections.synchronizedList(new ArrayList());
        qip.az(context, "context cannot be null");
        this.v = qemVar.e;
        this.q = qemVar.a;
        this.r = new HashMap();
        this.s = new HashMap();
        this.g = new AtomicLong(0L);
        this.u = 1;
        n();
    }

    public static qnx f(int i) {
        return qar.m(new Status(i));
    }

    @Override // defpackage.qep
    public final rpt a(String str, String str2) {
        qko.i(str);
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("The message payload cannot be null or empty");
        }
        if (str2.length() > 524288) {
            a.d("Message send failed. Message exceeds maximum size", new Object[0]);
            throw new IllegalArgumentException("Message exceeds maximum size524288");
        }
        qrd b = qre.b();
        b.a = new qex(this, str, str2, 0);
        b.c = 8405;
        return w(b.a());
    }

    @Override // defpackage.qep
    public final void b() {
        qrd b = qre.b();
        b.a = qes.b;
        b.c = 8403;
        w(b.a());
        h();
        o(this.b);
    }

    @Override // defpackage.qep
    public final void c(String str) {
        qen qenVar;
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.s) {
                qenVar = (qen) this.s.remove(str);
            }
            qrd b = qre.b();
            b.a = new qev(this, qenVar, str, 1);
            b.c = 8414;
            w(b.a());
            return;
        }
        throw new IllegalArgumentException("Channel namespace cannot be null or empty");
    }

    @Override // defpackage.qep
    public final void d(String str, qen qenVar) {
        qko.i(str);
        if (qenVar != null) {
            synchronized (this.s) {
                this.s.put(str, qenVar);
            }
        }
        qrd b = qre.b();
        b.a = new qev(this, str, qenVar, 0);
        b.c = 8413;
        w(b.a());
    }

    public final Handler e() {
        if (this.G == null) {
            this.G = new amcc(this.B, (byte[]) null);
        }
        return this.G;
    }

    public final void g() {
        qip.aw(this.u == 2, "Not connected to device");
    }

    public final void h() {
        synchronized (this.s) {
            this.s.clear();
        }
    }

    public final void i(rpv rpvVar) {
        synchronized (this.h) {
            if (this.e != null) {
                j(2477);
            }
            this.e = rpvVar;
        }
    }

    public final void j(int i) {
        synchronized (this.h) {
            rpv rpvVar = this.e;
            if (rpvVar != null) {
                rpvVar.a(f(i));
            }
            this.e = null;
        }
    }

    public final void k(long j, int i) {
        rpv rpvVar;
        synchronized (this.r) {
            Map map = this.r;
            Long valueOf = Long.valueOf(j);
            rpvVar = (rpv) map.get(valueOf);
            this.r.remove(valueOf);
        }
        if (rpvVar != null) {
            if (i == 0) {
                rpvVar.b(null);
            } else {
                rpvVar.a(f(i));
            }
        }
    }

    public final void l(int i) {
        synchronized (this.i) {
            rpv rpvVar = this.f;
            if (rpvVar == null) {
                return;
            }
            if (i == 0) {
                rpvVar.b(new Status(0));
            } else {
                rpvVar.a(f(i));
            }
            this.f = null;
        }
    }

    public final void m() {
        qip.aw(this.u != 1, "Not active connection");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void n() {
        if (this.q.d(2048) || !this.q.d(4) || this.q.d(1)) {
            return;
        }
        "Chromecast Audio".equals(this.q.e);
    }

    public final void o(qkt qktVar) {
        qqj qqjVar = q(qktVar, "castDeviceControllerListenerKey").b;
        qip.az(qqjVar, "Key must not be null");
        v(qqjVar, 8415);
    }
}
