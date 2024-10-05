package defpackage;

import android.app.Activity;
import android.content.ComponentCallbacks2;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abuv implements swv {
    private final Activity a;
    private final /* synthetic */ int b;

    public abuv(Activity activity, int i) {
        this.b = i;
        this.a = activity;
    }

    @Override // defpackage.swv
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.swv
    public final aomu a() {
        return this.b != 0 ? asty.b : aqus.b;
    }

    @Override // defpackage.swv
    public final /* synthetic */ ayph b(Object obj, swu swuVar) {
        if (this.b == 0) {
            if (((aqus) obj).c) {
                final Activity activity = this.a;
                return ayph.t(new ayrm() { // from class: abuu
                    @Override // defpackage.ayrm
                    public final void a() {
                        activity.finish();
                    }
                });
            }
            return ayph.f();
        }
        asty astyVar = (asty) obj;
        ComponentCallbacks2 componentCallbacks2 = this.a;
        if (componentCallbacks2 instanceof iqj) {
            return ((iqj) componentCallbacks2).i(astyVar);
        }
        String valueOf = String.valueOf(componentCallbacks2.getClass().getName());
        return ayph.s(new IllegalStateException(valueOf.length() != 0 ? "Handler for LocationPickerOnTapCommand was asked from an Activity which doesn't provide one: ".concat(valueOf) : new String("Handler for LocationPickerOnTapCommand was asked from an Activity which doesn't provide one: ")));
    }
}
