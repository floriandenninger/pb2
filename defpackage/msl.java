package defpackage;

import android.content.Context;
import android.view.ViewStub;
import android.widget.ImageView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class msl extends gae {
    private final Context a;

    public msl(ViewStub viewStub, Context context) {
        super(viewStub);
        this.a = context;
    }

    public final void a(apkc apkcVar) {
        ImageView imageView = (ImageView) this.f;
        if (apkcVar == null) {
            if (!this.e || imageView == null) {
                return;
            }
            imageView.setVisibility(8);
            return;
        }
        ImageView imageView2 = (ImageView) c();
        imageView2.setVisibility(0);
        int bu = anaf.bu(apkcVar.c);
        if (bu == 0) {
            bu = 1;
        }
        int i = bu - 1;
        if (i == 0) {
            imageView2.setImageResource(R.drawable.ic_privacy_private);
            imageView2.setContentDescription(this.a.getString(R.string.video_privacy_private_description));
        } else if (i != 2) {
            imageView2.setImageResource(R.drawable.ic_privacy_public);
            imageView2.setContentDescription(this.a.getString(R.string.video_privacy_public_description));
        } else {
            imageView2.setImageResource(R.drawable.ic_privacy_unlisted);
            imageView2.setContentDescription(this.a.getString(R.string.video_privacy_unlisted_description));
        }
    }

    public msl(ImageView imageView, Context context) {
        super(imageView);
        this.a = context;
    }
}
