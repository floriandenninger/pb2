package com.google.android.apps.youtube.app.settings.videoquality;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.Checkable;
import androidx.preference.TwoStatePreference;
import com.google.android.libraries.youtube.common.ui.preferences.ProtoDataStoreCheckBoxPreference;
import defpackage.bsx;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class VideoQualityCheckBoxPreference extends ProtoDataStoreCheckBoxPreference {
    private bsx c;

    public VideoQualityCheckBoxPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.libraries.youtube.common.ui.preferences.ProtoDataStoreCheckBoxPreference
    protected final void ad() {
        boolean z = ((TwoStatePreference) this).a;
        bsx bsxVar = this.c;
        if (bsxVar != null) {
            KeyEvent.Callback E = bsxVar.E(R.id.checkbox);
            if (E instanceof Checkable) {
                Checkable checkable = (Checkable) E;
                if (checkable.isChecked() != z) {
                    checkable.setChecked(z);
                }
            }
        }
    }

    @Override // androidx.preference.CheckBoxPreference, androidx.preference.Preference
    public final void qn(bsx bsxVar) {
        super.qn(bsxVar);
        this.c = bsxVar;
    }
}
