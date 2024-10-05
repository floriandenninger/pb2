package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.youtube.app.extensions.upload.EditVideoActivity;
import com.google.protos.youtube.api.innertube.EditVideoMetadataEndpointOuterClass$EditVideoMetadataEndpoint;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class exf implements aaha {
    public final ypa a;
    private final Context b;
    private final ykz c;

    public exf(Context context, ykz ykzVar, ypa ypaVar) {
        this.b = context;
        this.c = ykzVar;
        this.a = ypaVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        Context context = this.b;
        String str = ((EditVideoMetadataEndpointOuterClass$EditVideoMetadataEndpoint) apxfVar.pX(EditVideoMetadataEndpointOuterClass$EditVideoMetadataEndpoint.editVideoMetadataEndpoint)).c;
        aomf aomfVar = apxfVar.c;
        str.getClass();
        Intent intent = new Intent(context, (Class<?>) EditVideoActivity.class);
        intent.setAction("android.intent.action.EDIT");
        intent.putExtra("video_id", str);
        if (!aomfVar.H()) {
            intent.putExtra("click_tracking_params", aomfVar.I());
        }
        this.c.a(intent, 0, new ykj() { // from class: exe
            @Override // defpackage.ykj
            public final void kD(int i, int i2, Intent intent2) {
                exf exfVar = exf.this;
                if (intent2 == null || !intent2.getBooleanExtra("refresh_my_videos", false)) {
                    return;
                }
                exfVar.a.d(new gob());
            }
        });
    }
}
