package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ListPopupWindow;
import com.google.android.youtube.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ajva implements View.OnClickListener, View.OnLongClickListener, ajuw {
    private final Context a;
    public final ajoa b;
    public final ajpd c;
    public final aalw d;
    public Object e;
    public acra f;
    public final lru g;
    private final Object h;
    private volatile ListPopupWindow i;
    private final aoae j;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [ajos, java.lang.Object] */
    public ajva(Context context, aahd aahdVar, ajvb ajvbVar, ajoy ajoyVar, lru lruVar, aalw aalwVar, aoae aoaeVar, byte[] bArr, byte[] bArr2) {
        aahdVar.getClass();
        context.getClass();
        ajvbVar.getClass();
        this.a = context;
        ajvbVar.a(atda.class);
        ajoa e = ajoyVar.e(ajvbVar.get());
        this.b = e;
        ajpd ajpdVar = new ajpd();
        this.c = ajpdVar;
        e.h(ajpdVar);
        this.g = lruVar;
        this.d = aalwVar;
        this.j = aoaeVar;
        this.h = new Object();
        if (amsj.b == null) {
            amsj.b = new amsj((byte[]) null, (byte[]) null);
        }
        amsj.b.a.put(this, null);
    }

    private final boolean b(atdc atdcVar, Object obj) {
        return atdcVar != null && akbc.k(atdcVar, obj, this.g, this.d);
    }

    public void a(atdc atdcVar, View view, Object obj, acra acraVar) {
        this.c.clear();
        this.c.addAll(akbc.j(atdcVar, obj, this.g, this.d));
        this.e = obj;
        this.f = acraVar;
        ListPopupWindow i = i();
        i.setDropDownGravity(8388661);
        i.setAnchorView(view);
        i.show();
    }

    @Override // defpackage.ajuw
    public final Map c() {
        HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this.e);
        hashMap.put("com.google.android.libraries.youtube.logging.interaction_logger", this.f);
        return hashMap;
    }

    @Override // defpackage.ajuw
    public final void d(View view, atdc atdcVar, Object obj, acra acraVar) {
        aoae aoaeVar;
        boolean b = b(atdcVar, obj);
        view.setVisibility(true != b ? 8 : 0);
        view.setOnClickListener(this);
        view.setTag(R.id.innertube_menu_anchor_model, atdcVar);
        view.setTag(R.id.innertube_menu_anchor_tag, obj);
        view.setTag(R.id.innertube_menu_anchor_interaction_logger, acraVar);
        view.setTag(R.id.innertube_menu_anchor_on_click_listener, this);
        if (!b || (aoaeVar = this.j) == null || aoaeVar.b.isEmpty()) {
            return;
        }
        Iterator it = aoaeVar.b.iterator();
        while (it.hasNext()) {
            ((ajvr) it.next()).b(atdcVar, view);
        }
    }

    @Override // defpackage.ajuw
    public final void e(View view, View view2, atdc atdcVar, Object obj, acra acraVar) {
        view.getClass();
        d(view2, atdcVar, obj, acraVar);
        if (view2.getTag(R.id.innertube_menu_anchor_touch_handler) == null) {
            view2.setTag(R.id.innertube_menu_anchor_touch_handler, new ajuz(view, view2));
        }
        if (b(atdcVar, obj) && atdcVar.f) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(new ajux(this, view, atdcVar, view2, obj, acraVar));
        }
    }

    @Override // defpackage.ajuw
    public final void g(View view) {
        view.setOnClickListener(null);
        view.setTag(R.id.innertube_menu_anchor_model, null);
        view.setTag(R.id.innertube_menu_anchor_tag, null);
        view.setTag(R.id.innertube_menu_anchor_interaction_logger, null);
        view.setTag(R.id.innertube_menu_anchor_on_click_listener, null);
    }

    @Override // defpackage.ajuw
    public final void h() {
        ListPopupWindow i;
        synchronized (this.h) {
            if (this.i != null && (i = i()) != null) {
                i.dismiss();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final ListPopupWindow i() {
        if (this.i == null) {
            synchronized (this.h) {
                if (this.i == null) {
                    this.i = new ListPopupWindow(this.a);
                    this.i.setWidth(this.a.getResources().getDimensionPixelSize(R.dimen.innertube_menu_width));
                    this.i.setPromptPosition(1);
                    this.i.setInputMethodMode(2);
                    this.i.setModal(true);
                    this.i.setAdapter(this.b);
                }
            }
        }
        return this.i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        atdc atdcVar = (atdc) view.getTag(R.id.innertube_menu_anchor_model);
        Object tag = view.getTag(R.id.innertube_menu_anchor_tag);
        Object tag2 = view.getTag(R.id.innertube_menu_anchor_interaction_logger);
        acra acraVar = tag2 instanceof acra ? (acra) tag2 : null;
        if (b(atdcVar, tag)) {
            a(atdcVar, view, tag, acraVar);
        }
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        atdc atdcVar = (atdc) view.getTag(R.id.innertube_menu_anchor_model);
        Object tag = view.getTag(R.id.innertube_menu_anchor_tag);
        Object tag2 = view.getTag(R.id.innertube_menu_anchor_interaction_logger);
        acra acraVar = tag2 instanceof acra ? (acra) tag2 : null;
        if (!b(atdcVar, tag)) {
            return false;
        }
        a(atdcVar, view, tag, acraVar);
        return true;
    }
}
