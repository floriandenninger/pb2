package com.google.android.apps.youtube.app.wellness;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.Switch;
import androidx.preference.DialogPreference;
import com.google.android.apps.youtube.app.wellness.WatchBreakFrequencyPickerPreference;
import com.google.android.youtube.R;
import defpackage.alta;
import defpackage.ayqr;
import defpackage.ayqx;
import defpackage.ayrs;
import defpackage.ayrz;
import defpackage.bsx;
import defpackage.orz;
import defpackage.osd;
import defpackage.osm;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class WatchBreakFrequencyPickerPreference extends DialogPreference {
    public osm g;
    public Handler h;
    private ayqx i;

    public WatchBreakFrequencyPickerPreference(Context context) {
        this(context, null);
    }

    @Override // androidx.preference.Preference
    public final void B() {
        super.P();
        ayrz.c((AtomicReference) this.i);
    }

    @Override // androidx.preference.Preference
    public final void qn(bsx bsxVar) {
        super.qn(bsxVar);
        Switch r3 = (Switch) bsxVar.a.findViewById(R.id.toggle);
        boolean g = this.g.g();
        r3.setOnCheckedChangeListener(null);
        if (r3.isChecked() != g) {
            r3.setChecked(g);
        }
        r3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: osa
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                WatchBreakFrequencyPickerPreference watchBreakFrequencyPickerPreference = WatchBreakFrequencyPickerPreference.this;
                watchBreakFrequencyPickerPreference.g.d(z);
                watchBreakFrequencyPickerPreference.d();
                if (z) {
                    watchBreakFrequencyPickerPreference.k.h(watchBreakFrequencyPickerPreference);
                }
            }
        });
        this.h.post(new Runnable() { // from class: osc
            @Override // java.lang.Runnable
            public final void run() {
                WatchBreakFrequencyPickerPreference watchBreakFrequencyPickerPreference = WatchBreakFrequencyPickerPreference.this;
                watchBreakFrequencyPickerPreference.k(watchBreakFrequencyPickerPreference.g.g());
            }
        });
    }

    @Override // androidx.preference.Preference
    public final void z() {
        super.E();
        k(this.g.g());
        this.i = this.g.c.ab(ayqr.a()).ax(new ayrs() { // from class: osb
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                WatchBreakFrequencyPickerPreference.this.k(((Boolean) obj).booleanValue());
            }
        });
    }

    public WatchBreakFrequencyPickerPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ((osd) alta.t(context, osd.class)).iZ(this);
        I("watch_break_frequency_picker_preference");
    }

    public final void k(boolean z) {
        if (!z) {
            n(this.j.getString(R.string.watch_break_setting_summary_off));
        } else {
            n(orz.a(this.j.getResources(), this.g.a()));
        }
        d();
    }
}
