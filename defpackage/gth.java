package defpackage;

import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class gth implements ammy {
    private boolean a = true;
    private final lkb b;

    public gth(lkb lkbVar, byte[] bArr) {
        this.b = lkbVar;
    }

    @Override // defpackage.ammy
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        boolean z = this.a && this.b.b((PaneDescriptor) obj);
        this.a = false;
        return z;
    }
}
