package defpackage;

import android.util.Pair;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aidi {
    public String a;
    public ajbv b;
    public ajbl c;
    public aiqc d;
    public aixm e;
    public boolean f;
    public aido h;
    public aigl j;
    public final akpq k;
    final Map g = new HashMap();
    final Map i = new HashMap();

    public aidi(akpq akpqVar, byte[] bArr, byte[] bArr2) {
        this.k = akpqVar;
    }

    public final void a(aypn aypnVar) {
        ayqw ayqwVar = new ayqw();
        final int i = 1;
        final int i2 = 3;
        ayqwVar.d(aypnVar.h(ahbw.e(1)).X(new ayrs(this) { // from class: aidg
            public final /* synthetic */ aidi a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                long j;
                aigl aiglVar;
                int i3 = i2;
                if (i3 == 0) {
                    this.a.b();
                    return;
                }
                if (i3 != 1) {
                    if (i3 != 2) {
                        aidi aidiVar = this.a;
                        ahel ahelVar = (ahel) obj;
                        akpq akpqVar = aidiVar.k;
                        ajbl a = ahelVar.a();
                        a.getClass();
                        azrw azrwVar = akpqVar.b;
                        aifv aifvVar = (aifv) akpqVar.a.get();
                        aifvVar.getClass();
                        aidiVar.h = new aido(a, azrwVar, aifvVar);
                        aido aidoVar = aidiVar.h;
                        aidoVar.a.d(aidoVar.g.X(new aidm(aidoVar, 11)));
                        aidiVar.d = ahelVar.a().i();
                        aidiVar.e = ahelVar.a().n();
                        aidiVar.b();
                        return;
                    }
                    aidi aidiVar2 = this.a;
                    ahct ahctVar = (ahct) obj;
                    ajbv ajbvVar = aidiVar2.b;
                    if (ajbvVar == null) {
                        return;
                    }
                    aidiVar2.f = true;
                    ajbu n = ajbvVar.n(ahctVar.b());
                    aidiVar2.j = new aigl(n != null ? n.e : aidiVar2.a, ahctVar.b(), ahctVar.b());
                    return;
                }
                aidi aidiVar3 = this.a;
                Pair pair = (Pair) obj;
                String str = aidiVar3.a;
                if (str == null || !str.equals(((ajbl) pair.first).Z())) {
                    aidiVar3.a = ((ajbl) pair.first).Z();
                    aidiVar3.c = (ajbl) pair.first;
                    aidiVar3.b = ((ajbl) pair.first).q();
                    aidiVar3.i.clear();
                }
                ahcl ahclVar = (ahcl) pair.second;
                ahcj d = ahclVar.d();
                ahck e = ahclVar.e();
                if (ahclVar.g()) {
                    if (aidiVar3.f) {
                        aidiVar3.f = false;
                        if ((d == null || e == null) && (aiglVar = aidiVar3.j) != null && !aiglVar.a.equals(aidiVar3.a)) {
                            aigl aiglVar2 = aidiVar3.j;
                            long j2 = aiglVar2.c;
                            String str2 = aiglVar2.a;
                            aidiVar3.c(str2, aidiVar3.a, j2, false, true);
                            aidiVar3.c(aidiVar3.a, str2, ahclVar.c(), true, true);
                            aidiVar3.j = null;
                        }
                    }
                    if (d == null || e == null) {
                        return;
                    }
                    aesh aeshVar = e.a;
                    if (aeshVar != null && e.b == null) {
                        j = e.c.c;
                        e.b = e.b(aeshVar, j);
                    }
                    for (aigl aiglVar3 : e.b) {
                        aidiVar3.g.put(aiglVar3.a, Long.valueOf(aiglVar3.d));
                        if (!aidiVar3.i.containsKey(aiglVar3.a)) {
                            if (!aidiVar3.d(aiglVar3.a)) {
                                aidh aidhVar = new aidh(aidiVar3, aiglVar3.a, aiglVar3.b, aiglVar3.c);
                                aidiVar3.e.c(aidhVar);
                                aidiVar3.i.put(aiglVar3.a, aidhVar);
                            }
                        } else {
                            aidh aidhVar2 = (aidh) aidiVar3.i.get(aiglVar3.a);
                            if (aidhVar2 != null) {
                                aidiVar3.e.f(aidhVar2, aiglVar3.c);
                            }
                        }
                    }
                    aeqn a2 = d.a();
                    if (a2 == null || a2.b != 2) {
                        return;
                    }
                    aidiVar3.e.c(new aidh(aidiVar3, aidiVar3.a, e.a() + 1, e.a() + 1));
                }
            }
        }));
        final int i3 = 0;
        ayqwVar.d(aypnVar.n().N(afly.p).X(new ayrs(this) { // from class: aidg
            public final /* synthetic */ aidi a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                long j;
                aigl aiglVar;
                int i32 = i3;
                if (i32 == 0) {
                    this.a.b();
                    return;
                }
                if (i32 != 1) {
                    if (i32 != 2) {
                        aidi aidiVar = this.a;
                        ahel ahelVar = (ahel) obj;
                        akpq akpqVar = aidiVar.k;
                        ajbl a = ahelVar.a();
                        a.getClass();
                        azrw azrwVar = akpqVar.b;
                        aifv aifvVar = (aifv) akpqVar.a.get();
                        aifvVar.getClass();
                        aidiVar.h = new aido(a, azrwVar, aifvVar);
                        aido aidoVar = aidiVar.h;
                        aidoVar.a.d(aidoVar.g.X(new aidm(aidoVar, 11)));
                        aidiVar.d = ahelVar.a().i();
                        aidiVar.e = ahelVar.a().n();
                        aidiVar.b();
                        return;
                    }
                    aidi aidiVar2 = this.a;
                    ahct ahctVar = (ahct) obj;
                    ajbv ajbvVar = aidiVar2.b;
                    if (ajbvVar == null) {
                        return;
                    }
                    aidiVar2.f = true;
                    ajbu n = ajbvVar.n(ahctVar.b());
                    aidiVar2.j = new aigl(n != null ? n.e : aidiVar2.a, ahctVar.b(), ahctVar.b());
                    return;
                }
                aidi aidiVar3 = this.a;
                Pair pair = (Pair) obj;
                String str = aidiVar3.a;
                if (str == null || !str.equals(((ajbl) pair.first).Z())) {
                    aidiVar3.a = ((ajbl) pair.first).Z();
                    aidiVar3.c = (ajbl) pair.first;
                    aidiVar3.b = ((ajbl) pair.first).q();
                    aidiVar3.i.clear();
                }
                ahcl ahclVar = (ahcl) pair.second;
                ahcj d = ahclVar.d();
                ahck e = ahclVar.e();
                if (ahclVar.g()) {
                    if (aidiVar3.f) {
                        aidiVar3.f = false;
                        if ((d == null || e == null) && (aiglVar = aidiVar3.j) != null && !aiglVar.a.equals(aidiVar3.a)) {
                            aigl aiglVar2 = aidiVar3.j;
                            long j2 = aiglVar2.c;
                            String str2 = aiglVar2.a;
                            aidiVar3.c(str2, aidiVar3.a, j2, false, true);
                            aidiVar3.c(aidiVar3.a, str2, ahclVar.c(), true, true);
                            aidiVar3.j = null;
                        }
                    }
                    if (d == null || e == null) {
                        return;
                    }
                    aesh aeshVar = e.a;
                    if (aeshVar != null && e.b == null) {
                        j = e.c.c;
                        e.b = e.b(aeshVar, j);
                    }
                    for (aigl aiglVar3 : e.b) {
                        aidiVar3.g.put(aiglVar3.a, Long.valueOf(aiglVar3.d));
                        if (!aidiVar3.i.containsKey(aiglVar3.a)) {
                            if (!aidiVar3.d(aiglVar3.a)) {
                                aidh aidhVar = new aidh(aidiVar3, aiglVar3.a, aiglVar3.b, aiglVar3.c);
                                aidiVar3.e.c(aidhVar);
                                aidiVar3.i.put(aiglVar3.a, aidhVar);
                            }
                        } else {
                            aidh aidhVar2 = (aidh) aidiVar3.i.get(aiglVar3.a);
                            if (aidhVar2 != null) {
                                aidiVar3.e.f(aidhVar2, aiglVar3.c);
                            }
                        }
                    }
                    aeqn a2 = d.a();
                    if (a2 == null || a2.b != 2) {
                        return;
                    }
                    aidiVar3.e.c(new aidh(aidiVar3, aidiVar3.a, e.a() + 1, e.a() + 1));
                }
            }
        }));
        ayqwVar.d(ahbw.d(aypnVar, aidf.a).h(ahbw.e(1)).X(new ayrs(this) { // from class: aidg
            public final /* synthetic */ aidi a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                long j;
                aigl aiglVar;
                int i32 = i;
                if (i32 == 0) {
                    this.a.b();
                    return;
                }
                if (i32 != 1) {
                    if (i32 != 2) {
                        aidi aidiVar = this.a;
                        ahel ahelVar = (ahel) obj;
                        akpq akpqVar = aidiVar.k;
                        ajbl a = ahelVar.a();
                        a.getClass();
                        azrw azrwVar = akpqVar.b;
                        aifv aifvVar = (aifv) akpqVar.a.get();
                        aifvVar.getClass();
                        aidiVar.h = new aido(a, azrwVar, aifvVar);
                        aido aidoVar = aidiVar.h;
                        aidoVar.a.d(aidoVar.g.X(new aidm(aidoVar, 11)));
                        aidiVar.d = ahelVar.a().i();
                        aidiVar.e = ahelVar.a().n();
                        aidiVar.b();
                        return;
                    }
                    aidi aidiVar2 = this.a;
                    ahct ahctVar = (ahct) obj;
                    ajbv ajbvVar = aidiVar2.b;
                    if (ajbvVar == null) {
                        return;
                    }
                    aidiVar2.f = true;
                    ajbu n = ajbvVar.n(ahctVar.b());
                    aidiVar2.j = new aigl(n != null ? n.e : aidiVar2.a, ahctVar.b(), ahctVar.b());
                    return;
                }
                aidi aidiVar3 = this.a;
                Pair pair = (Pair) obj;
                String str = aidiVar3.a;
                if (str == null || !str.equals(((ajbl) pair.first).Z())) {
                    aidiVar3.a = ((ajbl) pair.first).Z();
                    aidiVar3.c = (ajbl) pair.first;
                    aidiVar3.b = ((ajbl) pair.first).q();
                    aidiVar3.i.clear();
                }
                ahcl ahclVar = (ahcl) pair.second;
                ahcj d = ahclVar.d();
                ahck e = ahclVar.e();
                if (ahclVar.g()) {
                    if (aidiVar3.f) {
                        aidiVar3.f = false;
                        if ((d == null || e == null) && (aiglVar = aidiVar3.j) != null && !aiglVar.a.equals(aidiVar3.a)) {
                            aigl aiglVar2 = aidiVar3.j;
                            long j2 = aiglVar2.c;
                            String str2 = aiglVar2.a;
                            aidiVar3.c(str2, aidiVar3.a, j2, false, true);
                            aidiVar3.c(aidiVar3.a, str2, ahclVar.c(), true, true);
                            aidiVar3.j = null;
                        }
                    }
                    if (d == null || e == null) {
                        return;
                    }
                    aesh aeshVar = e.a;
                    if (aeshVar != null && e.b == null) {
                        j = e.c.c;
                        e.b = e.b(aeshVar, j);
                    }
                    for (aigl aiglVar3 : e.b) {
                        aidiVar3.g.put(aiglVar3.a, Long.valueOf(aiglVar3.d));
                        if (!aidiVar3.i.containsKey(aiglVar3.a)) {
                            if (!aidiVar3.d(aiglVar3.a)) {
                                aidh aidhVar = new aidh(aidiVar3, aiglVar3.a, aiglVar3.b, aiglVar3.c);
                                aidiVar3.e.c(aidhVar);
                                aidiVar3.i.put(aiglVar3.a, aidhVar);
                            }
                        } else {
                            aidh aidhVar2 = (aidh) aidiVar3.i.get(aiglVar3.a);
                            if (aidhVar2 != null) {
                                aidiVar3.e.f(aidhVar2, aiglVar3.c);
                            }
                        }
                    }
                    aeqn a2 = d.a();
                    if (a2 == null || a2.b != 2) {
                        return;
                    }
                    aidiVar3.e.c(new aidh(aidiVar3, aidiVar3.a, e.a() + 1, e.a() + 1));
                }
            }
        }));
        final int i4 = 2;
        ayqwVar.d(ahbw.c(aypnVar, aidf.c).X(new ayrs(this) { // from class: aidg
            public final /* synthetic */ aidi a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                long j;
                aigl aiglVar;
                int i32 = i4;
                if (i32 == 0) {
                    this.a.b();
                    return;
                }
                if (i32 != 1) {
                    if (i32 != 2) {
                        aidi aidiVar = this.a;
                        ahel ahelVar = (ahel) obj;
                        akpq akpqVar = aidiVar.k;
                        ajbl a = ahelVar.a();
                        a.getClass();
                        azrw azrwVar = akpqVar.b;
                        aifv aifvVar = (aifv) akpqVar.a.get();
                        aifvVar.getClass();
                        aidiVar.h = new aido(a, azrwVar, aifvVar);
                        aido aidoVar = aidiVar.h;
                        aidoVar.a.d(aidoVar.g.X(new aidm(aidoVar, 11)));
                        aidiVar.d = ahelVar.a().i();
                        aidiVar.e = ahelVar.a().n();
                        aidiVar.b();
                        return;
                    }
                    aidi aidiVar2 = this.a;
                    ahct ahctVar = (ahct) obj;
                    ajbv ajbvVar = aidiVar2.b;
                    if (ajbvVar == null) {
                        return;
                    }
                    aidiVar2.f = true;
                    ajbu n = ajbvVar.n(ahctVar.b());
                    aidiVar2.j = new aigl(n != null ? n.e : aidiVar2.a, ahctVar.b(), ahctVar.b());
                    return;
                }
                aidi aidiVar3 = this.a;
                Pair pair = (Pair) obj;
                String str = aidiVar3.a;
                if (str == null || !str.equals(((ajbl) pair.first).Z())) {
                    aidiVar3.a = ((ajbl) pair.first).Z();
                    aidiVar3.c = (ajbl) pair.first;
                    aidiVar3.b = ((ajbl) pair.first).q();
                    aidiVar3.i.clear();
                }
                ahcl ahclVar = (ahcl) pair.second;
                ahcj d = ahclVar.d();
                ahck e = ahclVar.e();
                if (ahclVar.g()) {
                    if (aidiVar3.f) {
                        aidiVar3.f = false;
                        if ((d == null || e == null) && (aiglVar = aidiVar3.j) != null && !aiglVar.a.equals(aidiVar3.a)) {
                            aigl aiglVar2 = aidiVar3.j;
                            long j2 = aiglVar2.c;
                            String str2 = aiglVar2.a;
                            aidiVar3.c(str2, aidiVar3.a, j2, false, true);
                            aidiVar3.c(aidiVar3.a, str2, ahclVar.c(), true, true);
                            aidiVar3.j = null;
                        }
                    }
                    if (d == null || e == null) {
                        return;
                    }
                    aesh aeshVar = e.a;
                    if (aeshVar != null && e.b == null) {
                        j = e.c.c;
                        e.b = e.b(aeshVar, j);
                    }
                    for (aigl aiglVar3 : e.b) {
                        aidiVar3.g.put(aiglVar3.a, Long.valueOf(aiglVar3.d));
                        if (!aidiVar3.i.containsKey(aiglVar3.a)) {
                            if (!aidiVar3.d(aiglVar3.a)) {
                                aidh aidhVar = new aidh(aidiVar3, aiglVar3.a, aiglVar3.b, aiglVar3.c);
                                aidiVar3.e.c(aidhVar);
                                aidiVar3.i.put(aiglVar3.a, aidhVar);
                            }
                        } else {
                            aidh aidhVar2 = (aidh) aidiVar3.i.get(aiglVar3.a);
                            if (aidhVar2 != null) {
                                aidiVar3.e.f(aidhVar2, aiglVar3.c);
                            }
                        }
                    }
                    aeqn a2 = d.a();
                    if (a2 == null || a2.b != 2) {
                        return;
                    }
                    aidiVar3.e.c(new aidh(aidiVar3, aidiVar3.a, e.a() + 1, e.a() + 1));
                }
            }
        }));
    }

    public final void b() {
        this.j = null;
        this.f = false;
    }

    public final void c(String str, String str2, long j, boolean z, boolean z2) {
        PlayerResponseModel playerResponseModel;
        ajbu d = this.b.d(str);
        ajbu d2 = this.b.d(str2);
        if (d == null || d2 == null || d.f == null || (playerResponseModel = d2.f) == null) {
            return;
        }
        String y = playerResponseModel.y();
        PlayerResponseModel playerResponseModel2 = d.f;
        long j2 = -1;
        if (!d(str) && this.g.containsKey(str)) {
            j2 = ((Long) this.g.get(str)).longValue();
        }
        ahdx ahdxVar = new ahdx(str, str2, y, this.a, j, j2, z, z2, playerResponseModel2);
        this.c.ay().c(ahdxVar);
        String e = ahdxVar.e();
        if (ahdxVar.i()) {
            if (d(e)) {
                aiqc aiqcVar = this.d;
                aiqcVar.f = true;
                aiqcVar.h(ahdxVar.b(), ahdxVar.e(), ahdxVar.c(), 0);
                return;
            } else {
                if (d(e)) {
                    return;
                }
                aiqc aiqcVar2 = this.d;
                if (aiqcVar2.f) {
                    aiqcVar2.f = false;
                    return;
                }
                return;
            }
        }
        if (!d(ahdxVar.e())) {
            this.d.f = true;
            return;
        }
        aiqc aiqcVar3 = this.d;
        if (aiqcVar3.f) {
            aiqcVar3.i();
            this.d.f = false;
        }
    }

    public final boolean d(String str) {
        return str.equals(this.a);
    }
}
