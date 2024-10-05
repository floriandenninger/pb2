package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anza {
    public final Map a = new adz();
    private final Executor b;

    public anza(Executor executor, byte[] bArr) {
        this.b = executor;
    }

    public final synchronized rpt a(final String str, anyo anyoVar) {
        rpt rptVar = (rpt) this.a.get(str);
        if (rptVar != null) {
            return rptVar;
        }
        final FirebaseMessaging firebaseMessaging = anyoVar.a;
        final String str2 = anyoVar.b;
        final anzf anzfVar = anyoVar.c;
        anys anysVar = firebaseMessaging.e;
        rpt c = anys.b(anysVar.a(anyw.e(anysVar.a), "*", new Bundle())).e(qmq.k, new rps() { // from class: anyl
            @Override // defpackage.rps
            public final rpt a(Object obj) {
                FirebaseMessaging firebaseMessaging2 = FirebaseMessaging.this;
                String str3 = str2;
                anzf anzfVar2 = anzfVar;
                String str4 = (String) obj;
                FirebaseMessaging.c(firebaseMessaging2.d).c(firebaseMessaging2.e(), str3, str4, firebaseMessaging2.g.c());
                if (anzfVar2 == null || !str4.equals(anzfVar2.b)) {
                    firebaseMessaging2.f(str4);
                }
                return rqr.c(str4);
            }
        }).c(this.b, new rox() { // from class: anyz
            @Override // defpackage.rox
            public final Object a(rpt rptVar2) {
                anza anzaVar = anza.this;
                String str3 = str;
                synchronized (anzaVar) {
                    anzaVar.a.remove(str3);
                }
                return rptVar2;
            }
        });
        this.a.put(str, c);
        return c;
    }

    public final synchronized rpt b(String str, String str2, anwn anwnVar) {
        int a;
        final Pair pair = new Pair(str, str2);
        rpt rptVar = (rpt) this.a.get(pair);
        if (rptVar != null) {
            return rptVar;
        }
        final FirebaseInstanceId firebaseInstanceId = anwnVar.a;
        String str3 = anwnVar.b;
        final String str4 = anwnVar.c;
        final String str5 = anwnVar.d;
        final anwt anwtVar = anwnVar.e;
        anwo anwoVar = firebaseInstanceId.f;
        Bundle bundle = new Bundle();
        bundle.putString("scope", str5);
        bundle.putString("sender", str4);
        bundle.putString("subtype", str4);
        bundle.putString("appid", str3);
        bundle.putString("gmp_app_id", anwoVar.a.e().b);
        bundle.putString("gmsv", Integer.toString(anwoVar.b.a()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", anwoVar.b.c());
        bundle.putString("app_ver_name", anwoVar.b.d());
        bundle.putString("firebase-app-name-hash", anwoVar.a());
        try {
            String str6 = ((anxj) rqr.d(anwoVar.f.l())).a;
            if (!TextUtils.isEmpty(str6)) {
                bundle.putString("Goog-Firebase-Installations-Auth", str6);
            } else {
                Log.w("FirebaseInstanceId", "FIS auth token is empty");
            }
        } catch (InterruptedException | ExecutionException e) {
            Log.e("FirebaseInstanceId", "Failed to get FIS auth token", e);
        }
        bundle.putString("cliv", "fiid-21.1.1");
        anwg anwgVar = (anwg) anwoVar.e.a();
        aoag aoagVar = (aoag) anwoVar.d.a();
        if (anwgVar != null && aoagVar != null && (a = anwgVar.a("fire-iid")) != 1) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(aocz.ac(a)));
            bundle.putString("Firebase-Client", aoagVar.a());
        }
        rpt e2 = anwoVar.c.b(bundle).b(anwi.a, new qxc(3)).e(firebaseInstanceId.c, new rps() { // from class: anwm
            @Override // defpackage.rps
            public final rpt a(Object obj) {
                FirebaseInstanceId firebaseInstanceId2 = FirebaseInstanceId.this;
                String str7 = (String) obj;
                FirebaseInstanceId.a.c(firebaseInstanceId2.d(), str4, str5, str7, firebaseInstanceId2.e.c());
                return rqr.c(new ammr(str7, (char[]) null, (byte[]) null));
            }
        });
        e2.p(qmq.h, new rpo() { // from class: anwl
            @Override // defpackage.rpo
            public final void d(Object obj) {
                FirebaseInstanceId firebaseInstanceId2 = FirebaseInstanceId.this;
                anwt anwtVar2 = anwtVar;
                String str7 = ((ammr) obj).b;
                if (anwtVar2 == null || !str7.equals(anwtVar2.b)) {
                    Iterator it = firebaseInstanceId2.h.iterator();
                    while (it.hasNext()) {
                        ((anyn) it.next()).a.f(str7);
                    }
                }
            }
        });
        final byte[] bArr = null;
        rpt c = e2.c(this.b, new rox(pair, bArr) { // from class: anwr
            public final /* synthetic */ Pair a;

            @Override // defpackage.rox
            public final Object a(rpt rptVar2) {
                anza anzaVar = anza.this;
                Pair pair2 = this.a;
                synchronized (anzaVar) {
                    anzaVar.a.remove(pair2);
                }
                return rptVar2;
            }
        });
        this.a.put(pair, c);
        return c;
    }

    public anza(Executor executor) {
        this.b = executor;
    }
}
