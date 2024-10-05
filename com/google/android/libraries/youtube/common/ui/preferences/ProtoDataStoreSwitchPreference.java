package com.google.android.libraries.youtube.common.ui.preferences;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.preference.SwitchPreference;
import com.google.android.libraries.youtube.common.ui.preferences.ProtoDataStoreSwitchPreference;
import defpackage.amkq;
import defpackage.anaf;
import defpackage.aney;
import defpackage.anht;
import defpackage.anhy;
import defpackage.aok;
import defpackage.eww;
import defpackage.lod;
import defpackage.ynm;
import defpackage.zaw;
import defpackage.zdj;
import defpackage.zdx;
import defpackage.zec;
import defpackage.zed;
import defpackage.zfi;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ProtoDataStoreSwitchPreference extends SwitchPreference implements zdx {
    public zed c;
    private zdj d;
    private zaw e;
    private anhy f;
    private aok g;
    private Object h;
    private anhy i;

    public ProtoDataStoreSwitchPreference(Context context) {
        super(context);
        this.f = anaf.O(null);
    }

    private final anhy ak(Boolean bool) {
        if (U()) {
            return this.d.b(bool);
        }
        return anaf.O(null);
    }

    @Override // androidx.preference.Preference
    public final boolean Q(final Object obj) {
        boolean Q = super.Q(obj);
        if (Q) {
            aok aokVar = this.g;
            anhy ak = ak((Boolean) obj);
            zaw zawVar = this.e;
            zawVar.getClass();
            ynm.n(aokVar, ak, new eww(zawVar, 6), new zfi() { // from class: zea
                @Override // defpackage.zfi
                public final void a(Object obj2) {
                    ProtoDataStoreSwitchPreference protoDataStoreSwitchPreference = ProtoDataStoreSwitchPreference.this;
                    Object obj3 = obj;
                    zed zedVar = protoDataStoreSwitchPreference.c;
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
    public final boolean R(boolean z) {
        throw new IllegalArgumentException("Do not read from SharedPreferences.");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public final void X(boolean z) {
    }

    public final anhy ad() {
        return ynm.b(this.g, this.i, new zec(this, 0));
    }

    public final anhy ae(Boolean bool) {
        return anaf.P(ynm.b(this.g, aney.h(anht.q(this.d.a()), Exception.class, new lod(bool, 8), ynm.a), new zec(this, 1)));
    }

    @Override // defpackage.zdx
    public final void af(zaw zawVar) {
        this.e = zawVar;
    }

    @Override // defpackage.zdx
    public final void ag(aok aokVar) {
        this.g = aokVar;
    }

    @Override // defpackage.zdx
    public final void ah(Map map) {
        zdj zdjVar = (zdj) map.get(this.s);
        zdjVar.getClass();
        this.d = zdjVar;
        this.i = ae((Boolean) this.h);
    }

    public final /* synthetic */ void ai(boolean z) {
        super.k(z);
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
        this.h = jS;
        return jS;
    }

    @Override // androidx.preference.TwoStatePreference
    public final void k(final boolean z) {
        anhy ak = ak(Boolean.valueOf(z));
        this.f = ak;
        aok aokVar = this.g;
        zaw zawVar = this.e;
        zawVar.getClass();
        ynm.n(aokVar, ak, new eww(zawVar, 6), new zfi() { // from class: zeb
            @Override // defpackage.zfi
            public final void a(Object obj) {
                ProtoDataStoreSwitchPreference.this.ai(z);
            }
        });
    }

    public ProtoDataStoreSwitchPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = anaf.O(null);
        amkq.F(!TextUtils.isEmpty(this.s), "Make sure key attribute is set in the xml file.");
    }
}
