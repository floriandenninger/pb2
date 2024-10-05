package com.google.android.libraries.youtube.common.ui.preferences;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.preference.ListPreference;
import com.google.android.libraries.youtube.common.ui.preferences.ProtoDataStoreListPreference;
import defpackage.ambx;
import defpackage.amkq;
import defpackage.amml;
import defpackage.anaf;
import defpackage.angq;
import defpackage.anhy;
import defpackage.aok;
import defpackage.eww;
import defpackage.ynm;
import defpackage.zaw;
import defpackage.zdj;
import defpackage.zdq;
import defpackage.zds;
import defpackage.zdx;
import defpackage.zed;
import defpackage.zfi;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ProtoDataStoreListPreference extends ListPreference implements zdx {
    public zed G;
    private zdj H;
    private zaw I;

    /* renamed from: J, reason: collision with root package name */
    private ambx f173J;
    private anhy K;
    private aok L;
    private Object M;

    public ProtoDataStoreListPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.K = anaf.O(null);
        amkq.F(!TextUtils.isEmpty(this.s), "Make sure key attribute is set in the xml file.");
    }

    @Override // androidx.preference.Preference
    public final void F(Object obj) {
        this.M = obj;
        this.y = obj;
    }

    @Override // androidx.preference.Preference
    public final boolean Q(final Object obj) {
        boolean Q = super.Q(obj);
        if (Q) {
            aok aokVar = this.L;
            anhy ab = ab((String) obj);
            zaw zawVar = this.I;
            zawVar.getClass();
            ynm.n(aokVar, ab, new eww(zawVar, 4), new zfi() { // from class: zdr
                @Override // defpackage.zfi
                public final void a(Object obj2) {
                    ProtoDataStoreListPreference protoDataStoreListPreference = ProtoDataStoreListPreference.this;
                    Object obj3 = obj;
                    zed zedVar = protoDataStoreListPreference.G;
                    if (zedVar != null) {
                        zedVar.a(obj3);
                    }
                }
            });
        }
        return Q;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public final void Y(String str) {
    }

    protected final anhy ab(String str) {
        if (U()) {
            return this.H.b(str);
        }
        return anaf.O(null);
    }

    public final /* synthetic */ void ac(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            super.o(str);
        } else {
            super.o(str2);
        }
    }

    public final /* synthetic */ void ad(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            super.o(str2);
        } else if (str != null) {
            super.o(str);
        }
    }

    public final /* synthetic */ void ae(String str) {
        super.o(str);
    }

    @Override // defpackage.zdx
    public final void af(zaw zawVar) {
        zawVar.getClass();
        this.I = zawVar;
    }

    @Override // defpackage.zdx
    public final void ag(aok aokVar) {
        this.L = aokVar;
    }

    @Override // defpackage.zdx
    public final void ah(Map map) {
        zdj zdjVar = (zdj) map.get(this.s);
        zdjVar.getClass();
        this.H = zdjVar;
        final String str = (String) this.M;
        ambx ambxVar = new ambx(new zdq(ynm.b(this.L, zdjVar.a(), new amml() { // from class: zdt
            @Override // defpackage.amml
            public final Object apply(Object obj) {
                String str2 = (String) obj;
                ProtoDataStoreListPreference.this.ad(str, str2);
                return str2;
            }
        }), 2), angq.a);
        this.f173J = ambxVar;
        ynm.n(this.L, ambxVar.c(), new zds(this, str, 0), new zds(this, str, 1));
    }

    public final /* synthetic */ void ai(String str) {
        super.o(str);
    }

    @Override // androidx.preference.ListPreference, androidx.preference.Preference
    protected final void h(Object obj) {
    }

    @Override // androidx.preference.ListPreference, androidx.preference.Preference
    protected final Object jS(TypedArray typedArray, int i) {
        String string = typedArray.getString(i);
        this.M = string;
        return string;
    }

    @Override // androidx.preference.ListPreference
    public final void o(String str) {
        anhy ab = ab(str);
        this.K = ab;
        aok aokVar = this.L;
        zaw zawVar = this.I;
        zawVar.getClass();
        ynm.n(aokVar, ab, new eww(zawVar, 4), new zds(this, str, 2));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public final String s(String str) {
        throw new IllegalArgumentException("Do not read from SharedPreferences.");
    }
}
