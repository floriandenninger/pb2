package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v4.app.FragmentContainerView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cq implements LayoutInflater.Factory2 {
    final dd a;

    public cq(dd ddVar) {
        this.a = ddVar;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        dj j;
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.a);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ba.a);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (attributeValue == null || !cn.b(context.getClassLoader(), attributeValue)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1) {
            if (resourceId != -1) {
                id = -1;
            } else {
                if (string == null) {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                }
                id = -1;
                resourceId = -1;
            }
        }
        ce e = resourceId != -1 ? this.a.e(resourceId) : null;
        if (e == null && string != null) {
            e = this.a.f(string);
        }
        if (e == null && id != -1) {
            e = this.a.e(id);
        }
        if (e == null) {
            cn h = this.a.h();
            context.getClassLoader();
            e = h.c(attributeValue);
            e.u = true;
            e.D = resourceId != 0 ? resourceId : id;
            e.E = id;
            e.F = string;
            e.v = true;
            e.z = this.a;
            dd ddVar = this.a;
            e.A = ddVar.m;
            Context context2 = ddVar.m.c;
            Bundle bundle = e.h;
            e.aC();
            j = this.a.i(e);
            if (dd.W(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Fragment ");
                sb.append(e);
                sb.append(" has been inflated via the <fragment> tag: id=0x");
                sb.append(Integer.toHexString(resourceId));
            }
        } else {
            if (e.v) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
            }
            e.v = true;
            e.z = this.a;
            dd ddVar2 = this.a;
            e.A = ddVar2.m;
            Context context3 = ddVar2.m.c;
            e.aC();
            j = this.a.j(e);
            if (dd.W(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Retained Fragment ");
                sb2.append(e);
                sb2.append(" has been re-attached via the <fragment> tag: id=0x");
                sb2.append(Integer.toHexString(resourceId));
            }
        }
        ViewGroup viewGroup = (ViewGroup) view;
        anf.b(e, viewGroup);
        e.N = viewGroup;
        j.e();
        j.d();
        View view2 = e.O;
        if (view2 == null) {
            throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
        }
        if (resourceId != 0) {
            view2.setId(resourceId);
        }
        if (e.O.getTag() == null) {
            e.O.setTag(string);
        }
        e.O.addOnAttachStateChangeListener(new cp(this, j));
        return e.O;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
