package defpackage;

import android.content.Context;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class yoc extends yon {
    private amru a;

    public yoc(Context context, String str, List list) {
        this(context, str, list, 0);
    }

    @Override // defpackage.yon
    protected final yom a(int i) {
        return (yom) this.a.get(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yoc(Context context, String str, List list, int i) {
        super(context, str, list.size());
        context.getClass();
        list.getClass();
        this.a = amru.o(list);
        if (i > 0) {
            yny.b(this, i);
        }
    }
}
