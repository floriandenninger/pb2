package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.preference.Preference;
import com.google.android.youtube.R;
import defpackage.asg;
import defpackage.bsx;
import defpackage.bsy;
import defpackage.bsz;
import defpackage.bta;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SeekBarPreference extends Preference {
    private boolean G;
    private SeekBar.OnSeekBarChangeListener H;
    private View.OnKeyListener I;
    public int a;
    public int b;
    public boolean c;
    public SeekBar d;
    public boolean e;
    public boolean f;
    private int g;
    private int h;
    private TextView i;

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarPreferenceStyle, 0);
        this.H = new bsz(this);
        this.I = new bta(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bsy.k, R.attr.seekBarPreferenceStyle, 0);
        this.b = obtainStyledAttributes.getInt(3, 0);
        int i = obtainStyledAttributes.getInt(1, 100);
        int i2 = this.b;
        i = i < i2 ? i2 : i;
        if (i != this.g) {
            this.g = i;
            d();
        }
        int i3 = obtainStyledAttributes.getInt(4, 0);
        if (i3 != this.h) {
            this.h = Math.min(this.g - this.b, Math.abs(i3));
            d();
        }
        this.e = obtainStyledAttributes.getBoolean(2, true);
        this.G = obtainStyledAttributes.getBoolean(5, false);
        this.f = obtainStyledAttributes.getBoolean(6, false);
        obtainStyledAttributes.recycle();
    }

    private final void ab(int i, boolean z) {
        int i2 = this.b;
        if (i < i2) {
            i = i2;
        }
        int i3 = this.g;
        if (i > i3) {
            i = i3;
        }
        if (i != this.a) {
            this.a = i;
            o(i);
            aa(i);
            if (z) {
                d();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public final void g(Parcelable parcelable) {
        if (!parcelable.getClass().equals(SavedState.class)) {
            super.g(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.g(savedState.getSuperState());
        this.a = savedState.a;
        this.b = savedState.b;
        this.g = savedState.c;
        d();
    }

    @Override // androidx.preference.Preference
    protected void h(Object obj) {
        if (obj == null) {
            obj = 0;
        }
        k(p(((Integer) obj).intValue()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public final Parcelable jR() {
        Parcelable jR = super.jR();
        if (this.w) {
            return jR;
        }
        SavedState savedState = new SavedState(jR);
        savedState.a = this.a;
        savedState.b = this.b;
        savedState.c = this.g;
        return savedState;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public Object jS(TypedArray typedArray, int i) {
        return Integer.valueOf(typedArray.getInt(i, 0));
    }

    public final void k(int i) {
        ab(i, true);
    }

    public final void l(SeekBar seekBar) {
        int progress = this.b + seekBar.getProgress();
        if (progress != this.a) {
            if (Q(Integer.valueOf(progress))) {
                ab(progress, false);
            } else {
                seekBar.setProgress(this.a - this.b);
                o(this.a);
            }
        }
    }

    public final void o(int i) {
        TextView textView = this.i;
        if (textView != null) {
            textView.setText(String.valueOf(i));
        }
    }

    @Override // androidx.preference.Preference
    public final void qn(bsx bsxVar) {
        super.qn(bsxVar);
        bsxVar.a.setOnKeyListener(this.I);
        this.d = (SeekBar) bsxVar.E(R.id.seekbar);
        TextView textView = (TextView) bsxVar.E(R.id.seekbar_value);
        this.i = textView;
        if (this.G) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
            this.i = null;
        }
        SeekBar seekBar = this.d;
        if (seekBar == null) {
            Log.e("SeekBarPreference", "SeekBar view is null in onBindViewHolder.");
            return;
        }
        seekBar.setOnSeekBarChangeListener(this.H);
        this.d.setMax(this.g - this.b);
        int i = this.h;
        if (i != 0) {
            this.d.setKeyProgressIncrement(i);
        } else {
            this.h = this.d.getKeyProgressIncrement();
        }
        this.d.setProgress(this.a - this.b);
        o(this.a);
        this.d.setEnabled(T());
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new asg(8);
        int a;
        int b;
        int c;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.a = parcel.readInt();
            this.b = parcel.readInt();
            this.c = parcel.readInt();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a);
            parcel.writeInt(this.b);
            parcel.writeInt(this.c);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
