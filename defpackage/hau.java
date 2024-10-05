package defpackage;

import android.app.Activity;
import android.support.v7.widget.Toolbar;
import com.google.android.apps.youtube.app.watchwhile.WatchWhileActivity;
import j$.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class hau implements Function {
    public final /* synthetic */ Class a;
    private final /* synthetic */ int b;

    public /* synthetic */ hau(Class cls, int i) {
        this.b = i;
        this.a = cls;
    }

    @Override // j$.util.function.Function
    public final /* synthetic */ Function andThen(Function function) {
        int i = this.b;
        if (i == 0) {
            return Function.CC.$default$andThen(this, function);
        }
        if (i == 1) {
            return Function.CC.$default$andThen(this, function);
        }
        if (i != 2) {
            return i != 3 ? Function.CC.$default$andThen(this, function) : Function.CC.$default$andThen(this, function);
        }
        return Function.CC.$default$andThen(this, function);
    }

    @Override // j$.util.function.Function
    public final Object apply(Object obj) {
        int i = this.b;
        if (i == 0) {
            return (hax) this.a.cast((ce) obj);
        }
        if (i == 1) {
            return (giy) this.a.cast((gir) obj);
        }
        if (i != 2) {
            return i != 3 ? (WatchWhileActivity) this.a.cast((Activity) obj) : (Toolbar) this.a.cast(obj);
        }
        return (iya) this.a.cast((ce) obj);
    }

    @Override // j$.util.function.Function
    public final /* synthetic */ Function compose(Function function) {
        int i = this.b;
        if (i == 0) {
            return Function.CC.$default$compose(this, function);
        }
        if (i == 1) {
            return Function.CC.$default$compose(this, function);
        }
        if (i != 2) {
            return i != 3 ? Function.CC.$default$compose(this, function) : Function.CC.$default$compose(this, function);
        }
        return Function.CC.$default$compose(this, function);
    }
}
