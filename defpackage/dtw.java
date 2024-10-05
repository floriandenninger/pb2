package defpackage;

import android.content.Context;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dtw extends EditText implements TextView.OnEditorActionListener {
    public diy a;
    public diy b;
    public dhe c;
    public AtomicReference d;
    public TextWatcher e;
    private int f;

    public dtw(Context context) {
        super(context);
        this.f = -1;
        setOnEditorActionListener(this);
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        diy diyVar = this.b;
        if (diyVar == null) {
            return false;
        }
        drb drbVar = new drb();
        drbVar.a = textView;
        drbVar.b = i;
        drbVar.c = keyEvent;
        return ((Boolean) diyVar.a.l().K(diyVar, drbVar)).booleanValue();
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f = getLineCount();
    }

    @Override // android.widget.TextView
    protected final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        dhe dheVar;
        super.onTextChanged(charSequence, i, i2, i3);
        diy diyVar = this.a;
        if (diyVar != null) {
            String charSequence2 = charSequence.toString();
            dto dtoVar = new dto();
            dtoVar.a = this;
            dtoVar.b = charSequence2;
            diyVar.a.l().K(diyVar, dtoVar);
        }
        AtomicReference atomicReference = this.d;
        if (atomicReference != null) {
            atomicReference.set(charSequence);
        }
        int lineCount = getLineCount();
        int i4 = this.f;
        if (i4 == -1 || i4 == lineCount || (dheVar = this.c) == null) {
            return;
        }
        int i5 = dtu.Q;
        if (dheVar.f == null) {
            return;
        }
        dheVar.h(new dlp(0, new Object[0]), "updateState:TextInput.remeasureForUpdatedText");
    }

    public dtw(Context context, byte[] bArr) {
        this(context);
    }
}
