package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.player.TrackingUrlModel;
import com.google.android.libraries.youtube.player.stats.attestation.AttestationClient$AttestationClientState;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aiqy {
    public final Executor a;
    public final atxz b;
    public final TrackingUrlModel c;
    public final String d;
    public final int e;
    public final ysy f;
    public final afrw g;
    public final aqjd h;
    public volatile boolean i;
    private final afuh j;
    private final qtv k;
    private final afsy l;
    private final zhy m;
    private final zhy n;
    private boolean o;

    public aiqy(afuh afuhVar, Executor executor, qtv qtvVar, afsy afsyVar, ysy ysyVar, afrw afrwVar, aadw aadwVar, AttestationClient$AttestationClientState attestationClient$AttestationClientState) {
        this(afuhVar, executor, qtvVar, afsyVar, ysyVar, afrwVar, aadwVar, attestationClient$AttestationClientState.a, attestationClient$AttestationClientState.b, attestationClient$AttestationClientState.c, attestationClient$AttestationClientState.d);
        this.i = attestationClient$AttestationClientState.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static aqjd e(aadw aadwVar) {
        apwy b = aadwVar.b();
        if (b == null) {
            return null;
        }
        atej atejVar = b.k;
        if (atejVar == null) {
            atejVar = atej.a;
        }
        if ((atejVar.c & 131072) == 0) {
            return null;
        }
        atej atejVar2 = b.k;
        if (atejVar2 == null) {
            atejVar2 = atej.a;
        }
        aqjd aqjdVar = atejVar2.z;
        return aqjdVar == null ? aqjd.a : aqjdVar;
    }

    private final boolean f(String str) {
        return this.m.d(str) != null;
    }

    public final String a(String str) {
        return this.m.d(str);
    }

    public final void b() {
        if (this.i) {
            return;
        }
        this.i = true;
        final afsx c = this.l.c();
        final String g = this.l.g();
        final boolean g2 = c.g();
        this.a.execute(new Runnable() { // from class: aiqx
            @Override // java.lang.Runnable
            public final void run() {
                aiqy aiqyVar = aiqy.this;
                afsx afsxVar = c;
                String str = g;
                boolean z = g2;
                aqjd aqjdVar = aiqyVar.h;
                if (aqjdVar == null || !aqjdVar.c || aiqyVar.f.o()) {
                    aiqyVar.c(afsxVar);
                    return;
                }
                String a = aiqyVar.a("e");
                if (a == null) {
                    return;
                }
                aone createBuilder = apge.a.createBuilder();
                aone createBuilder2 = apgd.a.createBuilder();
                String str2 = aiqyVar.d;
                createBuilder2.copyOnWrite();
                apgd apgdVar = (apgd) createBuilder2.instance;
                apgdVar.b |= 2;
                apgdVar.d = str2;
                createBuilder2.copyOnWrite();
                apgd apgdVar2 = (apgd) createBuilder2.instance;
                apgdVar2.b |= 1;
                apgdVar2.c = a;
                createBuilder.copyOnWrite();
                apge apgeVar = (apge) createBuilder.instance;
                apgd apgdVar3 = (apgd) createBuilder2.build();
                apgdVar3.getClass();
                apgeVar.c = apgdVar3;
                apgeVar.b = 1;
                apge apgeVar2 = (apge) createBuilder.build();
                afrw afrwVar = aiqyVar.g;
                aone createBuilder3 = ovz.a.createBuilder();
                aomf byteString = apgeVar2.toByteString();
                createBuilder3.copyOnWrite();
                ovz ovzVar = (ovz) createBuilder3.instance;
                ovzVar.b |= 4;
                ovzVar.e = byteString;
                createBuilder3.copyOnWrite();
                ovz ovzVar2 = (ovz) createBuilder3.instance;
                ovzVar2.b |= 2;
                ovzVar2.d = "attestation";
                String d = afsxVar.d();
                createBuilder3.copyOnWrite();
                ovz ovzVar3 = (ovz) createBuilder3.instance;
                ovzVar3.b |= 16;
                ovzVar3.g = d;
                if (!TextUtils.isEmpty(str)) {
                    createBuilder3.copyOnWrite();
                    ovz ovzVar4 = (ovz) createBuilder3.instance;
                    str.getClass();
                    ovzVar4.b |= 128;
                    ovzVar4.j = str;
                }
                createBuilder3.copyOnWrite();
                ovz ovzVar5 = (ovz) createBuilder3.instance;
                ovzVar5.b |= 256;
                ovzVar5.k = z;
                afrwVar.k(((ovz) createBuilder3.build()).toBuilder());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(final afsx afsxVar) {
        if (f("c5a")) {
            HashMap hashMap = new HashMap();
            hashMap.put("challenge", this.b.c);
            this.k.a(!ammx.e(a("c5b")) ? a("c5b") : "yt_player", hashMap, new qtx() { // from class: aiqv
                @Override // defpackage.qtx
                public final void a(String str) {
                    aiqy.this.d(str, afsxVar);
                }
            });
            return;
        }
        d(null, afsxVar);
    }

    public final void d(String str, afsx afsxVar) {
        zhy c = zhy.c(this.n);
        if (!this.d.isEmpty()) {
            c.h("cpn", this.d);
        }
        Uri a = c.a();
        afug e = afuh.e("atr");
        e.b(a);
        HashMap hashMap = new HashMap();
        zhy c2 = zhy.c(this.m);
        if (f("c3a")) {
            c2.h("r3a", Integer.toString(this.e % Integer.parseInt(a("c3a"))));
        }
        if (str != null) {
            c2.h("r5a", str);
        }
        hashMap.put("atr", ammx.d(c2.a().getEncodedQuery()));
        e.f = hashMap;
        e.d = this.o;
        e.a(new acub(this.c, 1));
        e.g = afsxVar;
        String valueOf = String.valueOf(a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 8);
        sb.append("Pinging ");
        sb.append(valueOf);
        zga.g(sb.toString());
        this.j.b(null, e, afxi.b);
    }

    public aiqy(afuh afuhVar, Executor executor, qtv qtvVar, afsy afsyVar, ysy ysyVar, afrw afrwVar, aadw aadwVar, atxz atxzVar, TrackingUrlModel trackingUrlModel) {
        this(afuhVar, executor, qtvVar, afsyVar, ysyVar, afrwVar, aadwVar, atxzVar, trackingUrlModel, "", 0);
        aqjd e = e(aadwVar);
        boolean z = false;
        if (e != null && e.f) {
            z = true;
        }
        this.o = z;
    }

    public aiqy(afuh afuhVar, Executor executor, qtv qtvVar, afsy afsyVar, ysy ysyVar, afrw afrwVar, aadw aadwVar, atxz atxzVar, TrackingUrlModel trackingUrlModel, String str, int i) {
        this.j = afuhVar;
        this.a = executor;
        this.k = qtvVar;
        this.l = afsyVar;
        atxzVar.getClass();
        this.b = atxzVar;
        trackingUrlModel.getClass();
        this.c = trackingUrlModel;
        this.n = zhy.b(trackingUrlModel.c());
        String valueOf = String.valueOf(atxzVar.c);
        this.m = zhy.b(Uri.parse(valueOf.length() != 0 ? "?".concat(valueOf) : new String("?")));
        this.f = ysyVar;
        this.g = afrwVar;
        this.h = e(aadwVar);
        this.d = str;
        this.e = i;
        this.i = false;
        this.o = true;
    }
}
