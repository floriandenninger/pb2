package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class isa extends isc {
    public View a;
    public final /* synthetic */ isf b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public isa(isf isfVar) {
        super(isfVar);
        this.b = isfVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.isc
    public final void a(boolean z) {
        this.a.setVisibility(true != z ? 8 : 0);
    }
}
