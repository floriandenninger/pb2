package defpackage;

import android.R;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class sp extends EditText implements ix {
    private final sj a;
    private final tk b;
    private final th c;

    public sp(Context context) {
        this(context, null);
    }

    @Override // defpackage.ix
    public final ik a(ik ikVar) {
        return jn.b(this, ikVar);
    }

    @Override // android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        sj sjVar = this.a;
        if (sjVar != null) {
            sjVar.a();
        }
        tk tkVar = this.b;
        if (tkVar != null) {
            tkVar.e();
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    @Override // android.widget.TextView
    public final TextClassifier getTextClassifier() {
        th thVar;
        if (Build.VERSION.SDK_INT >= 28 || (thVar = this.c) == null) {
            return super.getTextClassifier();
        }
        return thVar.a();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] stringArray;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        tk.s(this, onCreateInputConnection, editorInfo);
        jq.d(onCreateInputConnection, editorInfo, this);
        String[] ar = jw.ar(this);
        if (onCreateInputConnection == null || ar == null) {
            return onCreateInputConnection;
        }
        if (Build.VERSION.SDK_INT >= 25) {
            editorInfo.contentMimeTypes = ar;
        } else {
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            editorInfo.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", ar);
            editorInfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", ar);
        }
        sw swVar = new sw(this);
        gm.q(editorInfo, "editorInfo must be non-null");
        if (Build.VERSION.SDK_INT >= 25) {
            return new ajw(onCreateInputConnection, swVar);
        }
        if (Build.VERSION.SDK_INT >= 25) {
            stringArray = editorInfo.contentMimeTypes;
            if (stringArray == null) {
                stringArray = ajv.a;
            }
        } else if (editorInfo.extras == null) {
            stringArray = ajv.a;
        } else {
            String[] stringArray2 = editorInfo.extras.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
            stringArray = stringArray2 == null ? editorInfo.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES") : stringArray2;
            if (stringArray == null) {
                stringArray = ajv.a;
            }
        }
        return stringArray.length == 0 ? onCreateInputConnection : new ajx(onCreateInputConnection, swVar);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        InterfaceC0002if igVar;
        if (Build.VERSION.SDK_INT >= 24 && dragEvent.getLocalState() == null && jw.ar(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (!(context instanceof Activity)) {
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    activity = (Activity) context;
                    break;
                }
            }
            if (activity == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Can't handle drop: no activity: view=");
                sb.append(this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                activity.requestDragAndDropPermissions(dragEvent);
                int offsetForPosition = getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
                beginBatchEdit();
                try {
                    Selection.setSelection((Spannable) getText(), offsetForPosition);
                    ClipData clipData = dragEvent.getClipData();
                    if (Build.VERSION.SDK_INT >= 31) {
                        igVar = new ie(clipData, 3);
                    } else {
                        igVar = new ig(clipData, 3);
                    }
                    jw.o(this, gp.g(igVar));
                    return true;
                } finally {
                    endBatchEdit();
                }
            }
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        InterfaceC0002if igVar;
        int i2 = R.id.pasteAsPlainText;
        if (i != 16908322) {
            if (i == 16908337) {
                i = R.id.pasteAsPlainText;
            }
            return super.onTextContextMenuItem(i);
        }
        i2 = i;
        if (jw.ar(this) != null) {
            ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
            ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
            if (primaryClip != null && primaryClip.getItemCount() > 0) {
                if (Build.VERSION.SDK_INT >= 31) {
                    igVar = new ie(primaryClip, 1);
                } else {
                    igVar = new ig(primaryClip, 1);
                }
                igVar.c(i2 == 16908322 ? 0 : 1);
                jw.o(this, gp.g(igVar));
            }
            return true;
        }
        return super.onTextContextMenuItem(i);
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        sj sjVar = this.a;
        if (sjVar != null) {
            sjVar.e();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        sj sjVar = this.a;
        if (sjVar != null) {
            sjVar.c(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(jm.o(this, callback));
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        tk tkVar = this.b;
        if (tkVar != null) {
            tkVar.h(context, i);
        }
    }

    @Override // android.widget.TextView
    public final void setTextClassifier(TextClassifier textClassifier) {
        th thVar;
        if (Build.VERSION.SDK_INT >= 28 || (thVar = this.c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            thVar.a = textClassifier;
        }
    }

    public sp(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.youtube.R.attr.editTextStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sp(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        yh.a(context);
        yf.d(this, getContext());
        sj sjVar = new sj(this);
        this.a = sjVar;
        sjVar.b(attributeSet, i);
        tk tkVar = new tk(this);
        this.b = tkVar;
        tkVar.g(attributeSet, i);
        tkVar.e();
        this.c = new th(this);
    }
}
