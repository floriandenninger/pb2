package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yab implements View.OnClickListener {
    final /* synthetic */ apyv a;
    final /* synthetic */ apxj b;
    final /* synthetic */ boolean c;
    final /* synthetic */ acra d;
    final /* synthetic */ Map e;
    final /* synthetic */ ImageView f;
    final /* synthetic */ TextView g;
    final /* synthetic */ Map h;
    final /* synthetic */ ImageView i;
    final /* synthetic */ yae j;
    private final /* synthetic */ int k;

    public yab(yae yaeVar, apyv apyvVar, apxj apxjVar, boolean z, acra acraVar, Map map, ImageView imageView, TextView textView, Map map2, ImageView imageView2, int i) {
        this.k = i;
        this.j = yaeVar;
        this.a = apyvVar;
        this.b = apxjVar;
        this.c = z;
        this.d = acraVar;
        this.e = map;
        this.f = imageView;
        this.g = textView;
        this.h = map2;
        this.i = imageView2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        apxf apxfVar;
        apxf apxfVar2;
        if (this.k != 0) {
            if (!this.j.c.o()) {
                this.j.d.b();
                return;
            }
            aone builder = this.j.b.b(this.a.i, this.b, this.c).toBuilder();
            aone builder2 = this.j.b.a(this.a.i, this.b, this.c).toBuilder();
            apmp apmpVar = (apmp) builder.instance;
            boolean z = apmpVar.e;
            if ((z && (apmpVar.b & 16384) != 0) || (!z && (apmpVar.b & 512) != 0)) {
                if (z) {
                    apxfVar2 = apmpVar.p;
                    if (apxfVar2 == null) {
                        apxfVar2 = apxf.a;
                    }
                } else {
                    apxfVar2 = apmpVar.k;
                    if (apxfVar2 == null) {
                        apxfVar2 = apxf.a;
                    }
                }
                aone createBuilder = aupf.a.createBuilder();
                String k = this.d.k();
                createBuilder.copyOnWrite();
                aupf aupfVar = (aupf) createBuilder.instance;
                k.getClass();
                aupfVar.b |= 1;
                aupfVar.c = k;
                aupf aupfVar2 = (aupf) createBuilder.build();
                aong aongVar = (aong) apxfVar2.toBuilder();
                aongVar.e(aupg.b, aupfVar2);
                apxf apxfVar3 = (apxf) aongVar.build();
                if (z) {
                    builder.copyOnWrite();
                    apmp apmpVar2 = (apmp) builder.instance;
                    apxfVar3.getClass();
                    apmpVar2.p = apxfVar3;
                    apmpVar2.b |= 16384;
                    z = true;
                } else {
                    builder.copyOnWrite();
                    apmp apmpVar3 = (apmp) builder.instance;
                    apxfVar3.getClass();
                    apmpVar3.k = apxfVar3;
                    apmpVar3.b |= 512;
                    z = false;
                }
                this.j.a.c(apxfVar3, this.e);
            }
            builder.copyOnWrite();
            apmp apmpVar4 = (apmp) builder.instance;
            apmpVar4.b |= 8;
            apmpVar4.e = true ^ z;
            builder2.copyOnWrite();
            apmp apmpVar5 = (apmp) builder2.instance;
            apmpVar5.b |= 8;
            apmpVar5.e = false;
            apmp apmpVar6 = (apmp) builder.build();
            apmp apmpVar7 = (apmp) builder2.build();
            yae.c(apmpVar6, this.f, this.g, this.h);
            yae.a(apmpVar7, this.i, this.h);
            this.j.b.h(this.a.i, this.b.h, apmpVar6, apmpVar7);
            return;
        }
        if (!this.j.c.o()) {
            this.j.d.b();
            return;
        }
        aone builder3 = this.j.b.b(this.a.i, this.b, this.c).toBuilder();
        aone builder4 = this.j.b.a(this.a.i, this.b, this.c).toBuilder();
        apmp apmpVar8 = (apmp) builder4.instance;
        boolean z2 = apmpVar8.e;
        if ((z2 && (apmpVar8.b & 16384) != 0) || (!z2 && (apmpVar8.b & 512) != 0)) {
            if (z2) {
                apxfVar = apmpVar8.p;
                if (apxfVar == null) {
                    apxfVar = apxf.a;
                }
            } else {
                apxfVar = apmpVar8.k;
                if (apxfVar == null) {
                    apxfVar = apxf.a;
                }
            }
            aone createBuilder2 = aupf.a.createBuilder();
            String k2 = this.d.k();
            createBuilder2.copyOnWrite();
            aupf aupfVar3 = (aupf) createBuilder2.instance;
            k2.getClass();
            aupfVar3.b |= 1;
            aupfVar3.c = k2;
            aupf aupfVar4 = (aupf) createBuilder2.build();
            aong aongVar2 = (aong) apxfVar.toBuilder();
            aongVar2.e(aupg.b, aupfVar4);
            apxf apxfVar4 = (apxf) aongVar2.build();
            if (z2) {
                builder4.copyOnWrite();
                apmp apmpVar9 = (apmp) builder4.instance;
                apxfVar4.getClass();
                apmpVar9.p = apxfVar4;
                apmpVar9.b |= 16384;
                z2 = true;
            } else {
                builder4.copyOnWrite();
                apmp apmpVar10 = (apmp) builder4.instance;
                apxfVar4.getClass();
                apmpVar10.k = apxfVar4;
                apmpVar10.b |= 512;
                z2 = false;
            }
            this.j.a.c(apxfVar4, this.e);
        }
        builder3.copyOnWrite();
        apmp apmpVar11 = (apmp) builder3.instance;
        apmpVar11.b |= 8;
        apmpVar11.e = false;
        builder4.copyOnWrite();
        apmp apmpVar12 = (apmp) builder4.instance;
        apmpVar12.b |= 8;
        apmpVar12.e = true ^ z2;
        apmp apmpVar13 = (apmp) builder3.build();
        apmp apmpVar14 = (apmp) builder4.build();
        yae.c(apmpVar13, this.f, this.g, this.h);
        yae.a(apmpVar14, this.i, this.h);
        this.j.b.h(this.a.i, this.b.h, apmpVar13, apmpVar14);
    }
}
