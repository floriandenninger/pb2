package defpackage;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import com.google.android.youtube.R;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class akif {
    final EditText a;
    final ImageView b;
    final /* synthetic */ akig c;

    public akif(akig akigVar, View view) {
        this.c = akigVar;
        new akmg(akigVar.a, (ImageView) view.findViewById(R.id.sharer_thumbnail));
        EditText editText = (EditText) view.findViewById(R.id.message_input);
        this.a = editText;
        ImageView imageView = (ImageView) view.findViewById(R.id.inline_send_button);
        this.b = imageView;
        view.findViewById(R.id.message_input_shadow);
        editText.addTextChangedListener(new akie(this));
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: akid
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                akif akifVar = akif.this;
                Iterator it = akifVar.c.b.iterator();
                while (it.hasNext()) {
                    ((aklj) it.next()).l();
                }
                if (!akifVar.a.isInputMethodTarget() || z) {
                    return;
                }
                whu.C(akifVar.a);
            }
        });
        imageView.setOnClickListener(new View.OnClickListener() { // from class: akic
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Iterator it = akif.this.c.b.iterator();
                while (it.hasNext()) {
                    ((aklj) it.next()).f();
                }
            }
        });
    }
}
