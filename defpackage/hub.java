package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import com.google.android.libraries.youtube.edit.audioswap.ui.AudioCrossFadeView;
import com.google.android.libraries.youtube.edit.audioswap.ui.AudioTrackView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hub implements View.OnClickListener, hxg {
    public Context a;
    public View b;
    public AudioTrackView c;
    public AudioCrossFadeView d;
    public TextView e;
    public TextView f;
    public ImageButton g;
    public Button h;
    public Button i;
    public boolean j;
    public float k;
    public hua l;

    @Override // defpackage.hxg
    public final float a() {
        if (this.j) {
            return this.k;
        }
        return 0.0f;
    }

    @Override // defpackage.hxg
    public final float b() {
        if (this.j) {
            return 0.0f;
        }
        return this.k;
    }

    @Override // defpackage.hxg
    public final View c() {
        return this.b;
    }

    public final void d() {
        if (this.j) {
            gfw.z(this);
            this.j = false;
            whu.I(this.b, false);
        }
    }

    @Override // defpackage.hxg
    public final void e() {
    }

    @Override // defpackage.hxg
    public final void f() {
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == this.h) {
            ((hvc) this.l).by();
            return;
        }
        if (view != this.g) {
            if (view == this.i) {
                this.l.e();
            }
        } else {
            hvc hvcVar = (hvc) this.l;
            hvcVar.bz(null);
            hvcVar.ak.d();
            hvcVar.al.g(hvcVar.bs().F());
        }
    }
}
