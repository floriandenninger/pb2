package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.EqualizerSettings;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.BinderWrapper;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qkm extends qsg {
    private static final Object I;
    public static final Object a;

    /* renamed from: J, reason: collision with root package name */
    private final Bundle f271J;
    private qkl K;
    private Bundle L;
    private final Map M;
    public ApplicationMetadata b;
    public final CastDevice c;
    public final Map d;
    public String e;
    public boolean f;
    public boolean g;
    public boolean h;
    public double i;
    public EqualizerSettings j;
    public int k;
    public int l;
    public String m;
    public String n;
    public final prh o;

    static {
        new qkw("CastClientImpl");
        a = new Object();
        I = new Object();
    }

    public qkm(Context context, Looper looper, qrz qrzVar, CastDevice castDevice, prh prhVar, Bundle bundle, qod qodVar, qoe qoeVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(context, looper, 10, qrzVar, qodVar, qoeVar);
        this.c = castDevice;
        this.o = prhVar;
        this.f271J = bundle;
        this.d = new HashMap();
        new AtomicLong(0L);
        this.M = new HashMap();
        k();
        o();
    }

    private final void Q() {
        synchronized (this.d) {
            this.d.clear();
        }
    }

    public static final void p() {
        synchronized (I) {
        }
    }

    @Override // defpackage.qsg, defpackage.qrx, defpackage.qnv
    public final int a() {
        return 12800000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qrx
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastDeviceController");
        if (queryLocalInterface instanceof qkr) {
            return (qkr) queryLocalInterface;
        }
        return new qkr(iBinder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qrx
    public final String c() {
        return "com.google.android.gms.cast.internal.ICastDeviceController";
    }

    @Override // defpackage.qrx
    protected final String d() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }

    @Override // defpackage.qrx
    protected final Bundle i() {
        Bundle bundle = new Bundle();
        this.c.c(bundle);
        bundle.putLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", 0L);
        Bundle bundle2 = this.f271J;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        this.K = new qkl(this);
        qkl qklVar = this.K;
        qklVar.asBinder();
        bundle.putParcelable("listener", new BinderWrapper(qklVar));
        String str = this.m;
        if (str != null) {
            bundle.putString("last_application_id", str);
            String str2 = this.n;
            if (str2 != null) {
                bundle.putString("last_session_id", str2);
            }
        }
        return bundle;
    }

    public final void k() {
        this.k = -1;
        this.l = -1;
        this.b = null;
        this.e = null;
        this.i = 0.0d;
        o();
        this.f = false;
        this.j = null;
    }

    @Override // defpackage.qrx, defpackage.qnv
    public final void l() {
        w();
        qkl qklVar = this.K;
        this.K = null;
        if (qklVar == null || qklVar.p() == null) {
            return;
        }
        Q();
        try {
            ((qkr) D()).a();
        } catch (RemoteException | IllegalStateException unused) {
        } finally {
            super.l();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000f  */
    @Override // defpackage.qrx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(int r3, android.os.IBinder r4, android.os.Bundle r5, int r6) {
        /*
            r2 = this;
            r0 = 2300(0x8fc, float:3.223E-42)
            r1 = 1
            if (r3 == 0) goto L9
            if (r3 != r0) goto Ld
            r3 = 2300(0x8fc, float:3.223E-42)
        L9:
            r2.g = r1
            r2.h = r1
        Ld:
            if (r3 != r0) goto L1c
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            r2.L = r3
            java.lang.String r0 = "com.google.android.gms.cast.EXTRA_APP_NO_LONGER_RUNNING"
            r3.putBoolean(r0, r1)
            r3 = 0
        L1c:
            super.m(r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qkm.m(int, android.os.IBinder, android.os.Bundle, int):void");
    }

    public final void n(long j, int i) {
        qpc qpcVar;
        synchronized (this.M) {
            qpcVar = (qpc) this.M.remove(Long.valueOf(j));
        }
        if (qpcVar != null) {
            qpcVar.d(new Status(i));
        }
    }

    final void o() {
        qip.az(this.c, "device should not be null");
        if (this.c.d(2048) || !this.c.d(4) || this.c.d(1)) {
            return;
        }
        "Chromecast Audio".equals(this.c.e);
    }

    @Override // defpackage.qrx
    public final void q() {
        System.currentTimeMillis();
        Q();
    }

    @Override // defpackage.qrx
    public final void r() {
        if (this.L != null) {
            this.L = null;
        }
    }
}
