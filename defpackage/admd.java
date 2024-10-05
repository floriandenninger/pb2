package defpackage;

import j$.time.Duration;
import j$.util.Optional;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class admd extends adkt {
    public static final String a = zga.a("MDX.ShortLivedLoungeTokenProvider");
    public final admf b;
    public final Duration c;
    public adgm d;
    public Optional e;
    public int f;
    private final ScheduledExecutorService g;
    private final aksl h;
    private final adgg i;
    private final String j;
    private anhy k;
    private int l;

    public admd(adgm adgmVar, admf admfVar, ScheduledExecutorService scheduledExecutorService, aksl akslVar, adgg adggVar, int i, String str) {
        super(adgmVar);
        this.e = Optional.empty();
        this.d = adgmVar;
        this.b = admfVar;
        this.g = scheduledExecutorService;
        this.h = akslVar;
        this.i = adggVar;
        this.c = Duration.ofSeconds(i);
        this.j = str;
        this.l = 0;
        this.f = 0;
    }

    private final String i() {
        if (!this.e.isPresent()) {
            return "NONE";
        }
        adme admeVar = adme.APP_NOT_RUNNING;
        int ordinal = ((adme) this.e.get()).ordinal();
        return ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? "NONE" : "NO_LOUNGE_TOKEN_RESPONSE" : "STALE_LOUNGE_TOKEN" : "MISSING_LOUNGE_TOKEN" : "DIAL_HTTP_ERROR" : "APP_NOT_RUNNING";
    }

    @Override // defpackage.adkt
    public final adft a() {
        return this.d;
    }

    @Override // defpackage.adkt
    public final void b() {
        String str = 1 != this.l ? "CONNECTING" : "CONNECTED";
        Optional g = g();
        if (g.isPresent()) {
            ((viz) this.h.r.get()).b((String) g.get(), str, i(), Integer.valueOf(this.f));
            String format = String.format("Failed to refresh MDx LoungeToken and received 401 Error. error_type: %s, previous_connection_state: %s, refreshed_token_count: %s, pairing_type: %s, short_lived_lounge_token_id: %s, mdx_session_nonce: %s", i(), str, Integer.valueOf(this.f), g.get(), this.d.c, this.j);
            zga.c(a, format);
            afsi.b(2, 21, format);
        }
    }

    @Override // defpackage.adkt
    public final void c() {
        Optional g = g();
        if (g.isPresent()) {
            ((viz) this.h.s.get()).b((String) g.get());
            String str = (String) g.get();
            if (str.length() != 0) {
                "MDx session started with a short lived lounge token for session type ".concat(str);
            }
        }
    }

    @Override // defpackage.adkt
    public final void d() {
        h(this.d.b.toMillis());
    }

    @Override // defpackage.adkt
    public final void e() {
        anhy anhyVar = this.k;
        if (anhyVar != null) {
            anhyVar.cancel(true);
        }
    }

    @Override // defpackage.adkt
    public final void f() {
        this.l = 1;
    }

    public final Optional g() {
        adme admeVar = adme.APP_NOT_RUNNING;
        int i = this.i.b - 1;
        if (i == 1) {
            return Optional.of("DIAL_SMOOTH_PAIRING");
        }
        if (i == 2) {
            return Optional.of("DIAL_CODE_PAIRING");
        }
        if (i == 3) {
            return Optional.of("CAST");
        }
        return Optional.empty();
    }

    public final void h(long j) {
        zga.h(a, String.format("Starting a poll for a new short lived lounge token in %s ms.", Long.valueOf(this.d.b.toMillis())));
        this.k = anaf.Q(new anfy() { // from class: admb
            @Override // defpackage.anfy
            public final anhy a() {
                admd admdVar = admd.this;
                admdVar.b.a(new admc(admdVar));
                return anhv.a;
            }
        }, j, TimeUnit.MILLISECONDS, this.g);
    }
}
