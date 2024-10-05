package defpackage;

import com.google.android.libraries.youtube.common.ui.swipelayout.SwipeLayout;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class zej implements zen {
    public final /* synthetic */ SwipeLayout a;
    private final /* synthetic */ int b;

    public /* synthetic */ zej(SwipeLayout swipeLayout, int i) {
        this.b = i;
        this.a = swipeLayout;
    }

    @Override // defpackage.zen
    public final Object a() {
        return this.b != 0 ? Integer.valueOf(-this.a.b()) : Integer.valueOf(this.a.a());
    }
}
