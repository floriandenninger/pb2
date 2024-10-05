package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class rwf extends View implements rwo {
    private String a;
    public boolean b;
    private final boolean c;

    public rwf(Context context) {
        super(context);
        new RectF();
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setStyle(Paint.Style.FILL);
        this.c = true;
        rwk rwkVar = new rwk();
        rwkVar.d();
        setLayoutParams(rwkVar);
    }

    public CharSequence a() {
        throw null;
    }

    public List b(int i, int i2, boolean z) {
        throw null;
    }

    public void d(ruv ruvVar, List list, rzk rzkVar) {
        boolean z = false;
        if (ruvVar.f && ruvVar.e > 0) {
            z = true;
        }
        this.b = z;
    }

    @Override // defpackage.rwo
    public final String e() {
        return this.a;
    }

    @Override // defpackage.rwo
    public final void f(String str) {
        this.a = str;
    }

    @Override // defpackage.rwo
    public final boolean g() {
        return this.c;
    }
}
