package defpackage;

import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class jv {
    public static final ArrayList a = new ArrayList();
    public WeakHashMap b = null;
    private SparseArray d = null;
    public WeakReference c = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static jv a(View view) {
        jv jvVar = (jv) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (jvVar != null) {
            return jvVar;
        }
        jv jvVar2 = new jv();
        view.setTag(R.id.tag_unhandled_key_event_manager, jvVar2);
        return jvVar2;
    }

    public static final boolean d(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
        if (arrayList == null) {
            return false;
        }
        int size = arrayList.size();
        do {
            size--;
            if (size < 0) {
                return false;
            }
        } while (!((ju) arrayList.get(size)).a());
        return true;
    }

    public final SparseArray b() {
        if (this.d == null) {
            this.d = new SparseArray();
        }
        return this.d;
    }

    public final View c(View view, KeyEvent keyEvent) {
        View c;
        WeakHashMap weakHashMap = this.b;
        if (weakHashMap != null && weakHashMap.containsKey(view)) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                do {
                    childCount--;
                    if (childCount >= 0) {
                        c = c(viewGroup.getChildAt(childCount), keyEvent);
                    }
                } while (c == null);
                return c;
            }
            if (d(view)) {
                return view;
            }
        }
        return null;
    }
}
