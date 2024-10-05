package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ukc {
    public final ujx a;
    public final tip b;

    public ukc(ujx ujxVar, tip tipVar) {
        this.a = ujxVar;
        this.b = tipVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(ujx ujxVar, View view) {
        if (view instanceof ukd) {
            ((ukd) view).a(ujxVar);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                a(ujxVar, viewGroup.getChildAt(i));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public static void b(ujx ujxVar, View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                b(ujxVar, viewGroup.getChildAt(i));
            }
        }
        if (view instanceof ukd) {
            ((ukd) view).b(ujxVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final ujq c(View view) {
        return (ujq) view.getTag(R.id.view_bound_account_tag);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void d(View view, ujq ujqVar) {
        view.setTag(R.id.view_bound_account_tag, ujqVar);
    }
}
