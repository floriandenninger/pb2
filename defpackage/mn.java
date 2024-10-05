package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.support.v7.widget.Toolbar;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class mn {
    public static final aeb a = new aeb();
    public static final Object b = new Object();

    public static mn e(Activity activity, mm mmVar) {
        return new ne(activity, null, mmVar, activity);
    }

    public static mn f(Dialog dialog, mm mmVar) {
        return new ne(dialog.getContext(), dialog.getWindow(), mmVar, dialog);
    }

    public static void q(mn mnVar) {
        synchronized (b) {
            Iterator it = a.iterator();
            while (it.hasNext()) {
                mn mnVar2 = (mn) ((WeakReference) it.next()).get();
                if (mnVar2 == mnVar || mnVar2 == null) {
                    it.remove();
                }
            }
        }
    }

    public abstract void A();

    public abstract void B();

    public abstract void C();

    public int a() {
        throw null;
    }

    public Context b(Context context) {
        throw null;
    }

    public abstract lu c();

    public abstract lv d();

    public abstract pp g(po poVar);

    public abstract MenuInflater h();

    public abstract View i(int i);

    public abstract void j(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public abstract void n();

    public abstract void o();

    public abstract void p();

    public abstract void r(int i);

    public abstract void s(View view);

    public abstract void t(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void u(int i);

    public abstract void v(Toolbar toolbar);

    public void w(int i) {
        throw null;
    }

    public abstract void x(CharSequence charSequence);

    public abstract boolean y(int i);

    public abstract void z();
}
