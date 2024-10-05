package defpackage;

import android.os.Looper;
import android.text.TextUtils;
import com.google.android.libraries.youtube.mdx.model.ScreenId;
import com.google.android.libraries.youtube.mdx.remote.internal.MdxSessionFactory;
import j$.time.Duration;
import j$.util.Optional;
import java.util.concurrent.ScheduledFuture;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class admr implements acwt {
    public final /* synthetic */ adms a;

    public admr(adms admsVar) {
        this.a = admsVar;
    }

    @Override // defpackage.acwt
    public final void a(int i) {
        this.a.aP(adms.ao(i, atbi.MDX_SESSION_DISCONNECT_REASON_CAST_SDK_DISCONNECTED), Optional.of(Integer.valueOf(i)));
    }

    @Override // defpackage.acwt
    public final void b(qfy qfyVar) {
        adms admsVar = this.a;
        if (admsVar.k) {
            return;
        }
        admsVar.j = qfyVar.c();
        this.a.i = qfyVar;
        e("getMdxSessionStatus");
    }

    @Override // defpackage.acwt
    public final void c(int i) {
        if (this.a.an.av && acxe.a.contains(Integer.valueOf(i))) {
            adms admsVar = this.a;
            adkv adkvVar = admsVar.n;
            String c = admsVar.m.c();
            ci ciVar = adkvVar.c;
            if (ciVar != null) {
                adku.aF(i, c).qh(ciVar.getSupportFragmentManager(), adku.class.getCanonicalName());
            }
        }
        a(i);
    }

    @Override // defpackage.acwt
    public final void d(String str) {
        long j;
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("type");
            String str2 = "";
            if (!TextUtils.equals(string, "mdxSessionStatus")) {
                if (TextUtils.equals(string, "loungeToken")) {
                    try {
                        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                        str2 = jSONObject2.optString("loungeToken", "");
                        j = jSONObject2.optLong("loungeTokenRefreshIntervalMs", -1L);
                    } catch (JSONException e) {
                        String valueOf = String.valueOf(jSONObject);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
                        sb.append("Cannot parse incoming LoungeToken Cast message: ");
                        sb.append(valueOf);
                        String sb2 = sb.toString();
                        afsi.c(2, 21, sb2, e);
                        zga.o(adms.a, sb2, e);
                        j = -1;
                    }
                    Optional empty = Optional.empty();
                    if (!TextUtils.isEmpty(str2) && j != -1) {
                        empty = Optional.of(new adgm(str2, 3, Duration.ofMillis(j)));
                        zga.h(adms.a, String.format("Received valid LoungeToken from incoming LoungeToken message: %s, refresh interval: %s", empty.get(), ((adgm) empty.get()).b));
                    }
                    for (acwx acwxVar : this.a.l) {
                        ScheduledFuture scheduledFuture = acwxVar.a.c;
                        if (scheduledFuture != null) {
                            scheduledFuture.cancel(true);
                        }
                        if (acwxVar.a.e == null) {
                            zga.c(acwy.a, "ShortLivedLoungeToken Response callback null when receiving LoungeToken message from Cast SDK.");
                        } else if (empty.isPresent()) {
                            zga.h(acwy.a, String.format("SUCCESS! Got new lounge token for Cast screen %s: %s, refresh interval: %s", acwxVar.a.b.c(), empty.get(), ((adgm) empty.get()).b));
                            acwxVar.a.e.b((adgm) empty.get());
                        } else {
                            zga.m(acwy.a, String.format("No proper Short Lived Lounge Token found in LoungeToken message from Cast SDK for screen %s.", acwxVar.a.b.c()));
                            acwxVar.a.e.a(adme.MISSING_LOUNGE_TOKEN);
                        }
                    }
                    return;
                }
                return;
            }
            if (this.a.k) {
                return;
            }
            try {
                JSONObject jSONObject3 = jSONObject.getJSONObject("data");
                String string2 = jSONObject3.getString("screenId");
                String string3 = jSONObject3.getString("deviceId");
                String optString = jSONObject3.optString("loungeToken", "");
                long optLong = jSONObject3.optLong("loungeTokenRefreshIntervalMs", -1L);
                this.a.ao.e(9);
                String valueOf2 = String.valueOf(string2);
                if (valueOf2.length() != 0) {
                    "Connected to Cast screen. Initiating cloud connection to ".concat(valueOf2);
                }
                adfv f = adfw.f();
                f.c(new ScreenId(string2));
                f.b(new adfs(string3));
                f.e(this.a.m.c());
                f.c = new adgg(4);
                if (!TextUtils.isEmpty(optString) && optLong != -1) {
                    f.d(new adgm(optString, 3, Duration.ofMillis(optLong)));
                }
                adms admsVar = this.a;
                MdxSessionFactory mdxSessionFactory = admsVar.b;
                adfw a = f.a();
                adpf aM = this.a.aM();
                adms admsVar2 = this.a;
                adln adlnVar = admsVar2.ao;
                acsx acsxVar = admsVar2.c;
                acsx acsxVar2 = admsVar2.d;
                int i = admsVar2.aq.h;
                Optional.of(admsVar2.aq.g);
                adms admsVar3 = this.a;
                admsVar.aR(mdxSessionFactory.h(a, aM, adlnVar, admsVar2, acsxVar, acsxVar2, new acwy(admsVar3.m, this, admsVar3.an.af, admsVar3.h)));
                this.a.k = true;
            } catch (JSONException e2) {
                String valueOf3 = String.valueOf(jSONObject);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 53);
                sb3.append("Cannot parse incoming MdxSessionStatus Cast message: ");
                sb3.append(valueOf3);
                String sb4 = sb3.toString();
                afsi.c(2, 21, sb4, e2);
                zga.o(adms.a, sb4, e2);
                this.a.as();
            }
        } catch (JSONException e3) {
            String valueOf4 = String.valueOf(str);
            String concat = valueOf4.length() != 0 ? "Cannot parse incoming Cast message: ".concat(valueOf4) : new String("Cannot parse incoming Cast message: ");
            afsi.c(2, 21, concat, e3);
            zga.o(adms.a, concat, e3);
            this.a.as();
        }
    }

    public final void e(String str) {
        if (this.a.i == null) {
            return;
        }
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", str);
            zga.h(adms.a, str.length() != 0 ? "Sending outgoing Cast local channel message: ".concat(str) : new String("Sending outgoing Cast local channel message: "));
            if (Looper.myLooper() == Looper.getMainLooper()) {
                adms admsVar = this.a;
                admsVar.i.k(admsVar.f, jSONObject.toString());
            } else {
                this.a.g.post(new Runnable() { // from class: admq
                    @Override // java.lang.Runnable
                    public final void run() {
                        admr admrVar = admr.this;
                        JSONObject jSONObject2 = jSONObject;
                        adms admsVar2 = admrVar.a;
                        admsVar2.i.k(admsVar2.f, jSONObject2.toString());
                    }
                });
            }
        } catch (JSONException e) {
            String concat = str.length() != 0 ? "Could not create outgoing Cast local channel message: ".concat(str) : new String("Could not create outgoing Cast local channel message: ");
            afsi.c(2, 21, concat, e);
            zga.f(adms.a, concat, e);
        }
    }
}
