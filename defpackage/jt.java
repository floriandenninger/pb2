package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.ContentInfo;
import android.view.View;
import android.widget.EdgeEffect;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class jt {
    public static long a;
    public static Method b;
    public static jt c;

    public static ik a(View view, ik ikVar) {
        ContentInfo d = ikVar.a.d();
        ContentInfo performReceiveContent = view.performReceiveContent(d);
        if (performReceiveContent == null) {
            return null;
        }
        return performReceiveContent == d ? ikVar : new ik(new ih(performReceiveContent));
    }

    public static String[] b(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public EdgeEffect c(RecyclerView recyclerView, int i) {
        return new EdgeEffect(recyclerView.getContext());
    }
}
