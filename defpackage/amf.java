package defpackage;

import android.widget.EditText;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amf {
    public final EditText a;
    public final amp b;

    public amf() {
    }

    public amf(EditText editText) {
        this();
        this.a = editText;
        amp ampVar = new amp(editText);
        this.b = ampVar;
        editText.addTextChangedListener(ampVar);
        editText.setEditableFactory(amh.a());
    }
}
