package defpackage;

import android.app.PictureInPictureParams;
import android.graphics.Rect;
import com.google.android.apps.youtube.app.common.ui.pip.DefaultPipController;
import j$.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class gkg implements Function {
    public final /* synthetic */ DefaultPipController a;
    private final /* synthetic */ int b;

    public /* synthetic */ gkg(DefaultPipController defaultPipController, int i) {
        this.b = i;
        this.a = defaultPipController;
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
        if (i == 2) {
            return Function.CC.$default$andThen(this, function);
        }
        if (i != 3) {
            return i != 4 ? Function.CC.$default$andThen(this, function) : Function.CC.$default$andThen(this, function);
        }
        return Function.CC.$default$andThen(this, function);
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
        if (i == 2) {
            return Function.CC.$default$compose(this, function);
        }
        if (i != 3) {
            return i != 4 ? Function.CC.$default$compose(this, function) : Function.CC.$default$compose(this, function);
        }
        return Function.CC.$default$compose(this, function);
    }

    @Override // j$.util.function.Function
    public final Object apply(Object obj) {
        int i = this.b;
        boolean z = true;
        if (i == 0) {
            DefaultPipController defaultPipController = this.a;
            PictureInPictureParams.Builder builder = (PictureInPictureParams.Builder) obj;
            if (defaultPipController.l && defaultPipController.n != null) {
                Rect rect = new Rect();
                defaultPipController.n.getGlobalVisibleRect(rect);
                if (!rect.isEmpty()) {
                    fav.B(defaultPipController.y.floatValue(), rect, rect);
                    builder.setSourceRectHint(rect);
                    return Boolean.valueOf(z);
                }
            }
            z = false;
            return Boolean.valueOf(z);
        }
        if (i == 1) {
            return Boolean.valueOf(this.a.m((PictureInPictureParams.Builder) obj));
        }
        if (i == 2) {
            DefaultPipController defaultPipController2 = this.a;
            PictureInPictureParams.Builder builder2 = (PictureInPictureParams.Builder) obj;
            if (defaultPipController2.l || defaultPipController2.b.isInPictureInPictureMode()) {
                builder2.setAspectRatio(defaultPipController2.y);
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        if (i != 3) {
            if (i == 4) {
                return Boolean.valueOf(this.a.m((PictureInPictureParams.Builder) obj));
            }
            return Boolean.valueOf(this.a.m((PictureInPictureParams.Builder) obj));
        }
        DefaultPipController defaultPipController3 = this.a;
        PictureInPictureParams.Builder builder3 = (PictureInPictureParams.Builder) obj;
        if (defaultPipController3.l || defaultPipController3.b.isInPictureInPictureMode()) {
            builder3.setActions(((gku) defaultPipController3.d.get()).a());
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
