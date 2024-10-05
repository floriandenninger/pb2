package defpackage;

import com.google.android.apps.youtube.app.ui.inline.DefaultInlinePlayerControls;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mgz extends fks {
    public boolean a;
    final /* synthetic */ DefaultInlinePlayerControls b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mgz(DefaultInlinePlayerControls defaultInlinePlayerControls, fln flnVar) {
        super(flnVar);
        this.b = defaultInlinePlayerControls;
    }

    @Override // defpackage.flm
    public final void kG() {
        this.a = false;
        DefaultInlinePlayerControls defaultInlinePlayerControls = this.b;
        if (defaultInlinePlayerControls.c == null || defaultInlinePlayerControls.a != 0) {
            return;
        }
        defaultInlinePlayerControls.h();
    }

    @Override // defpackage.flm
    public final void kH() {
        this.a = true;
    }
}
