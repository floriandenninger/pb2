package defpackage;

import android.content.Context;
import android.util.Pair;
import com.google.android.libraries.youtube.account.identity.AccountIdentity;
import com.google.android.youtube.R;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wgk extends yvm implements cnn {
    private static final zfn a = new zfn(100, 10000, 3);
    private final Context b;
    private Map c;
    private final AccountIdentity k;
    private final wco l;
    private final zfo m;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public wgk(android.content.Context r5, java.lang.String r6, com.google.android.libraries.youtube.account.identity.AccountIdentity r7, defpackage.wco r8, defpackage.zfm r9, defpackage.cnl r10, defpackage.cnk r11) {
        /*
            r4 = this;
            java.lang.String r0 = "https://www.googleapis.com/reauth/v1beta/users/%user_id%/reauthProofTokens"
            java.lang.String r1 = "%user_id%"
            java.lang.String r2 = "me"
            java.lang.String r0 = r0.replace(r1, r2)
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r2 = "credentialType"
            java.lang.String r3 = "password"
            r1.put(r2, r3)     // Catch: org.json.JSONException -> L38
            java.lang.String r2 = "credential"
            r1.put(r2, r6)     // Catch: org.json.JSONException -> L38
            r4.<init>(r0, r1, r10, r11)
            r4.b = r5
            r7.getClass()
            r4.k = r7
            r8.getClass()
            r4.l = r8
            r9.getClass()
            zfn r5 = defpackage.wgk.a
            zfo r5 = r9.b(r5)
            r4.m = r5
            r4.f = r4
            return
        L38:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            java.lang.String r6 = "Error while creating password verification request"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wgk.<init>(android.content.Context, java.lang.String, com.google.android.libraries.youtube.account.identity.AccountIdentity, wco, zfm, cnl, cnk):void");
    }

    @Override // defpackage.cnn
    public final int a() {
        return (int) this.m.a;
    }

    @Override // defpackage.cnn
    public final int b() {
        return (int) this.m.a();
    }

    @Override // defpackage.cnn
    public final void c(cnq cnqVar) {
        boolean z = cnqVar instanceof cnb;
        if (z || yny.c(cnqVar)) {
            if (!this.m.b()) {
                throw cnqVar;
            }
            if (z) {
                if (a() <= 1) {
                    if (this.k.g()) {
                        return;
                    }
                    this.c = null;
                    this.l.h(this.k);
                    return;
                }
                throw cnqVar;
            }
            return;
        }
        throw cnqVar;
    }

    @Override // defpackage.yvo
    public final Map f() {
        if (this.c == null) {
            HashMap hashMap = new HashMap();
            this.c = hashMap;
            hashMap.put("Content-Type", "application/json");
            aftg d = this.l.d(this.k);
            if (!d.g()) {
                if (d.f()) {
                    throw new cnb(d.a());
                }
                Exception d2 = d.d();
                if (d2 instanceof IOException) {
                    throw new cnb(this.b.getString(R.string.common_error_connection), d2);
                }
                throw new cnb();
            }
            Pair b = d.b();
            this.c.put((String) b.first, (String) b.second);
        }
        return this.c;
    }

    @Override // defpackage.yvo
    public final yvn i() {
        return yvn.HIGH;
    }
}
