package defpackage;

import android.os.Bundle;
import com.google.android.gms.cast.CastDevice;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aczp implements aczq, akrj {
    public static final /* synthetic */ int b = 0;
    private static final long c = TimeUnit.HOURS.toMillis(2);
    private static final String d = zga.a("MDX.FeedbackFiller");
    public final ysy a;
    private final adlt e;
    private final shf f;
    private final adtp g;
    private final azrw h;
    private final addy i;
    private final boolean j;
    private long m = -1;
    private final adlr n = new aczo(this);
    private final Object k = new Object();
    private Map l = new HashMap();

    public aczp(adlt adltVar, shf shfVar, adtp adtpVar, ysy ysyVar, azrw azrwVar, addy addyVar, acxi acxiVar) {
        this.f = shfVar;
        this.e = adltVar;
        this.g = adtpVar;
        this.a = ysyVar;
        this.h = azrwVar;
        this.i = addyVar;
        this.j = acxiVar.c.equals("m");
    }

    private static void e(Map map, adlm adlmVar) {
        if (adlmVar.j() instanceof adfw) {
            map.put("mdx_screen_identifier", ((adfw) adlmVar.j()).f.c);
        }
        String str = "unknown";
        if (adlmVar.k() instanceof adfy) {
            adfy adfyVar = (adfy) adlmVar.k();
            map.put("mdx_dial_manufacturer", zhq.h(adfyVar.f));
            map.put("mdx_dial_model", zhq.h(adfyVar.g));
            map.put("mdx_dial_is_wol", String.valueOf(adfyVar.p()));
            int a = adfyVar.a.a();
            map.put("mdx_dial_app_status", a != -1 ? a != 0 ? a != 1 ? a != 2 ? a != 3 ? "unknown" : "hidden" : "stopped" : "running" : "installable" : "not found");
            map.put("mdx_dial_is_sleeping", String.valueOf(adfyVar.o()));
        }
        int i = adlmVar.o().i;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 1) {
            str = "cast";
        } else if (i2 == 2) {
            str = "dial";
        } else if (i2 == 3) {
            str = "cloud";
        }
        map.put("mdx_session_type", str);
        int a2 = adlmVar.a();
        map.put("mdx_session_state", a2 != 0 ? a2 != 1 ? "disconnected" : "connected" : "connecting");
        map.put("mdx_session_nonce", adlmVar.o().g);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0030, code lost:
    
        if ((r8.f.c() - r8.m) >= defpackage.aczp.c) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003f A[Catch: all -> 0x00c5, TryCatch #0 {, blocks: (B:30:0x0013, B:32:0x001b, B:34:0x0023, B:5:0x0037, B:7:0x003f, B:8:0x005c, B:4:0x0032), top: B:29:0x0013 }] */
    @Override // defpackage.akrj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.String r9, android.os.Bundle r10) {
        /*
            r8 = this;
            defpackage.yjk.f()
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            adlt r0 = r8.e
            adlm r0 = r0.g()
            java.lang.Object r1 = r8.k
            monitor-enter(r1)
            if (r0 != 0) goto L32
            java.util.Map r2 = r8.l     // Catch: java.lang.Throwable -> Lc5
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> Lc5
            if (r2 != 0) goto L37
            long r2 = r8.m     // Catch: java.lang.Throwable -> Lc5
            r4 = -1
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L37
            shf r2 = r8.f     // Catch: java.lang.Throwable -> Lc5
            long r2 = r2.c()     // Catch: java.lang.Throwable -> Lc5
            long r4 = r8.m     // Catch: java.lang.Throwable -> Lc5
            long r2 = r2 - r4
            long r4 = defpackage.aczp.c     // Catch: java.lang.Throwable -> Lc5
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L37
        L32:
            java.util.Map r2 = r8.l     // Catch: java.lang.Throwable -> Lc5
            r2.clear()     // Catch: java.lang.Throwable -> Lc5
        L37:
            java.util.Map r2 = r8.l     // Catch: java.lang.Throwable -> Lc5
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> Lc5
            if (r2 != 0) goto L5c
            java.util.Map r2 = r8.l     // Catch: java.lang.Throwable -> Lc5
            r9.putAll(r2)     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r2 = "mdx_seconds_since_session_cached"
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> Lc5
            shf r4 = r8.f     // Catch: java.lang.Throwable -> Lc5
            long r4 = r4.c()     // Catch: java.lang.Throwable -> Lc5
            long r6 = r8.m     // Catch: java.lang.Throwable -> Lc5
            long r4 = r4 - r6
            long r3 = r3.toSeconds(r4)     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> Lc5
            r9.put(r2, r3)     // Catch: java.lang.Throwable -> Lc5
        L5c:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc5
            if (r0 == 0) goto L62
            e(r9, r0)
        L62:
            boolean r0 = r8.j
            if (r0 == 0) goto L8c
            addy r0 = r8.i
            adei r0 = r0.e
            if (r0 != 0) goto L78
            java.lang.String r0 = "selected_media_route_type"
            r1 = 0
            r9.put(r0, r1)
            java.lang.String r0 = "selected_media_route_name"
            r9.put(r0, r1)
            goto L8c
        L78:
            java.lang.String r1 = "selected_media_route_type"
            int r2 = r0.a()
            java.lang.String r2 = defpackage.adyu.bY(r2)
            r9.put(r1, r2)
            java.lang.String r1 = "selected_media_route_name"
            java.lang.String r0 = r0.a
            r9.put(r1, r0)
        L8c:
            adgc r0 = defpackage.adge.a()
            adtp r1 = r8.g
            anhy r1 = r1.a(r0)
            aczm r2 = new aczm
            r2.<init>()
            defpackage.ynm.i(r1, r2)
            java.util.Set r0 = r9.keySet()
            java.util.Iterator r0 = r0.iterator()
        La6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lbc
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r9.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            r10.putString(r1, r2)
            goto La6
        Lbc:
            shf r9 = r8.f
            long r9 = r9.c()
            r8.m = r9
            return
        Lc5:
            r9 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc5
            goto Lc9
        Lc8:
            throw r9
        Lc9:
            goto Lc8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aczp.a(java.lang.String, android.os.Bundle):void");
    }

    @Override // defpackage.akrj
    public final void b(Bundle bundle) {
        adlm g = this.e.g();
        if (g == null || !(g.k() instanceof adfu)) {
            return;
        }
        CastDevice castDevice = ((adfu) g.k()).a;
        aczl aczlVar = (aczl) this.h.get();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        final aczn acznVar = new aczn(bundle, countDownLatch);
        InetAddress inetAddress = castDevice.c;
        Inet4Address inet4Address = (inetAddress == null || !(inetAddress instanceof Inet4Address)) ? null : (Inet4Address) inetAddress;
        if (inet4Address != null) {
            String uuid = UUID.randomUUID().toString();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("uuid", uuid);
                aczlVar.b.a(new yvm(String.format(Locale.US, "http://%s:%d/%s", inet4Address.getHostAddress(), 8008, "setup/send_log_report"), jSONObject, new cnl() { // from class: aczk
                    @Override // defpackage.cnl
                    public final void kZ(Object obj) {
                        String str;
                        aczn acznVar2 = aczn.this;
                        JSONObject jSONObject2 = (JSONObject) obj;
                        String str2 = aczl.a;
                        try {
                            str = jSONObject2.getString("crash_report_id");
                        } catch (JSONException e) {
                            zga.f(aczl.a, "Failed extracting crash report id from response", e);
                            str = null;
                        }
                        acznVar2.a(str);
                    }
                }, new cnk() { // from class: aczj
                    @Override // defpackage.cnk
                    public final void kY(cnq cnqVar) {
                        aczn acznVar2 = aczn.this;
                        String str = aczl.a;
                        String valueOf = String.valueOf(cnqVar.getMessage());
                        zga.c(str, valueOf.length() != 0 ? "Failed getting crash report id: ".concat(valueOf) : new String("Failed getting crash report id: "));
                        acznVar2.a(null);
                    }
                }, true));
            } catch (JSONException e) {
                zga.f(aczl.a, "Failed creating json object", e);
                acznVar.a(null);
            }
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e2) {
            zga.f(d, "Failed filling casting crash report id", e2);
        }
    }

    public final void c(adlm adlmVar) {
        HashMap hashMap = new HashMap();
        e(hashMap, adlmVar);
        if (hashMap.isEmpty()) {
            return;
        }
        synchronized (this.k) {
            this.l = hashMap;
        }
        this.m = this.f.c();
    }

    @Override // defpackage.aczq
    public final void d() {
        adlm g = this.e.g();
        if (g != null) {
            c(g);
        }
        this.e.i(this.n);
    }
}
