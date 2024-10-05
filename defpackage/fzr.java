package defpackage;

import java.util.ArrayList;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fzr {
    public final CharSequence a;
    public final Collection b;

    public fzr() {
        this("");
    }

    public fzr(CharSequence charSequence) {
        this(charSequence, new ArrayList());
    }

    public fzr(CharSequence charSequence, Collection collection) {
        this.a = charSequence;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        arrayList.addAll(collection);
    }
}
