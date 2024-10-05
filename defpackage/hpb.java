package defpackage;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.common.media.ShortsVideoMetadata;
import com.google.android.libraries.video.editablevideo.EditableVideoEdits;
import com.google.android.libraries.video.media.VideoMetaData;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hpb extends hpa {
    public final Uri a;
    public vsy b;
    public long c;

    public hpb(vsy vsyVar, Uri uri, long j, String str) {
        this.b = vsyVar;
        this.a = uri;
        this.c = j;
        this.k = str;
    }

    @Override // defpackage.hpa
    public final vsy H() {
        return this.b;
    }

    @Override // defpackage.hpa
    public final ammv d() {
        hfs e = ShortsVideoMetadata.e();
        vsy vsyVar = this.b;
        if (vsyVar != null) {
            VideoMetaData videoMetaData = vsyVar.b;
            long l = vsyVar.l();
            long n = this.b.n();
            e.c(videoMetaData.a);
            e.d(TimeUnit.MICROSECONDS.toMillis(l - n));
            e.b(videoMetaData.e);
            e.e(videoMetaData.d);
        }
        return ammv.j(e.a());
    }

    @Override // defpackage.hpa
    public final String o() {
        return "TrimDraft";
    }

    @Override // defpackage.hpa
    public final void w(Bundle bundle) {
        super.w(bundle);
        vsy vsyVar = this.b;
        if (vsyVar != null) {
            VideoMetaData videoMetaData = vsyVar.b;
            try {
                EditableVideoEdits editableVideoEdits = vsyVar.a;
                vvd vvdVar = new vvd();
                vvdVar.a = videoMetaData.a;
                vvdVar.h = videoMetaData.g;
                vvdVar.e = videoMetaData.e;
                vvdVar.d = videoMetaData.d;
                vvdVar.i = new long[]{0};
                vsyVar = new vsy(editableVideoEdits, vvdVar.a());
            } catch (IOException unused) {
                zga.b("Error shrinking editable video, returning source video");
            }
            bundle.putParcelable("EDITABLE_VIDEO_EDITS_KEY", vsyVar.a);
            bundle.putParcelable("EDITABLE_VIDEO_METADATA_KEY", vsyVar.b);
        }
        bundle.putParcelable("SOURCE_VIDEO_URI_KEY", this.a);
        bundle.putLong("TIMELINE_WINDOW_START_US_KEY", this.c);
    }
}
