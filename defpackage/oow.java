package defpackage;

import android.content.res.Configuration;
import android.content.res.Resources;
import com.google.android.apps.youtube.app.ui.pivotbar.PivotBar;
import j$.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class oow implements Consumer {
    public final /* synthetic */ opf a;
    private final /* synthetic */ int b;

    public /* synthetic */ oow(opf opfVar, int i) {
        this.b = i;
        this.a = opfVar;
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        int i = this.b;
        if (i == 0) {
            return Consumer.CC.$default$andThen(this, consumer);
        }
        if (i == 1) {
            return Consumer.CC.$default$andThen(this, consumer);
        }
        if (i == 2) {
            return Consumer.CC.$default$andThen(this, consumer);
        }
        if (i == 3) {
            return Consumer.CC.$default$andThen(this, consumer);
        }
        if (i != 4) {
            return i != 5 ? Consumer.CC.$default$andThen(this, consumer) : Consumer.CC.$default$andThen(this, consumer);
        }
        return Consumer.CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.b;
        if (i == 0) {
            opf opfVar = this.a;
            PivotBar pivotBar = (PivotBar) obj;
            pivotBar.k = opfVar;
            pivotBar.l = opfVar;
            return;
        }
        if (i == 1) {
            this.a.u((gak) obj);
            return;
        }
        if (i == 2) {
            Configuration configuration = this.a.o;
            configuration.getClass();
            Resources resources = ((PivotBar) obj).a;
            resources.updateConfiguration(configuration, resources.getDisplayMetrics());
            return;
        }
        if (i == 3) {
            opf opfVar2 = this.a;
            opfVar2.a.c((apxf) obj, opfVar2.n);
        } else if (i == 4) {
            opf opfVar3 = this.a;
            opfVar3.a.c((apxf) obj, opfVar3.n);
        } else if (i == 5) {
            this.a.b.D(((Integer) obj).intValue(), 0);
        } else {
            this.a.x(((Integer) obj).intValue());
        }
    }
}
