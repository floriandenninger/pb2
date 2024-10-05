package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class idm implements View.OnLayoutChangeListener {
    public final int a;
    public boolean b = true;
    public EditText c;
    public View d;
    public View e;
    public View f;

    public idm(Context context) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.reel_edit_continue_button_height);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.reel_edit_continue_button_margin_bottom) - context.getResources().getDimensionPixelSize(R.dimen.text_color_picker_height);
        this.a = dimensionPixelSize + dimensionPixelSize2 + dimensionPixelSize2;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i2 == i6 && i4 == i8) {
            return;
        }
        this.d.post(new Runnable() { // from class: idl
            @Override // java.lang.Runnable
            public final void run() {
                idm idmVar = idm.this;
                int height = ((idmVar.e.getHeight() - idmVar.f.getHeight()) - idmVar.c.getHeight()) / 2;
                if (idmVar.b) {
                    if (height <= idmVar.a) {
                        yny.z(idmVar.d, yny.h(yny.m(80), yny.k(idmVar.a)), FrameLayout.LayoutParams.class);
                        idmVar.b = false;
                        return;
                    }
                    return;
                }
                if (height > idmVar.a) {
                    yny.z(idmVar.d, yny.h(yny.m(16), yny.k(0)), FrameLayout.LayoutParams.class);
                    idmVar.b = true;
                }
            }
        });
    }
}
