package defpackage;

import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adne implements acws {
    private static final String a = zga.a("MDX.CastSdkClientAdapter");
    private final axpg b;
    private final axpg c;
    private final axpg d;
    private final acxd e;
    private final axpg f;
    private final adyu g;

    public adne(axpg axpgVar, axpg axpgVar2, axpg axpgVar3, adyu adyuVar, acxd acxdVar, axpg axpgVar4, byte[] bArr, byte[] bArr2) {
        this.b = axpgVar;
        this.c = axpgVar2;
        this.d = axpgVar3;
        this.g = adyuVar;
        this.e = acxdVar;
        this.f = axpgVar4;
    }

    private final Optional d() {
        adot adotVar = ((adpe) this.b.get()).d;
        if (!(adotVar instanceof adms)) {
            return Optional.empty();
        }
        return Optional.of(((adms) adotVar).f());
    }

    @Override // defpackage.acws
    public final Optional a(qfy qfyVar) {
        final acsx acszVar;
        CastDevice b = qfyVar.b();
        if (b == null) {
            zga.m(a, "Cast device should not be null if the session is resumed, this is possibly a bug with SDK callback.");
            return Optional.empty();
        }
        adot adotVar = ((adpe) this.b.get()).d;
        if (adotVar != null) {
            int i = adotVar.o().i;
            if (i == 0) {
                throw null;
            }
            if (i != 2 || !((adfu) adotVar.k()).f().c.equals(b.b())) {
                zga.h(a, "SDK resumed session does not match existing MDx session, ignoring reconnection attempt.");
                this.e.a(atbh.MDX_SESSION_CAST_EVENT_TYPE_RECONNECT_MISMATCH);
                return Optional.empty();
            }
            if (adotVar.a() == 1) {
                zga.h(a, "SDK session resumed while MDx session is still active, skipping reconnection attempt.");
                this.e.a(atbh.MDX_SESSION_CAST_EVENT_TYPE_RECONNECT_SKIPPED);
                return Optional.empty();
            }
            if (adotVar.a() == 0) {
                zga.h(a, "SDK session resumed as matching MDx session is still connecting, attempt to continue connection flow normally.");
                return d();
            }
        }
        final adpe adpeVar = (adpe) this.b.get();
        final adfu a2 = adfu.a(b);
        zga.h(adpe.a, String.format("connectAndPlay to screen %s", a2.c()));
        final acsx b2 = ((acsy) adpeVar.e.get()).b(asmn.LATENCY_ACTION_MDX_LAUNCH);
        adpeVar.f = b2;
        if (adpeVar.i.z) {
            acszVar = ((acsy) adpeVar.e.get()).b(asmn.LATENCY_ACTION_MDX_CAST);
        } else {
            acszVar = new acsz();
        }
        ynm.k(((adov) adpeVar.h.get()).a(), angq.a, new ynk() { // from class: adpa
            @Override // defpackage.zfi
            /* renamed from: b */
            public final void a(Throwable th) {
                adpe.this.p(a2, acszVar, b2, Optional.empty());
            }
        }, new ynl() { // from class: adpb
            @Override // defpackage.ynl, defpackage.zfi
            public final void a(Object obj) {
                adpe.this.p(a2, acszVar, b2, (Optional) obj);
            }
        });
        return d();
    }

    @Override // defpackage.acws
    public final Optional b(CastDevice castDevice) {
        if (castDevice == null) {
            return Optional.empty();
        }
        ((adpe) this.b.get()).r(adfu.a(castDevice), ((adij) this.d.get()).c(this.g.a()));
        return d();
    }

    @Override // defpackage.acws
    public final void c(String str, Optional optional) {
        adpe adpeVar = (adpe) this.b.get();
        adcz a2 = adcz.a().a();
        if (!TextUtils.isEmpty(str)) {
            a2 = ((adda) this.c.get()).a(str);
        }
        if (optional.isPresent() && ((adcq) this.f.get()).b()) {
            int intValue = ((Integer) optional.get()).intValue();
            if (intValue == 2154) {
                adcy a3 = adcz.a();
                a3.b(true);
                a2 = a3.a();
            } else if (intValue == 2155) {
                adcy a4 = adcz.a();
                a4.b(true);
                a4.c(aibu.SEAMLESS);
                a2 = a4.a();
            }
        }
        adpeVar.b(a2, optional);
    }
}
