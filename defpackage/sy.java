package defpackage;

import android.support.v7.widget.AppCompatSpinner;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sy extends un {
    final /* synthetic */ tf a;
    final /* synthetic */ AppCompatSpinner b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sy(AppCompatSpinner appCompatSpinner, View view, tf tfVar) {
        super(view);
        this.b = appCompatSpinner;
        this.a = tfVar;
    }

    @Override // defpackage.un
    public final ri a() {
        return this.a;
    }

    @Override // defpackage.un
    public final boolean b() {
        if (this.b.b.u()) {
            return true;
        }
        this.b.b();
        return true;
    }
}
