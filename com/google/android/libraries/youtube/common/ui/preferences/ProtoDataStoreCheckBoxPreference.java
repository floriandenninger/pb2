package com.google.android.libraries.youtube.common.ui.preferences;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.preference.CheckBoxPreference;
import com.google.android.libraries.youtube.common.ui.preferences.ProtoDataStoreCheckBoxPreference;
import defpackage.amkq;
import defpackage.anaf;
import defpackage.anhy;
import defpackage.aok;
import defpackage.eww;
import defpackage.oph;
import defpackage.ynm;
import defpackage.zaw;
import defpackage.zdj;
import defpackage.zdx;
import defpackage.zfi;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ProtoDataStoreCheckBoxPreference extends CheckBoxPreference implements zdx {
    private zdj c;
    private zaw d;
    private anhy e;
    private aok f;
    private Object g;

    public ProtoDataStoreCheckBoxPreference(Context context) {
        super(context);
        this.e = anaf.O(null);
        this.g = false;
        amkq.F(!TextUtils.isEmpty(this.s), "Make sure key attribute is set in the xml file.");
    }

    private final anhy ak(Boolean bool) {
        if (U()) {
            return this.c.b(bool);
        }
        return anaf.O(null);
    }

    @Override // androidx.preference.Preference
    public final boolean Q(Object obj) {
        boolean Q = super.Q(obj);
        if (Q) {
            aok aokVar = this.f;
            anhy ak = ak((Boolean) obj);
            zaw zawVar = this.d;
            zawVar.getClass();
            ynm.n(aokVar, ak, new eww(zawVar, 2), new oph(17));
        }
        return Q;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public final boolean R(boolean z) {
        throw new IllegalArgumentException("Do not read from SharedPreferences.");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public final void X(boolean z) {
    }

    protected void ad() {
    }

    public final /* synthetic */ void ae(boolean z) {
        super.k(z);
    }

    @Override // defpackage.zdx
    public final void af(zaw zawVar) {
        this.d = zawVar;
    }

    @Override // defpackage.zdx
    public final void ag(aok aokVar) {
        this.f = aokVar;
    }

    @Override // defpackage.zdx
    public final void ah(Map map) {
        zdj zdjVar = (zdj) map.get(this.s);
        zdjVar.getClass();
        this.c = zdjVar;
        final Boolean bool = (Boolean) this.g;
        ynm.n(this.f, zdjVar.a(), new zfi() { // from class: zdl
            @Override // defpackage.zfi
            public final void a(Object obj) {
                ProtoDataStoreCheckBoxPreference.this.aj(bool);
            }
        }, new zfi() { // from class: zdk
            @Override // defpackage.zfi
            public final void a(Object obj) {
                ProtoDataStoreCheckBoxPreference.this.ae(((Boolean) obj).booleanValue());
            }
        });
    }

    public final /* synthetic */ void ai(boolean z) {
        super.k(z);
        ad();
    }

    public final /* synthetic */ void aj(Boolean bool) {
        super.k(bool.booleanValue());
    }

    @Override // androidx.preference.TwoStatePreference, androidx.preference.Preference
    protected final void h(Object obj) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.TwoStatePreference, androidx.preference.Preference
    public final Object jS(TypedArray typedArray, int i) {
        Object jS = super.jS(typedArray, i);
        this.g = jS;
        return jS;
    }

    @Override // androidx.preference.TwoStatePreference
    public final void k(final boolean z) {
        anhy ak = ak(Boolean.valueOf(z));
        this.e = ak;
        aok aokVar = this.f;
        zaw zawVar = this.d;
        zawVar.getClass();
        ynm.n(aokVar, ak, new eww(zawVar, 2), new zfi() { // from class: zdm
            @Override // defpackage.zfi
            public final void a(Object obj) {
                ProtoDataStoreCheckBoxPreference.this.ai(z);
            }
        });
    }

    public ProtoDataStoreCheckBoxPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = anaf.O(null);
        this.g = false;
        amkq.F(!TextUtils.isEmpty(this.s), "Make sure key attribute is set in the xml file.");
    }

    public ProtoDataStoreCheckBoxPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = anaf.O(null);
        this.g = false;
        amkq.F(!TextUtils.isEmpty(this.s), "Make sure key attribute is set in the xml file.");
    }

    public ProtoDataStoreCheckBoxPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.e = anaf.O(null);
        this.g = false;
        amkq.F(!TextUtils.isEmpty(this.s), "Make sure key attribute is set in the xml file.");
    }
}
