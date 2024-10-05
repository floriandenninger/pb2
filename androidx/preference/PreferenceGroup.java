package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.preference.Preference;
import defpackage.aeg;
import defpackage.asg;
import defpackage.bsl;
import defpackage.bsu;
import defpackage.bsy;
import defpackage.gl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class PreferenceGroup extends Preference {
    public final aeg a;
    public List b;
    public int c;
    private final Handler d;
    private boolean e;
    private int f;
    private boolean g;
    private final Runnable h;

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private final void ag(Preference preference) {
        synchronized (this) {
            preference.C();
            if (preference.E == this) {
                preference.u(null);
            }
            if (this.b.remove(preference)) {
                String str = preference.s;
                if (str != null) {
                    this.a.put(str, Long.valueOf(preference.jT()));
                    this.d.removeCallbacks(this.h);
                    this.d.post(this.h);
                }
                if (this.g) {
                    preference.B();
                }
            }
        }
    }

    @Override // androidx.preference.Preference
    public final void B() {
        super.P();
        this.g = false;
        int k = k();
        for (int i = 0; i < k; i++) {
            o(i).B();
        }
    }

    public final void ab() {
        synchronized (this) {
            List list = this.b;
            int size = list.size();
            while (true) {
                size--;
                if (size >= 0) {
                    ag((Preference) list.get(0));
                }
            }
        }
        y();
    }

    public final void ac(int i) {
        if (i != Integer.MAX_VALUE && !S()) {
            Log.e("PreferenceGroup", getClass().getSimpleName() + " should have a key defined if it contains an expandable preference");
        }
        this.c = i;
    }

    public boolean ad() {
        return true;
    }

    public final void ae(Preference preference) {
        long a;
        if (this.b.contains(preference)) {
            return;
        }
        if (preference.s != null) {
            PreferenceGroup preferenceGroup = this;
            while (true) {
                PreferenceGroup preferenceGroup2 = preferenceGroup.E;
                if (preferenceGroup2 == null) {
                    break;
                } else {
                    preferenceGroup = preferenceGroup2;
                }
            }
            String str = preference.s;
            if (preferenceGroup.l(str) != null) {
                Log.e("PreferenceGroup", "Found duplicated key: \"" + str + "\". This can cause unintended behaviour, please use unique keys for every preference.");
            }
        }
        if (preference.p == Integer.MAX_VALUE) {
            if (this.e) {
                int i = this.f;
                this.f = i + 1;
                preference.J(i);
            }
            if (preference instanceof PreferenceGroup) {
                ((PreferenceGroup) preference).e = this.e;
            }
        }
        int binarySearch = Collections.binarySearch(this.b, preference);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 1;
        }
        preference.W(j());
        synchronized (this) {
            this.b.add(binarySearch, preference);
        }
        bsu bsuVar = this.k;
        String str2 = preference.s;
        if (str2 == null || !this.a.containsKey(str2)) {
            a = bsuVar.a();
        } else {
            a = ((Long) this.a.get(str2)).longValue();
            this.a.remove(str2);
        }
        preference.l = a;
        preference.m = true;
        try {
            preference.A(bsuVar);
            preference.m = false;
            preference.u(this);
            if (this.g) {
                preference.z();
            }
            y();
        } catch (Throwable th) {
            preference.m = false;
            throw th;
        }
    }

    public final void af(Preference preference) {
        ag(preference);
        y();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public final void g(Parcelable parcelable) {
        if (!parcelable.getClass().equals(SavedState.class)) {
            super.g(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.c = savedState.a;
        super.g(savedState.getSuperState());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public final Parcelable jR() {
        return new SavedState(super.jR(), this.c);
    }

    public final int k() {
        return this.b.size();
    }

    public final Preference l(CharSequence charSequence) {
        Preference l;
        if (charSequence == null) {
            throw new IllegalArgumentException("Key cannot be null");
        }
        if (TextUtils.equals(this.s, charSequence)) {
            return this;
        }
        int k = k();
        for (int i = 0; i < k; i++) {
            Preference o = o(i);
            if (TextUtils.equals(o.s, charSequence)) {
                return o;
            }
            if ((o instanceof PreferenceGroup) && (l = ((PreferenceGroup) o).l(charSequence)) != null) {
                return l;
            }
        }
        return null;
    }

    public final Preference o(int i) {
        return (Preference) this.b.get(i);
    }

    @Override // androidx.preference.Preference
    public final void v(Bundle bundle) {
        super.v(bundle);
        int k = k();
        for (int i = 0; i < k; i++) {
            o(i).v(bundle);
        }
    }

    @Override // androidx.preference.Preference
    public final void w(Bundle bundle) {
        super.w(bundle);
        int k = k();
        for (int i = 0; i < k; i++) {
            o(i).w(bundle);
        }
    }

    @Override // androidx.preference.Preference
    public final void x(boolean z) {
        super.x(z);
        int k = k();
        for (int i = 0; i < k; i++) {
            o(i).W(z);
        }
    }

    @Override // androidx.preference.Preference
    public final void z() {
        super.E();
        this.g = true;
        int k = k();
        for (int i = 0; i < k; i++) {
            o(i).z();
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new asg(7);
        int a;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.a = parcel.readInt();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a);
        }

        public SavedState(Parcelable parcelable, int i) {
            super(parcelable);
            this.a = i;
        }
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, null);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i, byte[] bArr) {
        super(context, attributeSet, i, 0);
        this.a = new aeg();
        this.d = new Handler();
        this.e = true;
        this.f = 0;
        this.g = false;
        this.c = Integer.MAX_VALUE;
        this.h = new bsl(this);
        this.b = new ArrayList();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bsy.i, i, 0);
        this.e = gl.x(obtainStyledAttributes, 2, 2, true);
        if (obtainStyledAttributes.hasValue(1)) {
            ac(gl.A(obtainStyledAttributes, 1, 1));
        }
        obtainStyledAttributes.recycle();
    }
}
