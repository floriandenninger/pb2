package defpackage;

import android.view.View;
import com.google.protos.youtube.api.innertube.PendingReelUploadsBottomSheetRendererOuterClass$PendingReelUploadsBottomSheetRenderer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class inr extends zys {
    public final PendingReelUploadsBottomSheetRendererOuterClass$PendingReelUploadsBottomSheetRenderer a;
    public final ioj b;
    public final ajok c;

    public inr(ci ciVar, ioj iojVar, aulq aulqVar, ajok ajokVar) {
        super(ciVar, ciVar.getSupportFragmentManager(), null, false, false);
        this.b = iojVar;
        this.a = (PendingReelUploadsBottomSheetRendererOuterClass$PendingReelUploadsBottomSheetRenderer) aulqVar.pX(PendingReelUploadsBottomSheetRendererOuterClass$PendingReelUploadsBottomSheetRenderer.pendingReelUploadsBottomSheetRenderer);
        this.c = ajokVar;
    }

    @Override // defpackage.zys
    protected final View a() {
        return this.b.f;
    }

    @Override // defpackage.zys
    protected final CharSequence c() {
        aqyg aqygVar = this.a.c;
        if (aqygVar == null) {
            aqygVar = aqyg.a;
        }
        return ajcq.b(aqygVar);
    }
}
