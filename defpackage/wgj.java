package defpackage;

import com.google.android.libraries.youtube.account.identity.AccountIdentity;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wgj {
    public final wgg a;
    private final Executor b;

    public wgj(wgg wggVar, Executor executor) {
        this.a = wggVar;
        this.b = executor;
    }

    public final void a(final String str, final AccountIdentity accountIdentity, final wgi wgiVar) {
        this.b.execute(new Runnable() { // from class: wgh
            /* JADX WARN: Code restructure failed: missing block: B:32:0x007c, code lost:
            
                if ("INVALID_GRANT".equals(new org.json.JSONObject(new java.lang.String(r2.b)).getJSONObject("error").getString("message")) != false) goto L22;
             */
            /* JADX WARN: Removed duplicated region for block: B:14:0x008e  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0084  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    r12 = this;
                    wgj r0 = defpackage.wgj.this
                    wgi r1 = r2
                    java.lang.String r4 = r3
                    com.google.android.libraries.youtube.account.identity.AccountIdentity r5 = r4
                    r1.j()
                    wgg r0 = r0.a
                    r5.d()
                    cnt r10 = defpackage.cnt.c()
                    wgk r11 = new wgk
                    android.content.Context r3 = r0.a
                    wco r6 = r0.b
                    zfm r7 = r0.c
                    r2 = r11
                    r8 = r10
                    r9 = r10
                    r2.<init>(r3, r4, r5, r6, r7, r8, r9)
                    ysl r0 = r0.d
                    r0.a(r11)
                    r0 = 2
                    r2 = 5
                    r3 = 1
                    r4 = 3
                    java.lang.Object r5 = r10.get()     // Catch: java.lang.InterruptedException -> L43 java.util.concurrent.ExecutionException -> L45
                    org.json.JSONObject r5 = (org.json.JSONObject) r5     // Catch: java.lang.InterruptedException -> L43 java.util.concurrent.ExecutionException -> L45
                    if (r5 != 0) goto L35
                L33:
                    r0 = 5
                    goto L80
                L35:
                    java.lang.String r4 = "encodedRapt"
                    java.lang.String r4 = r5.getString(r4)     // Catch: org.json.JSONException -> L33
                    boolean r2 = android.text.TextUtils.isEmpty(r4)     // Catch: org.json.JSONException -> L33
                    if (r3 == r2) goto L80
                    r0 = 1
                    goto L80
                L43:
                    r2 = move-exception
                    goto L46
                L45:
                    r2 = move-exception
                L46:
                    java.lang.Throwable r5 = r2.getCause()
                    boolean r5 = r5 instanceof defpackage.cno
                    if (r5 == 0) goto L7f
                    java.lang.Throwable r2 = r2.getCause()
                    cno r2 = (defpackage.cno) r2
                    cnh r2 = r2.b
                    if (r2 == 0) goto L7f
                    int r5 = r2.a
                    r6 = 400(0x190, float:5.6E-43)
                    if (r5 != r6) goto L7f
                    org.json.JSONObject r5 = new org.json.JSONObject     // Catch: org.json.JSONException -> L7f
                    java.lang.String r6 = new java.lang.String     // Catch: org.json.JSONException -> L7f
                    byte[] r2 = r2.b     // Catch: org.json.JSONException -> L7f
                    r6.<init>(r2)     // Catch: org.json.JSONException -> L7f
                    r5.<init>(r6)     // Catch: org.json.JSONException -> L7f
                    java.lang.String r2 = "INVALID_GRANT"
                    java.lang.String r6 = "error"
                    org.json.JSONObject r5 = r5.getJSONObject(r6)     // Catch: org.json.JSONException -> L7f
                    java.lang.String r6 = "message"
                    java.lang.String r5 = r5.getString(r6)     // Catch: org.json.JSONException -> L7f
                    boolean r2 = r2.equals(r5)     // Catch: org.json.JSONException -> L7f
                    if (r2 == 0) goto L7f
                    goto L80
                L7f:
                    r0 = 3
                L80:
                    int r0 = r0 + (-1)
                    if (r0 == 0) goto L8e
                    if (r0 == r3) goto L8a
                    r1.g()
                    return
                L8a:
                    r1.h()
                    return
                L8e:
                    r1.k()
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.wgh.run():void");
            }
        });
    }
}
