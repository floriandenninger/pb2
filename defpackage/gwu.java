package defpackage;

import android.app.Activity;
import android.content.Intent;
import com.google.android.apps.youtube.app.extensions.accountlinking.UriFlowActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gwu implements alxs {
    public final UriFlowActivity a;
    public final gwt b;
    public int c = 1;
    private final wjz d;

    public gwu(UriFlowActivity uriFlowActivity, gwt gwtVar, alwk alwkVar, UriFlowActivity uriFlowActivity2, wjz wjzVar) {
        this.a = uriFlowActivity;
        this.b = gwtVar;
        this.d = wjzVar;
        alyg b = alyh.b(uriFlowActivity2);
        b.b(wkc.class);
        alwkVar.a(b.a()).c(this);
    }

    @Override // defpackage.alxs
    public final void a(alxq alxqVar) {
        this.d.b(3, 2, 2);
    }

    @Override // defpackage.alxs
    public final void b(Throwable th) {
        this.d.c(3, th);
        this.a.finish();
    }

    @Override // defpackage.alxs
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.alxs
    public final /* synthetic */ void d() {
        alta.y(this);
    }

    public final void e() {
        g(4);
    }

    public final void f() {
        g(3);
    }

    public final void g(int i) {
        apxf apxfVar;
        this.c = 5;
        gwt gwtVar = this.b;
        UriFlowActivity uriFlowActivity = this.a;
        int i2 = i - 1;
        if (i2 == 1) {
            apxfVar = gwtVar.c;
        } else if (i2 == 2) {
            apxfVar = gwtVar.d;
        } else if (i2 != 3) {
            zga.b("Unknown UriFlowResult");
            apxfVar = null;
        } else {
            apxfVar = gwtVar.e;
        }
        if (apxfVar != null) {
            String str = gwtVar.f;
            if (str != null) {
                try {
                    Intent intent = new Intent(uriFlowActivity, Class.forName(str).asSubclass(Activity.class));
                    intent.setFlags(603979776);
                    intent.putExtra("navigation_endpoint", apxfVar.toByteArray());
                    uriFlowActivity.startActivity(intent);
                } catch (ClassNotFoundException unused) {
                    throw new AssertionError("Unable to retrieve activity that started UriFlow.");
                }
            } else {
                zga.b("No activity name found");
            }
        }
        gwtVar.b = null;
        gwtVar.c = null;
        gwtVar.d = null;
        gwtVar.e = null;
        gwtVar.f = null;
        ynm.j(gwtVar.g.b(gbr.i, angq.a), angq.a, gwr.b);
        this.a.finish();
    }
}
