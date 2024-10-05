package androidx.preference;

import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.preference.Preference;
import defpackage.asg;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class MultiSelectListPreference extends DialogPreference {
    public CharSequence[] g;
    public CharSequence[] h;
    public Set i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MultiSelectListPreference(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            r0 = 2130969200(0x7f040270, float:1.7547075E38)
            r1 = 16842897(0x1010091, float:2.3693964E-38)
            int r0 = defpackage.gl.q(r4, r0, r1)
            r1 = 0
            r3.<init>(r4, r5, r0, r1)
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            r3.i = r2
            int[] r2 = defpackage.bsy.f
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r2, r0, r1)
            r5 = 2
            java.lang.CharSequence[] r5 = defpackage.gl.z(r4, r5, r1)
            r3.g = r5
            r5 = 3
            r0 = 1
            java.lang.CharSequence[] r5 = defpackage.gl.z(r4, r5, r0)
            r3.h = r5
            r4.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.MultiSelectListPreference.<init>(android.content.Context, android.util.AttributeSet):void");
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
    protected final void h(Object obj) {
        k(t((Set) obj));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public final Parcelable jR() {
        Parcelable jR = super.jR();
        if (this.w) {
            return jR;
        }
        SavedState savedState = new SavedState(jR);
        savedState.a = this.i;
        return savedState;
    }

    @Override // androidx.preference.Preference
    protected final Object jS(TypedArray typedArray, int i) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }

    public final void k(Set set) {
        this.i.clear();
        this.i.addAll(set);
        if (U() && !set.equals(t(null))) {
            SharedPreferences.Editor b = this.k.b();
            b.putStringSet(this.s, set);
            super.O(b);
        }
        d();
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new asg(5);
        Set a;

        public SavedState(Parcel parcel) {
            super(parcel);
            int readInt = parcel.readInt();
            this.a = new HashSet();
            String[] strArr = new String[readInt];
            parcel.readStringArray(strArr);
            Collections.addAll(this.a, strArr);
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a.size());
            Set set = this.a;
            parcel.writeStringArray((String[]) set.toArray(new String[set.size()]));
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
