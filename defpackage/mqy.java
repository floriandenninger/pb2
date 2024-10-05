package defpackage;

import android.app.Activity;
import android.content.Context;
import android.util.SparseArray;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.youtube.app.mdx.WatchOnTvMenuItem;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mqy implements ajom {
    final vu a;
    public final SparseArray b;
    private final ViewGroup c;
    private final TextView d;
    private final View e;
    private final MenuInflater f;
    private final Collection g;

    public mqy(Activity activity, Context context, onf onfVar, WatchOnTvMenuItem watchOnTvMenuItem) {
        ViewGroup viewGroup = (ViewGroup) View.inflate(context, R.layout.nested_header, null);
        this.c = viewGroup;
        this.d = (TextView) viewGroup.findViewById(R.id.title);
        View findViewById = viewGroup.findViewById(R.id.contextual_menu_anchor);
        this.e = findViewById;
        this.f = activity.getMenuInflater();
        vu vuVar = new vu(context, findViewById);
        this.a = vuVar;
        vuVar.d = new vt() { // from class: mqw
            @Override // defpackage.vt
            public final boolean a(MenuItem menuItem) {
                fze fzeVar = (fze) mqy.this.b.get(((qt) menuItem).a);
                if (fzeVar != null) {
                    return fzeVar.m();
                }
                return false;
            }
        };
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: mqx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                mqy.this.a.a();
            }
        });
        ArrayList arrayList = new ArrayList();
        this.g = arrayList;
        arrayList.add(watchOnTvMenuItem);
        arrayList.add(onfVar.a());
        this.b = new SparseArray();
        ahbw.w(viewGroup, this);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.c;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.a.c.b();
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        fzr fzrVar = (fzr) obj;
        this.d.setText(fzrVar.a);
        this.b.clear();
        for (fze fzeVar : fzrVar.b) {
            this.b.put(fzeVar.g(), fzeVar);
        }
        for (fze fzeVar2 : this.g) {
            this.b.put(fzeVar2.g(), fzeVar2);
        }
        this.a.b.clear();
        gfw.h(this.a.b, this.f, null, this.b, 0);
    }
}
