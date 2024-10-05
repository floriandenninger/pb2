package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import com.google.android.apps.youtube.embeddedplayer.service.context.a;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class iq implements LayoutInflater.Factory2 {
    final a a;

    public iq(a aVar) {
        this.a = aVar;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.a.a(str, context, attributeSet);
    }

    public final String toString() {
        return getClass().getName() + "{" + this.a + "}";
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return this.a.a(str, context, attributeSet);
    }
}
