package defpackage;

import com.google.android.apps.youtube.app.extensions.reel.edit.presenter.EditorButtonView;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class hcx implements zfi {
    public final /* synthetic */ hda a;
    private final /* synthetic */ int b;

    public /* synthetic */ hcx(hda hdaVar, int i) {
        this.b = i;
        this.a = hdaVar;
    }

    @Override // defpackage.zfi
    public final void a(Object obj) {
        if (this.b == 0) {
            final hda hdaVar = this.a;
            final Boolean bool = (Boolean) obj;
            hdaVar.c.post(new Runnable() { // from class: hcu
                @Override // java.lang.Runnable
                public final void run() {
                    hda hdaVar2 = hda.this;
                    Boolean bool2 = bool;
                    boolean z = bool2 == null || !bool2.booleanValue();
                    if (!z && "COLLAPSED_MODE_PERSIST_LABELS_3X".equals(hdaVar2.m)) {
                        hdaVar2.o = false;
                        hdaVar2.q.b(gbr.o, angq.a);
                    }
                    hdaVar2.p = true;
                    for (int i = 1; i < hdaVar2.f.size(); i++) {
                        EditorButtonView editorButtonView = (EditorButtonView) hdaVar2.f.get(i);
                        if (editorButtonView.getVisibility() == 0) {
                            hda.m(editorButtonView);
                        }
                    }
                    if (z) {
                        hdaVar2.k.postDelayed(new hcs(hdaVar2, 0), 7000L);
                    }
                }
            });
        } else {
            hda hdaVar2 = this.a;
            idr idrVar = (idr) obj;
            if (idrVar != null) {
                hdaVar2.h.putAll(Collections.unmodifiableMap(idrVar.p));
            }
            hdaVar2.c.post(new hcs(hdaVar2, 1));
        }
    }
}
