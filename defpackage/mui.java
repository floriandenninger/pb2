package defpackage;

import android.widget.CompoundButton;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class mui implements CompoundButton.OnCheckedChangeListener {
    final /* synthetic */ keg a;
    final /* synthetic */ mul b;

    public mui(mul mulVar, keg kegVar) {
        this.b = mulVar;
        this.a = kegVar;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.a.e(z);
        muk mukVar = this.b.b;
        if (mukVar != null) {
            mukVar.a(z);
        }
    }
}
