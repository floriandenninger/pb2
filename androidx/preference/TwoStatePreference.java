package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.preference.Preference;
import defpackage.asg;
import defpackage.bsx;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class TwoStatePreference extends Preference {
    public boolean a;
    public boolean b;
    private CharSequence c;
    private CharSequence d;
    private boolean e;

    public TwoStatePreference(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void ab(View view) {
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            int i = 0;
            if (this.a && !TextUtils.isEmpty(this.c)) {
                textView.setText(this.c);
            } else if (this.a || TextUtils.isEmpty(this.d)) {
                CharSequence m = m();
                if (TextUtils.isEmpty(m)) {
                    i = 8;
                } else {
                    textView.setText(m);
                }
            } else {
                textView.setText(this.d);
            }
            if (i != textView.getVisibility()) {
                textView.setVisibility(i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void ac(bsx bsxVar) {
        ab(bsxVar.E(R.id.summary));
    }

    @Override // androidx.preference.Preference
    protected final void c() {
        boolean z = !this.a;
        if (Q(Boolean.valueOf(z))) {
            k(z);
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
        k(savedState.a);
    }

    @Override // androidx.preference.Preference
    protected void h(Object obj) {
        if (obj == null) {
            obj = false;
        }
        k(R(((Boolean) obj).booleanValue()));
    }

    @Override // androidx.preference.Preference
    public final boolean j() {
        if (this.b) {
            if (this.a) {
                return true;
            }
        } else if (!this.a) {
            return true;
        }
        return super.j();
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
        return savedState;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public Object jS(TypedArray typedArray, int i) {
        return Boolean.valueOf(typedArray.getBoolean(i, false));
    }

    public void k(boolean z) {
        boolean z2 = this.a;
        if (z2 == z && this.e) {
            return;
        }
        this.a = z;
        this.e = true;
        X(z);
        if (z2 != z) {
            x(j());
            d();
        }
    }

    public final void l(CharSequence charSequence) {
        this.d = charSequence;
        if (this.a) {
            return;
        }
        d();
    }

    public final void o(CharSequence charSequence) {
        this.c = charSequence;
        if (this.a) {
            d();
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new asg(9);
        boolean a;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.a = parcel.readInt() == 1;
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a ? 1 : 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
