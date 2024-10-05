package defpackage;

import android.view.View;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class js {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static CharSequence a(View view) {
        return view.getStateDescription();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(View view, CharSequence charSequence) {
        view.setStateDescription(charSequence);
    }

    public static void i(View view, bue bueVar) {
        view.setTag(R.id.view_tree_saved_state_registry_owner, bueVar);
    }

    public static StringBuilder j() {
        return new StringBuilder();
    }

    public static void k(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("?");
            if (i2 < i - 1) {
                sb.append(",");
            }
        }
    }

    public void c() {
    }

    public void d(int i, int i2) {
    }

    public void e(int i, int i2, Object obj) {
        d(i, i2);
    }

    public void f(int i, int i2) {
    }

    public void g(int i, int i2) {
    }

    public void h(int i, int i2) {
    }
}
