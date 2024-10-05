package defpackage;

import android.content.Context;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.CaptionPickerEndpointOuterClass$CaptionPickerEndpoint;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gqe implements aaha, ykl {
    private final Context a;
    private final ainy b;
    private final kde c;
    private final ahxr d;
    private final acqz e;

    public gqe(Context context, ainy ainyVar, kde kdeVar, acqz acqzVar) {
        this.a = context;
        this.b = ainyVar;
        kdeVar.getClass();
        this.c = kdeVar;
        this.d = new ahxr(context);
        this.e = acqzVar;
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        whu.K(this.a, R.string.no_subtitles, 1);
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        this.d.c((List) obj2, new jge(this.b, 1), this.e);
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        CaptionPickerEndpointOuterClass$CaptionPickerEndpoint captionPickerEndpointOuterClass$CaptionPickerEndpoint = (CaptionPickerEndpointOuterClass$CaptionPickerEndpoint) apxfVar.pX(CaptionPickerEndpointOuterClass$CaptionPickerEndpoint.captionPickerEndpoint);
        if ((captionPickerEndpointOuterClass$CaptionPickerEndpoint.b & 1) == 0 || !captionPickerEndpointOuterClass$CaptionPickerEndpoint.c.equals(this.c.g())) {
            whu.K(this.a, R.string.error_selecting_subtitles, 1);
        } else {
            this.b.C(this);
        }
    }
}
