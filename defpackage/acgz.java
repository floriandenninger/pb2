package defpackage;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;
import com.google.android.youtube.R;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acgz {
    public final abxp a;
    public final EditText b;
    public final RecyclerView c;
    public final View d;
    public final acgy e;
    public final Executor f;
    public String g;
    private final acgu h;

    public acgz(abxp abxpVar, Executor executor, View view, acgu acguVar) {
        this.a = abxpVar;
        EditText editText = (EditText) view.findViewById(R.id.input_text);
        this.b = editText;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.game_title_results);
        this.c = recyclerView;
        this.f = executor;
        this.h = acguVar;
        final int i = 1;
        view.findViewById(R.id.back_button).setOnClickListener(new View.OnClickListener(this) { // from class: acgr
            public final /* synthetic */ acgz a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                if (i != 0) {
                    this.a.a(null);
                } else {
                    this.a.b.setText((CharSequence) null);
                }
            }
        });
        View findViewById = view.findViewById(R.id.reset_input_button);
        this.d = findViewById;
        final int i2 = 0;
        findViewById.setOnClickListener(new View.OnClickListener(this) { // from class: acgr
            public final /* synthetic */ acgz a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                if (i2 != 0) {
                    this.a.a(null);
                } else {
                    this.a.b.setText((CharSequence) null);
                }
            }
        });
        editText.addTextChangedListener(new acgv(this));
        recyclerView.getContext();
        recyclerView.af(new LinearLayoutManager());
        acgy acgyVar = new acgy(new acgs(this));
        this.e = acgyVar;
        recyclerView.ac(acgyVar);
    }

    public final void a(aqzu aqzuVar) {
        whu.C(this.b);
        ((aciw) this.h).a.aF(aqzuVar);
    }
}
