package defpackage;

import android.app.Activity;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.libraries.youtube.metadataeditor.geo.LocationSearchView;
import com.google.android.libraries.youtube.metadataeditor.geo.Place;
import com.google.android.libraries.youtube.rendering.ui.permissions.PermissionDescriptor;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hzu implements afoi, icp {
    public static final amrz a = amrz.l(axcz.LOCATION_NORMAL, Integer.valueOf(R.style.NormalDynamicSticker), axcz.LOCATION_LIGHT, Integer.valueOf(R.style.LightDynamicSticker));
    public static final axcz b = axcz.LOCATION_NORMAL;
    public final Activity c;
    public final icq d;
    public final boolean e;
    public final iax f;
    public akam g;
    public LocationSearchView h;
    public afol i;
    public ce j;
    public acra k;
    public aulq l;
    public boolean m;
    public hyq n;
    public final ajyw o;
    private final akai p;
    private final agcm q;
    private final wcy r;
    private final axze s;

    public hzu(ajyw ajywVar, Activity activity, icq icqVar, aaea aaeaVar, agcm agcmVar, wcy wcyVar, iax iaxVar, axze axzeVar, akai akaiVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.o = ajywVar;
        this.c = activity;
        this.d = icqVar;
        this.q = agcmVar;
        this.r = wcyVar;
        this.f = iaxVar;
        this.s = axzeVar;
        this.p = akaiVar;
        boolean z = false;
        if (aaeaVar.a() != null) {
            astj astjVar = aaeaVar.a().c;
            if ((astjVar == null ? astj.a : astjVar).k) {
                z = true;
            }
        }
        this.e = z;
    }

    private final View g(String str, int i) {
        View inflate = LayoutInflater.from(new ContextThemeWrapper(this.c, i)).inflate(R.layout.location_sticker, new FrameLayout(this.c));
        ((TextView) inflate.findViewById(R.id.text)).setText(str);
        return inflate;
    }

    private final void h(Place place, axcz axczVar, axdj axdjVar, final boolean z) {
        axcy axcyVar;
        axcy axcyVar2;
        aone builder = ((axdk) axdjVar.instance).i().toBuilder();
        axdi i = ((axdk) axdjVar.instance).i();
        if (i.c == 3) {
            axcyVar = (axcy) i.d;
        } else {
            axcyVar = axcy.a;
        }
        aone builder2 = axcyVar.toBuilder();
        String str = place.a;
        builder2.copyOnWrite();
        axcy axcyVar3 = (axcy) builder2.instance;
        str.getClass();
        axcyVar3.b |= 2;
        axcyVar3.d = str;
        String str2 = place.b;
        builder2.copyOnWrite();
        axcy axcyVar4 = (axcy) builder2.instance;
        str2.getClass();
        axcyVar4.b |= 4;
        axcyVar4.e = str2;
        axdi i2 = ((axdk) axdjVar.instance).i();
        if (i2.c == 3) {
            axcyVar2 = (axcy) i2.d;
        } else {
            axcyVar2 = axcy.a;
        }
        axcx axcxVar = axcyVar2.f;
        if (axcxVar == null) {
            axcxVar = axcx.b;
        }
        aone builder3 = axcxVar.toBuilder();
        builder3.copyOnWrite();
        axcx axcxVar2 = (axcx) builder3.instance;
        axcxVar2.d = axczVar.d;
        axcxVar2.c |= 1;
        builder2.copyOnWrite();
        axcy axcyVar5 = (axcy) builder2.instance;
        axcx axcxVar3 = (axcx) builder3.build();
        axcxVar3.getClass();
        axcyVar5.f = axcxVar3;
        axcyVar5.b |= 8;
        builder.copyOnWrite();
        axdi axdiVar = (axdi) builder.instance;
        axcy axcyVar6 = (axcy) builder2.build();
        axcyVar6.getClass();
        axdiVar.d = axcyVar6;
        axdiVar.c = 3;
        axdjVar.copyOnWrite();
        ((axdk) axdjVar.instance).F((axdi) builder.build());
        etx.aq(this.c, this.r, g(place.b, ((Integer) a.get(axczVar)).intValue()), axdjVar, new ici() { // from class: hzs
            @Override // defpackage.ici
            public final void a(axdj axdjVar2) {
                hzu hzuVar = hzu.this;
                boolean z2 = z;
                hzuVar.d.aI(axdjVar2);
                if (z2) {
                    hzuVar.f.d(axdjVar2);
                }
            }
        });
    }

    @Override // defpackage.icp
    public final void a(axcg axcgVar) {
        axcy axcyVar;
        axcy axcyVar2;
        axcy axcyVar3;
        this.k.I(3, new acqx(acsb.c(65452)), null);
        axdi i = axcgVar.c().i();
        if (i.c == 3) {
            axcyVar = (axcy) i.d;
        } else {
            axcyVar = axcy.a;
        }
        Place place = new Place(axcyVar.d, axcyVar.e);
        axcx axcxVar = axcyVar.f;
        if (axcxVar == null) {
            axcxVar = axcx.b;
        }
        aonw aonwVar = new aonw(axcxVar.e, axcx.a);
        axcx axcxVar2 = axcyVar.f;
        if (axcxVar2 == null) {
            axcxVar2 = axcx.b;
        }
        axcz b2 = axcz.b(axcxVar2.d);
        if (b2 == null) {
            b2 = axcz.LOCATION_STYLE_UNSPECIFIED;
        }
        axcz axczVar = (axcz) iam.a(aonwVar, b2);
        final aone builder = axcgVar.toBuilder();
        axdj axdjVar = (axdj) ((axcg) builder.instance).c().toBuilder();
        aone builder2 = ((axdk) axdjVar.instance).i().toBuilder();
        axdi i2 = ((axdk) axdjVar.instance).i();
        if (i2.c == 3) {
            axcyVar2 = (axcy) i2.d;
        } else {
            axcyVar2 = axcy.a;
        }
        aone builder3 = axcyVar2.toBuilder();
        String str = place.a;
        builder3.copyOnWrite();
        axcy axcyVar4 = (axcy) builder3.instance;
        str.getClass();
        axcyVar4.b |= 2;
        axcyVar4.d = str;
        String str2 = place.b;
        builder3.copyOnWrite();
        axcy axcyVar5 = (axcy) builder3.instance;
        str2.getClass();
        axcyVar5.b |= 4;
        axcyVar5.e = str2;
        axdi i3 = ((axdk) axdjVar.instance).i();
        if (i3.c == 3) {
            axcyVar3 = (axcy) i3.d;
        } else {
            axcyVar3 = axcy.a;
        }
        axcx axcxVar3 = axcyVar3.f;
        if (axcxVar3 == null) {
            axcxVar3 = axcx.b;
        }
        aone builder4 = axcxVar3.toBuilder();
        builder4.copyOnWrite();
        axcx axcxVar4 = (axcx) builder4.instance;
        axcxVar4.d = axczVar.d;
        axcxVar4.c |= 1;
        builder3.copyOnWrite();
        axcy axcyVar6 = (axcy) builder3.instance;
        axcx axcxVar5 = (axcx) builder4.build();
        axcxVar5.getClass();
        axcyVar6.f = axcxVar5;
        axcyVar6.b |= 8;
        builder2.copyOnWrite();
        axdi axdiVar = (axdi) builder2.instance;
        axcy axcyVar7 = (axcy) builder3.build();
        axcyVar7.getClass();
        axdiVar.d = axcyVar7;
        axdiVar.c = 3;
        axdjVar.copyOnWrite();
        ((axdk) axdjVar.instance).F((axdi) builder2.build());
        etx.aq(this.c, this.r, g(place.b, ((Integer) a.get(axczVar)).intValue()), axdjVar, new ici() { // from class: hzr
            @Override // defpackage.ici
            public final void a(axdj axdjVar2) {
                hzu hzuVar = hzu.this;
                aone aoneVar = builder;
                aoneVar.copyOnWrite();
                ((axcg) aoneVar.instance).e((axdk) axdjVar2.build());
                hzuVar.d.aT(aoneVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final akam c() {
        return new akam(akal.e(this.j), this.k, Arrays.asList(new PermissionDescriptor(3, acsb.c(51847), acsb.c(51848))), R.string.reel_permission_open_settings_location, R.string.reel_permissions_missing_location, new Runnable() { // from class: hzt
            @Override // java.lang.Runnable
            public final void run() {
                hzu.this.f();
            }
        }, bqc.d, this.p);
    }

    @Override // defpackage.afoi
    public final void d() {
        this.h.setVisibility(8);
    }

    @Override // defpackage.afoi
    public final void e(Place place) {
        this.q.h(this.l, this.j);
        this.h.setVisibility(8);
        this.n.a();
        this.k.n(new acqx(acsb.c(65452)));
        aone createBuilder = axcy.a.createBuilder();
        ArrayList arrayList = new ArrayList();
        arrayList.add(axcz.LOCATION_NORMAL);
        arrayList.add(axcz.LOCATION_LIGHT);
        aone createBuilder2 = axcx.b.createBuilder();
        createBuilder2.copyOnWrite();
        axcx axcxVar = (axcx) createBuilder2.instance;
        aonu aonuVar = axcxVar.e;
        if (!aonuVar.c()) {
            axcxVar.e = aonm.mutableCopy(aonuVar);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            axcxVar.e.g(((axcz) it.next()).d);
        }
        axcz axczVar = b;
        createBuilder2.copyOnWrite();
        axcx axcxVar2 = (axcx) createBuilder2.instance;
        axcxVar2.d = axczVar.d;
        axcxVar2.c |= 1;
        createBuilder.copyOnWrite();
        axcy axcyVar = (axcy) createBuilder.instance;
        axcx axcxVar3 = (axcx) createBuilder2.build();
        axcxVar3.getClass();
        axcyVar.f = axcxVar3;
        axcyVar.b = 8 | axcyVar.b;
        axdj j = axdk.j();
        aone createBuilder3 = axdi.a.createBuilder();
        boolean z = this.m;
        createBuilder3.copyOnWrite();
        axdi axdiVar = (axdi) createBuilder3.instance;
        axdiVar.b |= 4096;
        axdiVar.e = z;
        createBuilder3.copyOnWrite();
        axdi axdiVar2 = (axdi) createBuilder3.instance;
        axcy axcyVar2 = (axcy) createBuilder.build();
        axcyVar2.getClass();
        axdiVar2.d = axcyVar2;
        axdiVar2.c = 3;
        boolean u = this.s.u();
        createBuilder3.copyOnWrite();
        axdi axdiVar3 = (axdi) createBuilder3.instance;
        axdiVar3.b |= 8192;
        axdiVar3.f = u;
        j.copyOnWrite();
        ((axdk) j.instance).F((axdi) createBuilder3.build());
        h(place, axczVar, j, true);
    }

    public final void f() {
        this.h.setVisibility(0);
        this.i.a();
    }

    @Override // defpackage.icp
    public final void my(axdk axdkVar) {
        axcy axcyVar;
        this.k.I(3, new acqx(acsb.c(65452)), null);
        axdi i = axdkVar.i();
        if (i.c == 3) {
            axcyVar = (axcy) i.d;
        } else {
            axcyVar = axcy.a;
        }
        Place place = new Place(axcyVar.d, axcyVar.e);
        axcx axcxVar = axcyVar.f;
        if (axcxVar == null) {
            axcxVar = axcx.b;
        }
        aonw aonwVar = new aonw(axcxVar.e, axcx.a);
        axcx axcxVar2 = axcyVar.f;
        if (axcxVar2 == null) {
            axcxVar2 = axcx.b;
        }
        axcz b2 = axcz.b(axcxVar2.d);
        if (b2 == null) {
            b2 = axcz.LOCATION_STYLE_UNSPECIFIED;
        }
        h(place, (axcz) iam.a(aonwVar, b2), (axdj) axdkVar.toBuilder(), false);
    }
}
