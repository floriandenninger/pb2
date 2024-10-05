package defpackage;

import android.app.Activity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mqd implements ajom {
    private final ViewGroup a;
    private final ViewGroup b;
    private final ViewGroup c;
    private final fwi d;
    private final fte e;
    private ftd f;
    private final jgp g;

    public mqd(Activity activity, jgp jgpVar, fwi fwiVar, fte fteVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.g = jgpVar;
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(activity).inflate(R.layout.item_section_menu_header, (ViewGroup) null);
        this.a = viewGroup;
        this.c = (ViewGroup) viewGroup.findViewById(R.id.sub_menu_container);
        this.d = fwiVar;
        this.e = fteVar;
        this.b = (ViewGroup) viewGroup.findViewById(R.id.buttons_view);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        aone aoneVar;
        askc askcVar = (askc) obj;
        if ((askcVar.b & 8) != 0) {
            aske askeVar = askcVar.d;
            if (askeVar == null) {
                askeVar = aske.a;
            }
            auwh auwhVar = askeVar.c;
            if (auwhVar == null) {
                auwhVar = auwh.a;
            }
            aoneVar = auwhVar.toBuilder();
        } else {
            aoneVar = null;
        }
        aone builder = askcVar.toBuilder();
        this.c.removeAllViews();
        if (aoneVar != null) {
            if (this.f == null) {
                this.f = this.e.c(this.a);
            }
            if (((auwh) aoneVar.instance).d.isEmpty()) {
                aqyg aqygVar = ((askc) builder.instance).c;
                if (aqygVar == null) {
                    aqygVar = aqyg.a;
                }
                if (!TextUtils.isEmpty(ajcq.b(aqygVar))) {
                    aqyg aqygVar2 = ((askc) builder.instance).c;
                    if (aqygVar2 == null) {
                        aqygVar2 = aqyg.a;
                    }
                    String obj2 = ajcq.b(aqygVar2).toString();
                    aoneVar.copyOnWrite();
                    auwh auwhVar2 = (auwh) aoneVar.instance;
                    obj2.getClass();
                    auwhVar2.b |= 1;
                    auwhVar2.d = obj2;
                    aske askeVar2 = ((askc) builder.instance).d;
                    if (askeVar2 == null) {
                        askeVar2 = aske.a;
                    }
                    aone builder2 = askeVar2.toBuilder();
                    builder2.copyOnWrite();
                    aske askeVar3 = (aske) builder2.instance;
                    auwh auwhVar3 = (auwh) aoneVar.build();
                    auwhVar3.getClass();
                    askeVar3.c = auwhVar3;
                    askeVar3.b |= 1;
                    builder.copyOnWrite();
                    askc askcVar2 = (askc) builder.instance;
                    aske askeVar4 = (aske) builder2.build();
                    askeVar4.getClass();
                    askcVar2.d = askeVar4;
                    askcVar2.b |= 8;
                }
            }
            this.f.oB(ajokVar, (auwh) aoneVar.build());
            this.c.addView(this.f.c);
        }
        List<apmh> unmodifiableList = Collections.unmodifiableList(((askc) builder.instance).e);
        if (unmodifiableList.isEmpty()) {
            this.b.setVisibility(8);
        } else {
            this.b.setVisibility(0);
            HashMap hashMap = new HashMap(1);
            hashMap.put("sectionListController", ajokVar.c("sectionListController"));
            this.b.removeAllViews();
            for (apmh apmhVar : unmodifiableList) {
                if ((apmhVar.b & 1) != 0) {
                    frg d = this.g.d(null, hashMap);
                    apmg apmgVar = apmhVar.c;
                    if (apmgVar == null) {
                        apmgVar = apmg.a;
                    }
                    d.oB(ajokVar, apmgVar);
                    this.b.addView(d.b);
                }
            }
        }
        this.d.a(builder.build(), this.a);
    }
}
