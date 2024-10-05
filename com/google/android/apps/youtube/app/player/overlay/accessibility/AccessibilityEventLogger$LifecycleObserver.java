package com.google.android.apps.youtube.app.player.overlay.accessibility;

import android.accessibilityservice.AccessibilityServiceInfo;
import com.google.android.apps.youtube.app.player.overlay.accessibility.AccessibilityEventLogger$LifecycleObserver;
import defpackage.any;
import defpackage.aok;
import defpackage.ayqx;
import defpackage.ayrs;
import defpackage.azqb;
import defpackage.kfe;
import defpackage.kqg;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AccessibilityEventLogger$LifecycleObserver implements any {
    public final /* synthetic */ kqg a;
    private ayqx b;

    public AccessibilityEventLogger$LifecycleObserver(kqg kqgVar) {
        this.a = kqgVar;
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void lc(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void lg(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void lh(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void nu(aok aokVar) {
    }

    @Override // defpackage.aoa
    public final void nv(aok aokVar) {
        Object obj = this.b;
        if (obj != null) {
            azqb.f((AtomicReference) obj);
            this.b = null;
        }
    }

    @Override // defpackage.any, defpackage.aoa
    public final void ot(aok aokVar) {
        this.b = this.a.b.a().Y(new ayrs() { // from class: kqf
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                kqg kqgVar = AccessibilityEventLogger$LifecycleObserver.this.a;
                amru o = amru.o(zev.a(kqgVar.d.a).getEnabledAccessibilityServiceList(-1));
                int size = o.size();
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    i |= ((AccessibilityServiceInfo) o.get(i2)).feedbackType;
                }
                TreeSet treeSet = new TreeSet();
                while (i != 0) {
                    int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(i);
                    aotw aotwVar = aotw.ACCESSIBILITY_SERVICE_TYPES_UNSPECIFIED;
                    if (numberOfTrailingZeros == 1) {
                        aotwVar = aotw.ACCESSIBILITY_SERVICE_TYPES_FEEDBACK_SPOKEN;
                    } else if (numberOfTrailingZeros == 2) {
                        aotwVar = aotw.ACCESSIBILITY_SERVICE_TYPES_FEEDBACK_HAPTIC;
                    } else if (numberOfTrailingZeros == 4) {
                        aotwVar = aotw.ACCESSIBILITY_SERVICE_TYPES_FEEDBACK_AUDIBLE;
                    } else if (numberOfTrailingZeros == 8) {
                        aotwVar = aotw.ACCESSIBILITY_SERVICE_TYPES_FEEDBACK_VISUAL;
                    } else if (numberOfTrailingZeros == 16) {
                        aotwVar = aotw.ACCESSIBILITY_SERVICE_TYPES_FEEDBACK_GENERIC;
                    } else if (numberOfTrailingZeros == 32) {
                        aotwVar = aotw.ACCESSIBILITY_SERVICE_TYPES_FEEDBACK_BRAILLE;
                    }
                    treeSet.add(aotwVar);
                    i &= numberOfTrailingZeros ^ (-1);
                }
                arpn a = arpp.a();
                aotx a2 = aoty.a();
                a2.copyOnWrite();
                aoty.c((aoty) a2.instance, treeSet);
                a.copyOnWrite();
                ((arpp) a.instance).bU((aoty) a2.build());
                kqgVar.a.c((arpp) a.build());
            }
        }, kfe.s);
    }
}
