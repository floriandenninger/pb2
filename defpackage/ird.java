package defpackage;

import android.widget.ImageView;
import com.google.android.apps.youtube.app.extensions.upload.UploadActivity;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ird extends ajjh {
    final /* synthetic */ UploadActivity a;

    public ird(UploadActivity uploadActivity) {
        this.a = uploadActivity;
    }

    @Override // defpackage.ajjh, defpackage.ajjx
    public final void a(ImageView imageView) {
        zga.l("Upload active account header thumbnail could not be loaded.");
        this.a.ad.setBackgroundResource(R.drawable.missing_avatar);
    }

    @Override // defpackage.ajjh, defpackage.ajjx
    public final void b(ImageView imageView) {
        this.a.ad.setBackground(null);
    }
}
