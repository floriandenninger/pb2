package defpackage;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import com.google.protos.youtube.api.innertube.MenuEndpointOuterClass$MenuEndpoint;
import j$.util.Optional;
import j$.util.function.Supplier;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gru implements aaha {
    public static final /* synthetic */ int a = 0;
    private final ci b;
    private final aahd c;
    private final ajut d;
    private final lyp e;
    private final acqz f;
    private final aalw g;
    private final ajdh h;
    private final lru i;
    private final ajoy j;

    public gru(ci ciVar, aahd aahdVar, ajut ajutVar, ajoy ajoyVar, lyp lypVar, acqz acqzVar, aalw aalwVar, lru lruVar, ajdh ajdhVar, byte[] bArr, byte[] bArr2) {
        ciVar.getClass();
        this.b = ciVar;
        aahdVar.getClass();
        this.c = aahdVar;
        ajutVar.getClass();
        this.d = ajutVar;
        this.j = ajoyVar;
        this.e = lypVar;
        this.f = acqzVar;
        this.g = aalwVar;
        this.i = lruVar;
        this.h = ajdhVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        atdh atdhVar;
        aqyg aqygVar;
        atdh atdhVar2;
        atdf atdfVar = ((MenuEndpointOuterClass$MenuEndpoint) apxfVar.pX(MenuEndpointOuterClass$MenuEndpoint.menuEndpoint)).c;
        if (atdfVar == null) {
            atdfVar = atdf.a;
        }
        if ((atdfVar.b & 1) != 0) {
            atdf atdfVar2 = ((MenuEndpointOuterClass$MenuEndpoint) apxfVar.pX(MenuEndpointOuterClass$MenuEndpoint.menuEndpoint)).c;
            if (atdfVar2 == null) {
                atdfVar2 = atdf.a;
            }
            atdc atdcVar = atdfVar2.c;
            if (atdcVar == null) {
                atdcVar = atdc.a;
            }
            atdc atdcVar2 = atdcVar;
            View view = (View) yjj.u(map, "com.google.android.libraries.youtube.rendering.elements.sender_view", View.class);
            Object s = yjj.s(map, "com.google.android.libraries.youtube.innertube.endpoint.tag");
            if (atdcVar2.k || ((Boolean) Optional.ofNullable((Bundle) yjj.u(map, "com.google.android.libraries.youtube.innertube.bundle", Bundle.class)).map(ght.k).orElse(false)).booleanValue()) {
                ajxw.b(this.b, atdcVar2, this.c, this.d, map, this.f, this.g, this.i);
                return;
            }
            if (view == null) {
                ci ciVar = this.b;
                aahd aahdVar = this.c;
                ajut ajutVar = this.d;
                ajoy ajoyVar = this.j;
                fsc fscVar = new fsc(atdcVar2, aahdVar, this.h, s);
                AlertDialog.Builder builder = new AlertDialog.Builder(ciVar);
                atdi atdiVar = atdcVar2.d;
                if (atdiVar == null) {
                    atdiVar = atdi.a;
                }
                if (atdiVar.b == 82258301) {
                    atdhVar = (atdh) atdiVar.c;
                } else {
                    atdhVar = atdh.a;
                }
                aqyg aqygVar2 = null;
                if ((atdhVar.b & 1) != 0) {
                    atdi atdiVar2 = atdcVar2.d;
                    if (atdiVar2 == null) {
                        atdiVar2 = atdi.a;
                    }
                    if (atdiVar2.b == 82258301) {
                        atdhVar2 = (atdh) atdiVar2.c;
                    } else {
                        atdhVar2 = atdh.a;
                    }
                    aqygVar = atdhVar2.c;
                    if (aqygVar == null) {
                        aqygVar = aqyg.a;
                    }
                } else {
                    aqygVar = null;
                }
                CharSequence b = ajcq.b(aqygVar);
                if (b != null) {
                    builder.setTitle(b);
                }
                if (atdcVar2.c.size() > 0) {
                    ajnq ajnqVar = new ajnq();
                    ajnqVar.f(atda.class, new fsb(ciVar, ajutVar));
                    ajoa e = ajoyVar.e(ajnqVar);
                    ajpd ajpdVar = new ajpd();
                    Iterator it = atdcVar2.c.iterator();
                    while (it.hasNext()) {
                        ajpdVar.add((atda) it.next());
                    }
                    e.h(ajpdVar);
                    builder.setAdapter(e, fscVar);
                }
                atcv atcvVar = atdcVar2.e;
                if (atcvVar == null) {
                    atcvVar = atcv.a;
                }
                atcu atcuVar = atcvVar.b;
                if (atcuVar == null) {
                    atcuVar = atcu.a;
                }
                if ((atcuVar.b & 1) != 0) {
                    atcv atcvVar2 = atdcVar2.e;
                    if (atcvVar2 == null) {
                        atcvVar2 = atcv.a;
                    }
                    atcu atcuVar2 = atcvVar2.b;
                    if (atcuVar2 == null) {
                        atcuVar2 = atcu.a;
                    }
                    aqygVar2 = atcuVar2.c;
                    if (aqygVar2 == null) {
                        aqygVar2 = aqyg.a;
                    }
                }
                CharSequence b2 = ajcq.b(aqygVar2);
                if (b2 != null) {
                    builder.setNegativeButton(b2, fscVar);
                }
                builder.setCancelable(true);
                fscVar.j(builder.create());
                fscVar.k();
                return;
            }
            lyp lypVar = this.e;
            Optional ofNullable = Optional.ofNullable((acra) yjj.u(map, "com.google.android.libraries.youtube.logging.interaction_logger", acra.class));
            final acqz acqzVar = this.f;
            acqzVar.getClass();
            lypVar.a(atdcVar2, view, s, (acra) ofNullable.orElseGet(new Supplier() { // from class: grt
                @Override // j$.util.function.Supplier
                public final Object get() {
                    return acqz.this.mM();
                }
            }));
        }
    }
}
