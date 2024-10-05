package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.innertube.model.player.TrackingUrlModel;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class airx extends ajbh implements aiqh {
    public final shf a;
    public final Map b;
    public ahcx c;
    private final afgt d;
    private final aaea e;
    private final ajby f;
    private final aypn g;
    private boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public airx(afgt afgtVar, aypn aypnVar, aifv aifvVar, aypn aypnVar2, shf shfVar, ajby ajbyVar, aaea aaeaVar) {
        super(1);
        final int i = 1;
        afgtVar.getClass();
        this.d = afgtVar;
        this.a = shfVar;
        this.f = ajbyVar;
        this.g = aypnVar2;
        this.e = aaeaVar;
        this.b = new HashMap();
        ayqw ayqwVar = new ayqw();
        ayqwVar.d(ahbw.c(aypnVar, aipq.e).Y(new ayrs(this) { // from class: airv
            public final /* synthetic */ airx a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                int i2 = i;
                if (i2 == 0) {
                    airx airxVar = this.a;
                    ahcx ahcxVar = (ahcx) obj;
                    airxVar.c = ahcxVar;
                    Iterator it = airxVar.b.values().iterator();
                    while (it.hasNext()) {
                        airx.w((afgs) it.next(), ahcxVar);
                    }
                    return;
                }
                if (i2 == 1) {
                    ahcr ahcrVar = (ahcr) obj;
                    Iterator it2 = this.a.b.values().iterator();
                    while (it2.hasNext()) {
                        ((afgs) it2.next()).j(ahcrVar.a());
                    }
                    return;
                }
                if (i2 == 2) {
                    airx airxVar2 = this.a;
                    ahdx ahdxVar = (ahdx) obj;
                    String d = ahdxVar.d();
                    if (d == null || !airxVar2.b.containsKey(d)) {
                        return;
                    }
                    ((afgs) airxVar2.b.get(d)).p(ahdxVar.b(), ahdxVar.i(), ahdxVar.j(), ahdxVar.e(), ahdxVar.f(), ahdxVar.g(), ahdxVar.h());
                    return;
                }
                if (i2 == 3) {
                    atwo atwoVar = (atwo) obj;
                    Iterator it3 = this.a.b.values().iterator();
                    while (it3.hasNext()) {
                        ((afgs) it3.next()).H(atwoVar.n);
                    }
                    return;
                }
                airx airxVar3 = this.a;
                int intValue = ((Integer) obj).intValue();
                Iterator it4 = airxVar3.b.values().iterator();
                while (it4.hasNext()) {
                    ((afgs) it4.next()).i(intValue);
                }
            }
        }, airw.a));
        final int i2 = 0;
        ayqwVar.d(aifvVar.b.X(new ayrs(this) { // from class: airv
            public final /* synthetic */ airx a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                int i22 = i2;
                if (i22 == 0) {
                    airx airxVar = this.a;
                    ahcx ahcxVar = (ahcx) obj;
                    airxVar.c = ahcxVar;
                    Iterator it = airxVar.b.values().iterator();
                    while (it.hasNext()) {
                        airx.w((afgs) it.next(), ahcxVar);
                    }
                    return;
                }
                if (i22 == 1) {
                    ahcr ahcrVar = (ahcr) obj;
                    Iterator it2 = this.a.b.values().iterator();
                    while (it2.hasNext()) {
                        ((afgs) it2.next()).j(ahcrVar.a());
                    }
                    return;
                }
                if (i22 == 2) {
                    airx airxVar2 = this.a;
                    ahdx ahdxVar = (ahdx) obj;
                    String d = ahdxVar.d();
                    if (d == null || !airxVar2.b.containsKey(d)) {
                        return;
                    }
                    ((afgs) airxVar2.b.get(d)).p(ahdxVar.b(), ahdxVar.i(), ahdxVar.j(), ahdxVar.e(), ahdxVar.f(), ahdxVar.g(), ahdxVar.h());
                    return;
                }
                if (i22 == 3) {
                    atwo atwoVar = (atwo) obj;
                    Iterator it3 = this.a.b.values().iterator();
                    while (it3.hasNext()) {
                        ((afgs) it3.next()).H(atwoVar.n);
                    }
                    return;
                }
                airx airxVar3 = this.a;
                int intValue = ((Integer) obj).intValue();
                Iterator it4 = airxVar3.b.values().iterator();
                while (it4.hasNext()) {
                    ((afgs) it4.next()).i(intValue);
                }
            }
        }));
        apep apepVar = y().C;
        if ((apepVar == null ? apep.a : apepVar).b) {
            final int i3 = 3;
            ayqwVar.d(aifvVar.a().X(new ayrs(this) { // from class: airv
                public final /* synthetic */ airx a;

                {
                    this.a = this;
                }

                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    int i22 = i3;
                    if (i22 == 0) {
                        airx airxVar = this.a;
                        ahcx ahcxVar = (ahcx) obj;
                        airxVar.c = ahcxVar;
                        Iterator it = airxVar.b.values().iterator();
                        while (it.hasNext()) {
                            airx.w((afgs) it.next(), ahcxVar);
                        }
                        return;
                    }
                    if (i22 == 1) {
                        ahcr ahcrVar = (ahcr) obj;
                        Iterator it2 = this.a.b.values().iterator();
                        while (it2.hasNext()) {
                            ((afgs) it2.next()).j(ahcrVar.a());
                        }
                        return;
                    }
                    if (i22 == 2) {
                        airx airxVar2 = this.a;
                        ahdx ahdxVar = (ahdx) obj;
                        String d = ahdxVar.d();
                        if (d == null || !airxVar2.b.containsKey(d)) {
                            return;
                        }
                        ((afgs) airxVar2.b.get(d)).p(ahdxVar.b(), ahdxVar.i(), ahdxVar.j(), ahdxVar.e(), ahdxVar.f(), ahdxVar.g(), ahdxVar.h());
                        return;
                    }
                    if (i22 == 3) {
                        atwo atwoVar = (atwo) obj;
                        Iterator it3 = this.a.b.values().iterator();
                        while (it3.hasNext()) {
                            ((afgs) it3.next()).H(atwoVar.n);
                        }
                        return;
                    }
                    airx airxVar3 = this.a;
                    int intValue = ((Integer) obj).intValue();
                    Iterator it4 = airxVar3.b.values().iterator();
                    while (it4.hasNext()) {
                        ((afgs) it4.next()).i(intValue);
                    }
                }
            }));
        }
        apep apepVar2 = y().C;
        if ((apepVar2 == null ? apep.a : apepVar2).h) {
            final int i4 = 4;
            ayqwVar.d(aypnVar2.X(new ayrs(this) { // from class: airv
                public final /* synthetic */ airx a;

                {
                    this.a = this;
                }

                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    int i22 = i4;
                    if (i22 == 0) {
                        airx airxVar = this.a;
                        ahcx ahcxVar = (ahcx) obj;
                        airxVar.c = ahcxVar;
                        Iterator it = airxVar.b.values().iterator();
                        while (it.hasNext()) {
                            airx.w((afgs) it.next(), ahcxVar);
                        }
                        return;
                    }
                    if (i22 == 1) {
                        ahcr ahcrVar = (ahcr) obj;
                        Iterator it2 = this.a.b.values().iterator();
                        while (it2.hasNext()) {
                            ((afgs) it2.next()).j(ahcrVar.a());
                        }
                        return;
                    }
                    if (i22 == 2) {
                        airx airxVar2 = this.a;
                        ahdx ahdxVar = (ahdx) obj;
                        String d = ahdxVar.d();
                        if (d == null || !airxVar2.b.containsKey(d)) {
                            return;
                        }
                        ((afgs) airxVar2.b.get(d)).p(ahdxVar.b(), ahdxVar.i(), ahdxVar.j(), ahdxVar.e(), ahdxVar.f(), ahdxVar.g(), ahdxVar.h());
                        return;
                    }
                    if (i22 == 3) {
                        atwo atwoVar = (atwo) obj;
                        Iterator it3 = this.a.b.values().iterator();
                        while (it3.hasNext()) {
                            ((afgs) it3.next()).H(atwoVar.n);
                        }
                        return;
                    }
                    airx airxVar3 = this.a;
                    int intValue = ((Integer) obj).intValue();
                    Iterator it4 = airxVar3.b.values().iterator();
                    while (it4.hasNext()) {
                        ((afgs) it4.next()).i(intValue);
                    }
                }
            }));
        }
        final int i5 = 2;
        ayqwVar.d(ahbw.c(aypnVar, aipq.f).Y(new ayrs(this) { // from class: airv
            public final /* synthetic */ airx a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                int i22 = i5;
                if (i22 == 0) {
                    airx airxVar = this.a;
                    ahcx ahcxVar = (ahcx) obj;
                    airxVar.c = ahcxVar;
                    Iterator it = airxVar.b.values().iterator();
                    while (it.hasNext()) {
                        airx.w((afgs) it.next(), ahcxVar);
                    }
                    return;
                }
                if (i22 == 1) {
                    ahcr ahcrVar = (ahcr) obj;
                    Iterator it2 = this.a.b.values().iterator();
                    while (it2.hasNext()) {
                        ((afgs) it2.next()).j(ahcrVar.a());
                    }
                    return;
                }
                if (i22 == 2) {
                    airx airxVar2 = this.a;
                    ahdx ahdxVar = (ahdx) obj;
                    String d = ahdxVar.d();
                    if (d == null || !airxVar2.b.containsKey(d)) {
                        return;
                    }
                    ((afgs) airxVar2.b.get(d)).p(ahdxVar.b(), ahdxVar.i(), ahdxVar.j(), ahdxVar.e(), ahdxVar.f(), ahdxVar.g(), ahdxVar.h());
                    return;
                }
                if (i22 == 3) {
                    atwo atwoVar = (atwo) obj;
                    Iterator it3 = this.a.b.values().iterator();
                    while (it3.hasNext()) {
                        ((afgs) it3.next()).H(atwoVar.n);
                    }
                    return;
                }
                airx airxVar3 = this.a;
                int intValue = ((Integer) obj).intValue();
                Iterator it4 = airxVar3.b.values().iterator();
                while (it4.hasNext()) {
                    ((afgs) it4.next()).i(intValue);
                }
            }
        }, airw.a));
    }

    private final void A(String str, String str2, VideoStreamingData videoStreamingData, TrackingUrlModel trackingUrlModel, PlayerConfigModel playerConfigModel) {
        afgs afgsVar = (afgs) this.b.get(str2);
        if (afgsVar != null) {
            if (afgsVar.m) {
                return;
            }
            afgsVar.h(trackingUrlModel, str2, null, null, str, videoStreamingData, playerConfigModel);
            return;
        }
        afgs b = this.d.b(trackingUrlModel, str2, null, null, null, str, videoStreamingData, this.h, playerConfigModel);
        if (b != null) {
            this.b.put(str2, b);
            this.f.addObserver(b);
            if (x()) {
                w(b, this.c);
            }
        }
    }

    public static void w(afgs afgsVar, ahcx ahcxVar) {
        if (ahcxVar != null) {
            int i = ahcxVar.d() == null ? -1 : ahcxVar.d().i;
            boolean z = false;
            if (ahcxVar.d() != null && ahcxVar.d().b()) {
                z = true;
            }
            afgsVar.k(i, z, ahcxVar.b(), ahcxVar.a());
        }
    }

    private final auij y() {
        aaea aaeaVar = this.e;
        if (aaeaVar == null || aaeaVar.a() == null) {
            return auij.b;
        }
        atcl atclVar = this.e.a().i;
        if (atclVar == null) {
            atclVar = atcl.a;
        }
        auij auijVar = atclVar.f;
        return auijVar == null ? auij.b : auijVar;
    }

    private final boolean z() {
        arfd a;
        aaea aaeaVar = this.e;
        if (aaeaVar != null && (a = aaeaVar.a()) != null) {
            atcl atclVar = a.i;
            if (atclVar == null) {
                atclVar = atcl.a;
            }
            apdj apdjVar = atclVar.i;
            if (apdjVar == null) {
                apdjVar = apdj.a;
            }
            if (apdjVar.i) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.aiqh
    public final void a(long j) {
        Iterator it = this.b.values().iterator();
        while (it.hasNext()) {
            ((afgs) it.next()).J(j);
        }
    }

    @Override // defpackage.ajbh
    public final void aj(ahef ahefVar) {
        aign c = ahefVar.c();
        PlayerResponseModel b = ahefVar.b();
        String e = ahefVar.e();
        PlayerResponseModel a = ahefVar.a();
        String k = ahefVar.k();
        aign aignVar = aign.NEW;
        int ordinal = c.ordinal();
        if (ordinal == 4 || ordinal == 5) {
            if (a == null || b == null || k == null) {
                return;
            }
            this.h = false;
            A(a.y(), k, b.c, a.f().e, a.c());
            return;
        }
        if ((ordinal != 7 && ordinal != 8) || b == null || e == null) {
            return;
        }
        A(b.y(), e, b.c, b.f().e, b.c());
        this.h = false;
    }

    @Override // defpackage.ajbh
    public final void c(String str) {
        afgs afgsVar = str != null ? (afgs) this.b.get(str) : null;
        if (afgsVar != null) {
            if (z()) {
                afgsVar.s("dedi", new airu(this, 0));
            }
            afgsVar.y();
        }
    }

    @Override // defpackage.ajbh
    public final void e(aheg ahegVar) {
        afgs afgsVar = ahegVar.i() != null ? (afgs) this.b.get(ahegVar.i()) : null;
        if (afgsVar != null) {
            afgsVar.F(ahegVar.j(), ahegVar.g(), ahegVar.a());
        }
    }

    @Override // defpackage.ajbh
    public final void g(avzr avzrVar, String str) {
        if (str == null || !this.b.containsKey(str)) {
            return;
        }
        ((afgs) this.b.get(str)).E(avzrVar);
    }

    @Override // defpackage.ajbh
    public final void h(aeqq aeqqVar, String str) {
        afgs afgsVar = str != null ? (afgs) this.b.get(str) : null;
        if (afgsVar != null) {
            afgsVar.r(aeqqVar);
        }
    }

    @Override // defpackage.ajbh
    public final void i(aeqq aeqqVar, String str) {
        h(aeqqVar, str);
    }

    @Override // defpackage.ajbh
    public final void j(String str, afgj afgjVar, String str2) {
        afgs afgsVar = str2 != null ? (afgs) this.b.get(str2) : null;
        if (afgsVar != null) {
            afgsVar.s(str, afgjVar);
        }
    }

    @Override // defpackage.ajbh
    public final void k(avzr avzrVar, String str) {
        if (str == null || !this.b.containsKey(str)) {
            return;
        }
        ((afgs) this.b.get(str)).t(avzrVar);
    }

    @Override // defpackage.ajbh
    public final void l(String str, String str2) {
        if (str == null || !this.b.containsKey(str)) {
            return;
        }
        ((afgs) this.b.get(str)).m(str2);
    }

    @Override // defpackage.ajbh
    public final void m(String str) {
        if (this.b.containsKey(str)) {
            ((afgs) this.b.get(str)).u();
        }
    }

    @Override // defpackage.ajbh
    public final void n(afih afihVar, String str) {
        afgs afgsVar = str != null ? (afgs) this.b.get(str) : null;
        if (afgsVar != null) {
            afgsVar.v(afihVar);
        }
    }

    @Override // defpackage.ajbh
    public final void o(String str, PlaybackStartDescriptor playbackStartDescriptor) {
        awdi awdiVar;
        if (!this.b.containsKey(str) && y().d) {
            afgt afgtVar = this.d;
            if (playbackStartDescriptor != null) {
                awdk awdkVar = playbackStartDescriptor.a.A;
                if (awdkVar == null) {
                    awdkVar = awdk.a;
                }
                awdiVar = awdkVar.c;
                if (awdiVar == null) {
                    awdiVar = awdi.a;
                }
            } else {
                awdiVar = null;
            }
            afgs a = afgtVar.a(str, awdiVar);
            if (a != null) {
                this.b.put(str, a);
                this.f.addObserver(a);
                if (x()) {
                    w(a, this.c);
                }
            }
        }
    }

    @Override // defpackage.ajbh
    public final void p(String str) {
        afgs afgsVar = (afgs) this.b.get(str);
        if (afgsVar != null) {
            this.f.deleteObserver(afgsVar);
            afgsVar.g();
            this.b.remove(str);
        }
    }

    @Override // defpackage.ajbh
    public final void q(String str) {
        afgs afgsVar = str != null ? (afgs) this.b.get(str) : null;
        if (afgsVar != null) {
            if (z()) {
                afgsVar.s("dedi", new airu(this, 1));
            }
            afgsVar.y();
        }
    }

    @Override // defpackage.ajbh
    public final void r(aigr aigrVar) {
        String str = aigrVar.b;
        afgs afgsVar = str != null ? (afgs) this.b.get(str) : null;
        auij y = y();
        if (aigrVar.i == 4 && afgsVar != null && y.e) {
            afgsVar.z(aigrVar.g, aigrVar.f);
        }
    }

    @Override // defpackage.ajbh
    public final void s(String str, String str2, String str3) {
        afgs afgsVar = str3 != null ? (afgs) this.b.get(str3) : null;
        if (afgsVar != null) {
            afgsVar.C(str, str2);
        }
    }

    @Override // defpackage.ajbh
    public final void t() {
        this.h = true;
    }

    @Override // defpackage.ajbh
    public final void u(aifb aifbVar) {
        afgs afgsVar = aifbVar.c() != null ? (afgs) this.b.get(aifbVar.c()) : null;
        if (afgsVar == null || aifbVar.b() != 15) {
            return;
        }
        afgsVar.D(aifbVar.a());
    }

    @Override // defpackage.ajbh
    public final void v(ahej ahejVar) {
        afgs afgsVar = ahejVar.b() != null ? (afgs) this.b.get(ahejVar.b()) : null;
        if (afgsVar != null) {
            int a = ahejVar.a();
            if (a == 2) {
                afgsVar.A();
                return;
            }
            if (a == 3) {
                afgsVar.w();
                return;
            }
            if (a == 5) {
                afgsVar.o();
                return;
            }
            if (a == 6) {
                afgsVar.x();
                return;
            }
            if (a == 7) {
                afgsVar.q();
            } else if (a == 9 || a == 10) {
                afgsVar.B();
            }
        }
    }

    public final boolean x() {
        atcl atclVar = this.e.a().i;
        if (atclVar == null) {
            atclVar = atcl.a;
        }
        auij auijVar = atclVar.f;
        if (auijVar == null) {
            auijVar = auij.b;
        }
        apep apepVar = auijVar.C;
        if (apepVar == null) {
            apepVar = apep.a;
        }
        return apepVar.g;
    }
}
