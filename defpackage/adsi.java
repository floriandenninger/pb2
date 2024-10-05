package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import com.google.android.libraries.youtube.mdx.model.AppStatus;
import com.google.android.libraries.youtube.mdx.model.AutoValue_AppStatus;
import com.google.android.youtube.R;
import j$.util.Optional;
import java.util.Map;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adsi {
    private static final String f = zga.a("MDX.PassiveAuthCodeRetriever");
    public final acyg a;
    public final shf b;
    public final AtomicBoolean c = new AtomicBoolean(true);
    public final AtomicLong d = new AtomicLong(0);
    public anhy e;
    private final ScheduledExecutorService g;

    public adsi(acyg acygVar, shf shfVar, ScheduledExecutorService scheduledExecutorService) {
        this.a = acygVar;
        this.b = shfVar;
        this.g = scheduledExecutorService;
    }

    public final anhy a(final adsh adshVar, long j) {
        try {
            anhy Q = anaf.Q(new anfy() { // from class: adsg
                @Override // defpackage.anfy
                public final anhy a() {
                    Optional empty;
                    Map map;
                    adsi adsiVar = adsi.this;
                    adsh adshVar2 = adshVar;
                    if (adsiVar.b.c() >= adsiVar.d.get() + TimeUnit.SECONDS.toMillis(10L)) {
                        adsiVar.b(adshVar2);
                        return anaf.O(false);
                    }
                    if (!adsiVar.c.get()) {
                        adgb adgbVar = adshVar2.a;
                        adfy adfyVar = (adfy) adgbVar;
                        acyg acygVar = adsiVar.a;
                        Uri uri = adfyVar.b;
                        uri.getClass();
                        AppStatus a = acygVar.a(uri, adfyVar.n());
                        if (a == null || (map = ((AutoValue_AppStatus) a).d) == null) {
                            String.format("No additional data found for screen [%s].", adgbVar.c());
                            empty = Optional.empty();
                        } else {
                            String str = (String) map.get("passiveAuthCode");
                            String str2 = (String) map.get("authCode");
                            if (str == null || TextUtils.isEmpty(str)) {
                                if (str2 == null || TextUtils.isEmpty(str2)) {
                                    String.format("No auth code found in additional data for screen [%s].", adgbVar.c());
                                    empty = Optional.empty();
                                } else {
                                    empty = Optional.of(str2);
                                }
                            } else {
                                empty = Optional.of(str);
                            }
                        }
                        if (empty.isPresent()) {
                            final adsa adsaVar = adshVar2.b;
                            final String str3 = (String) empty.get();
                            Handler handler = adsaVar.c.f;
                            final adsv adsvVar = adsaVar.a;
                            final String str4 = adsaVar.b;
                            handler.post(new Runnable() { // from class: adrz
                                @Override // java.lang.Runnable
                                public final void run() {
                                    adsa adsaVar2 = adsa.this;
                                    adsv adsvVar2 = adsvVar;
                                    String str5 = str3;
                                    String str6 = str4;
                                    adsvVar2.f = str5;
                                    adsaVar2.c.a.l(adsvVar2, str6);
                                    adsaVar2.c.b(false);
                                }
                            });
                            adsiVar.c();
                            return anaf.O(true);
                        }
                        return adsiVar.a(adshVar2, 100L);
                    }
                    adsiVar.b(adshVar2);
                    return anaf.O(false);
                }
            }, j, TimeUnit.MILLISECONDS, this.g);
            this.e = Q;
            return Q;
        } catch (RejectedExecutionException unused) {
            zga.c(f, "Could not schedule an app status check.");
            b(adshVar);
            return anaf.O(false);
        }
    }

    public final void b(adsh adshVar) {
        zga.m(f, "Failed to get auth code.");
        final adsa adsaVar = adshVar.b;
        adsaVar.c.f.post(new Runnable() { // from class: adry
            @Override // java.lang.Runnable
            public final void run() {
                adsa adsaVar2 = adsa.this;
                adsaVar2.c.b(true);
                adti adtiVar = adsaVar2.c.k;
                adtiVar.b(adtiVar.a.getString(R.string.passive_auth_code_time_out), acrb.MDX_TV_SIGN_IN_SNACKBAR_ERROR);
            }
        });
        c();
    }

    public final void c() {
        this.c.set(true);
        this.d.set(0L);
        this.e = null;
    }
}
