package defpackage;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mfx extends lo {
    private final acra c;
    private final aahd d;
    private boolean f;
    public final Map a = new HashMap();
    public final Set b = new HashSet();
    private final Rect e = new Rect();

    public mfx(acra acraVar, aahd aahdVar) {
        this.c = acraVar;
        this.d = aahdVar;
    }

    @Override // defpackage.lo
    public final void b(RecyclerView recyclerView, int i) {
        if (i == 1) {
            this.f = true;
        } else if (i == 0) {
            this.f = false;
        }
    }

    @Override // defpackage.lo
    public final void c(RecyclerView recyclerView, int i, int i2) {
        boolean z = false;
        if (this.f || (i == 0 && i2 == 0)) {
            z = true;
        }
        if (this.a.isEmpty() || !z) {
            return;
        }
        Iterator it = this.a.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            mfw mfwVar = (mfw) entry.getValue();
            if (mfwVar.a.isAttachedToWindow() && mfwVar.a.getGlobalVisibleRect(this.e)) {
                it.remove();
                this.b.add(entry.getKey());
                byte[] bArr = mfwVar.b;
                if (bArr != null) {
                    this.c.u(new acqx(bArr), null);
                }
                apxf apxfVar = mfwVar.c;
                if (apxfVar != null) {
                    this.d.c(apxfVar, null);
                }
            }
        }
    }

    public final void j(Object obj, View view, byte[] bArr, apxf apxfVar) {
        if (obj == null || view == null) {
            return;
        }
        if ((bArr == null && apxfVar == null) || this.b.contains(obj)) {
            return;
        }
        this.a.put(obj, new mfw(view, bArr, apxfVar));
    }
}
