package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import com.google.android.youtube.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class akzb extends zgd {
    final /* synthetic */ akzg a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akzb(akzg akzgVar) {
        super("NotificationBuilderLazy");
        this.a = akzgVar;
    }

    @Override // defpackage.zgd
    protected final /* bridge */ /* synthetic */ Object a() {
        akzg akzgVar = this.a;
        if (Build.VERSION.SDK_INT >= 24) {
            Context context = akzgVar.a;
            whl.v(context, "UploadNotifications", context.getString(R.string.upload_notification_channel));
        }
        if (akzgVar.c == null) {
            akzgVar.c = "";
        }
        if (akzgVar.d == null) {
            akzgVar.d = "";
        }
        if (akzgVar.e == null) {
            akzgVar.e = "";
        }
        akzgVar.b = null;
        akzgVar.f = -2;
        int color = akzgVar.a.getResources().getColor(R.color.upload_color_primary);
        dy dyVar = new dy(akzgVar.a);
        dyVar.r(R.drawable.quantum_ic_video_youtube_white_24);
        dyVar.q(0, 0, true);
        dyVar.z = color;
        dyVar.i("");
        dyVar.j("");
        dyVar.k("");
        dyVar.l = true;
        Bitmap bitmap = akzgVar.b;
        if (bitmap != null) {
            dyVar.n(bitmap);
        }
        whl.w(dyVar, "UploadNotifications");
        return dyVar;
    }
}
