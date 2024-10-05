package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.libraries.youtube.logging.interaction.GelVisibilityUpdate;
import com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acre {
    public final ypa a;
    public final acpl b;
    public final asiu c;
    public final Map d;
    public final acrh e;
    public final acqn f;
    public final acql g;
    public final asui h;
    public final Object i = new Object();
    public final axzg j;

    public acre(Context context, ypa ypaVar, acpl acplVar, aadw aadwVar, Map map, acqn acqnVar, acrh acrhVar, acql acqlVar, aaea aaeaVar, axzg axzgVar, byte[] bArr, byte[] bArr2) {
        asiu asiuVar;
        arfd a;
        asui asuiVar;
        context.getClass();
        ypaVar.getClass();
        this.a = ypaVar;
        acplVar.getClass();
        this.b = acplVar;
        acqnVar.getClass();
        this.f = acqnVar;
        this.d = map;
        apwy b = aadwVar.b();
        if (b != null) {
            atej atejVar = b.k;
            if (((atejVar == null ? atej.a : atejVar).b & 2048) != 0) {
                atej atejVar2 = b.k;
                asiuVar = (atejVar2 == null ? atej.a : atejVar2).h;
                if (asiuVar == null) {
                    asiuVar = asiu.a;
                }
                this.c = asiuVar;
                this.e = acrhVar;
                this.g = acqlVar;
                a = aaeaVar.a();
                if (a != null || (a.b & 524288) == 0) {
                    aone createBuilder = asui.a.createBuilder();
                    createBuilder.copyOnWrite();
                    asui asuiVar2 = (asui) createBuilder.instance;
                    asuiVar2.b |= 64;
                    asuiVar2.i = false;
                    asuiVar = (asui) createBuilder.build();
                } else {
                    asuj asujVar = a.m;
                    asuiVar = (asujVar == null ? asuj.a : asujVar).e;
                    if (asuiVar == null) {
                        asuiVar = asui.a;
                    }
                }
                this.h = asuiVar;
                this.j = axzgVar;
            }
        }
        aone createBuilder2 = asiu.a.createBuilder();
        createBuilder2.copyOnWrite();
        asiu asiuVar2 = (asiu) createBuilder2.instance;
        asiuVar2.b |= 1;
        asiuVar2.c = true;
        asiuVar = (asiu) createBuilder2.build();
        this.c = asiuVar;
        this.e = acrhVar;
        this.g = acqlVar;
        a = aaeaVar.a();
        if (a != null) {
        }
        aone createBuilder3 = asui.a.createBuilder();
        createBuilder3.copyOnWrite();
        asui asuiVar22 = (asui) createBuilder3.instance;
        asuiVar22.b |= 64;
        asuiVar22.i = false;
        asuiVar = (asui) createBuilder3.build();
        this.h = asuiVar;
        this.j = axzgVar;
    }

    public static awav a(awav awavVar) {
        if (!r(awavVar) || (awavVar.b & 8) != 0) {
            return awavVar;
        }
        aone builder = awavVar.toBuilder();
        builder.copyOnWrite();
        awav awavVar2 = (awav) builder.instance;
        awavVar2.b |= 8;
        awavVar2.f = 0;
        return (awav) builder.build();
    }

    static boolean k(aomf aomfVar) {
        return (aomfVar == null || aomfVar.H()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean l(awav awavVar) {
        return k(awavVar.c) || r(awavVar);
    }

    public static final awav o(int i) {
        aone createBuilder = awav.a.createBuilder();
        createBuilder.copyOnWrite();
        awav awavVar = (awav) createBuilder.instance;
        awavVar.b |= 2;
        awavVar.d = i;
        createBuilder.copyOnWrite();
        awav awavVar2 = (awav) createBuilder.instance;
        awavVar2.b |= 8;
        awavVar2.f = 0;
        return (awav) createBuilder.build();
    }

    private static boolean r(awav awavVar) {
        return awavVar != null && awavVar.d > 0;
    }

    private final void s(InteractionLoggingScreen interactionLoggingScreen, int i) {
        if (interactionLoggingScreen == null) {
            return;
        }
        aone createBuilder = asgs.a.createBuilder();
        String str = interactionLoggingScreen.a;
        createBuilder.copyOnWrite();
        asgs asgsVar = (asgs) createBuilder.instance;
        str.getClass();
        asgsVar.b |= 1;
        asgsVar.c = str;
        createBuilder.copyOnWrite();
        asgs asgsVar2 = (asgs) createBuilder.instance;
        asgsVar2.f = i - 1;
        asgsVar2.b |= 8;
        awav o = o(interactionLoggingScreen.f);
        createBuilder.copyOnWrite();
        asgs asgsVar3 = (asgs) createBuilder.instance;
        o.getClass();
        asgsVar3.d = o;
        asgsVar3.b |= 2;
        asgs asgsVar4 = (asgs) createBuilder.build();
        arpn a = arpp.a();
        a.copyOnWrite();
        ((arpp) a.instance).ee(asgsVar4);
        d((arpp) a.build(), interactionLoggingScreen);
        this.e.c(asgsVar4);
    }

    public final void b(InteractionLoggingScreen interactionLoggingScreen, awav awavVar) {
        if (n(interactionLoggingScreen, awavVar)) {
            int i = interactionLoggingScreen.f;
            c(interactionLoggingScreen, a(awavVar), o(interactionLoggingScreen.f));
        }
    }

    public final void c(InteractionLoggingScreen interactionLoggingScreen, awav awavVar, awav awavVar2) {
        if (n(interactionLoggingScreen, awavVar, awavVar2)) {
            awav a = a(awavVar);
            awav a2 = a(awavVar2);
            if (this.j.s().booleanValue()) {
                synchronized (this.i) {
                    if (l(a) && interactionLoggingScreen.g(a)) {
                        return;
                    }
                    interactionLoggingScreen.d(a, a2);
                }
            } else if (l(a) && interactionLoggingScreen.g(a)) {
                return;
            } else {
                interactionLoggingScreen.d(a, a2);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(a);
            e(interactionLoggingScreen, a2, arrayList);
            this.e.b(a, a2, interactionLoggingScreen.a);
        }
    }

    public final void d(arpp arppVar, InteractionLoggingScreen interactionLoggingScreen) {
        acpl acplVar = this.b;
        if (this.c.f && interactionLoggingScreen != null && arppVar != null && !TextUtils.isEmpty(interactionLoggingScreen.a)) {
            arpn arpnVar = (arpn) arppVar.toBuilder();
            aone createBuilder = arpq.a.createBuilder();
            aone createBuilder2 = arpu.a.createBuilder();
            String str = interactionLoggingScreen.a;
            createBuilder2.copyOnWrite();
            arpu arpuVar = (arpu) createBuilder2.instance;
            str.getClass();
            arpuVar.b |= 1;
            arpuVar.c = str;
            int a = interactionLoggingScreen.a();
            createBuilder2.copyOnWrite();
            arpu arpuVar2 = (arpu) createBuilder2.instance;
            arpuVar2.b |= 2;
            arpuVar2.d = a;
            arpu arpuVar3 = (arpu) createBuilder2.build();
            createBuilder.copyOnWrite();
            arpq arpqVar = (arpq) createBuilder.instance;
            arpuVar3.getClass();
            arpqVar.d = arpuVar3;
            arpqVar.b |= 4;
            arpq arpqVar2 = (arpq) createBuilder.build();
            arpnVar.copyOnWrite();
            ((arpp) arpnVar.instance).cm(arpqVar2);
            arppVar = (arpp) arpnVar.build();
        }
        acplVar.c(arppVar);
    }

    public final void e(InteractionLoggingScreen interactionLoggingScreen, awav awavVar, List list) {
        awav a = a(awavVar);
        if (list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(a((awav) it.next()));
        }
        if (arrayList.isEmpty()) {
            return;
        }
        awav a2 = a(a);
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(a((awav) it2.next()));
        }
        aone createBuilder = asgq.a.createBuilder();
        String str = interactionLoggingScreen.a;
        createBuilder.copyOnWrite();
        asgq asgqVar = (asgq) createBuilder.instance;
        str.getClass();
        asgqVar.b |= 1;
        asgqVar.c = str;
        createBuilder.copyOnWrite();
        asgq asgqVar2 = (asgq) createBuilder.instance;
        a2.getClass();
        asgqVar2.d = a2;
        asgqVar2.b |= 2;
        createBuilder.copyOnWrite();
        asgq asgqVar3 = (asgq) createBuilder.instance;
        aony aonyVar = asgqVar3.e;
        if (!aonyVar.c()) {
            asgqVar3.e = aonm.mutableCopy(aonyVar);
        }
        aolo.addAll((Iterable) arrayList2, (List) asgqVar3.e);
        asgq asgqVar4 = (asgq) createBuilder.build();
        arpn a3 = arpp.a();
        a3.copyOnWrite();
        ((arpp) a3.instance).ec(asgqVar4);
        d((arpp) a3.build(), interactionLoggingScreen);
    }

    public final void f(InteractionLoggingScreen interactionLoggingScreen) {
        s(interactionLoggingScreen, 17);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(InteractionLoggingScreen interactionLoggingScreen) {
        s(interactionLoggingScreen, 9);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h(InteractionLoggingScreen interactionLoggingScreen) {
        aone createBuilder = asgt.a.createBuilder();
        String str = interactionLoggingScreen.a;
        createBuilder.copyOnWrite();
        asgt asgtVar = (asgt) createBuilder.instance;
        str.getClass();
        asgtVar.b |= 1;
        asgtVar.c = str;
        createBuilder.copyOnWrite();
        asgt asgtVar2 = (asgt) createBuilder.instance;
        asgtVar2.f = 4;
        asgtVar2.b |= 8;
        awav o = o(interactionLoggingScreen.f);
        createBuilder.copyOnWrite();
        asgt asgtVar3 = (asgt) createBuilder.instance;
        o.getClass();
        asgtVar3.d = o;
        asgtVar3.b |= 2;
        asgt asgtVar4 = (asgt) createBuilder.build();
        arpn a = arpp.a();
        a.copyOnWrite();
        ((arpp) a.instance).ef(asgtVar4);
        d((arpp) a.build(), interactionLoggingScreen);
        this.e.d(asgtVar4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i(InteractionLoggingScreen interactionLoggingScreen, GelVisibilityUpdate.HiddenVisibilityUpdate hiddenVisibilityUpdate) {
        if (q(hiddenVisibilityUpdate) && interactionLoggingScreen.h(hiddenVisibilityUpdate.c)) {
            interactionLoggingScreen.e(hiddenVisibilityUpdate);
            aone createBuilder = asgs.a.createBuilder();
            String str = interactionLoggingScreen.a;
            createBuilder.copyOnWrite();
            asgs asgsVar = (asgs) createBuilder.instance;
            str.getClass();
            asgsVar.b |= 1;
            asgsVar.c = str;
            int i = hiddenVisibilityUpdate.e;
            createBuilder.copyOnWrite();
            asgs asgsVar2 = (asgs) createBuilder.instance;
            asgsVar2.f = i - 1;
            asgsVar2.b |= 8;
            awav awavVar = hiddenVisibilityUpdate.c;
            createBuilder.copyOnWrite();
            asgs asgsVar3 = (asgs) createBuilder.instance;
            awavVar.getClass();
            asgsVar3.d = awavVar;
            asgsVar3.b |= 2;
            asht ashtVar = hiddenVisibilityUpdate.d;
            if (ashtVar != null) {
                createBuilder.copyOnWrite();
                asgs asgsVar4 = (asgs) createBuilder.instance;
                asgsVar4.e = ashtVar;
                asgsVar4.b |= 4;
            }
            asgs asgsVar5 = (asgs) createBuilder.build();
            amru amruVar = hiddenVisibilityUpdate.b;
            int size = amruVar.size();
            for (int i2 = 0; i2 < size; i2++) {
                asum asumVar = (asum) amruVar.get(i2);
                if (this.d.containsKey(asumVar)) {
                    ((acru) this.d.get(asumVar)).b();
                }
            }
            arpn a = arpp.a();
            a.copyOnWrite();
            ((arpp) a.instance).ee(asgsVar5);
            d((arpp) a.build(), interactionLoggingScreen);
            this.e.c(asgsVar5);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j(String str, awav awavVar, asht ashtVar) {
        if (str.isEmpty()) {
            zga.l("[InteractionLogging] csn is empty for state change event, please provide a valid csn");
            return;
        }
        awav a = a(awavVar);
        aone createBuilder = asgu.a.createBuilder();
        createBuilder.copyOnWrite();
        asgu asguVar = (asgu) createBuilder.instance;
        str.getClass();
        asguVar.b |= 1;
        asguVar.c = str;
        createBuilder.copyOnWrite();
        asgu asguVar2 = (asgu) createBuilder.instance;
        a.getClass();
        asguVar2.d = a;
        asguVar2.b |= 2;
        createBuilder.copyOnWrite();
        asgu asguVar3 = (asgu) createBuilder.instance;
        ashtVar.getClass();
        asguVar3.e = ashtVar;
        asguVar3.b |= 4;
        asgu asguVar4 = (asgu) createBuilder.build();
        arpn a2 = arpp.a();
        a2.copyOnWrite();
        ((arpp) a2.instance).eg(asguVar4);
        this.b.c((arpp) a2.build());
    }

    public final boolean m(InteractionLoggingScreen interactionLoggingScreen) {
        return this.c.c && interactionLoggingScreen != null;
    }

    public final boolean n(InteractionLoggingScreen interactionLoggingScreen, awav... awavVarArr) {
        if (!m(interactionLoggingScreen)) {
            return false;
        }
        for (awav awavVar : awavVarArr) {
            if (awavVar == null || (!k(awavVar.c) && awavVar.d <= 0)) {
                String.valueOf(String.valueOf(awavVar)).length();
                return false;
            }
        }
        return true;
    }

    public final void p(InteractionLoggingScreen interactionLoggingScreen, awav awavVar, String str) {
        if (n(interactionLoggingScreen, awavVar) && !TextUtils.isEmpty(str)) {
            if (!TextUtils.isEmpty(str) && interactionLoggingScreen.i.contains(str)) {
                return;
            }
            awav a = a(awavVar);
            aone createBuilder = asgn.a.createBuilder();
            String str2 = interactionLoggingScreen.a;
            createBuilder.copyOnWrite();
            asgn asgnVar = (asgn) createBuilder.instance;
            str2.getClass();
            asgnVar.b |= 4;
            asgnVar.e = str2;
            createBuilder.copyOnWrite();
            asgn asgnVar2 = (asgn) createBuilder.instance;
            a.getClass();
            asgnVar2.d = a;
            asgnVar2.b |= 2;
            createBuilder.copyOnWrite();
            asgn asgnVar3 = (asgn) createBuilder.instance;
            str.getClass();
            asgnVar3.b = 1 | asgnVar3.b;
            asgnVar3.c = str;
            asgn asgnVar4 = (asgn) createBuilder.build();
            arpn a2 = arpp.a();
            a2.copyOnWrite();
            ((arpp) a2.instance).du(asgnVar4);
            d((arpp) a2.build(), interactionLoggingScreen);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            interactionLoggingScreen.i.add(str);
        }
    }

    public final boolean q(GelVisibilityUpdate gelVisibilityUpdate) {
        if (!this.c.c) {
            return false;
        }
        awav awavVar = gelVisibilityUpdate.c;
        if (awavVar != null && (k(awavVar.c) || awavVar.d > 0)) {
            return gelVisibilityUpdate.e != 1;
        }
        String.valueOf(String.valueOf(awavVar)).length();
        return false;
    }
}
