package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.PersistableBundle;
import android.text.SpannableString;
import android.text.style.TtsSpan;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.extensions.reel.edit.presenter.EditorButtonView;
import com.google.android.libraries.youtube.edit.ui.SegmentedControl;
import com.google.android.libraries.youtube.edit.ui.SegmentedControlSegment;
import com.google.android.youtube.R;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hey implements View.OnClickListener, zzi {
    public final SegmentedControl a;
    public float b;
    public hev c;
    private final Context d;
    private final EditorButtonView e;
    private final ArrayList f;
    private final CharSequence g;
    private final jqr h;

    public hey(Context context, EditorButtonView editorButtonView, SegmentedControl segmentedControl, jqr jqrVar, byte[] bArr) {
        context.getClass();
        this.d = context;
        editorButtonView.getClass();
        this.e = editorButtonView;
        editorButtonView.setOnClickListener(this);
        this.g = editorButtonView.getContentDescription();
        ArrayList arrayList = new ArrayList();
        Resources resources = context.getResources();
        TypedValue typedValue = new TypedValue();
        resources.getValue(R.dimen.shorts_speed_control_speed_very_slow, typedValue, true);
        float f = typedValue.getFloat();
        hew a = hex.a();
        a.e(f);
        a.b(resources.getString(R.string.shorts_speed_control_very_slow_label));
        a.f(resources.getString(R.string.shorts_speed_control_very_slow_text));
        a.d(R.drawable.ic_speed_0_3x_fill);
        a.c(b(resources, f));
        arrayList.add(a.a());
        resources.getValue(R.dimen.shorts_speed_control_speed_slow, typedValue, true);
        float f2 = typedValue.getFloat();
        hew a2 = hex.a();
        a2.e(f2);
        a2.b(resources.getString(R.string.shorts_speed_control_slow_label));
        a2.f(resources.getString(R.string.shorts_speed_control_slow_text));
        a2.d(R.drawable.ic_speed_0_5x_fill);
        a2.c(b(resources, f2));
        arrayList.add(a2.a());
        resources.getValue(R.dimen.shorts_speed_control_speed_normal, typedValue, true);
        this.b = typedValue.getFloat();
        hew a3 = hex.a();
        a3.e(this.b);
        a3.b(resources.getString(R.string.shorts_speed_control_normal_label));
        a3.f(resources.getString(R.string.shorts_speed_control_normal_text));
        a3.d(R.drawable.ic_speed_1x_fill);
        a3.c(b(resources, this.b));
        arrayList.add(a3.a());
        resources.getValue(R.dimen.shorts_speed_control_speed_fast, typedValue, true);
        float f3 = typedValue.getFloat();
        hew a4 = hex.a();
        a4.e(f3);
        a4.b(resources.getString(R.string.shorts_speed_control_fast_label));
        a4.f(resources.getString(R.string.shorts_speed_control_fast_text));
        a4.d(R.drawable.ic_speed_2x_fill);
        a4.c(b(resources, f3));
        arrayList.add(a4.a());
        resources.getValue(R.dimen.shorts_speed_control_speed_very_fast, typedValue, true);
        float f4 = typedValue.getFloat();
        hew a5 = hex.a();
        a5.e(f4);
        a5.b(resources.getString(R.string.shorts_speed_control_very_fast_label));
        a5.f(resources.getString(R.string.shorts_speed_control_very_fast_text));
        a5.d(R.drawable.ic_speed_3x_fill);
        a5.c(b(resources, f4));
        arrayList.add(a5.a());
        this.f = arrayList;
        segmentedControl.getClass();
        this.a = segmentedControl;
        segmentedControl.h = arrayList;
        this.h = jqrVar;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = arrayList.get(i);
            SegmentedControlSegment segmentedControlSegment = (SegmentedControlSegment) LayoutInflater.from(context).inflate(R.layout.shorts_camera_speed_template, (ViewGroup) null);
            hex hexVar = (hex) obj;
            SpannableString spannableString = new SpannableString(hexVar.c);
            spannableString.setSpan(new TtsSpan("android.type.verbatim", PersistableBundle.EMPTY), spannableString.length() - 1, spannableString.length(), 33);
            segmentedControlSegment.setText(spannableString);
            segmentedControlSegment.setTextOff(spannableString);
            segmentedControlSegment.setTextOn(spannableString);
            segmentedControlSegment.setContentDescription(hexVar.e);
            if (hexVar.a == this.b) {
                segmentedControlSegment.setChecked(true);
            }
            this.a.addView(segmentedControlSegment);
        }
        this.a.post(new Runnable() { // from class: heu
            @Override // java.lang.Runnable
            public final void run() {
                hey.this.a.setVisibility(8);
            }
        });
        this.a.g = this;
    }

    static String b(Resources resources, float f) {
        if (f % 1.0f == 0.0f) {
            return resources.getString(R.string.shorts_a11y_speed_control_variable_speed_whole_seconds_x, Integer.valueOf((int) f));
        }
        return resources.getString(R.string.shorts_a11y_speed_control_variable_speed_tenth_seconds_x, Float.valueOf(f));
    }

    private static void h(View view) {
        view.setPivotX(view.getWidth() / 2.0f);
        view.setPivotY(view.getHeight());
    }

    public final hex a() {
        int i = this.a.d;
        if (i >= 0) {
            return (hex) this.f.get(i);
        }
        return null;
    }

    public final void c() {
        hex a = a();
        if (a != null && a.a == this.b) {
            e(R.drawable.ic_speed_1x_stroke);
        }
        h(this.a);
        fhe.K(this.a, false);
        jqr jqrVar = this.h;
        if (jqrVar != null) {
            jqrVar.a(acsb.c(98571)).d();
        }
    }

    final void e(int i) {
        this.e.a(i);
    }

    public final void f() {
        hex a = a();
        if (a != null && a.a == this.b) {
            e(a.d);
        }
        h(this.a);
        fhe.K(this.a, true);
        jqr jqrVar = this.h;
        if (jqrVar != null) {
            jqrVar.a(acsb.c(98571)).e();
        }
    }

    @Override // defpackage.zzi
    public final void g() {
        if (this.a.getVisibility() == 0) {
            f();
        } else {
            c();
        }
    }

    @Override // defpackage.zzi
    public final void lQ(int i) {
        jqr jqrVar = this.h;
        if (jqrVar != null) {
            jqrVar.a(acsb.c(98571)).b();
        }
        hex hexVar = (hex) this.f.get(i);
        e(hexVar.d);
        if (hexVar.a != this.b) {
            this.e.setContentDescription(hexVar.e);
        } else {
            this.e.setContentDescription(this.g);
        }
        hev hevVar = this.c;
        if (hevVar != null) {
            hel helVar = (hel) hevVar;
            hds.a(helVar.aC, hexVar.b, helVar.av);
            helVar.ap.e = hexVar.a;
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == this.e) {
            jqr jqrVar = this.h;
            if (jqrVar != null) {
                jqrVar.a(acsb.c(96648)).b();
            }
            if (this.a.getVisibility() == 0) {
                c();
            } else {
                f();
            }
        }
    }
}
