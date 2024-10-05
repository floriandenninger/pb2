package defpackage;

import com.google.android.apps.youtube.app.common.ui.navigation.Pane;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import j$.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class gib implements Consumer {
    public final /* synthetic */ PaneDescriptor a;
    private final /* synthetic */ int b;

    public /* synthetic */ gib(PaneDescriptor paneDescriptor, int i) {
        this.b = i;
        this.a = paneDescriptor;
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        if (this.b != 0) {
            ((Pane) obj).d = this.a;
        } else {
            ((Pane) obj).c = this.a;
        }
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return this.b != 0 ? Consumer.CC.$default$andThen(this, consumer) : Consumer.CC.$default$andThen(this, consumer);
    }
}
