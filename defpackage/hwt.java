package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Toast;
import com.google.android.libraries.youtube.edit.camera.CameraView;
import com.google.android.youtube.R;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hwt extends ce implements View.OnClickListener {
    public hws a;
    private View ae;
    private boolean af = false;
    private CameraView b;
    private ImageView c;
    private View d;
    private View e;

    @Override // defpackage.ce
    public final void X() {
        if (this.af) {
            this.b.B();
        }
        super.X();
    }

    @Override // defpackage.ce
    public final void Z() {
        super.Z();
        if (this.af) {
            this.b.w();
        }
    }

    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.cloneInContext(new ContextThemeWrapper(C(), R.style.ReelTheme_NoActionBar_FullScreen_Dark)).inflate(R.layout.reel_welcome_fragment, viewGroup, false);
        this.af = akai.h(C(), 1);
        ImageView imageView = (ImageView) viewGroup2.findViewById(R.id.reel_welcome_image);
        this.c = imageView;
        if (this.af) {
            CameraView cameraView = new CameraView(qR(), null);
            this.b = cameraView;
            cameraView.onFinishInflate();
            this.b.setId(R.id.reel_welcome_camera_view);
            CameraView cameraView2 = this.b;
            cameraView2.r = true;
            cameraView2.u(5);
            this.b.q(wcy.N(C()));
            this.b.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            viewGroup2.addView(this.b, 0);
        } else {
            imageView.setVisibility(0);
        }
        View findViewById = viewGroup2.findViewById(R.id.reel_welcome_learn_more);
        this.d = findViewById;
        findViewById.setOnClickListener(this);
        View findViewById2 = viewGroup2.findViewById(R.id.reel_welcome_close);
        this.e = findViewById2;
        findViewById2.setOnClickListener(this);
        View findViewById3 = viewGroup2.findViewById(R.id.reel_welcome_continue);
        this.ae = findViewById3;
        findViewById3.setOnClickListener(this);
        return viewGroup2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        hws hwsVar = this.a;
        hwsVar.getClass();
        if (view == this.e) {
            hwsVar.aM();
            return;
        }
        if (view == this.ae) {
            htu htuVar = (htu) hwsVar;
            if (htuVar.ba()) {
                htuVar.aW();
                return;
            } else {
                htuVar.aS();
                return;
            }
        }
        if (view == this.d) {
            try {
                qR().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format("%s?hl=%s", "https://support.google.com/youtube/answer/7568166", Locale.getDefault().getLanguage()))));
            } catch (ActivityNotFoundException unused) {
                Toast.makeText(C(), qX().getString(R.string.common_error_generic), 1).show();
            }
        }
    }
}
