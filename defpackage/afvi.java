package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class afvi implements ynl {
    public final /* synthetic */ afvw a;
    private final /* synthetic */ int b;

    public /* synthetic */ afvi(afvw afvwVar, int i) {
        this.b = i;
        this.a = afvwVar;
    }

    @Override // defpackage.ynl, defpackage.zfi
    public final void a(Object obj) {
        if (this.b == 0) {
            afvw afvwVar = this.a;
            if (((Boolean) obj).booleanValue()) {
                Iterator it = afvwVar.v().iterator();
                while (it.hasNext()) {
                    zga.g((String) it.next());
                }
                return;
            }
            return;
        }
        afvw afvwVar2 = this.a;
        if (((Boolean) obj).booleanValue()) {
            Iterator it2 = afvwVar2.v().iterator();
            while (it2.hasNext()) {
                zga.g((String) it2.next());
            }
        }
    }
}
