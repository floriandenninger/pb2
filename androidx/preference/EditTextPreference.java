package androidx.preference;

import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.preference.Preference;
import defpackage.asg;

/* compiled from: PG */
/* loaded from: classes.dex */
public class EditTextPreference extends DialogPreference {
    public String g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public EditTextPreference(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            r0 = 2130969255(0x7f0402a7, float:1.7547187E38)
            r1 = 16842898(0x1010092, float:2.3693967E-38)
            int r0 = defpackage.gl.q(r4, r0, r1)
            r1 = 0
            r3.<init>(r4, r5, r0, r1)
            int[] r2 = defpackage.bsy.d
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r2, r0, r1)
            boolean r5 = defpackage.gl.x(r4, r1, r1, r1)
            if (r5 == 0) goto L2b
            brr r5 = defpackage.brr.b
            if (r5 != 0) goto L26
            brr r5 = new brr
            r0 = 1
            r5.<init>(r0)
            defpackage.brr.b = r5
        L26:
            brr r5 = defpackage.brr.b
            r3.K(r5)
        L2b:
            r4.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.EditTextPreference.<init>(android.content.Context, android.util.AttributeSet):void");
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
        i(savedState.a);
    }

    @Override // androidx.preference.Preference
    protected void h(Object obj) {
        i(s((String) obj));
    }

    public final void i(String str) {
        boolean j = j();
        this.g = str;
        Y(str);
        boolean j2 = j();
        if (j2 != j) {
            x(j2);
        }
        d();
    }

    @Override // androidx.preference.Preference
    public final boolean j() {
        return TextUtils.isEmpty(this.g) || super.j();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public final Parcelable jR() {
        Parcelable jR = super.jR();
        if (this.w) {
            return jR;
        }
        SavedState savedState = new SavedState(jR);
        savedState.a = this.g;
        return savedState;
    }

    @Override // androidx.preference.Preference
    protected Object jS(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new asg(3);
        String a;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.a = parcel.readString();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.a);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
