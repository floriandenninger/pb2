package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ailq extends aema {
    private final ailv b;
    private final FormatStreamModel c;

    public ailq(aemg aemgVar, ailv ailvVar, FormatStreamModel formatStreamModel) {
        super(aemgVar);
        this.b = ailvVar;
        this.c = formatStreamModel;
    }

    @Override // defpackage.aema, defpackage.aemg
    public final void l(Context context, Uri uri, Map map, PlayerConfigModel playerConfigModel) {
        if (!wbs.an(uri)) {
            ailv ailvVar = this.b;
            FormatStreamModel formatStreamModel = this.c;
            String str = formatStreamModel.b;
            int e = formatStreamModel.e();
            String w = this.c.w();
            long j = this.c.j();
            long k = this.c.k();
            int i = ailr.a;
            ailt a = ailvVar.a("/exocache", str, e, w, j, k);
            a.b("s", uri.toString());
            uri = a.a();
        }
        this.a.l(context, uri, map, playerConfigModel);
    }
}
