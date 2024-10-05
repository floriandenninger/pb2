package defpackage;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rx extends un {
    final /* synthetic */ ry a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rx(ry ryVar, View view) {
        super(view);
        this.a = ryVar;
    }

    @Override // defpackage.un
    public final ri a() {
        rz rzVar = this.a.a.k;
        if (rzVar == null) {
            return null;
        }
        return rzVar.a();
    }

    @Override // defpackage.un
    public final boolean b() {
        this.a.a.m();
        return true;
    }

    @Override // defpackage.un
    public final boolean c() {
        sb sbVar = this.a.a;
        if (sbVar.m != null) {
            return false;
        }
        sbVar.k();
        return true;
    }
}
