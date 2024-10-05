package defpackage;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatSpinner;
import android.util.Log;
import android.widget.ListAdapter;
import android.widget.ListView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ta implements DialogInterface.OnClickListener, tg {
    mi a;
    final /* synthetic */ AppCompatSpinner b;
    private ListAdapter c;
    private CharSequence d;

    public ta(AppCompatSpinner appCompatSpinner) {
        this.b = appCompatSpinner;
    }

    @Override // defpackage.tg
    public final int a() {
        return 0;
    }

    @Override // defpackage.tg
    public final int b() {
        return 0;
    }

    @Override // defpackage.tg
    public final Drawable c() {
        return null;
    }

    @Override // defpackage.tg
    public final CharSequence d() {
        return this.d;
    }

    @Override // defpackage.tg
    public final void e(ListAdapter listAdapter) {
        this.c = listAdapter;
    }

    @Override // defpackage.tg
    public final void f(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.tg
    public final void g(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.tg
    public final void h(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.tg
    public final void i(CharSequence charSequence) {
        this.d = charSequence;
    }

    @Override // defpackage.tg
    public final void j(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.tg
    public final void k() {
        mi miVar = this.a;
        if (miVar != null) {
            miVar.dismiss();
            this.a = null;
        }
    }

    @Override // defpackage.tg
    public final void l(int i, int i2) {
        if (this.c == null) {
            return;
        }
        mh mhVar = new mh(this.b.a);
        CharSequence charSequence = this.d;
        if (charSequence != null) {
            mhVar.o(charSequence);
        }
        mhVar.m(this.c, this.b.getSelectedItemPosition(), this);
        mi b = mhVar.b();
        this.a = b;
        ListView listView = b.a.f;
        listView.setTextDirection(i);
        listView.setTextAlignment(i2);
        this.a.show();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.b.setSelection(i);
        if (this.b.getOnItemClickListener() != null) {
            this.b.performItemClick(null, i, this.c.getItemId(i));
        }
        k();
    }

    @Override // defpackage.tg
    public final boolean u() {
        mi miVar = this.a;
        if (miVar != null) {
            return miVar.isShowing();
        }
        return false;
    }
}
