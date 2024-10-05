package defpackage;

import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcm implements ViewTreeObserver.OnPreDrawListener {
    private final WeakReference a;
    private final /* synthetic */ int b;

    public dcm(dce dceVar, int i) {
        this.b = i;
        this.a = new WeakReference(dceVar);
    }

    public dcm(dcn dcnVar, int i) {
        this.b = i;
        this.a = new WeakReference(dcnVar);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        int i = 0;
        if (this.b == 0) {
            dcn dcnVar = (dcn) this.a.get();
            if (dcnVar != null && !dcnVar.c.isEmpty()) {
                int b = dcnVar.b();
                int a = dcnVar.a();
                if (dcn.d(b, a)) {
                    ArrayList arrayList = new ArrayList(dcnVar.c);
                    int size = arrayList.size();
                    while (i < size) {
                        ((dck) arrayList.get(i)).g(b, a);
                        i++;
                    }
                    dcnVar.c();
                }
            }
            return true;
        }
        dce dceVar = (dce) this.a.get();
        if (dceVar != null && !dceVar.c.isEmpty()) {
            int b2 = dceVar.b();
            int a2 = dceVar.a();
            if (dce.d(b2, a2)) {
                ArrayList arrayList2 = new ArrayList(dceVar.c);
                int size2 = arrayList2.size();
                while (i < size2) {
                    ((dck) arrayList2.get(i)).g(b2, a2);
                    i++;
                }
                dceVar.c();
            }
        }
        return true;
    }
}
