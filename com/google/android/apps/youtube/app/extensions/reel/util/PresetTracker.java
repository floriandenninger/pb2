package com.google.android.apps.youtube.app.extensions.reel.util;

import android.os.Handler;
import android.os.Looper;
import com.google.android.apps.youtube.app.extensions.reel.util.PresetTracker;
import com.google.android.libraries.youtube.edit.filters.model.FilterMapTable$FilterDescriptor;
import defpackage.any;
import defpackage.aok;
import defpackage.idr;
import defpackage.vgz;
import defpackage.zor;
import defpackage.ztf;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class PresetTracker implements any {
    public final aok a;
    public final ztf b;
    protected final Handler c;
    protected String d;
    public boolean e;
    public String f;
    public final vgz g;

    public PresetTracker(aok aokVar, ztf ztfVar, vgz vgzVar) {
        this.a = aokVar;
        this.b = ztfVar;
        vgzVar.getClass();
        this.g = vgzVar;
        this.c = new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean k(String str, List list) {
        return FilterMapTable$FilterDescriptor.a(list, str) != null;
    }

    protected abstract void g();

    public abstract void h(idr idrVar, zor zorVar);

    public final void j(FilterMapTable$FilterDescriptor filterMapTable$FilterDescriptor) {
        if (filterMapTable$FilterDescriptor != null) {
            String str = this.f;
            if (str != null && !str.equals(filterMapTable$FilterDescriptor.a)) {
                this.e = true;
            }
            this.d = filterMapTable$FilterDescriptor.a;
        }
    }

    public final void l(final zor zorVar) {
        if (this.f != null || zorVar == null) {
            return;
        }
        this.c.post(new Runnable() { // from class: hxs
            @Override // java.lang.Runnable
            public final void run() {
                final PresetTracker presetTracker = PresetTracker.this;
                final zor zorVar2 = zorVar;
                ynm.n(presetTracker.a, presetTracker.g.a(), hue.h, new zfi() { // from class: hxr
                    @Override // defpackage.zfi
                    public final void a(Object obj) {
                        PresetTracker presetTracker2 = PresetTracker.this;
                        zor zorVar3 = zorVar2;
                        idr idrVar = (idr) obj;
                        if (idrVar != null) {
                            presetTracker2.h(idrVar, zorVar3);
                            String str = presetTracker2.f;
                            if (str != null) {
                                presetTracker2.b.c(str);
                            }
                        }
                    }
                });
            }
        });
    }

    @Override // defpackage.aoa
    public final void lc(aok aokVar) {
        if (this.e) {
            g();
        }
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void lg(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final void lh(aok aokVar) {
        aokVar.getLifecycle().c(this);
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void nu(aok aokVar) {
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void nv(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void ot(aok aokVar) {
    }
}
