package defpackage;

import android.content.Context;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class mtm extends mtl {
    public mtm(Context context, ajjz ajjzVar, ajut ajutVar) {
        super(context, ajjzVar, ajutVar, R.layout.reel_shelf_creation_item);
    }

    @Override // defpackage.mtl, defpackage.ajpc
    protected final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        d(ajokVar, (ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer) obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.mtl
    /* renamed from: f */
    public final void d(ajok ajokVar, ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer reelShelfCreationRendererOuterClass$ReelShelfCreationRenderer) {
        super.d(ajokVar, reelShelfCreationRendererOuterClass$ReelShelfCreationRenderer);
        int intValue = ((Integer) ajokVar.d("width", -1)).intValue();
        if (intValue == -1 || this.d.getLayoutParams() == null) {
            return;
        }
        this.d.getLayoutParams().width = intValue;
    }
}
