package com.google.android.apps.youtube.app.common.endpoint;

import android.net.Uri;
import android.os.Looper;
import com.google.android.apps.youtube.app.common.endpoint.LoggingUrlsPingController;
import defpackage.acub;
import defpackage.afug;
import defpackage.afuh;
import defpackage.afxe;
import defpackage.afxf;
import defpackage.afxi;
import defpackage.aioc;
import defpackage.any;
import defpackage.aok;
import defpackage.asur;
import defpackage.asus;
import defpackage.ayqx;
import defpackage.ayrs;
import defpackage.azqb;
import defpackage.azrw;
import defpackage.eoo;
import defpackage.ffd;
import defpackage.wbs;
import defpackage.xhp;
import defpackage.yjj;
import defpackage.zga;
import defpackage.zjg;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class LoggingUrlsPingController implements any {
    public final ffd a;
    public final xhp b;
    private final azrw c;
    private final afuh d;
    private final Executor e;
    private final aioc f;
    private ayqx g;

    public LoggingUrlsPingController(azrw azrwVar, ffd ffdVar, xhp xhpVar, afuh afuhVar, Executor executor, aioc aiocVar) {
        this.c = azrwVar;
        this.a = ffdVar;
        this.b = xhpVar;
        this.d = afuhVar;
        this.e = executor;
        this.f = aiocVar;
    }

    public final Uri g(String str, Map map) {
        Uri aj = wbs.aj(str);
        if (aj == null) {
            return null;
        }
        afxe[] afxeVarArr = (afxe[]) yjj.u(map, "MacrosConverters.CustomConvertersKey", afxe[].class);
        try {
            return ((afxf) this.c.get()).a(aj, afxeVarArr != null ? (afxe[]) yjj.y(afxeVarArr, this.a) : new afxe[]{this.a});
        } catch (zjg unused) {
            String valueOf = String.valueOf(str);
            zga.l(valueOf.length() != 0 ? "Failed macro substitution for URI: ".concat(valueOf) : new String("Failed macro substitution for URI: "));
            return aj;
        }
    }

    public final void h(List list, Map map) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final asus asusVar = (asus) it.next();
            if (asusVar != null && (asusVar.b & 1) != 0) {
                final Uri g = g(asusVar.c, map);
                if (this.b.b(g)) {
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        this.e.execute(new Runnable() { // from class: ffg
                            @Override // java.lang.Runnable
                            public final void run() {
                                LoggingUrlsPingController loggingUrlsPingController = LoggingUrlsPingController.this;
                                Uri uri = g;
                                loggingUrlsPingController.i(loggingUrlsPingController.b.a(uri), asusVar);
                            }
                        });
                    } else {
                        i(this.b.a(g), asusVar);
                    }
                } else {
                    i(g, asusVar);
                }
            }
        }
    }

    public final void i(Uri uri, asus asusVar) {
        if (uri != null) {
            afug d = afuh.d("appendpointlogging");
            d.b(uri);
            d.d = false;
            d.a(new acub((asur[]) asusVar.d.toArray(new asur[0]), 0));
            this.d.a(d, afxi.b);
        }
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void lc(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final void lg(aok aokVar) {
        this.g = this.f.G().b.Y(new ayrs() { // from class: fff
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                LoggingUrlsPingController.this.a.a = ((ahef) obj).e();
            }
        }, eoo.h);
    }

    @Override // defpackage.any, defpackage.aoa
    public final void lh(aok aokVar) {
        Object obj = this.g;
        obj.getClass();
        azqb.f((AtomicReference) obj);
        this.g = null;
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
