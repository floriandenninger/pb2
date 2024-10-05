package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahvu {
    private Drawable a;
    private ahvt b;
    private ahvt c;
    private ControlsState d;
    private ImageView e;
    private final Context f;

    public ahvu(ImageView imageView, Context context) {
        this(imageView, context, false);
    }

    public final void a(ControlsState controlsState) {
        ImageView imageView = this.e;
        imageView.getClass();
        this.c.getClass();
        this.b.getClass();
        Drawable drawable = imageView.getDrawable();
        ControlsState controlsState2 = this.d;
        boolean z = (controlsState2 == null || controlsState == null || controlsState.a != controlsState2.a) ? false : true;
        boolean z2 = drawable != null && drawable.isVisible();
        if (controlsState != null) {
            if (z && z2) {
                return;
            }
            if (controlsState.a == ahvo.PAUSED) {
                this.e.setContentDescription(this.f.getText(R.string.accessibility_play));
                ControlsState controlsState3 = this.d;
                if (controlsState3 == null || controlsState3.a != ahvo.PLAYING) {
                    this.c.b();
                } else {
                    this.c.a();
                }
            } else if (controlsState.a == ahvo.PLAYING) {
                this.e.setContentDescription(this.f.getText(R.string.accessibility_pause));
                ControlsState controlsState4 = this.d;
                if (controlsState4 == null || controlsState4.a != ahvo.PAUSED) {
                    this.b.b();
                } else {
                    this.b.a();
                }
            } else {
                this.e.setContentDescription(this.f.getText(R.string.accessibility_replay));
                ImageView imageView2 = this.e;
                if (this.a == null) {
                    this.a = aii.a(this.f, R.drawable.player_replay);
                }
                imageView2.setImageDrawable(this.a);
            }
            this.d = controlsState;
        }
    }

    public ahvu(ImageView imageView, Context context, boolean z) {
        context.getClass();
        this.f = context;
        imageView.getClass();
        this.e = imageView;
        this.b = new ahvt(imageView, R.drawable.player_play_pause_transition, R.drawable.player_pause, z);
        this.c = new ahvt(imageView, R.drawable.player_pause_play_transition, R.drawable.player_play, z);
    }
}
