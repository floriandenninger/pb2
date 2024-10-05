package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class hku implements View.OnClickListener {
    public final /* synthetic */ hkz a;

    public /* synthetic */ hku(hkz hkzVar) {
        this.a = hkzVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        hkz hkzVar = this.a;
        if (view == hkzVar.c || view == hkzVar.e) {
            acsc acscVar = hkzVar.d;
            if (acscVar != null) {
                hkzVar.l.a(acscVar).b();
            }
            zys zysVar = hkzVar.h;
            if (zysVar != null) {
                zysVar.G();
            }
        }
    }
}
