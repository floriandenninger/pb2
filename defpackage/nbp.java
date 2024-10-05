package defpackage;

import android.view.View;
import com.google.protos.youtube.api.innertube.PingingEndpointOuterClass$PingingEndpoint;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class nbp {
    protected final euv a;
    public Object b;
    public String c;
    private final aahd d;
    private final tdv e;
    private final View f;
    private String g;

    public nbp(aahd aahdVar, tdv tdvVar, euv euvVar, View view) {
        aahdVar.getClass();
        this.d = aahdVar;
        tdvVar.getClass();
        this.e = tdvVar;
        euvVar.getClass();
        this.a = euvVar;
        view.getClass();
        this.f = view;
    }

    public static amru a(List list) {
        List q;
        if (list.size() > 0) {
            q = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                aone createBuilder = asus.a.createBuilder();
                createBuilder.copyOnWrite();
                asus asusVar = (asus) createBuilder.instance;
                str.getClass();
                asusVar.b |= 1;
                asusVar.c = str;
                q.add((asus) createBuilder.build());
            }
        } else {
            q = amru.q();
        }
        aone createBuilder2 = PingingEndpointOuterClass$PingingEndpoint.a.createBuilder();
        createBuilder2.copyOnWrite();
        PingingEndpointOuterClass$PingingEndpoint pingingEndpointOuterClass$PingingEndpoint = (PingingEndpointOuterClass$PingingEndpoint) createBuilder2.instance;
        pingingEndpointOuterClass$PingingEndpoint.b |= 1;
        pingingEndpointOuterClass$PingingEndpoint.c = true;
        PingingEndpointOuterClass$PingingEndpoint pingingEndpointOuterClass$PingingEndpoint2 = (PingingEndpointOuterClass$PingingEndpoint) createBuilder2.build();
        aong aongVar = (aong) apxf.a.createBuilder();
        aongVar.e(PingingEndpointOuterClass$PingingEndpoint.pingingEndpoint, pingingEndpointOuterClass$PingingEndpoint2);
        aongVar.copyOnWrite();
        apxf apxfVar = (apxf) aongVar.instance;
        aony aonyVar = apxfVar.d;
        if (!aonyVar.c()) {
            apxfVar.d = aonm.mutableCopy(aonyVar);
        }
        aolo.addAll((Iterable) q, (List) apxfVar.d);
        return amru.r((apxf) aongVar.build());
    }

    protected final Map b(boolean z) {
        Map i = acrc.i(this.b, z);
        i.put("MacrosConverters.CustomConvertersKey", f());
        return i;
    }

    public final void c() {
        String str = this.g;
        if (str != null) {
            this.e.d(str);
        }
    }

    public final void d(acra acraVar, Object obj, String str, List list, aoxy aoxyVar, byte[] bArr) {
        obj.getClass();
        this.b = obj;
        this.c = str;
        if (bArr != null && bArr.length > 0) {
            acraVar.u(new acqx(bArr), null);
        }
        if (list != null) {
            nbq nbqVar = (nbq) this.a.c(this.c, nbq.class, "PPState", nbo.a, this.b);
            if (!nbqVar.a) {
                nbqVar.a = true;
                e(list, false);
            }
        }
        if (aoxyVar == null || aoxyVar.b.size() <= 0 || ammx.e(aoxyVar.e)) {
            this.g = null;
            return;
        }
        this.e.b(aoxyVar.e, this.f, new xmb(obj, aoxyVar, this.d));
        this.g = aoxyVar.e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void e(List list, boolean z) {
        if (list != null) {
            Map b = b(z);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                apxf apxfVar = (apxf) it.next();
                if (apxfVar != null) {
                    this.d.c(apxfVar, b);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public afxe[] f() {
        return new afxe[0];
    }

    public final void g(apxf apxfVar) {
        if (apxfVar != null) {
            this.d.c(apxfVar, b(true));
        }
    }
}
