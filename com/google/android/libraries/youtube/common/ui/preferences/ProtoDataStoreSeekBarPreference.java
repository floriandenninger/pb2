package com.google.android.libraries.youtube.common.ui.preferences;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.preference.SeekBarPreference;
import com.google.android.libraries.youtube.common.ui.preferences.ProtoDataStoreSeekBarPreference;
import defpackage.ambx;
import defpackage.amkq;
import defpackage.angq;
import defpackage.anhv;
import defpackage.anhy;
import defpackage.aok;
import defpackage.eww;
import defpackage.oph;
import defpackage.yml;
import defpackage.ynm;
import defpackage.zaw;
import defpackage.zdj;
import defpackage.zdq;
import defpackage.zdx;
import defpackage.zfi;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ProtoDataStoreSeekBarPreference extends SeekBarPreference implements zdx {
    private Object G;
    private ambx H;
    private aok g;
    private zaw h;
    private zdj i;

    public ProtoDataStoreSeekBarPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        amkq.F(!TextUtils.isEmpty(this.s), "Make sure key attribute is set in the xml file.");
    }

    @Override // androidx.preference.Preference
    public final boolean Q(Object obj) {
        anhy anhyVar;
        boolean Q = super.Q(obj);
        if (Q) {
            aok aokVar = this.g;
            if (!U()) {
                anhyVar = anhv.a;
            } else {
                anhyVar = this.i.b(obj);
            }
            zaw zawVar = this.h;
            zawVar.getClass();
            ynm.n(aokVar, anhyVar, new eww(zawVar, 5), new oph(19));
        }
        return Q;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public final void aa(int i) {
    }

    public final /* synthetic */ void ab(int i) {
        super.k(i);
    }

    @Override // defpackage.zdx
    public final void af(zaw zawVar) {
        this.h = zawVar;
    }

    @Override // defpackage.zdx
    public final void ag(aok aokVar) {
        this.g = aokVar;
    }

    @Override // defpackage.zdx
    public final void ah(Map map) {
        zdj zdjVar = (zdj) map.get(this.s);
        zdjVar.getClass();
        this.i = zdjVar;
        final int intValue = ((Integer) this.G).intValue();
        ambx ambxVar = new ambx(new zdq(ynm.b(this.g, this.i.a(), yml.e), 3), angq.a);
        this.H = ambxVar;
        ynm.n(this.g, ambxVar.c(), new zfi() { // from class: zdz
            @Override // defpackage.zfi
            public final void a(Object obj) {
                ProtoDataStoreSeekBarPreference.this.ab(intValue);
            }
        }, new zfi() { // from class: zdy
            @Override // defpackage.zfi
            public final void a(Object obj) {
                ProtoDataStoreSeekBarPreference.this.k(((Integer) obj).intValue());
            }
        });
    }

    @Override // androidx.preference.SeekBarPreference, androidx.preference.Preference
    protected final void h(Object obj) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.SeekBarPreference, androidx.preference.Preference
    public final Object jS(TypedArray typedArray, int i) {
        Object jS = super.jS(typedArray, i);
        this.G = jS;
        return jS;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public final int p(int i) {
        throw new IllegalArgumentException("Do not read from SharedPreferences.");
    }
}
