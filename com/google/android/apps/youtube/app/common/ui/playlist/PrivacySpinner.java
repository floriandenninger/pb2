package com.google.android.apps.youtube.app.common.ui.playlist;

import android.app.Dialog;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import com.google.android.youtube.R;
import defpackage.glx;
import defpackage.gou;
import defpackage.whu;
import defpackage.yjj;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class PrivacySpinner extends Spinner {
    private static final Map d;
    private static final Map e;
    private static final Map f;
    public final LayoutInflater a;
    public Map b;
    public Dialog c;

    static {
        HashMap hashMap = new HashMap();
        d = hashMap;
        hashMap.put(gou.PRIVATE, Integer.valueOf(R.string.video_privacy_private_description));
        gou gouVar = gou.PUBLIC;
        Integer valueOf = Integer.valueOf(R.string.video_privacy_public_description);
        hashMap.put(gouVar, valueOf);
        gou gouVar2 = gou.UNLISTED;
        Integer valueOf2 = Integer.valueOf(R.string.video_privacy_unlisted_description);
        hashMap.put(gouVar2, valueOf2);
        HashMap hashMap2 = new HashMap();
        e = hashMap2;
        hashMap2.put(gou.PRIVATE, Integer.valueOf(R.string.video_privacy_upload_private_description));
        hashMap2.put(gou.PUBLIC, valueOf);
        hashMap2.put(gou.UNLISTED, valueOf2);
        HashMap hashMap3 = new HashMap();
        f = hashMap3;
        hashMap3.put(gou.PRIVATE, Integer.valueOf(R.string.playlist_privacy_private_description));
        hashMap3.put(gou.PUBLIC, Integer.valueOf(R.string.playlist_privacy_public_description));
        hashMap3.put(gou.UNLISTED, Integer.valueOf(R.string.playlist_privacy_unlisted_description));
    }

    public PrivacySpinner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = LayoutInflater.from(context);
        c(1);
    }

    public final gou a() {
        return (gou) getSelectedItem();
    }

    public final void b(gou gouVar) {
        gouVar.getClass();
        setSelection(gouVar.ordinal());
    }

    public final void c(int i) {
        Map map;
        gou gouVar = gou.PUBLIC;
        int i2 = i - 1;
        if (i2 == 0) {
            map = d;
        } else {
            if (i2 != 1) {
                this.b = f;
                setAdapter((SpinnerAdapter) new glx(this));
            }
            map = e;
        }
        this.b = map;
        setAdapter((SpinnerAdapter) new glx(this));
    }

    public final int d() {
        gou a = a();
        gou gouVar = gou.PUBLIC;
        int ordinal = a.ordinal();
        if (ordinal == 0) {
            return 2;
        }
        if (ordinal == 1) {
            return 3;
        }
        if (ordinal == 2) {
            return 1;
        }
        String valueOf = String.valueOf(a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
        sb.append("Unknown privacy status: ");
        sb.append(valueOf);
        throw new IllegalArgumentException(sb.toString());
    }

    public final void e(int i) {
        int i2 = i - 1;
        gou gouVar = gou.PUBLIC;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            b(gou.PRIVATE);
            return;
        }
        if (i2 == 1) {
            b(gou.PUBLIC);
        } else {
            if (i2 == 2) {
                b(gou.UNLISTED);
                return;
            }
            StringBuilder sb = new StringBuilder(35);
            sb.append("Unknown privacy status: ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
        setDropDownWidth((i - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin);
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        Dialog dialog = this.c;
        if (dialog != null) {
            View currentFocus = dialog.getCurrentFocus();
            if (currentFocus != null) {
                whu.C(currentFocus);
            }
        } else {
            whu.B(yjj.l(getContext()));
        }
        return super.performClick();
    }
}
