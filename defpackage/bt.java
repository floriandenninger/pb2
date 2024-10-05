package defpackage;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bt implements aox {
    final /* synthetic */ bv a;

    public bt(bv bvVar) {
        this.a = bvVar;
    }

    @Override // defpackage.aox
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        if (((aok) obj) != null) {
            bv bvVar = this.a;
            if (bvVar.c) {
                View K = bvVar.K();
                if (K.getParent() == null) {
                    if (this.a.d != null) {
                        if (dd.W(3)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("DialogFragment ");
                            sb.append(this);
                            sb.append(" setting the content view on ");
                            sb.append(this.a.d);
                        }
                        this.a.d.setContentView(K);
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
        }
    }
}
