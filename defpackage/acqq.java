package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.libraries.youtube.logging.interaction.GelVisibilityUpdate;
import com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class acqq implements acra, acrq {
    protected final ypa a;
    protected final acre b;
    protected final acrj c;
    protected final acrr d;
    protected final Context e;
    protected final aaea f;
    public InteractionLoggingScreen g;
    protected final ajkn h;
    protected final ajun i;
    private final List j;
    private final Map k;
    private final acqy m;
    private final axzg n;

    public acqq(ajkn ajknVar, ypa ypaVar, acre acreVar, acrj acrjVar, ajun ajunVar, Context context, aaea aaeaVar, axzg axzgVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this(ajknVar, ypaVar, acreVar, acrjVar, ajunVar, acrz.b, context, aaeaVar, axzgVar, null, null, null, null);
    }

    protected awav A(int i, int i2) {
        InteractionLoggingScreen c = c();
        if (c == null) {
            return null;
        }
        aone createBuilder = awav.a.createBuilder();
        createBuilder.copyOnWrite();
        awav awavVar = (awav) createBuilder.instance;
        awavVar.b |= 2;
        awavVar.d = i;
        if (i2 <= 0) {
            createBuilder.copyOnWrite();
            awav awavVar2 = (awav) createBuilder.instance;
            awavVar2.b |= 4;
            awavVar2.e = 0;
        } else {
            createBuilder.copyOnWrite();
            awav awavVar3 = (awav) createBuilder.instance;
            awavVar3.b |= 4;
            awavVar3.e = i2;
        }
        int b = c.b(i);
        createBuilder.copyOnWrite();
        awav awavVar4 = (awav) createBuilder.instance;
        awavVar4.b |= 8;
        awavVar4.f = b;
        return (awav) createBuilder.build();
    }

    @Override // defpackage.acra
    public void B(InteractionLoggingScreen interactionLoggingScreen) {
        this.g = interactionLoggingScreen;
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            ((acra) it.next()).B(interactionLoggingScreen);
        }
    }

    @Override // defpackage.acra
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public final void D(acsa acsaVar) {
        if (acsaVar == null) {
            zga.l("null VE container encountered in logAttachChild");
        } else {
            this.b.b(c(), acsaVar.a);
        }
    }

    @Override // defpackage.acra
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public final void F(acsa acsaVar, acsa acsaVar2) {
        if (acsaVar == null || acsaVar2 == null) {
            zga.l("null VE container encountered in logAttachChild");
        } else {
            this.b.c(c(), acsaVar.a, acsaVar2.a);
        }
    }

    @Override // defpackage.acra
    public final InteractionLoggingScreen G(acsc acscVar, acrs acrsVar, apxf apxfVar) {
        return e(acscVar, acrsVar, apxfVar, null, null);
    }

    @Override // defpackage.acra
    public final void H(aooy aooyVar, aomf aomfVar, View view) {
        Object tag = view.getTag(R.id.logging_directable_supplier_tag);
        if (tag instanceof acro) {
            ((acro) tag).a(aooyVar, aomfVar);
        } else {
            view.setTag(R.id.logging_directable_supplier_tag, new acro(aooyVar, aomfVar));
        }
    }

    @Override // defpackage.acsm
    public final void I(int i, acsa acsaVar, asht ashtVar) {
        adyu.ci(this.b, c(), i, acsaVar, ashtVar);
    }

    @Override // defpackage.acra
    public final acqy a() {
        return this.m;
    }

    @Override // defpackage.acra
    public acra b(acrz acrzVar) {
        acqq acqqVar = new acqq(this.h, this.a, this.b, this.c, this.i, acrzVar, this.e, this.f, this.n, null, null, null, null);
        acqqVar.B(c());
        this.j.add(acqqVar);
        return acqqVar;
    }

    @Override // defpackage.acra, defpackage.acrq
    public InteractionLoggingScreen c() {
        return this.g;
    }

    @Override // defpackage.acra
    public InteractionLoggingScreen d(acsc acscVar, apxf apxfVar, asht ashtVar) {
        return e(acscVar, null, apxfVar, ashtVar, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x06ce  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x06d6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x05b1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x05b8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x05e1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x061a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0684  */
    @Override // defpackage.acra
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen e(defpackage.acsc r20, defpackage.acrs r21, defpackage.apxf r22, defpackage.asht r23, defpackage.asht r24) {
        /*
            Method dump skipped, instructions count: 1763
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acqq.e(acsc, acrs, apxf, asht, asht):com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen");
    }

    @Override // defpackage.acsl
    public final /* bridge */ /* synthetic */ acsm f(acsa acsaVar) {
        D(acsaVar);
        return this;
    }

    @Override // defpackage.acsl
    public final /* bridge */ /* synthetic */ acsm g(acsa acsaVar, acsa acsaVar2) {
        F(acsaVar, acsaVar2);
        return this;
    }

    @Override // defpackage.acra, defpackage.acsl
    public final apxf h(apxf apxfVar) {
        return adyu.cn(this.i, c(), apxfVar);
    }

    @Override // defpackage.acra
    public final awav i(Object obj, acsc acscVar) {
        return j(obj, acscVar, -1);
    }

    @Override // defpackage.acra
    public final awav j(Object obj, acsc acscVar, int i) {
        if (acscVar == null) {
            return null;
        }
        int i2 = acscVar.a;
        if (c() == null) {
            return null;
        }
        acqp acqpVar = new acqp(obj, i2, i);
        awav awavVar = (awav) this.k.get(acqpVar);
        if (awavVar != null) {
            return awavVar;
        }
        awav A = A(i2, i);
        this.k.put(acqpVar, A);
        return A;
    }

    @Override // defpackage.acra
    @Deprecated
    public String k() {
        return c() == null ? "" : c().a;
    }

    @Override // defpackage.acra
    public final void l(Object obj, acsc acscVar, int i) {
        awav awavVar;
        int i2 = acscVar.a;
        if (c() == null) {
            return;
        }
        acqp acqpVar = new acqp(obj, i2, -1);
        if (this.k.containsKey(acqpVar)) {
            return;
        }
        if (c() == null) {
            awavVar = null;
        } else {
            aone createBuilder = awav.a.createBuilder();
            createBuilder.copyOnWrite();
            awav awavVar2 = (awav) createBuilder.instance;
            awavVar2.b |= 2;
            awavVar2.d = i2;
            createBuilder.copyOnWrite();
            awav awavVar3 = (awav) createBuilder.instance;
            awavVar3.b |= 4;
            awavVar3.e = 0;
            int abs = Math.abs(i);
            createBuilder.copyOnWrite();
            awav awavVar4 = (awav) createBuilder.instance;
            awavVar4.b |= 8;
            awavVar4.f = abs;
            awavVar = (awav) createBuilder.build();
        }
        this.k.put(acqpVar, awavVar);
    }

    @Override // defpackage.acra
    public final void m(List list) {
        acre acreVar = this.b;
        InteractionLoggingScreen c = c();
        if (acreVar.m(c)) {
            awav o = acre.o(c.f);
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                awav awavVar = (awav) it.next();
                if (acreVar.n(c, awavVar)) {
                    awav a = acre.a(awavVar);
                    if (acreVar.j.s().booleanValue()) {
                        synchronized (acreVar.i) {
                            if (acre.l(a) && c.g(a)) {
                                return;
                            } else {
                                c.d(a, o);
                            }
                        }
                    } else if (!acre.l(a) || !c.g(a)) {
                        c.d(a, o);
                    }
                    arrayList.add(a);
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            acreVar.e(c, o, arrayList);
            acrh acrhVar = acreVar.e;
            String str = c.a;
            if (acrhVar.f()) {
                return;
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                acrhVar.b((awav) it2.next(), o, str);
            }
        }
    }

    @Override // defpackage.acra
    public final void n(acsa acsaVar) {
        if (acsaVar == null) {
            zga.l("null VE container encountered in logAttachVisibleChild");
        } else {
            D(acsaVar);
            u(acsaVar, null);
        }
    }

    @Override // defpackage.acra
    public final void o(acsa acsaVar, acsa acsaVar2) {
        if (acsaVar2 == null) {
            zga.l("null VE container encountered in logAttachVisibleChild");
        } else {
            F(acsaVar, acsaVar2);
            u(acsaVar, null);
        }
    }

    @Override // defpackage.acra
    public final void p(acrs acrsVar) {
        if (this.b.c.d) {
            InteractionLoggingScreen a = this.c.a(acrsVar);
            if (a != null) {
                this.b.g(a);
                this.c.c(a);
            }
            InteractionLoggingScreen a2 = this.c.a(acrsVar);
            if (a2 != null) {
                this.b.h(a2);
            }
        }
    }

    @Override // defpackage.acra
    public final void q(acsa acsaVar, asht ashtVar) {
        if (acsaVar == null) {
            zga.l("null VE container encountered in logHidden");
            return;
        }
        acrr acrrVar = this.d;
        awav awavVar = acsaVar.a;
        if (awavVar == null) {
            return;
        }
        if (acsaVar.b != null) {
            acrrVar.c(new GelVisibilityUpdate.HiddenVisibilityUpdate(acsaVar, ashtVar));
        } else {
            acrrVar.c(new GelVisibilityUpdate.HiddenVisibilityUpdate(acre.a(awavVar), ashtVar));
        }
    }

    @Override // defpackage.acra
    public final void r(String str) {
        acre acreVar = this.b;
        InteractionLoggingScreen c = c();
        if (acreVar.m(c)) {
            acreVar.p(c, acre.o(c.f), str);
        }
    }

    @Override // defpackage.acra
    public final void s(acsa acsaVar, String str) {
        this.b.p(c(), acsaVar.a, str);
    }

    @Override // defpackage.acra, defpackage.acsl
    public final void t() {
        this.b.f(c());
        this.c.c(c());
    }

    @Override // defpackage.acra, defpackage.acsm
    public final void u(acsa acsaVar, asht ashtVar) {
        adyu.ch(this.d, acsaVar, ashtVar);
    }

    @Override // defpackage.acra
    public final void v(aooy aooyVar, aomf aomfVar, asht ashtVar) {
        if (aooyVar == null) {
            return;
        }
        asuh cf = adyu.cf(aooyVar);
        if (cf != null) {
            aomfVar = cf.d;
        }
        if (aomfVar == null) {
            return;
        }
        acqx acqxVar = new acqx(aomfVar);
        acqxVar.b = cf;
        this.d.d(acqxVar, ashtVar);
    }

    @Override // defpackage.acra
    public final void w(acsa acsaVar, asht ashtVar) {
        if (acsaVar == null) {
            zga.l("null VE container encountered in logStateChange");
            return;
        }
        acre acreVar = this.b;
        InteractionLoggingScreen c = c();
        awav awavVar = acsaVar.a;
        if (!acreVar.n(c, awavVar) || ashtVar == null) {
            return;
        }
        acreVar.j(c.a, awavVar, ashtVar);
    }

    @Override // defpackage.acra
    public final void x(String str, acsa acsaVar, asht ashtVar) {
        this.b.j(str, acsaVar.a, ashtVar);
    }

    @Override // defpackage.acra
    public void y() {
        this.g = null;
        this.d.b();
        this.k.clear();
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            ((acra) it.next()).y();
        }
    }

    @Override // defpackage.acra
    public final void z(acrs acrsVar, InteractionLoggingScreen interactionLoggingScreen) {
        if (this.b.c.d) {
            InteractionLoggingScreen a = this.c.a(acrsVar);
            boolean z = false;
            if (a != null) {
                if (a.equals(interactionLoggingScreen)) {
                    this.c.c(a);
                    a = this.c.a(acrsVar);
                    z = true;
                }
                this.b.g(a);
            }
            this.c.d(acrsVar, interactionLoggingScreen);
            if (z) {
                return;
            }
            this.b.h(interactionLoggingScreen);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public acqq(ajkn ajknVar, ypa ypaVar, acre acreVar, acrj acrjVar, ajun ajunVar, acrz acrzVar, Context context, aaea aaeaVar, axzg axzgVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        acreVar.getClass();
        this.b = acreVar;
        ajknVar.getClass();
        this.h = ajknVar;
        ypaVar.getClass();
        this.a = ypaVar;
        this.d = new acrr(acreVar, this, acrzVar);
        this.c = acrjVar;
        ajunVar.getClass();
        this.i = ajunVar;
        this.j = new ArrayList();
        this.k = new HashMap();
        this.e = context;
        this.f = aaeaVar;
        if (acsb.a.get() <= 0) {
            acsb.a.set(2);
        }
        this.n = axzgVar;
        this.m = new acqy(axzgVar, null, null);
    }
}
