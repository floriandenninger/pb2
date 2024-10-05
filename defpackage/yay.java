package defpackage;

import android.content.Intent;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yay implements ykj {
    public final afsy a;
    final Set b = new HashSet();
    final Set c = new HashSet();
    public final acpl d;
    public aomf e;
    public aomf f;
    public final ykz g;

    public yay(ykz ykzVar, afsy afsyVar, acpl acplVar) {
        this.g = ykzVar;
        this.a = afsyVar;
        this.d = acplVar;
    }

    public final void a(yav yavVar) {
        this.b.add(yavVar);
    }

    public final void c(yaw yawVar) {
        this.c.add(yawVar);
    }

    public final void d(yaw yawVar) {
        this.c.remove(yawVar);
    }

    @Override // defpackage.ykj
    public final void kD(int i, int i2, Intent intent) {
        if (i != 2000) {
            if (i != 2001) {
                return;
            }
            if (this.f != null) {
                acpl acplVar = this.d;
                yeo yeoVar = new yeo();
                yeoVar.a = this.f;
                arpn a = arpp.a();
                awfz a2 = yeoVar.a();
                a.copyOnWrite();
                ((arpp) a.instance).ey(a2);
                acplVar.c((arpp) a.build());
            }
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                yaw yawVar = (yaw) it.next();
                yawVar.d(intent == null ? false : intent.getBooleanExtra("familyChanged", false));
                if (yawVar.g()) {
                    it.remove();
                }
            }
            return;
        }
        if (intent == null || !intent.getBooleanExtra("familyChanged", false)) {
            if (this.e != null) {
                acpl acplVar2 = this.d;
                yeo yeoVar2 = new yeo();
                yeoVar2.a = this.e;
                arpn a3 = arpp.a();
                awfy b = yeoVar2.b();
                a3.copyOnWrite();
                ((arpp) a3.instance).eu(b);
                acplVar2.c((arpp) a3.build());
            }
            Iterator it2 = this.b.iterator();
            while (it2.hasNext()) {
                yav yavVar = (yav) it2.next();
                yavVar.d();
                yavVar.g();
                it2.remove();
            }
            return;
        }
        if (this.e != null) {
            acpl acplVar3 = this.d;
            yeo yeoVar3 = new yeo();
            yeoVar3.a = this.e;
            arpn a4 = arpp.a();
            awfy b2 = yeoVar3.b();
            a4.copyOnWrite();
            ((arpp) a4.instance).ew(b2);
            acplVar3.c((arpp) a4.build());
        }
        Iterator it3 = this.b.iterator();
        while (it3.hasNext()) {
            yav yavVar2 = (yav) it3.next();
            yavVar2.e();
            yavVar2.g();
            it3.remove();
        }
    }
}
