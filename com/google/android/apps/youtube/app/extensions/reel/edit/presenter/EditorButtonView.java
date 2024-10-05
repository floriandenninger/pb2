package com.google.android.apps.youtube.app.extensions.reel.edit.presenter;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.app.extensions.reel.edit.presenter.EditorButtonView;
import com.google.android.youtube.R;
import defpackage.acsb;
import defpackage.acsc;
import defpackage.hab;
import defpackage.hda;
import defpackage.hxa;
import defpackage.nz;
import defpackage.wcy;
import j$.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class EditorButtonView extends FrameLayout {
    public TextView a;
    public ImageView b;
    public hxa c;
    public acsc d;
    public String e;
    private final Context f;
    private ImageView g;
    private boolean h;
    private int i;
    private int j;
    private boolean k;

    public EditorButtonView(Context context) {
        this(context, null);
    }

    private final void e() {
        if (this.k) {
            return;
        }
        this.i = this.b.getLayoutParams().width;
        this.j = this.b.getLayoutParams().height;
    }

    public final void a(int i) {
        b(nz.b(this.f, i));
    }

    public final void b(Drawable drawable) {
        this.b.setImageDrawable(drawable);
        e();
    }

    public final void c(String str) {
        this.a.setText(str);
        setContentDescription(str);
    }

    public final void d(boolean z) {
        ImageView imageView = this.g;
        if (imageView != null) {
            imageView.setVisibility(true != z ? 8 : 0);
        }
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        hxa hxaVar = this.c;
        if (hxaVar == null || view != this) {
            return;
        }
        hda hdaVar = (hda) hxaVar;
        hdaVar.g();
        hdaVar.d(this);
        if (getVisibility() == 0) {
            if (hdaVar.f.contains(this) || (hdaVar.g.contains(this) && hdaVar.n == 1)) {
                if (hdaVar.p && this.a.getVisibility() != 0) {
                    hda.m(this);
                } else if (hdaVar.p && this.a.getVisibility() == 0) {
                    hda.l(this);
                }
            }
        }
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        this.a.setEnabled(z);
        wcy.x(getContext(), this.b, z);
    }

    @Override // android.view.View
    public final void setOnClickListener(final View.OnClickListener onClickListener) {
        super.setOnClickListener(new View.OnClickListener() { // from class: hwz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditorButtonView editorButtonView = EditorButtonView.this;
                View.OnClickListener onClickListener2 = onClickListener;
                hxa hxaVar = editorButtonView.c;
                if (hxaVar != null) {
                    String str = editorButtonView.e;
                    if (str != null) {
                        hda hdaVar = (hda) hxaVar;
                        if (((Integer) Map.EL.getOrDefault(hdaVar.h, str, 0)).intValue() != 2) {
                            hdaVar.h.put(editorButtonView.e, 2);
                            editorButtonView.d(false);
                            hda.j(hdaVar.q, hdaVar.h);
                        }
                    }
                    hda hdaVar2 = (hda) hxaVar;
                    if (editorButtonView != hdaVar2.e && editorButtonView != hdaVar2.d && hdaVar2.n == 1) {
                        hdaVar2.e();
                    }
                }
                if (onClickListener2 != null) {
                    onClickListener2.onClick(view);
                }
            }
        });
    }

    @Override // android.view.View
    public final void setPressed(boolean z) {
        int i;
        int i2;
        int i3;
        super.setPressed(z);
        this.k = z;
        int i4 = this.i;
        int i5 = this.j;
        int i6 = 0;
        if (this.h && z) {
            double max = Math.max(i4, i5);
            Double.isNaN(max);
            int max2 = Math.max(9, (int) (max * 0.06d));
            int i7 = this.j;
            i5 = i7 - max2;
            int i8 = this.i;
            int i9 = i8 - max2;
            i = max2 / 2;
            i2 = (i8 - i9) - i;
            i3 = (i7 - i5) - i;
            i4 = i9;
            i6 = i;
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.b.getLayoutParams();
        layoutParams.setMargins(i6, i, i2, i3);
        layoutParams.height = i5;
        layoutParams.width = i4;
        this.b.setLayoutParams(layoutParams);
        this.b.requestLayout();
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        getVisibility();
        super.setVisibility(i);
    }

    public EditorButtonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i;
        int i2;
        ImageView imageView;
        this.f = context;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, hab.b, 0, 0);
        int i3 = obtainStyledAttributes.getInt(2, 0);
        if (i3 != 1) {
            i = i3 != 2 ? R.layout.reel_editor_tool_button : R.layout.shorts_camera_tool_button;
        } else {
            this.h = true;
            i = R.layout.shorts_camera_toolbar_button;
        }
        LayoutInflater.from(context).inflate(i, this);
        this.a = (TextView) findViewById(R.id.editor_tool_button_text);
        this.b = (ImageView) findViewById(R.id.editor_tool_button_icon);
        if (i3 == 1) {
            imageView = (ImageView) findViewById(R.id.new_feature_indicator);
            i2 = 1;
        } else {
            i2 = i3;
            imageView = null;
        }
        this.g = imageView;
        if (attributeSet != null) {
            int resourceId = obtainStyledAttributes.getResourceId(3, -1);
            if (resourceId != -1) {
                this.b.setImageDrawable(nz.b(context, resourceId));
                e();
            }
            String string = obtainStyledAttributes.getString(1);
            if (string != null) {
                this.a.setText(string);
            } else {
                this.a.setVisibility(8);
            }
            setContentDescription(obtainStyledAttributes.getString(0));
            int integer = obtainStyledAttributes.getInteger(6, 0);
            if (integer != 0) {
                this.d = acsb.c(integer);
            }
            this.e = obtainStyledAttributes.getString(5);
            if (i2 == 1) {
                this.a.setVisibility(8);
            }
        }
        setOnClickListener(null);
    }
}
