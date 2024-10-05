package com.google.android.libraries.youtube.common.ui.preferences;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.preference.EditTextPreference;
import com.google.android.libraries.youtube.common.ui.preferences.ProtoDataStoreEditTextPreference;
import defpackage.ambx;
import defpackage.amkq;
import defpackage.amml;
import defpackage.anaf;
import defpackage.angq;
import defpackage.anhy;
import defpackage.aok;
import defpackage.eww;
import defpackage.oph;
import defpackage.ynm;
import defpackage.zaw;
import defpackage.zdj;
import defpackage.zdq;
import defpackage.zdx;
import defpackage.zfi;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ProtoDataStoreEditTextPreference extends EditTextPreference implements zdx {
    private zdj G;
    private ambx H;
    private Object I;
    private zaw h;
    private aok i;

    public ProtoDataStoreEditTextPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        amkq.F(!TextUtils.isEmpty(this.s), "Make sure key attribute is set in the xml file.");
    }

    @Override // androidx.preference.Preference
    public final boolean Q(Object obj) {
        anhy O;
        boolean Q = super.Q(obj);
        if (Q) {
            aok aokVar = this.i;
            if (U()) {
                O = this.G.b(obj);
            } else {
                O = anaf.O(null);
            }
            zaw zawVar = this.h;
            zawVar.getClass();
            ynm.n(aokVar, O, new eww(zawVar, 3), new oph(18));
        }
        return Q;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public final void Y(String str) {
    }

    @Override // defpackage.zdx
    public final void af(zaw zawVar) {
        zawVar.getClass();
        this.h = zawVar;
    }

    @Override // defpackage.zdx
    public final void ag(aok aokVar) {
        this.i = aokVar;
    }

    @Override // defpackage.zdx
    public final void ah(Map map) {
        zdj zdjVar = (zdj) map.get(this.s);
        zdjVar.getClass();
        this.G = zdjVar;
        Object obj = this.I;
        ambx ambxVar = new ambx(new zdq(ynm.b(this.i, zdjVar.a(), new amml() { // from class: zdp
            @Override // defpackage.amml
            public final Object apply(Object obj2) {
                String str = (String) obj2;
                ProtoDataStoreEditTextPreference.this.k(str);
                return str;
            }
        }), 0), angq.a);
        this.H = ambxVar;
        final String str = (String) obj;
        ynm.n(this.i, ambxVar.c(), new zfi() { // from class: zdo
            @Override // defpackage.zfi
            public final void a(Object obj2) {
                ProtoDataStoreEditTextPreference.this.i(str);
            }
        }, new zfi() { // from class: zdn
            @Override // defpackage.zfi
            public final void a(Object obj2) {
                ProtoDataStoreEditTextPreference.this.i((String) obj2);
            }
        });
    }

    @Override // androidx.preference.EditTextPreference, androidx.preference.Preference
    protected final void h(Object obj) {
    }

    @Override // androidx.preference.EditTextPreference, androidx.preference.Preference
    protected final Object jS(TypedArray typedArray, int i) {
        String string = typedArray.getString(i);
        this.I = string;
        return string;
    }

    public final /* synthetic */ void k(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        super.i(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public final String s(String str) {
        throw new IllegalArgumentException("Do not read from SharedPreferences.");
    }
}
