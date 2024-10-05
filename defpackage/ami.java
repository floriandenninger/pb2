package defpackage;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ami extends InputConnectionWrapper {
    private final TextView a;

    public ami(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        super(inputConnection, false);
        this.a = textView;
        alr b = alr.b();
        if (!b.e() || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        all allVar = b.e;
        Bundle bundle = editorInfo.extras;
        alk alkVar = (alk) allVar;
        bvj bvjVar = alkVar.b.d;
        int a = bvjVar.a(4);
        bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", a != 0 ? bvjVar.b.getInt(a + bvjVar.a) : 0);
        editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", alkVar.c.g);
    }

    private final Editable a() {
        return this.a.getEditableText();
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        return alv.b(this, a(), i, i2, false) || super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        return alv.b(this, a(), i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2);
    }
}
