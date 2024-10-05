package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.google.android.apps.youtube.app.common.ui.playlist.PrivacySpinner;
import com.google.android.youtube.R;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class glx extends BaseAdapter {
    final /* synthetic */ PrivacySpinner b;
    private final glv c = new glv(this);
    public final List a = Arrays.asList(gou.values());

    public glx(PrivacySpinner privacySpinner) {
        this.b = privacySpinner;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.a.size();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        glu gluVar;
        if (view == null) {
            view = this.b.a.inflate(R.layout.privacy_dropdown, (ViewGroup) null);
            gluVar = new glu(this, view);
            view.setTag(gluVar);
        } else {
            gluVar = (glu) view.getTag();
        }
        jw.M(view, this.c);
        if (gluVar != null) {
            gluVar.a(i);
        }
        return view;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.a.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        glw glwVar;
        if (view == null) {
            view = this.b.a.inflate(R.layout.privacy_item, (ViewGroup) null);
            glwVar = new glw(this, view);
            view.setTag(glwVar);
        } else {
            glwVar = (glw) view.getTag();
        }
        if (glwVar != null) {
            glwVar.a(i);
        }
        return view;
    }
}
