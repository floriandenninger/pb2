package defpackage;

import android.view.View;
import com.google.android.apps.youtube.app.offline.ui.OfflineArrowView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class jri implements jrl {
    public final jre a;
    private final fjs b;
    private final azrw c;
    private final int d;
    private final String e;
    private final axzg f;

    public jri(axzg axzgVar, fjs fjsVar, azrw azrwVar, int i, String str, OfflineArrowView offlineArrowView, View.OnClickListener onClickListener, byte[] bArr, byte[] bArr2) {
        this.f = axzgVar;
        this.b = fjsVar;
        this.c = azrwVar;
        this.d = i;
        this.e = str;
        this.a = new jre(offlineArrowView, onClickListener, null);
    }

    @Override // defpackage.jrl
    public void a() {
        if (!c()) {
            this.a.g();
            return;
        }
        int i = this.d;
        if (i == 0) {
            String str = this.e;
            zhq.m(str);
            b(jqm.b(((agof) this.c.get()).a().m().e(str)));
        } else if (i == 1) {
            String str2 = this.e;
            zhq.m(str2);
            b(jqm.a(((agof) this.c.get()).a().i().d(str2)));
        } else if (i == 2) {
            String str3 = this.e;
            zhq.m(str3);
            b(jqm.a(((agof) this.c.get()).a().k().a(str3)));
        } else if (i != 3) {
            b(jqm.a(((agof) this.c.get()).a().m().f()));
        } else {
            b(jqm.a(((agof) this.c.get()).a().m().c()));
        }
    }

    @Override // defpackage.jrl
    public void b(jqm jqmVar) {
        if (!c() || jqmVar.a) {
            this.a.g();
            return;
        }
        if (jqmVar.b) {
            jre jreVar = this.a;
            int i = this.d != 0 ? R.string.accessibility_offline_button_remove_playlist : R.string.accessibility_offline_button_remove_video;
            jreVar.e();
            jreVar.b.d();
            jreVar.b.k();
            jreVar.f(i);
            return;
        }
        if (jqmVar.e) {
            jre jreVar2 = this.a;
            jreVar2.e();
            OfflineArrowView offlineArrowView = jreVar2.b;
            offlineArrowView.b(offlineArrowView.b);
            jreVar2.b.k();
            return;
        }
        jre jreVar3 = this.a;
        int i2 = jqmVar.f;
        boolean z = jqmVar.c;
        boolean z2 = jqmVar.d;
        jreVar3.e();
        if (z) {
            if (z2) {
                jreVar3.b.g();
            } else {
                jreVar3.b.h();
            }
            jreVar3.b.i(i2);
        } else {
            jreVar3.b.e();
            jreVar3.b.k();
        }
        jreVar3.f(R.string.accessibility_offline_button_cancel);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean c() {
        Boolean bool;
        int i = this.d;
        if (i == 1) {
            return this.b.j();
        }
        if (i == 2) {
            return this.b.m();
        }
        if (i == 3) {
            return this.b.k();
        }
        aqvj aqvjVar = this.f.b.b().C;
        if (aqvjVar == null) {
            aqvjVar = aqvj.a;
        }
        if (aqvjVar.a(45357487L)) {
            aoot aootVar = aqvjVar.b;
            if (!aootVar.containsKey(45357487L)) {
                throw new IllegalArgumentException();
            }
            aqvk aqvkVar = (aqvk) aootVar.get(45357487L);
            bool = Boolean.valueOf(aqvkVar.b == 1 ? ((Boolean) aqvkVar.c).booleanValue() : false);
        } else {
            bool = false;
        }
        if (bool.booleanValue()) {
            return this.b.h();
        }
        return this.b.h() && !this.b.n();
    }
}
