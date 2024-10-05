package defpackage;

import android.view.View;
import androidx.mediarouter.app.MediaRouteExpandCollapseButton;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class boi implements View.OnClickListener {
    final /* synthetic */ MediaRouteExpandCollapseButton a;

    public boi(MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton) {
        this.a = mediaRouteExpandCollapseButton;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton = this.a;
        boolean z = !mediaRouteExpandCollapseButton.e;
        mediaRouteExpandCollapseButton.e = z;
        if (z) {
            mediaRouteExpandCollapseButton.setImageDrawable(mediaRouteExpandCollapseButton.a);
            this.a.a.start();
            MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton2 = this.a;
            mediaRouteExpandCollapseButton2.setContentDescription(mediaRouteExpandCollapseButton2.d);
        } else {
            mediaRouteExpandCollapseButton.setImageDrawable(mediaRouteExpandCollapseButton.b);
            this.a.b.start();
            MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton3 = this.a;
            mediaRouteExpandCollapseButton3.setContentDescription(mediaRouteExpandCollapseButton3.c);
        }
        View.OnClickListener onClickListener = this.a.f;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }
}
