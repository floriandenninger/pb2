package defpackage;

import android.content.Context;
import com.google.android.apps.youtube.app.ui.pivotbar.PivotBar;
import com.google.protos.youtube.api.innertube.UploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer;
import j$.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class ooz implements Function {
    public final /* synthetic */ opf a;
    private final /* synthetic */ int b;

    public /* synthetic */ ooz(opf opfVar, int i) {
        this.b = i;
        this.a = opfVar;
    }

    @Override // j$.util.function.Function
    public final /* synthetic */ Function andThen(Function function) {
        return this.b != 0 ? Function.CC.$default$andThen(this, function) : Function.CC.$default$andThen(this, function);
    }

    @Override // j$.util.function.Function
    public final /* synthetic */ Function compose(Function function) {
        return this.b != 0 ? Function.CC.$default$compose(this, function) : Function.CC.$default$compose(this, function);
    }

    @Override // j$.util.function.Function
    public final Object apply(Object obj) {
        if (this.b == 0) {
            return this.a.r(((Integer) obj).intValue());
        }
        opf opfVar = this.a;
        UploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer uploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer = (UploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer) obj;
        ajoy ajoyVar = opfVar.x;
        Context context = ((PivotBar) opfVar.q.get()).getContext();
        jlb jlbVar = (jlb) ajoyVar.a.get();
        jlbVar.getClass();
        context.getClass();
        uploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer.getClass();
        return new opp(jlbVar, context, uploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer, null);
    }
}
