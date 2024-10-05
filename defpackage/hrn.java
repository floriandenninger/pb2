package defpackage;

import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.youtube.app.extensions.upload.UploadActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hrn implements hrs {
    private final ci a;
    private final hrv b;

    public hrn(ci ciVar, hrv hrvVar) {
        this.a = ciVar;
        this.b = hrvVar;
    }

    @Override // defpackage.hrs
    public final void a(hru hruVar) {
        Intent intent = new Intent(this.a.getApplicationContext(), (Class<?>) UploadActivity.class);
        intent.setAction("com.google.android.youtube.intent.action.INTERNAL_UPLOAD");
        intent.putExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_upload_flow_source", hruVar.a.k);
        intent.setDataAndType(hruVar.b, "video/*");
        intent.putExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_hide_preview", true);
        Uri uri = hruVar.c;
        if (uri != null) {
            intent.putExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_edited_video_uri", uri);
        }
        int i = hruVar.o;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        intent.putExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_upload_flow_flavor", i2);
        String str = hruVar.e;
        if (str != null) {
            intent.putExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_shorts_project_path", str);
        }
        Long l = hruVar.f;
        if (l != null) {
            intent.putExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_video_duration_ms", l.longValue());
        }
        if (hruVar.d != null) {
            aong aongVar = (aong) apxf.a.createBuilder();
            aongVar.e(atmb.b, hruVar.d);
            intent.putExtra("navigation_endpoint", ((apxf) aongVar.build()).toByteArray());
        }
        awaf awafVar = hruVar.j;
        if (awafVar != null) {
            intent.putExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_video_shorts_creation", awafVar.toByteArray());
        }
        if (hruVar.k) {
            intent.putExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_uses_yt_audio_source", true);
        }
        if (hruVar.l) {
            intent.putExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_is_shorts_eligible", true);
        }
        avuj avujVar = this.b.a.a().h;
        if (avujVar == null) {
            avujVar = avuj.a;
        }
        int i3 = 0;
        if (avujVar.w) {
            intent.putExtra("navigate_to_my_uploads", false);
        }
        String str2 = hruVar.m;
        if (str2 != null) {
            intent.putExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_frontend_upload_id", str2);
        }
        String str3 = hruVar.g;
        if (str3 != null) {
            intent.putExtra("com.google.android.libraries.youtube.upload.extra_upload_flow_logging_nonce", str3);
        }
        amru amruVar = hruVar.i;
        if (amruVar != null) {
            int[] iArr = new int[amruVar.size()];
            amru amruVar2 = hruVar.i;
            int size = amruVar2.size();
            int i4 = 0;
            while (i3 < size) {
                iArr[i4] = ((autl) amruVar2.get(i3)).q;
                i3++;
                i4++;
            }
            intent.putExtra("com.google.android.libraries.youtube.upload.extra_upload_creation_surfaces", iArr);
        }
        String str4 = hruVar.h;
        if (str4 != null && !str4.isEmpty()) {
            intent.putExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_preset_pending_upload_video_thumbnail_path", hruVar.h);
        }
        String str5 = hruVar.n;
        if (str5 != null) {
            intent.putExtra("android.intent.extra.TITLE", str5);
        }
        this.a.startActivityForResult(intent, 902);
    }
}
