package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.UUID;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axp extends Handler {
    final /* synthetic */ axt a;
    private boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axp(axt axtVar, Looper looper) {
        super(looper);
        this.a = axtVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(int i, Object obj, boolean z) {
        obtainMessage(i, new axq(bbi.a(), z, SystemClock.elapsedRealtime(), obj)).sendToTarget();
    }

    public final synchronized void b() {
        removeCallbacksAndMessages(null);
        this.b = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Exception exc;
        IOException axsVar;
        String str;
        axq axqVar = (axq) message.obj;
        try {
            int i = message.what;
            if (i == 0) {
                azh azhVar = this.a.d;
                ztp ztpVar = (ztp) axqVar.d;
                String str2 = ztpVar.b;
                String E = pts.E(ztpVar.a);
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 15 + E.length());
                sb.append(str2);
                sb.append("&signedRequest=");
                sb.append(E);
                exc = azf.a(((azf) azhVar).a, sb.toString(), null, Collections.emptyMap());
            } else if (i == 1) {
                axt axtVar = this.a;
                azh azhVar2 = axtVar.d;
                UUID uuid = axtVar.e;
                ztp ztpVar2 = (ztp) axqVar.d;
                String str3 = ztpVar2.b;
                if (true == TextUtils.isEmpty(str3)) {
                    str3 = null;
                }
                if (TextUtils.isEmpty(str3)) {
                    atg atgVar = new atg();
                    atgVar.a = Uri.EMPTY;
                    throw new azi(atgVar.a(), 0L, new IllegalStateException("No license URL"));
                }
                HashMap hashMap = new HashMap();
                if (plh.e.equals(uuid)) {
                    str = "text/xml";
                } else {
                    str = plh.c.equals(uuid) ? "application/json" : "application/octet-stream";
                }
                hashMap.put("Content-Type", str);
                if (plh.e.equals(uuid)) {
                    hashMap.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
                }
                synchronized (((azf) azhVar2).b) {
                    hashMap.putAll(((azf) azhVar2).b);
                }
                exc = azf.a(((azf) azhVar2).a, str3, ztpVar2.a, hashMap);
            } else {
                throw new RuntimeException();
            }
        } catch (azi e) {
            axq axqVar2 = (axq) message.obj;
            if (axqVar2.b) {
                int i2 = axqVar2.e + 1;
                axqVar2.e = i2;
                if (i2 <= this.a.c.a(3)) {
                    long j = axqVar2.a;
                    ath athVar = e.a;
                    SystemClock.elapsedRealtime();
                    SystemClock.elapsedRealtime();
                    long j2 = axqVar2.c;
                    bbi bbiVar = new bbi(j, athVar, e.b);
                    new bbn(-1, null, 0, null);
                    if (e.getCause() instanceof IOException) {
                        axsVar = (IOException) e.getCause();
                    } else {
                        axsVar = new axs(e.getCause());
                    }
                    long b = this.a.c.b(new bfr(bbiVar, axsVar, axqVar2.e));
                    if (b != -9223372036854775807L) {
                        synchronized (this) {
                            if (!this.b) {
                                sendMessageDelayed(Message.obtain(message), b);
                                return;
                            }
                        }
                    }
                }
            }
            exc = e;
        } catch (Exception e2) {
            prh.k("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e2);
            exc = e2;
        }
        long j3 = axqVar.a;
        synchronized (this) {
            if (!this.b) {
                this.a.f.obtainMessage(message.what, Pair.create(axqVar.d, exc)).sendToTarget();
            }
        }
    }
}
