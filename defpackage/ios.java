package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.UnderlineSpan;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ios implements TextWatcher {
    final /* synthetic */ iox a;
    private final Map b = new HashMap();

    public ios(iox ioxVar) {
        this.a = ioxVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        for (iow iowVar : this.a.j) {
            UnderlineSpan underlineSpan = iowVar.c;
            int spanStart = this.a.b.getText().getSpanStart(underlineSpan);
            int spanEnd = this.a.b.getText().getSpanEnd(underlineSpan);
            if (i + i2 >= spanStart && i < spanEnd && !this.b.containsKey(underlineSpan)) {
                this.b.put(underlineSpan, new ior(this.a.b.getText().toString().substring(spanStart, spanEnd), iowVar));
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        while (this.b.entrySet().iterator().hasNext()) {
            Map.Entry entry = (Map.Entry) this.b.entrySet().iterator().next();
            UnderlineSpan underlineSpan = (UnderlineSpan) entry.getKey();
            ior iorVar = (ior) entry.getValue();
            this.b.remove(underlineSpan);
            int spanStart = this.a.b.getText().getSpanStart(underlineSpan);
            int spanEnd = this.a.b.getText().getSpanEnd(underlineSpan);
            if (this.a.b.getText().toString().isEmpty()) {
                this.a.j.clear();
                this.a.o = 0;
            } else if (spanStart >= 0 && spanEnd >= 0 && !this.a.b.getText().toString().substring(spanStart, spanEnd).equals(iorVar.a)) {
                this.a.j.remove(iorVar.b);
                this.a.b.getText().removeSpan(underlineSpan);
                iox ioxVar = this.a;
                ioxVar.o--;
                if (i != spanStart) {
                    ioxVar.b.getText().replace(spanStart, spanStart + 1, "");
                }
            }
        }
    }
}
