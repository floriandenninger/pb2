package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.google.android.youtube.R;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ooh {
    public final akbz a;
    public final shf b;
    public final ypa c;
    public final fuj d;
    public final long e;
    private final fuo f;
    private final acpl g;
    private final ci h;
    private final boolean i;
    private final boolean j;
    private final boolean k;

    public ooh(aadw aadwVar, akbz akbzVar, fuo fuoVar, shf shfVar, acpl acplVar, fuj fujVar, ypa ypaVar, ci ciVar) {
        apeq am = evr.am(aadwVar);
        long j = 0;
        boolean z = false;
        if (am == null) {
            this.i = false;
            this.j = false;
            this.k = false;
        } else {
            this.i = am.b;
            this.j = am.c;
            if (am.d && am.e > 0) {
                z = true;
            }
            this.k = z;
            j = am.e;
        }
        this.e = j;
        this.a = akbzVar;
        this.f = fuoVar;
        this.b = shfVar;
        this.g = acplVar;
        this.d = fujVar;
        this.c = ypaVar;
        this.h = ciVar;
    }

    public final void a() {
        ypa ypaVar = this.c;
        final fuj fujVar = this.d;
        fujVar.getClass();
        ypaVar.a(fujVar, aheg.class, new ypb() { // from class: ooe
            @Override // defpackage.ypb
            public final void a(Object obj) {
                fuj.this.b((aheg) obj);
            }
        });
    }

    public final void b(long j, String str, boolean z) {
        aumi a = aumj.a();
        a.copyOnWrite();
        aumj.c((aumj) a.instance, j);
        String d = ammx.d(str);
        a.copyOnWrite();
        aumj.d((aumj) a.instance, d);
        a.copyOnWrite();
        aumj.e((aumj) a.instance, z);
        aumj aumjVar = (aumj) a.build();
        arpn a2 = arpp.a();
        a2.copyOnWrite();
        ((arpp) a2.instance).dD(aumjVar);
        this.g.c((arpp) a2.build());
    }

    public final void c(final Context context, final aahd aahdVar) {
        anhy a;
        ci ciVar = this.h;
        if (!this.i || !this.j || !this.k) {
            a = this.f.a(false);
        } else {
            anhy b = ynm.b(ciVar, anfq.h(((ywr) this.f.a.get()).a(), fjw.n, angq.a), new amml() { // from class: oof
                @Override // defpackage.amml
                public final Object apply(Object obj) {
                    final ooh oohVar = ooh.this;
                    Context context2 = context;
                    final aahd aahdVar2 = aahdVar;
                    final fun funVar = (fun) obj;
                    if (funVar.f || TextUtils.isEmpty(funVar.a) || funVar.e <= 0 || oohVar.b.d() - funVar.e >= TimeUnit.SECONDS.toMillis(oohVar.e)) {
                        return false;
                    }
                    final long seconds = TimeUnit.MILLISECONDS.toSeconds(oohVar.b.d() - funVar.e);
                    gcm gcmVar = (gcm) oohVar.a.m();
                    gcmVar.k(context2.getString(R.string.restore_video_crashed_message));
                    gcmVar.m(context2.getString(R.string.restore_video_resume_watching), new View.OnClickListener() { // from class: ood
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            ooh oohVar2 = ooh.this;
                            fun funVar2 = funVar;
                            aahd aahdVar3 = aahdVar2;
                            long j = seconds;
                            aahdVar3.c(aigp.f(funVar2.a, funVar2.b, funVar2.c, (float) TimeUnit.MILLISECONDS.toSeconds(funVar2.d)), null);
                            oohVar2.b(j, funVar2.a, true);
                        }
                    });
                    oohVar.a.o(gcmVar.b());
                    oohVar.b(seconds, funVar.a, false);
                    return true;
                }
            });
            final fuo fuoVar = this.f;
            fuoVar.getClass();
            a = anfq.i(b, new anfz() { // from class: oog
                @Override // defpackage.anfz
                public final anhy a(Object obj) {
                    return fuo.this.a(((Boolean) obj).booleanValue());
                }
            }, angq.a);
        }
        ynm.n(ciVar, a, oph.b, ynm.b);
    }
}
