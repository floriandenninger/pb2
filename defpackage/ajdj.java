package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.text.method.LinkMovementMethod;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajdj extends ajdd {
    private final aqvu a;

    protected ajdj(aqvu aqvuVar, aahd aahdVar, ajdh ajdhVar, Object obj) {
        super(aahdVar, ajdhVar, obj, null);
        aqvuVar.getClass();
        this.a = aqvuVar;
    }

    public static void c(Context context, aqvu aqvuVar, aahd aahdVar, Object obj) {
        g(context, aqvuVar, aahdVar, null, obj);
    }

    public static void g(final Context context, aqvu aqvuVar, aahd aahdVar, ajdh ajdhVar, Object obj) {
        aqyg aqygVar;
        aqyg aqygVar2;
        ajdj ajdjVar = new ajdj(aqvuVar, aahdVar, ajdhVar, obj);
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        aqyg aqygVar3 = null;
        if ((aqvuVar.b & 2) != 0) {
            aqygVar = aqvuVar.d;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        builder.setTitle(ajcq.b(aqygVar));
        if ((aqvuVar.b & 1) != 0) {
            aqygVar2 = aqvuVar.c;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
        } else {
            aqygVar2 = null;
        }
        builder.setMessage(aahk.a(aqygVar2, aahdVar, true));
        if ((aqvuVar.b & 4) != 0 && (aqygVar3 = aqvuVar.e) == null) {
            aqygVar3 = aqyg.a;
        }
        builder.setPositiveButton(ajcq.b(aqygVar3), ajdjVar);
        if (((Boolean) yjj.n(context).b(aipq.p).e(true)).booleanValue()) {
            return;
        }
        final AlertDialog create = builder.create();
        create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: ajdi
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                AlertDialog alertDialog = create;
                Context context2 = context;
                Button button = alertDialog.getButton(-1);
                if (button != null) {
                    button.setTextColor(wbs.Q(context2, R.attr.ytCallToAction));
                }
            }
        });
        ajdjVar.j(create);
        ajdjVar.k();
        TextView textView = (TextView) ajdjVar.i.findViewById(android.R.id.message);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        if (Build.VERSION.SDK_INT < 26) {
            jw.M(textView, new zbh(textView));
        }
        ammv.j(ajdjVar);
    }

    @Override // defpackage.ajdd
    protected final void f() {
        aqvu aqvuVar = this.a;
        int i = aqvuVar.b;
        if ((i & 16) != 0) {
            aahd aahdVar = this.g;
            apxf apxfVar = aqvuVar.g;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            aahdVar.c(apxfVar, d());
            return;
        }
        if ((i & 8) != 0) {
            aahd aahdVar2 = this.g;
            apxf apxfVar2 = aqvuVar.f;
            if (apxfVar2 == null) {
                apxfVar2 = apxf.a;
            }
            aahdVar2.c(apxfVar2, d());
        }
    }
}
