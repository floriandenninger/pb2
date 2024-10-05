package defpackage;

import android.view.View;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class isc {
    public YouTubeTextView c;
    public ajyf d;
    final /* synthetic */ isf e;

    public isc(isf isfVar) {
        this.e = isfVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void a(boolean z);

    /* JADX INFO: Access modifiers changed from: protected */
    public final void b(boolean z) {
        ajyf ajyfVar = this.d;
        if (ajyfVar != null) {
            aong aongVar = (aong) apmg.a.createBuilder();
            aongVar.copyOnWrite();
            apmg apmgVar = (apmg) aongVar.instance;
            apmgVar.d = 2;
            apmgVar.c = 1;
            aongVar.copyOnWrite();
            apmg apmgVar2 = (apmg) aongVar.instance;
            apmgVar2.b |= 64;
            apmgVar2.h = !z;
            ajyfVar.b((apmg) aongVar.build(), null);
            this.c.setFilterTouchesWhenObscured(true);
            this.c.setOnClickListener(new View.OnClickListener() { // from class: isb
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    isc.this.e.a();
                }
            });
            this.c.setEnabled(z);
        }
    }
}
