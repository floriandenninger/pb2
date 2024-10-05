package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.libraries.user.profile.photopicker.edit.EditablePhotoView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class voc extends View implements axql, axqh {
    private axqg a;
    public boolean v;

    public voc(Context context) {
        super(context);
        j();
    }

    @Override // defpackage.axqh
    public final boolean h() {
        return this.v;
    }

    @Override // defpackage.axql
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final axqg lL() {
        if (this.a == null) {
            this.a = new axqg(this, false);
        }
        return this.a;
    }

    protected final void j() {
        axqk a = lL().a();
        if (a instanceof axqk) {
            if ((!(a instanceof axqh) || ((axqh) a).h()) && !this.v) {
                this.v = true;
                ((vny) lM()).d((EditablePhotoView) this);
            }
        }
    }

    @Override // defpackage.axqk
    public final Object lM() {
        return lL().lM();
    }

    public voc(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        j();
    }

    public voc(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        j();
    }

    voc(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        j();
    }
}
