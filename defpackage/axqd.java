package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import defpackage.aod;
import defpackage.aok;
import defpackage.axqd;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class axqd extends ContextWrapper {
    public ce a;
    public LayoutInflater b;
    public LayoutInflater c;
    private final aoi d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axqd(Context context, ce ceVar) {
        super(context);
        ayaw.r(context);
        aoi aoiVar = new aoi() { // from class: dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper$1
            @Override // defpackage.aoi
            public final void a(aok aokVar, aod aodVar) {
                if (aodVar == aod.ON_DESTROY) {
                    axqd axqdVar = axqd.this;
                    axqdVar.a = null;
                    axqdVar.b = null;
                    axqdVar.c = null;
                }
            }
        };
        this.d = aoiVar;
        this.b = null;
        this.a = ceVar;
        ceVar.X.b(aoiVar);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.c == null) {
            if (this.b == null) {
                this.b = (LayoutInflater) getBaseContext().getSystemService("layout_inflater");
            }
            this.c = this.b.cloneInContext(this);
        }
        return this.c;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public axqd(android.view.LayoutInflater r2, defpackage.ce r3) {
        /*
            r1 = this;
            defpackage.ayaw.r(r2)
            android.content.Context r0 = r2.getContext()
            defpackage.ayaw.r(r0)
            r1.<init>(r0)
            dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper$1 r0 = new dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper$1
            r0.<init>()
            r1.d = r0
            r1.b = r2
            r1.a = r3
            aom r2 = r3.X
            r2.b(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axqd.<init>(android.view.LayoutInflater, ce):void");
    }
}
