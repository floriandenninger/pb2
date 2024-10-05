package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class htz implements View.OnClickListener, hxg {
    public Context a;
    public float b;
    public boolean c;
    public hty d;
    public TextView e;
    public TextView f;
    public View g;
    public acra h;

    @Override // defpackage.hxg
    public final float a() {
        if (this.c) {
            return 0.0f;
        }
        return this.b;
    }

    @Override // defpackage.hxg
    public final float b() {
        if (this.c) {
            return this.b;
        }
        return 0.0f;
    }

    @Override // defpackage.hxg
    public final View c() {
        return this.g;
    }

    public final void d() {
        if (this.c) {
            this.c = false;
            gfw.z(this);
        }
    }

    @Override // defpackage.hxg
    public final void e() {
        whu.I(this.g, this.c);
    }

    @Override // defpackage.hxg
    public final void f() {
    }

    public final void g(boolean z) {
        CharSequence text;
        if (!this.c) {
            this.c = true;
            whu.I(this.g, true);
            gfw.z(this);
        }
        if (z) {
            text = this.a.getResources().getText(R.string.reel_edit_unmute_audio_button_text);
            this.f.setText(text);
            this.f.setCompoundDrawablesRelativeWithIntrinsicBounds(R.drawable.quantum_ic_volume_up_white_24, 0, 0, 0);
        } else {
            text = this.a.getResources().getText(R.string.reel_edit_mute_audio_button_text);
            this.f.setText(text);
            this.f.setCompoundDrawablesRelativeWithIntrinsicBounds(R.drawable.quantum_ic_volume_off_white_24, 0, 0, 0);
        }
        this.f.setContentDescription(text);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view != this.e) {
            if (view == this.f) {
                this.d.d();
                d();
                this.h.I(3, new acqx(acsb.c(36854)), null);
                return;
            }
            return;
        }
        Object obj = this.d;
        if (((zxz) obj).aH.h != null) {
            ((hvc) obj).bg();
        } else {
            hvc hvcVar = (hvc) obj;
            hvcVar.onClick(hvcVar.ah.i);
            hvcVar.bf();
        }
        d();
    }
}
