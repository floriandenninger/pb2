package defpackage;

import com.google.android.apps.youtube.app.ui.WatchUpsellDialogController;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lyu extends zgd {
    final /* synthetic */ fma a;
    final /* synthetic */ WatchUpsellDialogController b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lyu(WatchUpsellDialogController watchUpsellDialogController, fma fmaVar) {
        super("OfflineDialogListener");
        this.b = watchUpsellDialogController;
        this.a = fmaVar;
    }

    @Override // defpackage.zgd
    public final /* bridge */ /* synthetic */ Object a() {
        return new lyt(this);
    }
}
